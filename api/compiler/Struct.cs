using analyzer;

public class Struct : Invocable
{
    public string Name { get; set; }
    public Dictionary<string, LanguageParser.VariableDeclarationContext> Atributes { get; set; }

    public Dictionary<string, ForeignFunction> Functions { get; set; }

    public Struct(string name, Dictionary<string, LanguageParser.VariableDeclarationContext> atributes)
    {
        Name = name;
        Atributes = atributes;
    }

    public ForeignFunction? GetFunction(string name)
    {
        if (Functions.ContainsKey(name))
        {
            return Functions[name];
        }
    
        return null;
    }

    public int Arity()
    {
        var constructor = GetFunction("constructor");
        if (constructor != null)
        {
            return constructor.Arity();
        }

        return 0;
    }

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        var newInstance = new Instance(this);

        foreach (var attribute in Atributes)
        {
            var name = attribute.Key;
            var value = attribute.Value;

            if (value.expressionStmt() != null)
            {
                var expression = visitor.Visit(value.expressionStmt());
                newInstance.Set(name, expression);
            }
            else
            {
                newInstance.Set(name, visitor.defaultValue);
            }
        }

        var constructor = GetFunction("constructor");
        if (constructor != null)
        {
            return constructor.Invoke(args, visitor);
        }

        return new InstanceValue(newInstance);
    }

}