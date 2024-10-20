/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public final class hod
extends IdentityHashMap
implements Closeable {
    public final bzq a = new bzq((Object)this, null);
    private volatile boolean b;
    private volatile CountDownLatch c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(AutoCloseable autoCloseable, Executor executor) {
        fxf.K(executor);
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.put(autoCloseable, executor);
                return;
            }
        }
        hog.g(autoCloseable, executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
        }
        Iterator iterator = this.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.clear();
                return;
            }
            Map.Entry entry = iterator.next();
            hog.g((AutoCloseable)entry.getKey(), (Executor)entry.getValue());
        }
    }
}

