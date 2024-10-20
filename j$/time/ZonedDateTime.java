/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.i_0;
import j$.time.chrono.n;
import j$.time.format.DateTimeFormatter;
import j$.time.g;
import j$.time.i;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.time.z;
import j$.time.zone.b;
import j$.time.zone.e;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

public final class ZonedDateTime
implements k,
j$.time.chrono.k,
Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final i a;
    private final x b;
    private final ZoneId c;

    private ZonedDateTime(i i2, ZoneId zoneId, x x2) {
        this.a = i2;
        this.b = x2;
        this.c = zoneId;
    }

    public static ZonedDateTime I(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.g(instant.getEpochSecond(), instant.K(), zoneId);
    }

    public static ZonedDateTime J(i i2, ZoneId zoneId, x comparable) {
        Objects.requireNonNull(i2, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof x) {
            return new ZonedDateTime(i2, zoneId, (x)zoneId);
        }
        e e2 = zoneId.I();
        List list = e2.g(i2);
        if (list.size() == 1) {
            comparable = (x)list.get(0);
        } else if (list.size() == 0) {
            comparable = e2.f(i2);
            i2 = i2.T(((b)comparable).p().getSeconds());
            comparable = ((b)comparable).s();
        } else if (comparable == null || !list.contains(comparable)) {
            comparable = Objects.requireNonNull((x)list.get(0), "offset");
        }
        return new ZonedDateTime(i2, zoneId, (x)comparable);
    }

    static ZonedDateTime L(ObjectInput object) {
        k k2 = i.c;
        k2 = g.d;
        k2 = i.Q(g.T(object.readInt(), object.readByte(), object.readByte()), j$.time.k.X((ObjectInput)object));
        x x2 = x.T((ObjectInput)object);
        object = (ZoneId)s.a((ObjectInput)object);
        Objects.requireNonNull(k2, "localDateTime");
        Objects.requireNonNull(x2, "offset");
        Objects.requireNonNull(object, "zone");
        if (object instanceof x && !x2.equals(object)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime((i)k2, (ZoneId)object, x2);
    }

    private static ZonedDateTime g(long l2, int n2, ZoneId zoneId) {
        x x2 = zoneId.I().d(Instant.ofEpochSecond(l2, n2));
        return new ZonedDateTime(i.R(l2, n2, x2), zoneId, x2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(6, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            int n2 = z.a[((a)p2).ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    return this.a.B(p2);
                }
                return this.b.O();
            }
            return i_0.o(this);
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 == l.f()) {
            return this.a.V();
        }
        return i_0.l(this, r2);
    }

    @Override
    public final /* synthetic */ long H() {
        return i_0.o(this);
    }

    public final ZonedDateTime K(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit)object;
            int n2 = chronoUnit.compareTo(ChronoUnit.DAYS);
            x x2 = this.b;
            ZoneId zoneId = this.c;
            i i2 = this.a;
            if (n2 >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return ZonedDateTime.J(i2.S(l2, (TemporalUnit)object), zoneId, x2);
            }
            object = i2.S(l2, (TemporalUnit)object);
            Objects.requireNonNull(object, "localDateTime");
            Objects.requireNonNull(x2, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.I().g((i)object).contains(x2)) {
                object = new ZonedDateTime((i)object, zoneId, x2);
            } else {
                object.getClass();
                object = ZonedDateTime.g(i_0.n((e_0)object, x2), ((i)object).K(), zoneId);
            }
            return object;
        }
        return (ZonedDateTime)object.m(this, l2);
    }

    public final i M() {
        return this.a;
    }

    final void N(DataOutput dataOutput) {
        this.a.Z(dataOutput);
        this.b.U(dataOutput);
        this.c.M((ObjectOutput)dataOutput);
    }

    @Override
    public final n a() {
        return ((g)this.c()).a();
    }

    @Override
    public final j$.time.k b() {
        return this.a.b();
    }

    @Override
    public final b_0 c() {
        return this.a.V();
    }

    public final /* synthetic */ int compareTo(Object object) {
        return i_0.d(this, (j$.time.chrono.k)object);
    }

    @Override
    public final k d(long l2, p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            int n2 = z.a[a2.ordinal()];
            i i2 = this.a;
            ZoneId zoneId = this.c;
            if (n2 != 1) {
                x x2 = this.b;
                object = n2 != 2 ? ZonedDateTime.J(i2.W(l2, (p)object), zoneId, x2) : (!((x)(object = x.R(a2.F(l2)))).equals(x2) && zoneId.I().g(i2).contains(object) ? new ZonedDateTime(i2, zoneId, (x)object) : this);
            } else {
                object = ZonedDateTime.g(l2, i2.K(), zoneId);
            }
        } else {
            object = (ZonedDateTime)object.s(this, l2);
        }
        return object;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a || p2 != null && p2.p(this);
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime)object;
            object = zonedDateTime.a;
            if (!(this.a.equals(object) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override
    public final x h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode() ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override
    public final j$.time.chrono.k i(ZoneId serializable) {
        Objects.requireNonNull(serializable, "zone");
        serializable = this.c.equals(serializable) ? this : ZonedDateTime.J(this.a, serializable, this.b);
        return serializable;
    }

    @Override
    public final k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.K(Long.MAX_VALUE, (TemporalUnit)object).K(1L, (TemporalUnit)object) : this.K(-l2, (TemporalUnit)object);
        return object;
    }

    @Override
    public final e_0 n() {
        return this.a;
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof a) {
            int n2 = z.a[((a)p2).ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    return this.a.p(p2);
                }
                return this.b.O();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return i_0.e(this, p2);
    }

    @Override
    public final k s(g g2) {
        return ZonedDateTime.J(i.Q(g2, this.a.b()), this.c, this.b);
    }

    @Override
    public final t t(p p2) {
        if (p2 instanceof a) {
            if (p2 != j$.time.temporal.a.INSTANT_SECONDS && p2 != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.t(p2);
            }
            return ((a)p2).m();
        }
        return p2.t(this);
    }

    public final String toString() {
        Object object = this.a.toString();
        Object object2 = this.b;
        CharSequence charSequence = ((x)object2).toString();
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append((String)object);
        charSequence2.append((String)charSequence);
        charSequence2 = charSequence2.toString();
        object = this.c;
        charSequence = charSequence2;
        if (object2 != object) {
            object2 = ((ZoneId)object).toString();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append("[");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("]");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    @Override
    public final ZoneId y() {
        return this.c;
    }
}

