/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;

final class gxa
implements Iterator {
    final Iterator a;
    Collection b;
    final gxb c;

    public gxa(gxb gxb2) {
        this.c = gxb2;
        this.a = gxb2.a.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final void remove() {
        boolean bl2 = this.b != null;
        fxf.B(bl2, "no calls to next() since the last call to remove()");
        this.a.remove();
        gxp gxp2 = this.c.b;
        gxp2.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}

