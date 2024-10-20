/*
 * Decompiled with CFR 0.152.
 */
final class gbi
extends Enum {
    public static final /* enum */ gbi a;
    public static final /* enum */ gbi b;
    public static final /* enum */ gbi c;
    private static final gbi[] d;

    static {
        gbi gbi2;
        gbi gbi3;
        gbi gbi4;
        a = gbi4 = new gbi("STOPPED", 0);
        b = gbi3 = new gbi("STARTING", 1);
        c = gbi2 = new gbi("STARTED", 2);
        d = new gbi[]{gbi4, gbi3, gbi2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gbi() {
        void var2_-1;
        void var1_-1;
    }

    public static gbi[] values() {
        return (gbi[])d.clone();
    }
}

