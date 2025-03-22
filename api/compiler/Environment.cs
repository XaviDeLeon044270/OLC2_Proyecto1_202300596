public class Environment
{
    
    public Dictionary<string,ValueWrapper> variables = new Dictionary<string,ValueWrapper>();

    private Environment? parent;

    public Environment(Environment? parent)
    {
        this.parent = parent;
    }  

    public ValueWrapper Get(string id, Antlr4.Runtime.IToken token)
    {
        if (variables.ContainsKey(id))
        {
            return variables[id];
        }
        if (parent != null)
        {
            return parent.Get(id, token);
        }

        throw new SemanticError("Variable not found: " + id, token);
        
    }

    public void Declare(string type, string id, ValueWrapper value, Antlr4.Runtime.IToken? token)
    {
        if (variables.ContainsKey(id))
        {
            if (token != null) throw new SemanticError("Variable already declared: " + id, token);
        }
        else
        {
            switch (type)
            {
                case "int":
                    if (value is null)
                    {
                        variables[id] = new IntValue(0);
                    }
                    else if (value is IntValue intValue)
                    {
                        variables[id] = intValue;
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for int: " + value, token);
                    }
                    break;

                case "float64":
                    if (value is null)
                    {
                        variables[id] = new Float64Value(0);
                    }
                    else if (value is Float64Value floatValue)
                    {
                        variables[id] = floatValue;
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for float64: " + value, token);
                    }
                    break;

                case "bool":
                    if (value is null)
                    {
                        variables[id] = new BoolValue(false);
                    }
                    else if (value is BoolValue boolValue)
                    {
                        variables[id] = boolValue;
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for bool: " + value, token);
                    }
                    break;

                case "string":
                    if (value is null)
                    {
                        variables[id] = new StringValue("");
                    }
                    else if (value is StringValue stringValue)
                    {
                        string strValue = stringValue.Value;
                        if (strValue.StartsWith("\"") && strValue.EndsWith("\""))
                        {
                            strValue = strValue.Substring(1, strValue.Length - 2);
                        }
                        variables[id] = new StringValue(strValue);
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for string: " + value, token);
                    }
                    break;

                case "rune":
                    if (value is null)
                    {
                        variables[id] = new RuneValue('\0');
                    }
                    else if (value is RuneValue runeValue)
                    {
                        variables[id] = runeValue;
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for rune: " + value, token);
                    }
                    break;

                case "implicit":
                    if (value is StringValue stringVal)
                    {
                        string strValue = stringVal.Value;
                        if (strValue.StartsWith("\"") && strValue.EndsWith("\""))
                        {
                            strValue = strValue.Substring(1, strValue.Length - 2);
                        }
                        variables[id] = new StringValue(strValue);
                    }
                    else 
                    {
                        variables[id] = value;
                    }
                    
                    break;

                case "function":
                    if (value is null)
                    {
                        throw new SemanticError("Invalid value for function: " + value, token);
                    }
                    else if (value is FunctionValue functionValue)
                    {
                        variables[id] = functionValue;
                    }
                    else
                    {
                        throw new SemanticError("Invalid value for function: " + value, token);
                    }
                    break;

                default:
                    throw new SemanticError("Unknown type: " + type, token);
            }

        }
    }

    public ValueWrapper AssignVariable(string id, ValueWrapper value, Antlr4.Runtime.IToken token)
    {
        if (variables.ContainsKey(id))
        {
            variables[id] = value;
            return value;
        }

        if (parent != null)
        {
            return parent.AssignVariable(id, value, token);
        }

        throw new SemanticError("Variable not found: " + id, token);
        
    }

}