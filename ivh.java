/*
 * Decompiled with CFR 0.152.
 */
public final class ivh
extends Enum {
    public static final /* enum */ ivh a;
    public static final /* enum */ ivh b;
    public static final /* enum */ ivh c;
    public static final /* enum */ ivh d;
    private static final ivh[] e;

    static {
        ivh ivh2;
        ivh ivh3;
        ivh ivh4;
        ivh ivh5;
        a = ivh5 = new ivh("CT_UNKNOWN", 0);
        b = ivh4 = new ivh("CT_INFO", 1);
        c = ivh3 = new ivh("CT_WARNING", 2);
        d = ivh2 = new ivh("CT_ERROR", 3);
        e = new ivh[]{ivh5, ivh4, ivh3, ivh2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ivh() {
        void var2_-1;
        void var1_-1;
    }

    public static ivh[] values() {
        return (ivh[])e.clone();
    }
}

