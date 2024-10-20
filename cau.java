/*
 * Decompiled with CFR 0.152.
 */
public final class cau
extends Enum {
    public static final /* enum */ cau a;
    public static final /* enum */ cau b;
    public static final /* enum */ cau c;
    public static final /* enum */ cau d;
    private static final cau[] f;
    public final int e;

    static {
        cau cau2;
        cau cau3;
        cau cau4;
        cau cau5;
        a = cau5 = new cau("ZWIEBACK", 0, 2);
        b = cau4 = new cau("ANDROID_ID", 1, 4);
        c = cau3 = new cau("GAIA", 2, 8);
        d = cau2 = new cau("ACCOUNT_NAME", 3, 16);
        f = new cau[]{cau5, cau4, cau3, cau2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cau() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static cau[] values() {
        return (cau[])f.clone();
    }
}

