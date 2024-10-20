/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Collection$_EL;
import j$.util.Spliterator;
import j$.util.stream.L;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

final class O
implements L {
    private final Collection a;

    O(Collection collection) {
        this.a = collection;
    }

    @Override
    public final L a(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final long count() {
        return this.a.size();
    }

    @Override
    public final Object[] d(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[])intFunction.apply(collection.size()));
    }

    @Override
    public final void forEach(Consumer consumer) {
        Collection$_EL.forEach(this.a, consumer);
    }

    @Override
    public final void g(Object[] objectArray, int n2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            objectArray[n2] = iterator.next();
            ++n2;
        }
    }

    @Override
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override
    public final Spliterator spliterator() {
        return Collection$_EL.stream(this.a).spliterator();
    }

    public final String toString() {
        Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", collection.size(), collection);
    }
}

