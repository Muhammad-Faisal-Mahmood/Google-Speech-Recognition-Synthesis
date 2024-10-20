/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hgl
implements Iterator {
    final hgm a;
    private int b;

    public hgl(hgm hgm2) {
        this.a = hgm2;
        this.b = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

