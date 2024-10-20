/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

public final class A
extends Enum {
    public static final /* enum */ A ALWAYS;
    public static final /* enum */ A EXCEEDS_PAD;
    public static final /* enum */ A NEVER;
    public static final /* enum */ A NORMAL;
    public static final /* enum */ A NOT_NEGATIVE;
    private static final A[] a;

    static {
        Enum enum_ = new Enum("NORMAL", 0);
        NORMAL = enum_;
        Enum enum_2 = new Enum("ALWAYS", 1);
        ALWAYS = enum_2;
        Enum enum_3 = new Enum("NEVER", 2);
        NEVER = enum_3;
        Enum enum_4 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enum_4;
        Enum enum_5 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enum_5;
        a = new A[]{enum_, enum_2, enum_3, enum_4, enum_5};
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])a.clone();
    }
}

