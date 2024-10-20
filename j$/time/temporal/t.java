/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.temporal.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class t
implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private t(long l2, long l3, long l4, long l5) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l5;
    }

    private String c(long l2, p object) {
        if (object != null) {
            String string = String.valueOf(object);
            object = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder("Invalid value for ");
            stringBuilder.append(string);
            stringBuilder.append(" (valid values ");
            stringBuilder.append((String)object);
            stringBuilder.append("): ");
            stringBuilder.append(l2);
            return stringBuilder.toString();
        }
        String string = String.valueOf(this);
        object = new StringBuilder("Invalid value (valid values ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("): ");
        ((StringBuilder)object).append(l2);
        return ((StringBuilder)object).toString();
    }

    public static t j(long l2, long l3) {
        if (l2 <= l3) {
            return new t(l2, l2, l3, l3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static t k(long l2, long l3, long l4) {
        if (l2 <= 1L) {
            if (l3 <= l4) {
                if (1L <= l4) {
                    return new t(l2, 1L, l3, l4);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long l2 = this.a;
        long l3 = this.b;
        if (l2 <= l3) {
            long l4 = this.c;
            l2 = this.d;
            if (l4 <= l2) {
                if (l3 <= l2) {
                    return;
                }
                throw new InvalidObjectException("Minimum value must be less than maximum value");
            }
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
    }

    public final int a(long l2, p p2) {
        if (this.h() && this.i(l2)) {
            return (int)l2;
        }
        throw new RuntimeException(this.c(l2, p2));
    }

    public final void b(long l2, p p2) {
        if (this.i(l2)) {
            return;
        }
        throw new RuntimeException(this.c(l2, p2));
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof t) {
            object = (t)object;
            long l2 = ((t)object).a;
            if (this.a != l2 || this.b != ((t)object).b || this.c != ((t)object).c || this.d != ((t)object).d) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        boolean bl2 = this.a == this.b && this.c == this.d;
        return bl2;
    }

    public final boolean h() {
        boolean bl2 = this.a >= Integer.MIN_VALUE && this.d <= Integer.MAX_VALUE;
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.b;
        long l3 = this.a;
        long l4 = this.c;
        long l5 = this.d;
        l5 = l3 + (l2 << 16) + (l2 >> 48) + (l4 << 32) + (l4 >> 32) + (l5 << 48) + (l5 >> 16);
        return (int)(l5 >>> 32 ^ l5);
    }

    public final boolean i(long l2) {
        boolean bl2 = l2 >= this.a && l2 <= this.d;
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        long l2 = this.a;
        stringBuilder.append(l2);
        long l3 = this.b;
        if (l2 != l3) {
            stringBuilder.append('/');
            stringBuilder.append(l3);
        }
        stringBuilder.append(" - ");
        l3 = this.c;
        stringBuilder.append(l3);
        l2 = this.d;
        if (l3 != l2) {
            stringBuilder.append('/');
            stringBuilder.append(l2);
        }
        return stringBuilder.toString();
    }
}

