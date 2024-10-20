/*
 * Decompiled with CFR 0.152.
 */
public final class bmi
extends Enum {
    public static final /* enum */ bmi a;
    public static final /* enum */ bmi b;
    private static final bmi[] c;

    static {
        bmi bmi2;
        bmi bmi3;
        a = bmi3 = new bmi("ALWAYS", 0);
        b = bmi2 = new bmi("NEVER", 1);
        c = new bmi[]{bmi3, bmi2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmi() {
        void var2_-1;
        void var1_-1;
    }

    public static bmi[] values() {
        return (bmi[])c.clone();
    }
}

