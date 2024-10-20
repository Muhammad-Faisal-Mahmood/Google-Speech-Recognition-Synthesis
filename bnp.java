/*
 * Decompiled with CFR 0.152.
 */
public final class bnp
extends Enum {
    public static final /* enum */ bnp a;
    public static final /* enum */ bnp b;
    public static final /* enum */ bnp c;
    public static final /* enum */ bnp d;
    private static final bnp[] e;

    static {
        bnp bnp2;
        bnp bnp3;
        bnp bnp4;
        bnp bnp5;
        a = bnp5 = new bnp("HOME", 0);
        b = bnp4 = new bnp("SUBPAGE", 1);
        c = bnp3 = new bnp("SEARCH", 2);
        d = bnp2 = new bnp("EDIT", 3);
        e = new bnp[]{bnp5, bnp4, bnp3, bnp2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bnp() {
        void var2_-1;
        void var1_-1;
    }

    public static bnp[] values() {
        return (bnp[])e.clone();
    }
}

