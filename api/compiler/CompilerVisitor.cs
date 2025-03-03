using analyzer;
using Antlr4.Runtime.Misc;

class CompilerVisitor : LanguageBaseVisitor<int>
{

    public string output = "";
    private Environment actualEnvironment = new Environment();

    public override int VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var stmt in context.stmt())
        {
            Visit(stmt);
        }

        return 0;
    }

    public override int VisitDeclaration(LanguageParser.DeclarationContext context)
    {
        string id = context.ID().GetText();
        int value = Visit(context.expressionStmt());

        actualEnvironment.SetVariable(id, value);

        return value;
    }

    public override int VisitPrint(LanguageParser.PrintContext context)
    {
        int value = Visit(context.expressionStmt());
        output += value + "\n";
        return 0;
    }

    public override int VisitIdentifier(LanguageParser.IdentifierContext context)
    {
        string id = context.ID().GetText();

        return actualEnvironment.GetVariable(id);
    }

    public override int VisitAddSub(LanguageParser.AddSubContext context)
    {
        int left = Visit(context.expressionStmt(0));
        int right = Visit(context.expressionStmt(1));
        
        return context.GetChild(1).GetText() == "+" ? left + right : left - right;
    }

    public override int VisitMulDiv(LanguageParser.MulDivContext context)
    {
        int left = Visit(context.expressionStmt(0));
        int right = Visit(context.expressionStmt(1));
        
        return context.GetChild(1).GetText() == "*" ? left * right : left / right;
    }

    public override int VisitNumber(LanguageParser.NumberContext context)
    {
        return int.Parse(context.INT().GetText());
    }

    public override int VisitParens(LanguageParser.ParensContext context)
    {
        return Visit(context.expressionStmt());
    }

    public override int VisitNegate(LanguageParser.NegateContext context)
    {
        return -Visit(context.expressionStmt());
    }
}