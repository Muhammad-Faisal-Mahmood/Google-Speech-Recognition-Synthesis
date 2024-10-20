/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

class hds
extends hdt
implements Collection {
    private static final long serialVersionUID = 0L;

    public hds(Collection collection) {
        super(collection);
    }

    public Collection a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean add(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a().add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean addAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a().addAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void clear() {
        Object object = this.b;
        synchronized (object) {
            this.a().clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean contains(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a().contains(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean containsAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a().containsAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isEmpty() {
        Object object = this.b;
        synchronized (object) {
            return this.a().isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        return this.a().iterator();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean remove(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a().remove(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean removeAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a().removeAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean retainAll(Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a().retainAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int size() {
        Object object = this.b;
        synchronized (object) {
            return this.a().size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object[] toArray() {
        Object object = this.b;
        synchronized (object) {
            return this.a().toArray();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object[] toArray(Object[] objectArray) {
        Object object = this.b;
        synchronized (object) {
            return this.a().toArray(objectArray);
        }
    }
}

