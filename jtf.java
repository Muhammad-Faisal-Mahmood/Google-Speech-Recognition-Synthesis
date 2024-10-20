/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jtf
implements Iterator,
jsm {
    private int a;
    private final int b;
    private final Object c;

    public jtf(jtg jtg2, int n2) {
        this.b = n2;
        this.c = jtg2.a.a();
        this.a = jtg2.b;
    }

    public jtf(Object[] objectArray, int n2) {
        this.b = n2;
        jse.e(objectArray, "array");
        this.c = objectArray;
    }

    private final void a() {
        while (this.a > 0 && this.c.hasNext()) {
            this.c.next();
            --this.a;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.b != 0) {
            return this.a < ((Object[])this.c).length;
        }
        this.a();
        return this.c.hasNext();
    }

    public final Object next() {
        if (this.b != 0) {
            try {
                Object object = this.c;
                int n2 = this.a;
                this.a = n2 + 1;
                object = ((Object[])object)[n2];
                return object;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                --this.a;
                throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
            }
        }
        this.a();
        return this.c.next();
    }

    @Override
    public final void remove() {
        if (this.b != 0) {
            a.b();
            return;
        }
        a.b();
    }
}

