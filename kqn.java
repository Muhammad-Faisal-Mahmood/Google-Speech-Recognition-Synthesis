/*
 * Decompiled with CFR 0.152.
 */
public final class kqn
extends Enum {
    public static final /* enum */ kqn a;
    public static final /* enum */ kqn b;
    public static final /* enum */ kqn c;
    public static final /* enum */ kqn d;
    private static final kqn[] g;
    public final int e;
    public final boolean f;

    static {
        kqn kqn2;
        kqn kqn3;
        kqn kqn4;
        kqn kqn5;
        a = kqn5 = new kqn("DISABLED", 0, 0, false);
        b = kqn4 = new kqn("DISK", 1, 1, true);
        c = kqn3 = new kqn("DISK_NO_HTTP", 2, 1, false);
        d = kqn2 = new kqn("MEMORY", 3, 2, true);
        g = new kqn[]{kqn5, kqn4, kqn3, kqn2};
    }

    /*
     * WARNING - void declaration
     */
    private kqn() {
        void var3_2;
        void var4_1;
        void var2_-1;
        void var1_-1;
        this.f = var4_1;
        this.e = var3_2;
    }

    public static kqn[] values() {
        return (kqn[])g.clone();
    }
}

