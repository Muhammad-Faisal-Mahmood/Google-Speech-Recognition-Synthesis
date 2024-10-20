/*
 * Decompiled with CFR 0.152.
 */
public final class jlq
extends Enum {
    public static final /* enum */ jlq a;
    public static final /* enum */ jlq b;
    public static final /* enum */ jlq c;
    public static final /* enum */ jlq d;
    private static final jlq[] f;
    public final String e;

    static {
        jlq jlq2;
        jlq jlq3;
        jlq jlq4;
        jlq jlq5;
        a = jlq5 = new jlq("HTTP_1_0", 0, "http/1.0");
        b = jlq4 = new jlq("HTTP_1_1", 1, "http/1.1");
        c = jlq3 = new jlq("SPDY_3", 2, "spdy/3.1");
        d = jlq2 = new jlq("HTTP_2", 3, "h2");
        f = new jlq[]{jlq5, jlq4, jlq3, jlq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jlq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.e = var3_2;
    }

    public static jlq[] values() {
        return (jlq[])f.clone();
    }

    public final String toString() {
        return this.e;
    }
}

