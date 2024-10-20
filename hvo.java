/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

final class hvo
extends hvp {
    final hvu a;
    private int b;
    private final int c;

    public hvo(hvu hvu2) {
        this.a = hvu2;
        this.b = 0;
        this.c = hvu2.d();
    }

    @Override
    public final byte a() {
        int n2 = this.b;
        if (n2 < this.c) {
            this.b = n2 + 1;
            return this.a.b(n2);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.c;
    }
}

