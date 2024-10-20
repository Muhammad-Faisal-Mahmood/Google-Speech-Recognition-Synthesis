/*
 * Decompiled with CFR 0.152.
 */
public final class dzr
extends Enum
implements hwx {
    public static final /* enum */ dzr a;
    public static final /* enum */ dzr b;
    public static final /* enum */ dzr c;
    private static final dzr[] e;
    public final int d;

    static {
        dzr dzr2;
        dzr dzr3;
        dzr dzr4;
        a = dzr4 = new dzr("UNKNOWN_TYPE", 0, 0);
        b = dzr3 = new dzr("ANDROID_TIMESTAMP", 1, 1);
        c = dzr2 = new dzr("EXTRAPOLATED_TIMESTAMP", 2, 2);
        e = new dzr[]{dzr4, dzr3, dzr2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dzr() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static dzr[] values() {
        return (dzr[])e.clone();
    }

    @Override
    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}

