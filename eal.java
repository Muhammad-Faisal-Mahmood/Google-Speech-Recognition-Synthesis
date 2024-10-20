/*
 * Decompiled with CFR 0.152.
 */
public final class eal
extends Enum
implements hwx {
    public static final /* enum */ eal a;
    public static final /* enum */ eal b;
    public static final /* enum */ eal c;
    private static final eal[] d;
    private final int e;

    static {
        eal eal2;
        eal eal3;
        eal eal4;
        a = eal4 = new eal("DEFAULT", 0, 0);
        b = eal3 = new eal("AMBIENT", 1, 1);
        c = eal2 = new eal("CONVERSATIONAL", 2, 2);
        d = new eal[]{eal4, eal3, eal2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eal() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static eal b(int n2) {
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

    public static eal[] values() {
        return (eal[])d.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

