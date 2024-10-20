/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class jik
extends jij {
    private final AtomicIntegerFieldUpdater a;

    public jik(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override
    public final boolean a(jim jim2) {
        return this.a.compareAndSet(jim2, 0, -1);
    }

    @Override
    public final void b(jim jim2) {
        this.a.set(jim2, 0);
    }
}

