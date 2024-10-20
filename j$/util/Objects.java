/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.util.Arrays;

public final class Objects {
    public static boolean equals(Object object, Object object2) {
        boolean bl2 = object == object2 || object != null && object.equals(object2);
        return bl2;
    }

    public static int hash(Object ... objectArray) {
        return Arrays.hashCode(objectArray);
    }

    public static int hashCode(Object object) {
        int n2 = object != null ? object.hashCode() : 0;
        return n2;
    }

    public static <T> T requireNonNull(T t2) {
        t2.getClass();
        return t2;
    }

    public static <T> T requireNonNull(T t2, String string) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(string);
    }

    public static String toString(Object object, String string) {
        if (object != null) {
            string = object.toString();
        }
        return string;
    }
}

