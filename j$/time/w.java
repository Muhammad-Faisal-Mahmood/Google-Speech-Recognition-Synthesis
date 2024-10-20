/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.format.A;
import j$.time.format.s;
import j$.time.g;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.v;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class w
implements k,
n,
Comparable,
Serializable {
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        s s2 = new s();
        s2.p(j$.time.temporal.a.YEAR, 4, 10, A.EXCEEDS_PAD);
        s2.e('-');
        s2.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        s2.x();
    }

    private w(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    private long I() {
        return (long)this.a * 12L + (long)this.b - 1L;
    }

    static w M(ObjectInput objectInput) {
        int n2 = objectInput.readInt();
        byte by2 = objectInput.readByte();
        j$.time.temporal.a.YEAR.I(n2);
        j$.time.temporal.a.MONTH_OF_YEAR.I(by2);
        return new w(n2, by2);
    }

    private w N(int n2, int n3) {
        if (this.a == n2 && this.b == n3) {
            return this;
        }
        return new w(n2, n3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new j$.time.s(12, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            int n2 = v.a[((a)p2).ordinal()];
            int n3 = 1;
            if (n2 != 1) {
                if (n2 != 2) {
                    int n4 = this.a;
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                if (n4 < 1) {
                                    n3 = 0;
                                }
                                return n3;
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                        }
                        return n4;
                    }
                    n3 = n4;
                    if (n4 < 1) {
                        n3 = 1 - n4;
                    }
                    return n3;
                }
                return this.I();
            }
            return this.b;
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.e()) {
            return u.d;
        }
        if (r2 == l.i()) {
            return ChronoUnit.MONTHS;
        }
        return l.c(this, r2);
    }

    public final w J(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            switch (v.b[((ChronoUnit)object).ordinal()]) {
                default: {
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(object)));
                }
                case 6: {
                    object = j$.time.temporal.a.ERA;
                    return this.O(j$.nio.file.attribute.a.i(this.B((p)object), l2), (p)object);
                }
                case 5: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 1000));
                }
                case 4: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 100));
                }
                case 3: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 10));
                }
                case 2: {
                    return this.L(l2);
                }
                case 1: 
            }
            return this.K(l2);
        }
        return (w)object.m(this, l2);
    }

    public final w K(long l2) {
        if (l2 == 0L) {
            return this;
        }
        l2 = (long)this.a * 12L + (long)(this.b - 1) + l2;
        a a2 = j$.time.temporal.a.YEAR;
        long l3 = 12;
        return this.N(a2.F(j$.nio.file.attribute.a.f(l2, l3)), (int)j$.nio.file.attribute.a.h(l2, l3) + 1);
    }

    public final w L(long l2) {
        if (l2 == 0L) {
            return this;
        }
        return this.N(j$.time.temporal.a.YEAR.F((long)this.a + l2), this.b);
    }

    public final w O(long l2, p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            a2.I(l2);
            int n2 = v.a[a2.ordinal()];
            int n3 = this.a;
            if (n2 != 1) {
                if (n2 != 2) {
                    int n4 = this.b;
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                if (this.B(j$.time.temporal.a.ERA) == l2) {
                                    object = this;
                                } else {
                                    n3 = 1 - n3;
                                    j$.time.temporal.a.YEAR.I(n3);
                                    object = this.N(n3, n4);
                                }
                                return object;
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
                        }
                        n3 = (int)l2;
                        j$.time.temporal.a.YEAR.I(n3);
                        return this.N(n3, n4);
                    }
                    long l3 = l2;
                    if (n3 < 1) {
                        l3 = 1L - l2;
                    }
                    n3 = (int)l3;
                    j$.time.temporal.a.YEAR.I(n3);
                    return this.N(n3, n4);
                }
                return this.K(l2 - this.I());
            }
            int n5 = (int)l2;
            j$.time.temporal.a.MONTH_OF_YEAR.I(n5);
            return this.N(n3, n5);
        }
        return (w)object.s(this, l2);
    }

    final void P(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    public final int compareTo(Object object) {
        int n2;
        object = (w)object;
        int n3 = ((w)object).a;
        n3 = n2 = this.a - n3;
        if (n2 == 0) {
            n3 = this.b - ((w)object).b;
        }
        return n3;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) {
            bl3 = bl4;
            if (p2 != j$.time.temporal.a.YEAR) {
                bl3 = bl4;
                if (p2 != j$.time.temporal.a.MONTH_OF_YEAR) {
                    bl3 = bl4;
                    if (p2 != j$.time.temporal.a.PROLEPTIC_MONTH) {
                        bl3 = bl4;
                        if (p2 != j$.time.temporal.a.YEAR_OF_ERA) {
                            bl3 = p2 == j$.time.temporal.a.ERA ? bl4 : false;
                        }
                    }
                }
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
        if (object instanceof w) {
            object = (w)object;
            int n2 = ((w)object).a;
            if (this.a != n2 || this.b != ((w)object).b) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k k2) {
        if (i_0.p(k2).equals(u.d)) {
            a a2 = j$.time.temporal.a.PROLEPTIC_MONTH;
            return k2.d(this.I(), a2);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return this.b << 27 ^ this.a;
    }

    @Override
    public final k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.J(Long.MAX_VALUE, (TemporalUnit)object).J(1L, (TemporalUnit)object) : this.J(-l2, (TemporalUnit)object);
        return object;
    }

    @Override
    public final int p(p p2) {
        return this.t(p2).a(this.B(p2), p2);
    }

    @Override
    public final k s(g g2) {
        return (w)i_0.a(g2, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final t t(p object) {
        long l2;
        if (object != j$.time.temporal.a.YEAR_OF_ERA) return l.d(this, (p)object);
        if (this.a <= 0) {
            l2 = 1000000000L;
            return t.j(1L, l2);
        }
        l2 = 999999999L;
        return t.j(1L, l2);
    }

    public final String toString() {
        int n2 = this.a;
        int n3 = Math.abs(n2);
        StringBuilder stringBuilder = new StringBuilder(9);
        if (n3 < 1000) {
            if (n2 < 0) {
                stringBuilder.append(n2 - 10000);
                stringBuilder.deleteCharAt(1);
            } else {
                stringBuilder.append(n2 + 10000);
                stringBuilder.deleteCharAt(0);
            }
        } else {
            stringBuilder.append(n2);
        }
        n2 = this.b;
        String string = n2 < 10 ? "-0" : "-";
        stringBuilder.append(string);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

