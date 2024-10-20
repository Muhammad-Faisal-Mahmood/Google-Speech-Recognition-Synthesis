/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class dlr
implements imb {
    private final jnu a;
    private final int b;

    public dlr(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.b;
        Object object = null;
        switch (n2) {
            default: {
                return new ekc((czh)this.a.b());
            }
            case 19: {
                object = (Executor)this.a.b();
                return new dww();
            }
            case 18: {
                return new egi(((gdb)this.a).a());
            }
            case 17: {
                return new cxt((cgw)this.a.b());
            }
            case 16: {
                return new efu((ege)this.a.b());
            }
            case 15: {
                return new efh((efl)this.a.b());
            }
            case 14: {
                return new bzq(this.a, null);
            }
            case 13: {
                object = (ell)this.a.b();
                return new bzo(null);
            }
            case 12: {
                return dtv.a(((ilt)this.a).a());
            }
            case 11: {
                object = (cgw)this.a.b();
                return new dox();
            }
            case 10: {
                return new hdq((dmw)this.a.b());
            }
            case 9: {
                gto gto2 = (gto)((imc)this.a).a;
                object = gsl.a;
                return (dqs)gto2.e(new dqs((gto)object, (gto)object));
            }
            case 8: {
                return new dqm(this.a);
            }
            case 7: {
                return new Handler((Looper)((gtt)((bqw)this.a).a()).a);
            }
            case 6: {
                if (((gto)((imc)this.a).a).g()) {
                    object = gop.b();
                    object.a(don.c, new don());
                    object = new hdq(((gop)object).f());
                } else {
                    object = hdc.a;
                }
                idi.m(object);
                return object;
            }
            case 5: {
                object = Build.VERSION.SDK_INT >= 30 ? new hdq((dmw)this.a.b()) : hdc.a;
                idi.m(object);
                return object;
            }
            case 4: {
                return new dna((gup)this.a.b());
            }
            case 3: {
                Object object2 = ((ilt)this.a).a();
                Object object3 = object2.getPackageManager();
                object2 = object2.getPackageName();
                try {
                    object3 = object3.getPackageInfo((String)object2, (int)0).versionName;
                    object = object3;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    ((heg)((heg)((heg)dkc.a.h()).i(nameNotFoundException)).j("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionName", 89, "PrimesCoreMetricDaggerModule.java")).u("Failed to get PackageInfo for: %s", object2);
                }
                return object;
            }
            case 2: {
                return new dmr(ima.c(this.a));
            }
            case 1: {
                return new dlm((Object)((dln)this.a.b()), null);
            }
            case 0: 
        }
        return new dlq(((ilt)this.a).a());
    }
}

