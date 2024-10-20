/*
 * Decompiled with CFR 0.152.
 */
public final class hzn
extends Enum {
    public static final /* enum */ hzn a;
    public static final /* enum */ hzn b;
    public static final /* enum */ hzn c;
    public static final /* enum */ hzn d;
    public static final /* enum */ hzn e;
    public static final /* enum */ hzn f;
    public static final /* enum */ hzn g;
    public static final /* enum */ hzn h;
    public static final /* enum */ hzn i;
    private static final hzn[] j;

    static {
        hzn hzn2;
        hzn hzn3;
        hzn hzn4;
        hzn hzn5;
        hzn hzn6;
        hzn hzn7;
        hzn hzn8;
        hzn hzn9;
        a = hzn9 = new hzn("INT", 0);
        b = hzn8 = new hzn("LONG", 1);
        c = hzn7 = new hzn("FLOAT", 2);
        d = hzn6 = new hzn("DOUBLE", 3);
        e = hzn5 = new hzn("BOOLEAN", 4);
        f = hzn4 = new hzn("STRING", 5);
        Object object = hvu.b;
        object = new hzn("BYTE_STRING", 6);
        g = object;
        h = hzn3 = new hzn("ENUM", 7);
        i = hzn2 = new hzn("MESSAGE", 8);
        j = new hzn[]{hzn9, hzn8, hzn7, hzn6, hzn5, hzn4, object, hzn3, hzn2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hzn() {
        void var2_-1;
        void var1_-1;
    }

    public static hzn[] values() {
        return (hzn[])j.clone();
    }
}

