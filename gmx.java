/*
 * Decompiled with CFR 0.152.
 */
public final class gmx
extends Enum {
    public static final /* enum */ gmx a;
    public static final /* enum */ gmx b;
    public static final /* enum */ gmx c;
    private static final gmx[] d;

    static {
        gmx gmx2;
        gmx gmx3;
        gmx gmx4;
        a = gmx4 = new gmx("DISABLED", 0);
        b = gmx3 = new gmx("THROW_ON_FAILURE", 1);
        c = gmx2 = new gmx("LOG_ON_FAILURE", 2);
        d = new gmx[]{gmx4, gmx3, gmx2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gmx() {
        void var2_-1;
        void var1_-1;
    }

    public static gmx[] values() {
        return (gmx[])d.clone();
    }
}

