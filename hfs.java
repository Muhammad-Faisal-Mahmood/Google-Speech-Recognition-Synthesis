/*
 * Decompiled with CFR 0.152.
 */
public final class hfs
extends Enum {
    public static final /* enum */ hfs a;
    public static final /* enum */ hfs b;
    public static final /* enum */ hfs c;
    public static final /* enum */ hfs d;
    public static final /* enum */ hfs e;
    private static final hfs[] g;
    public final boolean f;

    static {
        hfs hfs2;
        hfs hfs3;
        hfs hfs4;
        hfs hfs5;
        hfs hfs6;
        a = hfs6 = new hfs("GENERAL", 0, true);
        b = hfs5 = new hfs("BOOLEAN", 1, false);
        c = hfs4 = new hfs("CHARACTER", 2, false);
        d = hfs3 = new hfs("INTEGRAL", 3, false);
        e = hfs2 = new hfs("FLOAT", 4, true);
        g = new hfs[]{hfs6, hfs5, hfs4, hfs3, hfs2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hfs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static hfs[] values() {
        return (hfs[])g.clone();
    }
}

