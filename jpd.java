/*
 * Decompiled with CFR 0.152.
 */
public final class jpd {
    public final int a;
    public final Object b;

    public jpd(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jpd)) {
            return false;
        }
        object = (jpd)object;
        if (this.a != ((jpd)object).a) {
            return false;
        }
        return jse.i(this.b, ((jpd)object).b);
    }

    public final int hashCode() {
        Object object = this.b;
        int n2 = object == null ? 0 : object.hashCode();
        return this.a * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IndexedValue(index=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

