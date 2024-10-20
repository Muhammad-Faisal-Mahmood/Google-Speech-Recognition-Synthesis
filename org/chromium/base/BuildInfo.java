/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.pm.FeatureInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Log
 */
package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

public class BuildInfo {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;

    public BuildInfo() {
        Object object;
        Object object2;
        String string;
        this.e = 1L;
        Context context = jjj.c;
        Object object3 = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Object object4 = kmt.a.get();
        String string2 = null;
        Object object5 = null;
        if (object4 != null) {
            object4 = kmt.a();
            string2 = ((kmt)object4).b();
            string = ((kmt)object4).b();
            object2 = ((kmt)object4).b();
            object = ((kmt)object4).b();
            if (((kmt)object4).c()) {
                object5 = Long.parseLong(((kmt)object4).b());
            }
            object4 = object5;
            object5 = string;
        } else {
            string = null;
            object4 = null;
            object5 = object4;
            object = object5;
            object2 = object5;
            object5 = object4;
            object4 = string;
        }
        int n2 = 0;
        if (string2 != null && object5 != null && object4 != null && object2 != null && object != null) {
            this.a = string2;
            this.b = object5;
            this.c = (Long)object4;
            this.f = object;
            this.d = object2;
            context.getApplicationInfo();
        } else {
            if (jjj.af() && ((String[])(object5 = packageManager.getPackagesForUid(Process.myUid() - 10000))).length > 0) {
                object5 = object5[0];
                object4 = a.ao((String)object5, (String)object3, ":");
            } else {
                object5 = object3;
                object4 = object5;
            }
            object2 = knc.a((String)object5);
            this.a = object4;
            this.b = BuildInfo.b(packageManager.getApplicationLabel(((PackageInfo)object2).applicationInfo));
            this.c = BuildInfo.a((PackageInfo)object2);
            this.d = object3;
            this.f = BuildInfo.b(((PackageInfo)object2).versionName);
            context.getApplicationInfo();
            object3 = object5;
        }
        this.g = BuildInfo.b(packageManager.getInstallerPackageName((String)object3));
        object5 = knc.a("com.google.android.gms");
        object5 = object5 != null ? String.valueOf(BuildInfo.a(object5)) : "gms versionCode not available.";
        this.h = object5;
        object5 = knc.a("projekt.substratum");
        boolean bl2 = true;
        boolean bl3 = object5 != null;
        this.k = String.valueOf(bl3);
        this.l = "Not Enabled";
        this.i = TextUtils.join((CharSequence)", ", (Object[])Build.SUPPORTED_ABIS);
        this.j = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
        object5 = (UiModeManager)context.getSystemService("uimode");
        bl3 = object5 != null && object5.getCurrentModeType() == 4;
        this.m = bl3;
        try {
            bl3 = packageManager.hasSystemFeature("android.hardware.type.automotive");
        }
        catch (SecurityException securityException) {
            Log.e((String)"cr_BuildInfo", (String)"Unable to query for Automotive system feature", (Throwable)securityException);
            bl3 = false;
        }
        this.n = bl3;
        bl3 = Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle") ? bl2 : false;
        this.o = bl3;
        int n3 = n2;
        if (Build.VERSION.SDK_INT >= 33) {
            object3 = packageManager.getSystemAvailableFeatures();
            n3 = n2;
            if (object3 != null) {
                int n4 = 0;
                while (true) {
                    n3 = n2;
                    if (n4 >= ((String[])object3).length) break;
                    object5 = object3[n4];
                    if ("android.software.vulkan.deqp.level".equals(object5.name)) {
                        n3 = ag$$ExternalSyntheticApiModelOutline1.m((FeatureInfo)object5);
                        break;
                    }
                    ++n4;
                }
            }
        }
        this.p = n3;
    }

    public static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return fs$$ExternalSyntheticApiModelOutline0.m(packageInfo);
        }
        return packageInfo.versionCode;
    }

    private static String b(CharSequence charSequence) {
        charSequence = charSequence == null ? "" : charSequence.toString();
        return charSequence;
    }

    private static String[] getAll() {
        Object object = kms.a;
        String string = Build.BRAND;
        String string2 = Build.DEVICE;
        String string3 = Build.ID;
        String string4 = Build.MANUFACTURER;
        String string5 = Build.MODEL;
        int n2 = Build.VERSION.SDK_INT;
        String string6 = Build.TYPE;
        String string7 = Build.BOARD;
        String string8 = ((BuildInfo)object).a;
        long l2 = ((BuildInfo)object).c;
        String string9 = ((BuildInfo)object).b;
        String string10 = ((BuildInfo)object).d;
        long l3 = ((BuildInfo)object).e;
        String string11 = ((BuildInfo)object).f;
        String string12 = ((BuildInfo)object).j;
        String string13 = ((BuildInfo)object).h;
        String string14 = ((BuildInfo)object).g;
        String string15 = ((BuildInfo)object).i;
        String string16 = ((BuildInfo)object).k;
        String string17 = ((BuildInfo)object).l;
        int n3 = jjj.c.getApplicationInfo().targetSdkVersion;
        String string18 = !"eng".equals(Build.TYPE) && !"userdebug".equals(Build.TYPE) ? "0" : "1";
        String string19 = true != ((BuildInfo)object).m ? "0" : "1";
        String string20 = Build.VERSION.INCREMENTAL;
        String string21 = Build.HARDWARE;
        String string22 = Build.VERSION.SDK_INT >= 33 ? "1" : "0";
        String string23 = true != ((BuildInfo)object).n ? "0" : "1";
        String string24 = Build.VERSION.SDK_INT >= 34 ? "1" : "0";
        String string25 = jjj.c.getApplicationInfo().targetSdkVersion < 34 ? "0" : "1";
        String string26 = Build.VERSION.CODENAME;
        int n4 = ((BuildInfo)object).p;
        object = true != ((BuildInfo)object).o ? "0" : "1";
        String string27 = Build.VERSION.SDK_INT >= 31 ? ut$$ExternalSyntheticApiModelOutline0.m() : "";
        String string28 = (jjj.c.getApplicationInfo().flags & 2) == 0 ? "0" : "1";
        return new String[]{string, string2, string3, string4, string5, String.valueOf(n2), string6, string7, string8, String.valueOf(l2), string9, string10, "1", string11, string12, string13, string14, string15, string16, string17, String.valueOf(n3), string18, string19, string20, string21, string22, string23, string24, string25, string26, String.valueOf(n4), object, string27, string28};
    }
}

