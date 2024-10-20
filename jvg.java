/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class jvg
extends jvy
implements Runnable {
    private static volatile Thread _thread;
    public static final jvg a;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Object object = new jvg();
        a = object;
        jvt.t((jvt)object);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            object = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (SecurityException securityException) {
            object = 1000L;
        }
        g = timeUnit.toNanos((Long)object);
    }

    private jvg() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean A() {
        synchronized (this) {
            boolean bl2 = jvg.B();
            if (bl2) {
                return false;
            }
            debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }

    private static final boolean B() {
        int n2 = debugStatus;
        return n2 == 2 || n2 == 3;
        {
        }
    }

    private static final void C() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Thread y() {
        synchronized (this) {
            Thread thread = _thread;
            if (thread == null) {
                _thread = thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                thread.setContextClassLoader(a.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
                return thread;
            }
            return thread;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void z() {
        synchronized (this) {
            boolean bl2 = jvg.B();
            if (!bl2) {
                return;
            }
            debugStatus = 3;
            this.e.c(null);
            this.f.c(null);
            this.notifyAll();
            return;
        }
    }

    @Override
    protected final Thread e() {
        Thread thread;
        Thread thread2 = thread = _thread;
        if (thread == null) {
            thread2 = this.y();
        }
        return thread2;
    }

    @Override
    public final jvq g(long l2, Runnable runnable, jqf jqf2) {
        return this.u(l2, runnable);
    }

    @Override
    public final void h(Runnable runnable) {
        if (debugStatus == 4) {
            jvg.C();
        }
        super.h(runnable);
    }

    @Override
    protected final void i(long l2, jvw jvw2) {
        jvg.C();
    }

    @Override
    public final void j() {
        debugStatus = 4;
        super.j();
    }

    @Override
    public final void run() {
        block10: {
            long l2;
            ThreadLocal threadLocal = jxc.a;
            jxc.a.set(this);
            try {
                if (!this.A()) break block10;
                l2 = Long.MAX_VALUE;
            }
            catch (Throwable throwable) {
                _thread = null;
                this.z();
                if (!this.x()) {
                    this.e();
                }
                throw throwable;
            }
            while (true) {
                long l3;
                long l4;
                block13: {
                    block11: {
                        block12: {
                            Thread.interrupted();
                            l4 = ((jvt)this).k();
                            if (l4 != Long.MAX_VALUE) break block11;
                            l4 = System.nanoTime();
                            l3 = l2;
                            if (l2 != Long.MAX_VALUE) break block12;
                            l3 = g + l4;
                        }
                        if ((l2 = l3 - l4) <= 0L) break;
                        l4 = jse.n(Long.MAX_VALUE, l2);
                        break block13;
                    }
                    l3 = Long.MAX_VALUE;
                }
                l2 = l3;
                if (l4 <= 0L) continue;
                if (jvg.B()) break;
                LockSupport.parkNanos(this, l4);
                l2 = l3;
                continue;
                break;
            }
        }
        _thread = null;
        this.z();
        if (!this.x()) {
            this.e();
        }
        return;
    }

    @Override
    public final String toString() {
        return "DefaultExecutor";
    }
}

