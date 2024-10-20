/*
 * Decompiled with CFR 0.152.
 */
public final class jlt
extends Enum {
    public static final /* enum */ jlt a;
    public static final /* enum */ jlt b;
    public static final /* enum */ jlt c;
    public static final /* enum */ jlt d;
    public static final /* enum */ jlt e;
    public static final /* enum */ jlt f;
    public static final /* enum */ jlt g;
    public static final /* enum */ jlt h;
    public static final /* enum */ jlt i;
    public static final /* enum */ jlt j;
    public static final /* enum */ jlt k;
    public static final /* enum */ jlt l;
    public static final /* enum */ jlt m;
    public static final /* enum */ jlt n;
    public static final /* enum */ jlt o;
    public static final /* enum */ jlt p;
    public static final /* enum */ jlt q;
    public static final /* enum */ jlt r;
    private static final jlt[] t;
    public final int s;

    static {
        jlt jlt2;
        jlt jlt3;
        jlt jlt4;
        jlt jlt5;
        jlt jlt6;
        jlt jlt7;
        jlt jlt8;
        jlt jlt9;
        jlt jlt10;
        jlt jlt11;
        jlt jlt12;
        jlt jlt13;
        jlt jlt14;
        jlt jlt15;
        jlt jlt16;
        jlt jlt17;
        jlt jlt18;
        jlt jlt19;
        a = jlt19 = new jlt("NO_ERROR", 0, 0);
        b = jlt18 = new jlt("PROTOCOL_ERROR", 1, 1);
        c = jlt17 = new jlt("INVALID_STREAM", 2, 1);
        d = jlt16 = new jlt("UNSUPPORTED_VERSION", 3, 1);
        e = jlt15 = new jlt("STREAM_IN_USE", 4, 1);
        f = jlt14 = new jlt("STREAM_ALREADY_CLOSED", 5, 1);
        g = jlt13 = new jlt("INTERNAL_ERROR", 6, 2);
        h = jlt12 = new jlt("FLOW_CONTROL_ERROR", 7, 3);
        i = jlt11 = new jlt("STREAM_CLOSED", 8, 5);
        j = jlt10 = new jlt("FRAME_TOO_LARGE", 9, 6);
        k = jlt9 = new jlt("REFUSED_STREAM", 10, 7);
        l = jlt8 = new jlt("CANCEL", 11, 8);
        m = jlt7 = new jlt("COMPRESSION_ERROR", 12, 9);
        n = jlt6 = new jlt("CONNECT_ERROR", 13, 10);
        o = jlt5 = new jlt("ENHANCE_YOUR_CALM", 14, 11);
        p = jlt4 = new jlt("INADEQUATE_SECURITY", 15, 12);
        q = jlt3 = new jlt("HTTP_1_1_REQUIRED", 16, 13);
        r = jlt2 = new jlt("INVALID_CREDENTIALS", 17, -1);
        t = new jlt[]{jlt19, jlt18, jlt17, jlt16, jlt15, jlt14, jlt13, jlt12, jlt11, jlt10, jlt9, jlt8, jlt7, jlt6, jlt5, jlt4, jlt3, jlt2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jlt() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.s = var3_2;
    }

    public static jlt a(int n2) {
        for (jlt jlt2 : jlt.values()) {
            if (jlt2.s != n2) continue;
            return jlt2;
        }
        return null;
    }

    public static jlt[] values() {
        return (jlt[])t.clone();
    }
}

