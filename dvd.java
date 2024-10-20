/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class dvd
implements Comparable {
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final Object e;

    public dvd(long l2, String string, int n2, long l3, Object object) {
        boolean bl2 = false;
        boolean bl3 = l2 == 0L;
        boolean bl4 = string != null;
        if (bl3 == bl4) {
            bl2 = true;
        }
        fxf.q(bl2);
        this.a = l2;
        this.b = string;
        this.c = n2;
        this.d = l3;
        this.e = object;
    }

    public final Object a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                fxf.K(this.e);
                                Object object = this.e;
                                object = object instanceof byte[] ? (Object)((byte[])object) : (Object)((hvu)object).y();
                                return object;
                            }
                            throw new AssertionError((Object)"Impossible, this was validated when parsed or created");
                        }
                        fxf.K(this.e);
                        return this.e;
                    }
                    return Double.longBitsToDouble(this.d);
                }
                return this.d;
            }
            return true;
        }
        return false;
    }

    public final String b() {
        String string = this.b;
        if (string != null) {
            return string;
        }
        return Long.toString(this.a);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dvd)) {
            return false;
        }
        object = (dvd)object;
        return this.a == ((dvd)object).a && Objects.equals(this.b, ((dvd)object).b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String string = this.b();
        String string2 = String.valueOf(this.a());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

