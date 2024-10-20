/*
 * Decompiled with CFR 0.152.
 */
public final class htk
extends Enum {
    public static final /* enum */ htk a;
    public static final /* enum */ htk b;
    public static final /* enum */ htk c;
    public static final /* enum */ htk d;
    public static final /* enum */ htk e;
    private static final htk[] f;

    static {
        htk htk2;
        htk htk3;
        htk htk4;
        htk htk5;
        htk htk6;
        a = htk6 = new htk("PROCEED", 0);
        b = htk5 = new htk("ABORT_WITH_EXCEPTION", 1);
        c = htk4 = new htk("ABORT_WITH_RESPONSE", 2);
        d = htk3 = new htk("CONTINUE_AFTER", 3);
        e = htk2 = new htk("DELAY_START", 4);
        f = new htk[]{htk6, htk5, htk4, htk3, htk2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private htk() {
        void var2_-1;
        void var1_-1;
    }

    public static htk[] values() {
        return (htk[])f.clone();
    }
}

