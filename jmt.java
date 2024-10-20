/*
 * Decompiled with CFR 0.152.
 */
public final class jmt
extends Enum {
    public static final /* enum */ jmt a;
    public static final /* enum */ jmt b;
    public static final /* enum */ jmt c;
    private static final jmt[] d;

    static {
        jmt jmt2;
        jmt jmt3;
        jmt jmt4;
        a = jmt4 = new jmt("BLOCKING", 0);
        b = jmt3 = new jmt("FUTURE", 1);
        c = jmt2 = new jmt("ASYNC", 2);
        d = new jmt[]{jmt4, jmt3, jmt2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jmt() {
        void var2_-1;
        void var1_-1;
    }

    public static jmt[] values() {
        return (jmt[])d.clone();
    }
}

