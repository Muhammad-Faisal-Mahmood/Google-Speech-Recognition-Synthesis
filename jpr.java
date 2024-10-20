/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class jpr
extends jow
implements Set,
jsn {
    private final jpp a;

    public jpr(jpp jpp2) {
        this.a = jpp2;
    }

    @Override
    public final int a() {
        return this.a.g;
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new jpo(this.a, 1, null);
    }

    @Override
    public final boolean remove(Object object) {
        return this.a.j(object);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        jse.e(collection, "elements");
        this.a.f();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        this.a.f();
        return super.retainAll(collection);
    }
}

