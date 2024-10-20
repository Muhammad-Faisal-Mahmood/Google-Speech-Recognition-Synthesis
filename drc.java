/*
 * Decompiled with CFR 0.152.
 */
public final class drc
extends Enum
implements hwx {
    public static final /* enum */ drc a;
    public static final /* enum */ drc b;
    public static final /* enum */ drc c;
    public static final /* enum */ drc d;
    public static final /* enum */ drc e;
    private static final drc[] g;
    public final int f;

    static {
        drc drc2;
        drc drc3;
        drc drc4;
        drc drc5;
        drc drc6;
        a = drc6 = new drc("DELAY_UNSPECIFIED", 0, 0);
        b = drc5 = new drc("DELAY_10MS", 1, 1);
        c = drc4 = new drc("DELAY_100MS", 2, 2);
        d = drc3 = new drc("DELAY_250MS", 3, 3);
        e = drc2 = new drc("DELAY_500MS", 4, 4);
        g = new drc[]{drc6, drc5, drc4, drc3, drc2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private drc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.f = var3_2;
    }

    public static drc[] values() {
        return (drc[])g.clone();
    }

    @Override
    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}

