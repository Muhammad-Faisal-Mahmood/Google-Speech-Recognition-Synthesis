/*
 * Decompiled with CFR 0.152.
 */
public final class bid {
    public static final String a = bbi.b("NetworkRequestCompat");
    public final Object b;

    public bid() {
        this(null);
    }

    public bid(Object object) {
        this.b = object;
    }

    public /* synthetic */ bid(byte[] byArray) {
        this((Object)null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bid)) {
            return false;
        }
        object = (bid)object;
        return jse.i(this.b, ((bid)object).b);
    }

    public final int hashCode() {
        Object object = this.b;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkRequestCompat(wrapped=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

