/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class knc {
    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static PackageInfo a(String string) {
        PackageManager packageManager = jjj.c.getPackageManager();
        try {
            string = packageManager.getPackageInfo(string, 0);
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }
}

