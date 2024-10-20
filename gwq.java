/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class gwq
implements Map.Entry {
    final Object a;
    Object b;
    final gwr c;

    public gwq(gwr gwr2, Object object, Object object2) {
        this.c = gwr2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof Map.Entry && this.a.equals((object = (Map.Entry)object).getKey()) && this.b.equals(object.getValue());
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final Object setValue(Object object) {
        Object object2 = this.c.put(this.a, object);
        this.b = object;
        return object2;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        String string2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

