/*
 * Decompiled with CFR 0.152.
 */
public final class kir {
    public static final klp a;
    public static final klp b;
    public static final klp c;
    public static final klp d;
    public static final klp e;
    public static final klp f;
    public final klp g;
    public final klp h;
    public final int i;

    static {
        klp klp2 = klp.a;
        a = kmp.v(":");
        b = kmp.v(":status");
        c = kmp.v(":method");
        d = kmp.v(":path");
        e = kmp.v(":scheme");
        f = kmp.v(":authority");
    }

    public kir(String string, String string2) {
        jse.e(string, "name");
        jse.e(string2, "value");
        klp klp2 = klp.a;
        this(kmp.v(string), kmp.v(string2));
    }

    public kir(klp klp2, String string) {
        jse.e(klp2, "name");
        jse.e(string, "value");
        klp klp3 = klp.a;
        this(klp2, kmp.v(string));
    }

    public kir(klp klp2, klp klp3) {
        jse.e(klp2, "name");
        jse.e(klp3, "value");
        this.g = klp2;
        this.h = klp3;
        this.i = klp2.b() + 32 + klp3.b();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof kir)) {
            return false;
        }
        object = (kir)object;
        if (!jse.i(this.g, ((kir)object).g)) {
            return false;
        }
        return jse.i(this.h, ((kir)object).h);
    }

    public final int hashCode() {
        return this.g.hashCode() * 31 + this.h.hashCode();
    }

    public final String toString() {
        Object object = this.h;
        String string = this.g.e();
        object = ((klp)object).e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

