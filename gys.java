/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Comparator;

public final class gys
extends hcp
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Comparator a;

    public gys(Comparator comparator) {
        this.a = comparator;
    }

    @Override
    public final int compare(Object object, Object object2) {
        return this.a.compare(object, object2);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gys) {
            object = (gys)object;
            return this.a.equals(((gys)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

