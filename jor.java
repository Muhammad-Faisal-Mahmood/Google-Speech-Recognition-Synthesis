/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class jor
extends joq
implements ListIterator,
jsm {
    final jot c;

    public jor(jot jot2, int n2) {
        this.c = jot2;
        super(jot2);
        jns.ag(n2, jot2.a());
        this.a = n2;
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override
    public final int nextIndex() {
        return this.a;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            int n2;
            jot jot2 = this.c;
            this.a = n2 = this.a - 1;
            return jot2.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.a - 1;
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

