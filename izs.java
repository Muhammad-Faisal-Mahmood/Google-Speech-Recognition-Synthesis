/*
 * Decompiled with CFR 0.152.
 */
final class izs
extends Enum {
    public static final /* enum */ izs a;
    public static final /* enum */ izs b;
    public static final /* enum */ izs c;
    public static final /* enum */ izs d;
    public static final /* enum */ izs e;
    public static final /* enum */ izs f;
    private static final izs[] g;

    static {
        izs izs2;
        izs izs3;
        izs izs4;
        izs izs5;
        izs izs6;
        izs izs7;
        a = izs7 = new izs("UNINITIALIZED", 0);
        b = izs6 = new izs("INITIALIZED", 1);
        c = izs5 = new izs("PREFIX_DELIVERED", 2);
        d = izs4 = new izs("ALL_MESSAGES_DELIVERED", 3);
        e = izs3 = new izs("SUFFIX_DELIVERED", 4);
        f = izs2 = new izs("CLOSED", 5);
        g = new izs[]{izs7, izs6, izs5, izs4, izs3, izs2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private izs() {
        void var2_-1;
        void var1_-1;
    }

    public static izs[] values() {
        return (izs[])g.clone();
    }
}

