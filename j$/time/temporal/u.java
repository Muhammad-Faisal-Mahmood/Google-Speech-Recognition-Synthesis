/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.chrono.i_0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.h;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.t;
import j$.time.temporal.v;

final class u
implements p {
    private static final t f = t.j(1L, 7L);
    private static final t g = t.k(0L, 4L, 6L);
    private static final t h = t.k(0L, 52L, 54L);
    private static final t i = t.k(1L, 52L, 53L);
    private final String a;
    private final v b;
    private final Enum c;
    private final Enum d;
    private final t e;

    private u(String string, v v2, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, t t2) {
        this.a = string;
        this.b = v2;
        this.c = (Enum)((Object)temporalUnit);
        this.d = (Enum)((Object)temporalUnit2);
        this.e = t2;
    }

    private static int a(int n2, int n3) {
        return (n3 - 1 + (n2 + 7)) / 7;
    }

    private int b(m m2) {
        int n2 = this.b.d().getValue();
        int n3 = m2.p(j$.time.temporal.a.DAY_OF_WEEK) - n2;
        n2 = n3 % 7;
        if (n2 == 0) {
            n2 = 0;
        } else if (((n3 ^ 7) >> 31 | 1) <= 0) {
            n2 += 7;
        }
        return n2 + 1;
    }

    private int c(m m2) {
        int n2 = this.b(m2);
        a a2 = j$.time.temporal.a.DAY_OF_YEAR;
        int n3 = m2.p(a2);
        int n4 = this.k(n3, n2);
        n2 = u.a(n4, n3);
        if (n2 == 0) {
            return this.c(i_0.p(m2).r(m2).v(n3, ChronoUnit.DAYS));
        }
        n3 = n2;
        if (n2 > 50) {
            n3 = (int)m2.t(a2).d();
            n4 = u.a(n4, this.b.e() + n3);
            n3 = n2;
            if (n2 >= n4) {
                n3 = n2 - n4 + 1;
            }
        }
        return n3;
    }

    static u d(v v2) {
        return new u("DayOfWeek", v2, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    static u e(v v2) {
        return new u("WeekBasedYear", v2, j$.time.temporal.h.d, ChronoUnit.FOREVER, j$.time.temporal.a.YEAR.m());
    }

    static u f(v v2) {
        return new u("WeekOfMonth", v2, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    static u h(v v2) {
        return new u("WeekOfWeekBasedYear", v2, ChronoUnit.WEEKS, j$.time.temporal.h.d, i);
    }

    private t i(m object, a a2) {
        int n2 = this.b((m)object);
        n2 = this.k(object.p(a2), n2);
        object = object.t(a2);
        return t.j(u.a(n2, (int)((t)object).e()), u.a(n2, (int)((t)object).d()));
    }

    private t j(m m2) {
        a a2 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!m2.e(a2)) {
            return h;
        }
        int n2 = this.b(m2);
        int n3 = m2.p(a2);
        int n4 = this.k(n3, n2);
        n2 = u.a(n4, n3);
        if (n2 == 0) {
            return this.j(i_0.p(m2).r(m2).v(n3 + 7, ChronoUnit.DAYS));
        }
        int n5 = (int)m2.t(a2).d();
        if (n2 >= (n4 = u.a(n4, this.b.e() + n5))) {
            return this.j(i_0.p(m2).r(m2).f(n5 - n3 + 8, ChronoUnit.DAYS));
        }
        return t.j(1L, n4 - 1);
    }

    private int k(int n2, int n3) {
        if ((n2 = (n3 = n2 - n3) % 7) == 0) {
            n2 = 0;
        } else if (((n3 ^ 7) >> 31 | 1) <= 0) {
            n2 += 7;
        }
        n3 = -n2;
        if (n2 + 1 > this.b.e()) {
            n3 = 7 - n2;
        }
        return n3;
    }

    @Override
    public final boolean B() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long g(m object) {
        int n2;
        Object object2 = this.d;
        Object object3 = ChronoUnit.WEEKS;
        if (object2 == object3) {
            n2 = this.b((m)object);
            return n2;
        }
        if (object2 == ChronoUnit.MONTHS) {
            int n3 = this.b((m)object);
            int n4 = object.p(j$.time.temporal.a.DAY_OF_MONTH);
            return u.a(this.k(n4, n3), n4);
        }
        if (object2 == ChronoUnit.YEARS) {
            int n5 = this.b((m)object);
            int n6 = object.p(j$.time.temporal.a.DAY_OF_YEAR);
            return u.a(this.k(n6, n5), n6);
        }
        if (object2 == v.h) {
            n2 = this.c((m)object);
            return n2;
        }
        if (object2 == ChronoUnit.FOREVER) {
            int n7 = this.b((m)object);
            int n8 = object.p(j$.time.temporal.a.YEAR);
            object3 = j$.time.temporal.a.DAY_OF_YEAR;
            int n9 = object.p((p)object3);
            n7 = this.k(n9, n7);
            int n10 = u.a(n7, n9);
            if (n10 == 0) {
                n9 = n8 - 1;
                return n9;
            } else {
                int n11 = (int)object.t((p)object3).d();
                n9 = n8;
                if (n10 < u.a(n7, this.b.e() + n11)) return n9;
                n9 = n8 + 1;
            }
            return n9;
        }
        object2 = String.valueOf(object2);
        object3 = String.valueOf(this);
        object = new StringBuilder("unreachable, rangeUnit: ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", this: ");
        ((StringBuilder)object).append((String)object3);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    @Override
    public final t m() {
        return this.e;
    }

    @Override
    public final boolean p(m m2) {
        if (m2.e(j$.time.temporal.a.DAY_OF_WEEK)) {
            Enum enum_ = this.d;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            if (enum_ == chronoUnit) {
                return true;
            }
            if (enum_ == ChronoUnit.MONTHS) {
                return m2.e(j$.time.temporal.a.DAY_OF_MONTH);
            }
            if (enum_ == ChronoUnit.YEARS) {
                return m2.e(j$.time.temporal.a.DAY_OF_YEAR);
            }
            if (enum_ == v.h) {
                return m2.e(j$.time.temporal.a.DAY_OF_YEAR);
            }
            if (enum_ == ChronoUnit.FOREVER) {
                return m2.e(j$.time.temporal.a.YEAR);
            }
        }
        return false;
    }

    @Override
    public final k s(k k2, long l2) {
        int n2;
        int n3 = this.e.a(l2, this);
        if (n3 == (n2 = k2.p(this))) {
            return k2;
        }
        if (this.d == ChronoUnit.FOREVER) {
            v v2 = this.b;
            int n4 = k2.p(v.a(v2));
            n2 = k2.p(v.b(v2));
            k2 = i_0.p(k2).k((int)l2);
            n3 = this.k(1, this.b(k2));
            int n5 = k2.x();
            return k2.f((Math.min(n2, u.a(n3, v2.e() + n5) - 1) - 1) * 7 + (n4 - 1 + -n3), ChronoUnit.DAYS);
        }
        return k2.f(n3 - n2, (TemporalUnit)((Object)this.c));
    }

    @Override
    public final t t(m object) {
        Object object2 = this.d;
        Object object3 = ChronoUnit.WEEKS;
        if (object2 == object3) {
            return this.e;
        }
        if (object2 == ChronoUnit.MONTHS) {
            return this.i((m)object, j$.time.temporal.a.DAY_OF_MONTH);
        }
        if (object2 == ChronoUnit.YEARS) {
            return this.i((m)object, j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (object2 == v.h) {
            return this.j((m)object);
        }
        if (object2 == ChronoUnit.FOREVER) {
            return j$.time.temporal.a.YEAR.m();
        }
        object = String.valueOf(object2);
        object3 = String.valueOf(this);
        object2 = new StringBuilder("unreachable, rangeUnit: ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(", this: ");
        ((StringBuilder)object2).append((String)object3);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

