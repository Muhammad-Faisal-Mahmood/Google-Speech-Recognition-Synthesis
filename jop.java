/*
 * Decompiled with CFR 0.152.
 */
import j$.lang.Iterable$_CC;
import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public abstract class jop
implements java.util.Collection,
Collection,
jsm {
    protected jop() {
    }

    public abstract int a();

    public final boolean add(Object object) {
        return a.c();
    }

    public final boolean addAll(java.util.Collection collection) {
        return a.d();
    }

    @Override
    public final void clear() {
        a.b();
    }

    @Override
    public boolean contains(Object object) {
        boolean bl2;
        block3: {
            bl2 = this.isEmpty();
            boolean bl3 = false;
            if (bl2) {
                bl2 = bl3;
            } else {
                Iterator iterator = this.iterator();
                do {
                    bl2 = bl3;
                    if (!iterator.hasNext()) break block3;
                } while (!jse.i(iterator.next(), object));
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean containsAll(java.util.Collection object) {
        boolean bl2;
        block3: {
            jse.e(object, "elements");
            bl2 = object.isEmpty();
            boolean bl3 = true;
            if (bl2) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (this.contains(object.next()));
                bl2 = false;
            }
        }
        return bl2;
    }

    @Override
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$_CC.$default$forEach(this, consumer);
    }

    @Override
    public final boolean isEmpty() {
        return this.a() == 0;
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object) {
        return a.c();
    }

    public final boolean removeAll(java.util.Collection collection) {
        return a.d();
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(java.util.Collection collection) {
        return a.d();
    }

    public /* synthetic */ Spliterator spliterator() {
        return Collection$_CC.$default$spliterator(this);
    }

    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return jsa.a(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        return jsa.b(this, objectArray);
    }

    public final String toString() {
        return jns.D(this, ", ", "[", "]", new etv(this, 15), 24);
    }
}

