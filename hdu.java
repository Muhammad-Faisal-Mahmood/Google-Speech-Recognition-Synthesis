/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Queue;

public final class hdu
extends hds
implements Queue {
    private static final long serialVersionUID = 0L;

    public hdu(Queue queue) {
        super(queue);
    }

    @Override
    public final /* synthetic */ Collection a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object element() {
        Object object = this.b;
        synchronized (object) {
            return this.a.element();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean offer(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.offer(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object peek() {
        Object object = this.b;
        synchronized (object) {
            return this.a.peek();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object poll() {
        Object object = this.b;
        synchronized (object) {
            return this.a.poll();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object remove() {
        Object object = this.b;
        synchronized (object) {
            return this.a.remove();
        }
    }
}

