/*
 * Decompiled with CFR 0.152.
 */
public final class icq
extends Enum
implements hwx {
    public static final /* enum */ icq a;
    public static final /* enum */ icq b;
    public static final /* enum */ icq c;
    public static final /* enum */ icq d;
    public static final /* enum */ icq e;
    public static final /* enum */ icq f;
    public static final /* enum */ icq g;
    public static final /* enum */ icq h;
    public static final /* enum */ icq i;
    public static final /* enum */ icq j;
    public static final /* enum */ icq k;
    public static final /* enum */ icq l;
    public static final /* enum */ icq m;
    public static final /* enum */ icq n;
    public static final /* enum */ icq o;
    public static final /* enum */ icq p;
    private static final icq[] r;
    public final int q;

    static {
        icq icq2;
        icq icq3;
        icq icq4;
        icq icq5;
        icq icq6;
        icq icq7;
        icq icq8;
        icq icq9;
        icq icq10;
        icq icq11;
        icq icq12;
        icq icq13;
        icq icq14;
        icq icq15;
        icq icq16;
        icq icq17;
        a = icq17 = new icq("LINEAR16", 0, 0);
        b = icq16 = new icq("FLOAT32", 1, 1);
        c = icq15 = new icq("FLAC", 2, 2);
        d = icq14 = new icq("AMR", 3, 3);
        e = icq13 = new icq("MULAW", 4, 4);
        f = icq12 = new icq("SPEEX_NB", 5, 5);
        g = icq11 = new icq("SPEEX_WB", 6, 6);
        h = icq10 = new icq("OGG_VORBIS", 7, 7);
        i = icq9 = new icq("ADTS_AAC", 8, 8);
        j = icq8 = new icq("AMR_WB", 9, 9);
        k = icq7 = new icq("OGG_OPUS", 10, 10);
        l = icq6 = new icq("WEBM_OPUS", 11, 11);
        m = icq5 = new icq("MKV", 12, 12);
        n = icq4 = new icq("MP3", 13, 13);
        o = icq3 = new icq("OPUS", 14, 14);
        p = icq2 = new icq("ALAW", 15, 15);
        r = new icq[]{icq17, icq16, icq15, icq14, icq13, icq12, icq11, icq10, icq9, icq8, icq7, icq6, icq5, icq4, icq3, icq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private icq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.q = var3_2;
    }

    public static icq[] values() {
        return (icq[])r.clone();
    }

    @Override
    public final int a() {
        return this.q;
    }

    public final String toString() {
        return Integer.toString(this.q);
    }
}

