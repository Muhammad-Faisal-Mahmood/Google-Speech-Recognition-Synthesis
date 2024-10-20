/*
 * Decompiled with CFR 0.152.
 */
public final class iav
extends Enum
implements hwx {
    public static final /* enum */ iav a;
    public static final /* enum */ iav b;
    public static final /* enum */ iav c;
    public static final hwy d;
    private static final iav[] e;
    private final int f;

    static {
        iav iav2;
        iav iav3;
        iav iav4;
        a = iav4 = new iav("REQUIRES_UNSPECIFIED", 0, 0);
        b = iav3 = new iav("REQUIRES_ACTIVATION_ID", 1, 1);
        c = iav2 = new iav("REQUIRES_ORIGIN_PRODUCT_ID", 2, 2);
        e = new iav[]{iav4, iav3, iav2};
        d = new iby(1);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iav() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static iav b(int n2) {
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

    public static iav[] values() {
        return (iav[])e.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

