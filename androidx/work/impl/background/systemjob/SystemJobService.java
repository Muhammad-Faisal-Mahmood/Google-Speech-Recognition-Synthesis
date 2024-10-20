/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.os.PersistableBundle
 */
package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.wear.ambient.WearableControllerProvider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SystemJobService
extends JobService
implements bcc {
    private static final String a = bbi.b("SystemJobService");
    private bdn b;
    private final Map c = new HashMap();
    private final bcs d = abr.l(false);
    private bxt e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static bgs b(JobParameters object) {
        PersistableBundle persistableBundle;
        try {
            persistableBundle = object.getExtras();
            if (persistableBundle == null) return null;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
        if (!persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) return null;
        return new bgs(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION"));
    }

    private static void c(String string) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(a.aj(string, "Cannot invoke ", " on a background thread"));
    }

    @Override
    public final void a(bgs bgs2, boolean bl2) {
        SystemJobService.c("onExecuted");
        bbi.a();
        String string = bgs2.a;
        string = (JobParameters)this.c.remove(bgs2);
        this.d.c(bgs2);
        if (string != null) {
            this.jobFinished((JobParameters)string, bl2);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            bxt bxt2;
            bdn bdn2;
            this.b = bdn2 = bdn.i(this.getApplicationContext());
            bcn bcn2 = bdn2.f;
            this.e = bxt2 = new bxt(bcn2, bdn2.k);
            bcn2.a(this);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            if (Application.class.equals(this.getApplication().getClass())) {
                bbi.a().f(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        bdn bdn2 = this.b;
        if (bdn2 != null) {
            bdn2.f.b(this);
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        SystemJobService.c("onStartJob");
        if (this.b == null) {
            bbi.a();
            this.jobFinished(jobParameters, true);
            return false;
        }
        bgs bgs2 = SystemJobService.b(jobParameters);
        if (bgs2 == null) {
            bbi.a().c(a, "WorkSpec id not found!");
            return false;
        }
        if (this.c.containsKey(bgs2)) {
            bbi.a();
            Objects.toString(bgs2);
            ((Object)bgs2).toString();
            return false;
        }
        bbi.a();
        Objects.toString(bgs2);
        ((Object)bgs2).toString();
        this.c.put(bgs2, jobParameters);
        WearableControllerProvider wearableControllerProvider = new WearableControllerProvider(null);
        if (ag$$ExternalSyntheticApiModelOutline1.m(jobParameters) != null) {
            Arrays.asList(ag$$ExternalSyntheticApiModelOutline1.m(jobParameters));
        }
        if (ag$$ExternalSyntheticApiModelOutline1.m(jobParameters) != null) {
            Arrays.asList(ag$$ExternalSyntheticApiModelOutline1.m(jobParameters));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            fs$$ExternalSyntheticApiModelOutline0.m(jobParameters);
        }
        this.e.z(this.d.d(bgs2), wearableControllerProvider);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onStopJob(JobParameters object) {
        SystemJobService.c("onStopJob");
        if (this.b == null) {
            bbi.a();
            return true;
        }
        Object object2 = SystemJobService.b(object);
        if (object2 == null) {
            bbi.a().c(a, "WorkSpec id not found!");
            return false;
        }
        bbi.a();
        Objects.toString(object2);
        object2.toString();
        this.c.remove(object2);
        Object object3 = this.d.c((bgs)object2);
        if (object3 != null) {
            int n2;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = n2 = -512;
            if (n3 >= 31) {
                n4 = ut$$ExternalSyntheticApiModelOutline0.m(object);
                switch (n4) {
                    default: {
                        n4 = n2;
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                }
            }
            this.e.A((bzb)object3, n4);
        }
        object = this.b.f;
        object3 = ((bgs)object2).a;
        object2 = object.j;
        synchronized (object2) {
            boolean bl2 = object.h.contains(object3);
            return !bl2;
        }
    }
}

