using System.Text;

public class Embeded
{
    public static void Generate(Environment env)
    {
        env.Declare("function", "time", new FunctionValue(new TimeEmbeded(), "time"), null);
        //env.Declare("function", "fmt.Println", new FunctionValue(new PrintEmbeded(), "fmt.Println"), null);
        env.Declare("function", "strconv.Atoi", new FunctionValue(new StringToIntEmbeded(), "stringToInt"), null);
        env.Declare("function", "strconv.ParseFloat", new FunctionValue(new StringToFloat64Embeded(), "stringToFloat64"), null);
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

/*public class PrintEmbeded : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        var output = "";
        foreach (var arg in args)
        {
            output += arg switch
            {
                IntValue i => i.Value.ToString() + " ",
                Float64Value f => f.Value.ToString() + " ",
                BoolValue b => b.Value.ToString() + " ",
                RuneValue r => r.Value.ToString() + " ",
                StringValue s => ProcessString(s.Value) + " ",
                VoidValue _ => "void" + " ",
                FunctionValue fn => "<function: " + fn.name + ">" + " ",
                _ => throw new SemanticError("Unknown type", null)
            };
        }

        visitor.output += output.TrimEnd() + "\n";

        return visitor.defaultValue;
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
}*/

public class StringToIntEmbeded : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        if (args[0] is StringValue s)
        {
            if (int.TryParse(s.Value, out int result))
            {
                return new IntValue(result);
            }
            else
            {
                throw new SemanticError("Invalid value for int: " + s.Value, null);
            }
        }
        else
        {
            throw new SemanticError("Invalid value for int: " + args[0], null);
        }
    }
}

public class StringToFloat64Embeded : Invocable
{
    public int Arity() => 1;

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        if (args[0] is StringValue s)
        {
            if (float.TryParse(s.Value, out float result))
            {
                return new Float64Value(result);
            }
            else
            {
                throw new SemanticError("Invalid value for float64: " + s.Value, null);
            }
        }
        else
        {
            throw new SemanticError("Invalid value for float64: " + args[0], null);
        }
    }
}