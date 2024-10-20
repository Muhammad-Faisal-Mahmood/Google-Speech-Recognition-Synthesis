/*
 * Decompiled with CFR 0.152.
 */
public final class dzz
extends Enum
implements hwx {
    public static final /* enum */ dzz a;
    public static final /* enum */ dzz b;
    public static final /* enum */ dzz c;
    public static final /* enum */ dzz d;
    public static final /* enum */ dzz e;
    private static final dzz[] f;
    private final int g;

    static {
        dzz dzz2;
        dzz dzz3;
        dzz dzz4;
        dzz dzz5;
        dzz dzz6;
        a = dzz6 = new dzz("SOURCE_UNSPECIFIED", 0, 0);
        b = dzz5 = new dzz("SOURCE_BISTO", 1, 1);
        c = dzz4 = new dzz("SOURCE_BLUETOOTH", 2, 2);
        d = dzz3 = new dzz("SOURCE_BUILTIN", 3, 3);
        e = dzz2 = new dzz("SOURCE_CAR", 4, 4);
        f = new dzz[]{dzz6, dzz5, dzz4, dzz3, dzz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dzz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static dzz b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return null;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static dzz[] values() {
        return (dzz[])f.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

