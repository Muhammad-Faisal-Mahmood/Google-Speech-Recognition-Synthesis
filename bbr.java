/*
 * Decompiled with CFR 0.152.
 */
public final class bbr
extends Enum {
    public static final /* enum */ bbr a;
    public static final /* enum */ bbr b;
    private static final bbr[] c;

    static {
        bbr bbr2;
        bbr bbr3;
        a = bbr3 = new bbr("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        b = bbr2 = new bbr("DROP_WORK_REQUEST", 1);
        c = new bbr[]{bbr3, bbr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bbr() {
        void var2_-1;
        void var1_-1;
    }

    public static bbr[] values() {
        return (bbr[])c.clone();
    }
}

