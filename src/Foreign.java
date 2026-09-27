    // Port of Foreign.js. JavaScript's typeof/tagOf over this backend's values:
    // strings, boxed numbers, booleans, functions (Function or Supplier),
    // Object[] arrays and maps/records.
    public static Object typeOf = (java.util.function.Function<Object, Object>) (value) -> {
        if (value instanceof String) return "string";
        if (value instanceof Number) return "number";
        if (value instanceof Boolean) return "boolean";
        if (value instanceof java.util.function.Function) return "function";
        if (value instanceof java.util.function.Supplier) return "function";
        return "object";
    };

    public static Object tagOf = (java.util.function.Function<Object, Object>) (value) -> {
        if (value == null) return "Null";
        if (value instanceof String) return "String";
        if (value instanceof Number) return "Number";
        if (value instanceof Boolean) return "Boolean";
        if (value instanceof Object[]) return "Array";
        if (value instanceof java.util.function.Function) return "Function";
        if (value instanceof java.util.function.Supplier) return "Function";
        return "Object";
    };

    public static Object isNull = (java.util.function.Function<Object, Object>) (value) -> value == null;

    public static Object isUndefined = (java.util.function.Function<Object, Object>) (value) -> false;

    public static Object isArray = (java.util.function.Function<Object, Object>) (value) -> value instanceof Object[];
