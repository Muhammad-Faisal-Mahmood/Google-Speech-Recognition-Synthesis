/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class cvf
implements Executor {
    private final Executor a;
    private final int b;
    private final Object c = new Object();
    private int d = 0;
    private final Queue e = new ArrayDeque();

    public cvf(Executor executor, int n2) {
        this.a = executor;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object;
        Object object2 = this.c;
        synchronized (object2) {
            object = (Runnable)this.e.poll();
            if (object == null) {
                --this.d;
                return;
            }
        }
        try {
            Executor executor = this.a;
            object2 = new cve(this, (Runnable)object);
            executor.execute((Runnable)object2);
            return;
        }
        catch (Throwable throwable) {
            cyr.j(throwable, "%s: Task submission failed: %s", "ThrottlingExecutor", object);
            object = this.c;
            synchronized (object) {
                --this.d;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void execute(Runnable object) {
        fxf.K(object);
        Object object2 = this.c;
        synchronized (object2) {
            int n2 = this.d;
            if (n2 >= this.b) {
                this.e.add(object);
                return;
            }
            this.d = n2 + 1;
        }
        try {
            Executor executor = this.a;
            object2 = new cve(this, (Runnable)object);
            executor.execute((Runnable)object2);
            return;
        }
        catch (Throwable throwable) {
            object = this.c;
            synchronized (object) {
                --this.d;
                throw throwable;
            }
        }
    }
}

