/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hxr
implements Iterator {
    private final Iterator a;

    public hxr(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final void remove() {
        this.a.remove();
    }
}

