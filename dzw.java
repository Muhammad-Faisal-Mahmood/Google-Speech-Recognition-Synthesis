/*
 * Decompiled with CFR 0.152.
 */
public final class dzw
extends Enum
implements hwx {
    public static final /* enum */ dzw a;
    public static final /* enum */ dzw b;
    public static final /* enum */ dzw c;
    public static final /* enum */ dzw d;
    private static final dzw[] f;
    public final int e;

    static {
        dzw dzw2;
        dzw dzw3;
        dzw dzw4;
        dzw dzw5;
        a = dzw5 = new dzw("REASON_UNKNOWN", 0, 0);
        b = dzw4 = new dzw("REASON_RELEASED_BY_CLIENT", 1, 1);
        c = dzw3 = new dzw("REASON_LOST_UNKNOWN", 2, 2);
        d = dzw2 = new dzw("REASON_LOST_TO_OTHER_CLIENT", 3, 3);
        f = new dzw[]{dzw5, dzw4, dzw3, dzw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dzw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static dzw b(int n2) {
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

    public static dzw[] values() {
        return (dzw[])f.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

