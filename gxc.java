/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hbk
 */
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class gxc
implements Iterator {
    final Iterator a;
    Collection b;
    Iterator c;
    final gxp d;

    public gxc(gxp gxp2) {
        this.d = gxp2;
        this.a = gxp2.a.entrySet().iterator();
        this.b = null;
        this.c = hbk.a;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
        {
        }
    }

    public final Object next() {
        if (!this.c.hasNext()) {
            Object object = (Map.Entry)this.a.next();
            object.getKey();
            this.b = object = (Collection)object.getValue();
            this.c = object.iterator();
        }
        return this.c.next();
    }

    @Override
    public final void remove() {
        this.c.remove();
        if (Objects.requireNonNull(this.b).isEmpty()) {
            this.a.remove();
        }
        gxp gxp2 = this.d;
        --gxp2.b;
    }
}

