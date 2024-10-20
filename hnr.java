/*
 * Decompiled with CFR 0.152.
 */
final class hnr
extends Enum {
    public static final /* enum */ hnr a;
    public static final /* enum */ hnr b;
    private static final hnr[] c;

    static {
        hnr hnr2;
        hnr hnr3;
        a = hnr3 = new hnr("OUTPUT_FUTURE_DONE", 0);
        b = hnr2 = new hnr("ALL_INPUT_FUTURES_PROCESSED", 1);
        c = new hnr[]{hnr3, hnr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hnr() {
        void var2_-1;
        void var1_-1;
    }

    public static hnr[] values() {
        return (hnr[])c.clone();
    }
}

