/*
 * Decompiled with CFR 0.152.
 */
public final class cwi
extends Enum {
    public static final /* enum */ cwi a;
    public static final /* enum */ cwi b;
    public static final /* enum */ cwi c;
    public static final /* enum */ cwi d;
    private static final cwi[] e;

    static {
        cwi cwi2;
        cwi cwi3;
        cwi cwi4;
        cwi cwi5;
        a = cwi5 = new cwi("PENDING", 0);
        b = cwi4 = new cwi("DOWNLOADED", 1);
        c = cwi3 = new cwi("FAILED", 2);
        d = cwi2 = new cwi("UNKNOWN", 3);
        e = new cwi[]{cwi5, cwi4, cwi3, cwi2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cwi() {
        void var2_-1;
        void var1_-1;
    }

    public static cwi[] values() {
        return (cwi[])e.clone();
    }
}

