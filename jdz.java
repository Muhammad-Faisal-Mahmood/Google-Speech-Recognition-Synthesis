/*
 * Decompiled with CFR 0.152.
 */
public final class jdz
extends Enum {
    public static final /* enum */ jdz a;
    public static final /* enum */ jdz b;
    public static final /* enum */ jdz c;
    public static final /* enum */ jdz d;
    public static final /* enum */ jdz e;
    public static final /* enum */ jdz f;
    public static final /* enum */ jdz g;
    public static final /* enum */ jdz h;
    public static final /* enum */ jdz i;
    public static final /* enum */ jdz j;
    public static final /* enum */ jdz k;
    public static final /* enum */ jdz l;
    public static final /* enum */ jdz m;
    public static final /* enum */ jdz n;
    public static final jdz[] o;
    private static final jdz[] q;
    public final iyh p;
    private final int r;

    static {
        jdz jdz2;
        jdz jdz3;
        jdz jdz4;
        jdz jdz5;
        jdz jdz6;
        jdz jdz7;
        jdz jdz8;
        jdz jdz9;
        jdz jdz10;
        jdz jdz11;
        jdz jdz12;
        jdz jdz13;
        a = jdz13 = new jdz("NO_ERROR", 0, 0, iyh.k);
        b = jdz12 = new jdz("PROTOCOL_ERROR", 1, 1, iyh.j);
        c = jdz11 = new jdz("INTERNAL_ERROR", 2, 2, iyh.j);
        d = jdz10 = new jdz("FLOW_CONTROL_ERROR", 3, 3, iyh.j);
        e = jdz9 = new jdz("SETTINGS_TIMEOUT", 4, 4, iyh.j);
        f = jdz8 = new jdz("STREAM_CLOSED", 5, 5, iyh.j);
        jdz[] jdzArray = new jdz("FRAME_SIZE_ERROR", 6, 6, iyh.j);
        g = jdzArray;
        h = jdz7 = new jdz("REFUSED_STREAM", 7, 7, iyh.k);
        i = jdz6 = new jdz("CANCEL", 8, 8, iyh.c);
        j = jdz5 = new jdz("COMPRESSION_ERROR", 9, 9, iyh.j);
        k = jdz4 = new jdz("CONNECT_ERROR", 10, 10, iyh.j);
        l = jdz3 = new jdz("ENHANCE_YOUR_CALM", 11, 11, iyh.g.e("Bandwidth exhausted"));
        m = jdz2 = new jdz("INADEQUATE_SECURITY", 12, 12, iyh.f.e("Permission denied as protocol is not secure enough to call"));
        jdz[] jdzArray2 = new jdz("HTTP_1_1_REQUIRED", 13, 13, iyh.d);
        n = jdzArray2;
        q = new jdz[]{jdz13, jdz12, jdz11, jdz10, jdz9, jdz8, jdzArray, jdz7, jdz6, jdz5, jdz4, jdz3, jdz2, jdzArray2};
        jdzArray2 = jdz.values();
        int n2 = jdzArray2.length;
        jdzArray = new jdz[(int)jdzArray2[n2 - 1].a() + 1];
        for (int i2 = 0; i2 < n2; ++i2) {
            jdzArray[(int)jdz3.a()] = jdz3 = jdzArray2[i2];
        }
        o = jdzArray;
    }

    /*
     * WARNING - void declaration
     */
    private jdz() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.r = var3_2;
        String string = "HTTP/2 error code: ".concat(String.valueOf(this.name()));
        String string2 = var4_1.o;
        CharSequence charSequence = string;
        if (string2 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(" (");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(")");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.p = var4_1.e((String)charSequence);
    }

    public static jdz[] values() {
        return (jdz[])q.clone();
    }

    public final long a() {
        return this.r;
    }
}

