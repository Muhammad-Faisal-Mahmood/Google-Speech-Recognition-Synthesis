/*
 * Decompiled with CFR 0.152.
 */
public final class ews
extends Enum
implements hwx {
    public static final /* enum */ ews a;
    public static final /* enum */ ews b;
    public static final /* enum */ ews c;
    public static final /* enum */ ews d;
    public static final /* enum */ ews e;
    public static final /* enum */ ews f;
    private static final ews[] h;
    public final int g;

    static {
        ews ews2;
        ews ews3;
        ews ews4;
        ews ews5;
        ews ews6;
        ews ews7;
        a = ews7 = new ews("REASON_UNKNOWN", 0, 0);
        b = ews6 = new ews("REASON_REALTIME_GAP", 1, 1);
        c = ews5 = new ews("REASON_INITIAL_REALTIME_GAP", 2, 2);
        d = ews4 = new ews("REASON_MAX_AUDIO_RECEIVED", 3, 3);
        e = ews3 = new ews("REASON_MAX_COMPUTATION_DURATION", 4, 4);
        f = ews2 = new ews("REASON_CLOSED", 5, 5);
        h = new ews[]{ews7, ews6, ews5, ews4, ews3, ews2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ews() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static ews b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return null;
                            }
                            return f;
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

    public static ews[] values() {
        return (ews[])h.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

