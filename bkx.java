/*
 * Decompiled with CFR 0.152.
 */
public final class bkx
extends Enum {
    public static final /* enum */ bkx a;
    public static final /* enum */ bkx b;
    public static final /* enum */ bkx c;
    public static final /* enum */ bkx d;
    public static final /* enum */ bkx e;
    public static final /* enum */ bkx f;
    private static final bkx[] g;

    static {
        bkx bkx2;
        bkx bkx3;
        bkx bkx4;
        bkx bkx5;
        bkx bkx6;
        bkx bkx7;
        a = bkx7 = new bkx("NONE", 0);
        b = bkx6 = new bkx("SWITCH", 1);
        c = bkx5 = new bkx("CHECK_BOX", 2);
        d = bkx4 = new bkx("RADIO_BUTTON", 3);
        e = bkx3 = new bkx("ICON", 4);
        f = bkx2 = new bkx("CHEVRON", 5);
        g = new bkx[]{bkx7, bkx6, bkx5, bkx4, bkx3, bkx2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bkx() {
        void var2_-1;
        void var1_-1;
    }

    public static bkx[] values() {
        return (bkx[])g.clone();
    }
}

