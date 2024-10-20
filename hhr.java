/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;

public final class hhr {
    public static final Comparator a = new dfs(7);
    public static final hhr b = new hhr(new hhp(Collections.emptyList()));
    public final hhp c;

    public hhr(hhp hhp2) {
        this.c = hhp2;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object object) {
        return object instanceof hhr && ((hhr)object).c.equals(this.c);
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}

