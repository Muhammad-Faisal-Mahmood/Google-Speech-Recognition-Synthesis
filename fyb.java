/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.animation.TimeInterpolator;
import android.os.Handler;
import android.os.Looper;

public final class fyb {
    public static final int a = 0;

    static {
        TimeInterpolator timeInterpolator = ftf.a;
        new Handler(Looper.getMainLooper(), (Handler.Callback)new fxy());
    }
}

