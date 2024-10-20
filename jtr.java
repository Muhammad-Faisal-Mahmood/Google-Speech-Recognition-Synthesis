/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class jtr
implements Iterator,
jsm {
    final jtk a;
    private final Iterator b;

    public jtr(jtk jtk2) {
        this.a = jtk2;
        this.b = jtk2.b.a();
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return this.a.a.a(this.b.next());
    }

    @Override
    public final void remove() {
        a.b();
    }
}

