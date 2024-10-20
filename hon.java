/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class hon
extends hnl {
    private int a = 0;
    private boolean b = false;
    private final jrw c = new jrw();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a() {
        jrw jrw2 = this.c;
        synchronized (jrw2) {
            int n2;
            this.a = n2 = this.a - 1;
            if (n2 == 0) {
                this.c.notifyAll();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        jrw jrw2 = this.c;
        l2 = timeUnit.toNanos(l2);
        synchronized (jrw2) {
            while (!this.b || this.a != 0) {
                if (l2 <= 0L) {
                    return false;
                }
                long l3 = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.c, l2);
                l2 -= System.nanoTime() - l3;
            }
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void execute(Runnable object) {
        jrw jrw2 = this.c;
        synchronized (jrw2) {
            if (this.b) {
                object = new RejectedExecutionException("Executor already shutdown");
                throw object;
            }
            ++this.a;
        }
        try {
            object.run();
            return;
        }
        finally {
            this.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isShutdown() {
        jrw jrw2 = this.c;
        synchronized (jrw2) {
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isTerminated() {
        jrw jrw2 = this.c;
        synchronized (jrw2) {
            boolean bl2;
            boolean bl3 = this.b;
            boolean bl4 = bl2 = false;
            if (!bl3) return bl4;
            bl4 = bl2;
            if (this.a != 0) return bl4;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void shutdown() {
        jrw jrw2 = this.c;
        synchronized (jrw2) {
            this.b = true;
            if (this.a == 0) {
                this.c.notifyAll();
            }
            return;
        }
    }

    public final List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
}

