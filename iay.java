/*
 * Decompiled with CFR 0.152.
 */
public final class iay
extends Enum
implements hwx {
    public static final /* enum */ iay a;
    public static final /* enum */ iay b;
    public static final /* enum */ iay c;
    public static final /* enum */ iay d;
    public static final /* enum */ iay e;
    public static final /* enum */ iay f;
    public static final /* enum */ iay g;
    public static final /* enum */ iay h;
    public static final /* enum */ iay i;
    public static final /* enum */ iay j;
    public static final /* enum */ iay k;
    public static final /* enum */ iay l;
    public static final /* enum */ iay m;
    public static final /* enum */ iay n;
    public static final /* enum */ iay o;
    public static final /* enum */ iay p;
    public static final /* enum */ iay q;
    public static final /* enum */ iay r;
    public static final /* enum */ iay s;
    public static final /* enum */ iay t;
    private static final iay[] v;
    public final int u;

    static {
        iay iay2;
        iay iay3;
        iay iay4;
        iay iay5;
        iay iay6;
        iay iay7;
        iay iay8;
        iay iay9;
        iay iay10;
        iay iay11;
        iay iay12;
        iay iay13;
        iay iay14;
        iay iay15;
        iay iay16;
        iay iay17;
        iay iay18;
        iay iay19;
        iay iay20;
        iay iay21;
        a = iay21 = new iay("UNKNOWN_VOICE_PLATFORM", 0, 0);
        b = iay20 = new iay("ANDROID", 1, 1);
        c = iay19 = new iay("SERVER_LSTM", 2, 2);
        d = iay18 = new iay("EMBEDDED_LSTM", 3, 3);
        e = iay17 = new iay("MICRO_LSTM", 4, 4);
        f = iay16 = new iay("BARRACUDA", 5, 5);
        g = iay15 = new iay("WAVENET", 6, 6);
        h = iay14 = new iay("TACOTRON", 7, 7);
        i = iay13 = new iay("EMBEDDED_WAVERNN", 8, 8);
        j = iay12 = new iay("SERVER_WAVERNN", 9, 9);
        k = iay11 = new iay("SERVER_VALERIAN_VOCODED", 10, 12);
        l = iay10 = new iay("EMBEDDED_VALERIAN_VOCODED", 11, 13);
        m = iay9 = new iay("SERVER_CHIVE_WAVENET", 12, 14);
        n = iay8 = new iay("SERVER_CHIVE_HAVOC", 13, 15);
        o = iay7 = new iay("SERVER_CHIVE_HAVOCAZO", 14, 21);
        p = iay6 = new iay("SERVER_VOICELM", 15, 20);
        q = iay5 = new iay("EMBEDDED_HAVOC", 16, 16);
        r = iay4 = new iay("EMBEDDED_LEMONBALM_HAVOC", 17, 17);
        s = iay3 = new iay("EMBEDDED_LOCOMEL", 18, 18);
        t = iay2 = new iay("EMBEDDED_NETWORK", 19, 19);
        v = new iay[]{iay21, iay20, iay19, iay18, iay17, iay16, iay15, iay14, iay13, iay12, iay11, iay10, iay9, iay8, iay7, iay6, iay5, iay4, iay3, iay2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iay() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.u = var3_2;
    }

    public static iay[] values() {
        return (iay[])v.clone();
    }

    @Override
    public final int a() {
        return this.u;
    }

    public final String toString() {
        return Integer.toString(this.u);
    }
}

