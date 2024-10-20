/*
 * Decompiled with CFR 0.152.
 */
public final class jlv {
    public static final klp a = kmp.v(":status");
    public static final klp b = kmp.v(":method");
    public static final klp c = kmp.v(":path");
    public static final klp d = kmp.v(":scheme");
    public static final klp e = kmp.v(":authority");
    public final klp f;
    public final klp g;
    final int h;

    static {
        kmp.v(":host");
        kmp.v(":version");
    }

    public jlv(String string, String string2) {
        this(kmp.v(string), kmp.v(string2));
    }

    public jlv(klp klp2, String string) {
        this(klp2, kmp.v(string));
    }

    public jlv(klp klp2, klp klp3) {
        this.f = klp2;
        this.g = klp3;
        this.h = klp2.b() + 32 + klp3.b();
    }

    public final boolean equals(Object object) {
        if (object instanceof jlv) {
            object = (jlv)object;
            if (this.f.equals(((jlv)object).f) && this.g.equals(((jlv)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + 527) * 31 + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }
}

