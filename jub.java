/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class jub {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(jub.class, "b");
    public volatile long b;
    public final jse c;

    public jub(long l2, jse jse2) {
        this.c = jse2;
        this.b = l2;
    }

    public final long a(long l2) {
        return a.addAndGet(this, l2);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long l2, long l3) {
        boolean bl2;
        boolean bl3 = bl2 = a.compareAndSet(this, l2, l3);
        if (bl2) {
            bl3 = bl2;
            if (this.c != jud.a) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}

