/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class oe
implements Map.Entry {
    public final Object a;
    public final Object b;
    oe c;
    public oe d;

    public oe(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oe)) {
            return false;
        }
        object = (oe)object;
        return this.a.equals(((oe)object).a) && this.b.equals(((oe)object).b);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        Object object = this.b;
        int n2 = this.a.hashCode();
        return object.hashCode() ^ n2;
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

