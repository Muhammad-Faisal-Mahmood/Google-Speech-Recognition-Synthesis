/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.n;
import java.util.Map;

class l
implements Map.Entry {
    final int a;
    final Object b;
    volatile Object c;
    volatile l d;

    l(int n2, Object object, Object object2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    l(int n2, Object object, Object object2, l l2) {
        this(n2, object, object2);
        this.d = l2;
    }

    l a(int n2, Object object) {
        Object object2;
        Object object3 = this;
        do {
            if (((l)object3).a == n2 && ((object2 = ((l)object3).b) == object || object2 != null && object.equals(object2))) {
                return object3;
            }
            object3 = object2 = ((l)object3).d;
        } while (object2 != null);
        return null;
    }

    @Override
    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = !(!(object instanceof Map.Entry) || (object3 = (object = (Map.Entry)object).getKey()) == null || (object = object.getValue()) == null || object3 != (object2 = this.b) && !object3.equals(object2) || object != (object3 = this.c) && !object.equals(object3));
        return bl2;
    }

    public final Object getKey() {
        return this.b;
    }

    public final Object getValue() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return n.b(this.b, this.c);
    }
}

