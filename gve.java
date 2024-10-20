/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gvt
 */
import java.util.AbstractQueue;
import java.util.Iterator;

final class gve
extends AbstractQueue {
    final gws a = new gvc();

    public final gws a() {
        gws gws2;
        gws gws3 = ((gvc)gws2).a;
        gws2 = this.a;
        if (gws3 == gws2) {
            return null;
        }
        return gws3;
    }

    @Override
    public final void clear() {
        gws gws2;
        gws gws3 = ((gvc)this.a).a;
        while (gws3 != (gws2 = this.a)) {
            gws2 = gws3.f();
            gwr.e(gws3);
            gws3 = gws2;
        }
        gws3 = (gvc)gws2;
        ((gvc)gws3).a = gws2;
        ((gvc)gws3).b = gws2;
    }

    @Override
    public final boolean contains(Object object) {
        return ((gws)object).f() != gvt.a;
    }

    @Override
    public final boolean isEmpty() {
        gws gws2 = this.a;
        return ((gvc)gws2).a == gws2;
    }

    @Override
    public final Iterator iterator() {
        return new gvd(this, this.a());
    }

    @Override
    public final boolean remove(Object object) {
        object = (gws)object;
        gws gws2 = object.h();
        gws gws3 = object.f();
        gwr.c(gws2, gws3);
        gwr.e((gws)object);
        return gws3 != gvt.a;
    }

    @Override
    public final int size() {
        int n2 = 0;
        for (gws gws2 = ((gvc)this.a).a; gws2 != this.a; gws2 = gws2.f()) {
            ++n2;
        }
        return n2;
    }
}

