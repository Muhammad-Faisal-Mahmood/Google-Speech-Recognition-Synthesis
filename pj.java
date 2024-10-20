/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class pj
extends pe {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public pj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final void a(pm pm2, pm pm3) {
        this.b.lazySet(pm2, pm3);
    }

    @Override
    public final void b(pm pm2, Thread thread) {
        this.a.lazySet(pm2, thread);
    }

    @Override
    public final boolean c(pn pn2, pi pi2, pi pi3) {
        return a.g(this.d, pn2, pi2, pi3);
    }

    @Override
    public final boolean d(pn pn2, Object object, Object object2) {
        return a.g(this.e, pn2, object, object2);
    }

    @Override
    public final boolean e(pn pn2, pm pm2, pm pm3) {
        return a.g(this.c, pn2, pm2, pm3);
    }
}

