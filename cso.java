/*
 * Decompiled with CFR 0.152.
 */
public final class cso
extends Enum
implements hwx {
    public static final /* enum */ cso a;
    public static final /* enum */ cso b;
    public static final /* enum */ cso c;
    private static final cso[] e;
    public final int d;

    static {
        cso cso2;
        cso cso3;
        cso cso4;
        a = cso4 = new cso("BLOCK_DOWNLOAD_IN_LOW_STORAGE", 0, 0);
        b = cso3 = new cso("BLOCK_DOWNLOAD_LOWER_THRESHOLD", 1, 1);
        c = cso2 = new cso("EXTREMELY_LOW_THRESHOLD", 2, 2);
        e = new cso[]{cso4, cso3, cso2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cso() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static cso[] values() {
        return (cso[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

