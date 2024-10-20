/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class gtc
extends gtd
implements Serializable {
    public static final gtc a = new gtc();
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        return a;
    }

    @Override
    public final int a(Object object) {
        return System.identityHashCode(object);
    }

    @Override
    protected final boolean b(Object object, Object object2) {
        return false;
    }
}

