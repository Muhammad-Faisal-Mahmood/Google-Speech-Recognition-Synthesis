/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.LayoutInflater;
import java.io.File;
import java.io.Serializable;
import java.util.Set;

public final class drq
implements gui {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ drq(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ drq(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                gsi gsi2 = (gsi)((acn)this.b.a()).a(gsi.class);
                gsi2.d = (gse)((bmu)this.a).c;
                return gsi2;
            }
            case 7: {
                Object object = this.a;
                Context context = (Context)this.b;
                return ((LayoutInflater)object).cloneInContext(context);
            }
            case 6: {
                Object object = this.b;
                Object object2 = this.a;
                try {
                    return ((PackageManager)((htf)object2).a).getPackageInfo((String)((String)object), (int)0).versionCode;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.w((String)"PhenotypeResourceReader", (String)"Failed to find version of package ".concat(String.valueOf(object)));
                    return null;
                }
            }
            case 5: {
                cya cya2 = ((dvp)this.b).a;
                Object object = (cag)this.a;
                object = (Set)cya2.d.get(((cag)object).i);
                if (object == null) return hdc.a;
                return object;
            }
            case 4: {
                Object object = (cag)this.a;
                object = new gtp(((cag)object).i, ((cag)object).h);
                object = (Set)((dvp)this.b).a.b.get(object);
                if (object == null) return hdc.a;
                return object;
            }
            case 3: {
                byte[] byArray = ((hvu)this.b).y();
                return ((hjd)((bmu)this.a).a).g(byArray);
            }
            case 2: {
                Object object = this.b;
                Object object3 = this.a;
                object = object.a();
                object3 = dua.c((Context)((fpn)object3).d);
                return (dus)((gto)object).d((gui)object3);
            }
            case 1: {
                Object object = this.a;
                Object object4 = this.b;
                synchronized (object4) {
                    String string = dlt.b();
                    String string2 = a.aw(string, ".trace");
                    Serializable serializable = new File(((Context)object).getFilesDir(), a.ai(string, "primes_profiling_"));
                    if (!serializable.exists() && !serializable.mkdir()) {
                        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).r("Could not create directory");
                        return gsl.a;
                    }
                    object = new File((File)serializable, string2);
                    ((File)object).deleteOnExit();
                    try {
                        if (!((File)object).exists()) return gto.i(object);
                        ((File)object).delete();
                        return gto.i(object);
                    }
                    catch (RuntimeException runtimeException) {
                        a.as(dkc.a.c(), "Exception when clearing trace file.", "com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", '\u0170', "CpuProfilingService.java", runtimeException);
                    }
                    return gto.i(object);
                }
            }
            case 0: 
        }
        int n2 = drr.f;
        float f2 = ((drm)this.b.b()).a;
        return ((dml)this.a).a(f2);
    }
}

