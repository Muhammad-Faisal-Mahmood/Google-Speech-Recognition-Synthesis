/*
 * Decompiled with CFR 0.152.
 */
public final class gdz
extends Enum {
    public static final /* enum */ gdz a;
    public static final /* enum */ gdz b;
    private static final gdz[] c;

    static {
        gdz gdz2;
        gdz gdz3;
        a = gdz3 = new gdz("LOCAL_STATE_CHANGE", 0);
        b = gdz2 = new gdz("REMOTE_STATE_CHANGE", 1);
        c = new gdz[]{gdz3, gdz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gdz() {
        void var2_-1;
        void var1_-1;
    }

    public static gdz[] values() {
        return (gdz[])c.clone();
    }
}

