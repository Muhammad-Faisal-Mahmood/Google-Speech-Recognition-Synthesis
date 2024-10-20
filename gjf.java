/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 */
import android.content.BroadcastReceiver;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

public final class gjf
implements Runnable {
    public final Object a;
    private final int b;

    public /* synthetic */ gjf(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public gjf(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                hta hta2 = (hta)this.a;
                if (hta2.a) return;
                hta2.c.Y();
                return;
            }
            case 19: {
                hte hte2 = (hte)this.a;
                if (hte2.h) return;
                hte2.f = true;
                hte2.b();
                return;
            }
            case 18: {
                ((hsu)this.a).b.d();
                return;
            }
            case 17: {
                ((hsm)this.a).b().d();
                return;
            }
            case 16: {
                this.a.cancel(false);
                return;
            }
            case 15: {
                Object object = this.a;
                hof hof2 = hof.c;
                hof hof3 = hof.d;
                ((hog)object).e(hof2, hof3);
                ((hog)this.a).f();
                Object object2 = this.a;
                hof hof4 = hof.d;
                hof3 = hof.e;
                ((hog)object2).e(hof4, hof3);
                return;
            }
            case 14: {
                hpm hpm2 = hog.a;
                Object object = this.a;
                try {
                    object.close();
                    return;
                }
                catch (Exception exception) {
                    hhk.D(exception);
                    hog.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", exception);
                    return;
                }
            }
            case 13: {
                ((gsj)this.a).a();
                return;
            }
            case 12: {
                Object object = ((gsj)this.a).b;
                return;
            }
            case 11: {
                gsj gsj2 = (gsj)this.a;
                Object object = gsj2.b;
                hpn hpn2 = gsj2.c;
                return;
            }
            case 10: {
                Object object = ((gmr)this.a).a;
                Object object3 = gqk.c;
                synchronized (object3) {
                    if (!jse.i(gqk.d, object)) return;
                    gqk.d = null;
                    return;
                }
            }
            case 9: {
                Object object = this.a;
                HashMap hashMap = gqk.b;
                synchronized (hashMap) {
                    object = (gpc)gqk.b.remove(((gqe)object).a);
                    return;
                }
            }
            case 8: {
                ((grb)this.a).f.cancel(false);
                return;
            }
            case 7: {
                try {
                    while (!((gob)this.a).c.isShutdown()) {
                        gnz gnz2 = ((goa)((gob)this.a).b.remove()).a;
                        int n2 = gnz.b;
                        gnz2.m(null);
                    }
                }
                catch (Throwable throwable) {
                    try {
                        ((gob)this.a).c.execute(this);
                        throw throwable;
                    }
                    catch (RejectedExecutionException rejectedExecutionException) {
                        Iterator iterator = gob.a.keySet().iterator();
                        while (iterator.hasNext()) {
                            ((goa)iterator.next()).a.n(rejectedExecutionException);
                        }
                        throw throwable;
                    }
                }
                catch (InterruptedException interruptedException) {
                    try {
                        ((gob)this.a).c.execute(this);
                        return;
                    }
                    catch (RejectedExecutionException iterator) {
                        Iterator iterator2 = gob.a.keySet().iterator();
                        while (iterator2.hasNext()) {
                            ((goa)iterator2.next()).a.n(iterator);
                        }
                        return;
                    }
                }
                try {
                    ((gob)this.a).c.execute(this);
                    return;
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    Iterator object = gob.a.keySet().iterator();
                    while (object.hasNext()) {
                        ((goa)object.next()).a.n(rejectedExecutionException);
                    }
                    return;
                }
            }
            case 6: {
                ((gms)this.a).a = null;
                return;
            }
            case 5: {
                gld.j((hpn)this.a);
                return;
            }
            case 4: {
                gld.k((hpn)this.a);
                return;
            }
            case 3: {
                File file = gky.f(((gky)this.a).c);
                if (!file.exists()) return;
                if (!file.delete()) {
                    return;
                }
                ((heg)((heg)gky.a.h()).j("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryCleanUpPerProcessDatabase", 238, "SyncManagerDataStore.java")).r("Failed to delete per-process database file even though it exists");
                return;
            }
            case 2: {
                ((BroadcastReceiver.PendingResult)this.a).finish();
                return;
            }
            case 1: {
                gjh.g((hpn)this.a);
                return;
            }
            case 0: 
        }
        Object object = this.a;
        try {
            hhk.S((Future)object);
            return;
        }
        catch (Throwable throwable) {
            gqq.k(throwable);
            return;
        }
        catch (ExecutionException executionException) {
            if (executionException.getCause() instanceof fzs) {
                a.as(gjh.a.g(), "Got unexpected accountId. Was the account removed?", "com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "crashOnException", '\u0157', "IntentFilterAcledReceiver.java", executionException);
                return;
            }
            if (!(executionException.getCause() instanceof TimeoutException)) {
                gqq.k(executionException.getCause());
                return;
            }
            Throwable iterator = executionException.getCause();
            int n3 = gqq.a;
            gne.b(iterator);
            gpc gpc2 = gno.b();
            iterator = new gqq(iterator, gqq.l(gpc2, null));
            gqq.i(gpc2, iterator);
            gqq.g(gpc2, iterator);
            throw iterator;
        }
    }
}

