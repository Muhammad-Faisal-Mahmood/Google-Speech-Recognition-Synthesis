/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.desugar.sun.nio.fs.c;
import j$.time.Instant;
import j$.time.chrono.n;
import j$.time.chrono.u;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class r
implements TemporalAmount,
Serializable {
    public static final r d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.c.a(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private r(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    static r a(ObjectInput object) {
        int n2;
        int n3;
        int n4 = object.readInt();
        object = (n4 | (n3 = object.readInt()) | (n2 = object.readInt())) == 0 ? d : new r(n4, n3, n2);
        return object;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(14, this);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof r) {
            object = (r)object;
            int n2 = ((r)object).a;
            if (this.a != n2 || this.b != ((r)object).b || this.c != ((r)object).c) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(Instant object) {
        long l2;
        Objects.requireNonNull(object, "temporal");
        Object object2 = (n)((Instant)object).F(l.e());
        if (object2 != null && !u.d.equals(object2)) {
            object2 = object2.l();
            object = new StringBuilder("Chronology mismatch, expected: ISO, actual: ");
            ((StringBuilder)object).append((String)object2);
            throw new RuntimeException(((StringBuilder)object).toString());
        }
        int n2 = this.a;
        int n3 = this.b;
        if (n3 == 0) {
            object2 = object;
            if (n2 != 0) {
                object2 = ((Instant)object).m(n2, ChronoUnit.YEARS);
            }
        } else {
            l2 = (long)n2 * 12L + (long)n3;
            object2 = object;
            if (l2 != 0L) {
                object2 = ((Instant)object).m(l2, ChronoUnit.MONTHS);
            }
        }
        n3 = this.c;
        object = object2;
        if (n3 != 0) {
            l2 = n3;
            object = ChronoUnit.DAYS;
            object = ((Instant)object2).m(l2, (ChronoUnit)object);
        }
        return object;
    }

    public final int hashCode() {
        int n2 = Integer.rotateLeft(this.b, 8);
        int n3 = this.a;
        return Integer.rotateLeft(this.c, 16) + (n2 + n3);
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder stringBuilder = new StringBuilder("P");
        int n2 = this.a;
        if (n2 != 0) {
            stringBuilder.append(n2);
            stringBuilder.append('Y');
        }
        if ((n2 = this.b) != 0) {
            stringBuilder.append(n2);
            stringBuilder.append('M');
        }
        if ((n2 = this.c) != 0) {
            stringBuilder.append(n2);
            stringBuilder.append('D');
        }
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }
}

