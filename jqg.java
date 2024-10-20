/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jqg
implements Serializable,
jqf {
    public static final jqg a = new jqg();
    private static final long serialVersionUID = 0L;

    private jqg() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override
    public final Object fold(Object object, jro jro2) {
        return object;
    }

    @Override
    public final jqd get(jqe jqe2) {
        jse.e(jqe2, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final jqf minusKey(jqe jqe2) {
        jse.e(jqe2, "key");
        return this;
    }

    @Override
    public final jqf plus(jqf jqf2) {
        jse.e(jqf2, "context");
        return jqf2;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

