/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.C;
import j$.time.chrono.D;
import j$.time.chrono.F;
import j$.time.chrono.G;
import j$.time.chrono.b_0;
import j$.time.chrono.d_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.i_0;
import j$.time.chrono.n;
import j$.time.chrono.o;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.p;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class E
extends d_0 {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient g a;

    E(g g2) {
        Objects.requireNonNull(g2, "isoDate");
        this.a = g2;
    }

    private int O() {
        return this.a.P() - 1911;
    }

    private E Q(g b_02) {
        b_02 = b_02.equals(this.a) ? this : new E((g)b_02);
        return b_02;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G(7, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            int n2 = D.a[((a)p2).ordinal()];
            int n3 = 1;
            if (n2 != 4) {
                g g2 = this.a;
                if (n2 != 5) {
                    if (n2 != 6) {
                        if (n2 != 7) {
                            return g2.B(p2);
                        }
                        if (this.O() < 1) {
                            n3 = 0;
                        }
                        return n3;
                    }
                    return this.O();
                }
                return (long)this.O() * 12L + (long)g2.O() - 1L;
            }
            n3 = this.O();
            if (n3 < 1) {
                n3 = 1 - n3;
            }
            return n3;
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
        F f2 = this.O() >= 1 ? F.ROC : F.BEFORE_ROC;
        return f2;
    }

    @Override
    final b_0 K(long l2) {
        return this.Q(this.a.X(l2));
    }

    @Override
    final b_0 L(long l2) {
        return this.Q(this.a.Y(l2));
    }

    @Override
    final b_0 M(long l2) {
        return this.Q(this.a.Z(l2));
    }

    @Override
    public final b_0 N(j$.time.temporal.n n2) {
        return (E)super.N(n2);
    }

    public final E P(long l2, p p2) {
        block4: {
            int n2;
            g g2;
            int n3;
            block8: {
                block9: {
                    block10: {
                        block7: {
                            int[] nArray;
                            a a2;
                            block5: {
                                block6: {
                                    if (!(p2 instanceof a)) break block4;
                                    a2 = (a)p2;
                                    if (this.B(a2) == l2) {
                                        return this;
                                    }
                                    nArray = D.a;
                                    n3 = nArray[a2.ordinal()];
                                    g2 = this.a;
                                    if (n3 == 4) break block5;
                                    if (n3 == 5) break block6;
                                    if (n3 == 6 || n3 == 7) break block5;
                                    break block7;
                                }
                                C.d.q(a2).b(l2, a2);
                                return this.Q(g2.Y(l2 - ((long)this.O() * 12L + (long)g2.O() - 1L)));
                            }
                            n2 = C.d.q(a2).a(l2, a2);
                            n3 = nArray[a2.ordinal()];
                            if (n3 == 4) break block8;
                            if (n3 == 6) break block9;
                            if (n3 == 7) break block10;
                        }
                        return this.Q(g2.b0(l2, p2));
                    }
                    return this.Q(g2.e0(1912 - this.O()));
                }
                return this.Q(g2.e0(n2 + 1911));
            }
            n3 = this.O() >= 1 ? n2 + 1911 : 1912 - n2;
            return this.Q(g2.e0(n3));
        }
        return (E)super.d(l2, p2);
    }

    @Override
    public final n a() {
        return C.d;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof E) {
            object = (E)object;
            return this.a.equals(((E)object).a);
        }
        return false;
    }

    @Override
    public final b_0 f(long l2, TemporalUnit temporalUnit) {
        return (E)super.f(l2, temporalUnit);
    }

    @Override
    public final j$.time.temporal.k f(long l2, TemporalUnit temporalUnit) {
        return (E)super.f(l2, temporalUnit);
    }

    @Override
    public final int hashCode() {
        C.d.getClass();
        return this.a.hashCode() ^ 0x89605DCF;
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit chronoUnit) {
        return (E)super.v(l2, chronoUnit);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return (E)super.N(g2);
    }

    @Override
    public final t t(p object) {
        if (object instanceof a) {
            if (i_0.h(this, (p)object)) {
                a a2 = (a)object;
                int n2 = D.a[a2.ordinal()];
                if (n2 != 1 && n2 != 2 && n2 != 3) {
                    if (n2 != 4) {
                        return C.d.q(a2);
                    }
                    object = j$.time.temporal.a.YEAR.m();
                    long l2 = this.O() <= 0 ? -((t)object).e() + 1912L : ((t)object).d() - 1911L;
                    return t.j(1L, l2);
                }
                return this.a.t((p)object);
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
        }
        return object.t(this);
    }

    @Override
    public final b_0 v(long l2, TemporalUnit temporalUnit) {
        return (E)super.v(l2, temporalUnit);
    }
}

