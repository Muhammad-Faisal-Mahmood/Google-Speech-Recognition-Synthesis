/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class gxk
implements Iterator {
    final Iterator a;
    final Collection b;
    final gxl c;

    public gxk(gxl iterator) {
        this.c = iterator;
        this.b = ((gxl)((Object)iterator)).b;
        iterator = ((gxl)((Object)iterator)).b;
        iterator = iterator instanceof List ? ((List)((Object)iterator)).listIterator() : iterator.iterator();
        this.a = iterator;
    }

    public gxk(gxl gxl2, Iterator iterator) {
        this.c = gxl2;
        this.b = gxl2.b;
        this.a = iterator;
    }

    final void a() {
        this.c.b();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean hasNext() {
        this.a();
        return this.a.hasNext();
    }

    public final Object next() {
        this.a();
        return this.a.next();
    }

    @Override
    public final void remove() {
        this.a.remove();
        gxl gxl2 = this.c;
        gxp gxp2 = gxl2.e;
        --gxp2.b;
        gxl2.c();
    }
}

