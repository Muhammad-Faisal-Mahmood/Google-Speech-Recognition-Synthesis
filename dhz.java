/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.os.SystemClock
 */
import android.app.job.JobParameters;
import android.os.SystemClock;

public final class dhz {
    public final dia a;
    public long b = 0L;
    public final dib c;

    public dhz(dia dia2, dib dib2) {
        this.a = dia2;
        this.c = dib2;
    }

    public final void a(ddu ddu2, Object object) {
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "finishJob", 161, "DownloadJob.java")).B("<==== Finishing job %s, %d ms. elapsed since start", ddu2, SystemClock.elapsedRealtime() - this.b);
        ddb.a();
        ddu2.toString();
        this.c.a.jobFinished((JobParameters)object, false);
    }
}

