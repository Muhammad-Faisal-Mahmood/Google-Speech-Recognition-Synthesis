/*
 * Decompiled with CFR 0.152.
 */
public final class bmv
extends Enum {
    public static final /* enum */ bmv a;
    public static final /* enum */ bmv b;
    public static final /* enum */ bmv c;
    private static final bmv[] d;

    static {
        bmv bmv2;
        bmv bmv3;
        bmv bmv4;
        a = bmv4 = new bmv("DISABLED", 0);
        b = bmv3 = new bmv("SEARCH", 1);
        c = bmv2 = new bmv("EDIT", 2);
        d = new bmv[]{bmv4, bmv3, bmv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmv() {
        void var2_-1;
        void var1_-1;
    }

    public static bmv[] values() {
        return (bmv[])d.clone();
    }
}

