/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class jou
extends AbstractCollection
implements Collection,
jsn {
    private final jpp a;

    protected jou() {
        throw null;
    }

    public jou(jpp jpp2) {
        this.a = jpp2;
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

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
        return this.a.containsValue(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new jpo(this.a, 0);
    }

    @Override
    public final boolean remove(Object object) {
        jpp jpp2 = this.a;
        jpp2.f();
        int n2 = jpp2.c(object);
        if (n2 < 0) {
            return false;
        }
        jpp2.g(n2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        jse.e(collection, "elements");
        this.a.f();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        this.a.f();
        return super.retainAll(collection);
    }
}

