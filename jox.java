/*
 * Decompiled with CFR 0.152.
 */
import j$.lang.Iterable$_CC;
import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class jox
implements java.util.Collection,
Collection,
jsm {
    private final Object[] a;
    private final boolean b;

    public jox(Object[] objectArray, boolean bl2) {
        jse.e(objectArray, "values");
        this.a = objectArray;
        this.b = bl2;
    }

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
    public final boolean contains(Object object) {
        return jns.U(this.a, object);
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
        return this.a.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return jsd.b(this.a);
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

    public final /* synthetic */ Spliterator spliterator() {
        return Collection$_CC.$default$spliterator(this);
    }

    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        Object[] objectArray = this.a;
        jse.e(objectArray, "<this>");
        if (this.b && jse.i(objectArray.getClass(), Object[].class)) {
            return objectArray;
        }
        objectArray = Arrays.copyOf(objectArray, objectArray.length, Object[].class);
        jse.d(objectArray, "copyOf(...)");
        return objectArray;
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        return jsa.b(this, objectArray);
    }
}

