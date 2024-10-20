/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class juc {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(juc.class, Object.class, "a");
    public volatile Object a;
    private final jse c;

    public juc(Object object, jse jse2) {
        this.c = jse2;
        this.a = object;
    }

    public final Object a(Object object) {
        Object object2 = b.getAndSet(this, object);
        if (this.c != jud.a) {
            Objects.toString(object);
            Objects.toString(object2);
        }
        return object2;
    }

    public final void b(Object object) {
        b.lazySet(this, object);
        if (this.c != jud.a) {
            Objects.toString(object);
        }
    }

    public final void c(Object object) {
        this.a = object;
        if (this.c != jud.a) {
            Objects.toString(object);
        }
    }

    public final boolean d(Object object, Object object2) {
        boolean bl2 = a.g(b, this, object, object2);
        if (bl2 && this.c != jud.a) {
            Objects.toString(object);
            Objects.toString(object2);
            return true;
        }
        return bl2;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

