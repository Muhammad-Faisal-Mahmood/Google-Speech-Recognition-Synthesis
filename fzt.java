/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class fzt
implements imb {
    private final jnu a;
    private final jnu b;
    private final int c;

    public fzt(jnu jnu2, jnu jnu3, int n2) {
        this.c = n2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public fzt(jnu jnu2, jnu jnu3, int n2, boolean[] blArray) {
        this.c = n2;
        this.b = jnu2;
        this.a = jnu3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object b() {
        switch (this.c) {
            default: {
                var1_1 = ((imc)this.b).a;
                return new giu(((ils)this.a).a(), (Set)var1_1);
            }
            case 19: {
                var2_24 = this.a;
                var1_2 = this.b;
                var2_24 = var2_24.b();
                var1_2 = (gib)((imc)var1_2).a;
                var2_24 = (gto)var2_24;
                if (var2_24.g()) {
                    return new gia((bh)var2_24.c());
                }
                fxf.K(var1_2);
                return var1_2;
            }
            case 18: {
                var1_3 = (gib)this.b.b();
                return new fvd(((ghq)this.a).a());
            }
            case 17: {
                var2_25 /* !! */  = ((ilt)this.a).a();
                var1_4 = ((frx)this.b).a();
                var3_39 = ghl.j;
                var2_25 /* !! */  = dww.a(var2_25 /* !! */ );
                jse.b(var2_25 /* !! */ );
                jse.e(var2_25 /* !! */ , "currentProcess");
                var3_39 = String.valueOf(new jtv("[^A-Za-z0-9\\-_:]").a((CharSequence)var2_25 /* !! */ , "_"));
                var4_46 = var1_4.c;
                var5_50 = var1_4.a;
                var2_25 /* !! */  = ghl.j;
                var4_46 = ((ilt)var4_46).a();
                var5_50 = (ScheduledExecutorService)var5_50.b();
                fxf.K(var5_50);
                var1_4 = (bzq)var1_4.b.b();
                fxf.K(var1_4);
                var3_39 = new frn("StartupAfterPackageReplacedImplDatabase_".concat((String)var3_39), 3);
                fxf.K(var2_25 /* !! */ );
                return new bzq((Object)new fsi((Context)var4_46, (ScheduledExecutorService)var5_50, (bzq)var1_4, (hnx)var3_39, (gpm)var2_25 /* !! */ ), null);
            }
            case 16: {
                var1_5 = ((duw)this.a).a();
                return new ggm(((ggi)this.b).a(), var1_5);
            }
            case 15: {
                var3_40 = (Map)((imc)this.a).a;
                var1_6 = (AmbientModeSupport$AmbientController)this.b.b();
                jse.e(var3_40, "map");
                jse.e(var1_6, "subpackager");
                var2_26 = hav.i(var3_40.size());
                var4_47 = var3_40.keySet().iterator();
                while (true) {
                    if (!var4_47.hasNext()) {
                        var1_6 = var2_26.g();
                        jse.d(var1_6, "build(...)");
                        idi.m(var1_6);
                        return var1_6;
                    }
                    var3_40 = (String)var4_47.next();
                    var2_26.j(var3_40);
                    var2_26.j(var1_6.h((String)var3_40));
                }
            }
            case 14: {
                var3_41 = ((ime)this.a).a();
                var2_27 = ((ime)this.b).a();
                jse.e(var3_41, "allPackages");
                jse.e(var2_27, "baseToSubpackage");
                var1_7 = new gzy();
                var3_41 = var3_41.keySet().iterator();
                while (var3_41.hasNext() != false) {
                    var4_48 = (String)var3_41.next();
                    var5_51 = (String)var2_27.get(var4_48);
                    if (var5_51 != null) {
                        var5_51 = a.ao(var5_51, var4_48, "#");
                        var1_7.d(var4_48, var5_51);
                        var1_7.d(var5_51, var5_51);
                        continue;
                    }
                    var1_7.d(var4_48, var4_48);
                }
                return var1_7.b();
            }
            case 13: {
                var3_42 = ((ime)this.a).a();
                var2_28 = ((ime)this.b).a();
                jse.e(var3_42, "allMap");
                jse.e(var2_28, "baseToSubpackage");
                var1_8 = hac.h(var3_42.size());
                var4_49 = var3_42.entrySet().iterator();
                while (var4_49.hasNext() != false) {
                    var5_52 = var4_49.next();
                    var3_42 = (String)var5_52.getKey();
                    var6_53 = (geo)var5_52.getValue();
                    var5_52 = (String)var2_28.get(var3_42);
                    if (var5_52 != null) {
                        var1_8.d(a.ao((String)var5_52, (String)var3_42, "#"), (Object)var6_53);
                        continue;
                    }
                    var1_8.d(var3_42, (Object)var6_53);
                }
                return var1_8.b();
            }
            case 12: {
                return new goi((be)((imc)this.a).a, (Executor)this.b.b());
            }
            case 11: {
                var2_29 = ((gdi)this.a).a();
                var1_9 = (hpr)this.b.b();
                jse.e(var1_9, "uiThreadExecutor");
                var1_9 = var2_29.b((ScheduledExecutorService)var1_9);
                idi.m(var1_9);
                return var1_9;
            }
            case 10: {
                var1_10 = ((gdi)this.b).a();
                var2_30 = (hpr)this.a.b();
                jse.e(var2_30, "lightweightExecutor");
                var1_10 = var1_10.b(var2_30);
                idi.m(var1_10);
                return var1_10;
            }
            case 9: {
                var1_11 = ((gdi)this.b).a();
                var2_31 = (hpr)this.a.b();
                jse.e(var2_31, "blockingExecutor");
                var1_11 = var1_11.b(var2_31);
                idi.m(var1_11);
                return var1_11;
            }
            case 8: {
                var1_12 = ((gdi)this.b).a();
                var2_32 = (hpr)this.a.b();
                jse.e(var2_32, "backgroundExecutor");
                var1_12 = var1_12.b(var2_32);
                idi.m(var1_12);
                return var1_12;
            }
            case 7: {
                var2_33 = this.b;
                var1_13 = ((ilt)this.a).a();
                var2_33 = ((gde)var2_33).a();
                try {
                    var1_13 = var2_33.getPackageInfo(var1_13.getPackageName(), 0);
                }
                catch (PackageManager.NameNotFoundException var1_14) {
                    throw new IllegalStateException("Can't find our own package", var1_14);
                }
                idi.m(var1_13);
                return var1_13;
            }
            case 6: {
                var2_34 = ((ilt)this.a).a();
                var1_15 = (gto)((imc)this.b).a;
                if (var1_15.g()) {
                    ((gco)var1_15.c()).a();
                }
                try {
                    return bbx.d(var2_34);
                }
                catch (IllegalStateException var1_16) {
                    throw new IllegalStateException("WorkManager instantiation failed. If you are in a test, add a dependency on\n\"//java/com/google/apps/tiktok/contrib/work/testing\",", var1_16);
                }
            }
            case 5: {
                var1_17 = (bbx)this.b.b();
                var1_17 = ((ilt)this.a).a();
                try {
                    var2_35 = bdn.i((Context)var1_17);
                    if (var2_35.i == null) {
                        var1_17 = bdn.a;
                        synchronized (var1_17) {
                        }
                    }
                    ** GOTO lbl166
                }
                catch (IllegalStateException var1_18) {
                    throw new IllegalStateException("RemoteWorkManager instantiation failed. You might be missing a dependency on\n\"//third_party/java/androidx/work:multiprocess\",", var1_18);
                }
                {
                    var3_43 = var2_35.i;
                    if (var3_43 == null) {
                        try {
                            var2_35.i = (bje)Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(new Class[]{Context.class, bdn.class}).newInstance(new Object[]{var2_35.b, var2_35});
                        }
                        catch (Throwable var3_44) {
                            bbi.a();
                        }
                        if (var2_35.i == null && !TextUtils.isEmpty((CharSequence)var2_35.c.i)) {
                            var2_35 = new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                            throw var2_35;
                        }
                    }
                }
lbl166:
                // 5 sources

                if ((var1_17 = var2_35.i) != null) {
                    return var1_17;
                }
                var1_17 = new IllegalStateException("Unable to initialize RemoteWorkManager");
                throw var1_17;
            }
            case 4: {
                var1_19 = (bje)this.a.b();
                var2_36 = (bbx)this.b.b();
                return new gcq(var1_19, 1);
            }
            case 3: {
                var2_37 = (be)((imc)this.a).a;
                var1_20 = (gto)((imc)this.b).a;
                Objects.requireNonNull(var2_37);
                return new gbx(new dan(var2_37, 6), var2_37, var2_37.getLifecycle(), true ^ (Boolean)var1_20.e(false));
            }
            case 2: {
                var1_21 = this.b;
                return new hth(((fzv)this.a).a(), ((gac)var1_21).a());
            }
            case 1: {
                var1_22 = (Executor)this.b.b();
                return new hth(this.a, var1_22);
            }
            case 0: 
        }
        var1_23 = this.b;
        var3_45 = this.a;
        var2_38 = dot.a();
        return ((gkg)var3_45).a().s(var2_38, (bmu)var1_23.b());
    }
}

