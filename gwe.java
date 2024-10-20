/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Iterator;

final class gwe
extends AbstractCollection {
    final gwr a;

    public gwe(gwr gwr2) {
        this.a = gwr2;
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
        return new gwc(this.a);
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

