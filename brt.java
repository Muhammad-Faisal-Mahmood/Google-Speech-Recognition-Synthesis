/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

public final class brt {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/buildinfo/BuildInfo");
    private static final brt b = new brt();
    private boolean c;
    private boolean d;

    private brt() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context object) {
        brt brt2 = b;
        synchronized (brt2) {
            fxf.K(object);
            Object object2 = "RELEASE";
            try {
                ApplicationInfo applicationInfo = object.getPackageManager().getApplicationInfo(object.getPackageName(), 128);
                Object var2_5 = null;
                object = var2_5;
                if (applicationInfo != null) {
                    object = applicationInfo.metaData == null ? var2_5 : applicationInfo.metaData.getString("com.google.android.tts.config.BuildType");
                }
                if (object == null) {
                    ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/buildinfo/BuildInfo", "initBuildTypeInternal", 80, "BuildInfo.java")).r("Could not find metadata from application info for build type");
                    object = object2;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                a.as(a.h(), "Could not get metadata from application info for build type", "com/google/android/apps/speech/tts/googletts/buildinfo/BuildInfo", "initBuildTypeInternal", 'V', "BuildInfo.java", nameNotFoundException);
                object = object2;
            }
            object2 = b;
            ((brt)object2).c = "DEV".equals(object);
            ((brt)object2).d = "UNITTEST".equals(object);
            return;
        }
    }

    public static boolean b() {
        return brt.b.c;
    }

    public static boolean c() {
        return brt.b.d;
    }
}

