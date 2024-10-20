/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Process
 *  android.os.Trace
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class bkd {
    private static bkc a;
    private static final Object b;
    private static Context c;

    static {
        b = new Object();
    }

    private bkd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static bkc a(Context object) {
        bkc bkc2;
        block5: {
            block7: {
                try {
                    Trace.beginSection((String)"car-ui-plugin-load");
                    Object object2 = a;
                    bkc2 = object2;
                    if (object2 != null) break block5;
                    object2 = b;
                    synchronized (object2) {
                        bkc2 = a;
                        if (bkc2 != null) break block6;
                    }
                }
                catch (Throwable throwable) {
                    Trace.endSection();
                    throw throwable;
                }
                {
                    block6: {
                        bkd.b(object.getApplicationContext());
                        object = a;
                        break block7;
                    }
                    object = bkc2;
                }
            }
            bkc2 = object;
        }
        Trace.endSection();
        return bkc2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void b(Context var0) {
        if (bkd.a != null) {
            return;
        }
        var4_5 = var0.getPackageManager();
        if (var4_5.hasSystemFeature("android.hardware.type.automotive") && (var5_7 /* !! */  = var4_5.resolveContentProvider(var0.getString(2132017223), 0x100200)) != null && ((var1_8 = var4_5.getComponentEnabledSetting(new ComponentName(var5_7 /* !! */ .packageName, var5_7 /* !! */ .name))) == 0 ? var5_7 /* !! */ .enabled != false : var1_8 == 1)) {
            block26: {
                if (!var0.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    while (true) {
                        var5_7 /* !! */  = null;
                        break;
                    }
                } else {
                    var4_5 = var0.getString(2132017223);
                    if ((var4_5 = var0.getPackageManager().resolveContentProvider((String)var4_5, 0x100200)) == null) ** continue;
                    var5_7 /* !! */  = var4_5.packageName;
                }
                var8_9 = var0.getPackageManager().getPackageInfo((String)var5_7 /* !! */ , 0);
                var4_5 = var0.getApplicationContext();
                if (var4_5 instanceof bkb && (var4_5 = ((bkb)var4_5).a()) != null && Collection$_EL.stream((Collection)var4_5).anyMatch(new boa(1))) {
                    var4_5 = var0.getPackageName();
                    var0 = new StringBuilder("Package ");
                    var0.append((String)var4_5);
                    var0.append(" denied loading plugin ");
                    var0.append((String)var5_7 /* !! */ );
                    Log.i((String)"carui", (String)var0.toString());
                    bkd.a = new bki();
                    return;
                }
                if (bkd.c == null) {
                    try {
                        bkd.c = var0.createPackageContext((String)var5_7 /* !! */ , 3);
                    }
                    catch (Exception var0_1) {
                        Log.e((String)"carui", (String)"Could not load CarUi plugin", (Throwable)var0_1);
                        bkd.a = new bki();
                        return;
                    }
                }
                try {
                    bkd.class.getClassLoader().loadClass("com.android.car.ui.plugin.PluginVersionProviderImpl");
                    var4_5 = bkd.class.getClassLoader().loadClass("com.android.car.ui.pluginsupport.OemApiUtil");
                    var1_8 = 1;
                }
                catch (ClassNotFoundException var4_6) {
                    var4_5 = null;
                    var1_8 = 0;
                }
                if (var1_8 == 0) {
                    Log.w((String)"carui", (String)"loading using adapter classloader");
                    var11_10 = var0.getApplicationInfo();
                    var10_11 = Objects.requireNonNull(bkd.class.getClassLoader());
                    var9_12 = bkd.c.getClassLoader();
                    var4_5 = new ArrayList<E>(3);
                    if (var11_10.nativeLibraryDir != null) {
                        var4_5.add(var11_10.nativeLibraryDir);
                    }
                    if ((var11_10.flags & 0x10000000) == 0) {
                        var6_13 = new ArrayList<E>();
                        if (Process.is64Bit()) {
                            Collections.addAll(var6_13, Build.SUPPORTED_64_BIT_ABIS);
                        } else {
                            Collections.addAll(var6_13, Build.SUPPORTED_32_BIT_ABIS);
                        }
                        var6_13 = var6_13.iterator();
                        while (var6_13.hasNext()) {
                            var13_16 = (String)var6_13.next();
                            var7_14 = var11_10.sourceDir;
                            var12_15 = new StringBuilder();
                            var12_15.append(var7_14);
                            var12_15.append("!/lib/");
                            var12_15.append(var13_16);
                            var4_5.add(var12_15.toString());
                        }
                    }
                    var4_5 = var4_5.size() == 0 ? null : TextUtils.join((CharSequence)File.pathSeparator, (Iterable)var4_5);
                    var7_14 = var11_10.sourceDir;
                    var6_13 = var7_14;
                    if (var11_10.sharedLibraryFiles != null) {
                        var6_13 = var7_14;
                        if (var11_10.sharedLibraryFiles.length > 0) {
                            var6_13 = File.pathSeparator;
                            var12_15 = TextUtils.join((CharSequence)File.pathSeparator, (Object[])var11_10.sharedLibraryFiles);
                            var11_10 = new StringBuilder();
                            var11_10.append(var7_14);
                            var11_10.append((String)var6_13);
                            var11_10.append((String)var12_15);
                            var6_13 = var11_10.toString();
                        }
                    }
                    var4_5 = new bjz((String)var6_13, (String)var4_5, var10_11, var9_12);
                    try {
                        var4_5 = var4_5.loadClass("com.android.car.ui.pluginsupport.OemApiUtil");
                    }
                    catch (ClassNotFoundException var0_2) {
                        Log.e((String)"carui", (String)"Could not load oemApiUtilClass: ", (Throwable)var0_2);
                        bkd.a = new bki();
                        return;
                    }
                }
                try {
                    var6_13 = var4_5.getDeclaredMethod("getPluginFactory", new Class[]{Context.class, String.class});
                    var6_13.setAccessible(true);
                    var4_5 = var0.getPackageName();
                    bkd.a = var4_5 = (bkc)var6_13.invoke(null, new Object[]{bkd.c, var4_5});
                    if (var4_5 != null) break block26;
                }
                catch (ReflectiveOperationException var0_3) {
                    Log.e((String)"carui", (String)"Could not invoke getPluginFactory: ", (Throwable)var0_3);
                    bkd.a = new bki();
                    return;
                }
                Log.w((String)"carui", (String)"CarUi plugin loaded is null");
                bkd.a = var0 = new bki();
                return;
            }
            var2_17 = fs$$ExternalSyntheticApiModelOutline0.m(var8_9);
            var4_5 = var0.getPackageName();
            var0 = new StringBuilder("Loaded plugin ");
            var0.append((String)var5_7 /* !! */ );
            var0.append(" version ");
            var0.append(var2_17);
            var0.append(" for package ");
            var0.append((String)var4_5);
            Log.i((String)"carui", (String)var0.toString());
            return;
            catch (PackageManager.NameNotFoundException var0_4) {
                Log.e((String)"carui", (String)a.aj((String)var5_7 /* !! */ , "Could not load CarUi plugin, package ", " was not found."));
                bkd.a = new bki();
                return;
            }
        }
        Log.i((String)"carui", (String)"CarUi plugin is disabled");
        bkd.a = new bki();
    }
}

