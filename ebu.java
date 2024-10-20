/*
 * Decompiled with CFR 0.152.
 */
public final class ebu
extends Enum
implements hwx {
    public static final /* enum */ ebu a;
    public static final /* enum */ ebu b;
    public static final /* enum */ ebu c;
    public static final /* enum */ ebu d;
    private static final ebu[] f;
    public final int e;

    static {
        ebu ebu2;
        ebu ebu3;
        ebu ebu4;
        ebu ebu5;
        a = ebu5 = new ebu("UNKNOWN_OPENING_SUCCESS", 0, 0);
        b = ebu4 = new ebu("OPENED", 1, 1);
        c = ebu3 = new ebu("OPENED_SEAMLESSLY", 2, 2);
        d = ebu2 = new ebu("OPENED_SHARED", 3, 3);
        f = new ebu[]{ebu5, ebu4, ebu3, ebu2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ebu() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static ebu b(int n2) {
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

    public static ebu[] values() {
        return (ebu[])f.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

