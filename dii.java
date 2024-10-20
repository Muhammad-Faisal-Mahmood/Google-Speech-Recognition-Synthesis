/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobScheduler
 *  android.content.Context
 */
import android.app.job.JobScheduler;
import android.content.Context;
import com.google.android.libraries.micore.superpacks.scheduling.DownloadJobService;

public final class dii {
    public JobScheduler a;
    public Context b;
    public Class c = DownloadJobService.class;
    public final int d = dij.a;
    public final int e = dij.b;

    public final dij a() {
        if (this.a == null) {
            Context context = this.b;
            fxf.K(context);
            this.a = (JobScheduler)context.getSystemService("jobscheduler");
        }
        return new dij(this);
    }
}

