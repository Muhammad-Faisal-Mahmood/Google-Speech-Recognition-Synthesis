/*
 * Decompiled with CFR 0.152.
 */
public final class efs
extends Enum
implements hwx {
    public static final /* enum */ efs a;
    public static final /* enum */ efs b;
    public static final /* enum */ efs c;
    public static final /* enum */ efs d;
    public static final /* enum */ efs e;
    public static final /* enum */ efs f;
    public static final /* enum */ efs g;
    public static final /* enum */ efs h;
    public static final /* enum */ efs i;
    public static final /* enum */ efs j;
    public static final /* enum */ efs k;
    public static final /* enum */ efs l;
    public static final /* enum */ efs m;
    public static final /* enum */ efs n;
    private static final efs[] p;
    public final int o;

    static {
        efs efs2;
        efs efs3;
        efs efs4;
        efs efs5;
        efs efs6;
        efs efs7;
        efs efs8;
        efs efs9;
        efs efs10;
        efs efs11;
        efs efs12;
        efs efs13;
        efs efs14;
        efs efs15;
        a = efs15 = new efs("SOURCE_EMPTY", 0, 0);
        b = efs14 = new efs("SOURCE_BUILTIN", 1, 1);
        c = efs13 = new efs("SOURCE_ZLM", 2, 2);
        d = efs12 = new efs("SOURCE_SYNC", 3, 3);
        e = efs11 = new efs("SOURCE_DSP", 4, 4);
        f = efs10 = new efs("SOURCE_SODA", 5, 5);
        g = efs9 = new efs("SOURCE_BISTO", 6, 6);
        h = efs8 = new efs("SOURCE_CAR", 7, 7);
        i = efs7 = new efs("SOURCE_URI", 8, 8);
        j = efs6 = new efs("SOURCE_PFD", 9, 9);
        k = efs5 = new efs("SOURCE_VOICE_DSP_HOTWORD", 10, 10);
        l = efs4 = new efs("SOURCE_GACS", 11, 12);
        m = efs3 = new efs("SOURCE_HOTWORD", 12, 13);
        n = efs2 = new efs("SOURCE_ECHO_REFERENCE", 13, 14);
        p = new efs[]{efs15, efs14, efs13, efs12, efs11, efs10, efs9, efs8, efs7, efs6, efs5, efs4, efs3, efs2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private efs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o = var3_2;
    }

    public static efs b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 14: {
                return n;
            }
            case 13: {
                return m;
            }
            case 12: {
                return l;
            }
            case 10: {
                return k;
            }
            case 9: {
                return j;
            }
            case 8: {
                return i;
            }
            case 7: {
                return h;
            }
            case 6: {
                return g;
            }
            case 5: {
                return f;
            }
            case 4: {
                return e;
            }
            case 3: {
                return d;
            }
            case 2: {
                return c;
            }
            case 1: {
                return b;
            }
            case 0: 
        }
        return a;
    }

    public static efs[] values() {
        return (efs[])p.clone();
    }

    @Override
    public final int a() {
        return this.o;
    }

    public final String toString() {
        return Integer.toString(this.o);
    }
}

