public abstract record ValueWrapper;

public record IntValue(int Value) : ValueWrapper;

public record Float64Value(float Value) : ValueWrapper;

public record BoolValue(bool Value) : ValueWrapper;

public record StringValue(string Value) : ValueWrapper;

public record RuneValue(char Value) : ValueWrapper;

public record VoidValue : ValueWrapper;

public record FunctionValue(Invocable invocable, string name) : ValueWrapper;

public record InstanceValue(Instance instance) : ValueWrapper;

public record StructValue(Struct _struct) : ValueWrapper;

