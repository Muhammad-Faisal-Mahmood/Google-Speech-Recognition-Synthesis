/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class joc
implements Serializable {
    public final Object a;
    public final Object b;

    public joc(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof joc)) {
            return false;
        }
        object = (joc)object;
        if (!jse.i(this.a, ((joc)object).a)) {
            return false;
        }
        return jse.i(this.b, ((joc)object).b);
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

