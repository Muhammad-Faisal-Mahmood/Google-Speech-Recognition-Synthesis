/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.concurrent.ThreadFactory;

public final class cod
implements ThreadFactory {
    public final Object a;
    private final int b;

    public /* synthetic */ cod(int n2) {
        this.b = n2;
        this.a = "ExoPlayer:Loader:ProgressiveMediaPeriod";
    }

    public /* synthetic */ cod(ThreadFactory threadFactory, int n2) {
        this.b = n2;
        this.a = threadFactory;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (((Thread)(runnable = this.a.newThread(runnable))).getContextClassLoader() == null) {
                    ((Thread)runnable).setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
                }
                return runnable;
            }
            return new Thread(runnable, (String)this.a);
        }
        runnable = new cmw(runnable, 5);
        return this.a.newThread(runnable);
    }
}

