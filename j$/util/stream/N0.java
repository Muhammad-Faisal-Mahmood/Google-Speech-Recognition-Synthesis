/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

public final class N0
extends Enum {
    public static final /* enum */ N0 DOUBLE_VALUE;
    public static final /* enum */ N0 INT_VALUE;
    public static final /* enum */ N0 LONG_VALUE;
    public static final /* enum */ N0 REFERENCE;
    private static final N0[] a;

    static {
        Enum enum_ = new Enum("REFERENCE", 0);
        REFERENCE = enum_;
        Enum enum_2 = new Enum("INT_VALUE", 1);
        INT_VALUE = enum_2;
        Enum enum_3 = new Enum("LONG_VALUE", 2);
        LONG_VALUE = enum_3;
        Enum enum_4 = new Enum("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enum_4;
        a = new N0[]{enum_, enum_2, enum_3, enum_4};
    }

    public static N0 valueOf(String string) {
        return Enum.valueOf(N0.class, string);
    }

    public static N0[] values() {
        return (N0[])a.clone();
    }
}

