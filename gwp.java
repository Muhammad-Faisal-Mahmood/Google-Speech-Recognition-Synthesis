/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
import java.util.AbstractQueue;
import java.util.Iterator;

final class gwp
extends AbstractQueue {
    final gws a = new gwn();

    public final gws a() {
        gws gws2;
        gws gws3 = ((gwn)gws2).a;
        gws2 = this.a;
        if (gws3 == gws2) {
            return null;
        }
        return gws3;
    }

    @Override
    public final void clear() {
        gws gws2;
        gws gws3 = ((gwn)this.a).a;
        while (gws3 != (gws2 = this.a)) {
            gws2 = gws3.g();
            gwr.f(gws3);
            gws3 = gws2;
        }
        gws3 = (gwn)gws2;
        ((gwn)gws3).a = gws2;
        ((gwn)gws3).b = gws2;
    }

    @Override
    public final boolean contains(Object object) {
        return ((gws)object).g() != gvt.a;
    }

    @Override
    public final boolean isEmpty() {
        gws gws2 = this.a;
        return ((gwn)gws2).a == gws2;
    }

    @Override
    public final Iterator iterator() {
        return new gwo(this, this.a());
    }

    @Override
    public final boolean remove(Object object) {
        gws gws2 = (gws)object;
        object = gws2.i();
        gws gws3 = gws2.g();
        gwr.d((gws)object, gws3);
        gwr.f(gws2);
        return gws3 != gvt.a;
    }

    @Override
    public final int size() {
        int n2 = 0;
        for (gws gws2 = ((gwn)this.a).a; gws2 != this.a; gws2 = gws2.g()) {
            ++n2;
        }
        return n2;
    }
}

