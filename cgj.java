/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class cgj
implements cco {
    public static final cgj b = new cgj();
    private final String c;

    private cgj() {
        this.c = null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cgj)) {
            return false;
        }
        object = ((cgj)object).c;
        return a.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}

