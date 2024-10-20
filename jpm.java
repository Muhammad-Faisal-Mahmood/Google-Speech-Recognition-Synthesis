/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class jpm
implements Map.Entry,
jsm {
    private final jpp a;
    private final int b;

    public jpm(jpp jpp2, int n2) {
        this.a = jpp2;
        this.b = n2;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof Map.Entry && jse.i((object = (Map.Entry)object).getKey(), this.getKey()) && jse.i(object.getValue(), this.getValue());
    }

    public final Object getKey() {
        return this.a.b[this.b];
    }

    public final Object getValue() {
        Object[] objectArray = this.a.c;
        jse.b(objectArray);
        return objectArray[this.b];
    }

    @Override
    public final int hashCode() {
        Object object = this.getKey();
        int n2 = 0;
        int n3 = object != null ? object.hashCode() : 0;
        object = this.getValue();
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 ^ n2;
    }

    public final Object setValue(Object object) {
        this.a.f();
        Object[] objectArray = this.a.k();
        int n2 = this.b;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public final String toString() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append("=");
        stringBuilder.append(object2);
        return stringBuilder.toString();
    }
}

