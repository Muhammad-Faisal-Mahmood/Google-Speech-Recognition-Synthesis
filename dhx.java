/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.os.SystemClock
 */
import android.app.job.JobParameters;
import android.os.SystemClock;
import java.util.concurrent.Callable;

public final class dhx
implements Callable {
    public final dhz a;
    public final ddu b;
    public final boolean c;
    public final Object d;
    public final diu e;
    public final bzq f;

    public /* synthetic */ dhx(dhz dhz2, ddu ddu2, boolean bl2, Object object, diu diu2, bzq bzq2) {
        this.a = dhz2;
        this.b = ddu2;
        this.c = bl2;
        this.d = object;
        this.e = diu2;
        this.f = bzq2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object call() {
        Object object = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 73, "DownloadJob.java");
        long l2 = SystemClock.elapsedRealtime();
        Object object2 = this.a;
        long l3 = ((dhz)object2).b;
        Object object3 = this.b;
        object.B("Job %s starting work, %d ms. elapsed since job start", object3, l2 - l3);
        if (this.c) {
            Object object4 = this.d;
            ai ai2 = new ai(object2, object3, object4, 17, null);
            itu itu2 = new itu(null);
            object = ((dhz)object2).a;
            itu2.d = ((dia)object).a;
            itu2.c = ((dia)object).c;
            itu2.e = ((dia)object).e;
            itu2.g = ((dia)object).b;
            itu2.a = object3;
            itu2.b = ai2;
            itu2.f = ((dia)object).d;
            object3 = new dir(itu2);
            object2 = object = ((dhz)object2).c.a.b().a;
            if (!(object instanceof dij)) {
                object2 = null;
            }
            if (object2 == null) throw new IllegalStateException("Could not find the job task scheduler for this service");
            object2 = (JobParameters)object4;
            int n2 = object2.getJobId();
            if (dly.B(object2.getJobId())) {
                dij.h.h(dly.A(n2));
            }
            object2 = object3;
        } else {
            object2 = null;
        }
        object3 = this.f;
        dip.b(this.e, (bzq)object3, (dir)object2, System.currentTimeMillis(), "job start");
        return null;
    }
}

