/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.nio.file.attribute.a;
import j$.time.chrono.G;
import j$.time.chrono.b_0;
import j$.time.chrono.d_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.i_0;
import j$.time.chrono.n;
import j$.time.chrono.o;
import j$.time.chrono.q;
import j$.time.chrono.r;
import j$.time.chrono.t;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s
extends d_0 {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient q a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private s(q q2, int n2, int n3, int n4) {
        q2.I(n2, n3, n4);
        this.a = q2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    private s(q q2, long l2) {
        int[] nArray = q2.J((int)l2);
        this.a = q2;
        this.b = nArray[0];
        this.c = nArray[1];
        this.d = nArray[2];
    }

    private int O() {
        int n2 = this.c;
        return this.a.F(this.b, n2) + this.d;
    }

    static s P(q q2, int n2, int n3, int n4) {
        return new s(q2, n2, n3, n4);
    }

    static s Q(q q2, long l2) {
        return new s(q2, l2);
    }

    private s T(int n2, int n3, int n4) {
        q q2 = this.a;
        int n5 = q2.K(n2, n3);
        int n6 = n4;
        if (n4 > n5) {
            n6 = n5;
        }
        return new s(q2, n2, n3, n6);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G(6, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof j$.time.temporal.a) {
            int n2 = r.a[((j$.time.temporal.a)p2).ordinal()];
            int n3 = this.c;
            int n4 = 1;
            int n5 = this.d;
            int n6 = this.b;
            switch (n2) {
                default: {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                }
                case 13: {
                    if (n6 <= 1) {
                        n4 = 0;
                    }
                    return n4;
                }
                case 12: {
                    return n6;
                }
                case 11: {
                    return n6;
                }
                case 10: {
                    return (long)n6 * 12L + (long)n3 - 1L;
                }
                case 9: {
                    return n3;
                }
                case 8: {
                    return (this.O() - 1) / 7 + 1;
                }
                case 7: {
                    return this.C();
                }
                case 6: {
                    return (this.O() - 1) % 7 + 1;
                }
                case 5: {
                    return (n5 - 1) % 7 + 1;
                }
                case 4: {
                    return (int)j$.nio.file.attribute.a.h(this.C() + 3L, 7) + 1;
                }
                case 3: {
                    return (n5 - 1) / 7 + 1;
                }
                case 2: {
                    return this.O();
                }
                case 1: 
            }
            return n5;
        }
        return p2.g(this);
    }

    @Override
    public final long C() {
        int n2 = this.c;
        int n3 = this.d;
        return this.a.I(this.b, n2, n3);
    }

    @Override
    public final e_0 E(k k2) {
        return g_0.J(this, k2);
    }

    @Override
    public final o J() {
        return t.AH;
    }

    @Override
    final b_0 M(long l2) {
        block4: {
            s s2;
            block3: {
                block2: {
                    if (l2 != 0L) break block2;
                    s2 = this;
                    break block3;
                }
                int n2 = (int)l2;
                l2 = (long)this.b + (long)n2;
                if (l2 != (long)(n2 = (int)l2)) break block4;
                s2 = this.T(n2, this.c, this.d);
            }
            return s2;
        }
        throw new ArithmeticException();
    }

    @Override
    public final b_0 N(j$.time.temporal.n n2) {
        return (s)super.N(n2);
    }

    final s R(long l2) {
        long l3 = this.C();
        return new s(this.a, l3 + l2);
    }

    final s S(long l2) {
        if (l2 == 0L) {
            return this;
        }
        l2 = (long)this.b * 12L + (long)(this.c - 1) + l2;
        return this.T(this.a.s(j$.nio.file.attribute.a.f(l2, 12L)), (int)j$.nio.file.attribute.a.h(l2, 12L) + 1, this.d);
    }

    public final s U(long l2, p p2) {
        if (p2 instanceof j$.time.temporal.a) {
            j$.time.temporal.a a2 = (j$.time.temporal.a)p2;
            q q2 = this.a;
            q2.q(a2).b(l2, a2);
            int n2 = (int)l2;
            int n3 = r.a[a2.ordinal()];
            int n4 = this.d;
            int n5 = this.c;
            int n6 = this.b;
            switch (n3) {
                default: {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                }
                case 13: {
                    return this.T(1 - n6, n5, n4);
                }
                case 12: {
                    return this.T(n2, n5, n4);
                }
                case 11: {
                    if (n6 < 1) {
                        n2 = 1 - n2;
                    }
                    return this.T(n2, n5, n4);
                }
                case 10: {
                    return this.S(l2 - ((long)n6 * 12L + (long)n5 - 1L));
                }
                case 9: {
                    return this.T(n6, n2, n4);
                }
                case 8: {
                    return this.R((l2 - this.B(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7L);
                }
                case 7: {
                    return new s(q2, l2);
                }
                case 6: {
                    return this.R(l2 - this.B(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                }
                case 5: {
                    return this.R(l2 - this.B(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                }
                case 4: {
                    return this.R(l2 - (long)((int)j$.nio.file.attribute.a.h(this.C() + 3L, 7) + 1));
                }
                case 3: {
                    return this.R((l2 - this.B(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7L);
                }
                case 2: {
                    return this.R(Math.min(n2, this.x()) - this.O());
                }
                case 1: 
            }
            return this.T(n6, n5, n2);
        }
        return (s)super.d(l2, p2);
    }

    @Override
    public final n a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof s) {
            object = (s)object;
            int n2 = ((s)object).b;
            if (this.b != n2 || this.c != ((s)object).c || this.d != ((s)object).d || !this.a.equals(((s)object).a)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final b_0 f(long l2, TemporalUnit temporalUnit) {
        return (s)super.f(l2, temporalUnit);
    }

    @Override
    public final j$.time.temporal.k f(long l2, TemporalUnit temporalUnit) {
        return (s)super.f(l2, temporalUnit);
    }

    @Override
    public final int hashCode() {
        int n2 = this.a.l().hashCode();
        int n3 = this.b;
        return n2 ^ n3 & 0xFFFFF800 ^ (n3 << 11) + (this.c << 6) + this.d;
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit chronoUnit) {
        return (s)super.v(l2, chronoUnit);
    }

    @Override
    public final boolean o() {
        long l2 = this.b;
        return this.a.D(l2);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return (s)super.N(g2);
    }

    @Override
    public final j$.time.temporal.t t(p object) {
        if (object instanceof j$.time.temporal.a) {
            if (i_0.h(this, (p)object)) {
                j$.time.temporal.a a2 = (j$.time.temporal.a)object;
                int n2 = r.a[a2.ordinal()];
                object = this.a;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            return ((q)object).q(a2);
                        }
                        return j$.time.temporal.t.j(1L, 5L);
                    }
                    return j$.time.temporal.t.j(1L, this.x());
                }
                return j$.time.temporal.t.j(1L, ((q)object).K(this.b, this.c));
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
        }
        return object.t(this);
    }

    @Override
    public final b_0 v(long l2, TemporalUnit temporalUnit) {
        return (s)super.v(l2, temporalUnit);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override
    public final int x() {
        return this.a.L(this.b);
    }
}

