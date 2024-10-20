/*
 * Decompiled with CFR 0.152.
 */
public final class igr
extends Enum
implements hwx {
    public static final /* enum */ igr a;
    public static final /* enum */ igr b;
    public static final /* enum */ igr c;
    public static final /* enum */ igr d;
    public static final /* enum */ igr e;
    public static final /* enum */ igr f;
    public static final /* enum */ igr g;
    public static final /* enum */ igr h;
    public static final /* enum */ igr i;
    public static final /* enum */ igr j;
    public static final /* enum */ igr k;
    public static final /* enum */ igr l;
    public static final /* enum */ igr m;
    public static final /* enum */ igr n;
    private static final igr[] p;
    public final int o;

    static {
        igr igr2;
        igr igr3;
        igr igr4;
        igr igr5;
        igr igr6;
        igr igr7;
        igr igr8;
        igr igr9;
        igr igr10;
        igr igr11;
        igr igr12;
        igr igr13;
        igr igr14;
        igr igr15;
        a = igr15 = new igr("NO_ERROR", 0, 0);
        b = igr14 = new igr("UNKNOWN_FAILURE", 1, 1);
        c = igr13 = new igr("DOUBLE_INIT", 2, 2);
        d = igr12 = new igr("INVALID_CONFIG", 3, 3);
        e = igr11 = new igr("UNSUPPORTED_LOCALE", 4, 4);
        f = igr10 = new igr("INVALID_LANGUAGE_PACK", 5, 5);
        g = igr9 = new igr("UNDEFINED_BEHAVIOR", 6, 6);
        h = igr8 = new igr("MISSING_HOTWORD", 7, 7);
        i = igr7 = new igr("UNSUPPORTED_LANGUAGE_PACK", 8, 8);
        j = igr6 = new igr("INVALID_LANGUAGE_PACK_FOR_LANGID", 9, 9);
        k = igr5 = new igr("INVALID_LANGUAGE_PACK_FOR_DIARIZATION", 10, 10);
        l = igr4 = new igr("INCOMPATIBLE_SPEAKERID_AND_HOTWORD_MODEL", 11, 11);
        m = igr3 = new igr("THREAD_SCHEDULING_FAILURE", 12, 12);
        n = igr2 = new igr("CONCURRENCY_LIMIT_REACHED", 13, 13);
        p = new igr[]{igr15, igr14, igr13, igr12, igr11, igr10, igr9, igr8, igr7, igr6, igr5, igr4, igr3, igr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private igr() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o = var3_2;
    }

    public static igr b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 13: {
                return n;
            }
            case 12: {
                return m;
            }
            case 11: {
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

    public static igr[] values() {
        return (igr[])p.clone();
    }

    @Override
    public final int a() {
        return this.o;
    }

    public final String toString() {
        return Integer.toString(this.o);
    }
}

