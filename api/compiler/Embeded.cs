public class Embeded
{
    public static void Generate(Environment env)
    {
        env.DeclareVariable("time", new FunctionValue(new TimeEmbeded(), "time"), null);
        env.DeclareVariable("print", new FunctionValue(new PrintEmbeded(), "print"), null);
    }
}

public class TimeEmbeded : Invocable
{
    public int Arity() => 0;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        return new StringValue(DateTime.Now.ToString());
    } 
}

public class  PrintEmbeded : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        var output = "";
        foreach (var arg in args)
        {
            output += arg switch
            {
                IntValue i => output += i.Value.ToString() + " ",
                FloatValue f => output += f.Value.ToString() + " ",
                BoolValue b => output += b.Value.ToString() + " ",
                StringValue s => output += s.Value.Replace("\"", "") + " ",
                VoidValue _ => output += "void" + " ",
                FunctionValue fn => output += "<function: " + fn.name + ">" + " ",
                _ => throw new SemanticError("Unknown type", null)
            };
            visitor.output += output;
            output = "";
        }

        visitor.output += output + "\n";

        return visitor.defaultValue;
    }
}