/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.concurrent.q;

/*
 * Renamed from j$.util.concurrent.a
 */
abstract class a_0
extends q {
    final ConcurrentHashMap i;
    l j;

    a_0(l[] lArray, int n2, int n3, ConcurrentHashMap concurrentHashMap) {
        super(lArray, n2, 0, n3);
        this.i = concurrentHashMap;
        this.c();
    }

    public final boolean hasMoreElements() {
        boolean bl2 = this.b != null;
        return bl2;
    }

    public final boolean hasNext() {
        boolean bl2 = this.b != null;
        return bl2;
    }

    public final void remove() {
        l l2 = this.j;
        if (l2 != null) {
            this.j = null;
            this.i.g(l2.b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}

