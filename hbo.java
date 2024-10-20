/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class hbo
implements ListIterator {
    boolean a;
    final ListIterator b;
    final hbp c;

    public hbo(hbp hbp2, ListIterator listIterator) {
        this.b = listIterator;
        this.c = hbp2;
    }

    public final void add(Object object) {
        this.b.add(object);
        this.b.previous();
        this.a = false;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.a = true;
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            this.a = true;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.nextIndex() - 1;
    }

    @Override
    public final void remove() {
        fvd.ak(this.a);
        this.b.remove();
        this.a = false;
    }

    public final void set(Object object) {
        fxf.A(this.a);
        this.b.set(object);
    }
}

