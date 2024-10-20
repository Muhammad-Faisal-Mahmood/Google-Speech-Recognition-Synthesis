/*
 * Decompiled with CFR 0.152.
 */
public final class kcq
extends Enum
implements hwx {
    public static final /* enum */ kcq a;
    public static final /* enum */ kcq b;
    public static final /* enum */ kcq c;
    public static final /* enum */ kcq d;
    public static final /* enum */ kcq e;
    public static final /* enum */ kcq f;
    public static final /* enum */ kcq g;
    public static final /* enum */ kcq h;
    public static final /* enum */ kcq i;
    private static final kcq[] k;
    public final int j;

    static {
        kcq kcq2;
        kcq kcq3;
        kcq kcq4;
        kcq kcq5;
        kcq kcq6;
        kcq kcq7;
        kcq kcq8;
        kcq kcq9;
        kcq kcq10;
        a = kcq10 = new kcq("UNKNOWN_ROUTE_TYPE", 0, 0);
        b = kcq9 = new kcq("BUILTIN", 1, 1);
        c = kcq8 = new kcq("BLUETOOTH", 2, 2);
        d = kcq7 = new kcq("DSP", 3, 3);
        e = kcq6 = new kcq("BISTO", 4, 4);
        f = kcq5 = new kcq("SODA", 5, 5);
        g = kcq4 = new kcq("HANDOVER", 6, 6);
        h = kcq3 = new kcq("CAR", 7, 7);
        i = kcq2 = new kcq("GACS", 8, 8);
        k = new kcq[]{kcq10, kcq9, kcq8, kcq7, kcq6, kcq5, kcq4, kcq3, kcq2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kcq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.j = var3_2;
    }

    public static kcq[] values() {
        return (kcq[])k.clone();
    }

    @Override
    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}

