/*
 * Decompiled with CFR 0.152.
 */
final class pl
extends pe {
    @Override
    public final void a(pm pm2, pm pm3) {
        pm2.next = pm3;
    }

    @Override
    public final void b(pm pm2, Thread thread) {
        pm2.thread = thread;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean c(pn pn2, pi pi2, pi pi3) {
        synchronized (pn2) {
            if (pn2.listeners == pi2) {
                pn2.listeners = pi3;
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
    public final boolean d(pn pn2, Object object, Object object2) {
        synchronized (pn2) {
            if (pn2.value == object) {
                pn2.value = object2;
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
    public final boolean e(pn pn2, pm pm2, pm pm3) {
        synchronized (pn2) {
            if (pn2.waiters == pm2) {
                pn2.waiters = pm3;
                return true;
            }
            return false;
        }
    }
}

