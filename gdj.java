/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class gdj
extends jpw
implements CoroutineExceptionHandler,
ScheduledExecutorService {
    public static final int b = 0;
    public final ThreadLocal a;
    private final ScheduledExecutorService d;

    public gdj(ScheduledExecutorService scheduledExecutorService) {
        jse.e(scheduledExecutorService, "delegate");
        super(CoroutineExceptionHandler.c);
        this.d = scheduledExecutorService;
        this.a = new ThreadLocal();
    }

    private final Runnable b(Runnable runnable) {
        runnable = new ffe(runnable, this, 17);
        long l2 = gqk.a;
        if (gqk.o()) {
            return gqk.h(runnable);
        }
        return runnable;
    }

    public final Callable a(Callable callable) {
        callable = new czm(callable, this, 18, null);
        long l2 = gqk.a;
        if (gqk.o()) {
            return gqk.k(callable);
        }
        return callable;
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        return this.d.awaitTermination(l2, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        jse.e(runnable, "command");
        this.d.execute(this.b(runnable));
    }

    @Override
    public final void handleException(jqf jqf2, Throwable throwable) {
        jse.e(jqf2, "context");
        jse.e(throwable, "exception");
        gdk.a.log(Level.SEVERE, "Uncaught exception from runnable", throwable);
        Log.e((String)"TikTokExceptionHandler2", (String)"Uncaught exception from runnable", (Throwable)throwable);
        this.a.set(throwable);
    }

    public final List invokeAll(Collection list) {
        jse.e(list, "tasks");
        list = new gyg(list, new fmi(new eia((Object)this, 4, null), 12));
        list = this.d.invokeAll(list);
        jse.d(list, "invokeAll(...)");
        return list;
    }

    public final List invokeAll(Collection list, long l2, TimeUnit timeUnit) {
        jse.e(list, "tasks");
        jse.e((Object)timeUnit, "unit");
        list = new gyg(list, new fmi(new eia((Object)this, 5, null), 11));
        list = this.d.invokeAll(list, l2, timeUnit);
        jse.d(list, "invokeAll(...)");
        return list;
    }

    public final Object invokeAny(Collection collection) {
        jse.e(collection, "tasks");
        collection = new gyg(collection, new fmi(new eia((Object)this, 6, null), 10));
        return this.d.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        jse.e(collection, "tasks");
        jse.e((Object)timeUnit, "unit");
        return this.d.invokeAny(collection, l2, timeUnit);
    }

    @Override
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable object, long l2, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        object = this.d.schedule(this.b((Runnable)object), l2, timeUnit);
        jse.d(object, "schedule(...)");
        return object;
    }

    public final ScheduledFuture schedule(Callable object, long l2, TimeUnit timeUnit) {
        jse.e(object, "callable");
        jse.e((Object)timeUnit, "unit");
        object = this.d.schedule(this.a((Callable)object), l2, timeUnit);
        jse.d(object, "schedule(...)");
        return object;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        object = this.d.scheduleAtFixedRate(this.b((Runnable)object), l2, l3, timeUnit);
        jse.d(object, "scheduleAtFixedRate(...)");
        return object;
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        jse.e(object, "command");
        jse.e((Object)timeUnit, "unit");
        object = this.d.scheduleWithFixedDelay(this.b((Runnable)object), l2, l3, timeUnit);
        jse.d(object, "scheduleWithFixedDelay(...)");
        return object;
    }

    @Override
    public final void shutdown() {
        this.d.shutdown();
    }

    public final List shutdownNow() {
        List<Runnable> list = this.d.shutdownNow();
        jse.d(list, "shutdownNow(...)");
        return list;
    }

    public final Future submit(Runnable object) {
        jse.e(object, "task");
        object = this.d.submit(this.b((Runnable)object));
        jse.d(object, "submit(...)");
        return object;
    }

    public final Future submit(Runnable object, Object object2) {
        jse.e(object, "task");
        object = this.d.submit(this.b((Runnable)object), object2);
        jse.d(object, "submit(...)");
        return object;
    }

    public final Future submit(Callable object) {
        jse.e(object, "task");
        object = this.d.submit(this.a((Callable)object));
        jse.d(object, "submit(...)");
        return object;
    }
}

