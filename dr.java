/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class dr
implements Executor {
    final Queue a;
    final Executor b;
    Runnable c;
    private final Object d = new Object();

    public dr(Executor executor) {
        this.a = new ArrayDeque();
        this.b = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.d;
        synchronized (object) {
            Runnable runnable;
            this.c = runnable = (Runnable)this.a.poll();
            if (runnable != null) {
                this.b.execute(runnable);
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
    public final void execute(Runnable runnable) {
        Object object = this.d;
        synchronized (object) {
            Queue queue = this.a;
            aj aj2 = new aj((Object)this, (Object)runnable, 7, null);
            queue.add(aj2);
            if (this.c == null) {
                this.a();
            }
            return;
        }
    }
}

