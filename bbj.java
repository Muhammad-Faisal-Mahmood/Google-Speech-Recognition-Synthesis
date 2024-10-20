/*
 * Decompiled with CFR 0.152.
 */
public final class bbj
extends Enum {
    public static final /* enum */ bbj a;
    public static final /* enum */ bbj b;
    public static final /* enum */ bbj c;
    public static final /* enum */ bbj d;
    public static final /* enum */ bbj e;
    public static final /* enum */ bbj f;
    private static final bbj[] g;

    static {
        bbj bbj2;
        bbj bbj3;
        bbj bbj4;
        bbj bbj5;
        bbj bbj6;
        bbj bbj7;
        a = bbj7 = new bbj("NOT_REQUIRED", 0);
        b = bbj6 = new bbj("CONNECTED", 1);
        c = bbj5 = new bbj("UNMETERED", 2);
        d = bbj4 = new bbj("NOT_ROAMING", 3);
        e = bbj3 = new bbj("METERED", 4);
        f = bbj2 = new bbj("TEMPORARILY_UNMETERED", 5);
        g = new bbj[]{bbj7, bbj6, bbj5, bbj4, bbj3, bbj2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bbj() {
        void var2_-1;
        void var1_-1;
    }

    public static bbj[] values() {
        return (bbj[])g.clone();
    }
}

