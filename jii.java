/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jii
implements Executor {
    private static final Logger a = Logger.getLogger(jii.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        Runnable runnable;
        while ((runnable = (Runnable)this.c.poll()) != null) {
            try {
                runnable.run();
            }
            catch (Throwable throwable) {
                a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), throwable);
            }
        }
    }

    @Override
    public final void execute(Runnable object) {
        a.s(object, "'task' must not be null.");
        if (!this.b) {
            this.b = true;
            try {
                object.run();
                if (this.c != null) {
                    this.a();
                }
                this.b = false;
                return;
            }
            catch (Throwable throwable) {
                try {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String string = String.valueOf(object);
                    object = new StringBuilder("Exception while executing runnable ");
                    ((StringBuilder)object).append(string);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", ((StringBuilder)object).toString(), throwable);
                    if (this.c != null) {
                        this.a();
                    }
                    this.b = false;
                    return;
                }
                catch (Throwable throwable2) {
                    if (this.c != null) {
                        this.a();
                    }
                    this.b = false;
                    throw throwable2;
                }
            }
        }
        if (this.c == null) {
            this.c = new ArrayDeque(4);
        }
        this.c.add(object);
    }
}

