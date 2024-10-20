/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ade {
    private static Handler a;
    public final FutureTask c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile int f = 1;

    public ade() {
        this.c = new add(this, new bdr(this, 1));
    }

    public abstract Object a();

    public void b(Object object) {
        throw null;
    }

    public void c() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Object object) {
        Handler handler;
        synchronized (ade.class) {
            if (a == null) {
                a = handler = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post((Runnable)new aj((Object)this, object, 19, null));
    }

    final void e(Object object) {
        if (!this.e.get()) {
            this.d(object);
        }
    }

    public final boolean f() {
        return this.d.get();
    }
}

