/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class hpz
implements Executor {
    public static final hpm a = new hpm(hpz.class);
    public final Deque b = new ArrayDeque();
    public long c = 0L;
    public int d = 1;
    private final Executor e;
    private final hpy f = new hpy(this, 0);

    public hpz(Executor executor) {
        fxf.K(executor);
        this.e = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void execute(Runnable object) {
        block15: {
            fxf.K(object);
            Deque deque = this.b;
            // MONITORENTER : deque
            int n2 = this.d;
            if (n2 == 4 || n2 == 3) break block15;
            long l2 = this.c;
            hpx hpx2 = new hpx((Runnable)object);
            this.b.add(hpx2);
            this.d = 2;
            // MONITOREXIT : deque
            try {
                this.e.execute(this.f);
                if (this.d != 2) {
                    return;
                }
                object = this.b;
            }
            catch (Throwable throwable) {
                block17: {
                    int n3;
                    block16: {
                        object = this.b;
                        // MONITORENTER : object
                        int n4 = this.d;
                        n3 = 0;
                        if (n4 == 1) break block16;
                        n2 = n3;
                        if (n4 != 2) break block17;
                    }
                    n2 = n3;
                    if (this.b.removeLastOccurrence(hpx2)) {
                        n2 = 1;
                    }
                }
                if (!(throwable instanceof RejectedExecutionException)) throw throwable;
                if (n2 != 0) throw throwable;
                // MONITOREXIT : object
                return;
            }
            if (this.c == l2 && this.d == 2) {
                this.d = 3;
            }
            // MONITOREXIT : object
            return;
        }
        this.b.add(object);
        // MONITOREXIT : deque
    }

    public final String toString() {
        Object object = this.e;
        int n2 = System.identityHashCode(this);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("SequentialExecutor@");
        stringBuilder.append(n2);
        stringBuilder.append("{");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

