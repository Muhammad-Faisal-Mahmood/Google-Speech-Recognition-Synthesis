/*
 * Decompiled with CFR 0.152.
 */
public final class bnk
extends Enum {
    public static final /* enum */ bnk a;
    public static final /* enum */ bnk b;
    public static final /* enum */ bnk c;
    public static final /* enum */ bnk d;
    private static final bnk[] e;

    static {
        bnk bnk2;
        bnk bnk3;
        bnk bnk4;
        bnk bnk5;
        a = bnk5 = new bnk("BACK", 0);
        b = bnk4 = new bnk("CLOSE", 1);
        c = bnk3 = new bnk("DOWN", 2);
        d = bnk2 = new bnk("DISABLED", 3);
        e = new bnk[]{bnk5, bnk4, bnk3, bnk2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bnk() {
        void var2_-1;
        void var1_-1;
    }

    public static bnk[] values() {
        return (bnk[])e.clone();
    }
}

