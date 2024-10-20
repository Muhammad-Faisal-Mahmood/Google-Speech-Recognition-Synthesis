/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Build$VERSION
 */
import android.os.Binder;
import android.os.Build;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class coh
extends ThreadPoolExecutor {
    public coh(TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(0, Integer.MAX_VALUE, 60L, timeUnit, (BlockingQueue<Runnable>)blockingQueue, threadFactory);
    }

    @Override
    protected final void afterExecute(Runnable runnable, Throwable throwable) {
        super.afterExecute(runnable, throwable);
        if (Build.VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
    }
}

