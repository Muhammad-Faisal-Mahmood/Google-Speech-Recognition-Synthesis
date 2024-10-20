/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Set;
import j$.util.d_0;

/*
 * Renamed from j$.util.h
 */
final class h_0
extends d_0
implements java.util.Set,
Set {
    private static final long serialVersionUID = 487447009682186044L;

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
    @Override
    public final int hashCode() {
        Object object = this.b;
        synchronized (object) {
            return this.a.hashCode();
        }
    }
}

