/*
 * Decompiled with CFR 0.152.
 */
public final class cw
extends Enum {
    public static final /* enum */ cw a;
    public static final /* enum */ cw b;
    public static final /* enum */ cw c;
    private static final cw[] d;

    static {
        cw cw2;
        cw cw3;
        cw cw4;
        a = cw4 = new cw("NONE", 0);
        b = cw3 = new cw("ADDING", 1);
        c = cw2 = new cw("REMOVING", 2);
        d = new cw[]{cw4, cw3, cw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cw() {
        void var2_-1;
        void var1_-1;
    }

    public static cw[] values() {
        return (cw[])d.clone();
    }
}

