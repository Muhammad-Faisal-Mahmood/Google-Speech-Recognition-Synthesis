/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class gtf
implements Serializable,
gte {
    private static final long serialVersionUID = 0L;
    private final Object a = null;

    @Override
    public final Object apply(Object object) {
        return null;
    }

    public final boolean equals(Object object) {
        if (object instanceof gtf) {
            object = ((gtf)object).a;
            return a.k(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}

