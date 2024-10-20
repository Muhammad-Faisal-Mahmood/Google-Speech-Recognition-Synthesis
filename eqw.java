/*
 * Decompiled with CFR 0.152.
 */
public final class eqw
extends Enum
implements hwx {
    public static final /* enum */ eqw a;
    public static final /* enum */ eqw b;
    private static final eqw[] d;
    public final int c;

    static {
        eqw eqw2;
        eqw eqw3;
        a = eqw3 = new eqw("REQUEST_UNKNOWN", 0, 0);
        b = eqw2 = new eqw("REQUEST_OPEN_PENDING", 1, 1);
        d = new eqw[]{eqw3, eqw2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eqw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.c = var3_2;
    }

    public static eqw b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return null;
            }
            return b;
        }
        return a;
    }

    public static eqw[] values() {
        return (eqw[])d.clone();
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}

