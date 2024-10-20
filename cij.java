/*
 * Decompiled with CFR 0.152.
 */
public final class cij
extends Enum
implements hwx {
    public static final /* enum */ cij a;
    public static final /* enum */ cij b;
    public static final /* enum */ cij c;
    public static final /* enum */ cij d;
    public static final /* enum */ cij e;
    public static final /* enum */ cij f;
    public static final /* enum */ cij g;
    public static final /* enum */ cij h;
    public static final /* enum */ cij i;
    public static final /* enum */ cij j;
    private static final cij[] l;
    public final int k;

    static {
        cij cij2;
        cij cij3;
        cij cij4;
        cij cij5;
        cij cij6;
        cij cij7;
        cij cij8;
        cij cij9;
        cij cij10;
        cij cij11;
        a = cij11 = new cij("UNKNOWN", 0, 0);
        b = cij10 = new cij("NULL_ACCOUNT", 1, 1);
        c = cij9 = new cij("GOOGLE", 2, 2);
        d = cij8 = new cij("DEVICE", 3, 3);
        e = cij7 = new cij("SIM", 4, 4);
        f = cij6 = new cij("EXCHANGE", 5, 5);
        g = cij5 = new cij("THIRD_PARTY_EDITABLE", 6, 6);
        h = cij4 = new cij("THIRD_PARTY_READONLY", 7, 7);
        i = cij3 = new cij("SIM_SDN", 8, 8);
        j = cij2 = new cij("PRELOAD_SDN", 9, 9);
        l = new cij[]{cij11, cij10, cij9, cij8, cij7, cij6, cij5, cij4, cij3, cij2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cij() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.k = var3_2;
    }

    public static cij[] values() {
        return (cij[])l.clone();
    }

    @Override
    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}

