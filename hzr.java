/*
 * Decompiled with CFR 0.152.
 */
import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.List;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class hzr
implements java.util.List,
List,
jsm {
    private final java.util.List a;

    public hzr(java.util.List list) {
        jse.e(list, "delegate");
        this.a = list;
    }

    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object object) {
        return a.c();
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        return a.d();
    }

    @Override
    public final void clear() {
        a.b();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        jse.e(collection, "elements");
        return this.a.containsAll(collection);
    }

    @Override
    public final boolean equals(Object object) {
        return jse.i(this.a, object);
    }

    @Override
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$_CC.$default$forEach(this, consumer);
    }

    public final Object get(int n2) {
        return this.a.get(n2);
    }

    @Override
    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    @Override
    public final int indexOf(Object object) {
        return this.a.indexOf(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new hzs(this.a.iterator());
    }

    @Override
    public final int lastIndexOf(Object object) {
        return this.a.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        return new hzt(this.a.listIterator());
    }

    public final ListIterator listIterator(int n2) {
        return new hzt(this.a.listIterator(n2));
    }

    @Override
    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    public final Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object) {
        return a.c();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return a.d();
    }

    @Override
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$_CC.$default$removeIf(this, predicate);
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        return a.d();
    }

    public final Object set(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final /* synthetic */ Spliterator spliterator() {
        return List$_CC.$default$spliterator(this);
    }

    @Override
    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    public final java.util.List subList(int n2, int n3) {
        return this.a.subList(n2, n3);
    }

    @Override
    public final Object[] toArray() {
        return jsa.a(this);
    }

    @Override
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        return jsa.b(this, objectArray);
    }

    public final String toString() {
        return this.a.toString();
    }
}

