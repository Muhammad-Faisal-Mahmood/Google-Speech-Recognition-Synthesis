/*
 * Decompiled with CFR 0.152.
 */
public final class jqh
extends Enum {
    public static final /* enum */ jqh a;
    public static final /* enum */ jqh b;
    public static final /* enum */ jqh c;
    private static final jqh[] d;

    static {
        jqh jqh2;
        jqh jqh3;
        jqh jqh4;
        a = jqh4 = new jqh("COROUTINE_SUSPENDED", 0);
        b = jqh3 = new jqh("UNDECIDED", 1);
        c = jqh2 = new jqh("RESUMED", 2);
        Enum[] enumArray = new jqh[]{jqh4, jqh3, jqh2};
        d = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jqh() {
        void var2_-1;
        void var1_-1;
    }

    public static jqh[] values() {
        return (jqh[])d.clone();
    }
}

