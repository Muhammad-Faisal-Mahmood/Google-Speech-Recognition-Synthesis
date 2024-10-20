/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  android.os.SystemClock
 */
package com.google.android.libraries.micore.superpacks.scheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class DownloadJobService
extends JobService {
    private dhz a;

    private static ddu c(JobParameters jobParameters) {
        ddt ddt2 = ddu.c();
        ddt2.a = dly.A(jobParameters.getJobId());
        ddt2.b(false);
        return ddt2.a();
    }

    final dhz a() {
        if (this.a == null) {
            this.a = new dhz(this.b(), new dib(this));
        }
        return this.a;
    }

    public final dia b() {
        Context context = this.getApplicationContext();
        Object object = new ArrayList();
        Object object2 = ddv.a;
        Object object3 = new dhc();
        ((dhc)object3).a = this.getApplicationContext();
        ((dhc)object3).b = ddw.a;
        object.addAll(gzx.q(((dhc)object3).a()));
        object2 = dly.E((ScheduledExecutorService)object2, object);
        ((dgv)object2).d.c(new dih(dip.d));
        object = new bzq((Object)dfp.b(context), null);
        object3 = ddv.a;
        if (object3 != null) {
            dil dil2 = dil.a;
            dii dii2 = new dii();
            dii2.b = context;
            dii2.c = ((Object)((Object)this)).getClass();
            return new dia(dii2.a(), dil2, (hpr)object3, (dgv)object2, (bzq)object);
        }
        throw new NullPointerException("Null controlExecutor");
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        dhz dhz2 = this.a();
        ddu ddu2 = DownloadJobService.c(jobParameters);
        boolean bl2 = dly.B(jobParameters.getJobId());
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 45, "DownloadJob.java")).u("====> Starting job %s", ddu2);
        Object object = dhz2.a;
        diu diu2 = ((dia)object).a;
        bzq bzq2 = ((dia)object).e;
        object = ((dia)object).c;
        dhz2.b = SystemClock.elapsedRealtime();
        ddb.a();
        ddu2.toString();
        ddb.a();
        ddu2.toString();
        crh.v(hmv.g(object.bf(new dhx(dhz2, ddu2, bl2, jobParameters, diu2, bzq2)), Throwable.class, new cwf(dhz2, bl2, ddu2, jobParameters, 2), (Executor)object), new dhy(dhz2, bl2, ddu2, jobParameters), (Executor)object);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onStopJob(JobParameters object) {
        Object object2 = this.a();
        Object object3 = DownloadJobService.c(object);
        long l2 = SystemClock.elapsedRealtime();
        long l3 = ((dhz)object2).b;
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStopJob", 129, "DownloadJob.java")).B("<<<<< Stopping job %s, %d ms. elapsed since start", object3, l2 - l3);
        ddb.a();
        ((ddu)object3).toString();
        object = dip.a;
        synchronized (object) {
            object2 = dip.e;
            ((bmu)object2).a.remove(object3);
            object3 = ((bmu)object2).l((ddu)object3).iterator();
            while (object3.hasNext()) {
                ((dhv)object3.next()).b(4, (cxv)((bmu)object2).b);
            }
            return false;
        }
    }
}

