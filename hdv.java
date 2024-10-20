/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

abstract class hdv
implements Iterator {
    final Iterator b;

    public hdv(Iterator iterator) {
        fxf.K(iterator);
        this.b = iterator;
    }

    public abstract Object a(Object var1);

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return this.a(this.b.next());
    }

    @Override
    public final void remove() {
        this.b.remove();
    }
}

