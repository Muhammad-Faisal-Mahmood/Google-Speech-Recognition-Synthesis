/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class hpk
extends AbstractOwnableSynchronizer
implements Runnable {
    private final hpl a;

    public hpk(hpl hpl2) {
        this.a = hpl2;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    @Override
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}

