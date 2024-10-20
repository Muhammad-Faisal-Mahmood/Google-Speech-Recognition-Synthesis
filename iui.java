/*
 * Decompiled with CFR 0.152.
 */
public final class iui
extends Enum {
    public static final /* enum */ iui a;
    public static final /* enum */ iui b;
    public static final /* enum */ iui c;
    public static final /* enum */ iui d;
    public static final /* enum */ iui e;
    private static final iui[] f;

    static {
        iui iui2;
        iui iui3;
        iui iui4;
        iui iui5;
        iui iui6;
        a = iui6 = new iui("CONNECTING", 0);
        b = iui5 = new iui("READY", 1);
        c = iui4 = new iui("TRANSIENT_FAILURE", 2);
        d = iui3 = new iui("IDLE", 3);
        e = iui2 = new iui("SHUTDOWN", 4);
        f = new iui[]{iui6, iui5, iui4, iui3, iui2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iui() {
        void var2_-1;
        void var1_-1;
    }

    public static iui[] values() {
        return (iui[])f.clone();
    }
}

