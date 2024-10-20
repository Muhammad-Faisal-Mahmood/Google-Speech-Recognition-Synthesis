/*
 * Decompiled with CFR 0.152.
 */
public final class edm
extends Enum
implements hwx {
    public static final /* enum */ edm a;
    public static final /* enum */ edm b;
    private static final edm[] c;
    private final int d;

    static {
        edm edm2;
        edm edm3;
        a = edm3 = new edm("AUDIO_ADAPTER_CONNECT_STATUS_UNKNOWN", 0, 0);
        b = edm2 = new edm("AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS", 1, 1);
        c = new edm[]{edm3, edm2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private edm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static edm[] values() {
        return (edm[])c.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

