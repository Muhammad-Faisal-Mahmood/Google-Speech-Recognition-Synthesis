/*
 * Decompiled with CFR 0.152.
 */
public final class gor
extends Enum {
    public static final /* enum */ gor a;
    public static final /* enum */ gor b;
    public static final /* enum */ gor c;
    private static final gor[] d;

    static {
        gor gor2;
        gor gor3;
        gor gor4;
        a = gor4 = new gor("DISABLED", 0);
        b = gor3 = new gor("THROW_ON_FAILURE", 1);
        c = gor2 = new gor("LOG_ON_FAILURE", 2);
        d = new gor[]{gor4, gor3, gor2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gor() {
        void var2_-1;
        void var1_-1;
    }

    public static gor[] values() {
        return (gor[])d.clone();
    }
}

