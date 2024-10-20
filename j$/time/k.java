/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
import j$.time.g;
import j$.time.j;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class k
implements j$.time.temporal.k,
n,
Comparable,
Serializable {
    public static final k e;
    public static final k f;
    public static final k g;
    private static final k[] h;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        k k2;
        Object object;
        h = new k[24];
        for (int i2 = 0; i2 < ((k[])(object = h)).length; ++i2) {
            object[i2] = new k(i2, 0, 0, 0);
        }
        g = k2 = object[0];
        object = object[12];
        e = k2;
        f = new k(23, 59, 59, 999999999);
    }

    private k(int n2, int n3, int n4, int n5) {
        this.a = (byte)n2;
        this.b = (byte)n3;
        this.c = (byte)n4;
        this.d = n5;
    }

    private static k J(int n2, int n3, int n4, int n5) {
        if ((n3 | n4 | n5) == 0) {
            return h[n2];
        }
        return new k(n2, n3, n4, n5);
    }

    public static k K(m object) {
        Objects.requireNonNull(object, "temporal");
        Object object2 = (k)object.F(l.g());
        if (object2 != null) {
            return object2;
        }
        object2 = String.valueOf(object);
        String string = object.getClass().getName();
        object = new StringBuilder("Unable to obtain LocalTime from TemporalAccessor: ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" of type ");
        ((StringBuilder)object).append(string);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    private int L(p p2) {
        int n2;
        int n3 = j.a[((a)p2).ordinal()];
        byte by2 = this.b;
        int n4 = this.d;
        int n5 = 12;
        int n6 = n2 = this.a;
        switch (n3) {
            default: {
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
            }
            case 15: {
                return n2 / 12;
            }
            case 14: {
                n6 = n2;
                if (n2 == 0) {
                    n6 = 24;
                }
            }
            case 13: {
                return n6;
            }
            case 12: {
                n6 = n2 % 12;
                if (n6 % 12 == 0) {
                    n6 = n5;
                }
                return n6;
            }
            case 11: {
                return n2 % 12;
            }
            case 10: {
                return n2 * 60 + by2;
            }
            case 9: {
                return by2;
            }
            case 8: {
                return this.Z();
            }
            case 7: {
                return this.c;
            }
            case 6: {
                return (int)(this.Y() / 1000000L);
            }
            case 5: {
                return n4 / 1000000;
            }
            case 4: {
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            }
            case 3: {
                return n4 / 1000;
            }
            case 2: {
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            }
            case 1: 
        }
        return n4;
    }

    public static k P(int n2) {
        j$.time.temporal.a.HOUR_OF_DAY.I(n2);
        return h[n2];
    }

    public static k Q(long l2) {
        j$.time.temporal.a.NANO_OF_DAY.I(l2);
        int n2 = (int)(l2 / 3600000000000L);
        int n3 = (int)((l2 -= (long)n2 * 3600000000000L) / 60000000000L);
        int n4 = (int)((l2 -= (long)n3 * 60000000000L) / 1000000000L);
        return k.J(n2, n3, n4, (int)(l2 - (long)n4 * 1000000000L));
    }

    public static k R(long l2) {
        j$.time.temporal.a.SECOND_OF_DAY.I(l2);
        int n2 = (int)(l2 / 3600L);
        int n3 = (int)((l2 -= (long)(n2 * 3600)) / 60L);
        return k.J(n2, n3, (int)(l2 - (long)(n3 * 60)), 0);
    }

    /*
     * Unable to fully structure code
     */
    static k X(ObjectInput var0) {
        var4_1 = var0.readByte();
        var1_2 = 0;
        if (var4_1 < 0) {
            var3_3 = ~var4_1;
            var2_4 = 0;
lbl6:
            // 2 sources

            while (true) {
                var5_5 = 0;
                var4_1 = var3_3;
                var3_3 = var5_5;
                break;
            }
        } else {
            var1_2 = var0.readByte();
            if (var1_2 < 0) {
                var3_3 = 0;
                var1_2 ^= -1;
                var2_4 = 0;
            } else {
                var2_4 = var0.readByte();
                if (var2_4 < 0) {
                    var2_4 ^= -1;
                    var3_3 = var4_1;
                    ** continue;
                }
                var3_3 = var0.readInt();
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.I(var4_1);
        j$.time.temporal.a.MINUTE_OF_HOUR.I(var1_2);
        j$.time.temporal.a.SECOND_OF_MINUTE.I(var2_4);
        j$.time.temporal.a.NANO_OF_SECOND.I(var3_3);
        return k.J(var4_1, var1_2, var2_4, var3_3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(4, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            if (p2 == j$.time.temporal.a.NANO_OF_DAY) {
                return this.Y();
            }
            if (p2 == j$.time.temporal.a.MICRO_OF_DAY) {
                return this.Y() / 1000L;
            }
            return this.L(p2);
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 != l.e() && r2 != l.k() && r2 != l.j() && r2 != l.h()) {
            if (r2 == l.g()) {
                return this;
            }
            if (r2 == l.f()) {
                return null;
            }
            if (r2 == l.i()) {
                return ChronoUnit.NANOS;
            }
            return r2.a(this);
        }
        return null;
    }

    public final int I(k k2) {
        int n2;
        int n3 = k2.a;
        n3 = n2 = Integer.compare(this.a, n3);
        if (n2 == 0) {
            n3 = n2 = Integer.compare(this.b, k2.b);
            if (n2 == 0) {
                n3 = n2 = Integer.compare(this.c, k2.c);
                if (n2 == 0) {
                    n3 = Integer.compare(this.d, k2.d);
                }
            }
        }
        return n3;
    }

    public final int M() {
        return this.a;
    }

    public final int N() {
        return this.d;
    }

    public final int O() {
        return this.c;
    }

    public final k S(long l2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (j.b[((ChronoUnit)temporalUnit).ordinal()]) {
                default: {
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                }
                case 7: {
                    return this.T(l2 % 2L * 12L);
                }
                case 6: {
                    return this.T(l2);
                }
                case 5: {
                    return this.U(l2);
                }
                case 4: {
                    return this.W(l2);
                }
                case 3: {
                    return this.V(l2 % 86400000L * 1000000L);
                }
                case 2: {
                    return this.V(l2 % 86400000000L * 1000L);
                }
                case 1: 
            }
            return this.V(l2);
        }
        return (k)temporalUnit.m(this, l2);
    }

    public final k T(long l2) {
        if (l2 == 0L) {
            return this;
        }
        int n2 = (int)(l2 % 24L);
        byte by2 = this.a;
        byte by3 = this.c;
        int n3 = this.d;
        return k.J((n2 + by2 + 24) % 24, this.b, by3, n3);
    }

    public final k U(long l2) {
        if (l2 == 0L) {
            return this;
        }
        int n2 = this.a * 60 + this.b;
        int n3 = ((int)(l2 % 1440L) + n2 + 1440) % 1440;
        if (n2 == n3) {
            return this;
        }
        return k.J(n3 / 60, n3 % 60, this.c, this.d);
    }

    public final k V(long l2) {
        if (l2 == 0L) {
            return this;
        }
        long l3 = this.Y();
        if (l3 == (l2 = (l2 % 86400000000000L + l3 + 86400000000000L) % 86400000000000L)) {
            return this;
        }
        return k.J((int)(l2 / 3600000000000L), (int)(l2 / 60000000000L % 60L), (int)(l2 / 1000000000L % 60L), (int)(l2 % 1000000000L));
    }

    public final k W(long l2) {
        if (l2 == 0L) {
            return this;
        }
        int n2 = this.a;
        int n3 = ((int)(l2 % 86400L) + n2 + 86400) % 86400;
        if ((n2 = this.b * 60 + n2 * 3600 + this.c) == n3) {
            return this;
        }
        return k.J(n3 / 3600, n3 / 60 % 60, n3 % 60, this.d);
    }

    public final long Y() {
        long l2 = this.a;
        long l3 = this.b;
        return (long)this.c * 1000000000L + (l3 * 60000000000L + l2 * 3600000000000L) + (long)this.d;
    }

    public final int Z() {
        byte by2 = this.a;
        return this.b * 60 + by2 * 3600 + this.c;
    }

    public final k a0(long l2, p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            a2.I(l2);
            int n2 = j.a[a2.ordinal()];
            byte by2 = this.b;
            byte by3 = this.c;
            int n3 = this.d;
            byte by4 = this.a;
            switch (n2) {
                default: {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
                }
                case 15: {
                    return this.T((l2 - (long)(by4 / 12)) * 12L);
                }
                case 14: {
                    long l3 = l2;
                    if (l2 == 24L) {
                        l3 = 0L;
                    }
                    if (by4 == (n2 = (int)l3)) {
                        object = this;
                    } else {
                        j$.time.temporal.a.HOUR_OF_DAY.I(n2);
                        object = k.J(n2, by2, by3, n3);
                    }
                    return object;
                }
                case 13: {
                    n2 = (int)l2;
                    if (by4 == n2) {
                        object = this;
                    } else {
                        j$.time.temporal.a.HOUR_OF_DAY.I(n2);
                        object = k.J(n2, by2, by3, n3);
                    }
                    return object;
                }
                case 12: {
                    long l4 = l2;
                    if (l2 == 12L) {
                        l4 = 0L;
                    }
                    return this.T(l4 - (long)(by4 % 12));
                }
                case 11: {
                    return this.T(l2 - (long)(by4 % 12));
                }
                case 10: {
                    return this.U(l2 - (long)(by4 * 60 + by2));
                }
                case 9: {
                    n2 = (int)l2;
                    if (by2 == n2) {
                        object = this;
                    } else {
                        j$.time.temporal.a.MINUTE_OF_HOUR.I(n2);
                        object = k.J(by4, n2, by3, n3);
                    }
                    return object;
                }
                case 8: {
                    return this.W(l2 - (long)this.Z());
                }
                case 7: {
                    n2 = (int)l2;
                    if (by3 == n2) {
                        object = this;
                    } else {
                        j$.time.temporal.a.SECOND_OF_MINUTE.I(n2);
                        object = k.J(by4, by2, n2, n3);
                    }
                    return object;
                }
                case 6: {
                    return k.Q(l2 * 1000000L);
                }
                case 5: {
                    return this.b0((int)l2 * 1000000);
                }
                case 4: {
                    return k.Q(l2 * 1000L);
                }
                case 3: {
                    return this.b0((int)l2 * 1000);
                }
                case 2: {
                    return k.Q(l2);
                }
                case 1: 
            }
            return this.b0((int)l2);
        }
        return (k)object.s(this, l2);
    }

    public final k b0(int n2) {
        if (this.d == n2) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.I(n2);
        byte by2 = this.c;
        return k.J(this.a, this.b, by2, n2);
    }

    final void c0(DataOutput dataOutput) {
        byte by2 = this.c;
        byte by3 = this.a;
        byte by4 = this.b;
        int n2 = this.d;
        if (n2 == 0) {
            if (by2 == 0) {
                if (by4 == 0) {
                    dataOutput.writeByte(~by3);
                } else {
                    dataOutput.writeByte(by3);
                    dataOutput.writeByte(~by4);
                }
            } else {
                dataOutput.writeByte(by3);
                dataOutput.writeByte(by4);
                dataOutput.writeByte(~by2);
            }
        } else {
            dataOutput.writeByte(by3);
            dataOutput.writeByte(by4);
            dataOutput.writeByte(by2);
            dataOutput.writeInt(n2);
        }
    }

    @Override
    public final boolean e(p p2) {
        if (p2 instanceof a) {
            return ((a)p2).J();
        }
        boolean bl2 = p2 != null && p2.p(this);
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof k) {
            object = (k)object;
            byte by2 = ((k)object).a;
            if (this.a != by2 || this.b != ((k)object).b || this.c != ((k)object).c || this.d != ((k)object).d) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final j$.time.temporal.k g(j$.time.temporal.k k2) {
        a a2 = j$.time.temporal.a.NANO_OF_DAY;
        return k2.d(this.Y(), a2);
    }

    public final int hashCode() {
        long l2 = this.Y();
        return (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.S(Long.MAX_VALUE, (TemporalUnit)object).S(1L, (TemporalUnit)object) : this.S(-l2, (TemporalUnit)object);
        return object;
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof a) {
            return this.L(p2);
        }
        return l.a(this, p2);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return (k)i_0.a(g2, this);
    }

    @Override
    public final t t(p p2) {
        return l.d(this, p2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(18);
        byte by2 = this.a;
        String string = by2 < 10 ? "0" : "";
        stringBuilder.append(string);
        stringBuilder.append(by2);
        String string2 = ":";
        by2 = this.b;
        string = by2 < 10 ? ":0" : ":";
        stringBuilder.append(string);
        stringBuilder.append(by2);
        by2 = this.c;
        int n2 = this.d;
        if (by2 > 0 || n2 > 0) {
            string = string2;
            if (by2 < 10) {
                string = ":0";
            }
            stringBuilder.append(string);
            stringBuilder.append(by2);
            if (n2 > 0) {
                stringBuilder.append('.');
                if (n2 % 1000000 == 0) {
                    stringBuilder.append(Integer.toString(n2 / 1000000 + 1000).substring(1));
                } else if (n2 % 1000 == 0) {
                    stringBuilder.append(Integer.toString(n2 / 1000 + 1000000).substring(1));
                } else {
                    stringBuilder.append(Integer.toString(n2 + 1000000000).substring(1));
                }
            }
        }
        return stringBuilder.toString();
    }
}

