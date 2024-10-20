/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class fpk {
    private static final Object a = new Object();
    private static Thread b;
    private static volatile Handler c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Handler a() {
        if (c != null) return c;
        Object object = a;
        synchronized (object) {
            Handler handler;
            if (c != null) return c;
            c = handler = new Handler(Looper.getMainLooper());
            return c;
        }
    }

    public static void b() {
        if (!fpk.g()) {
            return;
        }
        throw new fpj("Must be called on a background thread");
    }

    public static void c() {
        if (fpk.g()) {
            return;
        }
        throw new fpj("Must be called on the main thread");
    }

    public static void d(Runnable runnable, long l2) {
        fpk.a().postDelayed(runnable, l2);
    }

    public static void e(Runnable runnable) {
        fpk.a().post(runnable);
    }

    public static void f(Runnable runnable) {
        fpk.a().removeCallbacks(runnable);
    }

    public static boolean g() {
        return fpk.h(Thread.currentThread());
    }

    public static boolean h(Thread thread) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return thread == b;
    }
}

