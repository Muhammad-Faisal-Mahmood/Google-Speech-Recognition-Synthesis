/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hyw
implements Map.Entry,
Comparable {
    public final Comparable a;
    public Object b;
    final hyz c;

    public hyw(hyz hyz2, Comparable comparable, Object object) {
        this.c = hyz2;
        this.a = comparable;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean a(Object object, Object object2) {
        if (object != null) return object.equals(object2);
        if (object2 == null) return true;
        return false;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return hyw.a(this.a, (object = (Map.Entry)object).getKey()) && hyw.a(this.b, object.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 ^ n2;
    }

    public final Object setValue(Object object) {
        this.c.e();
        Object object2 = this.b;
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

