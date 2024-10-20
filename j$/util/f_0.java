/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Map;
import j$.util.Map$_CC;
import j$.util.Map$_EL;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap$_CC;
import j$.util.d_0;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * Renamed from j$.util.f
 */
final class f_0
implements java.util.Map,
Serializable,
Map {
    private static final long serialVersionUID = 1978198479659022715L;
    private final java.util.Map a;
    final Object b;
    private transient Set c;
    private transient Set d;
    private transient Collection e;

    f_0(java.util.Map map) {
        this.a = Objects.requireNonNull(map);
        this.b = this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object object = this.b;
        synchronized (object) {
            objectOutputStream.defaultWriteObject();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void clear() {
        Object object = this.b;
        synchronized (object) {
            this.a.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object compute(Object object, BiFunction biFunction) {
        Object object2 = this.b;
        synchronized (object2) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                return ((Map)((Object)map)).compute(object, biFunction);
            }
            if (!(map instanceof ConcurrentMap)) return Map$_CC.$default$compute(map, object, biFunction);
            return ConcurrentMap$_CC.$default$compute((ConcurrentMap)map, object, biFunction);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object computeIfAbsent(Object object, Function function) {
        Object object2 = this.b;
        synchronized (object2) {
            return Map$_EL.computeIfAbsent(this.a, object, function);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object computeIfPresent(Object object, BiFunction biFunction) {
        Object object2 = this.b;
        synchronized (object2) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                return ((Map)((Object)map)).computeIfPresent(object, biFunction);
            }
            if (!(map instanceof ConcurrentMap)) return Map$_CC.$default$computeIfPresent(map, object, biFunction);
            return ConcurrentMap$_CC.$default$computeIfPresent((ConcurrentMap)map, object, biFunction);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean containsKey(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.containsKey(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean containsValue(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.containsValue(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set entrySet() {
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.d != null) return this.d;
                Set set = new d_0(this.a.entrySet(), this.b);
                this.d = set;
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.equals(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void forEach(BiConsumer biConsumer) {
        Object object = this.b;
        synchronized (object) {
            Map$_EL.a(this.a, biConsumer);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object get(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.get(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getOrDefault(Object object, Object object2) {
        Object object3 = this.b;
        synchronized (object3) {
            return Map$_EL.getOrDefault(this.a, object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int hashCode() {
        Object object = this.b;
        synchronized (object) {
            return this.a.hashCode();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isEmpty() {
        Object object = this.b;
        synchronized (object) {
            return this.a.isEmpty();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set keySet() {
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.c != null) return this.c;
                Set set = new d_0(this.a.keySet(), this.b);
                this.c = set;
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object merge(Object object, Object object2, BiFunction biFunction) {
        Object object3 = this.b;
        synchronized (object3) {
            return Map$_EL.b(this.a, object, object2, biFunction);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object put(Object object, Object object2) {
        Object object3 = this.b;
        synchronized (object3) {
            return this.a.put(object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void putAll(java.util.Map map) {
        Object object = this.b;
        synchronized (object) {
            this.a.putAll(map);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object putIfAbsent(Object object, Object object2) {
        Object object3 = this.b;
        synchronized (object3) {
            return Map$_EL.putIfAbsent(this.a, object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object remove(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.remove(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean remove(Object object, Object object2) {
        Object object3 = this.b;
        synchronized (object3) {
            java.util.Map map = this.a;
            if (!(map instanceof Map)) return Map$_CC.$default$remove(map, object, object2);
            return ((Map)((Object)map)).remove(object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object replace(Object object, Object object2) {
        Object object3 = this.b;
        synchronized (object3) {
            java.util.Map map = this.a;
            if (!(map instanceof Map)) return Map$_CC.$default$replace(map, object, object2);
            return ((Map)((Object)map)).replace(object, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean replace(Object object, Object object2, Object object3) {
        Object object4 = this.b;
        synchronized (object4) {
            java.util.Map map = this.a;
            if (!(map instanceof Map)) return Map$_CC.$default$replace(map, object, object2, object3);
            return ((Map)((Object)map)).replace(object, object2, object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void replaceAll(BiFunction biFunction) {
        Object object = this.b;
        synchronized (object) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map)((Object)map)).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap$_CC.$default$replaceAll((ConcurrentMap)map, biFunction);
            } else {
                Map$_CC.$default$replaceAll(map, biFunction);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int size() {
        Object object = this.b;
        synchronized (object) {
            return this.a.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = this.b;
        synchronized (object) {
            return this.a.toString();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Collection values() {
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.e != null) return this.e;
                Collection collection = new d_0(this.a.values(), this.b);
                this.e = collection;
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

