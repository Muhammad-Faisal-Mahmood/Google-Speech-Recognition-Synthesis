/*
 * Decompiled with CFR 0.152.
 */
final class dmb
extends Enum {
    public static final /* enum */ dmb a;
    public static final /* enum */ dmb b;
    public static final /* enum */ dmb c;
    public static final /* enum */ dmb d;
    public static final /* enum */ dmb e;
    private static final dmb[] f;

    static {
        dmb dmb2;
        dmb dmb3;
        dmb dmb4;
        dmb dmb5;
        dmb dmb6;
        a = dmb6 = new dmb("WAKELOCK", 0);
        b = dmb5 = new dmb("SYNC", 1);
        c = dmb4 = new dmb("JOB", 2);
        d = dmb3 = new dmb("PROCESS", 3);
        e = dmb2 = new dmb("SENSOR", 4);
        f = new dmb[]{dmb6, dmb5, dmb4, dmb3, dmb2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dmb() {
        void var2_-1;
        void var1_-1;
    }

    public static dmb[] values() {
        return (dmb[])f.clone();
    }
}

