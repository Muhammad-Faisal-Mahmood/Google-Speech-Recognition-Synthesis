/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class gyl
implements Iterator {
    int b;
    int c;
    int d;
    final gyp e;

    public gyl(gyp gyp2) {
        this.e = gyp2;
        this.b = gyp2.e;
        this.c = gyp2.a();
        this.d = -1;
    }

    private final void b() {
        if (this.e.e == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object a(int var1);

    @Override
    public final boolean hasNext() {
        return this.c >= 0;
    }

    public final Object next() {
        this.b();
        if (this.hasNext()) {
            int n2;
            this.d = n2 = this.c;
            Object object = this.a(n2);
            this.c = this.e.b(this.c);
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        this.b();
        boolean bl2 = this.d >= 0;
        fvd.ak(bl2);
        this.b += 32;
        int n2 = this.d;
        gyp gyp2 = this.e;
        gyp2.remove(gyp2.e(n2));
        --this.c;
        this.d = -1;
    }
}

