/*
 * Decompiled with CFR 0.152.
 */
public final class kgz
extends Enum {
    public static final /* enum */ kgz a;
    public static final /* enum */ kgz b;
    public static final /* enum */ kgz c;
    public static final /* enum */ kgz d;
    public static final /* enum */ kgz e;
    private static final kgz[] g;
    public final String f;

    static {
        kgz kgz2;
        kgz kgz3;
        kgz kgz4;
        kgz kgz5;
        kgz kgz6;
        a = kgz6 = new kgz("TLS_1_3", 0, "TLSv1.3");
        b = kgz5 = new kgz("TLS_1_2", 1, "TLSv1.2");
        c = kgz4 = new kgz("TLS_1_1", 2, "TLSv1.1");
        d = kgz3 = new kgz("TLS_1_0", 3, "TLSv1");
        e = kgz2 = new kgz("SSL_3_0", 4, "SSLv3");
        Enum[] enumArray = new kgz[]{kgz6, kgz5, kgz4, kgz3, kgz2};
        g = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kgz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static kgz[] values() {
        return (kgz[])g.clone();
    }
}

