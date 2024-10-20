/*
 * Decompiled with CFR 0.152.
 */
public final class btx
extends Enum
implements hwx {
    public static final /* enum */ btx a;
    public static final /* enum */ btx b;
    public static final /* enum */ btx c;
    public static final /* enum */ btx d;
    private static final btx[] e;
    private final int f;

    static {
        btx btx2;
        btx btx3;
        btx btx4;
        btx btx5;
        a = btx5 = new btx("UNKNOWN_FEATURE", 0, 0);
        b = btx4 = new btx("SUPPORTS_SENTENCE_SPLITTING", 1, 1);
        c = btx3 = new btx("IS_BUNDLED", 2, 2);
        d = btx2 = new btx("USES_HAMLEX", 3, 3);
        e = new btx[]{btx5, btx4, btx3, btx2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private btx() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static btx b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static btx[] values() {
        return (btx[])e.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

