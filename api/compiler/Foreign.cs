using analyzer;

public class ForeignFunction : Invocable
{
    private Environment clousure;
    private LanguageParser.FunctionDeclarationContext context;

    public ForeignFunction(Environment clousure, LanguageParser.FunctionDeclarationContext context)
    {
        this.clousure = clousure;
        this.context = context;
    }

    public int Arity()
    {
        if (context.@params() == null)
        {
            return 0;
        }

        return context.@params().ID().Length;
    }

    public ValueWrapper Invoke(List<ValueWrapper> arguments, CompilerVisitor visitor)
    {
        var newEnvironment = new Environment(clousure);
        var beforeCallEnvironment = visitor.actualEnvironment;
        visitor.actualEnvironment = newEnvironment;

        if(context.@params() != null)
        {
            for (int i = 0; i < context.@params().ID().Length; i++)
            {
                newEnvironment.Declare("function", context.@params().ID(i).GetText(), arguments[i], null);
            }
        }

        try
        {
            foreach (var statement in context.blockStmt().stmt())
            {
                visitor.Visit(statement);
            }
        }
        catch (ReturnException e)
        {
            visitor.actualEnvironment = beforeCallEnvironment;
            return e.Value;
        }

        visitor.actualEnvironment = beforeCallEnvironment;
        return visitor.defaultValue;

    }
    
    public ForeignFunction Bind(Instance instance)
    {
        var hiddenEnvironment = new Environment(clousure);
        hiddenEnvironment.Declare("function", "this", new InstanceValue(instance), null);
        return new ForeignFunction(hiddenEnvironment, context);
    }
}