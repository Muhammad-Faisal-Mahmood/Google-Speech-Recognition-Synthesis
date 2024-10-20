/*
 * Decompiled with CFR 0.152.
 */
public final class bql
extends Enum
implements hwx {
    public static final /* enum */ bql a;
    public static final /* enum */ bql b;
    public static final /* enum */ bql c;
    public static final /* enum */ bql d;
    public static final /* enum */ bql e;
    private static final bql[] g;
    public final int f;

    static {
        bql bql2;
        bql bql3;
        bql bql4;
        bql bql5;
        bql bql6;
        a = bql6 = new bql("ENQUEUE_STATUS_FAIL", 0, 0);
        b = bql5 = new bql("ENQUEUE_STATUS_ALREADY_DOWNLOADING", 1, 1);
        c = bql4 = new bql("ENQUEUE_STATUS_SUCCESS", 2, 2);
        d = bql3 = new bql("ENQUEUE_STATUS_NOT_DOWNLOADABLE", 3, 3);
        e = bql2 = new bql("ENQUEUE_STATUS_ALREADY_INSTALLED", 4, 4);
        g = new bql[]{bql6, bql5, bql4, bql3, bql2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bql() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static bql b(int n2) {
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

    public static bql[] values() {
        return (bql[])g.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

