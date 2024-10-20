/*
 * Decompiled with CFR 0.152.
 */
public final class bbv
extends Enum {
    public static final /* enum */ bbv a;
    public static final /* enum */ bbv b;
    public static final /* enum */ bbv c;
    public static final /* enum */ bbv d;
    public static final /* enum */ bbv e;
    public static final /* enum */ bbv f;
    private static final bbv[] g;

    static {
        bbv bbv2;
        bbv bbv3;
        bbv bbv4;
        bbv bbv5;
        bbv bbv6;
        bbv bbv7;
        a = bbv7 = new bbv("ENQUEUED", 0);
        b = bbv6 = new bbv("RUNNING", 1);
        c = bbv5 = new bbv("SUCCEEDED", 2);
        d = bbv4 = new bbv("FAILED", 3);
        e = bbv3 = new bbv("BLOCKED", 4);
        f = bbv2 = new bbv("CANCELLED", 5);
        g = new bbv[]{bbv7, bbv6, bbv5, bbv4, bbv3, bbv2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bbv() {
        void var2_-1;
        void var1_-1;
    }

    public static bbv[] values() {
        return (bbv[])g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
        {
        }
    }
}

