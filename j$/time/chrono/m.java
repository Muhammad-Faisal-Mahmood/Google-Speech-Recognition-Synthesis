/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.G;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.i_0;
import j$.time.chrono.j_0;
import j$.time.chrono.l_0;
import j$.time.chrono.n;
import j$.time.g;
import j$.time.i;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.time.zone.b;
import j$.time.zone.e;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

final class m
implements j$.time.chrono.k,
Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient g_0 a;
    private final transient x b;
    private final transient ZoneId c;

    private m(ZoneId zoneId, x x2, g_0 g_02) {
        this.a = Objects.requireNonNull(g_02, "dateTime");
        this.b = Objects.requireNonNull(x2, "offset");
        this.c = Objects.requireNonNull(zoneId, "zone");
    }

    static j$.time.chrono.k I(ZoneId zoneId, x comparable, g_0 g_02) {
        i i2;
        Objects.requireNonNull(g_02, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof x) {
            return new m(zoneId, (x)zoneId, g_02);
        }
        e e2 = zoneId.I();
        List list = e2.g(i2 = i.J(g_02));
        if (list.size() == 1) {
            comparable = (x)list.get(0);
        } else if (list.size() == 0) {
            comparable = e2.f(i2);
            g_02 = g_02.L(((b)comparable).p().getSeconds());
            comparable = ((b)comparable).s();
        } else if (comparable == null || !list.contains(comparable)) {
            comparable = (x)list.get(0);
        }
        Objects.requireNonNull(comparable, "offset");
        return new m(zoneId, (x)comparable, g_02);
    }

    static m g(n object, j$.time.temporal.k object2) {
        if (object.equals(((m)(object2 = (m)object2)).a())) {
            return object2;
        }
        object = object.l();
        object2 = ((m)object2).a().l();
        StringBuilder stringBuilder = new StringBuilder("Chronology mismatch, required: ");
        stringBuilder.append((String)object);
        stringBuilder.append(", actual: ");
        stringBuilder.append((String)object2);
        throw new ClassCastException(stringBuilder.toString());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G(3, this);
    }

    @Override
    public final long B(p p2) {
        int n2;
        long l2 = p2 instanceof a ? ((n2 = j_0.a[((a)p2).ordinal()]) != 1 ? (n2 != 2 ? ((g_0)this.n()).B(p2) : (long)this.h().O()) : this.H()) : p2.g(this);
        return l2;
    }

    @Override
    public final /* synthetic */ Object F(r r2) {
        return i_0.l(this, r2);
    }

    @Override
    public final /* synthetic */ long H() {
        return i_0.o(this);
    }

    public final j$.time.chrono.k J(long l2, TemporalUnit object) {
        if (object instanceof ChronoUnit) {
            object = this.a.K(l2, (TemporalUnit)object);
            return m.g(this.a(), ((g_0)object).g(this));
        }
        return m.g(this.a(), object.m(this, l2));
    }

    @Override
    public final n a() {
        return this.c().a();
    }

    @Override
    public final k b() {
        return ((g_0)this.n()).b();
    }

    @Override
    public final b_0 c() {
        return ((g_0)this.n()).c();
    }

    public final /* synthetic */ int compareTo(Object object) {
        return i_0.d(this, (j$.time.chrono.k)object);
    }

    @Override
    public final j$.time.temporal.k d(long l2, p object) {
        if (object instanceof a) {
            Object object2 = (a)object;
            int n2 = l_0.a[((Enum)object2).ordinal()];
            if (n2 != 1) {
                ZoneId zoneId = this.c;
                j$.time.temporal.k k2 = this.a;
                if (n2 != 2) {
                    object = ((g_0)k2).N(l2, (p)object);
                    object = m.I(zoneId, this.b, (g_0)object);
                } else {
                    object = x.R(((a)object2).F(l2));
                    k2.getClass();
                    k2 = Instant.ofEpochSecond(i_0.n((e_0)k2, (x)object), ((g_0)k2).b().N());
                    object = this.a();
                    object2 = zoneId.I().d((Instant)k2);
                    Objects.requireNonNull(object2, "offset");
                    object = new m(zoneId, (x)object2, (g_0)object.u(i.R(((Instant)k2).getEpochSecond(), ((Instant)k2).K(), (x)object2)));
                }
            } else {
                object = this.J(l2 - i_0.o(this), ChronoUnit.SECONDS);
            }
        } else {
            object = m.g(this.a(), object.s(this, l2));
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
        if (object instanceof j$.time.chrono.k) {
            if (i_0.d(this, (j$.time.chrono.k)object) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final x h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode() ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override
    public final j$.time.chrono.k i(ZoneId zoneId) {
        g_0 g_02 = this.a;
        return m.I(zoneId, this.b, g_02);
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit chronoUnit) {
        return m.g(this.a(), l.b(this, l2, chronoUnit));
    }

    @Override
    public final e_0 n() {
        return this.a;
    }

    @Override
    public final /* synthetic */ int p(p p2) {
        return i_0.e(this, p2);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return m.g(this.a(), g2.g(this));
    }

    @Override
    public final t t(p object) {
        object = object instanceof a ? (object != j$.time.temporal.a.INSTANT_SECONDS && object != j$.time.temporal.a.OFFSET_SECONDS ? ((g_0)this.n()).t((p)object) : ((a)object).m()) : object.t(this);
        return object;
    }

    public final String toString() {
        String string = this.a.toString();
        Comparable comparable = this.b;
        String string2 = ((x)comparable).toString();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(string2);
        string = ((StringBuilder)serializable).toString();
        serializable = this.c;
        string2 = string;
        if (comparable != serializable) {
            string2 = ((ZoneId)serializable).toString();
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append("[");
            ((StringBuilder)comparable).append(string2);
            ((StringBuilder)comparable).append("]");
            string2 = ((StringBuilder)comparable).toString();
        }
        return string2;
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override
    public final ZoneId y() {
        return this.c;
    }
}

