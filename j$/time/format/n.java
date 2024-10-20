/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.time.format.f;
import j$.time.format.u;

final class n
extends Enum
implements f {
    public static final /* enum */ n INSENSITIVE;
    public static final /* enum */ n LENIENT;
    public static final /* enum */ n SENSITIVE;
    public static final /* enum */ n STRICT;
    private static final n[] a;

    static {
        Enum enum_ = new Enum("SENSITIVE", 0);
        SENSITIVE = enum_;
        Enum enum_2 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = enum_2;
        Enum enum_3 = new Enum("STRICT", 2);
        STRICT = enum_3;
        Enum enum_4 = new Enum("LENIENT", 3);
        LENIENT = enum_4;
        a = new n[]{enum_, enum_2, enum_3, enum_4};
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public static n[] values() {
        return (n[])a.clone();
    }

    @Override
    public final boolean g(u u2, StringBuilder stringBuilder) {
        return true;
    }

    public final String toString() {
        int n2 = this.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}

