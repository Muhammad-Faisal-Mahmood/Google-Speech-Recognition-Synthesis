/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.e_0;
import java.util.List;
import java.util.RandomAccess;

/*
 * Renamed from j$.util.g
 */
final class g_0
extends e_0
implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new e_0(this.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List subList(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            return new e_0(this.c.subList(n2, n3), this.b);
        }
    }
}

