/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

abstract class hdw
extends hdv
implements ListIterator {
    public hdw(ListIterator listIterator) {
        super(listIterator);
    }

    private final ListIterator b() {
        return (ListIterator)this.b;
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }

    public final Object previous() {
        return this.a(this.b().previous());
    }

    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

