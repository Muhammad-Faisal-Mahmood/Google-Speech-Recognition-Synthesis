/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.format.s;
import j$.time.l;
import j$.time.m;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class n
implements j$.time.temporal.m,
j$.time.temporal.n,
Comparable,
Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        s s2 = new s();
        s2.f("--");
        s2.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        s2.e('-');
        s2.o(j$.time.temporal.a.DAY_OF_MONTH, 2);
        s2.x();
    }

    private n(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    static n I(ObjectInput object) {
        byte by2 = object.readByte();
        byte by3 = object.readByte();
        object = l.L(by2);
        Objects.requireNonNull(object, "month");
        j$.time.temporal.a.DAY_OF_MONTH.I(by3);
        if (by3 <= ((l)object).K()) {
            return new n(((l)object).getValue(), by3);
        }
        object = ((Enum)object).name();
        StringBuilder stringBuilder = new StringBuilder("Illegal value for DayOfMonth field, value ");
        stringBuilder.append(by3);
        stringBuilder.append(" is not valid for month ");
        stringBuilder.append((String)object);
        throw new RuntimeException(stringBuilder.toString());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new j$.time.s(13, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long B(p p2) {
        if (!(p2 instanceof a)) return p2.g(this);
        int n2 = m.a[((a)p2).ordinal()];
        if (n2 != 1) {
            if (n2 != 2) throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
            n2 = this.a;
            return n2;
        }
        n2 = this.b;
        return n2;
    }

    @Override
    public final Object F(r r2) {
        if (r2 == j$.time.temporal.l.e()) {
            return u.d;
        }
        return j$.time.temporal.l.c(this, r2);
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    public final int compareTo(Object object) {
        int n2;
        object = (n)object;
        int n3 = ((n)object).a;
        n3 = n2 = this.a - n3;
        if (n2 == 0) {
            n3 = this.b - ((n)object).b;
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
            if (p2 != j$.time.temporal.a.MONTH_OF_YEAR) {
                bl3 = p2 == j$.time.temporal.a.DAY_OF_MONTH ? bl4 : false;
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
        if (object instanceof n) {
            object = (n)object;
            int n2 = ((n)object).a;
            if (this.a != n2 || this.b != ((n)object).b) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k object) {
        if (i_0.p((j$.time.temporal.m)object).equals(u.d)) {
            Object object2 = j$.time.temporal.a.MONTH_OF_YEAR;
            object2 = object.d(this.a, (p)object2);
            object = j$.time.temporal.a.DAY_OF_MONTH;
            return object2.d(Math.min(object2.t((p)object).d(), (long)this.b), (p)object);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override
    public final int p(p p2) {
        return this.t(p2).a(this.B(p2), p2);
    }

    @Override
    public final t t(p p2) {
        if (p2 == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p2.m();
        }
        if (p2 == j$.time.temporal.a.DAY_OF_MONTH) {
            int n2 = this.a;
            int n3 = l.L(n2).ordinal();
            n3 = n3 != 1 ? (n3 != 3 && n3 != 5 && n3 != 8 && n3 != 10 ? 31 : 30) : 28;
            return t.k(1L, n3, l.L(n2).K());
        }
        return j$.time.temporal.l.d(this, p2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(10);
        stringBuilder.append("--");
        int n2 = this.a;
        String string = n2 < 10 ? "0" : "";
        stringBuilder.append(string);
        stringBuilder.append(n2);
        n2 = this.b;
        string = n2 < 10 ? "-0" : "-";
        stringBuilder.append(string);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

