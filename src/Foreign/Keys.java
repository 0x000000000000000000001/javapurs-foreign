    // Port of Foreign/Keys.js.
    public static Object unsafeKeys = (java.util.function.Function<Object, Object>) (value) ->
        value instanceof java.util.Map
            ? ((java.util.Map<String, Object>) value).keySet().toArray(new Object[0])
            : new Object[0];
