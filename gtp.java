/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class gtp
implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    public gtp(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final boolean equals(Object object) {
        if (object instanceof gtp) {
            object = (gtp)object;
            if (a.k(this.a, ((gtp)object).a) && a.k(this.b, ((gtp)object).b)) {
                return true;
            }
        }
        return false;
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
        Object object = this.b;
        String string = String.valueOf(this.a);
        String string2 = String.valueOf(object);
        object = new StringBuilder("(");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

