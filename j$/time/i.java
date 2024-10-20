/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.ZonedDateTime;
import j$.time.c;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.i_0;
import j$.time.g;
import j$.time.h;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class i
implements k,
n,
e_0,
Serializable {
    public static final i c = i.Q(g.d, j$.time.k.e);
    public static final i d = i.Q(g.e, j$.time.k.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final g a;
    private final j$.time.k b;

    private i(g g2, j$.time.k k2) {
        this.a = g2;
        this.b = k2;
    }

    private int I(i i2) {
        int n2;
        g g2 = i2.a;
        int n3 = n2 = this.a.I(g2);
        if (n2 == 0) {
            n3 = this.b.I(i2.b);
        }
        return n3;
    }

    public static i J(m object) {
        if (object instanceof i) {
            return (i)object;
        }
        if (object instanceof ZonedDateTime) {
            return ((ZonedDateTime)object).M();
        }
        if (object instanceof j$.time.p) {
            return ((j$.time.p)object).L();
        }
        try {
            i i2 = new i(g.K((m)object), j$.time.k.K((m)object));
            return i2;
        }
        catch (c c2) {
            String string = String.valueOf(object);
            String string2 = object.getClass().getName();
            object = new StringBuilder("Unable to obtain LocalDateTime from TemporalAccessor: ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" of type ");
            ((StringBuilder)object).append(string2);
            throw new RuntimeException(((StringBuilder)object).toString(), c2);
        }
    }

    public static i P(int n2) {
        return new i(g.T(n2, 12, 31), j$.time.k.P(0));
    }

    public static i Q(g g2, j$.time.k k2) {
        Objects.requireNonNull(g2, "date");
        Objects.requireNonNull(k2, "time");
        return new i(g2, k2);
    }

    public static i R(long l2, int n2, x x2) {
        Objects.requireNonNull(x2, "offset");
        a a2 = j$.time.temporal.a.NANO_OF_SECOND;
        long l3 = n2;
        a2.I(l3);
        long l4 = l2 + (long)x2.O();
        l2 = 86400;
        long l5 = j$.nio.file.attribute.a.f(l4, l2);
        n2 = (int)j$.nio.file.attribute.a.h(l4, l2);
        return new i(g.V(l5), j$.time.k.Q((long)n2 * 1000000000L + l3));
    }

    private i U(g g2, long l2, long l3, long l4, long l5) {
        j$.time.k k2 = this.b;
        if ((l2 | l3 | l4 | l5) == 0L) {
            return this.Y(g2, k2);
        }
        long l6 = l5 / 86400000000000L;
        long l7 = l4 / 86400L;
        long l8 = l3 / 1440L;
        long l9 = l2 / 24L;
        long l10 = 1;
        long l11 = k2.Y();
        l3 = (l2 % 24L * 3600000000000L + (l3 % 1440L * 60000000000L + (l4 % 86400L * 1000000000L + l5 % 86400000000000L))) * l10 + l11;
        l2 = j$.nio.file.attribute.a.f(l3, 86400000000000L);
        if ((l3 = j$.nio.file.attribute.a.h(l3, 86400000000000L)) != l11) {
            k2 = j$.time.k.Q(l3);
        }
        return this.Y(g2.X(l2 + (l9 + (l8 + (l7 + l6))) * l10), k2);
    }

    private i Y(g g2, j$.time.k k2) {
        if (this.a == g2 && this.b == k2) {
            return this;
        }
        return new i(g2, k2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(5, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            long l2 = ((a)p2).J() ? this.b.B(p2) : this.a.B(p2);
            return l2;
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.f()) {
            return this.a;
        }
        return i_0.k(this, r2);
    }

    public final int K() {
        return this.b.N();
    }

    public final int L() {
        return this.b.O();
    }

    public final int M() {
        return this.a.P();
    }

    public final boolean N(i i2) {
        boolean bl2;
        block6: {
            block5: {
                boolean bl3 = i2 instanceof i;
                boolean bl4 = false;
                bl2 = false;
                if (bl3) {
                    if (this.I(i2) > 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                long l2 = this.a.C() - i2.a.C();
                long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                if (l3 > 0) break block5;
                bl2 = bl4;
                if (l3 != false) break block6;
                bl2 = bl4;
                if (this.b.Y() <= i2.b.Y()) break block6;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final boolean O(i i2) {
        boolean bl2;
        block6: {
            block5: {
                boolean bl3 = i2 instanceof i;
                boolean bl4 = false;
                bl2 = false;
                if (bl3) {
                    if (this.I(i2) < 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                long l2 = this.a.C() - i2.a.C();
                long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                if (l3 < 0) break block5;
                bl2 = bl4;
                if (l3 != false) break block6;
                bl2 = bl4;
                if (this.b.Y() >= i2.b.Y()) break block6;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final i S(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            Object object2 = (ChronoUnit)object;
            int n2 = h.a[((Enum)object2).ordinal()];
            object2 = this.b;
            g g2 = this.a;
            switch (n2) {
                default: {
                    return this.Y(g2.W(l2, (TemporalUnit)object), (j$.time.k)object2);
                }
                case 7: {
                    object = this.Y(g2.X(l2 / 256L), (j$.time.k)object2);
                    return super.U(((i)object).a, l2 % 256L * 12L, 0L, 0L, 0L);
                }
                case 6: {
                    return this.U(this.a, l2, 0L, 0L, 0L);
                }
                case 5: {
                    return this.U(this.a, 0L, l2, 0L, 0L);
                }
                case 4: {
                    return this.T(l2);
                }
                case 3: {
                    object = this.Y(g2.X(l2 / 86400000L), (j$.time.k)object2);
                    return super.U(((i)object).a, 0L, 0L, 0L, l2 % 86400000L * 1000000L);
                }
                case 2: {
                    object = this.Y(g2.X(l2 / 86400000000L), (j$.time.k)object2);
                    return super.U(((i)object).a, 0L, 0L, 0L, l2 % 86400000000L * 1000L);
                }
                case 1: 
            }
            return this.U(this.a, 0L, 0L, 0L, l2);
        }
        return (i)object.m(this, l2);
    }

    public final i T(long l2) {
        return this.U(this.a, 0L, 0L, l2, 0L);
    }

    public final g V() {
        return this.a;
    }

    public final i W(long l2, p p2) {
        if (p2 instanceof a) {
            boolean bl2 = ((a)p2).J();
            j$.time.k k2 = this.b;
            g g2 = this.a;
            if (bl2) {
                return this.Y(g2, k2.a0(l2, p2));
            }
            return this.Y(g2.b0(l2, p2), k2);
        }
        return (i)p2.s(this, l2);
    }

    public final i X(g g2) {
        return this.Y(g2, this.b);
    }

    final void Z(DataOutput dataOutput) {
        this.a.f0(dataOutput);
        this.b.c0(dataOutput);
    }

    @Override
    public final j$.time.chrono.n a() {
        return ((g)this.c()).a();
    }

    @Override
    public final j$.time.k b() {
        return this.b;
    }

    @Override
    public final b_0 c() {
        return this.a;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) {
            p2 = (a)p2;
            bl3 = bl4;
            if (!((a)p2).B()) {
                bl3 = ((a)p2).J() ? bl4 : false;
            }
            return bl3;
        }
        if (p2 == null || !p2.p(this)) {
            bl3 = false;
        }
        return bl3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof i) {
            i i2 = (i)object;
            object = i2.a;
            if (!this.a.equals(object) || !this.b.equals(i2.b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k object) {
        Object object2 = j$.time.temporal.a.EPOCH_DAY;
        object2 = object.d(((g)this.c()).C(), (p)object2);
        object = j$.time.temporal.a.NANO_OF_DAY;
        return object2.d(this.b().Y(), (p)object);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final int j(e_0 e_02) {
        if (e_02 instanceof i) {
            return this.I((i)e_02);
        }
        return i_0.c(this, e_02);
    }

    @Override
    public final k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.S(Long.MAX_VALUE, (TemporalUnit)object).S(1L, (TemporalUnit)object) : this.S(-l2, (TemporalUnit)object);
        return object;
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof a) {
            int n2 = ((a)p2).J() ? this.b.p(p2) : this.a.p(p2);
            return n2;
        }
        return l.a(this, p2);
    }

    @Override
    public final k s(g g2) {
        return this.Y(g2, this.b);
    }

    @Override
    public final t t(p object) {
        if (object instanceof a) {
            if (((a)object).J()) {
                j$.time.k k2 = this.b;
                k2.getClass();
                object = l.d(k2, (p)object);
            } else {
                object = this.a.t((p)object);
            }
            return object;
        }
        return object.t(this);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("T");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public final j$.time.chrono.k w(x x2) {
        return ZonedDateTime.J(this, x2, null);
    }
}

