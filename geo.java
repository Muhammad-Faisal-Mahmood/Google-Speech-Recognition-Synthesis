/*
 * Decompiled with CFR 0.152.
 */
public final class geo
extends Enum {
    public static final /* enum */ geo a;
    public static final /* enum */ geo b;
    public static final /* enum */ geo c;
    public static final /* enum */ geo d;
    private static final geo[] e;

    static {
        geo geo2;
        geo geo3;
        geo geo4;
        geo geo5;
        a = geo5 = new geo("DEVICE", 0);
        b = geo4 = new geo("USER", 1);
        c = geo3 = new geo("UI_DEVICE", 2);
        d = geo2 = new geo("UI_USER", 3);
        Enum[] enumArray = new geo[]{geo5, geo4, geo3, geo2};
        e = enumArray;
        jsd.h(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private geo() {
        void var2_-1;
        void var1_-1;
    }

    public static geo[] values() {
        return (geo[])e.clone();
    }
}

