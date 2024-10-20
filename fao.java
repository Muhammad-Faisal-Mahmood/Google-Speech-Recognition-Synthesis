/*
 * Decompiled with CFR 0.152.
 */
public final class fao
extends Enum
implements hwx {
    public static final /* enum */ fao a;
    public static final /* enum */ fao b;
    public static final /* enum */ fao c;
    public static final /* enum */ fao d;
    private static final fao[] f;
    public final int e;

    static {
        fao fao2;
        fao fao3;
        fao fao4;
        fao fao5;
        a = fao5 = new fao("SETTING_UNSPECIFIED", 0, 0);
        b = fao4 = new fao("MANUAL_UPDATES_ONLY", 1, 1);
        c = fao3 = new fao("WIFI_ONLY", 2, 2);
        d = fao2 = new fao("WIFI_AND_CELLULAR", 3, 3);
        f = new fao[]{fao5, fao4, fao3, fao2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fao() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static fao b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
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

    public static fao[] values() {
        return (fao[])f.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

