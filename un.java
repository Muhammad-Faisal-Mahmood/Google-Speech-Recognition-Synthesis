/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class un {
    public final Object a;
    public final Object b;

    public un(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof un)) {
            return false;
        }
        object = (un)object;
        return Objects.equals(((un)object).a, this.a) && Objects.equals(((un)object).b, this.b);
    }

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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Pair{");
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

