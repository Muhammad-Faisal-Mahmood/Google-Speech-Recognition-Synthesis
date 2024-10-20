/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.telephony.TelephonyManager
 *  gda
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class gdh
implements imb {
    private final jnu a;
    private final int b;

    public gdh(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.b;
        Object var2_2 = null;
        switch (n2) {
            default: {
                return new gnu((gqa)this.a.b(), 0);
            }
            case 19: {
                void var2_5;
                if (!((Boolean)this.a.b()).booleanValue()) {
                    hdc hdc2 = hdc.a;
                } else {
                    hdq hdq2 = new hdq(new fxf());
                }
                idi.m(var2_5);
                return var2_5;
            }
            case 18: {
                return new gko(((ilt)this.a).a());
            }
            case 17: {
                return new goi(((ilt)this.a).a());
            }
            case 16: {
                Context context = ((ilt)this.a).a();
                crt.c();
                return new bmu(gzx.q(new fpr(new cxt(context, null))));
            }
            case 15: {
                return new gkb(((ilt)this.a).a(), 0);
            }
            case 14: {
                return new gfs(((ilt)this.a).a(), 2);
            }
            case 13: {
                return gho.a(((ggy)((Object)((be)((imc)this.a).a))).I(), gho.b);
            }
            case 12: {
                return gho.a(((gib)this.a.b()).a(), gho.a);
            }
            case 11: {
                void var2_10;
                fym fym2 = (fym)((imc)this.a).a;
                if (fym2 == null) {
                    Set set = Collections.emptySet();
                } else {
                    gon gon2 = gop.b();
                    fyn.a(gon2, fym2, gda.a);
                    Set<gop> set = Collections.singleton(((gop)((Object)gon2)).f());
                }
                idi.m(var2_10);
                return var2_10;
            }
            case 10: {
                return new hth(this.a);
            }
            case 9: {
                ggv ggv2 = (ggv)this.a.b();
                jse.e(ggv2, "fetcher");
                return new ggt(ggv2, 0);
            }
            case 8: {
                void var2_13;
                Context context = ((ilt)this.a).a();
                try {
                    Context context2 = context = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                    return var2_13;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return var2_13;
                }
            }
            case 7: {
                gpm gpm2 = (gpm)this.a.b();
                jse.e(gpm2, "updater");
                return new gfs(gpm2, 0);
            }
            case 6: {
                gpm gpm3 = (gpm)this.a.b();
                jse.e(gpm3, "state");
                return new AmbientModeSupport$AmbientController(gpm3);
            }
            case 5: {
                return new bmu(jns.f(new fpr(new cxt(((ilt)this.a).a(), null)), new fpv()));
            }
            case 4: {
                Map map = (Map)this.a.b();
                jse.e(map, "subpackagerMap");
                return new AmbientModeSupport$AmbientController(map);
            }
            case 3: {
                return new bmu((gto)((imc)this.a).a);
            }
            case 2: {
                jqf jqf2 = (jqf)this.a.b();
                jse.e(jqf2, "lightweightContext");
                return jvf.g(jqf2.plus(new jxa()));
            }
            case 1: {
                TelephonyManager telephonyManager = (TelephonyManager)((ilt)this.a).a().getSystemService("phone");
                idi.m(telephonyManager);
                return telephonyManager;
            }
            case 0: 
        }
        jqf jqf3 = (jqf)this.a.b();
        jse.e(jqf3, "blockingContext");
        return jvf.g(jqf3.plus(new jxa()));
    }
}

