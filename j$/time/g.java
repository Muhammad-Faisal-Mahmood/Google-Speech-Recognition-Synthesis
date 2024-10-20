/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.d;
import j$.time.f;
import j$.time.i;
import j$.time.l;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class g
implements k,
n,
b_0,
Serializable {
    public static final g d = g.T(-999999999, 1, 1);
    public static final g e = g.T(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        g.T(1970, 1, 1);
    }

    private g(int n2, int n3, int n4) {
        this.a = n2;
        this.b = (short)n3;
        this.c = (short)n4;
    }

    private static g J(int n2, int n3, int n4) {
        int n5 = 28;
        if (n4 > 28) {
            if (n3 != 2) {
                n5 = n3 != 4 && n3 != 6 && n3 != 9 && n3 != 11 ? 31 : 30;
            } else if (u.d.D(n2)) {
                n5 = 29;
            }
            if (n4 > n5) {
                if (n4 == 29) {
                    StringBuilder stringBuilder = new StringBuilder("Invalid date 'February 29' as '");
                    stringBuilder.append(n2);
                    stringBuilder.append("' is not a leap year");
                    throw new RuntimeException(stringBuilder.toString());
                }
                String string = l.L(n3).name();
                StringBuilder stringBuilder = new StringBuilder("Invalid date '");
                stringBuilder.append(string);
                stringBuilder.append(" ");
                stringBuilder.append(n4);
                stringBuilder.append("'");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return new g(n2, n3, n4);
    }

    public static g K(m object) {
        Objects.requireNonNull(object, "temporal");
        Object object2 = (g)object.F(j$.time.temporal.l.f());
        if (object2 != null) {
            return object2;
        }
        object2 = String.valueOf(object);
        String string = object.getClass().getName();
        object = new StringBuilder("Unable to obtain LocalDate from TemporalAccessor: ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" of type ");
        ((StringBuilder)object).append(string);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int L(p p2) {
        int n2 = f.a[((a)p2).ordinal()];
        short s2 = this.c;
        int n3 = this.a;
        int n4 = 1;
        switch (n2) {
            default: {
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
            }
            case 13: {
                if (n3 < 1) return 0;
                return n4;
            }
            case 12: {
                return n3;
            }
            case 11: {
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            }
            case 10: {
                return this.b;
            }
            case 9: {
                return (this.N() - 1) / 7 + 1;
            }
            case 8: {
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            }
            case 7: {
                return (this.N() - 1) % 7 + 1;
            }
            case 6: {
                n4 = (s2 - 1) % 7;
                return n4 + 1;
            }
            case 5: {
                return this.M().getValue();
            }
            case 4: {
                if (n3 < 1) return 1 - n3;
                return n3;
            }
            case 3: {
                n4 = (s2 - 1) / 7;
                return n4 + 1;
            }
            case 2: {
                return this.N();
            }
            case 1: 
        }
        return s2;
    }

    public static g T(int n2, int n3, int n4) {
        j$.time.temporal.a.YEAR.I(n2);
        j$.time.temporal.a.MONTH_OF_YEAR.I(n3);
        j$.time.temporal.a.DAY_OF_MONTH.I(n4);
        return g.J(n2, n3, n4);
    }

    public static g U(int n2, l l2, int n3) {
        j$.time.temporal.a.YEAR.I(n2);
        Objects.requireNonNull(l2, "month");
        j$.time.temporal.a.DAY_OF_MONTH.I(n3);
        return g.J(n2, l2.getValue(), n3);
    }

    public static g V(long l2) {
        long l3;
        j$.time.temporal.a.EPOCH_DAY.I(l2);
        long l4 = 719468L + l2;
        if (l4 < 0L) {
            l3 = (l2 + 719469L) / 146097L - 1L;
            l2 = l3 * 400L;
            l4 += -l3 * 146097L;
        } else {
            l2 = 0L;
        }
        long l5 = (l4 * 400L + 591L) / 146097L;
        long l6 = l5 / 4L;
        l3 = l5 / 100L;
        long l7 = l4 - (l5 / 400L + (l6 + l5 * 365L - l3));
        l3 = l5;
        l6 = l7;
        if (l7 < 0L) {
            l3 = l5 - 1L;
            l6 = l3 / 4L;
            l5 = l3 / 100L;
            l6 = l4 - (l3 / 400L + (l6 + 365L * l3 - l5));
        }
        int n2 = (int)l6;
        int n3 = (n2 * 5 + 2) / 153;
        int n4 = (n3 * 306 + 5) / 10;
        l4 = n3 / 10;
        return new g(j$.time.temporal.a.YEAR.F(l3 + l2 + l4), (n3 + 2) % 12 + 1, n2 - n4 + 1);
    }

    private static g a0(int n2, int n3, int n4) {
        if (n3 != 2) {
            if (n3 == 4 || n3 == 6 || n3 == 9 || n3 == 11) {
                n4 = Math.min(n4, 30);
            }
        } else {
            int n5 = u.d.D(n2) ? 29 : 28;
            n4 = Math.min(n4, n5);
        }
        return new g(n2, n3, n4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(3, this);
    }

    @Override
    public final int A(b_0 b_02) {
        if (b_02 instanceof g) {
            return this.I((g)b_02);
        }
        return i_0.b(this, b_02);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            if (p2 == j$.time.temporal.a.EPOCH_DAY) {
                return this.C();
            }
            if (p2 == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return (long)this.a * 12L + (long)this.b - 1L;
            }
            return this.L(p2);
        }
        return p2.g(this);
    }

    @Override
    public final long C() {
        long l2 = this.a;
        long l3 = this.b;
        long l4 = 365L * l2;
        if (l2 >= 0L) {
            long l5 = (3L + l2) / 4L;
            long l6 = (99L + l2) / 100L;
            l4 = (l2 + 399L) / 400L + (l5 - l6) + l4;
        } else {
            long l7 = l2 / -4L;
            long l8 = l2 / -100L;
            l4 -= l2 / -400L + (l7 - l8);
        }
        l4 = l2 = (367L * l3 - 362L) / 12L + l4 + (long)(this.c - 1);
        if (l3 > 2L) {
            l4 = !this.o() ? l2 - 2L : l2 - 1L;
        }
        return l4 - 719528L;
    }

    @Override
    public final e_0 E(j$.time.k k2) {
        return i.Q(this, k2);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == j$.time.temporal.l.f()) {
            return this;
        }
        return i_0.j(this, r2);
    }

    final int I(g g2) {
        int n2;
        int n3 = g2.a;
        n3 = n2 = this.a - n3;
        if (n2 == 0) {
            n3 = n2 = this.b - g2.b;
            if (n2 == 0) {
                n3 = this.c - g2.c;
            }
        }
        return n3;
    }

    public final d M() {
        return j$.time.d.I((int)j$.nio.file.attribute.a.h(this.C() + 3L, 7) + 1);
    }

    public final int N() {
        return l.L(this.b).I(this.o()) + this.c - 1;
    }

    public final int O() {
        return this.b;
    }

    public final int P() {
        return this.a;
    }

    public final boolean Q(g g2) {
        boolean bl2 = g2 instanceof g;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            bl3 = bl4;
            if (this.I(g2) < 0) {
                bl3 = true;
            }
            return bl3;
        }
        if (this.C() < g2.C()) {
            bl3 = true;
        }
        return bl3;
    }

    public final int R() {
        int n2 = this.b;
        if (n2 != 2) {
            if (n2 != 4 && n2 != 6 && n2 != 9 && n2 != 11) {
                return 31;
            }
            return 30;
        }
        n2 = this.o() ? 29 : 28;
        return n2;
    }

    public final g S(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.W(Long.MAX_VALUE, (TemporalUnit)object).W(1L, (TemporalUnit)object) : this.W(-l2, (TemporalUnit)object);
        return object;
    }

    public final g W(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit)object;
            switch (f.b[chronoUnit.ordinal()]) {
                default: {
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(object)));
                }
                case 8: {
                    object = j$.time.temporal.a.ERA;
                    return this.b0(j$.nio.file.attribute.a.i(this.B((p)object), l2), (p)object);
                }
                case 7: {
                    return this.Z(j$.nio.file.attribute.a.j(l2, 1000));
                }
                case 6: {
                    return this.Z(j$.nio.file.attribute.a.j(l2, 100));
                }
                case 5: {
                    return this.Z(j$.nio.file.attribute.a.j(l2, 10));
                }
                case 4: {
                    return this.Z(l2);
                }
                case 3: {
                    return this.Y(l2);
                }
                case 2: {
                    return this.X(j$.nio.file.attribute.a.j(l2, 7));
                }
                case 1: 
            }
            return this.X(l2);
        }
        return (g)object.m(this, l2);
    }

    public final g X(long l2) {
        if (l2 == 0L) {
            return this;
        }
        long l3 = (long)this.c + l2;
        if (l3 > 0L) {
            short s2 = this.b;
            int n2 = this.a;
            if (l3 <= 28L) {
                return new g(n2, s2, (int)l3);
            }
            if (l3 <= 59L) {
                l2 = this.R();
                if (l3 <= l2) {
                    return new g(n2, s2, (int)l3);
                }
                if (s2 < 12) {
                    return new g(n2, s2 + 1, (int)(l3 - l2));
                }
                a a2 = j$.time.temporal.a.YEAR;
                a2.I(++n2);
                return new g(n2, 1, (int)(l3 - l2));
            }
        }
        return g.V(j$.nio.file.attribute.a.i(this.C(), l2));
    }

    public final g Y(long l2) {
        if (l2 == 0L) {
            return this;
        }
        l2 = (long)this.a * 12L + (long)(this.b - 1) + l2;
        a a2 = j$.time.temporal.a.YEAR;
        long l3 = 12;
        return g.a0(a2.F(j$.nio.file.attribute.a.f(l2, l3)), (int)j$.nio.file.attribute.a.h(l2, l3) + 1, this.c);
    }

    public final g Z(long l2) {
        if (l2 == 0L) {
            return this;
        }
        return g.a0(j$.time.temporal.a.YEAR.F((long)this.a + l2), this.b, this.c);
    }

    @Override
    public final j$.time.chrono.n a() {
        return u.d;
    }

    public final g b0(long l2, p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            a2.I(l2);
            int n2 = f.a[a2.ordinal()];
            short s2 = this.c;
            short s3 = this.b;
            int n3 = this.a;
            switch (n2) {
                default: {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
                }
                case 13: {
                    object = this.B(j$.time.temporal.a.ERA) == l2 ? this : this.e0(1 - n3);
                    return object;
                }
                case 12: {
                    return this.e0((int)l2);
                }
                case 11: {
                    return this.Y(l2 - ((long)n3 * 12L + (long)s3 - 1L));
                }
                case 10: {
                    n2 = (int)l2;
                    if (s3 == n2) {
                        object = this;
                    } else {
                        j$.time.temporal.a.MONTH_OF_YEAR.I(n2);
                        object = g.a0(n3, n2, s2);
                    }
                    return object;
                }
                case 9: {
                    return this.X(j$.nio.file.attribute.a.j(l2 - this.B(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
                }
                case 8: {
                    return g.V(l2);
                }
                case 7: {
                    return this.X(l2 - this.B(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                }
                case 6: {
                    return this.X(l2 - this.B(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                }
                case 5: {
                    return this.X(l2 - (long)this.M().getValue());
                }
                case 4: {
                    if (n3 < 1) {
                        l2 = 1L - l2;
                    }
                    return this.e0((int)l2);
                }
                case 3: {
                    return this.X(j$.nio.file.attribute.a.j(l2 - this.B(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
                }
                case 2: {
                    return this.d0((int)l2);
                }
                case 1: 
            }
            n2 = (int)l2;
            object = s2 == n2 ? this : g.T(n3, s3, n2);
            return object;
        }
        return (g)object.s(this, l2);
    }

    public final g c0(n n2) {
        if (n2 instanceof g) {
            return (g)n2;
        }
        return (g)n2.g(this);
    }

    public final g d0(int n2) {
        if (this.N() == n2) {
            return this;
        }
        Object object = j$.time.temporal.a.YEAR;
        int n3 = this.a;
        long l2 = n3;
        ((a)object).I(l2);
        j$.time.temporal.a.DAY_OF_YEAR.I(n2);
        boolean bl2 = u.d.D(l2);
        if (n2 == 366 && !bl2) {
            object = new StringBuilder("Invalid date 'DayOfYear 366' as '");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append("' is not a leap year");
            throw new RuntimeException(((StringBuilder)object).toString());
        }
        l l3 = l.L((n2 - 1) / 31 + 1);
        int n4 = l3.I(bl2);
        object = l3;
        if (n2 > l3.J(bl2) + n4 - 1) {
            object = l3.M();
        }
        n4 = ((l)object).I(bl2);
        return new g(n3, ((l)object).getValue(), n2 - n4 + 1);
    }

    @Override
    public final boolean e(p p2) {
        return i_0.h(this, p2);
    }

    public final g e0(int n2) {
        if (this.a == n2) {
            return this;
        }
        j$.time.temporal.a.YEAR.I(n2);
        return g.a0(n2, this.b, this.c);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            if (this.I((g)object) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    final void f0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override
    public final k g(k k2) {
        return i_0.a(this, k2);
    }

    @Override
    public final int hashCode() {
        int n2 = this.a;
        return (n2 << 11) + (this.b << 6) + this.c ^ n2 & 0xFFFFF800;
    }

    @Override
    public final boolean o() {
        return u.d.D(this.a);
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof a) {
            return this.L(p2);
        }
        return j$.time.temporal.l.a(this, p2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final t t(p object) {
        if (!(object instanceof a)) return object.t(this);
        a a2 = (a)object;
        if (!a2.B()) throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
        int n2 = f.a[a2.ordinal()];
        if (n2 == 1) return t.j(1L, this.R());
        if (n2 == 2) return t.j(1L, this.x());
        if (n2 != 3) {
            long l2;
            if (n2 != 4) {
                return ((a)object).m();
            }
            if (this.a <= 0) {
                l2 = 1000000000L;
                return t.j(1L, l2);
            }
            l2 = 999999999L;
            return t.j(1L, l2);
        }
        long l3 = l.L(this.b) == l.FEBRUARY && !this.o() ? 4L : 5L;
        return t.j(1L, l3);
    }

    @Override
    public final String toString() {
        int n2 = this.a;
        int n3 = Math.abs(n2);
        StringBuilder stringBuilder = new StringBuilder(10);
        if (n3 < 1000) {
            if (n2 < 0) {
                stringBuilder.append(n2 - 10000);
                stringBuilder.deleteCharAt(1);
            } else {
                stringBuilder.append(n2 + 10000);
                stringBuilder.deleteCharAt(0);
            }
        } else {
            if (n2 > 9999) {
                stringBuilder.append('+');
            }
            stringBuilder.append(n2);
        }
        String string = "-";
        n2 = this.b;
        String string2 = n2 < 10 ? "-0" : "-";
        stringBuilder.append(string2);
        stringBuilder.append(n2);
        n2 = this.c;
        string2 = string;
        if (n2 < 10) {
            string2 = "-0";
        }
        stringBuilder.append(string2);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    @Override
    public final int x() {
        int n2 = this.o() ? 366 : 365;
        return n2;
    }
}

