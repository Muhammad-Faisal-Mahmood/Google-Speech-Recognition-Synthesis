/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class hdy
extends hdx
implements ListIterator {
    private final int a;
    private int b;

    protected hdy(int n2, int n3) {
        fxf.M(n3, n2);
        this.a = n2;
        this.b = n3;
    }

    protected abstract Object a(int var1);

    @Deprecated
    public final void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            int n2 = this.b;
            this.b = n2 + 1;
            return this.a(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            int n2;
            this.b = n2 = this.b - 1;
            return this.a(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.b - 1;
    }

    @Deprecated
    public final void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

