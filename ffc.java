/*
 * Decompiled with CFR 0.152.
 */
public final class ffc
extends Enum {
    public static final /* enum */ ffc a;
    public static final /* enum */ ffc b;
    public static final /* enum */ ffc c;
    public static final /* enum */ ffc d;
    public static final /* enum */ ffc e;
    public static final /* enum */ ffc f;
    public static final /* enum */ ffc g;
    public static final /* enum */ ffc h;
    public static final /* enum */ ffc i;
    private static final ffc[] j;

    static {
        ffc ffc2;
        ffc ffc3;
        ffc ffc4;
        ffc ffc5;
        ffc ffc6;
        ffc ffc7;
        ffc ffc8;
        ffc ffc9;
        ffc ffc10;
        a = ffc10 = new ffc("HEARTBEAT", 0);
        b = ffc9 = new ffc("START_OF_SPEECH", 1);
        c = ffc8 = new ffc("PARTIAL_RESULTS", 2);
        d = ffc7 = new ffc("END_OF_SPEECH", 3);
        e = ffc6 = new ffc("ERROR", 4);
        f = ffc5 = new ffc("RESULTS", 5);
        g = ffc4 = new ffc("FINISHED", 6);
        h = ffc3 = new ffc("INITIALIZE_RECOGNIZER", 7);
        i = ffc2 = new ffc("DATA_DONATION_RESPONSE", 8);
        j = new ffc[]{ffc10, ffc9, ffc8, ffc7, ffc6, ffc5, ffc4, ffc3, ffc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ffc() {
        void var2_-1;
        void var1_-1;
    }

    public static ffc[] values() {
        return (ffc[])j.clone();
    }
}

