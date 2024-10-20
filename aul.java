/*
 * Decompiled with CFR 0.152.
 */
public final class aul
extends Enum {
    public static final /* enum */ aul a;
    public static final /* enum */ aul b;
    public static final /* enum */ aul c;
    private static final aul[] d;

    static {
        aul aul2;
        aul aul3;
        aul aul4;
        a = aul4 = new aul("AUTOMATIC", 0);
        b = aul3 = new aul("TRUNCATE", 1);
        c = aul2 = new aul("WRITE_AHEAD_LOGGING", 2);
        d = new aul[]{aul4, aul3, aul2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aul() {
        void var2_-1;
        void var1_-1;
    }

    public static aul[] values() {
        return (aul[])d.clone();
    }
}

