/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;

public final class cqs {
    public static final cqq a = new cqq();
    public static final Thread b;
    public static cqp c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        jse.d(thread, "getThread(...)");
        b = thread;
    }
}

