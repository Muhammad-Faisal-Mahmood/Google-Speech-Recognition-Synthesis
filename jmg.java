/*
 * Decompiled with CFR 0.152.
 */
public final class jmg {
    public final String a;
    public final int b;
    private final String c;

    public jmg(jmf jmf2) {
        this.a = jmf2.b;
        this.b = jmf2.a();
        this.c = jmf2.toString();
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 87;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - 55;
        }
        return -1;
    }

    public static int b(String string) {
        if (string.equals("http")) {
            return 80;
        }
        if (string.equals("https")) {
            return 443;
        }
        return -1;
    }

    public final boolean equals(Object object) {
        return object instanceof jmg && ((jmg)object).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}

