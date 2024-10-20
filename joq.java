/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

class joq
implements Iterator,
jsm {
    public int a;
    final jot b;

    public joq(jot jot2) {
        this.b = jot2;
    }

    @Override
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    public final Object next() {
        if (this.hasNext()) {
            jot jot2 = this.b;
            int n2 = this.a;
            this.a = n2 + 1;
            return jot2.get(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        a.b();
    }
}

