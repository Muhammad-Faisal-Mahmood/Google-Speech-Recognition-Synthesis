/*
 * Decompiled with CFR 0.152.
 */
import j$.lang.Iterable$_CC;
import j$.util.Collection$_CC;
import j$.util.List;
import j$.util.List$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class jpa
implements java.util.List,
Serializable,
RandomAccess,
List,
jsm {
    public static final jpa a = new jpa();
    private static final long serialVersionUID = -7390468764508069838L;

    private jpa() {
    }

    private final Object readResolve() {
        return a;
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
    public final boolean containsAll(Collection collection) {
        jse.e(collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof java.util.List && ((java.util.List)object).isEmpty();
    }

    @Override
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$_CC.$default$forEach(this, consumer);
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return joz.a;
    }

    public final ListIterator listIterator() {
        return joz.a;
    }

    public final ListIterator listIterator(int n2) {
        if (n2 == 0) {
            return joz.a;
        }
        throw new IndexOutOfBoundsException(a.af(n2, "Index: "));
    }

    @Override
    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
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
        int n4 = n2;
        if (n2 == 0) {
            if (n3 == 0) {
                return this;
            }
            n4 = 0;
        }
        throw new IndexOutOfBoundsException(a.an(n3, n4, "fromIndex: ", ", toIndex: "));
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
        return "[]";
    }
}

