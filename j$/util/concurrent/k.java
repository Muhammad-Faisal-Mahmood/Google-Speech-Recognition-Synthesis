/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.n;
import java.util.Map;

final class k
implements Map.Entry {
    final Object a;
    Object b;
    final ConcurrentHashMap c;

    k(Object object, Object object2, ConcurrentHashMap concurrentHashMap) {
        this.a = object;
        this.b = object2;
        this.c = concurrentHashMap;
    }

    @Override
    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = !(!(object instanceof Map.Entry) || (object3 = (object = (Map.Entry)object).getKey()) == null || (object = object.getValue()) == null || object3 != (object2 = this.a) && !object3.equals(object2) || object != (object3 = this.b) && !object.equals(object3));
        return bl2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final Object setValue(Object object) {
        object.getClass();
        Object object2 = this.b;
        this.b = object;
        this.c.put(this.a, object);
        return object2;
    }

    public final String toString() {
        return n.b(this.a, this.b);
    }
}

