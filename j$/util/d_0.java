/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/*
 * Renamed from j$.util.d
 */
class d_0
implements java.util.Collection,
Serializable,
Collection {
    private static final long serialVersionUID = 3053995032091335093L;
    final java.util.Collection a;
    final Object b;

    d_0(java.util.Collection collection) {
        this.a = Objects.requireNonNull(collection);
        this.b = this;
    }

    d_0(java.util.Collection collection, Object object) {
        this.a = Objects.requireNonNull(collection);
        this.b = Objects.requireNonNull(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object object = this.b;
        synchronized (object) {
            objectOutputStream.defaultWriteObject();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean add(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.a.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean addAll(java.util.Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.addAll(collection);
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
            this.a.clear();
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
            return this.a.contains(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean containsAll(java.util.Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.containsAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void forEach(Consumer consumer) {
        Object object = this.b;
        synchronized (object) {
            Collection$_EL.forEach(this.a, consumer);
            return;
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
            return this.a.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final Stream parallelStream() {
        return Collection$_EL.a(this.a);
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
            return this.a.remove(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean removeAll(java.util.Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.removeAll(collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean removeIf(Predicate predicate) {
        Object object = this.b;
        synchronized (object) {
            return Collection$_EL.removeIf(this.a, predicate);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean retainAll(java.util.Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.a.retainAll(collection);
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
            return this.a.size();
        }
    }

    public final Spliterator spliterator() {
        return Collection$_EL.b(this.a);
    }

    public final Stream stream() {
        return Collection$_EL.stream(this.a);
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
            return this.a.toArray();
        }
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object[] toArray(Object[] objectArray) {
        Object object = this.b;
        synchronized (object) {
            return this.a.toArray(objectArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        Object object = this.b;
        synchronized (object) {
            return this.a.toString();
        }
    }
}

