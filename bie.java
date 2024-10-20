/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public final class bie {
    static {
        bbi.b("PackageManagerHelper");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, Class clazz, boolean bl2) {
        try {
            String string = clazz.getName();
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, string);
            int n2 = packageManager.getComponentEnabledSetting(componentName);
            boolean bl3 = false;
            if (n2 != 0 && n2 == 1) {
                bl3 = true;
            }
            if (bl2 == bl3) {
                bbi.a();
                clazz.getName();
                return;
            }
            componentName = context.getPackageManager();
            string = new ComponentName(context, clazz.getName());
            n2 = true != bl2 ? 2 : 1;
            componentName.setComponentEnabledSetting((ComponentName)string, n2, 1);
            bbi.a();
            clazz.getName();
            return;
        }
        catch (Exception exception) {
            bbi.a();
            clazz.getName();
            return;
        }
    }
}

