/*
 * Decompiled with CFR 0.152.
 */
public final class hof
extends Enum {
    public static final /* enum */ hof a;
    public static final /* enum */ hof b;
    public static final /* enum */ hof c;
    public static final /* enum */ hof d;
    public static final /* enum */ hof e;
    public static final /* enum */ hof f;
    private static final hof[] g;

    static {
        hof hof2;
        hof hof3;
        hof hof4;
        hof hof5;
        hof hof6;
        hof hof7;
        a = hof7 = new hof("OPEN", 0);
        b = hof6 = new hof("SUBSUMED", 1);
        c = hof5 = new hof("WILL_CLOSE", 2);
        d = hof4 = new hof("CLOSING", 3);
        e = hof3 = new hof("CLOSED", 4);
        f = hof2 = new hof("WILL_CREATE_VALUE_AND_CLOSER", 5);
        g = new hof[]{hof7, hof6, hof5, hof4, hof3, hof2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hof() {
        void var2_-1;
        void var1_-1;
    }

    public static hof[] values() {
        return (hof[])g.clone();
    }
}

