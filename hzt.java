/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

public final class hzt
implements ListIterator,
jsm {
    private final ListIterator a;

    public hzt(ListIterator listIterator) {
        jse.e(listIterator, "delegate");
        this.a = listIterator;
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public final Object next() {
        return this.a.next();
    }

    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final Object previous() {
        return this.a.previous();
    }

    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public final void remove() {
        a.b();
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

