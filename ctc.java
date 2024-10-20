/*
 * Decompiled with CFR 0.152.
 */
public final class ctc
extends Enum
implements hwx {
    public static final /* enum */ ctc a;
    public static final /* enum */ ctc b;
    public static final /* enum */ ctc c;
    public static final /* enum */ ctc d;
    private static final ctc[] e;
    private final int f;

    static {
        ctc ctc2;
        ctc ctc3;
        ctc ctc4;
        ctc ctc5;
        a = ctc5 = new ctc("UNDEFINED", 0, 0);
        b = ctc4 = new ctc("SHARED_PREFERENCES_ONLY", 1, 1);
        c = ctc3 = new ctc("SHARED_PREFERENCES_AND_PROTOSTORE", 2, 2);
        d = ctc2 = new ctc("PROTOSTORE_ONLY", 3, 3);
        e = new ctc[]{ctc5, ctc4, ctc3, ctc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ctc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static ctc b(int n2) {
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

    public static ctc[] values() {
        return (ctc[])e.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

