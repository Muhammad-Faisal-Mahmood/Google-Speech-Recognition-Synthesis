/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.g;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.f;
import j$.time.temporal.h;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;

final class d
extends f {
    @Override
    public final long g(m m2) {
        if (this.p(m2)) {
            return f.I(g.K(m2));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
    }

    @Override
    public final t m() {
        return t.k(1L, 52L, 53L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean p(m m2) {
        if (!m2.e(a.EPOCH_DAY)) return false;
        p p2 = h.a;
        if (!i_0.p(m2).equals(u.d)) return false;
        return true;
    }

    @Override
    public final k s(k k2, long l2) {
        this.m().b(l2, this);
        return k2.f(j$.nio.file.attribute.a.k(l2, this.g(k2)), ChronoUnit.WEEKS);
    }

    @Override
    public final t t(m m2) {
        if (this.p(m2)) {
            return f.L(g.K(m2));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
    }

    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}

