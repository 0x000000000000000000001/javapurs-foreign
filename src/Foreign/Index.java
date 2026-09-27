    // Port of Foreign/Index.js: records and objects are maps here.
    public static Object unsafeReadPropImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Function<Object, Object>) (key) ->
        (java.util.function.Function<Object, Object>) (value) -> {
            if (value == null) return f;
            if (value instanceof java.util.Map) {
                Object found = ((java.util.Map<String, Object>) value).get((String) key);
                return ((java.util.function.Function<Object, Object>) s).apply(found);
            }
            return f;
        };

    public static Object unsafeHasOwnProperty = (java.util.function.Function<Object, Object>) (prop) ->
        (java.util.function.Function<Object, Object>) (value) ->
            value instanceof java.util.Map && ((java.util.Map<String, Object>) value).containsKey((String) prop);

    public static Object unsafeHasProperty = (java.util.function.Function<Object, Object>) (prop) ->
        (java.util.function.Function<Object, Object>) (value) ->
            value instanceof java.util.Map && ((java.util.Map<String, Object>) value).containsKey((String) prop);
