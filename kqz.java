/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

public final class kqz {
    private static final Object a = new Object();
    private static Context b;
    private static Bundle c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bundle a(Context context) {
        Context context2 = context.getApplicationContext();
        Object object = a;
        synchronized (object) {
            context = b;
            if (context2 == context) return c;
            try {
                PackageManager packageManager = context2.getPackageManager();
                context = new ComponentName(context2, "android.net.http.MetaDataHolder");
                context = packageManager.getServiceInfo((ComponentName)context, 787072);
            }
            catch (PackageManager.NameNotFoundException | NullPointerException throwable) {
                context = null;
            }
            context = context != null && context.metaData != null ? context.metaData : new Bundle();
            c = context;
            b = context2;
            return c;
        }
    }
}

