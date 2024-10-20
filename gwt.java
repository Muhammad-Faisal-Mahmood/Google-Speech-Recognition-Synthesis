/*
 * Decompiled with CFR 0.152.
 */
public final class gwt
extends Enum {
    public static final /* enum */ gwt a;
    public static final /* enum */ gwt b;
    public static final /* enum */ gwt c;
    public static final /* enum */ gwt d;
    public static final /* enum */ gwt e;
    private static final gwt[] f;

    static {
        gwt gwt2;
        gwt gwt3;
        gwt gwt4;
        gwt gwt5;
        gwt gwt6;
        a = gwt6 = new gwt("EXPLICIT", 0);
        b = gwt5 = new gwt("REPLACED", 1);
        c = gwt4 = new gwt("COLLECTED", 2);
        d = gwt3 = new gwt("EXPIRED", 3);
        e = gwt2 = new gwt("SIZE", 4);
        f = new gwt[]{gwt6, gwt5, gwt4, gwt3, gwt2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gwt() {
        void var2_-1;
        void var1_-1;
    }

    public static gwt[] values() {
        return (gwt[])f.clone();
    }
}

