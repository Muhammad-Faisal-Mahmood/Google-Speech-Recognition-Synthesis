/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

public final class z
extends Enum {
    public static final /* enum */ z LENIENT;
    public static final /* enum */ z SMART;
    public static final /* enum */ z STRICT;
    private static final z[] a;

    static {
        Enum enum_ = new Enum("STRICT", 0);
        STRICT = enum_;
        Enum enum_2 = new Enum("SMART", 1);
        SMART = enum_2;
        Enum enum_3 = new Enum("LENIENT", 2);
        LENIENT = enum_3;
        a = new z[]{enum_, enum_2, enum_3};
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    public static z[] values() {
        return (z[])a.clone();
    }
}

