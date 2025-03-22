using analyzer;
using Antlr4.Runtime.Misc;

public class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{

    public ValueWrapper defaultValue = new VoidValue();
    public string output = "";
    public Environment actualEnvironment;

    public CompilerVisitor()
    {
        actualEnvironment = new Environment(null);

        Embeded.Generate(actualEnvironment);
    }

    public override ValueWrapper VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var stmt in context.stmt())
        {
            Visit(stmt);
        }

        return defaultValue;
    }

    public override ValueWrapper VisitVariableDeclaration(LanguageParser.VariableDeclarationContext context)
    {
        if (context.TYPE() == null)
        {
            actualEnvironment.Declare("implicit", context.ID().GetText(), Visit(context.expressionStmt()), context.Start);
        }
        else
        {

            actualEnvironment.Declare(context.TYPE().GetText(), context.ID().GetText(), Visit(context.expressionStmt()), context.Start);
        }

        return defaultValue;
    }
    

    public override ValueWrapper VisitAssignment(LanguageParser.AssignmentContext context)
    {
        var asignedValue = context.expressionStmt(0);
        ValueWrapper value = Visit(context.expressionStmt(1));

        if (asignedValue is LanguageParser.IdentifierContext idContext)
        {
            string id = idContext.ID().GetText();
            actualEnvironment.AssignVariable(id, value, context.Start);
            
            return defaultValue;
        }
        else if (asignedValue is LanguageParser.CallExpressionContext callContext)
        {
            ValueWrapper call = Visit(callContext.expressionStmt());

            for(int i = 0; i < callContext.call().Length; i++)
            {
                var action = callContext.call(i);

                if(i == callContext.call().Length - 1)
                {
                    if(action is LanguageParser.AtributeAccessContext atributeCall)
                    {
                        if(call is InstanceValue instanceValue)
                        {
                            var instance = instanceValue.instance;
                            var propertyName = atributeCall.ID().GetText();
                            instance.Set(propertyName, value);
                        }
                        else
                        {
                            throw new SemanticError("Invalid atribute access", context.Start);
                        }
                    }
                }

                if(action is LanguageParser.FunctionAccessContext functionCall)
                {
                    if(call is FunctionValue functionValue)
                    {
                        call = VisitCall(functionValue.invocable, functionCall.args());
                    }
                    else
                    {
                        throw new SemanticError("Invalid function call", context.Start);
                    }
                }
                else if(action is LanguageParser.AtributeAccessContext atributeCall)
                {
                    if(call is InstanceValue instanceValue)
                    {
                        call = instanceValue.instance.Get(atributeCall.ID().GetText(), atributeCall.Start);
                    }
                    else
                    {
                        throw new SemanticError("Invalid atribute access", context.Start);
                    }
                }
            }
        }
        else
        {
            throw new SemanticError("Invalid assignment", context.Start);
        }

        return defaultValue;
    }

    public override ValueWrapper VisitPrintStmt(LanguageParser.PrintStmtContext context)
    {
        foreach(var value in context.expressionStmt())
        {
            ValueWrapper result = Visit(value);
            output += result switch
            {
                IntValue i => i.Value.ToString() + " ",
                Float64Value f => f.Value.ToString() + " ",
                BoolValue b => b.Value.ToString() + " ",
                RuneValue r => r.Value.ToString() + " ",
                StringValue s => ProcessString(s.Value) + " ",
                VoidValue _ => "void" + " ",
                FunctionValue fn => "<function: " + fn.name + ">" + " ",
                _ => throw new SemanticError("Unknown type", null)
            } + " ";
        }

        output = output.TrimEnd() + "\n";

        return defaultValue;
    
        /*ValueWrapper value = Visit(context.expressionStmt(0));
        output += value switch
        {
            IntValue i => i.Value.ToString(),
            Float64Value f => f.Value.ToString(),
            BoolValue b => b.Value.ToString(),
            StringValue s => s.Value.Replace("\"", ""),
            VoidValue v => "void",
            FunctionValue fn => "<function " + fn.name + ">",
            _ => throw new SemanticError("Invalid value", context.Start)
        } + "\n";
        return defaultValue;*/
    }

    private string ProcessString(string value)
    {
        if (value.StartsWith("\"") && value.EndsWith("\""))
        {
            value = value.Substring(1, value.Length - 2);
        }
        return value
            .Replace("\\\"", "\"")
            .Replace("\\\\", "\\")
            .Replace("\\n", "\n")
            .Replace("\\t", "\t")
            .Replace("\\r", "\r");
    }

    public override ValueWrapper VisitIdentifier(LanguageParser.IdentifierContext context)
    {
        string id = context.ID().GetText();

        return actualEnvironment.Get(id, context.Start);
    }

    public override ValueWrapper VisitAddSub(LanguageParser.AddSubContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));
        var op = context.GetChild(1).GetText();

        return (left, right, op) switch
        {
            (IntValue l, IntValue r, "+") => new IntValue(l.Value + r.Value),
            (IntValue l, IntValue r, "-") => new IntValue(l.Value - r.Value),
            (Float64Value l, Float64Value r, "+") => new Float64Value(l.Value + r.Value),
            (Float64Value l, Float64Value r, "-") => new Float64Value(l.Value - r.Value),
            (IntValue l, Float64Value r, "+") => new Float64Value(l.Value + r.Value),
            (Float64Value l, IntValue r, "+") => new Float64Value(l.Value + r.Value),
            (StringValue l, StringValue r, "+") => new StringValue(l.Value + r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitAddSubOperator(LanguageParser.AddSubOperatorContext context)
    {
        var variable = actualEnvironment.Get(context.ID().GetText(), context.Start);

        if (variable is not IntValue && variable is not Float64Value)
        {
            throw new SemanticError("Invalid variable type", context.Start);
        }
        
        ValueWrapper expr = Visit(context.expressionStmt());

        if (expr is not IntValue && expr is not Float64Value)
        {
            throw new SemanticError("Invalid expression type", context.Start);
        }

        var op = context.GetChild(1).GetText();

        if (op == "+=")
        {
            if (variable is IntValue && expr is IntValue)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new IntValue((variable as IntValue).Value + (expr as IntValue).Value), context.Start);
            }
            else if (variable is Float64Value && expr is Float64Value)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as Float64Value).Value + (expr as Float64Value).Value), context.Start);
            }
            else if (variable is IntValue && expr is Float64Value)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as IntValue).Value + (expr as Float64Value).Value), context.Start);
            }
            else if (variable is Float64Value && expr is IntValue)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as Float64Value).Value + (expr as IntValue).Value), context.Start);
            }
        }
        else if (op == "-=")
        {
            if (variable is IntValue && expr is IntValue)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new IntValue((variable as IntValue).Value - (expr as IntValue).Value), context.Start);
            }
            else if (variable is Float64Value && expr is Float64Value)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as Float64Value).Value - (expr as Float64Value).Value), context.Start);
            }
            else if (variable is IntValue && expr is Float64Value)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as IntValue).Value - (expr as Float64Value).Value), context.Start);
            }
            else if (variable is Float64Value && expr is IntValue)
            {
                actualEnvironment.AssignVariable(context.ID().GetText(), new Float64Value((variable as Float64Value).Value - (expr as IntValue).Value), context.Start);
            }
        }
        


        return base.VisitAddSubOperator(context);
    }

    public override ValueWrapper VisitMulDivMod(LanguageParser.MulDivModContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));
        var op = context.GetChild(1).GetText();

        return (left, right, op) switch
        {
            (IntValue l, IntValue r, "*") => new IntValue(l.Value * r.Value),
            (IntValue l, IntValue r, "/") => new IntValue(l.Value / r.Value),
            (IntValue l, IntValue r, "%") => new IntValue(l.Value % r.Value),
            (IntValue l, Float64Value r, "*") => new Float64Value(l.Value * r.Value),
            (IntValue l, Float64Value r, "/") => new Float64Value(l.Value / r.Value),
            (Float64Value l, Float64Value r, "*") => new Float64Value(l.Value * r.Value),
            (Float64Value l, Float64Value r, "/") => new Float64Value(l.Value / r.Value),
            (Float64Value l, IntValue r, "*") => new Float64Value(l.Value * r.Value),
            (Float64Value l, IntValue r, "/") => new Float64Value(l.Value / r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
        
    }

    public override ValueWrapper VisitGreaterLess(LanguageParser.GreaterLessContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));
        var op = context.GetChild(1).GetText();

        return (left, right, op) switch
        {
            (IntValue l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
            (IntValue l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
            (IntValue l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),
            (IntValue l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
            (Float64Value l, Float64Value r, "<") => new BoolValue(l.Value < r.Value),
            (Float64Value l, Float64Value r, ">") => new BoolValue(l.Value > r.Value),
            (Float64Value l, Float64Value r, "<=") => new BoolValue(l.Value <= r.Value),
            (Float64Value l, Float64Value r, ">=") => new BoolValue(l.Value >= r.Value),
            (IntValue l, Float64Value r, "<") => new BoolValue(l.Value < r.Value),
            (IntValue l, Float64Value r, ">") => new BoolValue(l.Value > r.Value),
            (IntValue l, Float64Value r, "<=") => new BoolValue(l.Value <= r.Value),
            (IntValue l, Float64Value r, ">=") => new BoolValue(l.Value >= r.Value),
            (Float64Value l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
            (Float64Value l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
            (Float64Value l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),
            (Float64Value l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitEqual (LanguageParser.EqualContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));
        var op = context.GetChild(1).GetText();

        return (left, right, op) switch
        {
            (IntValue l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
            (IntValue l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),
            (Float64Value l, Float64Value r, "==") => new BoolValue(l.Value == r.Value),
            (Float64Value l, Float64Value r, "!=") => new BoolValue(l.Value != r.Value),
            (IntValue l, Float64Value r, "==") => new BoolValue(l.Value == r.Value),
            (IntValue l, Float64Value r, "!=") => new BoolValue(l.Value != r.Value),
            (Float64Value l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
            (Float64Value l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),
            (BoolValue l, BoolValue r, "==") => new BoolValue(l.Value == r.Value),
            (BoolValue l, BoolValue r, "!=") => new BoolValue(l.Value != r.Value),
            (StringValue l, StringValue r, "==") => new BoolValue(l.Value == r.Value),
            (StringValue l, StringValue r, "!=") => new BoolValue(l.Value != r.Value),
            (RuneValue l, RuneValue r, "==") => new BoolValue(l.Value == r.Value),
            (RuneValue l, RuneValue r, "!=") => new BoolValue(l.Value != r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitAnd(LanguageParser.AndContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));

        return (left, right) switch
        {
            (BoolValue l, BoolValue r) => new BoolValue(l.Value && r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitOr(LanguageParser.OrContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));

        return (left, right) switch
        {
            (BoolValue l, BoolValue r) => new BoolValue(l.Value || r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitInteger(LanguageParser.IntegerContext context)
    {
        return new IntValue(int.Parse(context.INTEGER().GetText()));
    }

    public override ValueWrapper VisitParens(LanguageParser.ParensContext context)
    {
        return Visit(context.expressionStmt());
    }

    public override ValueWrapper VisitNegate(LanguageParser.NegateContext context)
    {
        ValueWrapper value = Visit(context.expressionStmt());
        var op = context.GetChild(0).GetText();

        return (value, op) switch
        {
            (IntValue i, "-") => new IntValue(-i.Value),
            (Float64Value f, "-") => new Float64Value(-f.Value),
            (BoolValue b, "!") => new BoolValue(!b.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitFloat(LanguageParser.FloatContext context)
    {
        return new Float64Value(float.Parse(context.FLOAT().GetText()));
    }

    public override ValueWrapper VisitBoolean(LanguageParser.BooleanContext context)
    {
        return new BoolValue(bool.Parse(context.BOOLEAN().GetText()));
    }

    public override ValueWrapper VisitString(LanguageParser.StringContext context)
    {
        return new StringValue(context.STRING().GetText());
    }

    public override ValueWrapper VisitRune(LanguageParser.RuneContext context)
    {
        return new RuneValue(context.RUNE().GetText()[1]);
    }

    public override ValueWrapper VisitBlockStmt(LanguageParser.BlockStmtContext context)
    {
        Environment oldEnvironment = actualEnvironment; 
        actualEnvironment = new Environment(oldEnvironment);

        foreach (var stmt in context.stmt())
        {
            Visit(stmt);
        }

        actualEnvironment = oldEnvironment;

        return defaultValue;
    } 

    public override ValueWrapper VisitIfStatement(LanguageParser.IfStatementContext context)
    {
        ValueWrapper condition = Visit(context.expressionStmt());
        
        if (condition is not BoolValue)
        {
            throw new SemanticError("Invalid condition", context.Start);
        }

        if ((condition as BoolValue).Value)
        {
            Visit(context.nonDeclaration(0));
        }
        else if (context.nonDeclaration().Length > 1)
        {
            Visit(context.nonDeclaration(1));
        }

        return defaultValue;
    }

    public override ValueWrapper VisitSwitchStatement(LanguageParser.SwitchStatementContext context)
    {
        ValueWrapper expr = Visit(context.expressionStmt());
        bool found = false;
    
        try
        {
            foreach (LanguageParser.SwitchCaseContext caseStmt in context.switchCase())
            {
                if (found)
                {
                    break;
                }
    
                ValueWrapper caseExpr = Visit(caseStmt.expressionStmt());
    
                if (caseExpr is StringValue stringValue)
                {
                    string caseStrValue = stringValue.Value;
                    if (caseStrValue.StartsWith("\"") && caseStrValue.EndsWith("\""))
                    {
                        caseStrValue = caseStrValue.Substring(1, caseStrValue.Length - 2);
                    }
                    caseExpr = new StringValue(caseStrValue);
                }
                else if (caseExpr is RuneValue runeValue)
                {
                    string caseRuneValue = runeValue.Value.ToString();
                    if (caseRuneValue.StartsWith("'") && caseRuneValue.EndsWith("'"))
                    {
                        caseRuneValue = caseRuneValue.Substring(1, caseRuneValue.Length - 2);
                    }
                    caseExpr = new RuneValue(caseRuneValue[0]);
                }
    
                if (caseExpr.Equals(expr))
                {
                    found = true;
                    foreach (var stmt in caseStmt.stmt())
                    {
                        Visit(stmt);
                    }
                }
            }
            if (!found && context.defaultCase() != null)
            {
                foreach (var stmt in context.defaultCase().stmt())
                {
                    Visit(stmt);
                }
            }
        }
        catch (BreakException)
        {
            return defaultValue;
        }
    
        return defaultValue;
    }

    public override ValueWrapper VisitWhileStatement(LanguageParser.WhileStatementContext context)
    {
        ValueWrapper condition = Visit(context.expressionStmt());
        
        if (condition is not BoolValue)
        {
            throw new SemanticError("Invalid condition", context.Start);
        }
    
        try 
        {
            while ((condition as BoolValue).Value)
            {
                try
                {
                    Visit(context.nonDeclaration());
                }
                catch (ContinueException)
                {
                    condition = Visit(context.expressionStmt());
                    continue;
                }
                condition = Visit(context.expressionStmt());
            }
        }
        catch (BreakException)
        {
            return defaultValue;
        }
    
        return defaultValue;
    }

    public override ValueWrapper VisitForStatement(LanguageParser.ForStatementContext context)
    {
        Environment previousEnvironment = actualEnvironment;
        actualEnvironment = new Environment(previousEnvironment);

        Visit(context.forInit());

        VisitForBody(context);  

        actualEnvironment = previousEnvironment;
        return defaultValue;
    }

    public void VisitForBody(LanguageParser.ForStatementContext context)
    {
        ValueWrapper condition = Visit(context.expressionStmt(0));

        var previousEnvironment = actualEnvironment;

        if (condition is not BoolValue)
        {
            throw new SemanticError("Invalid condition", context.Start);
        }

        try
        {
            while (condition is BoolValue boolCondition && boolCondition.Value)
            {
                Visit(context.nonDeclaration());
                Visit(context.expressionStmt(1));
                condition = Visit(context.expressionStmt(0));
            }
        } 
        catch (BreakException)
        {
            actualEnvironment = previousEnvironment;
        }
        catch (ContinueException)
        {
            actualEnvironment = previousEnvironment;

            Visit(context.expressionStmt(1));
            VisitForBody(context);
        }
    }

    public override ValueWrapper VisitBreakStmt(LanguageParser.BreakStmtContext context)
    {
        throw new BreakException();
    }

    public override ValueWrapper VisitContinueStmt(LanguageParser.ContinueStmtContext context)
    {
        throw new ContinueException();
    }

    public override ValueWrapper VisitReturnStmt(LanguageParser.ReturnStmtContext context)
    {
        ValueWrapper value = this.defaultValue;

        if (context.expressionStmt() != null)
        {
            value = Visit(context.expressionStmt());
        }

        throw new ReturnException(value);
    }

    public override ValueWrapper VisitCallExpression(LanguageParser.CallExpressionContext context)
    {
        ValueWrapper call = Visit(context.expressionStmt());

        foreach (var action in context.call())
        {
            if (action is LanguageParser.FunctionAccessContext functionCall)
            {
                if (call is FunctionValue functionValue)
                {
                    call = VisitCall(functionValue.invocable, functionCall.args());
                }
                else
                {
                    throw new SemanticError("Invalid function call", context.Start);
                }
            }
            else if (action is LanguageParser.AtributeAccessContext atributeCall)
            {
                if (call is InstanceValue instanceValue)
                {
                    call = instanceValue.instance.Get(atributeCall.ID().GetText(), atributeCall.Start);
                }
                else 
                {
                    throw new SemanticError("Invalid atribute access", context.Start);
                }
            }
        }


        return call;
    }

    public override ValueWrapper VisitStructDeclaration(LanguageParser.StructDeclarationContext context)
    {
        Dictionary<string, LanguageParser.VariableDeclarationContext> atributes = new Dictionary<string, LanguageParser.VariableDeclarationContext>();
        //Dictionary<string, ForeignFunction> functions = new Dictionary<string, ForeignFunction>();
        
        foreach (var variable in context.variableDeclaration())
        {
            if (variable != null)
            {
                atributes.Add(variable.ID().GetText(), variable);
            }
            /*else if (attribute.FunctionDeclaration() != null)
            {
                var function = attribute.FunctionDeclaration();
                var foreign = new ForeignFunction(actualEnvironment, function); 
                functions.Add(function.ID().GetText(), foreign);
            }*/
        }

        Struct _struct = new Struct(context.ID().GetText(), atributes);

        //actualEnvironment.Declare(context.ID().GetText(), new StructValue(_struct), context.Start);

        return defaultValue;
    }

    public override ValueWrapper VisitNewStruct(LanguageParser.NewStructContext context)
    {
        ValueWrapper structValue = actualEnvironment.Get(context.ID(0).GetText(), context.Start);

        if(structValue is not StructValue)
        {
            throw new SemanticError("Invalid struct instance", context.Start);
        }

        List<ValueWrapper> args = new List<ValueWrapper>();

        Dictionary<string, LanguageParser.VariableDeclarationContext> atributes = ((StructValue) structValue)._struct.Atributes;

        foreach(var atribute in context.structAtribute())
        {
            foreach (var at in atributes)
            {
                if (at.Key == atribute.ID().GetText())
                {
                    args.Add(Visit(atribute.expressionStmt()));
                }
            }
        }

        /*if (context.structAtribute() != null)
        {
            foreach (var argument in context.structAtribute().expressionStmt())
            {
                args.Add(Visit(argument));
            }
        }*/
        var instance = ((StructValue) structValue)._struct.Invoke(args, this);


        return instance;
    }

    public ValueWrapper VisitCall(Invocable invocable, LanguageParser.ArgsContext context)
    {
        List<ValueWrapper> args = new List<ValueWrapper>();

        if (context != null)
        {
            foreach (var expression in context.expressionStmt())
            {
                args.Add(Visit(expression));
            }
        }

        /*if (context != null && args.Count != invocable.Arity())
        {
            throw new SemanticError("Invalid number of arguments", context.Start);
        }*/

        return invocable.Invoke(args, this); 

    }

    public override ValueWrapper VisitFunctionDeclaration(LanguageParser.FunctionDeclarationContext context)
    {
        var foreign = new ForeignFunction(actualEnvironment, context);

        if (context.TYPE() == null)
        {
            actualEnvironment.Declare("function", context.ID().GetText(), new FunctionValue(foreign, context.ID().GetText()), context.Start);
        }
        else
        {
            actualEnvironment.Declare(context.TYPE().GetText(), context.ID().GetText(), new FunctionValue(foreign, context.ID().GetText()), context.Start);
        }

        return defaultValue;
    }

}