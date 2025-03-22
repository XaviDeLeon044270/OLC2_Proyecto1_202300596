public class Instance
{
    private Struct _struct;
    private Dictionary<string, ValueWrapper> Attributes;

    public Instance(Struct _struct)
    {
        this._struct = _struct;
        Attributes = new Dictionary<string, ValueWrapper>();
    }

    public void Set(string name, ValueWrapper value)
    {
        Attributes[name] = value;
    }

    public ValueWrapper Get(string name, Antlr4.Runtime.IToken token)
    {
        if (Attributes.ContainsKey(name))
        {
            return Attributes[name];
        }

        var method = _struct.GetFunction(name);
        if (method != null)
        {
            return new FunctionValue(method.Bind(this), name);
        }

        throw new SemanticError("Property" + name + " not found in struct " + _struct.Name, token);
    }

}