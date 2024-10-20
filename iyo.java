/*
 * Decompiled with CFR 0.152.
 */
public final class iyo
extends Enum {
    public static final /* enum */ iyo a;
    public static final /* enum */ iyo b;
    public static final /* enum */ iyo c;
    private static final iyo[] d;

    static {
        iyo iyo2;
        iyo iyo3;
        iyo iyo4;
        a = iyo4 = new iyo("FAKE", 0);
        b = iyo3 = new iyo("MTLS", 1);
        c = iyo2 = new iyo("CUSTOM_MANAGERS", 2);
        d = new iyo[]{iyo4, iyo3, iyo2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iyo() {
        void var2_-1;
        void var1_-1;
    }

    public static iyo[] values() {
        return (iyo[])d.clone();
    }
}

