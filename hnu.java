/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class hnu
extends hnt {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public hnu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override
    public final int a(hnw hnw2) {
        return this.b.decrementAndGet(hnw2);
    }

    @Override
    public final void b(hnw hnw2, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (!(atomicReferenceFieldUpdater = this.a).compareAndSet(hnw2, null, set) && atomicReferenceFieldUpdater.get(hnw2) == null) {
        }
    }
}

