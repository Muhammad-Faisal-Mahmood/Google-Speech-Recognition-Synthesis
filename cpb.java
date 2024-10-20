/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

final class cpb
implements RunnableScheduledFuture {
    private final RunnableScheduledFuture a;

    public cpb(RunnableScheduledFuture runnableScheduledFuture) {
        this.a = runnableScheduledFuture;
    }

    @Override
    public final boolean cancel(boolean bl2) {
        return this.a.cancel(bl2);
    }

    @Override
    public final Object get() {
        return this.a.get();
    }

    @Override
    public final Object get(long l2, TimeUnit timeUnit) {
        return cpc.a(this.a, l2, timeUnit);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        long l2;
        long l3 = l2 = this.a.getDelay(timeUnit);
        if (TimeUnit.NANOSECONDS.convert(l2, timeUnit) > 2147483647999999999L) {
            l3 = timeUnit.convert(2147483647999999999L, TimeUnit.NANOSECONDS);
        }
        return l3;
    }

    @Override
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }

    @Override
    public final void run() {
        this.a.run();
    }
}

