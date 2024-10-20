/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class jof
implements Serializable,
jny {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(jof.class, Object.class, "c");
    private volatile jqz b;
    private volatile Object c;

    public jof(jqz jqz2) {
        this.b = jqz2;
        this.c = jok.a;
    }

    private final Object writeReplace() {
        return new jnw(this.a());
    }

    @Override
    public final Object a() {
        Object object = this.c;
        if (object != jok.a) {
            return object;
        }
        object = this.b;
        if (object != null && a.g(a, this, jok.a, object = object.a())) {
            this.b = null;
            return object;
        }
        return this.c;
    }

    @Override
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        String string = this.c != jok.a ? String.valueOf(this.a()) : "Lazy value not initialized yet.";
        return string;
    }
}

