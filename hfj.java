/*
 * Decompiled with CFR 0.152.
 */
public final class hfj
extends Enum {
    public static final /* enum */ hfj a;
    public static final /* enum */ hfj b;
    public static final /* enum */ hfj c;
    public static final /* enum */ hfj d;
    public static final /* enum */ hfj e;
    private static final hfj[] g;
    public final int f;

    static {
        hfj hfj2;
        hfj hfj3;
        hfj hfj4;
        hfj hfj5;
        hfj hfj6;
        a = hfj6 = new hfj("SMALL", 0, 10);
        b = hfj5 = new hfj("MEDIUM", 1, 20);
        c = hfj4 = new hfj("LARGE", 2, 50);
        d = hfj3 = new hfj("FULL", 3, -1);
        e = hfj2 = new hfj("NONE", 4, 0);
        g = new hfj[]{hfj6, hfj5, hfj4, hfj3, hfj2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hfj() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static hfj[] values() {
        return (hfj[])g.clone();
    }
}

