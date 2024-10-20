/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class jpc
implements Set,
Serializable,
jsm {
    public static final jpc a = new jpc();
    private static final long serialVersionUID = 3406603774387020532L;

    private jpc() {
    }

    private final Object readResolve() {
        return a;
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
        return object instanceof Set && ((Set)object).isEmpty();
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return joz.a;
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
    public final boolean retainAll(Collection collection) {
        return a.d();
    }

    @Override
    public final Object[] toArray() {
        return jsa.a(this);
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

