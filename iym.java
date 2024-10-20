/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class iym
implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public iym(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    /*
     * Loose catch block
     */
    public final void a() {
        while (a.i(this.c, Thread.currentThread())) {
            while (true) {
                Runnable runnable = (Runnable)this.b.poll();
                if (runnable == null) break;
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    this.a.uncaughtException(Thread.currentThread(), throwable);
                }
            }
            this.c.set(null);
            if (!this.b.isEmpty()) continue;
            break;
            {
                catch (Throwable throwable) {
                    this.c.set(null);
                    throw throwable;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        a.s(runnable, "runnable is null");
        this.b.add(runnable);
    }

    public final void c() {
        AtomicReference atomicReference = this.c;
        boolean bl2 = Thread.currentThread() == atomicReference.get();
        fxf.B(bl2, "Not called from the SynchronizationContext");
    }

    public final ksb d(Runnable runnable, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        iyl iyl2 = new iyl(runnable);
        return new ksb(iyl2, scheduledExecutorService.schedule(new iyk(this, iyl2, runnable, 0), l2, timeUnit));
    }

    @Override
    public final void execute(Runnable runnable) {
        this.b(runnable);
        this.a();
    }
}

