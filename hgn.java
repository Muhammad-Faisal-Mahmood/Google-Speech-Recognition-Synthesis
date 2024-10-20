/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hgn
implements Iterator {
    final hgo a;
    private final hez b;
    private int c;
    private int d;

    public hgn(hgo hgo2, hez hez2, int n2) {
        int n3;
        this.a = hgo2;
        this.b = hez2;
        this.c = n3 = n2 & 0x1F;
        this.d = n2 >>> n3 + 5;
    }

    @Override
    public final boolean hasNext() {
        return this.c >= 0;
    }

    public final Object next() {
        Object object = this.a.e(this.c);
        object = this.b.c(object);
        int n2 = this.d;
        if (n2 != 0) {
            n2 = Integer.numberOfTrailingZeros(n2) + 1;
            this.d >>>= n2;
            this.c += n2;
        } else {
            this.c = -1;
        }
        return object;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

