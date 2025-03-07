using analyzer;
using Antlr4.Runtime.Misc;

class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{

    private ValueWrapper defaultValue = new VoidValue();
    public string output = "";
    private Environment actualEnvironment = new Environment(null);

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

        actualEnvironment.DeclareVariable(id, value);

        return defaultValue;
    }

    public override ValueWrapper VisitAssignment(LanguageParser.AssignmentContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expressionStmt());

        return actualEnvironment.AssignVariable(id, value);

    }

    public override ValueWrapper VisitPrint(LanguageParser.PrintContext context)
    {
        ValueWrapper value = Visit(context.expressionStmt());
        output += value switch
        {
            IntValue i => i.Value.ToString(),
            FloatValue f => f.Value.ToString(),
            BoolValue b => b.Value.ToString(),
            StringValue s => s.Value.Replace("\"", ""),
            VoidValue v => "void",
            _ => throw new Exception("Invalid value")
        } + "\n";
        return defaultValue;
    }

    public override ValueWrapper VisitIdentifier(LanguageParser.IdentifierContext context)
    {
        string id = context.ID().GetText();

        return actualEnvironment.GetVariable(id);
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
            _ => throw new Exception("Invalid operation")
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
            _ => throw new Exception("Invalid operation")
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
            _ => throw new Exception("Invalid operation")
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
            _ => throw new Exception("Invalid operation")
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
            _ => throw new Exception("Invalid operation")
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
            throw new Exception("Invalid condition");
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
            throw new Exception("Invalid condition");
        }

        while ((condition as BoolValue).Value)
        {
            Visit(context.nonDcl());
            condition = Visit(context.expressionStmt());
        }

        return defaultValue;
    }

}