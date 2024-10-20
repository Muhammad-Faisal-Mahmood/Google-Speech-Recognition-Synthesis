/*
 * Decompiled with CFR 0.152.
 */
public final class jlr
extends Enum {
    public static final /* enum */ jlr a;
    public static final /* enum */ jlr b;
    public static final /* enum */ jlr c;
    public static final /* enum */ jlr d;
    public static final /* enum */ jlr e;
    private static final jlr[] g;
    final String f;

    static {
        jlr jlr2;
        jlr jlr3;
        jlr jlr4;
        jlr jlr5;
        jlr jlr6;
        a = jlr6 = new jlr("TLS_1_3", 0, "TLSv1.3");
        b = jlr5 = new jlr("TLS_1_2", 1, "TLSv1.2");
        c = jlr4 = new jlr("TLS_1_1", 2, "TLSv1.1");
        d = jlr3 = new jlr("TLS_1_0", 3, "TLSv1");
        e = jlr2 = new jlr("SSL_3_0", 4, "SSLv3");
        g = new jlr[]{jlr6, jlr5, jlr4, jlr3, jlr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jlr() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static jlr[] values() {
        return (jlr[])g.clone();
    }
}

