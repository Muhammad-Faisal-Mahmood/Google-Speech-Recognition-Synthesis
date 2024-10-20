/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class iwq
implements Iterator {
    final iwr a;
    private boolean b;
    private int c;

    public iwq(iwr iwr2) {
        this.a = iwr2;
        this.b = true;
        this.c = iwr2.b;
    }

    @Override
    public final boolean hasNext() {
        if (!this.b) {
            while (true) {
                int n2 = this.c++;
                Object object = this.a;
                Object object2 = ((iwr)object).c;
                if (n2 >= ((iwx)object2).e) break;
                object = ((iwr)object).a;
                if (!Arrays.equals(((iws)object).b, (byte[])(object2 = (Object)((iwx)object2).j(n2)))) continue;
                this.b = true;
                return true;
            }
            return false;
        }
        return true;
    }

    public final Object next() {
        if (this.hasNext()) {
            this.b = false;
            iwr iwr2 = this.a;
            int n2 = this.c;
            this.c = n2 + 1;
            return iwr2.c.d(n2, iwr2.a);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

