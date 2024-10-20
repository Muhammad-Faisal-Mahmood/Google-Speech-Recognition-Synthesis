/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public abstract class ds {
    static final dr a = new dr(new ny(1));
    public static final int b = -100;
    public static tw c = null;
    public static tw d = null;
    public static boolean e;
    public static final ov f;
    public static final Object g;
    public static final Object h;
    private static Boolean i;

    static {
        i = null;
        e = false;
        f = new ov();
        g = new Object();
        h = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(ds ds2) {
        Object object = g;
        synchronized (object) {
            Object object2 = f;
            ou ou2 = new ou((ov)object2);
            while (ou2.hasNext()) {
                object2 = (ds)((WeakReference)ou2.next()).get();
                if (object2 != ds2 && object2 != null) continue;
                ou2.remove();
            }
            return;
        }
    }

    static boolean n(Context context) {
        if (i == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, ek.class);
                context = packageManager.getServiceInfo(componentName, 640);
                if (context.metaData != null) {
                    i = context.metaData.getBoolean("autoStoreLocales");
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                i = false;
            }
        }
        return i;
    }

    public Context a() {
        throw null;
    }

    public abstract de b();

    public abstract View c(int var1);

    public abstract void d(View var1, ViewGroup.LayoutParams var2);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int var1);

    public abstract void k(View var1);

    public abstract void l(View var1, ViewGroup.LayoutParams var2);

    public abstract void m(CharSequence var1);

    public abstract void o();

    public abstract void p(int var1);
}

