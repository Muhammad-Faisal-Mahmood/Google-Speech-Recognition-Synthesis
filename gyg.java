/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class gyg
extends AbstractCollection {
    final Collection a;
    final gte b;

    public gyg(Collection collection, gte gte2) {
        fxf.K(collection);
        this.a = collection;
        this.b = gte2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return fvd.H(this.a.iterator(), this.b);
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

