/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class hhn
implements Iterator {
    final hho a;
    private int b;

    public hhn(hho hho2) {
        this.a = hho2;
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        hho hho2 = this.a;
        return this.b < hho2.size();
    }

    public final Object next() {
        int n2 = this.b;
        if (n2 < this.a.size()) {
            Object object = this.a;
            int n3 = ((hho)object).b();
            object = ((hho)object).b.b[n3 + n2];
            this.b = n2 + 1;
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

