/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;

public final class y {
    public static final y a = new Object();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof y) {
            ((y)object).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}

