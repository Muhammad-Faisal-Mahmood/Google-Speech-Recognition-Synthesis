/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

final class L0
extends Enum {
    public static final /* enum */ L0 OP;
    public static final /* enum */ L0 SPLITERATOR;
    public static final /* enum */ L0 STREAM;
    public static final /* enum */ L0 TERMINAL_OP;
    public static final /* enum */ L0 UPSTREAM_TERMINAL_OP;
    private static final L0[] a;

    static {
        Enum enum_ = new Enum("SPLITERATOR", 0);
        SPLITERATOR = enum_;
        Enum enum_2 = new Enum("STREAM", 1);
        STREAM = enum_2;
        Enum enum_3 = new Enum("OP", 2);
        OP = enum_3;
        Enum enum_4 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = enum_4;
        Enum enum_5 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enum_5;
        a = new L0[]{enum_, enum_2, enum_3, enum_4, enum_5};
    }

    public static L0 valueOf(String string) {
        return Enum.valueOf(L0.class, string);
    }

    public static L0[] values() {
        return (L0[])a.clone();
    }
}

