/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.A;
import j$.time.chrono.G;
import j$.time.chrono.b_0;
import j$.time.chrono.d_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.n;
import j$.time.chrono.o;
import j$.time.chrono.x;
import j$.time.chrono.y;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.p;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class z
extends d_0 {
    static final g d = g.T(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient g a;
    private transient A b;
    private transient int c;

    z(g g2) {
        if (!g2.Q(d)) {
            A a2;
            this.b = a2 = A.k(g2);
            this.c = g2.P() - a2.q().P() + 1;
            this.a = g2;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }

    private z P(g b_02) {
        b_02 = b_02.equals(this.a) ? this : new z((g)b_02);
        return b_02;
    }

    private z Q(A a2, int n2) {
        x.d.getClass();
        if (a2 instanceof A) {
            int n3 = a2.q().P() + n2 - 1;
            if (n2 == 1 || n3 >= -999999999 && n3 <= 999999999 && n3 >= a2.q().P() && a2 == A.k(g.T(n3, 1, 1))) {
                return this.P(this.a.e0(n3));
            }
            throw new RuntimeException("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G(4, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            int n2 = y.a[((a)p2).ordinal()];
            int n3 = this.c;
            A a2 = this.b;
            g g2 = this.a;
            switch (n2) {
                default: {
                    return g2.B(p2);
                }
                case 8: {
                    return a2.getValue();
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                }
                case 3: {
                    return n3;
                }
                case 2: 
            }
            if (n3 == 1) {
                return g2.N() - a2.q().N() + 1;
            }
            return g2.N();
        }
        return p2.g(this);
    }

    @Override
    public final long C() {
        return this.a.C();
    }

    @Override
    public final e_0 E(k k2) {
        return g_0.J(this, k2);
    }

    @Override
    public final o J() {
        return this.b;
    }

    @Override
    final b_0 K(long l2) {
        return this.P(this.a.X(l2));
    }

    @Override
    final b_0 L(long l2) {
        return this.P(this.a.Y(l2));
    }

    @Override
    final b_0 M(long l2) {
        return this.P(this.a.Z(l2));
    }

    @Override
    public final b_0 N(j$.time.temporal.n n2) {
        return (z)super.N(n2);
    }

    public final z O(long l2, p p2) {
        block4: {
            int n2;
            block6: {
                block7: {
                    g g2;
                    block8: {
                        block5: {
                            if (!(p2 instanceof a)) break block4;
                            a a2 = (a)p2;
                            if (this.B(a2) == l2) {
                                return this;
                            }
                            int[] nArray = y.a;
                            n2 = nArray[a2.ordinal()];
                            g2 = this.a;
                            if (n2 != 3 && n2 != 8 && n2 != 9) break block5;
                            n2 = x.d.q(a2).a(l2, a2);
                            int n3 = nArray[a2.ordinal()];
                            if (n3 == 3) break block6;
                            if (n3 == 8) break block7;
                            if (n3 == 9) break block8;
                        }
                        return this.P(g2.b0(l2, p2));
                    }
                    return this.P(g2.e0(n2));
                }
                return this.Q(A.u(n2), this.c);
            }
            return this.Q(this.b, n2);
        }
        return (z)super.d(l2, p2);
    }

    @Override
    public final n a() {
        return x.d;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2;
        a a2 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        boolean bl3 = bl2 = false;
        if (p2 != a2) {
            bl3 = bl2;
            if (p2 != j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR) {
                bl3 = bl2;
                if (p2 != j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH) {
                    if (p2 == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
                        bl3 = bl2;
                    } else {
                        if (p2 instanceof a) {
                            return ((a)p2).B();
                        }
                        bl3 = bl2;
                        if (p2 != null) {
                            bl3 = bl2;
                            if (p2.p(this)) {
                                bl3 = true;
                            }
                        }
                    }
                }
            }
        }
        return bl3;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof z) {
            object = (z)object;
            return this.a.equals(((z)object).a);
        }
        return false;
    }

    @Override
    public final b_0 f(long l2, TemporalUnit temporalUnit) {
        return (z)super.f(l2, temporalUnit);
    }

    @Override
    public final j$.time.temporal.k f(long l2, TemporalUnit temporalUnit) {
        return (z)super.f(l2, temporalUnit);
    }

    @Override
    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ 0xD6FCA3D1;
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit chronoUnit) {
        return (z)super.v(l2, chronoUnit);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return (z)super.N(g2);
    }

    @Override
    public final t t(p object) {
        if (object instanceof a) {
            if (this.e((p)object)) {
                int n2 = y.a[((Enum)(object = (a)object)).ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            return x.d.q((a)object);
                        }
                        object = this.b;
                        n2 = ((A)object).q().P();
                        if ((object = ((A)object).r()) != null) {
                            return t.j(1L, ((A)object).q().P() - n2 + 1);
                        }
                        return t.j(1L, 999999999 - n2);
                    }
                    return t.j(1L, this.x());
                }
                return t.j(1L, this.a.R());
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
        }
        return object.t(this);
    }

    @Override
    public final b_0 v(long l2, TemporalUnit temporalUnit) {
        return (z)super.v(l2, temporalUnit);
    }

    @Override
    public final int x() {
        A a2 = this.b;
        A a3 = a2.r();
        g g2 = this.a;
        int n2 = a3 != null && a3.q().P() == g2.P() ? a3.q().N() - 1 : g2.x();
        int n3 = n2;
        if (this.c == 1) {
            n3 = n2 - (a2.q().N() - 1);
        }
        return n3;
    }
}

