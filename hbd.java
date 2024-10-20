/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hbd
implements Iterator {
    boolean a;
    final Iterator b;

    public hbd(Iterator iterator) {
        this.b = iterator;
        this.a = true;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        Object e2 = this.b.next();
        this.a = false;
        return e2;
    }

    @Override
    public final void remove() {
        fvd.ak(this.a ^ true);
        this.b.remove();
    }
}

