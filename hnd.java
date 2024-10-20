/*
 * Decompiled with CFR 0.152.
 */
final class hnd
extends hmw {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hna a(hnk hnk2, hna hna2) {
        synchronized (hnk2) {
            hna hna3 = hnk2.listeners;
            if (hna3 != hna2) {
                hnk2.listeners = hna2;
            }
            return hna3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hnj b(hnk hnk2, hnj hnj2) {
        synchronized (hnk2) {
            hnj hnj3 = hnk2.waiters;
            if (hnj3 != hnj2) {
                hnk2.waiters = hnj2;
            }
            return hnj3;
        }
    }

    @Override
    public final void c(hnj hnj2, hnj hnj3) {
        hnj2.next = hnj3;
    }

    @Override
    public final void d(hnj hnj2, Thread thread) {
        hnj2.thread = thread;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean e(hnk hnk2, hna hna2, hna hna3) {
        synchronized (hnk2) {
            if (hnk2.listeners == hna2) {
                hnk2.listeners = hna3;
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean f(hnk hnk2, Object object, Object object2) {
        synchronized (hnk2) {
            if (hnk2.value == object) {
                hnk2.value = object2;
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean g(hnk hnk2, hnj hnj2, hnj hnj3) {
        synchronized (hnk2) {
            if (hnk2.waiters == hnj2) {
                hnk2.waiters = hnj3;
                return true;
            }
            return false;
        }
    }
}

