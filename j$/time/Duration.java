/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.nio.file.attribute.a;
import j$.time.Instant;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.k;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

public final class Duration
implements TemporalAmount,
Comparable<Duration>,
Serializable {
    public static final Duration ZERO = new Duration(0L, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private Duration(long l2, int n2) {
        this.a = l2;
        this.b = n2;
    }

    private static Duration m(long l2, int n2) {
        if (((long)n2 | l2) == 0L) {
            return ZERO;
        }
        return new Duration(l2, n2);
    }

    public static Duration ofDays(long l2) {
        return Duration.m(j$.nio.file.attribute.a.j(l2, 86400), 0);
    }

    public static Duration ofHours(long l2) {
        return Duration.m(j$.nio.file.attribute.a.j(l2, 3600), 0);
    }

    public static Duration ofMillis(long l2) {
        long l3 = l2 / 1000L;
        int n2 = (int)(l2 % 1000L);
        l2 = l3;
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + 1000;
            l2 = l3 - 1L;
        }
        return Duration.m(l2, n3 * 1000000);
    }

    public static Duration ofMinutes(long l2) {
        return Duration.m(j$.nio.file.attribute.a.j(l2, 60), 0);
    }

    public static Duration ofNanos(long l2) {
        long l3 = l2 / 1000000000L;
        int n2 = (int)(l2 % 1000000000L);
        l2 = l3;
        int n3 = n2;
        if (n2 < 0) {
            n3 = (int)((long)n2 + 1000000000L);
            l2 = l3 - 1L;
        }
        return Duration.m(l2, n3);
    }

    public static Duration ofSeconds(long l2) {
        return Duration.m(l2, 0);
    }

    public static Duration ofSeconds(long l2, long l3) {
        return Duration.m(j$.nio.file.attribute.a.i(l2, j$.nio.file.attribute.a.f(l3, 1000000000L)), (int)j$.nio.file.attribute.a.h(l3, 1000000000L));
    }

    private Duration p(long l2, long l3) {
        if ((l2 | l3) == 0L) {
            return this;
        }
        return Duration.ofSeconds(j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.i(this.a, l2), l3 / 1000000000L), (long)this.b + l3 % 1000000000L);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(1, this);
    }

    @Override
    public int compareTo(Duration duration) {
        long l2 = duration.a;
        int n2 = Long.compare(this.a, l2);
        if (n2 != 0) {
            return n2;
        }
        return this.b - duration.b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof Duration) {
            object = (Duration)object;
            long l2 = ((Duration)object).a;
            if (this.a != l2 || this.b != ((Duration)object).b) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(Instant object) {
        long l2 = this.a;
        k k2 = object;
        if (l2 != 0L) {
            k2 = ((Instant)object).m(l2, ChronoUnit.SECONDS);
        }
        int n2 = this.b;
        object = k2;
        if (n2 != 0) {
            l2 = n2;
            object = ChronoUnit.NANOS;
            object = ((Instant)k2).m(l2, (ChronoUnit)object);
        }
        return object;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n2 = (int)(l2 ^ l2 >>> 32);
        return this.b * 51 + n2;
    }

    public boolean isNegative() {
        boolean bl2 = this.a < 0L;
        return bl2;
    }

    public boolean isZero() {
        boolean bl2 = ((long)this.b | this.a) == 0L;
        return bl2;
    }

    public Duration minus(Duration duration) {
        long l2 = duration.getSeconds();
        int n2 = duration.getNano();
        if (l2 == Long.MIN_VALUE) {
            return this.p(Long.MAX_VALUE, -n2).p(1L, 0L);
        }
        return this.p(-l2, -n2);
    }

    public long toHours() {
        return this.a / 3600L;
    }

    public long toMillis() {
        long l2 = this.b;
        long l3 = this.a;
        long l4 = l2;
        long l5 = l3;
        if (l3 < 0L) {
            l5 = l3 + 1L;
            l4 = l2 - 1000000000L;
        }
        return j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.j(l5, 1000), l4 / 1000000L);
    }

    public long toMinutes() {
        return this.a / 60L;
    }

    public long toNanos() {
        long l2 = this.b;
        long l3 = this.a;
        long l4 = l2;
        long l5 = l3;
        if (l3 < 0L) {
            l5 = l3 + 1L;
            l4 = l2 - 1000000000L;
        }
        return j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.j(l5, 1000000000L), l4);
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long l2 = this.a;
        int n2 = this.b;
        long l3 = l2 < 0L && n2 > 0 ? 1L + l2 : l2;
        long l4 = l3 / 3600L;
        int n3 = (int)(l3 % 3600L / 60L);
        int n4 = (int)(l3 % 60L);
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("PT");
        if (l4 != 0L) {
            stringBuilder.append(l4);
            stringBuilder.append('H');
        }
        if (n3 != 0) {
            stringBuilder.append(n3);
            stringBuilder.append('M');
        }
        if (n4 == 0 && n2 == 0 && stringBuilder.length() > 2) {
            return stringBuilder.toString();
        }
        if (l2 < 0L && n2 > 0) {
            if (n4 == 0) {
                stringBuilder.append("-0");
            } else {
                stringBuilder.append(n4);
            }
        } else {
            stringBuilder.append(n4);
        }
        if (n2 > 0) {
            n3 = stringBuilder.length();
            if (l2 < 0L) {
                stringBuilder.append(2000000000L - (long)n2);
            } else {
                stringBuilder.append((long)n2 + 1000000000L);
            }
            while (stringBuilder.charAt(stringBuilder.length() - 1) == '0') {
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            stringBuilder.setCharAt(n3, '.');
        }
        stringBuilder.append('S');
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }
}

