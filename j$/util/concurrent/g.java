/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;

final class g
extends l {
    final l[] e;

    g(l[] lArray) {
        super(-1, null, null);
        this.e = lArray;
    }

    @Override
    final l a(int n2, Object object) {
        int n3;
        Object object2 = this.e;
        block0: while ((n3 = ((l[])object2).length) != 0) {
            Object object3 = ConcurrentHashMap.k(object2, n3 - 1 & n2);
            object2 = object3;
            if (object3 == null) break;
            do {
                if ((n3 = object2.a) == n2 && ((object3 = object2.b) == object || object3 != null && object.equals(object3))) {
                    return object2;
                }
                if (n3 < 0) {
                    if (object2 instanceof g) {
                        object2 = ((g)object2).e;
                        continue block0;
                    }
                    return object2.a(n2, object);
                }
                object3 = object2.d;
                object2 = object3;
            } while (object3 != null);
        }
        return null;
    }
}

