/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import org.chromium.net.impl.ImplVersion;

public final class ksd {
    private static final Object a = new Object();
    private static int b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(Context object) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.getPackageName());
        stringBuilder.append('/');
        Object object2 = a;
        synchronized (object2) {
            int n3;
            n2 = n3 = b;
            if (n3 == 0) {
                PackageManager packageManager = object.getPackageManager();
                object = object.getPackageName();
                try {
                    b = n2 = packageManager.getPackageInfo((String)object, (int)0).versionCode;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot determine package version");
                    throw illegalStateException;
                }
            }
        }
        stringBuilder.append(n2);
        stringBuilder.append(" (Linux; U; Android ");
        stringBuilder.append(Build.VERSION.RELEASE);
        stringBuilder.append("; ");
        stringBuilder.append(Locale.getDefault().toString());
        object = Build.MODEL;
        if (((String)object).length() > 0) {
            stringBuilder.append("; ");
            stringBuilder.append((String)object);
        }
        if (((String)(object = Build.ID)).length() > 0) {
            stringBuilder.append("; Build/");
            stringBuilder.append((String)object);
        }
        stringBuilder.append(";");
        ksd.b(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static void b(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/");
        stringBuilder.append(ImplVersion.getCronetVersion());
    }
}

