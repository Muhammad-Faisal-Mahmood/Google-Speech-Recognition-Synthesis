/*
 * Decompiled with CFR 0.152.
 */
public final class edc
extends Enum
implements hwx {
    public static final /* enum */ edc a;
    public static final /* enum */ edc b;
    public static final /* enum */ edc c;
    private static final edc[] d;
    private final int e;

    static {
        edc edc2;
        edc edc3;
        edc edc4;
        a = edc4 = new edc("BEHAVIOR_NO_FAIL", 0, 0);
        b = edc3 = new edc("BEHAVIOR_FAIL_ON_PRIVACY_SENSITIVE_OCCUPATION", 1, 1);
        c = edc2 = new edc("BEHAVIOR_FAIL_ON_ANY_OCCUPATION", 2, 2);
        d = new edc[]{edc4, edc3, edc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private edc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static edc b(int n2) {
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

    public static edc[] values() {
        return (edc[])d.clone();
    }

    @Override
    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}

