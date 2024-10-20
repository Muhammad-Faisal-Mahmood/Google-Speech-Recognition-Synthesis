/*
 * Decompiled with CFR 0.152.
 */
public final class iaz
extends Enum
implements hwx {
    public static final /* enum */ iaz a;
    public static final /* enum */ iaz b;
    public static final /* enum */ iaz c;
    public static final /* enum */ iaz d;
    public static final /* enum */ iaz e;
    public static final /* enum */ iaz f;
    public static final /* enum */ iaz g;
    @Deprecated
    public static final /* enum */ iaz h;
    @Deprecated
    public static final /* enum */ iaz i;
    public static final /* enum */ iaz j;
    public static final /* enum */ iaz k;
    public static final /* enum */ iaz l;
    public static final /* enum */ iaz m;
    public static final /* enum */ iaz n;
    public static final /* enum */ iaz o;
    public static final /* enum */ iaz p;
    public static final /* enum */ iaz q;
    private static final iaz[] s;
    public final int r;

    static {
        iaz iaz2;
        iaz iaz3;
        iaz iaz4;
        iaz iaz5;
        iaz iaz6;
        iaz iaz7;
        iaz iaz8;
        iaz iaz9;
        iaz iaz10;
        iaz iaz11;
        iaz iaz12;
        iaz iaz13;
        iaz iaz14;
        iaz iaz15;
        iaz iaz16;
        iaz iaz17;
        iaz iaz18;
        a = iaz18 = new iaz("FEATURE_UNSPECIFIED", 0, 0);
        b = iaz17 = new iaz("FEATURE_BIASING_PHRASES", 1, 1);
        c = iaz16 = new iaz("FEATURE_LANG_ID", 2, 2);
        d = iaz15 = new iaz("FEATURE_CAPITALIZATION", 3, 3);
        e = iaz14 = new iaz("FEATURE_UNSPOKEN_PUNCTUATION", 4, 4);
        f = iaz13 = new iaz("FEATURE_SPOKEN_PUNCTUATION", 5, 5);
        g = iaz12 = new iaz("FEATURE_SPOKEN_EMOJI", 6, 6);
        h = iaz11 = new iaz("FEATURE_WORD_CONFIDENCE", 7, 7);
        i = iaz10 = new iaz("FEATURE_UTTERANCE_CONFIDENCE", 8, 8);
        j = iaz9 = new iaz("FEATURE_WORD_TIMING", 9, 9);
        k = iaz8 = new iaz("FEATURE_OFFENSIVE_WORD_MASKING", 10, 10);
        l = iaz7 = new iaz("FEATURE_DIARIZATION", 11, 11);
        m = iaz6 = new iaz("FEATURE_SPEAKER_TURNS", 12, 12);
        n = iaz5 = new iaz("FEATURE_VOICE_MATCH", 13, 13);
        o = iaz4 = new iaz("FEATURE_WORD_CONFIDENCE_V1", 14, 14);
        p = iaz3 = new iaz("FEATURE_UTTERANCE_CONFIDENCE_V1", 15, 15);
        q = iaz2 = new iaz("FEATURE_ENCODER", 16, 16);
        s = new iaz[]{iaz18, iaz17, iaz16, iaz15, iaz14, iaz13, iaz12, iaz11, iaz10, iaz9, iaz8, iaz7, iaz6, iaz5, iaz4, iaz3, iaz2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iaz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.r = var3_2;
    }

    public static iaz b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 16: {
                return q;
            }
            case 15: {
                return p;
            }
            case 14: {
                return o;
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

    public static iaz[] values() {
        return (iaz[])s.clone();
    }

    @Override
    public final int a() {
        return this.r;
    }

    public final String toString() {
        return Integer.toString(this.r);
    }
}

