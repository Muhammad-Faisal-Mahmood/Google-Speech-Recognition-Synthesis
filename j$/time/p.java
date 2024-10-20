/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.e_0;
import j$.time.chrono.i_0;
import j$.time.chrono.u;
import j$.time.g;
import j$.time.i;
import j$.time.o;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.n;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class p
implements k,
n,
Comparable,
Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final i a;
    private final x b;

    static {
        n n2 = i.c;
        n n3 = x.h;
        n2.getClass();
        p.I(n2, (x)n3);
        n3 = i.d;
        n2 = x.g;
        n3.getClass();
        p.I((i)n3, (x)n2);
    }

    private p(i i2, x x2) {
        this.a = Objects.requireNonNull(i2, "dateTime");
        this.b = Objects.requireNonNull(x2, "offset");
    }

    public static p I(i i2, x x2) {
        return new p(i2, x2);
    }

    static p K(ObjectInput objectInput) {
        k k2 = i.c;
        k2 = g.d;
        return new p(i.Q(g.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.k.X(objectInput)), x.T(objectInput));
    }

    private p M(i i2, x x2) {
        if (this.a == i2 && this.b.equals(x2)) {
            return this;
        }
        return new p(i2, x2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(10, this);
    }

    @Override
    public final long B(j$.time.temporal.p p2) {
        if (p2 instanceof a) {
            int n2 = o.a[((a)p2).ordinal()];
            x x2 = this.b;
            i i2 = this.a;
            if (n2 != 1) {
                if (n2 != 2) {
                    return i2.B(p2);
                }
                return x2.O();
            }
            i2.getClass();
            return i_0.n(i2, x2);
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 != l.h() && r2 != l.j()) {
            if (r2 == l.k()) {
                return null;
            }
            r r3 = l.f();
            i i2 = this.a;
            if (r2 == r3) {
                return i2.V();
            }
            if (r2 == l.g()) {
                return i2.b();
            }
            if (r2 == l.e()) {
                return u.d;
            }
            if (r2 == l.i()) {
                return ChronoUnit.NANOS;
            }
            return r2.a(this);
        }
        return this.b;
    }

    public final p J(long l2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return this.M(this.a.S(l2, temporalUnit), this.b);
        }
        return (p)temporalUnit.m(this, l2);
    }

    public final i L() {
        return this.a;
    }

    public final int compareTo(Object object) {
        int n2;
        int n3;
        object = (p)object;
        n n4 = ((p)object).b;
        x x2 = this.b;
        boolean bl2 = x2.equals(n4);
        n4 = ((p)object).a;
        i i2 = this.a;
        if (bl2) {
            n3 = i2.j((e_0)n4);
        } else {
            i2.getClass();
            long l2 = i_0.n(i2, x2);
            n4.getClass();
            n3 = n2 = Long.compare(l2, i_0.n((e_0)n4, ((p)object).b));
            if (n2 == 0) {
                n3 = i2.b().N() - ((i)n4).b().N();
            }
        }
        n2 = n3;
        if (n3 == 0) {
            n2 = i2.j((e_0)n4);
        }
        return n2;
    }

    @Override
    public final k d(long l2, j$.time.temporal.p object) {
        if (object instanceof a) {
            a a2 = (a)object;
            int n2 = o.a[a2.ordinal()];
            x x2 = this.b;
            i i2 = this.a;
            if (n2 != 1) {
                object = n2 != 2 ? this.M(i2.W(l2, (j$.time.temporal.p)object), x2) : this.M(i2, x.R(a2.F(l2)));
            } else {
                object = Instant.ofEpochSecond(l2, i2.K());
                Objects.requireNonNull(object, "instant");
                Objects.requireNonNull(x2, "zone");
                x2 = ((ZoneId)x2).I().d((Instant)object);
                object = new p(i.R(((Instant)object).getEpochSecond(), ((Instant)object).K(), x2), x2);
            }
        } else {
            object = (p)object.s(this, l2);
        }
        return object;
    }

    @Override
    public final boolean e(j$.time.temporal.p p2) {
        boolean bl2 = p2 instanceof a || p2 != null && p2.p(this);
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof p) {
            object = (p)object;
            i i2 = ((p)object).a;
            if (!this.a.equals(i2) || !this.b.equals(((p)object).b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k object) {
        Object object2 = j$.time.temporal.a.EPOCH_DAY;
        k k2 = this.a;
        object2 = object.d(((i)k2).V().C(), (j$.time.temporal.p)object2);
        object = j$.time.temporal.a.NANO_OF_DAY;
        k2 = object2.d(((i)k2).b().Y(), (j$.time.temporal.p)object);
        object = j$.time.temporal.a.OFFSET_SECONDS;
        return k2.d(this.b.O(), (j$.time.temporal.p)object);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final k m(long l2, ChronoUnit object) {
        object = l2 == Long.MIN_VALUE ? this.J(Long.MAX_VALUE, (TemporalUnit)object).J(1L, (TemporalUnit)object) : this.J(-l2, (TemporalUnit)object);
        return object;
    }

    @Override
    public final int p(j$.time.temporal.p p2) {
        if (p2 instanceof a) {
            int n2 = o.a[((a)p2).ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    return this.a.p(p2);
                }
                return this.b.O();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return l.a(this, p2);
    }

    @Override
    public final k s(g g2) {
        return this.M(this.a.X(g2), this.b);
    }

    @Override
    public final t t(j$.time.temporal.p p2) {
        if (p2 instanceof a) {
            if (p2 != j$.time.temporal.a.INSTANT_SECONDS && p2 != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.t(p2);
            }
            return ((a)p2).m();
        }
        return p2.t(this);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.Z(objectOutput);
        this.b.U(objectOutput);
    }
}

