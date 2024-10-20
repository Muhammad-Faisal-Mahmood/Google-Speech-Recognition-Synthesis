/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class krr
implements Executor {
    private final Executor a;
    private final Runnable b = new kra(this, 10);
    private final ArrayDeque c = new ArrayDeque();
    private boolean d;

    public krr(Executor executor) {
        this.a = executor;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        ArrayDeque arrayDeque = this.c;
        // MONITORENTER : arrayDeque
        if (this.d) {
            // MONITOREXIT : arrayDeque
            return;
        }
        Object object = (Runnable)this.c.pollFirst();
        boolean bl2 = object != null;
        this.d = bl2;
        // MONITOREXIT : arrayDeque
        while (object != null) {
            object.run();
            arrayDeque = this.c;
            object = (Runnable)this.c.pollFirst();
            bl2 = object != null;
            this.d = bl2;
            // MONITOREXIT : arrayDeque
        }
        return;
        catch (Throwable throwable) {
            object = this.c;
            // MONITORENTER : object
            this.d = false;
            try {
                this.a.execute(this.b);
                // MONITOREXIT : object
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                throw throwable;
            }
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void execute(Runnable runnable) {
        ArrayDeque arrayDeque = this.c;
        synchronized (arrayDeque) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                this.c.removeLast();
            }
            return;
        }
    }
}

