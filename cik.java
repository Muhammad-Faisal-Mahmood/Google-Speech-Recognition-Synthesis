/*
 * Decompiled with CFR 0.152.
 */
public final class cik
extends Enum
implements hwx {
    public static final /* enum */ cik a;
    public static final /* enum */ cik b;
    public static final /* enum */ cik c;
    public static final /* enum */ cik d;
    public static final /* enum */ cik e;
    public static final /* enum */ cik f;
    private static final cik[] h;
    public final int g;

    static {
        cik cik2;
        cik cik3;
        cik cik4;
        cik cik5;
        cik cik6;
        cik cik7;
        a = cik7 = new cik("UNKNOWN", 0, 0);
        b = cik6 = new cik("NONE", 1, 1);
        c = cik5 = new cik("EXACT", 2, 2);
        d = cik4 = new cik("SUBSTRING", 3, 3);
        e = cik3 = new cik("HEURISTIC", 4, 4);
        f = cik2 = new cik("SHEEPDOG_ELIGIBLE", 5, 5);
        h = new cik[]{cik7, cik6, cik5, cik4, cik3, cik2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cik() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.g = var3_2;
    }

    public static cik[] values() {
        return (cik[])h.clone();
    }

    @Override
    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}

