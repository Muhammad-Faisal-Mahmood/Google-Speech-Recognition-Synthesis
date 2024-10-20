/*
 * Decompiled with CFR 0.152.
 */
public final class bak
extends Enum {
    public static final /* enum */ bak a;
    public static final /* enum */ bak b;
    private static final bak[] c;

    static {
        bak bak2;
        bak bak3;
        a = bak3 = new bak("EXPONENTIAL", 0);
        b = bak2 = new bak("LINEAR", 1);
        c = new bak[]{bak3, bak2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bak() {
        void var2_-1;
        void var1_-1;
    }

    public static bak[] values() {
        return (bak[])c.clone();
    }
}

