/*
 * Decompiled with CFR 0.152.
 */
public final class ixa
extends Enum {
    public static final /* enum */ ixa a;
    public static final /* enum */ ixa b;
    public static final /* enum */ ixa c;
    public static final /* enum */ ixa d;
    public static final /* enum */ ixa e;
    private static final ixa[] f;

    static {
        ixa ixa2;
        ixa ixa3;
        ixa ixa4;
        ixa ixa5;
        ixa ixa6;
        a = ixa6 = new ixa("UNARY", 0);
        b = ixa5 = new ixa("CLIENT_STREAMING", 1);
        c = ixa4 = new ixa("SERVER_STREAMING", 2);
        d = ixa3 = new ixa("BIDI_STREAMING", 3);
        e = ixa2 = new ixa("UNKNOWN", 4);
        f = new ixa[]{ixa6, ixa5, ixa4, ixa3, ixa2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ixa() {
        void var2_-1;
        void var1_-1;
    }

    public static ixa[] values() {
        return (ixa[])f.clone();
    }

    public final boolean a() {
        return this == a || this == c;
        {
        }
    }

    public final boolean b() {
        return this == a || this == b;
        {
        }
    }
}

