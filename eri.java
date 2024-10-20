/*
 * Decompiled with CFR 0.152.
 */
public final class eri
extends Enum {
    public static final /* enum */ eri a;
    public static final /* enum */ eri b;
    private static final eri[] c;

    static {
        eri eri2;
        eri eri3;
        a = eri3 = new eri("PLATFORM", 0);
        b = eri2 = new eri("SELF", 1);
        Enum[] enumArray = new eri[]{eri3, eri2};
        c = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eri() {
        void var2_-1;
        void var1_-1;
    }

    public static eri[] values() {
        return (eri[])c.clone();
    }
}

