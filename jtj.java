/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class jtj
implements Iterator,
jsm {
    final jtk a;
    private Object b;
    private int c;

    public jtj(jtk jtk2) {
        this.a = jtk2;
        this.c = -2;
    }

    private final void a() {
        Object object;
        if (this.c == -2) {
            object = this.a.a.a();
        } else {
            jtk jtk2 = this.a;
            object = this.b;
            jse.b(object);
            object = jtk2.b.a(object);
        }
        this.b = object;
        int n2 = object == null ? 0 : 1;
        this.c = n2;
    }

    @Override
    public final boolean hasNext() {
        if (this.c < 0) {
            this.a();
        }
        return this.c == 1;
    }

    public final Object next() {
        if (this.c < 0) {
            this.a();
        }
        if (this.c != 0) {
            Object object = this.b;
            jse.c(object, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
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

