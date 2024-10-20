/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class hau
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Object[] a;

    public hau(Object[] objectArray) {
        this.a = objectArray;
    }

    Object readResolve() {
        return hav.o(this.a);
    }
}

