/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 */
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class dij
implements diu {
    public static final int a = (int)TimeUnit.HOURS.toMillis(4L);
    public static final int b = (int)TimeUnit.HOURS.toMillis(1L);
    public static final bzq h = new bzq(TimeUnit.MINUTES.toMillis(5L), new dcd(4));
    public final JobScheduler c;
    public final Context d;
    public final Class e;
    public final int f;
    public final int g;
    public final dly i = new dly(null);

    public dij(dii dii2) {
        JobScheduler jobScheduler = dii2.a;
        fxf.K(jobScheduler);
        this.c = jobScheduler;
        jobScheduler = dii2.b;
        fxf.K(jobScheduler);
        this.d = jobScheduler;
        this.e = dii2.c;
        this.f = dii2.d;
        this.g = dii2.e;
    }

    public final void a(dds dds2, int n2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/JobTaskScheduler", "doScheduleOneOff", 227, "JobTaskScheduler.java")).A("Scheduling one-off job for %s with delay: %s", dds2, n2);
        int n3 = n2 == 0 ? 0 : 1;
        JobInfo.Builder builder = new JobInfo.Builder(dly.C(dds2, n3), new ComponentName(this.d, this.e)).setMinimumLatency((long)n2 * 1000L);
        Object object = (dcr)dds2;
        builder = builder.setRequiresCharging(((dcr)object).b).setRequiresDeviceIdle(((dcr)object).c);
        n2 = true != ((dcr)object).a ? 1 : 2;
        builder = builder.setRequiredNetworkType(n2).setPersisted(true);
        ag$$ExternalSyntheticApiModelOutline0.m(builder, ((dcr)object).d);
        object = builder.build();
        if (this.c.schedule((JobInfo)object) == 1) {
            ddb.a();
            object = ddu.c();
            ((ddt)object).a = dds2;
            ((ddt)object).b(false);
            ((ddt)object).a().toString();
            return;
        }
        throw new dik();
    }
}

