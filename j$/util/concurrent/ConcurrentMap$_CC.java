/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap;
import j$.util.concurrent.y;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ConcurrentMap$_CC {
    public static Object $default$compute(java.util.concurrent.ConcurrentMap concurrentMap, Object object, BiFunction biFunction) {
        block0: while (true) {
            Object r2;
            Object object2 = concurrentMap.get(object);
            while ((r2 = biFunction.apply(object, object2)) != null) {
                if (object2 != null) {
                    if (!concurrentMap.replace(object, object2, r2)) continue block0;
                    return r2;
                }
                Object r3 = concurrentMap.putIfAbsent(object, r2);
                object2 = r3;
                if (r3 != null) continue;
                return r2;
            }
            if (object2 == null || concurrentMap.remove(object, object2)) break;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap object, Object object2, Function function) {
        void var3_8;
        Object v2;
        Objects.requireNonNull(function);
        Object v3 = v2 = object.get(object2);
        if (v2 != null) return var3_8;
        Object r2 = function.apply(object2);
        Object v4 = v2;
        if (r2 == null) return var3_8;
        Object object3 = object = object.putIfAbsent(object2, r2);
        if (object != null) return var3_8;
        return r2;
    }

    public static Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object object, BiFunction biFunction) {
        Object v2;
        Objects.requireNonNull(biFunction);
        while ((v2 = concurrentMap.get(object)) != null) {
            Object r2 = biFunction.apply(object, v2);
            if (!(r2 == null ? concurrentMap.remove(object, v2) : concurrentMap.replace(object, v2, r2))) continue;
            return r2;
        }
        return null;
    }

    public static void $default$forEach(java.util.concurrent.ConcurrentMap object, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : object.entrySet()) {
            Object v2;
            Object k2;
            try {
                k2 = entry.getKey();
                v2 = entry.getValue();
            }
            catch (IllegalStateException illegalStateException) {
                continue;
            }
            biConsumer.accept(k2, v2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, Object object, Object object2, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(object2);
        block0: while (true) {
            Object object3;
            Object v2 = concurrentMap.get(object);
            do {
                void var4_4;
                if (var4_4 != null) {
                    Object r2 = biFunction.apply(var4_4, object2);
                    if (r2 != null) {
                        if (!concurrentMap.replace(object, var4_4, r2)) continue block0;
                        return r2;
                    }
                    if (concurrentMap.remove(object, var4_4)) return null;
                    continue block0;
                }
                Object object4 = object3 = concurrentMap.putIfAbsent(object, object2);
            } while (object3 != null);
            break;
        }
        return object2;
    }

    public static void $default$replaceAll(java.util.concurrent.ConcurrentMap concurrentMap, BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        biFunction = new y(0, concurrentMap, biFunction);
        if (concurrentMap instanceof ConcurrentMap) {
            ((ConcurrentMap)((Object)concurrentMap)).forEach(biFunction);
        } else {
            ConcurrentMap$_CC.$default$forEach(concurrentMap, (BiConsumer)((Object)biFunction));
        }
    }
}

