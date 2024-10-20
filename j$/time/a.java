/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.b;
import j$.time.x;
import java.io.ObjectInputStream;
import java.io.Serializable;

final class a
extends b
implements Serializable {
    static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final x a;

    static {
        System.currentTimeMillis();
        b = new a(x.f);
    }

    a(x x2) {
        this.a = x2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object object) {
        if (object instanceof a) {
            object = ((a)object).a;
            return this.a.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("SystemClock[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

