/*
 * Decompiled with CFR 0.152.
 */
public final class edo
extends Enum
implements hwx {
    public static final /* enum */ edo a;
    public static final /* enum */ edo b;
    public static final /* enum */ edo c;
    public static final /* enum */ edo d;
    public static final /* enum */ edo e;
    private static final edo[] f;
    private final int g;

    static {
        edo edo2;
        edo edo3;
        edo edo4;
        edo edo5;
        edo edo6;
        a = edo6 = new edo("BISTO", 0, 0);
        b = edo5 = new edo("SODA", 1, 2);
        c = edo4 = new edo("CAR", 2, 3);
        d = edo3 = new edo("GACS", 3, 4);
        e = edo2 = new edo("TEST", 4, 100);
        f = new edo[]{edo6, edo5, edo4, edo3, edo2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private edo() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static edo b(int n2) {
        if (n2 != 0) {
            if (n2 != 100) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return null;
                        }
                        return d;
                    }
                    return c;
                }
                return b;
            }
            return e;
        }
        return a;
    }

    public static edo[] values() {
        return (edo[])f.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

