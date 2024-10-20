/*
 * Decompiled with CFR 0.152.
 */
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class kmm {
    public static final kmm j = new kml();
    private boolean a;
    private long b;
    private long c;
    private volatile Object d;

    public void g() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0L) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public boolean h() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(Condition object) {
        jse.e(object, "condition");
        try {
            boolean bl2 = this.h();
            long l2 = this.o();
            if (!bl2 && l2 == 0L) {
                object.await();
                return;
            }
            if (bl2 && l2 != 0L) {
                l2 = Math.min(l2, this.j() - System.nanoTime());
            } else if (bl2) {
                long l3 = this.j();
                l2 = System.nanoTime();
                l2 = l3 - l2;
            }
            if (l2 > 0L) {
                if (object.awaitNanos(l2) > 0L) {
                    return;
                }
                object = new InterruptedIOException("timeout");
                throw object;
            }
            object = new InterruptedIOException("timeout");
            throw object;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long j() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public kmm k() {
        this.a = false;
        return this;
    }

    public kmm l() {
        this.c = 0L;
        return this;
    }

    public kmm m(long l2) {
        this.a = true;
        this.b = l2;
        return this;
    }

    public kmm n(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        if (l2 >= 0L) {
            this.c = timeUnit.toNanos(l2);
            return this;
        }
        throw new IllegalArgumentException(a.ap(l2, "timeout < 0: "));
    }

    public long o() {
        return this.c;
    }
}

