/*
 * Decompiled with CFR 0.152.
 */
public final class ebc
extends Enum
implements hwx {
    public static final /* enum */ ebc a;
    public static final /* enum */ ebc b;
    public static final /* enum */ ebc c;
    private static final ebc[] e;
    public final int d;

    static {
        ebc ebc2;
        ebc ebc3;
        ebc ebc4;
        a = ebc4 = new ebc("BLOCK_TO_CONNECT_NO_FALLBACK", 0, 0);
        b = ebc3 = new ebc("BLOCK_TO_CONNECT_FALLBACK_TO_BUILTIN", 1, 1);
        c = ebc2 = new ebc("CONNECT_IN_PARALLEL_FALLBACK_TO_BUILTIN", 2, 2);
        e = new ebc[]{ebc4, ebc3, ebc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static ebc b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return null;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static ebc[] values() {
        return (ebc[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

