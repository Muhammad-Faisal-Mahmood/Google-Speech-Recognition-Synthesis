/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Comparator;

final class hax
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Comparator a;
    final Object[] b;

    public hax(Comparator comparator, Object[] objectArray) {
        this.a = comparator;
        this.b = objectArray;
    }

    Object readResolve() {
        haw haw2 = new haw(this.a);
        haw2.n(this.b);
        return haw2.l();
    }
}

