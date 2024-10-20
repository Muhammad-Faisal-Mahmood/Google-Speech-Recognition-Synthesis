/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

public final class c
extends Enum {
    public static final /* enum */ c STANDARD;
    public static final /* enum */ c UTC;
    public static final /* enum */ c WALL;
    private static final c[] a;

    static {
        Enum enum_ = new Enum("UTC", 0);
        UTC = enum_;
        Enum enum_2 = new Enum("WALL", 1);
        WALL = enum_2;
        Enum enum_3 = new Enum("STANDARD", 2);
        STANDARD = enum_3;
        a = new c[]{enum_, enum_2, enum_3};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])a.clone();
    }
}

