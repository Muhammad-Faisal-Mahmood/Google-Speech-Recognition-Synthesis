/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class dqe
implements hny {
    public final dqf a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;

    public /* synthetic */ dqe(dqf dqf2, String string, long l2, int n2, String string2) {
        this.a = dqf2;
        this.b = string;
        this.c = l2;
        this.e = n2;
        this.d = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        Throwable throwable2;
        Object object2;
        block37: {
            long l2;
            Object object3;
            Object object4;
            hyg hyg2;
            boolean bl2;
            boolean bl3;
            int n2;
            Object object5;
            dqi dqi2;
            dqf dqf2;
            hwp hwp2;
            kdo kdo2;
            block36: {
                kdo2 = (kdo)object;
                hwp2 = kfl.a.l();
                dqf2 = this.a;
                dqi2 = dqf2.d;
                object = dqi2.e;
                object5 = dqi2.b;
                n2 = Process.myPid();
                bl3 = ((bmu)object).H(dlt.a((Context)object5));
                object = dqi2.a.b();
                fpk.b();
                bl2 = ((dpt)object).b;
                hyg2 = null;
                if (bl2) {
                    object = new ActivityManager.MemoryInfo();
                    object5 = dqi2.b;
                    if (dlt.a == null) {
                        synchronized (dlt.class) {
                            if (dlt.a == null) {
                                object5 = object5.getSystemService("activity");
                                fxf.K(object5);
                                dlt.a = (ActivityManager)object5;
                            }
                        }
                    }
                    dlt.a.getMemoryInfo((ActivityManager.MemoryInfo)object);
                } else {
                    object = null;
                }
                object2 = StrictMode.allowThreadDiskReads();
                try {
                    try {
                        object5 = (Boolean)dqi2.c.b() != false ? new File(a.ah(n2, "/proc/", "/status")) : new File("/proc/self/status");
                        Charset charset = Charset.defaultCharset();
                        object4 = new hhk(null);
                        fxf.K(object5);
                        fxf.K(charset);
                        object3 = new String(hjk.b((File)object5, (hhk)object4), charset);
                        if (((String)object3).isEmpty()) {
                            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 252, "MemoryUsageCapture.java")).r("Null or empty proc status");
                            object5 = hyg2;
                            break block36;
                        }
                        object5 = new dqh();
                        ((dqh)object5).f = dqi.b(dqh.a, (String)object3);
                        ((dqh)object5).g = dqi.b(dqh.b, (String)object3);
                        ((dqh)object5).h = dqi.b(dqh.c, (String)object3);
                        ((dqh)object5).i = dqi.b(dqh.d, (String)object3);
                        ((dqh)object5).j = dqi.b(dqh.e, (String)object3);
                    }
                    catch (IOException iOException) {
                        a.as(dkc.a.h(), "Error reading proc status", "com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", '\u0121', "MemoryUsageCapture.java", iOException);
                        object5 = hyg2;
                    }
                }
                catch (Throwable throwable2) {
                    break block37;
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object2);
            hyg2 = (hwr)kdt.a.l();
            object2 = kds.a.l();
            object3 = kdq.a.l();
            if (object != null) {
                l2 = ((ActivityManager.MemoryInfo)object).availMem;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                n2 = (int)(l2 >> 10);
                object4 = (kdq)((hwp)object3).b;
                ((kdq)object4).b |= 0x20000;
                ((kdq)object4).c = n2;
                l2 = ((ActivityManager.MemoryInfo)object).totalMem;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                n2 = (int)(l2 >> 20);
                object = (kdq)((hwp)object3).b;
                ((kdq)object).b |= 0x40000;
                ((kdq)object).d = n2;
            }
            if (object5 != null) {
                object = ((dqh)object5).f;
                if (object != null) {
                    l2 = (Long)object;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (kdq)((hwp)object3).b;
                    ((kdq)object).b |= 0x80000;
                    ((kdq)object).e = l2;
                }
                if ((object = ((dqh)object5).g) != null) {
                    l2 = (Long)object;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (kdq)((hwp)object3).b;
                    ((kdq)object).b |= 0x100000;
                    ((kdq)object).f = l2;
                }
                if ((object = ((dqh)object5).h) != null) {
                    l2 = (Long)object;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (kdq)((hwp)object3).b;
                    ((kdq)object).b |= 0x200000;
                    ((kdq)object).g = l2;
                }
                if ((object = ((dqh)object5).i) != null) {
                    l2 = (Long)object;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (kdq)((hwp)object3).b;
                    ((kdq)object).b |= 0x400000;
                    ((kdq)object).h = l2;
                }
                if ((object = ((dqh)object5).j) != null) {
                    l2 = (Long)object;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (kdq)((hwp)object3).b;
                    ((kdq)object).b |= 0x800000;
                    ((kdq)object).i = l2;
                }
            }
            object5 = (kdq)((hwp)object3).o();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (kds)((hwp)object2).b;
            object5.getClass();
            ((kds)object).c = object5;
            ((kds)object).b |= 1;
            if (!hyg2.b.B()) {
                ((hwp)hyg2).u();
            }
            object = (kdt)hyg2.b;
            object5 = (kds)((hwp)object2).o();
            object5.getClass();
            ((kdt)object).c = object5;
            ((kdt)object).b |= 1;
            object = kes.a.l();
            object5 = cxu.d(bl3, dlt.a((Context)dqi2.d.a));
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (kes)((hwp)object).b;
            object5.getClass();
            ((kes)object2).c = object5;
            ((kes)object2).b |= 1;
            if (!hyg2.b.B()) {
                ((hwp)hyg2).u();
            }
            object5 = (kdt)hyg2.b;
            object = (kes)((hwp)object).o();
            object.getClass();
            ((kdt)object5).d = object;
            ((kdt)object5).b |= 2;
            object = kdr.a.l();
            object5 = dqi2.b.getSystemService("power");
            fxf.K(object5);
            bl2 = ((PowerManager)object5).isInteractive();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object5 = (kdr)((hwp)object).b;
            ((kdr)object5).b |= 1;
            ((kdr)object5).c = bl2;
            if (!hyg2.b.B()) {
                ((hwp)hyg2).u();
            }
            object5 = (kdt)hyg2.b;
            object = (kdr)((hwp)object).o();
            object.getClass();
            ((kdt)object5).f = object;
            ((kdt)object5).b |= 8;
            if (!hyg2.b.B()) {
                ((hwp)hyg2).u();
            }
            object = this.d;
            n2 = this.e;
            object5 = (kdt)hyg2.b;
            ((kdt)object5).e = n2 - 1;
            ((kdt)object5).b |= 4;
            if (object != null) {
                if (!hyg2.b.B()) {
                    ((hwp)hyg2).u();
                }
                object5 = (kdt)hyg2.b;
                ((kdt)object5).b |= 0x10;
                ((kdt)object5).g = object;
            }
            hyg2 = (kdt)hyg2.o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            l2 = this.c;
            object = this.b;
            object5 = (kfl)hwp2.b;
            hyg2.getClass();
            ((kfl)object5).f = hyg2;
            ((kfl)object5).b |= 8;
            hyg2 = (kfl)hwp2.o();
            object5 = dmq.a();
            ((fhc)object5).b = object;
            ((fhc)object5).g(true);
            ((fhc)object5).e = l2;
            ((fhc)object5).i((kfl)hyg2);
            ((fhc)object5).d = kdo2;
            if (dqf.c(n2)) {
                ((fhc)object5).h(true);
            }
            return dqf2.c.b(((fhc)object5).e());
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object2);
        throw throwable2;
    }
}

