/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.desugar.sun.nio.fs.c;
import j$.time.Instant;
import j$.time.chrono.G;
import j$.time.chrono.n;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.t;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/*
 * Renamed from j$.time.chrono.h
 */
final class h_0
implements TemporalAmount,
Serializable {
    public static final int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final n a;
    final int b;
    final int c;
    final int d;

    static {
        j$.desugar.sun.nio.fs.c.a(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    h_0(n n2, int n3, int n4, int n5) {
        Objects.requireNonNull(n2, "chrono");
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof h_0) {
            object = (h_0)object;
            int n2 = ((h_0)object).b;
            if (this.b != n2 || this.c != ((h_0)object).c || this.d != ((h_0)object).d || !this.a.equals(((h_0)object).a)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(Instant object) {
        Objects.requireNonNull(object, "temporal");
        Object object2 = (n)((Instant)object).F(l.e());
        Object object3 = this.a;
        if (object2 != null && !object3.equals(object2)) {
            object = object3.l();
            object3 = object2.l();
            object2 = new StringBuilder("Chronology mismatch, expected: ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(", actual: ");
            ((StringBuilder)object2).append((String)object3);
            throw new RuntimeException(((StringBuilder)object2).toString());
        }
        int n2 = this.b;
        int n3 = this.c;
        if (n3 == 0) {
            object2 = object;
            if (n2 != 0) {
                object2 = ((Instant)object).m(n2, ChronoUnit.YEARS);
            }
        } else {
            object2 = object3.q(j$.time.temporal.a.MONTH_OF_YEAR);
            long l2 = ((t)object2).g() && ((t)object2).h() ? ((t)object2).d() - ((t)object2).e() + 1L : -1L;
            if (l2 > 0L) {
                object2 = ((Instant)object).m((long)n2 * l2 + (long)n3, ChronoUnit.MONTHS);
            } else {
                object2 = object;
                if (n2 != 0) {
                    object2 = ((Instant)object).m(n2, ChronoUnit.YEARS);
                }
                l2 = n3;
                object = ChronoUnit.MONTHS;
                object2 = ((Instant)object2).m(l2, (ChronoUnit)object);
            }
        }
        n3 = this.d;
        object = object2;
        if (n3 != 0) {
            object = object2.m(n3, ChronoUnit.DAYS);
        }
        return object;
    }

    public final int hashCode() {
        int n2 = Integer.rotateLeft(this.c, 8);
        int n3 = this.b;
        int n4 = Integer.rotateLeft(this.d, 16);
        return this.a.hashCode() ^ n4 + (n2 + n3);
    }

    public final String toString() {
        Comparable comparable = this.a;
        int n2 = this.d;
        int n3 = this.c;
        int n4 = this.b;
        if (n4 == 0 && n3 == 0 && n2 == 0) {
            String string = comparable.toString();
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(" P0D");
            return ((StringBuilder)comparable).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(comparable.toString());
        stringBuilder.append(" P");
        if (n4 != 0) {
            stringBuilder.append(n4);
            stringBuilder.append('Y');
        }
        if (n3 != 0) {
            stringBuilder.append(n3);
            stringBuilder.append('M');
        }
        if (n2 != 0) {
            stringBuilder.append(n2);
            stringBuilder.append('D');
        }
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.l());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new G(9, this);
    }
}

