/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection;
import j$.util.Collection$_CC;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public abstract class gzm
extends AbstractCollection
implements Serializable,
Collection {
    private static final Object[] nK = new Object[0];
    private static final long serialVersionUID = 912559L;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    @Deprecated
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objectArray, int n2) {
        hdx hdx2 = this.k();
        while (hdx2.hasNext()) {
            objectArray[n2] = hdx2.next();
            ++n2;
        }
        return n2;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object var1);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public gzx f() {
        throw null;
    }

    @Override
    public final /* synthetic */ void forEach(Consumer consumer) {
        Collection$_CC.$default$forEach(this, consumer);
    }

    public abstract hdx k();

    public abstract boolean l();

    public Object[] m() {
        return null;
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection$_CC.$default$parallelStream(this);
    }

    @Override
    @Deprecated
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$_CC.$default$removeIf(this, predicate);
    }

    @Override
    @Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final /* synthetic */ Stream stream() {
        return Collection$_CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(nK);
    }

    @Override
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection$_CC.$default$toArray(this, intFunction);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        fxf.K(objectArray);
        int n2 = this.size();
        int n3 = objectArray.length;
        if (n3 < n2) {
            objectArray2 = this.m();
            if (objectArray2 != null) return Arrays.copyOfRange(objectArray2, this.e(), this.d(), objectArray.getClass());
            objectArray2 = hhk.z(objectArray, n2);
        } else {
            objectArray2 = objectArray;
            if (n3 > n2) {
                objectArray[n2] = null;
                objectArray2 = objectArray;
            }
        }
        this.b(objectArray2, 0);
        return objectArray2;
    }

    public Object writeReplace() {
        return new gzv(this.toArray());
    }
}

