/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class gzv
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Object[] a;

    public gzv(Object[] objectArray) {
        this.a = objectArray;
    }

    Object readResolve() {
        return gzx.p(this.a);
    }
}

