/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.nio.file.attribute.a;
import j$.time.chrono.b_0;
import j$.time.chrono.c_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.i_0;
import j$.time.chrono.n;
import j$.time.chrono.o;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.io.Serializable;

/*
 * Renamed from j$.time.chrono.d
 */
abstract class d_0
implements b_0,
j$.time.temporal.k,
j$.time.temporal.n,
Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    d_0() {
    }

    static b_0 I(n object, j$.time.temporal.k object2) {
        if (object.equals((object2 = (b_0)object2).a())) {
            return object2;
        }
        object = object.l();
        object2 = object2.a().l();
        StringBuilder stringBuilder = new StringBuilder("Chronology mismatch, expected: ");
        stringBuilder.append((String)object);
        stringBuilder.append(", actual: ");
        stringBuilder.append((String)object2);
        throw new ClassCastException(stringBuilder.toString());
    }

    @Override
    public final /* synthetic */ int A(b_0 b_02) {
        return i_0.b(this, b_02);
    }

    @Override
    public long C() {
        return this.B(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override
    public e_0 E(k k2) {
        return g_0.J(this, k2);
    }

    @Override
    public final /* synthetic */ Object F(r r2) {
        return i_0.j(this, r2);
    }

    public o J() {
        return this.a().G(l.a(this, j$.time.temporal.a.ERA));
    }

    abstract b_0 K(long var1);

    abstract b_0 L(long var1);

    abstract b_0 M(long var1);

    public b_0 N(j$.time.temporal.n n2) {
        return d_0.I(this.a(), n2.g(this));
    }

    @Override
    public b_0 d(long l2, p p2) {
        if (!(p2 instanceof j$.time.temporal.a)) {
            return d_0.I(this.a(), p2.s(this, l2));
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
    }

    @Override
    public /* synthetic */ boolean e(p p2) {
        return i_0.h(this, p2);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof b_0) {
            if (i_0.b(this, (b_0)object) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public b_0 f(long l2, TemporalUnit object) {
        boolean bl2 = object instanceof ChronoUnit;
        if (bl2) {
            ChronoUnit chronoUnit = (ChronoUnit)object;
            switch (c_0.a[chronoUnit.ordinal()]) {
                default: {
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(object)));
                }
                case 8: {
                    object = j$.time.temporal.a.ERA;
                    return this.d(a.i(this.B((p)object), l2), (p)object);
                }
                case 7: {
                    return this.M(a.j(l2, 1000));
                }
                case 6: {
                    return this.M(a.j(l2, 100));
                }
                case 5: {
                    return this.M(a.j(l2, 10));
                }
                case 4: {
                    return this.M(l2);
                }
                case 3: {
                    return this.L(l2);
                }
                case 2: {
                    return this.K(a.j(l2, 7));
                }
                case 1: 
            }
            return this.K(l2);
        }
        if (!bl2) {
            return d_0.I(this.a(), object.m(this, l2));
        }
        throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(object)));
    }

    @Override
    public final /* synthetic */ j$.time.temporal.k g(j$.time.temporal.k k2) {
        return i_0.a(this, k2);
    }

    @Override
    public int hashCode() {
        long l2 = this.C();
        return this.a().hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public boolean o() {
        return this.a().D(this.B(j$.time.temporal.a.YEAR));
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return l.a(this, p2);
    }

    @Override
    public /* synthetic */ t t(p p2) {
        return l.d(this, p2);
    }

    @Override
    public String toString() {
        long l2 = this.B(j$.time.temporal.a.YEAR_OF_ERA);
        long l3 = this.B(j$.time.temporal.a.MONTH_OF_YEAR);
        long l4 = this.B(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append(this.a().toString());
        stringBuilder.append(" ");
        stringBuilder.append(this.J());
        stringBuilder.append(" ");
        stringBuilder.append(l2);
        String string = "-";
        String string2 = l3 < 10L ? "-0" : "-";
        stringBuilder.append(string2);
        stringBuilder.append(l3);
        string2 = string;
        if (l4 < 10L) {
            string2 = "-0";
        }
        stringBuilder.append(string2);
        stringBuilder.append(l4);
        return stringBuilder.toString();
    }

    @Override
    public b_0 v(long l2, TemporalUnit temporalUnit) {
        return d_0.I(this.a(), l.b(this, l2, temporalUnit));
    }

    @Override
    public int x() {
        int n2 = this.o() ? 366 : 365;
        return n2;
    }
}

