/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;

public final class yx {
    private static final ThreadLocal j = new ThreadLocal();
    public final pa a = new pa();
    public final ArrayList b = new ArrayList();
    public final Runnable c;
    public long d = 0L;
    public boolean e = false;
    public float f = 1.0f;
    public yv g;
    public final AmbientMode$AmbientController h = new AmbientMode$AmbientController(this);
    public final bxt i;

    public yx(bxt bxt2) {
        this.c = new kd(this, 14, null);
        this.i = bxt2;
    }

    public static yx a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new yx(new bxt()));
        }
        return (yx)threadLocal.get();
    }

    public final boolean b() {
        Object object = this.i.a;
        return Thread.currentThread() == ((Looper)object).getThread();
    }
}

