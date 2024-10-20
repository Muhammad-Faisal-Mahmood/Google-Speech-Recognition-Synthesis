/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class gxs
implements Iterator {
    int b;
    int c;
    int d;
    final gxt e;

    public gxs(gxt gxt2) {
        this.e = gxt2;
        this.b = gxt2.a.a();
        this.c = -1;
        this.d = gxt2.a.d;
    }

    private final void b() {
        if (this.e.a.d == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object a(int var1);

    @Override
    public final boolean hasNext() {
        this.b();
        return this.b >= 0;
    }

    public final Object next() {
        if (this.hasNext()) {
            int n2;
            Object object = this.a(this.b);
            this.c = n2 = this.b;
            this.b = this.e.a.e(n2);
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        this.b();
        boolean bl2 = this.c != -1;
        fvd.ak(bl2);
        gxt gxt2 = this.e;
        gxt2.b -= (long)gxt2.a.g(this.c);
        --this.b;
        this.c = -1;
        this.d = this.e.a.d;
    }
}

