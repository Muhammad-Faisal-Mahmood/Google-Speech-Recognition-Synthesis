/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.temporal.a;
import j$.time.temporal.f;
import j$.time.temporal.h;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;

final class c
extends f {
    @Override
    public final long g(m m2) {
        if (this.p(m2)) {
            return (m2.B(a.MONTH_OF_YEAR) + 2L) / 3L;
        }
        throw new RuntimeException("Unsupported field: QuarterOfYear");
    }

    @Override
    public final t m() {
        return t.j(1L, 4L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean p(m m2) {
        if (!m2.e(a.MONTH_OF_YEAR)) return false;
        p p2 = h.a;
        if (!i_0.p(m2).equals(u.d)) return false;
        return true;
    }

    @Override
    public final k s(k k2, long l2) {
        long l3 = this.g(k2);
        this.m().b(l2, this);
        a a2 = a.MONTH_OF_YEAR;
        return k2.d((l2 - l3) * 3L + k2.B(a2), a2);
    }

    @Override
    public final t t(m m2) {
        if (this.p(m2)) {
            return this.m();
        }
        throw new RuntimeException("Unsupported field: QuarterOfYear");
    }

    public final String toString() {
        return "QuarterOfYear";
    }
}

