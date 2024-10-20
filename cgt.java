/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class cgt {
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        return cgt.b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        if (c == null) {
            c = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        return c;
    }

    public static boolean c(Context context) {
        if (d == null) {
            d = context.getPackageManager().hasSystemFeature("cn.google");
        }
        return d != false && Build.VERSION.SDK_INT >= 30;
    }
}

