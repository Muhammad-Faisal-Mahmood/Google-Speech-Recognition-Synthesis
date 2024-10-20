/*
 * Decompiled with CFR 0.152.
 */
public final class eqz
extends Enum
implements hwx {
    public static final /* enum */ eqz a;
    public static final /* enum */ eqz b;
    public static final /* enum */ eqz c;
    public static final /* enum */ eqz d;
    public static final /* enum */ eqz e;
    public static final /* enum */ eqz f;
    private static final eqz[] h;
    public final int g;

    static {
        eqz eqz2;
        eqz eqz3;
        eqz eqz4;
        eqz eqz5;
        eqz eqz6;
        eqz eqz7;
        a = eqz7 = new eqz("CLIENT_TYPE_UNKNOWN", 0, 0);
        b = eqz6 = new eqz("CLIENT_TYPE_AUDIO_REQUEST", 1, 1);
        c = eqz5 = new eqz("CLIENT_TYPE_HOTWORD", 2, 2);
        d = eqz4 = new eqz("CLIENT_TYPE_EXTERNAL", 3, 10);
        e = eqz3 = new eqz("CLIENT_TYPE_TELEPHONY_CALL", 4, 11);
        f = eqz2 = new eqz("CLIENT_TYPE_PLATFORM_EXTERNAL", 5, 12);
        h = new eqz[]{eqz7, eqz6, eqz5, eqz4, eqz3, eqz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eqz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static eqz b(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    switch (n2) {
                        default: {
                            return null;
                        }
                        case 12: {
                            return f;
                        }
                        case 11: {
                            return e;
                        }
                        case 10: 
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return a;
    }

    public static eqz[] values() {
        return (eqz[])h.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

