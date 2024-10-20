/*
 * Decompiled with CFR 0.152.
 */
public final class djb
extends Enum {
    public static final /* enum */ djb a;
    public static final /* enum */ djb b;
    public static final /* enum */ djb c;
    private static final djb[] d;

    static {
        djb djb2;
        djb djb3;
        djb djb4;
        a = djb4 = new djb("WIFI_ONLY", 0);
        b = djb3 = new djb("WIFI_OR_CELLULAR", 1);
        c = djb2 = new djb("NONE", 2);
        d = new djb[]{djb4, djb3, djb2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private djb() {
        void var2_-1;
        void var1_-1;
    }

    public static djb[] values() {
        return (djb[])d.clone();
    }
}

