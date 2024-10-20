/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Map;
import j$.util.Map$_CC;
import j$.util.concurrent.ConcurrentMap$_CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class Map$_EL {
    public static /* synthetic */ void a(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map)((Object)map)).forEach(biConsumer);
            return;
        }
        if (map instanceof ConcurrentMap) {
            ConcurrentMap$_CC.$default$forEach((ConcurrentMap)map, biConsumer);
            return;
        }
        Map$_CC.$default$forEach(map, biConsumer);
    }

    public static /* synthetic */ Object b(java.util.Map map, Object object, Object object2, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map)((Object)map)).merge(object, object2, biFunction);
        }
        if (map instanceof ConcurrentMap) {
            return ConcurrentMap$_CC.$default$merge((ConcurrentMap)map, object, object2, biFunction);
        }
        return Map$_CC.$default$merge(map, object, object2, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(java.util.Map map, Object object, Function function) {
        if (map instanceof Map) {
            return ((Map)((Object)map)).computeIfAbsent(object, function);
        }
        if (map instanceof ConcurrentMap) {
            return ConcurrentMap$_CC.$default$computeIfAbsent((ConcurrentMap)map, object, function);
        }
        return Map$_CC.$default$computeIfAbsent(map, object, function);
    }

    public static Object getOrDefault(java.util.Map map, Object object, Object object2) {
        if (map instanceof Map) {
            return ((Map)((Object)map)).getOrDefault(object, object2);
        }
        if (map instanceof ConcurrentMap) {
            if ((map = ((ConcurrentMap)map).get(object)) != null) {
                object2 = map;
            }
            return object2;
        }
        return Map$_CC.$default$getOrDefault(map, object, object2);
    }

    public static /* synthetic */ Object putIfAbsent(java.util.Map map, Object object, Object object2) {
        if (map instanceof Map) {
            return ((Map)((Object)map)).putIfAbsent(object, object2);
        }
        return Map$_CC.$default$putIfAbsent(map, object, object2);
    }
}

