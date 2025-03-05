using analyzer;
using Antlr4.Runtime.Misc;

class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{

    private ValueWrapper defaultValue = new VoidValue();
    public string output = "";
    private Environment actualEnvironment = new Environment();

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

        actualEnvironment.SetVariable(id, value);

        return defaultValue;
    }

    public override ValueWrapper VisitPrint(LanguageParser.PrintContext context)
    {
        ValueWrapper value = Visit(context.expressionStmt());
        output += value + "\n";
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
            _ => throw new System.Exception("Invalid operation")
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
            _ => throw new System.Exception("Invalid operation")
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
            _ => throw new System.Exception("Invalid operation")
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
            _ => throw new System.Exception("Invalid operation")
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
        return -Visit(context.expressionStmt());
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
}