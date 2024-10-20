/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.SystemClock
 */
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import j$.util.Collection$_EL;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class ddy
implements Callable {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ ddy(bmu bmu2, ddz ddz2, dea dea2, Object object, int n2) {
        this.e = n2;
        this.b = bmu2;
        this.c = ddz2;
        this.d = dea2;
        this.a = object;
    }

    public /* synthetic */ ddy(dmt dmt2, AtomicInteger atomicInteger, List list, List list2, int n2) {
        this.e = n2;
        this.c = dmt2;
        this.a = atomicInteger;
        this.d = list;
        this.b = list2;
    }

    public /* synthetic */ ddy(Object object, hpn hpn2, hpn hpn3, hpn hpn4, int n2) {
        this.e = n2;
        this.c = object;
        this.d = hpn2;
        this.b = hpn3;
        this.a = hpn4;
    }

    public final Object call() {
        int n2 = this.e;
        if (n2 != 0) {
            int n3;
            Object object;
            if (n2 != 1) {
                if (n2 != 2) {
                    gzx gzx2 = (gzx)hhk.S((Future)this.d);
                    gzx gzx3 = (gzx)hhk.S((Future)this.b);
                    gzx gzx4 = (gzx)hhk.S((Future)this.a);
                    if (!((faa)this.c).e.booleanValue()) {
                        n2 = gzx.d;
                        gzx2 = hct.a;
                    } else {
                        ((hfk)((hfk)faa.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "calculateRolledBackPacks", 251, "DefaultLanguagePackManagerImpl.java")).r("#calculateRolledBackPacks");
                        gzs gzs2 = new gzs();
                        gzs2.j(gzx2);
                        gzs2.j(gzx3);
                        gzx2 = (gzx)Collection$_EL.stream(gzs2.g()).filter(new bod(gzx4, 17)).collect(gye.a);
                    }
                    return gzx2;
                }
                hwp hwp2 = dte.a.l();
                boolean bl2 = hwp2.b.B();
                Object object2 = this.a;
                Object object3 = this.b;
                Object object4 = this.d;
                if (!bl2) {
                    hwp2.u();
                }
                Object object5 = this.c;
                Object object6 = hwp2.b;
                hwv hwv2 = (dte)object6;
                ((dte)hwv2).b = 1 | ((dte)hwv2).b;
                object5 = (dtf)object5;
                ((dte)hwv2).c = ((dtf)object5).b;
                if (!((hwv)object6).B()) {
                    hwp2.u();
                }
                object6 = ((dtf)object5).a;
                hwv hwv3 = hwp2.b;
                hwv2 = (dte)hwv3;
                ((dte)hwv2).b = 2 | ((dte)hwv2).b;
                ((dte)hwv2).d = object6;
                bl2 = ((dtf)object5).c;
                if (!hwv3.B()) {
                    hwp2.u();
                }
                hwv2 = hwp2.b;
                object6 = hwv2;
                ((dte)object6).b = 4 | ((dte)object6).b;
                ((dte)object6).e = bl2;
                bl2 = ((dtf)object5).d;
                if (!hwv2.B()) {
                    hwp2.u();
                }
                object5 = (dte)hwp2.b;
                ((dte)object5).b |= 0x20;
                ((dte)object5).i = bl2;
                try {
                    object4 = (gto)hhk.S((Future)object4);
                    if (((gto)object4).g()) {
                        object4 = (String)((gto)object4).c();
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object5 = (dte)hwp2.b;
                        ((dte)object5).b |= 0x10;
                        ((dte)object5).g = object4;
                    }
                }
                catch (Exception exception) {
                    a.as(dkc.a.c(), "Failed to set Account Name, falling back to Zwieback logging.", "com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", '^', "ClearcutMetricSnapshotBuilder.java", exception);
                }
                try {
                    object3 = (List)hhk.S((Future)object3);
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    object5 = (dte)hwp2.b;
                    object4 = ((dte)object5).h;
                    if (!object4.c()) {
                        ((dte)object5).h = hwv.q((hxb)object4);
                    }
                    hvc.g((Iterable)object3, ((dte)object5).h);
                }
                catch (Exception exception) {
                    a.as(dkc.a.c(), "Failed to set external Experiment Ids.", "com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'f', "ClearcutMetricSnapshotBuilder.java", exception);
                }
                try {
                    object2 = (gto)hhk.S((Future)object2);
                    if (((gto)object2).g()) {
                        object2 = (String)((gto)object2).c();
                        if (!hwp2.b.B()) {
                            hwp2.u();
                        }
                        object3 = (dte)hwp2.b;
                        ((dte)object3).b = 8 | ((dte)object3).b;
                        ((dte)object3).f = object2;
                    }
                }
                catch (Exception exception) {
                    a.as(dkc.a.c(), "Failed to set Zwieback.", "com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'p', "ClearcutMetricSnapshotBuilder.java", exception);
                }
                object2 = (hwr)dsy.a.l();
                ((hwr)object2).aH(dte.j, (dte)hwp2.o());
                return (dsy)((hwp)object2).o();
            }
            Object object7 = (AtomicInteger)this.a;
            n2 = ((AtomicInteger)object7).get();
            Object object8 = this.c;
            if (n2 > 0) {
                object = ((dmt)object8).g;
                n2 = ((AtomicInteger)object7).get();
                ((cyu)object).f(4, n2);
            }
            Iterator iterator = this.d;
            object7 = (dmt)object8;
            Object object9 = ((dmt)object7).a;
            object = (gto)((dmt)object7).f;
            object = crh.c((Context)object9, (gto)object);
            iterator = iterator.iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                object9 = (Uri)iterator.next();
                n3 = n2++;
                ((bmu)((dmt)object8).j).z((Uri)object9);
                n3 = n2;
                try {
                    ((cyu)((dmt)object8).g).d(1086);
                }
                catch (IOException iOException) {
                    ((cyu)((dmt)object7).g).d(1076);
                    cyr.j(iOException, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                    n2 = n3;
                }
            }
            object8 = this.b;
            cyr.d("%s: Total %d unaccounted file released. ", "ExpirationHandler", n2);
            n3 = ((dmt)object7).e((Uri)object, (List)object8);
            cyr.d("%s: Total %d unaccounted file deleted. ", "ExpirationHandler", n3);
            if (n3 > 0) {
                ((cyu)((dmt)object7).g).f(5, n3);
            }
            if (n2 > 0) {
                ((cyu)((dmt)object7).g).f(8, n2);
            }
            return null;
        }
        Object object = ((dea)this.d).c;
        Object object10 = this.c;
        long l2 = SystemClock.elapsedRealtime();
        Object object11 = object10.a((dcx)object);
        object10 = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/base/TaskRunner", "execute", 136, "TaskRunner.java");
        object = this.a;
        object10.B("Executed task for %s in %d ms.", ((bmu)this.b).q(object), SystemClock.elapsedRealtime() - l2);
        return object11;
    }
}

