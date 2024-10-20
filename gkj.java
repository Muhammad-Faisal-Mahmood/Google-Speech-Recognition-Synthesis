/*
 * Decompiled with CFR 0.152.
 */
public final class gkj
extends Enum {
    public static final /* enum */ gkj a;
    public static final /* enum */ gkj b;
    public static final /* enum */ gkj c;
    private static final gkj[] e;
    public final int d;

    static {
        gkj gkj2;
        gkj gkj3;
        gkj gkj4;
        a = gkj4 = new gkj("ON_CHARGER", 0, 1);
        b = gkj3 = new gkj("ON_NETWORK_UNMETERED", 1, 2);
        c = gkj2 = new gkj("ON_NETWORK_CONNECTED", 2, 4);
        e = new gkj[]{gkj4, gkj3, gkj2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gkj() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static gkj[] values() {
        return (gkj[])e.clone();
    }
}

