/*
 * Decompiled with CFR 0.152.
 */
public final class era
extends Enum {
    public static final /* enum */ era a;
    public static final /* enum */ era b;
    private static final era[] c;

    static {
        era era2;
        era era3;
        a = era3 = new era("MIC_OCCUPATION_ANY", 0);
        b = era2 = new era("MIC_OCCUPATION_PRIVACY_SENSITIVE", 1);
        Enum[] enumArray = new era[]{era3, era2};
        c = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private era() {
        void var2_-1;
        void var1_-1;
    }

    public static era[] values() {
        return (era[])c.clone();
    }
}

