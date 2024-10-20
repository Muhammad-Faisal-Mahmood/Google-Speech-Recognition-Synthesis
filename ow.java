/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class ow
implements Iterator,
jsm {
    private int a;
    private int b;
    private boolean c;

    public ow(int n2) {
        this.a = n2;
    }

    protected abstract Object a(int var1);

    protected abstract void b(int var1);

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final Object next() {
        if (this.hasNext()) {
            Object object = this.a(this.b);
            ++this.b;
            this.c = true;
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        int n2;
        if (!this.c) {
            kl.q("Call next() before removing an element.");
        }
        this.b = n2 = this.b - 1;
        this.b(n2);
        --this.a;
        this.c = false;
    }
}

