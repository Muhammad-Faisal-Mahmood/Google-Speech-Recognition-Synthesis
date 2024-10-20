/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class dul {
    private static final Object a = new Object();
    public static final int d = 0;
    private static volatile duk e;
    private static volatile boolean f = false;
    private static final AtomicInteger g;
    private static final gfb m;
    final duj b;
    final String c;
    private Object h;
    private volatile int i = -1;
    private volatile Object j;
    private final boolean k;
    private volatile boolean l;

    static {
        new AtomicReference();
        m = new gfb(new dwb(1));
        g = new AtomicInteger();
    }

    public dul(duj duj2, String string) {
        if (duj2.d != null) {
            this.b = duj2;
            this.c = string;
            this.h = "";
            this.k = true;
            this.l = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public dul(duj duj2, String string, Object object, boolean bl2) {
        if (duj2.d != null) {
            this.b = duj2;
            this.c = string;
            this.h = object;
            this.k = bl2;
            this.l = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void e() {
        g.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void f(Context context) {
        if (e != null) return;
        if (context == null) {
            return;
        }
        Object object = a;
        // MONITORENTER : object
        if (e == null) {
            // MONITORENTER : object
            Object object2 = e;
            Object object3 = context.getApplicationContext();
            if (object3 != null) {
                context = object3;
            }
            if (object2 == null || ((duk)object2).a != context) {
                if (object2 != null) {
                    dtp.a();
                    dun.a();
                    dtu.a();
                }
                object3 = new dty(context, 6);
                object2 = fvd.ap((gui)object3);
                object3 = new duk(context, (gui)object2);
                e = object3;
                dul.e();
            }
            // MONITOREXIT : object
        }
        // MONITOREXIT : object
    }

    private final String g(String string) {
        string = string.isEmpty() ? this.c : string.concat(this.c);
        return string;
    }

    public abstract Object a(Object var1);

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b() {
        var3_1 = this.k;
        var4_2 = true;
        if (!var3_1) {
            var3_1 = dul.m.a;
            fxf.B(true, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        if (this.i >= (var2_3 = dul.g.get())) ** GOTO lbl150
        synchronized (this) {
            block51: {
                block50: {
                    if (this.i >= var2_3) ** GOTO lbl150
                    var11_4 = dul.e;
                    var5_5 = gsl.a;
                    var9_10 = null;
                    if (var11_4 == null) ** GOTO lbl-1000
                    var7_11 = (gto)var11_4.b.a();
                    var5_5 = var7_11;
                    if (var7_11.g()) {
                        var6_12 = (dlm)var7_11.c();
                        var8_17 = this.b;
                        var5_5 = var8_17.d;
                        var8_17 = var8_17.a;
                        var10_18 = this.c;
                        var8_17 = var6_12.c((Uri)var5_5, (String)var8_17, (String)var10_18);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var8_17 = null;
                        var7_11 = var5_5;
                    }
                    var3_1 = var11_4 != null;
                    fxf.B(var3_1, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    var10_18 = this.b.d;
                    if (var10_18 == null) {
                        var5_5 = var11_4.a;
                        var1_20 = dun.a;
                        var1_20 = crt.a;
                        throw null;
                    }
                    var6_12 = var11_4.a;
                    var5_5 = dtw.b;
                    var5_5 = ((Uri)var10_18).getAuthority();
                    if ("com.google.android.gms.phenotype".equals(var5_5)) break block50;
                    Log.e((String)"PhenotypeClientHelper", (String)String.valueOf(var5_5).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
                    while (true) {
                        var5_5 = null;
                        ** GOTO lbl72
                        break;
                    }
                }
                if (!dtw.a.g()) break block51;
                var3_1 = (Boolean)dtw.a.c();
                ** GOTO lbl70
            }
            var5_5 = dtw.b;
            synchronized (var5_5) {
                block46: {
                    block53: {
                        block52: {
                            if (!dtw.a.g()) break block52;
                            var3_1 = (Boolean)dtw.a.c();
                            ** GOTO lbl70
                        }
                        if ("com.google.android.gms".equals(var6_12.getPackageName())) break block53;
                        var10_18 = var6_12.getPackageManager();
                        var1_19 = Build.VERSION.SDK_INT < 29 ? 0 : 0x10000000;
                        if ((var10_18 = var10_18.resolveContentProvider("com.google.android.gms.phenotype", var1_19)) == null || !"com.google.android.gms".equals(var10_18.packageName)) break block46;
                    }
                    var6_12 = var6_12.getPackageManager();
                    try {
                        var6_12 = var6_12.getApplicationInfo("com.google.android.gms", 0);
                        if ((var6_12.flags & 129) == 0) break block46;
                        var3_1 = var4_2;
                        ** GOTO lbl67
                    }
                    catch (PackageManager.NameNotFoundException var6_16) {
                        ** continue;
                    }
                }
lbl65:
                // 2 sources

                while (true) {
                    block48: {
                        var3_1 = false;
lbl67:
                        // 2 sources

                        dtw.a = gto.i(var3_1);
                        // MONITOREXIT @DISABLED, blocks:[17, 18, 30] lbl64 : MonitorExitStatement: MONITOREXIT : var5_5
                        var3_1 = (Boolean)dtw.a.c();
lbl70:
                        // 3 sources

                        if (!var3_1) ** continue;
                        var5_5 = this.b.c != false ? dtp.b(var11_4.a.getContentResolver(), dtx.a(dtx.c(var11_4.a, ((Uri)this.b.d).getLastPathSegment()))) : dtp.b(var11_4.a.getContentResolver(), (Uri)this.b.d);
lbl72:
                        // 2 sources

                        if (var5_5 == null) ** GOTO lbl-1000
                        var12_21 = this.d();
                        var6_12 = var10_18 = var5_5.e;
                        if (var10_18 != null) break block48;
                        var13_22 = var5_5.d;
                        synchronized (var13_22) {
                            block47: {
                                var6_12 = var10_18 = var5_5.e;
                                if (var10_18 != null) break block48;
                                var10_18 = StrictMode.allowThreadDiskReads();
                                try {
                                    var6_12 = new dtn((dtp)var5_5);
                                    var6_12 = (Map)dpf.e((dtr)var6_12);
                                }
                                catch (Throwable var5_6) {
                                    break block47;
                                }
                                catch (IllegalStateException var6_13) {
                                    ** GOTO lbl-1000
                                }
                                catch (SQLiteException var6_14) {
                                    ** GOTO lbl-1000
                                }
                                catch (SecurityException var6_15) {
                                    // empty catch block
                                    ** GOTO lbl-1000
                                }
lbl94:
                                // 2 sources

                                while (true) {
                                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var10_18);
                                    var5_5.e = var6_12;
                                    break block48;
                                    break;
                                }
lbl-1000:
                                // 3 sources

                                {
                                    Log.w((String)"ConfigurationContentLdr", (String)"Unable to query ContentProvider, using default values", (Throwable)var6_12);
                                    var6_12 = Collections.emptyMap();
                                    ** continue;
                                }
                            }
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var10_18);
                            throw var5_6;
                        }
                    }
                    var5_5 = var6_12;
                    if (var6_12 == null) {
                        var5_5 = Collections.emptyMap();
                    }
                    if ((var5_5 = (String)var5_5.get(var12_21)) != null) {
                        var6_12 = this.a(var5_5);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_12 = null;
                    }
                    var5_5 = var6_12;
                    if (var6_12 == null) {
                        var5_5 = var9_10;
                        if (!this.b.b) {
                            block49: {
                                var6_12 = var11_4.a;
                                synchronized (dtu.class) {
                                    if (dtu.a == null) {
                                        var5_5 = kl.t((Context)var6_12, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new dtu((Context)var6_12) : new dtu();
                                        dtu.a = var5_5;
                                    }
                                    var5_5 = dtu.a;
                                }
                                var6_12 = this.b;
                                var6_12 = var6_12.b != false ? null : this.g((String)var6_12.e);
                                var10_18 = var5_5.c;
                                if (var10_18 != null && !(var3_1 = crt.d((Context)var10_18))) {
                                    try {
                                        var10_18 = new dts((dtu)var5_5, (String)var6_12);
                                        var6_12 = var5_5 = (String)dpf.e((dtr)var10_18);
                                        break block49;
                                    }
                                    catch (NullPointerException var5_7) {
                                    }
                                    catch (SecurityException var5_8) {
                                    }
                                    catch (IllegalStateException var5_9) {
                                        // empty catch block
                                    }
                                    Log.e((String)"GservicesLoader", (String)"Unable to read GServices for: ".concat(String.valueOf(var6_12)), (Throwable)var5_5);
                                }
                                var6_12 = null;
                            }
                            var5_5 = var9_10;
                            if (var6_12 != null) {
                                var5_5 = this.a(var6_12);
                            }
                        }
                        if (var5_5 == null) {
                            var5_5 = this.c();
                        }
                    }
                    if (var7_11.g()) {
                        var5_5 = var8_17 == null ? this.c() : this.a(var8_17);
                    }
                    this.j = var5_5;
                    this.i = var2_3;
lbl150:
                    // 3 sources

                    return this.j;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c() {
        if (!this.l) return this.h;
        synchronized (this) {
            if (!this.l) return this.h;
            Object object = this.a(this.h);
            fxf.K(object);
            this.h = object;
            this.l = false;
            return this.h;
        }
    }

    public final String d() {
        return this.g(this.b.a);
    }
}

