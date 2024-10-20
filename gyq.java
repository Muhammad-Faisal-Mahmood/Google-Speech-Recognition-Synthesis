/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class gyq
implements Iterator {
    int a;
    int b;
    int c;
    final gyr d;

    public gyq(gyr gyr2) {
        this.d = gyr2;
        this.a = gyr2.b;
        this.b = gyr2.a();
        this.c = -1;
    }

    private final void a() {
        if (this.d.b == this.a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        this.a();
        if (this.hasNext()) {
            int n2;
            this.c = n2 = this.b;
            Object object = this.d.c(n2);
            this.b = this.d.b(this.b);
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        this.a();
        boolean bl2 = this.c >= 0;
        fvd.ak(bl2);
        this.a += 32;
        int n2 = this.c;
        gyr gyr2 = this.d;
        gyr2.remove(gyr2.c(n2));
        --this.b;
        this.c = -1;
    }
}

