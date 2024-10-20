/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class Map$_CC {
    public static Object $default$compute(Map map, Object object, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Object v2 = map.get(object);
        biFunction = biFunction.apply(object, v2);
        if (biFunction == null) {
            if (v2 == null && !map.containsKey(object)) {
                return null;
            }
            map.remove(object);
            return null;
        }
        map.put(object, biFunction);
        return biFunction;
    }

    public static Object $default$computeIfAbsent(Map map, Object object, Function function) {
        Objects.requireNonNull(function);
        Object v2 = map.get(object);
        if (v2 == null && (function = function.apply(object)) != null) {
            map.put(object, function);
            return function;
        }
        return v2;
    }

    public static Object $default$computeIfPresent(Map map, Object object, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Object v2 = map.get(object);
        if (v2 != null) {
            if ((biFunction = biFunction.apply(object, v2)) != null) {
                map.put(object, biFunction);
                return biFunction;
            }
            map.remove(object);
        }
        return null;
    }

    public static void $default$forEach(Map object, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : object.entrySet()) {
            Object entry2;
            Object k2;
            try {
                k2 = entry.getKey();
                entry2 = entry.getValue();
            }
            catch (IllegalStateException illegalStateException) {
                throw new ConcurrentModificationException(illegalStateException);
            }
            biConsumer.accept(k2, entry2);
        }
    }

    public static Object $default$getOrDefault(Map map, Object object, Object object2) {
        Object v2 = map.get(object);
        if (v2 != null || map.containsKey(object)) {
            object2 = v2;
        }
        return object2;
    }

    public static Object $default$merge(Map map, Object object, Object object2, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(object2);
        Object v2 = map.get(object);
        if (v2 != null) {
            object2 = biFunction.apply(v2, object2);
        }
        if (object2 == null) {
            map.remove(object);
        } else {
            map.put(object, object2);
        }
        return object2;
    }

    public static Object $default$putIfAbsent(Map map, Object object, Object object2) {
        Object v2;
        Object object3 = v2 = map.get(object);
        if (v2 == null) {
            object3 = map.put(object, object2);
        }
        return object3;
    }

    public static boolean $default$remove(Map map, Object object, Object object2) {
        Object v2 = map.get(object);
        if (Objects.equals(v2, object2) && (v2 != null || map.containsKey(object))) {
            map.remove(object);
            return true;
        }
        return false;
    }

    public static Object $default$replace(Map map, Object object, Object object2) {
        Object object3 = map.get(object);
        if (object3 != null || map.containsKey(object)) {
            object3 = map.put(object, object2);
        }
        return object3;
    }

    public static boolean $default$replace(Map map, Object object, Object object2, Object object3) {
        Object v2 = map.get(object);
        if (Objects.equals(v2, object2) && (v2 != null || map.containsKey(object))) {
            map.put(object, object3);
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static void $default$replaceAll(Map object2, BiFunction biFunction) {
        void var1_5;
        Objects.requireNonNull(var1_5);
        for (Map.Entry illegalStateException : object2.entrySet()) {
            Object object;
            Object k2;
            try {
                k2 = illegalStateException.getKey();
                object = illegalStateException.getValue();
            }
            catch (IllegalStateException illegalStateException2) {
                throw new ConcurrentModificationException(illegalStateException2);
            }
            object = var1_5.apply(k2, object);
            try {
                illegalStateException.setValue(object);
            }
            catch (IllegalStateException illegalStateException3) {
                throw new ConcurrentModificationException(illegalStateException3);
            }
        }
    }
}

