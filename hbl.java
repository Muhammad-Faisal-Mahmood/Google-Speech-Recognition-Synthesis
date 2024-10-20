/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class hbl
implements Iterator {
    public final Iterator a;
    public boolean b;
    public Object c;

    public hbl(Iterator iterator) {
        fxf.K(iterator);
        this.a = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
        {
        }
    }

    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object object = this.c;
        this.b = false;
        this.c = null;
        return object;
    }

    @Override
    public final void remove() {
        fxf.B(this.b ^ true, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}

