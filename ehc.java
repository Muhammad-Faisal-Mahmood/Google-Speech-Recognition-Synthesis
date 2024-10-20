/*
 * Decompiled with CFR 0.152.
 */
public final class ehc
extends Enum {
    public static final /* enum */ ehc a;
    public static final /* enum */ ehc b;
    public static final /* enum */ ehc c;
    public static final /* enum */ ehc d;
    public static final /* enum */ ehc e;
    private static final ehc[] f;

    static {
        ehc ehc2;
        ehc ehc3;
        ehc ehc4;
        ehc ehc5;
        ehc ehc6;
        a = ehc6 = new ehc("OK", 0);
        b = ehc5 = new ehc("FAILED", 1);
        c = ehc4 = new ehc("NO_PERMISSIONS", 2);
        d = ehc3 = new ehc("DENYLISTED", 3);
        e = ehc2 = new ehc("INCOMPATIBLE_SDK", 4);
        Enum[] enumArray = new ehc[]{ehc6, ehc5, ehc4, ehc3, ehc2};
        f = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ehc() {
        void var2_-1;
        void var1_-1;
    }

    public static ehc[] values() {
        return (ehc[])f.clone();
    }
}

