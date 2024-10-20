/*
 * Decompiled with CFR 0.152.
 */
public final class hfr {
    public static final hfr a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    static {
        long l2 = 0L;
        for (int i2 = 0; i2 < 7; ++i2) {
            char c2 = " #(+,-0".charAt(i2);
            l2 |= (long)i2 + 1L << (int)((long)(c2 - 32) * 3L);
        }
        e = l2;
        a = new hfr(0, -1, -1);
    }

    public hfr(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public static int a(char c2) {
        return (int)(e >>> (c2 - 32) * 3 & 7L) - 1;
    }

    public static int b(String string, int n2, int n3) {
        if (n2 != n3) {
            int n4 = 0;
            int n5 = 0;
            for (int i2 = n2; i2 < n3; ++i2) {
                char c2 = (char)(string.charAt(i2) - 48);
                if (c2 < '\n') {
                    if ((n5 = n5 * 10 + c2) <= 999999) {
                        continue;
                    }
                    throw hia.b("precision too large", string, n2, n3);
                }
                throw hia.a("invalid precision character", string, i2);
            }
            if (n5 == 0) {
                if (n3 == n2 + 1) {
                    n5 = n4;
                } else {
                    throw hia.b("invalid precision", string, n2, n3);
                }
            }
            return n5;
        }
        throw hia.a("missing precision", string, n2 - 1);
    }

    public final boolean c() {
        return this == a;
    }

    public final boolean d() {
        return (this.b & 0x80) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean e(int n2, boolean bl2) {
        boolean bl3 = this.c();
        boolean bl4 = true;
        if (bl3) {
            return true;
        }
        int n3 = this.b;
        if ((~n2 & n3) != 0) {
            return false;
        }
        if (!bl2) {
            if (this.d != -1) return false;
        }
        n2 = this.c;
        if ((n3 & 9) == 9) return false;
        if ((n3 &= 0x60) == 96) return false;
        bl2 = bl4;
        if (n3 == 0) return bl2;
        if (n2 == -1) return false;
        return bl4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hfr) {
            object = (hfr)object;
            if (((hfr)object).b == this.b && ((hfr)object).c == this.c && ((hfr)object).d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder stringBuilder) {
        if (!this.c()) {
            int n2;
            int n3;
            int n4 = this.b;
            int n5 = 0;
            while ((n3 = 1 << n5) <= (n2 = n4 & 0xFFFFFF7F)) {
                if ((n2 & n3) != 0) {
                    stringBuilder.append(" #(+,-0".charAt(n5));
                }
                ++n5;
            }
            n5 = this.c;
            if (n5 != -1) {
                stringBuilder.append(n5);
            }
            if (this.d != -1) {
                stringBuilder.append('.');
                stringBuilder.append(this.d);
            }
        }
    }

    public final int hashCode() {
        return (this.b * 31 + this.c) * 31 + this.d;
    }
}

