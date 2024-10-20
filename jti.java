/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jti
implements Iterator,
jsm {
    final jtk a;
    private final Iterator b;
    private int c;
    private Object d;

    public jti(jtk jtk2) {
        this.a = jtk2;
        this.b = new jtr((jtk)jtk2.b);
        this.c = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a() {
        int n2;
        block1: {
            while (this.b.hasNext()) {
                Object object = this.a.a;
                Iterator iterator = this.b;
                Object e2 = iterator.next();
                if (((Boolean)object.a(e2)).booleanValue()) continue;
                this.d = e2;
                n2 = 1;
                break block1;
            }
            n2 = 0;
        }
        this.c = n2;
    }

    @Override
    public final boolean hasNext() {
        if (this.c == -1) {
            this.a();
        }
        return this.c == 1;
    }

    public final Object next() {
        if (this.c == -1) {
            this.a();
        }
        if (this.c != 0) {
            Object object = this.d;
            this.d = null;
            this.c = -1;
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        a.b();
    }
}

