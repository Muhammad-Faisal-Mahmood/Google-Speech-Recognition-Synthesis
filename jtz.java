/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class jtz {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(jtz.class, "a");
    public volatile int a;
    private final jse c;

    public jtz(boolean bl2, jse jse2) {
        this.c = jse2;
        this.a = bl2 ? 1 : 0;
    }

    public final boolean a(boolean bl2, boolean bl3) {
        boolean bl4;
        boolean bl5 = bl4 = b.compareAndSet(this, bl2 ? 1 : 0, bl3 ? 1 : 0);
        if (bl4) {
            bl5 = bl4;
            if (this.c != jud.a) {
                bl5 = true;
            }
        }
        return bl5;
    }

    public final boolean b() {
        return this.a != 0;
    }

    public final boolean c() {
        return b.getAndSet(this, 1) == 1;
    }

    public final String toString() {
        return String.valueOf(this.b());
    }
}

