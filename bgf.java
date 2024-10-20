/*
 * Decompiled with CFR 0.152.
 */
public final class bgf {
    public final String a;
    public final Long b;

    public bgf(String string, Long l2) {
        this.a = string;
        this.b = l2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bgf)) {
            return false;
        }
        object = (bgf)object;
        if (!jse.i(this.a, ((bgf)object).a)) {
            return false;
        }
        return jse.i(this.b, ((bgf)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + ((Object)this.b).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Preference(key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

