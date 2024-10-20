/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

public final class bdm
implements jqz {
    public final Object a;
    private final int b;

    public /* synthetic */ bdm(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Loose catch block
     */
    @Override
    public final Object a() {
        Object object;
        if (this.b != 0) {
            bib.a((bcz)this.a);
            return jon.a;
        }
        bdn bdn2 = (bdn)this.a;
        Object object2 = bdn2.b;
        if (Build.VERSION.SDK_INT >= 34) {
            ben.a((Context)object2).cancelAll();
        }
        if ((object2 = bep.e((Context)object2, object = (JobScheduler)object2.getSystemService("jobscheduler"))) != null && !object2.isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                bep.f(object, ((JobInfo)object2.next()).getId());
            }
        }
        bhe bhe2 = bdn2.d.z();
        object = (bhw)bhe2;
        object.a.j();
        object2 = object.h.d();
        ((bhw)bhe2).a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            ((axc)object2).a();
            ((bhw)bhe2).a.n();
        }
        catch (Throwable throwable) {
            ((bhw)bhe2).a.l();
            throw throwable;
        }
        try {
            ((bhw)bhe2).a.l();
            bcr.a(bdn2.c, bdn2.d, bdn2.e);
            return jon.a;
        }
        finally {
            object.h.f((axc)object2);
        }
    }
}

