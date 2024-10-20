/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hxg
implements Map.Entry {
    final hxj a;
    private final Map.Entry b;

    public hxg(hxj hxj2, Map.Entry entry) {
        this.a = hxj2;
        this.b = entry;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        object = (Map.Entry)object;
        return this.getKey().equals(object.getKey()) && this.getValue().equals(this.getValue());
    }

    public final Object getKey() {
        return this.b.getKey();
    }

    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object setValue(Object object) {
        if ((object = this.b.setValue(hxf.b(object))) == null) {
            return null;
        }
        return this.a.a.a(object);
    }
}

