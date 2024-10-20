/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class jpq
extends jph {
    private final jpp a;

    public jpq(jpp jpp2) {
        this.a = jpp2;
    }

    @Override
    public final int a() {
        return this.a.g;
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean b(Map.Entry entry) {
        jse.e(entry, "element");
        return this.a.i(entry);
    }

    @Override
    public final boolean c(Map.Entry entry) {
        jse.e(entry, "element");
        jse.e(entry, "entry");
        jpp jpp2 = this.a;
        jpp2.f();
        int n2 = jpp2.b(entry.getKey());
        if (n2 >= 0) {
            Object[] objectArray = jpp2.c;
            jse.b(objectArray);
            if (jse.i(objectArray[n2], entry.getValue())) {
                jpp2.g(n2);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean containsAll(Collection collection) {
        jse.e(collection, "elements");
        return this.a.h(collection);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new jpl(this.a);
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

