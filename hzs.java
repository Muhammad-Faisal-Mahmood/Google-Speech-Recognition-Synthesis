/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hzs
implements Iterator,
jsm {
    private final Iterator a;

    public hzs(Iterator iterator) {
        jse.e(iterator, "delegate");
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return this.a.next();
    }

    @Override
    public final void remove() {
        a.b();
    }
}

