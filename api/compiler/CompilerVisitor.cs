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
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expressionStmt());

        actualEnvironment.DeclareVariable(id, value, context.Start);

        return defaultValue;
    }

    public override ValueWrapper VisitAssignment(LanguageParser.AssignmentContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expressionStmt());

        return actualEnvironment.AssignVariable(id, value, context.Start);

    }

/*    public override ValueWrapper VisitPrint(LanguageParser.PrintContext context)
    {
        ValueWrapper value = Visit(context.expressionStmt());
        output += value switch
        {
            IntValue i => i.Value.ToString(),
            FloatValue f => f.Value.ToString(),
            BoolValue b => b.Value.ToString(),
            StringValue s => s.Value.Replace("\"", ""),
            VoidValue v => "void",
            FunctionValue fn => "<function " + fn.name + ">",
            _ => throw new SemanticError("Invalid value", context.Start)
        } + "\n";
        return defaultValue;
    }
*/
    public override ValueWrapper VisitIdentifier(LanguageParser.IdentifierContext context)
    {
        string id = context.ID().GetText();

        return actualEnvironment.GetVariable(id, context.Start);
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
            (FloatValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
            (FloatValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitMulDiv(LanguageParser.MulDivContext context)
    {
        ValueWrapper left = Visit(context.expressionStmt(0));
        ValueWrapper right = Visit(context.expressionStmt(1));
        var op = context.GetChild(1).GetText();

        return (left, right, op) switch
        {
            (IntValue l, IntValue r, "+") => new IntValue(l.Value + r.Value),
            (IntValue l, IntValue r, "-") => new IntValue(l.Value - r.Value),
            (IntValue l, IntValue r, "*") => new IntValue(l.Value * r.Value),
            (IntValue l, IntValue r, "/") => new IntValue(l.Value / r.Value),
            (FloatValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
            (FloatValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),
            (FloatValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),
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
            (IntValue l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
            (IntValue l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),
            (FloatValue l, FloatValue r, "<") => new BoolValue(l.Value < r.Value),
            (FloatValue l, FloatValue r, ">") => new BoolValue(l.Value > r.Value),
            (FloatValue l, FloatValue r, "<=") => new BoolValue(l.Value <= r.Value),
            (FloatValue l, FloatValue r, ">=") => new BoolValue(l.Value >= r.Value),
            (FloatValue l, FloatValue r, "==") => new BoolValue(l.Value == r.Value),
            (FloatValue l, FloatValue r, "!=") => new BoolValue(l.Value != r.Value),
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
            (FloatValue l, FloatValue r, "==") => new BoolValue(l.Value == r.Value),
            (FloatValue l, FloatValue r, "!=") => new BoolValue(l.Value != r.Value),
            (BoolValue l, BoolValue r, "==") => new BoolValue(l.Value == r.Value),
            (BoolValue l, BoolValue r, "!=") => new BoolValue(l.Value != r.Value),
            (StringValue l, StringValue r, "==") => new BoolValue(l.Value == r.Value),
            (StringValue l, StringValue r, "!=") => new BoolValue(l.Value != r.Value),
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
        return value switch
        {
            IntValue i => new IntValue(-i.Value),
            FloatValue f => new FloatValue(-f.Value),
            _ => throw new SemanticError("Invalid operation", context.Start)
        };
    }

    public override ValueWrapper VisitFloat(LanguageParser.FloatContext context)
    {
        return new FloatValue(float.Parse(context.FLOAT().GetText()));
    }

    public override ValueWrapper VisitBoolean(LanguageParser.BooleanContext context)
    {
        return new BoolValue(bool.Parse(context.BOOLEAN().GetText()));
    }

    public override ValueWrapper VisitString(LanguageParser.StringContext context)
    {
        return new StringValue(context.STRING().GetText());
    }

    public override ValueWrapper VisitBlock(LanguageParser.BlockContext context)
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

    public override ValueWrapper VisitIfStmt(LanguageParser.IfStmtContext context)
    {
        ValueWrapper condition = Visit(context.expressionStmt());
        
        if (condition is not BoolValue)
        {
            throw new SemanticError("Invalid condition", context.Start);
        }

        if ((condition as BoolValue).Value)
        {
            Visit(context.nonDcl(0));
        }
        else if (context.nonDcl().Length > 1)
        {
            Visit(context.nonDcl(1));
        }

        return defaultValue;
    }

    public override ValueWrapper VisitWhileStmt(LanguageParser.WhileStmtContext context)
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
                    Visit(context.nonDcl());
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

    public override ValueWrapper VisitForStmt(LanguageParser.ForStmtContext context)
    {
        Environment previousEnvironment = actualEnvironment;
        actualEnvironment = new Environment(previousEnvironment);

        Visit(context.forInit());

        VisitForBody(context);  

        actualEnvironment = previousEnvironment;
        return defaultValue;
    }

    public void VisitForBody(LanguageParser.ForStmtContext context)
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
                Visit(context.nonDcl());
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

    public override ValueWrapper VisitFunctionCall(LanguageParser.FunctionCallContext context)
    {
        ValueWrapper function = Visit(context.expressionStmt());

        foreach (var call in context.call())
        {
            if (function is FunctionValue functionValue)
            {
                function = VisitCall(functionValue.invocable, call.args());
            }
            else
            {
                throw new SemanticError("Invalid function call", context.Start);
            }
        }


        return function;
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

}