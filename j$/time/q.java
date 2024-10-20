/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.chrono.i_0;
import j$.time.g;
import j$.time.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.l;
import j$.time.temporal.n;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class q
implements k,
n,
Comparable,
Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final j$.time.k a;
    private final x b;

    static {
        j$.time.k k2 = j$.time.k.e;
        x x2 = x.h;
        k2.getClass();
        q.I(k2, x2);
        k2 = j$.time.k.f;
        x2 = x.g;
        k2.getClass();
        q.I(k2, x2);
    }

    private q(j$.time.k k2, x x2) {
        this.a = Objects.requireNonNull(k2, "time");
        this.b = Objects.requireNonNull(x2, "offset");
    }

    public static q I(j$.time.k k2, x x2) {
        return new q(k2, x2);
    }

    static q K(ObjectInput objectInput) {
        return new q(j$.time.k.X(objectInput), x.T(objectInput));
    }

    private q L(j$.time.k k2, x x2) {
        if (this.a == k2 && this.b.equals(x2)) {
            return this;
        }
        return new q(k2, x2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s(9, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof a) {
            if (p2 == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.O();
            }
            return this.a.B(p2);
        }
        return p2.g(this);
    }

    @Override
    public final Object F(r r2) {
        if (r2 != l.h() && r2 != l.j()) {
            r r3 = l.k();
            boolean bl2 = false;
            boolean bl3 = r2 == r3;
            if (r2 == l.e()) {
                bl2 = true;
            }
            if (!(bl3 | bl2) && r2 != l.f()) {
                if (r2 == l.g()) {
                    return this.a;
                }
                if (r2 == l.i()) {
                    return ChronoUnit.NANOS;
                }
                return r2.a(this);
            }
            return null;
        }
        return this.b;
    }

    public final q J(long l2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return this.L(this.a.S(l2, temporalUnit), this.b);
        }
        return (q)temporalUnit.m(this, l2);
    }

    public final int compareTo(Object object) {
        int n2;
        q q2 = (q)object;
        n n3 = q2.b;
        object = this.b;
        boolean bl2 = ((x)object).equals(n3);
        n3 = q2.a;
        j$.time.k k2 = this.a;
        if (bl2) {
            n2 = k2.I((j$.time.k)n3);
        } else {
            int n4;
            n2 = n4 = Long.compare(k2.Y() - (long)((x)object).O() * 1000000000L, ((j$.time.k)n3).Y() - (long)q2.b.O() * 1000000000L);
            if (n4 == 0) {
                n2 = k2.I((j$.time.k)n3);
            }
        }
        return n2;
    }

    @Override
    public final k d(long l2, p object) {
        if (object instanceof a) {
            a a2 = j$.time.temporal.a.OFFSET_SECONDS;
            j$.time.k k2 = this.a;
            object = object == a2 ? this.L(k2, x.R(((a)object).F(l2))) : this.L(k2.a0(l2, (p)object), this.b);
        } else {
            object = (q)object.s(this, l2);
        }
        return object;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof a;
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) {
            bl3 = bl4;
            if (!((a)p2).J()) {
                bl3 = p2 == j$.time.temporal.a.OFFSET_SECONDS ? bl4 : false;
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
        if (object instanceof q) {
            q q2 = (q)object;
            object = q2.a;
            if (!this.a.equals(object) || !this.b.equals(q2.b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final k g(k k2) {
        a a2 = j$.time.temporal.a.NANO_OF_DAY;
        k2 = k2.d(this.a.Y(), a2);
        a2 = j$.time.temporal.a.OFFSET_SECONDS;
        return k2.d(this.b.O(), a2);
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
    public final int p(p p2) {
        return l.a(this, p2);
    }

    @Override
    public final k s(g g2) {
        return (q)i_0.a(g2, this);
    }

    @Override
    public final t t(p p2) {
        if (p2 instanceof a) {
            if (p2 == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((a)p2).m();
            }
            j$.time.k k2 = this.a;
            k2.getClass();
            return l.d(k2, p2);
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
        this.a.c0(objectOutput);
        this.b.U(objectOutput);
    }
}

