/*
 * Decompiled with CFR 0.152.
 */
public final class ixv
extends Enum {
    public static final /* enum */ ixv a;
    public static final /* enum */ ixv b;
    public static final /* enum */ ixv c;
    private static final ixv[] d;

    static {
        ixv ixv2;
        ixv ixv3;
        ixv ixv4;
        a = ixv4 = new ixv("NONE", 0);
        b = ixv3 = new ixv("INTEGRITY", 1);
        c = ixv2 = new ixv("PRIVACY_AND_INTEGRITY", 2);
        d = new ixv[]{ixv4, ixv3, ixv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ixv() {
        void var2_-1;
        void var1_-1;
    }

    public static ixv[] values() {
        return (ixv[])d.clone();
    }
}

