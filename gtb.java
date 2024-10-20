/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class gtb
extends gtd
implements Serializable {
    public static final gtb a = new gtb();
    private static final long serialVersionUID = 1L;

    private Object readResolve() {
        return a;
    }

    @Override
    public final int a(Object object) {
        return object.hashCode();
    }

    @Override
    protected final boolean b(Object object, Object object2) {
        return object.equals(object2);
    }
}

