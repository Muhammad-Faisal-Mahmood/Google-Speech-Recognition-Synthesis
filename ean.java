/*
 * Decompiled with CFR 0.152.
 */
public final class ean
extends Enum {
    public static final /* enum */ ean a;
    public static final /* enum */ ean b;
    public static final /* enum */ ean c;
    public static final /* enum */ ean d;
    public static final /* enum */ ean e;
    public static final /* enum */ ean f;
    private static final ean[] g;

    static {
        ean ean2;
        ean ean3;
        ean ean4;
        ean ean5;
        ean ean6;
        ean ean7;
        a = ean7 = new ean("URI_PARAMS", 0);
        b = ean6 = new ean("HANDOFF_DATA", 1);
        c = ean5 = new ean("FILE_PATH", 2);
        d = ean4 = new ean("ENABLE_ZERO_LATENCY_MIC", 3);
        e = ean3 = new ean("ENABLE_VOICE_DSP_HOTWORD_MIC", 4);
        f = ean2 = new ean("OPTIONALAUDIOINPUTMODE_NOT_SET", 5);
        g = new ean[]{ean7, ean6, ean5, ean4, ean3, ean2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ean() {
        void var2_-1;
        void var1_-1;
    }

    public static ean a(int n2) {
        if (n2 != 0) {
            if (n2 != 3) {
                if (n2 != 5) {
                    if (n2 != 10) {
                        if (n2 != 13) {
                            if (n2 != 17) {
                                return null;
                            }
                            return e;
                        }
                        return a;
                    }
                    return d;
                }
                return c;
            }
            return b;
        }
        return f;
    }

    public static ean[] values() {
        return (ean[])g.clone();
    }
}

