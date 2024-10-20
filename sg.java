/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 */
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class sg {
    protected static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        AnnotatedElement annotatedElement;
        g = new Handler(Looper.getMainLooper());
        Object var1 = null;
        try {
            annotatedElement = Class.forName("android.app.ActivityThread");
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        a = annotatedElement;
        try {
            annotatedElement = Activity.class.getDeclaredField("mMainThread");
            ((Field)annotatedElement).setAccessible(true);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        b = annotatedElement;
        try {
            annotatedElement = Activity.class.getDeclaredField("mToken");
            ((Field)annotatedElement).setAccessible(true);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        c = annotatedElement;
        annotatedElement = a;
        if (annotatedElement != null) {
            try {
                annotatedElement = ((Class)annotatedElement).getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                ((Method)annotatedElement).setAccessible(true);
            }
            catch (Throwable throwable) {}
        }
        annotatedElement = null;
        d = annotatedElement;
        annotatedElement = a;
        if (annotatedElement != null) {
            try {
                annotatedElement = ((Class)annotatedElement).getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                ((Method)annotatedElement).setAccessible(true);
            }
            catch (Throwable throwable) {}
        }
        annotatedElement = null;
        e = annotatedElement;
        annotatedElement = var1;
        if (sg.a()) {
            Class clazz = a;
            if (clazz == null) {
                annotatedElement = var1;
            } else {
                try {
                    annotatedElement = Integer.TYPE;
                    Class<Boolean> clazz2 = Boolean.TYPE;
                    annotatedElement = clazz.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, annotatedElement, clazz2, Configuration.class, Configuration.class, clazz2, clazz2});
                    ((Method)annotatedElement).setAccessible(true);
                }
                catch (Throwable throwable) {
                    annotatedElement = var1;
                }
            }
        }
        f = annotatedElement;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
        {
        }
    }
}

