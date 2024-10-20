/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class gxd
implements Iterator {
    Map.Entry a;
    final Iterator b;
    final gxe c;

    public gxd(gxe gxe2, Iterator iterator) {
        this.b = iterator;
        this.c = gxe2;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        Map.Entry entry;
        this.a = entry = (Map.Entry)this.b.next();
        return entry.getKey();
    }

    @Override
    public final void remove() {
        boolean bl2 = this.a != null;
        fxf.B(bl2, "no calls to next() since the last call to remove()");
        Collection collection = (Collection)this.a.getValue();
        this.b.remove();
        gxp gxp2 = this.c.a;
        gxp2.b -= collection.size();
        collection.clear();
        this.a = null;
    }
}

