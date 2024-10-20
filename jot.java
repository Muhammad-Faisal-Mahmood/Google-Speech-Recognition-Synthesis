/*
 * Decompiled with CFR 0.152.
 */
import j$.util.List;
import j$.util.List$_CC;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public abstract class jot
extends jop
implements java.util.List,
List,
jsm {
    protected jot() {
    }

    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object iterator) {
        boolean bl2 = true;
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof java.util.List)) {
            return false;
        }
        iterator = (Collection)((Object)iterator);
        jse.e(iterator, "other");
        if (this.size() != iterator.size()) {
            return false;
        }
        iterator = iterator.iterator();
        Iterator iterator2 = this.iterator();
        do {
            boolean bl3 = bl2;
            if (!iterator2.hasNext()) return bl3;
        } while (jse.i(iterator2.next(), iterator.next()));
        return false;
    }

    public abstract Object get(int var1);

    @Override
    public final int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            int n3 = e2 != null ? e2.hashCode() : 0;
            n2 = n2 * 31 + n3;
        }
        return n2;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        block2: {
            Iterator iterator = this.iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                if (!jse.i(iterator.next(), object)) {
                    ++n2;
                    continue;
                }
                break block2;
            }
            n2 = -1;
        }
        return n2;
    }

    @Override
    public final Iterator iterator() {
        return new joq(this);
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        block1: {
            ListIterator listIterator = this.listIterator(this.size());
            while (listIterator.hasPrevious()) {
                if (!jse.i(listIterator.previous(), object)) continue;
                n2 = listIterator.nextIndex();
                break block1;
            }
            n2 = -1;
        }
        return n2;
    }

    public final ListIterator listIterator() {
        return new jor(this, 0);
    }

    public final ListIterator listIterator(int n2) {
        return new jor(this, n2);
    }

    public final Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public final java.util.List subList(int n2, int n3) {
        return new jos(this, n2, n3);
    }
}

