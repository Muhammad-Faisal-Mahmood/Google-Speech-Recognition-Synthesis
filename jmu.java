/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jmu
extends ConcurrentLinkedQueue
implements Executor {
    public static final Object a;
    private static final Logger c;
    public volatile Object b;

    static {
        c = Logger.getLogger(jmu.class.getName());
        a = new Object();
    }

    public static void a(Runnable runnable) {
        try {
            runnable.run();
            return;
        }
        catch (Throwable throwable) {
            c.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "runQuietly", "Runnable threw exception", throwable);
            return;
        }
    }

    public static void b() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    @Override
    public final void execute(Runnable runnable) {
        this.add(runnable);
        Object object = this.b;
        if (object != a) {
            LockSupport.unpark((Thread)object);
            return;
        }
        if (this.remove(runnable) && jmw.a) {
            throw new RejectedExecutionException();
        }
    }
}

