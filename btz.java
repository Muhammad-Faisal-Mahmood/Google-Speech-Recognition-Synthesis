/*
 * Decompiled with CFR 0.152.
 */
public final class btz
extends Enum
implements hwx {
    public static final /* enum */ btz a;
    public static final /* enum */ btz b;
    public static final /* enum */ btz c;
    public static final /* enum */ btz d;
    private static final btz[] e;
    private final int f;

    static {
        btz btz2;
        btz btz3;
        btz btz4;
        btz btz5;
        a = btz5 = new btz("TYPE_UNKNOWN_PLATFORM", 0, 0);
        b = btz4 = new btz("TYPE_CPU", 1, 1);
        c = btz3 = new btz("TYPE_DARWINN_JANEIRO", 2, 3);
        d = btz2 = new btz("TYPE_DARWINN_RIO", 3, 4);
        e = new btz[]{btz5, btz4, btz3, btz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private btz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static btz b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return null;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static btz[] values() {
        return (btz[])e.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

