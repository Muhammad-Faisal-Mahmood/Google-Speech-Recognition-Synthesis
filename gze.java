/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

public abstract class gze
extends gzg
implements Collection {
    protected gze() {
    }

    public boolean add(Object object) {
        return this.b().add(object);
    }

    public boolean addAll(Collection collection) {
        return this.b().addAll(collection);
    }

    protected abstract Collection b();

    @Override
    public final void clear() {
        this.b().clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.b().contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.b().containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return this.b().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.b().iterator();
    }

    @Override
    public final boolean remove(Object object) {
        return this.b().remove(object);
    }

    public final boolean removeAll(Collection collection) {
        return this.b().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.b().retainAll(collection);
    }

    @Override
    public final int size() {
        return this.b().size();
    }

    @Override
    public final Object[] toArray() {
        return this.b().toArray();
    }

    public final Object[] toArray(Object[] objectArray) {
        return this.b().toArray(objectArray);
    }
}

