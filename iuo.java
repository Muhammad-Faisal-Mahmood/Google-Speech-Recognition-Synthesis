/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.logging.Level;

final class iuo
implements Runnable {
    final ium a;
    public final ius b;
    private final Executor c;

    public iuo(Executor executor, ium ium2, ius ius2) {
        this.c = executor;
        this.a = ium2;
        this.b = ius2;
    }

    final void a() {
        try {
            this.c.execute(this);
            return;
        }
        catch (Throwable throwable) {
            ius.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", throwable);
            return;
        }
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

