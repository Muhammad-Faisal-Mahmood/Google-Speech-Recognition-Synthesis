/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jim
implements Executor,
Runnable {
    private static final Logger b;
    private static final jij c;
    public volatile int a = 0;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();

    static {
        jij jij2;
        b = Logger.getLogger(jim.class.getName());
        try {
            jij2 = new jik(AtomicIntegerFieldUpdater.newUpdater(jim.class, "a"));
        }
        catch (Throwable throwable) {
            Level level = Level.SEVERE;
            b.logp(level, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", throwable);
            jij2 = new jil();
        }
        c = jij2;
    }

    public jim(Executor executor) {
        a.s(executor, "'executor' must not be null.");
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
                return;
            }
            catch (Throwable throwable) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw throwable;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        a.s(runnable, "'r' must not be null.");
        this.e.add(runnable);
        this.a(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        try {
            Object object;
            Executor executor = this.d;
            while (executor == this.d && (object = (Runnable)this.e.poll()) != null) {
                try {
                    object.run();
                }
                catch (RuntimeException runtimeException) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    object = object.toString();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Exception while executing runnable ");
                    stringBuilder.append((String)object);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", stringBuilder.toString(), runtimeException);
                }
            }
            if (!this.e.isEmpty()) {
                this.a(null);
            }
            return;
        }
        finally {
            c.b(this);
        }
    }
}

