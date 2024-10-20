/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.Duration;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.a;
import j$.time.c;
import j$.time.chrono.i_0;
import j$.time.e;
import j$.time.format.DateTimeFormatter;
import j$.time.g;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.k;
import j$.time.temporal.l;
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

public final class Instant
implements k,
n,
Comparable<Instant>,
Serializable {
    public static final Instant EPOCH = new Instant(0L, 0);
    public static final Instant MAX;
    public static final Instant MIN;
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    static {
        MIN = Instant.ofEpochSecond(-31557014167219200L, 0L);
        MAX = Instant.ofEpochSecond(31556889864403199L, 999999999L);
    }

    private Instant(long l2, int n2) {
        this.a = l2;
        this.b = n2;
    }

    private static Instant I(long l2, int n2) {
        if (((long)n2 | l2) == 0L) {
            return EPOCH;
        }
        if (l2 >= -31557014167219200L && l2 <= 31556889864403199L) {
            return new Instant(l2, n2);
        }
        throw new RuntimeException("Instant exceeds minimum or maximum instant");
    }

    public static Instant J(m object) {
        if (object instanceof Instant) {
            return (Instant)object;
        }
        Objects.requireNonNull(object, "temporal");
        try {
            Instant instant = Instant.ofEpochSecond(object.B(j$.time.temporal.a.INSTANT_SECONDS), object.p(j$.time.temporal.a.NANO_OF_SECOND));
            return instant;
        }
        catch (c c2) {
            String string = String.valueOf(object);
            String string2 = object.getClass().getName();
            object = new StringBuilder("Unable to obtain Instant from TemporalAccessor: ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" of type ");
            ((StringBuilder)object).append(string2);
            throw new RuntimeException(((StringBuilder)object).toString(), c2);
        }
    }

    private Instant L(long l2, long l3) {
        if ((l2 | l3) == 0L) {
            return this;
        }
        return Instant.ofEpochSecond(j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.i(this.a, l2), l3 / 1000000000L), (long)this.b + l3 % 1000000000L);
    }

    public static Instant now() {
        j$.time.a.b.getClass();
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long l2) {
        long l3 = 1000;
        return Instant.I(j$.nio.file.attribute.a.f(l2, l3), (int)j$.nio.file.attribute.a.h(l2, l3) * 1000000);
    }

    public static Instant ofEpochSecond(long l2, long l3) {
        return Instant.I(j$.nio.file.attribute.a.i(l2, j$.nio.file.attribute.a.f(l3, 1000000000L)), (int)j$.nio.file.attribute.a.h(l3, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(2, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long B(p p2) {
        if (!(p2 instanceof j$.time.temporal.a)) return p2.g(this);
        int n2 = e.a[((j$.time.temporal.a)p2).ordinal()];
        int n3 = this.b;
        if (n2 == 1) return n3;
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                return this.a;
            }
            n3 /= 1000000;
            return n3;
        }
        n3 /= 1000;
        return n3;
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.i()) {
            return ChronoUnit.NANOS;
        }
        if (r2 != l.e() && r2 != l.k() && r2 != l.j() && r2 != l.h() && r2 != l.f() && r2 != l.g()) {
            return r2.a(this);
        }
        return null;
    }

    public final int K() {
        return this.b;
    }

    public final Instant M(long l2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (e.b[((ChronoUnit)temporalUnit).ordinal()]) {
                default: {
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                }
                case 8: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 86400), 0L);
                }
                case 7: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 43200), 0L);
                }
                case 6: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 3600), 0L);
                }
                case 5: {
                    return this.L(j$.nio.file.attribute.a.j(l2, 60), 0L);
                }
                case 4: {
                    return this.L(l2, 0L);
                }
                case 3: {
                    return this.L(l2 / 1000L, l2 % 1000L * 1000000L);
                }
                case 2: {
                    return this.L(l2 / 1000000L, l2 % 1000000L * 1000L);
                }
                case 1: 
            }
            return this.L(0L, l2);
        }
        return (Instant)temporalUnit.m(this, l2);
    }

    final void N(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.I(this, zoneId);
    }

    @Override
    public final int compareTo(Object object) {
        object = (Instant)object;
        long l2 = ((Instant)object).a;
        int n2 = Long.compare(this.a, l2);
        if (n2 == 0) {
            n2 = this.b - ((Instant)object).b;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final k d(long l2, p object) {
        if (!(object instanceof j$.time.temporal.a)) return (Instant)object.s(this, l2);
        j$.time.temporal.a a2 = (j$.time.temporal.a)object;
        a2.I(l2);
        int n2 = e.a[a2.ordinal()];
        int n3 = this.b;
        long l3 = this.a;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) throw new RuntimeException("Unsupported field: ".concat(String.valueOf(object)));
                    if (l2 == l3) return this;
                    return Instant.I(l2, n3);
                }
                n2 = (int)l2 * 1000000;
                if (n2 == n3) return this;
                return Instant.I(l3, n2);
            }
            n2 = (int)l2 * 1000;
            if (n2 == n3) return this;
            return Instant.I(l3, n2);
        }
        if (l2 == (long)n3) return this;
        return Instant.I(l3, (int)l2);
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof j$.time.temporal.a;
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) {
            bl3 = bl4;
            if (p2 != j$.time.temporal.a.INSTANT_SECONDS) {
                bl3 = bl4;
                if (p2 != j$.time.temporal.a.NANO_OF_SECOND) {
                    bl3 = bl4;
                    if (p2 != j$.time.temporal.a.MICRO_OF_SECOND) {
                        bl3 = p2 == j$.time.temporal.a.MILLI_OF_SECOND ? bl4 : false;
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

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof Instant) {
            object = (Instant)object;
            long l2 = ((Instant)object).a;
            if (this.a != l2 || this.b != ((Instant)object).b) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k object) {
        Object object2 = j$.time.temporal.a.INSTANT_SECONDS;
        object2 = object.d(this.a, (p)object2);
        object = j$.time.temporal.a.NANO_OF_SECOND;
        return object2.d(this.b, (p)object);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int hashCode() {
        long l2 = this.a;
        int n2 = (int)(l2 ^ l2 >>> 32);
        return this.b * 51 + n2;
    }

    public boolean isBefore(Instant instant) {
        long l2 = instant.a;
        int n2 = Long.compare(this.a, l2);
        if (n2 == 0) {
            n2 = this.b - instant.b;
        }
        boolean bl2 = n2 < 0;
        return bl2;
    }

    @Override
    public final k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.M(Long.MAX_VALUE, (TemporalUnit)object).M(1L, (TemporalUnit)object) : this.M(-l2, (TemporalUnit)object);
        return object;
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant)temporalAmount.g(this);
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof j$.time.temporal.a) {
            int n2;
            int n3 = e.a[((j$.time.temporal.a)p2).ordinal()];
            int n4 = n2 = this.b;
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.F(this.a);
                        }
                        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(p2)));
                    }
                    return n2 / 1000000;
                }
                n4 = n2 / 1000;
            }
            return n4;
        }
        return l.d(this, p2).a(p2.g(this), p2);
    }

    @Override
    public final k s(g g2) {
        return (Instant)i_0.a(g2, this);
    }

    @Override
    public final t t(p p2) {
        return l.d(this, p2);
    }

    public long toEpochMilli() {
        int n2 = this.b;
        long l2 = this.a;
        if (l2 < 0L && n2 > 0) {
            return j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.j(l2 + 1L, 1000), n2 / 1000000 - 1000);
        }
        return j$.nio.file.attribute.a.i(j$.nio.file.attribute.a.j(l2, 1000), n2 / 1000000);
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    public Instant truncatedTo(TemporalUnit object) {
        if (object == ChronoUnit.NANOS) {
            return this;
        }
        if (((Duration)(object = object.g())).getSeconds() <= 86400L) {
            long l2 = ((Duration)object).toNanos();
            if (86400000000000L % l2 == 0L) {
                long l3 = this.a % 86400L * 1000000000L + (long)this.b;
                return this.L(0L, j$.nio.file.attribute.a.f(l3, l2) * l2 - l3);
            }
            throw new RuntimeException("Unit must divide into a standard day without remainder");
        }
        throw new RuntimeException("Unit is too large to be used for truncation");
    }
}

