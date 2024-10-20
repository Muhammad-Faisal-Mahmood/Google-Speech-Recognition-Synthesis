/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class kna
implements Iterator {
    final knb a;
    private final int b;
    private int c;
    private boolean d;

    public kna(knb knb2) {
        this.a = knb2;
        ++knb2.b;
        this.b = knb2.a.size();
    }

    private final void a() {
        if (!this.d) {
            int n2;
            this.d = true;
            knb knb2 = this.a;
            knb2.b = n2 = knb2.b - 1;
            if (n2 <= 0 && knb2.d) {
                knb2.d = false;
                n2 = knb2.a.size();
                while (--n2 >= 0) {
                    if (knb2.a.get(n2) != null) continue;
                    knb2.a.remove(n2);
                }
            }
        }
    }

    @Override
    public final boolean hasNext() {
        int n2;
        for (n2 = this.c; n2 < this.b && this.a.a(n2) == null; ++n2) {
        }
        if (n2 < this.b) {
            return true;
        }
        this.a();
        return false;
    }

    public final Object next() {
        int n2;
        while ((n2 = this.c++) < this.b && this.a.a(n2) == null) {
        }
        n2 = this.c;
        if (n2 < this.b) {
            knb knb2 = this.a;
            this.c = n2 + 1;
            return knb2.a(n2);
        }
        this.a();
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

