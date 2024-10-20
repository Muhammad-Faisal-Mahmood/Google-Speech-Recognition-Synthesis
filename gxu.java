/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

abstract class gxu
implements Map.Entry {
    @Override
    public final boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            object = (Map.Entry)object;
            if (a.k(this.getKey(), object.getKey()) && a.k(this.getValue(), object.getValue())) {
                return true;
            }
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    @Override
    public final int hashCode() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        if (object2 != null) {
            n2 = object2.hashCode();
        }
        return n3 ^ n2;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String string = String.valueOf(this.getKey());
        String string2 = String.valueOf(this.getValue());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

