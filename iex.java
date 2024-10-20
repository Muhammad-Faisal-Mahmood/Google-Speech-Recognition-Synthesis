/*
 * Decompiled with CFR 0.152.
 */
public final class iex
extends Enum
implements hwx {
    public static final /* enum */ iex a;
    public static final /* enum */ iex b;
    private static final iex[] d;
    public final int c;

    static {
        iex iex2;
        iex iex3;
        a = iex3 = new iex("DEFAULT_OPTIMIZE_QUALITY", 0, 0);
        b = iex2 = new iex("OPTIMIZE_LATENCY", 1, 1);
        d = new iex[]{iex3, iex2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iex() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.c = var3_2;
    }

    public static iex[] values() {
        return (iex[])d.clone();
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}

