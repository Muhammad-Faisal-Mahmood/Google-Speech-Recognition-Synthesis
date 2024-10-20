/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Collection$_EL;
import j$.util.Spliterator;
import j$.util.i_0;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/*
 * Renamed from j$.util.j
 */
class j_0
implements java.util.Collection,
Serializable,
Collection {
    private static final long serialVersionUID = 1820017752578914078L;
    final java.util.Collection a;

    j_0(java.util.Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    public boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override
    public void forEach(Consumer consumer) {
        Collection$_EL.forEach(this.a, consumer);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new i_0(this);
    }

    public Stream parallelStream() {
        return Collection$_EL.a(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    public Spliterator spliterator() {
        return Collection$_EL.b(this.a);
    }

    public Stream stream() {
        return Collection$_EL.stream(this.a);
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    public Object[] toArray(Object[] objectArray) {
        return this.a.toArray(objectArray);
    }

    public final String toString() {
        return this.a.toString();
    }
}

