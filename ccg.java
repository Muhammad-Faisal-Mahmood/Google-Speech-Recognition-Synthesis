/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageInstaller$SessionInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.util.Log
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ccg {
    static boolean a = false;
    @Deprecated
    static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean c = new AtomicBoolean();
    private static boolean d = false;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context) {
        block5: {
            if (!a) {
                Throwable throwable2222222;
                PackageInfo packageInfo = cgx.b(context).b("com.google.android.gms", 64);
                cch.b(context);
                d = packageInfo != null && !cch.d(packageInfo, false) && cch.d(packageInfo, true);
                a = true;
                break block5;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                    {
                        Log.w((String)"GooglePlayServicesUtil", (String)"Cannot find Google Play services package name.", (Throwable)nameNotFoundException);
                        a = true;
                        break block5;
                    }
                }
                a = true;
                throw throwable2222222;
            }
        }
        if (d) return true;
        if ("user".equals(Build.TYPE)) return false;
        return true;
    }

    public static boolean b(Context context) {
        Object object = context.getPackageManager().getPackageInstaller().getAllSessions();
        object = object.iterator();
        while (object.hasNext()) {
            if (!"com.google.android.gms".equals(((PackageInstaller.SessionInfo)object.next()).getAppPackageName())) continue;
            return true;
        }
        context = context.getPackageManager();
        try {
            boolean bl2 = context.getApplicationInfo((String)"com.google.android.gms", (int)8192).enabled;
            return bl2;
        }
        catch (PackageManager.NameNotFoundException | Exception throwable) {
            return false;
        }
    }
}

