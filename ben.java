/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;

public final class ben {
    private static final String a = bbi.b("SystemJobScheduler");

    public static final JobScheduler a(Context object) {
        jse.e(object, "<this>");
        object = object.getSystemService("jobscheduler");
        jse.c(object, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler)object;
        object = jobScheduler;
        if (Build.VERSION.SDK_INT >= 34) {
            jse.e(jobScheduler, "jobScheduler");
            object = mk$$ExternalSyntheticApiModelOutline0.m(jobScheduler, "androidx.work.systemjobscheduler");
            jse.d(object, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        }
        return object;
    }

    public static final List b(JobScheduler object) {
        jse.e(object, "<this>");
        try {
            jse.e(object, "jobScheduler");
            object = object.getAllPendingJobs();
            jse.d(object, "jobScheduler.allPendingJobs");
        }
        catch (Throwable throwable) {
            String string = a;
            bbi.a().d(string, "getAllPendingJobs() is not reliable on this device.", throwable);
            object = null;
        }
        return object;
    }
}

