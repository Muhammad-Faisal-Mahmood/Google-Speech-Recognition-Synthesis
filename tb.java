/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.os.Looper
 */
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class tb {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface var1);

    public abstract void b();

    public final void c(int n2) {
        tb.e().post((Runnable)new kd(this, 10, null));
    }

    public final void d(Typeface typeface) {
        tb.e().post((Runnable)new aj(this, (Object)typeface, 15));
    }
}

