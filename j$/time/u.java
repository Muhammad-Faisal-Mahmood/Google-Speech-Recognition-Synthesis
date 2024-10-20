/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
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
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class u
implements k,
n,
Comparable,
Serializable {
    public static final int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        s s2 = new s();
        s2.p(j$.time.temporal.a.YEAR, 4, 10, A.EXCEEDS_PAD);
        s2.x();
    }

    private u(int n2) {
        this.a = n2;
    }

    public static u I(int n2) {
        j$.time.temporal.a.YEAR.I(n2);
        return new u(n2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new j$.time.s(11, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            int n2 = j$.time.t.a[((a)p2).ordinal()];
            int n3 = this.a;
            int n4 = 1;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        if (n3 < 1) {
                            n4 = 0;
                        }
                        return n4;
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                }
                return n3;
            }
            n4 = n3;
            if (n3 < 1) {
                n4 = 1 - n3;
            }
            return n4;
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.e()) {
            return j$.time.chrono.u.d;
        }
        if (r2 == l.i()) {
            return ChronoUnit.YEARS;
        }
        return l.c(this, r2);
    }

    public final u J(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            int n2 = j$.time.t.b[((ChronoUnit)object).ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                object = j$.time.temporal.a.ERA;
                                return this.L(j$.nio.file.attribute.a.i(this.B((p)object), l2), (p)object);
                            }
                            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(object)));
                        }
                        return this.K(j$.nio.file.attribute.a.j(l2, 1000));
                    }
                    return this.K(j$.nio.file.attribute.a.j(l2, 100));
                }
                return this.K(j$.nio.file.attribute.a.j(l2, 10));
            }
            return this.K(l2);
        }
        return (u)object.m(this, l2);
    }

    public final u K(long l2) {
        if (l2 == 0L) {
            return this;
        }
        return u.I(j$.time.temporal.a.YEAR.F((long)this.a + l2));
    }

    public final u L(long l2, p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            a2.I(l2);
            int n2 = j$.time.t.a[a2.ordinal()];
            int n3 = this.a;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        object = this.B(j$.time.temporal.a.ERA) == l2 ? this : u.I(1 - n3);
                        return object;
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
                }
                return u.I((int)l2);
            }
            long l3 = l2;
            if (n3 < 1) {
                l3 = 1L - l2;
            }
            return u.I((int)l3);
        }
        return (u)object.s(this, l2);
    }

    final void M(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    public final int compareTo(Object object) {
        object = (u)object;
        return this.a - ((u)object).a;
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
                if (p2 != j$.time.temporal.a.YEAR_OF_ERA) {
                    bl3 = p2 == j$.time.temporal.a.ERA ? bl4 : false;
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
        if (object instanceof u) {
            int n2 = ((u)object).a;
            if (this.a != n2) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k k2) {
        if (i_0.p(k2).equals(j$.time.chrono.u.d)) {
            a a2 = j$.time.temporal.a.YEAR;
            return k2.d(this.a, a2);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return this.a;
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
        return (u)i_0.a(g2, this);
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
        return Integer.toString(this.a);
    }
}

