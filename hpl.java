/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class hpl
extends AtomicReference
implements Runnable {
    private static final Runnable a = new gni(5);
    private static final Runnable b = new gni(5);

    private final void c(Thread thread) {
        Runnable runnable = (Runnable)this.get();
        hpk hpk2 = null;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            block9: {
                block7: {
                    block8: {
                        if (!(runnable instanceof hpk)) {
                            if (runnable != b) {
                                if (n2 != 0) {
                                    thread.interrupt();
                                }
                                return;
                            }
                        } else {
                            hpk2 = (hpk)runnable;
                        }
                        if ((n4 = n3 + 1) <= 1000) break block7;
                        Runnable runnable2 = b;
                        if (runnable == runnable2) break block8;
                        n3 = n2;
                        if (!this.compareAndSet(runnable, runnable2)) break block9;
                    }
                    n2 = !Thread.interrupted() && n2 == 0 ? 0 : 1;
                    LockSupport.park(hpk2);
                    n3 = n2;
                    break block9;
                }
                Thread.yield();
                n3 = n2;
            }
            runnable = (Runnable)this.get();
            n2 = n3;
            n3 = n4;
        }
    }

    public abstract Object a();

    public abstract String b();

    public abstract void d(Throwable var1);

    public abstract void e(Object var1);

    public abstract boolean g();

    final void h() {
        Runnable runnable = (Runnable)this.get();
        if (runnable instanceof Thread) {
            Runnable runnable2 = new hpk(this);
            ((hpk)runnable2).a(Thread.currentThread());
            if (this.compareAndSet(runnable, runnable2)) {
                try {
                    runnable2 = (Thread)runnable;
                    ((Thread)runnable2).interrupt();
                }
                catch (Throwable throwable) {
                    if (this.getAndSet(a) == b) {
                        LockSupport.unpark((Thread)runnable);
                    }
                    throw throwable;
                }
                if (this.getAndSet(a) == b) {
                    LockSupport.unpark((Thread)runnable2);
                    return;
                }
            }
        }
    }

    @Override
    public final void run() {
        Thread thread = Thread.currentThread();
        Object object = null;
        if (this.compareAndSet(null, thread)) {
            boolean bl2 = this.g();
            if (!bl2) {
                try {
                    object = this.a();
                }
                catch (Throwable throwable) {
                    try {
                        hhk.D(throwable);
                    }
                    catch (Throwable throwable2) {
                        if (!this.compareAndSet(thread, a)) {
                            this.c(thread);
                        }
                        this.e(null);
                        throw throwable2;
                    }
                    if (!this.compareAndSet(thread, a)) {
                        this.c(thread);
                    }
                    this.d(throwable);
                    return;
                }
            }
            if (!this.compareAndSet(thread, a)) {
                this.c(thread);
            }
            if (!bl2) {
                this.e(object);
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder;
        Object object = (Runnable)this.get();
        if (object == a) {
            object = "running=[DONE]";
        } else if (object instanceof hpk) {
            object = "running=[INTERRUPTED]";
        } else if (object instanceof Thread) {
            object = ((Thread)object).getName();
            stringBuilder = new StringBuilder("running=[RUNNING ON ");
            stringBuilder.append((String)object);
            stringBuilder.append("]");
            object = stringBuilder.toString();
        } else {
            object = "running=[NOT STARTED YET]";
        }
        String string = this.b();
        stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(", ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

