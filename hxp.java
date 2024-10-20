/*
 * Decompiled with CFR 0.152.
 */
public final class hxp
extends Enum {
    public static final /* enum */ hxp a;
    public static final /* enum */ hxp b;
    public static final /* enum */ hxp c;
    public static final /* enum */ hxp d;
    public static final /* enum */ hxp e;
    public static final /* enum */ hxp f;
    public static final /* enum */ hxp g;
    public static final /* enum */ hxp h;
    public static final /* enum */ hxp i;
    public static final /* enum */ hxp j;
    private static final hxp[] l;
    public final Class k;

    static {
        hxp hxp2;
        hxp hxp3;
        hxp hxp4;
        hxp hxp5;
        hxp hxp6;
        hxp hxp7;
        hxp hxp8;
        hxp hxp9;
        hxp hxp10;
        a = hxp10 = new hxp("VOID", 0, Void.class);
        b = hxp9 = new hxp("INT", 1, Integer.class);
        c = hxp8 = new hxp("LONG", 2, Long.class);
        d = hxp7 = new hxp("FLOAT", 3, Float.class);
        e = hxp6 = new hxp("DOUBLE", 4, Double.class);
        f = hxp5 = new hxp("BOOLEAN", 5, Boolean.class);
        g = hxp4 = new hxp("STRING", 6, String.class);
        Object object = hvu.b;
        object = new hxp("BYTE_STRING", 7, hvu.class);
        h = object;
        i = hxp3 = new hxp("ENUM", 8, Integer.class);
        j = hxp2 = new hxp("MESSAGE", 9, Object.class);
        l = new hxp[]{hxp10, hxp9, hxp8, hxp7, hxp6, hxp5, hxp4, object, hxp3, hxp2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hxp() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.k = var3_2;
    }

    public static hxp[] values() {
        return (hxp[])l.clone();
    }
}

