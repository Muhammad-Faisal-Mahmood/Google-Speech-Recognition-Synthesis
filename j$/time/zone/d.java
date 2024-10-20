/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.chrono.u;
import j$.time.g;
import j$.time.i;
import j$.time.k;
import j$.time.l;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.x;
import j$.time.zone.a;
import j$.time.zone.b;
import j$.time.zone.c;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class d
implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final l a;
    private final byte b;
    private final j$.time.d c;
    private final k d;
    private final boolean e;
    private final c f;
    private final x g;
    private final x h;
    private final x i;

    d(l l2, int n2, j$.time.d d2, k k2, boolean bl2, c c2, x x2, x x3, x x4) {
        this.a = l2;
        this.b = (byte)n2;
        this.c = d2;
        this.d = k2;
        this.e = bl2;
        this.f = c2;
        this.g = x2;
        this.h = x3;
        this.i = x4;
    }

    /*
     * Enabled aggressive block sorting
     */
    static d b(ObjectInput object) {
        int n2 = object.readInt();
        l l2 = l.L(n2 >>> 28);
        int n3 = ((0xFC00000 & n2) >>> 22) - 32;
        int n4 = (0x380000 & n2) >>> 19;
        j$.time.d d2 = n4 == 0 ? null : j$.time.d.I(n4);
        int n5 = (0x7C000 & n2) >>> 14;
        c c2 = j$.time.zone.c.values()[(n2 & 0x3000) >>> 12];
        n4 = (n2 & 0xFF0) >>> 4;
        int n6 = (n2 & 0xC) >>> 2;
        k k2 = n5 == 31 ? k.R(object.readInt()) : k.P(n5 % 24);
        n4 = n4 == 255 ? object.readInt() : (n4 - 128) * 900;
        x x2 = x.R(n4);
        x x3 = n6 == 3 ? x.R(object.readInt()) : x.R(n6 * 1800 + x2.O());
        object = n2 == 3 ? x.R(object.readInt()) : x.R((n2 &= 3) * 1800 + x2.O());
        boolean bl2 = n5 == 24;
        Objects.requireNonNull(l2, "month");
        Objects.requireNonNull(k2, "time");
        Objects.requireNonNull(c2, "timeDefnition");
        Objects.requireNonNull(x2, "standardOffset");
        Objects.requireNonNull(x3, "offsetBefore");
        Objects.requireNonNull(object, "offsetAfter");
        if (n3 >= -28 && n3 <= 31 && n3 != 0) {
            if (bl2 && !k2.equals(k.g)) {
                throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
            }
            if (k2.N() == 0) {
                return new d(l2, n3, d2, k2, bl2, c2, x2, x3, (x)object);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(3, this);
    }

    public final b a(int n2) {
        n n3;
        j$.time.d d2 = this.c;
        n n4 = this.a;
        byte by2 = this.b;
        if (by2 < 0) {
            n4 = n3 = j$.time.g.U(n2, (l)n4, ((l)n4).J(u.d.D(n2)) + 1 + by2);
            if (d2 != null) {
                n4 = ((g)n3).c0(new o(d2.getValue(), 1));
            }
        } else {
            n4 = n3 = j$.time.g.U(n2, (l)n4, by2);
            if (d2 != null) {
                n4 = ((g)n3).c0(new o(d2.getValue(), 0));
            }
        }
        n3 = n4;
        if (this.e) {
            n3 = ((g)n4).X(1L);
        }
        n4 = j$.time.i.Q((g)n3, this.d);
        n2 = this.f.ordinal();
        n3 = this.h;
        if (n2 != 0) {
            if (n2 == 2) {
                n4 = ((i)n4).T(((x)n3).O() - this.g.O());
            }
        } else {
            n4 = ((i)n4).T(((x)n3).O() - x.f.O());
        }
        return new b((i)n4, (x)n3, this.i);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            d d2 = (d)object;
            object = d2.a;
            if (!(this.a == object && this.b == d2.b && this.c == d2.c && this.f == d2.f && this.d.equals(d2.d) && this.e == d2.e && this.g.equals(d2.g) && this.h.equals(d2.h) && this.i.equals(d2.i))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.d.Z();
        int n3 = this.e;
        int n4 = this.a.ordinal();
        byte by2 = this.b;
        j$.time.d d2 = this.c;
        int n5 = d2 == null ? 7 : d2.ordinal();
        int n6 = this.f.ordinal();
        return this.g.hashCode() ^ n6 + ((n2 + n3 << 15) + (n4 << 11) + (by2 + 32 << 5) + (n5 << 2)) ^ this.h.hashCode() ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransitionRule[");
        x x2 = this.h;
        n n2 = this.i;
        Object object = x2.N((x)n2) > 0 ? "Gap " : "Overlap ";
        stringBuilder.append((String)object);
        stringBuilder.append(x2);
        stringBuilder.append(" to ");
        stringBuilder.append(n2);
        stringBuilder.append(", ");
        object = this.a;
        byte by2 = this.b;
        n2 = this.c;
        if (n2 != null) {
            if (by2 == -1) {
                stringBuilder.append(((Enum)((Object)n2)).name());
                stringBuilder.append(" on or before last day of ");
                stringBuilder.append(((Enum)object).name());
            } else if (by2 < 0) {
                stringBuilder.append(((Enum)((Object)n2)).name());
                stringBuilder.append(" on or before last day minus ");
                stringBuilder.append(-by2 - 1);
                stringBuilder.append(" of ");
                stringBuilder.append(((Enum)object).name());
            } else {
                stringBuilder.append(((Enum)((Object)n2)).name());
                stringBuilder.append(" on or after ");
                stringBuilder.append(((Enum)object).name());
                stringBuilder.append(' ');
                stringBuilder.append(by2);
            }
        } else {
            stringBuilder.append(((Enum)object).name());
            stringBuilder.append(' ');
            stringBuilder.append(by2);
        }
        stringBuilder.append(" at ");
        object = this.e ? "24:00" : this.d.toString();
        stringBuilder.append((String)object);
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", standard offset ");
        stringBuilder.append(this.g);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        n n2 = this.d;
        boolean bl2 = this.e;
        int n3 = bl2 ? 86400 : ((k)n2).Z();
        int n4 = this.g.O();
        x x2 = this.h;
        int n5 = x2.O() - n4;
        x x3 = this.i;
        int n6 = x3.O() - n4;
        int n7 = n3 % 3600 == 0 ? (bl2 ? 24 : ((k)n2).M()) : 31;
        int n8 = n4 % 900 == 0 ? n4 / 900 + 128 : 255;
        n5 = n5 != 0 && n5 != 1800 && n5 != 3600 ? 3 : (n5 /= 1800);
        n6 = n6 != 0 && n6 != 1800 && n6 != 3600 ? 3 : (n6 /= 1800);
        n2 = this.c;
        int n9 = n2 == null ? 0 : ((j$.time.d)n2).getValue();
        objectOutput.writeInt((this.a.getValue() << 28) + (this.b + 32 << 22) + (n9 << 19) + (n7 << 14) + (this.f.ordinal() << 12) + (n8 << 4) + (n5 << 2) + n6);
        if (n7 == 31) {
            objectOutput.writeInt(n3);
        }
        if (n8 == 255) {
            objectOutput.writeInt(n4);
        }
        if (n5 == 3) {
            objectOutput.writeInt(x2.O());
        }
        if (n6 == 3) {
            objectOutput.writeInt(x3.O());
        }
    }
}

