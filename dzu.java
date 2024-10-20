/*
 * Decompiled with CFR 0.152.
 */
public final class dzu
extends Enum
implements hwx {
    public static final /* enum */ dzu a;
    public static final /* enum */ dzu b;
    private static final dzu[] d;
    public final int c;

    static {
        dzu dzu2;
        dzu dzu3;
        a = dzu3 = new dzu("UNSET_END_OF_DATA_STATUS", 0, 0);
        b = dzu2 = new dzu("SUCCESS", 1, 1);
        d = new dzu[]{dzu3, dzu2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dzu() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.c = var3_2;
    }

    public static dzu[] values() {
        return (dzu[])d.clone();
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}

