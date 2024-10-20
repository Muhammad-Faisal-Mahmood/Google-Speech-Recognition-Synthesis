/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hxh
implements Iterator {
    final hxj a;
    private final Iterator b;

    public hxh(hxj hxj2, Iterator iterator) {
        this.a = hxj2;
        this.b = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override
    public final void remove() {
        this.b.remove();
    }
}

