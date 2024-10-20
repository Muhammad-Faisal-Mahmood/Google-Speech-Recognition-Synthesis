/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.g;
import j$.time.temporal.a;
import j$.time.temporal.f;
import j$.time.temporal.h;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;

final class e
extends f {
    @Override
    public final long g(m m2) {
        if (this.p(m2)) {
            return f.J(g.K(m2));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    @Override
    public final t m() {
        return a.YEAR.m();
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
        if (this.p(k2)) {
            int n2;
            int n3 = a.YEAR.m().a(l2, f.WEEK_BASED_YEAR);
            g g2 = g.K(k2);
            a a2 = a.DAY_OF_WEEK;
            int n4 = g2.p(a2);
            int n5 = n2 = f.I(g2);
            if (n2 == 53) {
                n5 = n2;
                if (f.K(n3) == 52) {
                    n5 = 52;
                }
            }
            g2 = g.T(n3, 1, 4);
            return k2.s(g2.X((n5 - 1) * 7 + (n4 - g2.p(a2))));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    @Override
    public final t t(m m2) {
        if (this.p(m2)) {
            return this.m();
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    public final String toString() {
        return "WeekBasedYear";
    }
}

