    // Port of Foreign/Index.js: records and objects are maps here.
    public static Object unsafeReadPropImpl = (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Function<Object, Object>) (key) ->
        (java.util.function.Function<Object, Object>) (value) -> {
            if (value == null || value == __M$Foreign.undefined) return f;
            if (value instanceof java.util.Map) {
                java.util.Map<String, Object> map = (java.util.Map<String, Object>) value;
                String name = String.valueOf(key);
                Object found = map.containsKey(name) ? map.get(name) : __M$Foreign.undefined;
                return ((java.util.function.Function<Object, Object>) s).apply(found);
            }
            if (value instanceof Object[]) {
                Object[] array = (Object[]) value;
                int index = key instanceof Number
                    ? ((Number) key).intValue()
                    : Integer.parseInt(String.valueOf(key));
                Object found = index >= 0 && index < array.length ? array[index] : __M$Foreign.undefined;
                return ((java.util.function.Function<Object, Object>) s).apply(found);
            }
            return f;
        };

    private static boolean __hasProperty(Object prop, Object value) {
        if (value instanceof java.util.Map) {
            return ((java.util.Map<String, Object>) value).containsKey(String.valueOf(prop));
        }
        if (value instanceof Object[]) {
            int index = prop instanceof Number
                ? ((Number) prop).intValue()
                : Integer.parseInt(String.valueOf(prop));
            return index >= 0 && index < ((Object[]) value).length;
        }
        return false;
    }

    public static Object unsafeHasOwnProperty = (java.util.function.Function<Object, Object>) (prop) ->
        (java.util.function.Function<Object, Object>) (value) -> __hasProperty(prop, value);

    public static Object unsafeHasProperty = (java.util.function.Function<Object, Object>) (prop) ->
        (java.util.function.Function<Object, Object>) (value) -> __hasProperty(prop, value);
