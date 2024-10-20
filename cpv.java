/*
 * Decompiled with CFR 0.152.
 */
public final class cpv
extends Enum {
    public static final /* enum */ cpv a;
    public static final /* enum */ cpv b;
    private static final cpv[] c;

    static {
        cpv cpv2;
        cpv cpv3;
        a = cpv3 = new cpv("LOG_ERROR", 0);
        b = cpv2 = new cpv("CRASH_APP", 1);
        c = new cpv[]{cpv3, cpv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cpv() {
        void var2_-1;
        void var1_-1;
    }

    public static cpv[] values() {
        return (cpv[])c.clone();
    }
}

