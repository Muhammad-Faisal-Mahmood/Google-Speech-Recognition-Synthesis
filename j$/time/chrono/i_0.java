/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.j_0;
import j$.time.chrono.k;
import j$.time.chrono.n;
import j$.time.chrono.o;
import j$.time.chrono.u;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.x;
import j$.util.Objects;

/*
 * Renamed from j$.time.chrono.i
 */
public abstract class i_0 {
    public static j$.time.temporal.k a(b_0 b_02, j$.time.temporal.k k2) {
        a a2 = a.EPOCH_DAY;
        return k2.d(b_02.C(), a2);
    }

    public static int b(b_0 comparable, b_0 comparable2) {
        int n2;
        int n3 = n2 = Long.compare(comparable.C(), comparable2.C());
        if (n2 == 0) {
            comparable = comparable.a();
            comparable2 = comparable2.a();
            n3 = ((a_0)comparable).l().compareTo(comparable2.l());
        }
        return n3;
    }

    public static int c(e_0 comparable, e_0 comparable2) {
        int n2;
        int n3 = n2 = comparable.c().A(comparable2.c());
        if (n2 == 0) {
            n3 = n2 = comparable.b().I(comparable2.b());
            if (n2 == 0) {
                comparable = comparable.a();
                comparable2 = comparable2.a();
                n3 = ((a_0)comparable).l().compareTo(comparable2.l());
            }
        }
        return n3;
    }

    public static int d(k comparable, k comparable2) {
        int n2;
        int n3 = n2 = Long.compare(comparable.H(), comparable2.H());
        if (n2 == 0) {
            n3 = n2 = comparable.b().N() - comparable2.b().N();
            if (n2 == 0) {
                n3 = n2 = comparable.n().j(comparable2.n());
                if (n2 == 0) {
                    n3 = n2 = comparable.y().l().compareTo(comparable2.y().l());
                    if (n2 == 0) {
                        comparable = comparable.a();
                        comparable2 = comparable2.a();
                        n3 = ((a_0)comparable).l().compareTo(comparable2.l());
                    }
                }
            }
        }
        return n3;
    }

    public static int e(k k2, p p2) {
        if (p2 instanceof a) {
            int n2 = j_0.a[((a)p2).ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    return k2.n().p(p2);
                }
                return k2.h().O();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return l.a(k2, p2);
    }

    public static int f(o o2, a a2) {
        if (a2 == a.ERA) {
            return o2.getValue();
        }
        return l.a(o2, a2);
    }

    public static long g(o o2, p p2) {
        if (p2 == a.ERA) {
            return o2.getValue();
        }
        if (!(p2 instanceof a)) {
            return p2.g(o2);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    public static boolean h(b_0 b_02, p p2) {
        if (p2 instanceof a) {
            return ((a)p2).B();
        }
        boolean bl2 = p2 != null && p2.p(b_02);
        return bl2;
    }

    public static boolean i(o o2, p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            if (p2 == a.ERA) {
                bl4 = true;
            }
            return bl4;
        }
        bl4 = bl3;
        if (p2 != null) {
            bl4 = bl3;
            if (p2.p(o2)) {
                bl4 = true;
            }
        }
        return bl4;
    }

    public static Object j(b_0 b_02, r r2) {
        if (r2 != l.k() && r2 != l.j() && r2 != l.h()) {
            if (r2 == l.g()) {
                return null;
            }
            if (r2 == l.e()) {
                return b_02.a();
            }
            if (r2 == l.i()) {
                return ChronoUnit.DAYS;
            }
            return r2.a(b_02);
        }
        return null;
    }

    public static Object k(e_0 e_02, r r2) {
        if (r2 != l.k() && r2 != l.j() && r2 != l.h()) {
            if (r2 == l.g()) {
                return e_02.b();
            }
            if (r2 == l.e()) {
                return e_02.a();
            }
            if (r2 == l.i()) {
                return ChronoUnit.NANOS;
            }
            return r2.a(e_02);
        }
        return null;
    }

    public static Object l(k k2, r r2) {
        if (r2 != l.j() && r2 != l.k()) {
            if (r2 == l.h()) {
                return k2.h();
            }
            if (r2 == l.g()) {
                return k2.b();
            }
            if (r2 == l.e()) {
                return k2.a();
            }
            if (r2 == l.i()) {
                return ChronoUnit.NANOS;
            }
            return r2.a(k2);
        }
        return k2.y();
    }

    public static Object m(o o2, r r2) {
        if (r2 == l.i()) {
            return ChronoUnit.ERAS;
        }
        return l.c(o2, r2);
    }

    public static long n(e_0 e_02, x x2) {
        Objects.requireNonNull(x2, "offset");
        return e_02.c().C() * 86400L + (long)e_02.b().Z() - (long)x2.O();
    }

    public static long o(k k2) {
        return k2.c().C() * 86400L + (long)k2.b().Z() - (long)k2.h().O();
    }

    public static n p(m object) {
        Objects.requireNonNull(object, "temporal");
        object = (n)object.F(l.e());
        u u2 = u.d;
        if (object == null) {
            object = Objects.requireNonNull(u2, "defaultObj");
        }
        return (n)object;
    }
}

