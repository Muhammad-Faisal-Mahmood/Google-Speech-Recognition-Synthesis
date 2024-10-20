/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

final class jfi
implements Executor {
    private final jgp a;
    private Executor b;

    public jfi(jgp jgp2) {
        this.a = jgp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Executor a() {
        synchronized (this) {
            if (this.b != null) return this.b;
            Object object = this.a.a();
            fxf.L(object, "%s.getObject()", this.b);
            this.b = object;
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void b() {
        synchronized (this) {
            Executor executor = this.b;
            if (executor != null) {
                this.a.b(executor);
                this.b = null;
                return;
            }
            return;
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a().execute(runnable);
    }
}

