/*
 * Decompiled with CFR 0.152.
 */
public final class bty
extends Enum
implements hwx {
    public static final /* enum */ bty a;
    public static final /* enum */ bty b;
    public static final /* enum */ bty c;
    public static final /* enum */ bty d;
    public static final /* enum */ bty e;
    public static final /* enum */ bty f;
    private static final bty[] g;
    private final int h;

    static {
        bty bty2;
        bty bty3;
        bty bty4;
        bty bty5;
        bty bty6;
        bty bty7;
        a = bty7 = new bty("TTS_UNDEFINED", 0, 0);
        b = bty6 = new bty("TTS_UNRESTRICTED_DEFAULT", 1, 1);
        c = bty5 = new bty("TTS_UNRESTRICTED_ALTERNATIVE", 2, 2);
        d = bty4 = new bty("TTS_FIRST_PARTY_PREFERRED", 3, 3);
        e = bty3 = new bty("TTS_GOOGLE_ONLY_DEFAULT", 4, 4);
        f = bty2 = new bty("TTS_GOOGLE_ONLY_ALTERNATIVE", 5, 5);
        g = new bty[]{bty7, bty6, bty5, bty4, bty3, bty2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bty() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.h = var3_2;
    }

    public static bty b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return null;
                            }
                            return f;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static bty[] values() {
        return (bty[])g.clone();
    }

    @Override
    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}

