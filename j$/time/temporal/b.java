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

final class b
extends f {
    @Override
    public final long g(m object) {
        if (this.p((m)object)) {
            int n2 = object.p(a.DAY_OF_YEAR);
            int n3 = object.p(a.MONTH_OF_YEAR);
            long l2 = object.B(a.YEAR);
            object = f.F();
            int n4 = (n3 - 1) / 3;
            n3 = u.d.D(l2) ? 4 : 0;
            return n2 - object[n4 + n3];
        }
        throw new RuntimeException("Unsupported field: DayOfQuarter");
    }

    @Override
    public final t m() {
        return t.k(1L, 90L, 92L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean p(m m2) {
        if (!m2.e(a.DAY_OF_YEAR)) return false;
        if (!m2.e(a.MONTH_OF_YEAR)) return false;
        if (!m2.e(a.YEAR)) return false;
        p p2 = h.a;
        if (!i_0.p(m2).equals(u.d)) return false;
        return true;
    }

    @Override
    public final k s(k k2, long l2) {
        long l3 = this.g(k2);
        this.m().b(l2, this);
        a a2 = a.DAY_OF_YEAR;
        return k2.d(l2 - l3 + k2.B(a2), a2);
    }

    @Override
    public final t t(m object) {
        if (this.p((m)object)) {
            long l2 = object.B(f.QUARTER_OF_YEAR);
            if (l2 == 1L) {
                l2 = object.B(a.YEAR);
                object = u.d.D(l2) ? t.j(1L, 91L) : t.j(1L, 90L);
                return object;
            }
            if (l2 == 2L) {
                return t.j(1L, 91L);
            }
            if (l2 != 3L && l2 != 4L) {
                return this.m();
            }
            return t.j(1L, 92L);
        }
        throw new RuntimeException("Unsupported field: DayOfQuarter");
    }

    public final String toString() {
        return "DayOfQuarter";
    }
}

