/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class hnb
extends hmw {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public hnb(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final hna a(hnk hnk2, hna hna2) {
        return this.d.getAndSet(hnk2, hna2);
    }

    @Override
    public final hnj b(hnk hnk2, hnj hnj2) {
        return this.c.getAndSet(hnk2, hnj2);
    }

    @Override
    public final void c(hnj hnj2, hnj hnj3) {
        this.b.lazySet(hnj2, hnj3);
    }

    @Override
    public final void d(hnj hnj2, Thread thread) {
        this.a.lazySet(hnj2, thread);
    }

    @Override
    public final boolean e(hnk hnk2, hna hna2, hna hna3) {
        return a.g(this.d, hnk2, hna2, hna3);
    }

    @Override
    public final boolean f(hnk hnk2, Object object, Object object2) {
        return a.g(this.e, hnk2, object, object2);
    }

    @Override
    public final boolean g(hnk hnk2, hnj hnj2, hnj hnj3) {
        return a.g(this.c, hnk2, hnj2, hnj3);
    }
}

