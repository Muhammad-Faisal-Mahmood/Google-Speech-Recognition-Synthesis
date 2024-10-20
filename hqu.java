/*
 * Decompiled with CFR 0.152.
 */
public final class hqu
extends Enum
implements hwx {
    public static final /* enum */ hqu a;
    public static final /* enum */ hqu b;
    public static final /* enum */ hqu c;
    public static final /* enum */ hqu d;
    public static final /* enum */ hqu e;
    private static final hqu[] f;
    private final int g;

    static {
        hqu hqu2;
        hqu hqu3;
        hqu hqu4;
        hqu hqu5;
        hqu hqu6;
        a = hqu6 = new hqu("DEFAULT_CACHE_OK_IF_VALID", 0, 0);
        b = hqu5 = new hqu("CACHE_OK_IF_AVAILABLE", 1, 1);
        c = hqu4 = new hqu("SKIP_CACHE", 2, 2);
        d = hqu3 = new hqu("CACHE_ONLY", 3, 3);
        e = hqu2 = new hqu("VALID_CACHE_ONLY", 4, 4);
        f = new hqu[]{hqu6, hqu5, hqu4, hqu3, hqu2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hqu() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static hqu[] values() {
        return (hqu[])f.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

