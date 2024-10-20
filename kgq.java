/*
 * Decompiled with CFR 0.152.
 */
public final class kgq
extends Enum {
    public static final /* enum */ kgq a;
    public static final /* enum */ kgq b;
    public static final /* enum */ kgq c;
    public static final /* enum */ kgq d;
    public static final /* enum */ kgq e;
    public static final /* enum */ kgq f;
    private static final kgq[] h;
    public final String g;

    static {
        kgq kgq2;
        kgq kgq3;
        kgq kgq4;
        kgq kgq5;
        kgq kgq6;
        kgq kgq7;
        a = kgq7 = new kgq("HTTP_1_0", 0, "http/1.0");
        b = kgq6 = new kgq("HTTP_1_1", 1, "http/1.1");
        c = kgq5 = new kgq("SPDY_3", 2, "spdy/3.1");
        d = kgq4 = new kgq("HTTP_2", 3, "h2");
        e = kgq3 = new kgq("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f = kgq2 = new kgq("QUIC", 5, "quic");
        Enum[] enumArray = new kgq[]{kgq7, kgq6, kgq5, kgq4, kgq3, kgq2};
        h = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kgq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static kgq[] values() {
        return (kgq[])h.clone();
    }

    public final String toString() {
        return this.g;
    }
}

