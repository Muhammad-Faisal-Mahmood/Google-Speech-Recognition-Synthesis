/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class big
implements Executor {
    public final ArrayDeque a;
    public final Object b;
    private final Executor c;
    private Runnable d;
    private final int e;

    public big(Executor executor, int n2) {
        this.e = n2;
        this.c = executor;
        this.a = new ArrayDeque();
        this.b = new Object();
    }

    public big(Executor executor, int n2, byte[] byArray) {
        this.e = n2;
        this.c = executor;
        this.a = new ArrayDeque();
        this.b = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Runnable runnable;
        if (this.e != 0) {
            Object object = this.b;
            synchronized (object) {
                Runnable runnable2;
                Object e2 = this.a.poll();
                this.d = runnable2 = (Runnable)e2;
                if (e2 != null) {
                    this.c.execute(runnable2);
                }
                return;
            }
        }
        this.d = runnable = (Runnable)this.a.poll();
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void execute(Runnable runnable) {
        if (this.e != 0) {
            jse.e(runnable, "command");
            Object object = this.b;
            synchronized (object) {
                ArrayDeque arrayDeque = this.a;
                aks aks2 = new aks((Object)runnable, (Object)this, 5, null);
                arrayDeque.offer(aks2);
                if (this.d == null) {
                    this.a();
                }
                return;
            }
        }
        Object object = this.b;
        synchronized (object) {
            ArrayDeque arrayDeque = this.a;
            bcv bcv2 = new bcv((Object)this, runnable, 2);
            arrayDeque.add(bcv2);
            if (this.d == null) {
                this.a();
            }
            return;
        }
    }
}

