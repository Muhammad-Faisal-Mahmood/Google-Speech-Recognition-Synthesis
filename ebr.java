/*
 * Decompiled with CFR 0.152.
 */
public final class ebr
extends Enum
implements hwx {
    public static final /* enum */ ebr a;
    public static final /* enum */ ebr b;
    public static final /* enum */ ebr c;
    private static final ebr[] e;
    public final int d;

    static {
        ebr ebr2;
        ebr ebr3;
        ebr ebr4;
        a = ebr4 = new ebr("UNKNOWN_CLOSING_SUCCESS", 0, 0);
        b = ebr3 = new ebr("CLOSED", 1, 1);
        c = ebr2 = new ebr("KEPT_OPEN_FOR_SEAMLESS_HANDOVER", 2, 2);
        e = new ebr[]{ebr4, ebr3, ebr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebr() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static ebr b(int n2) {
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

    public static ebr[] values() {
        return (ebr[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

