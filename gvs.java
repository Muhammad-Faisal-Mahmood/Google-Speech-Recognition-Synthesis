/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  guv
 */
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

final class gvs
extends gzg
implements Serializable {
    private static final long serialVersionUID = 1L;
    final gvw a;
    final gvw b;
    final gtd c;
    final gtd d;
    final long e;
    final long f;
    final long g;
    final gww h;
    final int i;
    final gwu j;
    final gup k;
    transient gur l;

    public gvs(gvw object, gvw gvw2, gtd gtd2, gtd gtd3, long l2, long l3, long l4, gww gww2, int n2, gwu gwu2, gup gup2) {
        block3: {
            block2: {
                this.a = object;
                this.b = gvw2;
                this.c = gtd2;
                this.d = gtd3;
                this.e = l2;
                this.f = l3;
                this.g = l4;
                this.h = gww2;
                this.i = n2;
                this.j = gwu2;
                if (gup2 == gup.a) break block2;
                object = gup2;
                if (gup2 != guw.b) break block3;
            }
            object = null;
        }
        this.k = object;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        object = new guw();
        Object object2 = ((guw)object).h;
        boolean bl2 = true;
        boolean bl3 = object2 == null;
        fxf.E(bl3, "Key strength was already set to %s", object2);
        object2 = this.a;
        fxf.K(object2);
        ((guw)object).h = object2;
        object2 = ((guw)object).i;
        bl3 = object2 == null;
        fxf.E(bl3, "Value strength was already set to %s", object2);
        object2 = this.b;
        fxf.K(object2);
        ((guw)object).i = object2;
        object2 = ((guw)object).l;
        bl3 = object2 == null;
        fxf.E(bl3, "key equivalence was already set to %s", object2);
        object2 = this.c;
        fxf.K(object2);
        ((guw)object).l = object2;
        object2 = ((guw)object).m;
        bl3 = object2 == null;
        fxf.E(bl3, "value equivalence was already set to %s", object2);
        object2 = this.d;
        fxf.K(object2);
        ((guw)object).m = object2;
        ((guw)object).d(this.i);
        ((guw)object).h(this.j);
        ((guw)object).c = false;
        long l2 = this.e;
        if (l2 > 0L) {
            ((guw)object).e(l2, TimeUnit.NANOSECONDS);
        }
        if ((l2 = this.f) > 0L) {
            object2 = TimeUnit.NANOSECONDS;
            long l3 = ((guw)object).k;
            bl3 = l3 == -1L;
            fxf.D(bl3, "expireAfterAccess was already set to %s ns", l3);
            fxf.I(true, l2, object2);
            ((guw)object).k = ((TimeUnit)((Object)object2)).toNanos(l2);
        }
        if ((object2 = this.h) != guv.a) {
            ((guw)object).i((gww)object2);
            l2 = this.g;
            if (l2 != -1L) {
                ((guw)object).g(l2);
            }
        } else {
            l2 = this.g;
            if (l2 != -1L) {
                ((guw)object).f(l2);
            }
        }
        if ((object2 = this.k) != null) {
            bl3 = ((guw)object).o == null ? bl2 : false;
            fxf.A(bl3);
            ((guw)object).o = object2;
        }
        this.l = ((guw)object).a();
    }

    private Object readResolve() {
        return this.l;
    }

    @Override
    protected final /* synthetic */ Object a() {
        return this.l;
    }
}

