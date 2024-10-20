/*
 * Decompiled with CFR 0.152.
 */
public final class cnf
extends Enum {
    public static final /* enum */ cnf a;
    public static final /* enum */ cnf b;
    public static final /* enum */ cnf c;
    public static final /* enum */ cnf d;
    public static final /* enum */ cnf e;
    private static final cnf[] f;

    static {
        cnf cnf2;
        cnf cnf3;
        cnf cnf4;
        cnf cnf5;
        cnf cnf6;
        a = cnf6 = new cnf("UNKNOWN", 0);
        b = cnf5 = new cnf("STOP_CALLED", 1);
        c = cnf4 = new cnf("MIC_END_OF_DATA", 2);
        d = cnf3 = new cnf("ERROR", 3);
        e = cnf2 = new cnf("HOTWORD_TIMEOUT", 4);
        f = new cnf[]{cnf6, cnf5, cnf4, cnf3, cnf2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cnf() {
        void var2_-1;
        void var1_-1;
    }

    public static cnf[] values() {
        return (cnf[])f.clone();
    }
}

