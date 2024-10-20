/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

final class hcj
extends hdo {
    final gxx a;

    public hcj() {
        throw null;
    }

    public hcj(gxx gxx2) {
        this.a = gxx2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.a.d();
    }

    @Override
    public final boolean remove(Object object) {
        return this.a.c(object, Integer.MAX_VALUE) > 0;
    }

    @Override
    public final int size() {
        return this.a.j().size();
    }
}

