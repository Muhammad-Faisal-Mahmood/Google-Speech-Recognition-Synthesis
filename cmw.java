/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Binder
 *  android.os.Build$VERSION
 */
import android.app.Application;
import android.os.Binder;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class cmw
implements Runnable {
    public final Object a;
    private final int b;

    public cmw(cku cku2, int n2) {
        this.b = n2;
        this.a = cku2;
    }

    public /* synthetic */ cmw(Object object, int n2) {
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
        dqx dqx2;
        Object object;
        int n2 = this.b;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        switch (n2) {
            default: {
                n2 = dqu.b;
                fpk.c();
                object = this.a;
                dqx2 = (dqx)object;
                if (dqx2.b.n == null) break;
                return;
            }
            case 19: {
                n2 = dqu.b;
                fpk.c();
                dqx dqx3 = (dqx)this.a;
                if (dqx3.b.m != null) {
                    return;
                }
                dqx3.b.m = dmz.a();
                return;
            }
            case 18: {
                ((dqy)this.a).a(0);
                return;
            }
            case 17: {
                dqy dqy2 = (dqy)this.a;
                if (dqy2.s.b != null) {
                    bl6 = true;
                }
                dqy2.f = bl6;
                return;
            }
            case 16: {
                dqy dqy3 = (dqy)this.a;
                bl6 = bl2;
                if (dqy3.s.b != null) {
                    bl6 = true;
                }
                dqy3.e = bl6;
                return;
            }
            case 15: {
                dqy dqy4 = (dqy)this.a;
                bl6 = bl3;
                if (dqy4.s.b != null) {
                    bl6 = true;
                }
                dqy4.d = bl6;
                return;
            }
            case 14: {
                dqy dqy5 = (dqy)this.a;
                bl6 = bl4;
                if (dqy5.s.b != null) {
                    bl6 = true;
                }
                dqy5.c = bl6;
                return;
            }
            case 13: {
                dqy dqy6 = (dqy)this.a;
                bl6 = bl5;
                if (dqy6.s.b != null) {
                    bl6 = true;
                }
                dqy6.b = bl6;
                return;
            }
            case 12: {
                ((dnc)this.a).a();
                return;
            }
            case 11: {
                dlq dlq2 = (dlq)this.a;
                djt djt2 = dlq2.h;
                fxf.K(djt2);
                if (dlq2.b == 0) {
                    dlq2.c = true;
                    Iterator iterator = dlq2.g.iterator();
                    while (iterator.hasNext()) {
                        ((dld)iterator.next()).k(djt2);
                    }
                }
                fxf.K(dlq2.h);
                dlq2.a();
                return;
            }
            case 10: {
                czz czz2 = (czz)this.a;
                long l2 = czz2.b.get();
                czz2.a.c(l2);
                return;
            }
            case 9: {
                throw (Throwable)this.a;
            }
            case 8: {
                throw (Throwable)this.a;
            }
            case 7: {
                n2 = cpu.d;
                throw (Throwable)this.a;
            }
            case 6: {
                ((coq)this.a).a.cancel(false);
                return;
            }
            case 5: {
                cpl.a.set(true);
                this.a.run();
                return;
            }
            case 4: {
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                this.a.a();
                return;
            }
            case 3: {
                this.a.b();
                return;
            }
            case 2: {
                ((cnd)((gtt)((cmz)this.a).f).a).j();
                return;
            }
            case 1: {
                Object object2 = ((cku)this.a).a;
                synchronized (object2) {
                    ((cks)((cku)this.a).b).b.m();
                    return;
                }
            }
            case 0: {
                Object object3 = this.a;
                Object object4 = (cmz)object3;
                if (((cmz)object4).e) {
                    object3 = ((cmz)object4).g;
                    String string = ((cmz)object4).c();
                    Object object5 = ((cmz)object4).c;
                    ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopDetection", 406, "ConcurrentSodaManager.java")).r("#stopDetection");
                    object4 = ((cmn)object3).h;
                    synchronized (object4) {
                        cnd cnd2 = ((cmn)object3).c(string, (cmt)object5);
                        if (cnd2 != null && cnd2.p()) {
                            ((heg)((heg)cmn.a.c()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopDetection", 410, "ConcurrentSodaManager.java")).r("Stopping SODA");
                            object5 = ((cmn)object3).j;
                            bpt bpt2 = new bpt(object3, string, 2);
                            object5.put(string, hhk.R(kl.o(bpt2), 500L, TimeUnit.MILLISECONDS, ((cmn)object3).d));
                            try {
                                cnd2.m();
                            }
                            catch (IllegalStateException illegalStateException) {
                                a.as(cmn.a.g(), "SODA failed to stop capturing.", "com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopDetection", '\u01ae', "ConcurrentSodaManager.java", illegalStateException);
                            }
                        }
                        return;
                    }
                }
                if (((cmz)object4).g()) {
                    ((heg)((heg)cmz.a.c()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "stopDetection", 578, "SodaDetectionHandler.java")).r("Stopping SODA");
                    try {
                        ((cnd)((gtt)((cmz)object3).f).a).m();
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        a.as(cmz.a.g(), "SODA failed to stop capturing.", "com/google/android/libraries/assistant/soda/SodaDetectionHandler", "stopDetection", '\u0246', "SodaDetectionHandler.java", illegalStateException);
                    }
                }
                return;
            }
        }
        dqx2.b.n = dmz.a();
        long l3 = dqx2.b.n.a;
        if (Build.VERSION.SDK_INT >= 29) {
            dp$$ExternalSyntheticApiModelOutline0.m("Primes-ttfdd-end-and-length-ms", l3 - ag$$ExternalSyntheticApiModelOutline1.m());
            dp$$ExternalSyntheticApiModelOutline0.m("Primes-ttfdd-end-and-length-ms", 0L);
        }
        dqx2.a.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
    }
}

