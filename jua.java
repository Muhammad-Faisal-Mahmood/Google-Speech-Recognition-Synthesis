/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class jua {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(jua.class, "b");
    public volatile int b;
    public final jse c;

    public jua(int n2, jse jse2) {
        this.c = jse2;
        this.b = n2;
    }

    public final int a() {
        return a.incrementAndGet(this);
    }

    public final boolean b(int n2, int n3) {
        boolean bl2;
        boolean bl3 = bl2 = a.compareAndSet(this, n2, n3);
        if (bl2) {
            bl3 = bl2;
            if (this.c != jud.a) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final void c() {
        a.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}

