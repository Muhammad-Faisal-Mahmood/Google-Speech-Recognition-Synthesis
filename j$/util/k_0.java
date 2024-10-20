/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.l_0;
import j$.util.t;
import j$.util.z;
import java.util.ListIterator;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.k
 */
final class k_0
implements ListIterator,
t {
    private final ListIterator a;

    k_0(l_0 l_02, int n2) {
        this.a = l_02.b.listIterator(n2);
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        z.j(this.a, consumer);
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public final Object next() {
        return this.a.next();
    }

    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final Object previous() {
        return this.a.previous();
    }

    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

