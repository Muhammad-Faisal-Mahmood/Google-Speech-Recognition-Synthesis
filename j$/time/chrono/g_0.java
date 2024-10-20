/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.nio.file.attribute.a;
import j$.time.chrono.G;
import j$.time.chrono.b_0;
import j$.time.chrono.d_0;
import j$.time.chrono.e_0;
import j$.time.chrono.f_0;
import j$.time.chrono.i_0;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.x;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/*
 * Renamed from j$.time.chrono.g
 */
final class g_0
implements e_0,
j$.time.temporal.k,
j$.time.temporal.n,
Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient b_0 a;
    private final transient k b;

    private g_0(b_0 b_02, k k2) {
        Objects.requireNonNull(b_02, "date");
        Objects.requireNonNull(k2, "time");
        this.a = b_02;
        this.b = k2;
    }

    static g_0 I(n object, j$.time.temporal.k object2) {
        object2 = (g_0)object2;
        if (object.equals(((g_0)object2).a.a())) {
            return object2;
        }
        object = object.l();
        object2 = ((g_0)object2).a.a().l();
        StringBuilder stringBuilder = new StringBuilder("Chronology mismatch, required: ");
        stringBuilder.append((String)object);
        stringBuilder.append(", actual: ");
        stringBuilder.append((String)object2);
        throw new ClassCastException(stringBuilder.toString());
    }

    static g_0 J(b_0 b_02, k k2) {
        return new g_0(b_02, k2);
    }

    private g_0 M(b_0 b_02, long l2, long l3, long l4, long l5) {
        k k2 = this.b;
        if ((l2 | l3 | l4 | l5) == 0L) {
            return this.O(b_02, k2);
        }
        long l6 = l5 / 86400000000000L;
        long l7 = l4 / 86400L;
        long l8 = l3 / 1440L;
        long l9 = l2 / 24L;
        long l10 = k2.Y();
        l3 = l2 % 24L * 3600000000000L + (l3 % 1440L * 60000000000L + (l4 % 86400L * 1000000000L + l5 % 86400000000000L)) + l10;
        l2 = j$.nio.file.attribute.a.f(l3, 86400000000000L);
        if ((l3 = j$.nio.file.attribute.a.h(l3, 86400000000000L)) != l10) {
            k2 = k.Q(l3);
        }
        return this.O(b_02.f(l2 + (l9 + (l8 + (l7 + l6))), ChronoUnit.DAYS), k2);
    }

    private g_0 O(j$.time.temporal.k k2, k k3) {
        b_0 b_02 = this.a;
        if (b_02 == k2 && this.b == k3) {
            return this;
        }
        return new g_0(d_0.I(b_02.a(), k2), k3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G(2, this);
    }

    @Override
    public final long B(p p2) {
        if (p2 instanceof j$.time.temporal.a) {
            long l2 = ((j$.time.temporal.a)p2).J() ? this.b.B(p2) : this.a.B(p2);
            return l2;
        }
        return p2.g(this);
    }

    @Override
    public final /* synthetic */ Object F(r r2) {
        return i_0.k(this, r2);
    }

    public final g_0 K(long l2, TemporalUnit object) {
        boolean bl2 = object instanceof ChronoUnit;
        b_0 b_02 = this.a;
        if (bl2) {
            Object object2 = (ChronoUnit)object;
            int n2 = f_0.a[((Enum)object2).ordinal()];
            object2 = this.b;
            switch (n2) {
                default: {
                    return this.O(b_02.f(l2, (TemporalUnit)object), (k)object2);
                }
                case 7: {
                    object = this.O(b_02.f(l2 / 256L, ChronoUnit.DAYS), (k)object2);
                    return super.M(((g_0)object).a, l2 % 256L * 12L, 0L, 0L, 0L);
                }
                case 6: {
                    return this.M(this.a, l2, 0L, 0L, 0L);
                }
                case 5: {
                    return this.M(this.a, 0L, l2, 0L, 0L);
                }
                case 4: {
                    return this.L(l2);
                }
                case 3: {
                    object = this.O(b_02.f(l2 / 86400000L, ChronoUnit.DAYS), (k)object2);
                    return super.M(((g_0)object).a, 0L, 0L, 0L, l2 % 86400000L * 1000000L);
                }
                case 2: {
                    object = this.O(b_02.f(l2 / 86400000000L, ChronoUnit.DAYS), (k)object2);
                    return super.M(((g_0)object).a, 0L, 0L, 0L, l2 % 86400000000L * 1000L);
                }
                case 1: 
            }
            return this.M(this.a, 0L, 0L, 0L, l2);
        }
        return g_0.I(b_02.a(), object.m(this, l2));
    }

    final g_0 L(long l2) {
        return this.M(this.a, 0L, 0L, l2, 0L);
    }

    public final g_0 N(long l2, p p2) {
        boolean bl2 = p2 instanceof j$.time.temporal.a;
        b_0 b_02 = this.a;
        if (bl2) {
            bl2 = ((j$.time.temporal.a)p2).J();
            k k2 = this.b;
            if (bl2) {
                return this.O(b_02, k2.a0(l2, p2));
            }
            return this.O(b_02.d(l2, p2), k2);
        }
        return g_0.I(b_02.a(), p2.s(this, l2));
    }

    @Override
    public final n a() {
        return this.a.a();
    }

    @Override
    public final k b() {
        return this.b;
    }

    @Override
    public final b_0 c() {
        return this.a;
    }

    @Override
    public final boolean e(p p2) {
        boolean bl2 = p2 instanceof j$.time.temporal.a;
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) {
            p2 = (j$.time.temporal.a)p2;
            bl3 = bl4;
            if (!((j$.time.temporal.a)p2).B()) {
                bl3 = ((j$.time.temporal.a)p2).J() ? bl4 : false;
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
        if (object instanceof e_0) {
            if (i_0.c(this, (e_0)object) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final j$.time.temporal.k g(j$.time.temporal.k k2) {
        j$.time.temporal.a a2 = j$.time.temporal.a.EPOCH_DAY;
        k2 = k2.d(this.c().C(), a2);
        a2 = j$.time.temporal.a.NANO_OF_DAY;
        return k2.d(this.b().Y(), a2);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final /* synthetic */ int j(e_0 e_02) {
        return i_0.c(this, e_02);
    }

    @Override
    public final j$.time.temporal.k m(long l2, ChronoUnit chronoUnit) {
        return g_0.I(this.a.a(), l.b(this, l2, chronoUnit));
    }

    @Override
    public final int p(p p2) {
        if (p2 instanceof j$.time.temporal.a) {
            int n2 = ((j$.time.temporal.a)p2).J() ? this.b.p(p2) : this.a.p(p2);
            return n2;
        }
        return this.t(p2).a(this.B(p2), p2);
    }

    @Override
    public final j$.time.temporal.k s(g g2) {
        return this.O(g2, this.b);
    }

    @Override
    public final t t(p object) {
        if (object instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a)object).J()) {
                k k2 = this.b;
                k2.getClass();
                object = l.d(k2, (p)object);
            } else {
                object = this.a.t((p)object);
            }
            return object;
        }
        return object.t(this);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("T");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public final j$.time.chrono.k w(x x2) {
        return m.I(x2, null, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }
}

