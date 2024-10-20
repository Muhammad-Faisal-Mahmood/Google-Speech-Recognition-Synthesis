/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class hdf
extends hcp
implements Serializable {
    private static final long serialVersionUID = 0L;
    final hcp a;

    public hdf(hcp hcp2) {
        this.a = hcp2;
    }

    @Override
    public final int compare(Object object, Object object2) {
        return this.a.compare(object2, object);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hdf) {
            object = (hdf)object;
            return this.a.equals(((hdf)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}

