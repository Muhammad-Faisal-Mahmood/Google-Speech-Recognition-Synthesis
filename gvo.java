/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class gvo
implements Iterator {
    int a;
    int b;
    gvu c;
    AtomicReferenceArray d;
    gws e;
    gwq f;
    gwq g;
    final gwr h;

    public gvo(gwr gwr2) {
        this.h = gwr2;
        this.a = gwr2.f.length - 1;
        this.b = -1;
        this.b();
    }

    final gwq a() {
        gwq gwq2 = this.f;
        if (gwq2 != null) {
            this.g = gwq2;
            this.b();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    final void b() {
        this.f = null;
        if (!this.d() && !this.e()) {
            int n2;
            while ((n2 = this.a) >= 0) {
                Object object = this.h;
                this.a = n2 - 1;
                this.c = object = ((gwr)object).f[n2];
                if (((gvu)object).b == 0) continue;
                this.d = object = this.c.f;
                this.b = ((AtomicReferenceArray)object).length() - 1;
                if (!this.e()) continue;
            }
        }
    }

    final boolean c(gws object) {
        boolean bl2;
        gwq gwq2;
        Object object2;
        block8: {
            Object object3;
            gwr gwr2;
            long l2;
            block9: {
                block7: {
                    try {
                        l2 = this.h.r.a();
                        object2 = object.j();
                        gwr2 = this.h;
                        object3 = object.j();
                        gwq2 = null;
                        if (object3 != null) break block7;
                        object = gwq2;
                        break block8;
                    }
                    catch (Throwable throwable) {
                        this.c.j();
                        throw throwable;
                    }
                }
                object3 = object.d().get();
                if (object3 != null) break block9;
                object = gwq2;
                break block8;
            }
            object = gwr2.k((gws)object, l2) ? gwq2 : object3;
        }
        if (object != null) {
            this.f = gwq2 = new gwq(this.h, object2, object);
            bl2 = true;
        } else {
            bl2 = false;
        }
        this.c.j();
        return bl2;
    }

    final boolean d() {
        gws gws2 = this.e;
        if (gws2 != null) {
            while ((gws2 = (this.e = gws2.e())) != null) {
                if (this.c(gws2)) {
                    return true;
                }
                gws2 = this.e;
            }
        }
        return false;
    }

    final boolean e() {
        int n2;
        while ((n2 = this.b) >= 0) {
            Object object = this.d;
            this.b = n2 - 1;
            this.e = object = (gws)((AtomicReferenceArray)object).get(n2);
            if (object == null || !this.c((gws)object) && !this.d()) continue;
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override
    public final void remove() {
        boolean bl2 = this.g != null;
        fxf.A(bl2);
        Object object = this.g.a;
        this.h.remove(object);
        this.g = null;
    }
}

