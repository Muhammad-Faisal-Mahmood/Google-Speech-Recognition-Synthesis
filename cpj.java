/*
 * Decompiled with CFR 0.152.
 */
public final class cpj
extends Enum {
    public static final /* enum */ cpj a;
    public static final /* enum */ cpj b;
    private static final cpj[] c;

    static {
        cpj cpj2;
        cpj cpj3;
        a = cpj3 = new cpj("NON_ASYNC_HANDLER", 0);
        b = cpj2 = new cpj("ASYNC_HANDLER", 1);
        c = new cpj[]{cpj3, cpj2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cpj() {
        void var2_-1;
        void var1_-1;
    }

    public static cpj[] values() {
        return (cpj[])c.clone();
    }
}

