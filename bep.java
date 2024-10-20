/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobInfo$TriggerContentUri
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.net.NetworkRequest
 *  android.net.NetworkRequest$Builder
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 */
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class bep
implements bcp {
    public static final int a = 0;
    private static final String b = bbi.b("SystemJobScheduler");
    private final Context c;
    private final JobScheduler d;
    private final beo e;
    private final WorkDatabase f;
    private final bam g;

    public bep(Context context, WorkDatabase workDatabase, bam bam2) {
        JobScheduler jobScheduler = ben.a(context);
        Object object = bam2.p;
        object = new beo(context, bam2.n);
        this.c = context;
        this.d = jobScheduler;
        this.e = object;
        this.f = workDatabase;
        this.g = bam2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bgs a(JobInfo object) {
        PersistableBundle persistableBundle = object.getExtras();
        if (persistableBundle == null) return null;
        try {
            if (!persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) return null;
            int n2 = persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
            return new bgs(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), n2);
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler object) {
        Object object2 = ben.b((JobScheduler)object);
        if (object2 == null) {
            return null;
        }
        object = new ArrayList(object2.size());
        context = new ComponentName(context, SystemJobService.class);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            JobInfo jobInfo = (JobInfo)object2.next();
            if (!context.equals((Object)jobInfo.getService())) continue;
            object.add(jobInfo);
        }
        return object;
    }

    public static void f(JobScheduler jobScheduler, int n2) {
        try {
            jobScheduler.cancel(n2);
            return;
        }
        catch (Throwable throwable) {
            bbi.a().d(b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n2), throwable);
            return;
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void b(String string) {
        Object object;
        Object object2;
        Object object3 = bep.e(this.c, this.d);
        if (object3 == null) {
            object2 = null;
        } else {
            object2 = new ArrayList(2);
            object3 = object3.iterator();
            while (object3.hasNext()) {
                object = (JobInfo)object3.next();
                bgs bgs2 = bep.a(object);
                if (bgs2 == null || !string.equals(bgs2.a)) continue;
                object2.add(object.getId());
            }
        }
        if (object2 != null && !object2.isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                int n2 = (Integer)object2.next();
                bep.f(this.d, n2);
            }
            object = this.f.w();
            object2 = (bgr)object;
            ((bgr)object2).a.j();
            object3 = ((bgr)object2).c.d();
            ((axb)object3).g(1, string);
            ((bgr)object).a.k();
            {
                catch (Throwable throwable) {
                    throw throwable;
                }
            }
            try {
                ((axc)object3).a();
                ((bgr)object).a.n();
            }
            catch (Throwable throwable) {
                ((bgr)object).a.l();
                throw throwable;
            }
            try {
                ((bgr)object).a.l();
                return;
            }
            finally {
                ((bgr)object2).c.f((axc)object3);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(bhd ... bhdArray) {
        bzb bzb2 = new bzb(this.f, null);
        for (bhd bhd2 : bhdArray) {
            void var5_7;
            int n2;
            Object object;
            Object object2;
            Object object3;
            block9: {
                block8: {
                    this.f.k();
                    try {
                        object3 = this.f.z().b(bhd2.b);
                        if (object3 != null) break block8;
                        object3 = bbi.a();
                        object2 = b;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Skipping scheduling ");
                        ((StringBuilder)object).append(bhd2.b);
                        ((StringBuilder)object).append(" because it's no longer in the DB");
                        ((bbi)object3).f((String)object2, ((StringBuilder)object).toString());
                        this.f.n();
                        WorkDatabase workDatabase = this.f;
                    }
                    catch (Throwable throwable) {
                        this.f.l();
                        throw throwable;
                    }
                }
                if (((bhd)object3).c == bbv.a) break block9;
                object = bbi.a();
                object3 = b;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Skipping scheduling ");
                ((StringBuilder)object2).append(bhd2.b);
                ((StringBuilder)object2).append(" because it is no longer enqueued");
                ((bbi)object).f((String)object3, ((StringBuilder)object2).toString());
                this.f.n();
                WorkDatabase workDatabase = this.f;
            }
            object3 = AmbientLifecycleObserverKt.o(bhd2);
            object = ass.d(this.f.w(), (bgs)object3);
            if (object != null) {
                n2 = ((bgm)object).c;
            } else {
                n2 = this.g.k;
                object2 = bzb2.a;
                bdr bdr2 = new bdr(bzb2, 4);
                object2 = ((aum)object2).e(bdr2);
                jse.d(object2, "workDatabase.runInTransa\u2026d\n            }\n        )");
                n2 = ((Number)object2).intValue();
            }
            if (object == null) {
                object3 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.e((bgs)object3, n2);
                this.f.w().a((bgm)object3);
            }
            this.g(bhd2, n2);
            this.f.n();
            WorkDatabase workDatabase = this.f;
            var5_7.l();
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    public final void g(bhd object, int n2) {
        int n3;
        int n4;
        Object object22;
        Object object3;
        Object object4;
        Object object5;
        block27: {
            block31: {
                block29: {
                    block30: {
                        block28: {
                            block26: {
                                object5 = ((bhd)object).k;
                                object4 = new PersistableBundle();
                                object4.putString("EXTRA_WORK_SPEC_ID", ((bhd)object).b);
                                object4.putInt("EXTRA_WORK_SPEC_GENERATION", ((bhd)object).u);
                                object4.putBoolean("EXTRA_IS_PERIODIC", ((bhd)object).d());
                                object3 = this.e;
                                object4 = new JobInfo.Builder(n2, ((beo)object3).a).setRequiresCharging(((baq)object5).d).setRequiresDeviceIdle(((baq)object5).e).setExtras((PersistableBundle)object4);
                                object22 = ((baq)object5).a();
                                n4 = Build.VERSION.SDK_INT;
                                n3 = 0;
                                if (n4 < 28 || object22 == null) break block26;
                                jse.e(object4, "builder");
                                fs$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, (NetworkRequest)object22);
                                break block27;
                            }
                            object22 = ((baq)object5).b;
                            if (Build.VERSION.SDK_INT < 30 || object22 != bbj.f) break block28;
                            fs$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, new NetworkRequest.Builder().addCapability(25).build());
                            break block27;
                        }
                        int n5 = ((Enum)object22).ordinal();
                        if (n5 == 0) break block29;
                        if (n5 == 1) break block30;
                        n4 = 2;
                        if (n5 == 2) break block31;
                        n4 = 3;
                        if (n5 == 3) break block31;
                        n4 = 4;
                        if (n5 == 4) break block31;
                        bbi.a();
                        Objects.toString(object22);
                    }
                    n4 = 1;
                    break block31;
                }
                n4 = 0;
            }
            object4.setRequiredNetworkType(n4);
        }
        if (!((baq)object5).e) {
            n4 = ((bhd)object).m == bak.b ? 0 : 1;
            object4.setBackoffCriteria(((bhd)object).n, n4);
        }
        long l2 = Math.max(((bhd)object).a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            object4.setMinimumLatency(l2);
        } else if (l2 > 0L) {
            object4.setMinimumLatency(l2);
        } else if (!((bhd)object).r && ((beo)object3).b) {
            fs$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, true);
        }
        if (((baq)object5).b()) {
            for (Object object22 : ((baq)object5).j) {
                n4 = ((bap)object22).b ? 1 : 0;
                ag$$ExternalSyntheticApiModelOutline1.m((JobInfo.Builder)object4, new JobInfo.TriggerContentUri(((bap)object22).a, n4));
            }
            ag$$ExternalSyntheticApiModelOutline1.m((JobInfo.Builder)object4, ((baq)object5).h);
            ag$$ExternalSyntheticApiModelOutline1.m$1((JobInfo.Builder)object4, ((baq)object5).i);
        }
        object4.setPersisted(false);
        ag$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, ((baq)object5).f);
        ag$$ExternalSyntheticApiModelOutline0.m$1((JobInfo.Builder)object4, ((baq)object5).g);
        n4 = ((bhd)object).l;
        if (Build.VERSION.SDK_INT >= 31 && ((bhd)object).r && n4 <= 0 && l2 <= 0L) {
            ut$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (object5 = ((bhd)object).y) != null) {
            ki$$ExternalSyntheticApiModelOutline0.m((JobInfo.Builder)object4, (String)object5);
        }
        object4 = object4.build();
        bbi.a();
        object5 = ((bhd)object).b;
        try {
            if (this.d.schedule((JobInfo)object4) == 0) {
                object3 = bbi.a();
                object4 = b;
                object5 = new StringBuilder();
                ((StringBuilder)object5).append("Unable to schedule work ID ");
                ((StringBuilder)object5).append(((bhd)object).b);
                ((bbi)object3).f((String)object4, ((StringBuilder)object5).toString());
                if (((bhd)object).r && ((bhd)object).s == bbr.a) {
                    ((bhd)object).r = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", ((bhd)object).b);
                    bbi.a();
                    this.g((bhd)object, n2);
                }
            }
            return;
        }
        catch (Throwable throwable) {
            object3 = bbi.a();
            object5 = b;
            Objects.toString(object);
            ((bbi)object3).d((String)object5, "Unable to schedule ".concat(String.valueOf(object)), throwable);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Object object6 = this.c;
            object = this.f;
            object3 = this.g;
            jse.e(object6, "context");
            jse.e(object, "workDatabase");
            jse.e(object3, "configuration");
            n4 = ((WorkDatabase)object).z().d().size();
            n2 = Build.VERSION.SDK_INT;
            object = "<faulty JobScheduler failed to getPendingJobs>";
            if (n2 >= 34) {
                object4 = ben.a((Context)object6);
                object22 = ben.b((JobScheduler)object4);
                if (object22 != null) {
                    object = bep.e((Context)object6, (JobScheduler)object4);
                    n2 = object != null ? object22.size() - object.size() : 0;
                    object4 = null;
                    if (n2 == 0) {
                        object = null;
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(n2);
                        ((StringBuilder)object).append(" of which are not owned by WorkManager");
                        object = ((StringBuilder)object).toString();
                    }
                    Object object7 = object6.getSystemService("jobscheduler");
                    jse.c(object7, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    object6 = bep.e((Context)object6, (JobScheduler)object7);
                    n2 = n3;
                    if (object6 != null) {
                        n2 = object6.size();
                    }
                    if (n2 != 0) {
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(n2);
                        ((StringBuilder)object4).append(" from WorkManager in the default namespace");
                        object4 = ((StringBuilder)object4).toString();
                    }
                    object6 = new StringBuilder();
                    ((StringBuilder)object6).append(object22.size());
                    ((StringBuilder)object6).append(" jobs in \"androidx.work.systemjobscheduler\" namespace");
                    object = jns.D(jns.Q(new String[]{((StringBuilder)object6).toString(), object, object4}), ",\n", null, null, null, 62);
                }
            } else {
                object4 = bep.e((Context)object6, ben.a((Context)object6));
                if (object4 != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(object4.size());
                    ((StringBuilder)object).append(" jobs from WorkManager");
                    object = ((StringBuilder)object).toString();
                }
            }
            n2 = Build.VERSION.SDK_INT >= 31 ? 150 : 100;
            object4 = new StringBuilder("JobScheduler ");
            ((StringBuilder)object4).append(n2);
            ((StringBuilder)object4).append(" job limit exceeded.\nIn JobScheduler there are ");
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(".\nThere are ");
            ((StringBuilder)object4).append(n4);
            ((StringBuilder)object4).append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            ((StringBuilder)object4).append(((bam)object3).m);
            ((StringBuilder)object4).append('.');
            object = ((StringBuilder)object4).toString();
            bbi.a().c(b, (String)object);
            object4 = new IllegalStateException((String)object, illegalStateException);
            object = this.g.g;
            if (object != null) {
                object.a(object4);
                return;
            }
            throw object4;
        }
    }
}

