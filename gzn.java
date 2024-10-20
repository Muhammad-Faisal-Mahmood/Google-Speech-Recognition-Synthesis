/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class gzn
extends gxu
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Object a;
    final Object b;

    public gzn(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }
}

