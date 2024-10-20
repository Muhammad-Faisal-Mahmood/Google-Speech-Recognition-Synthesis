/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class hys
implements Iterator {
    private final ArrayDeque a;
    private hvs b;

    public hys(hvu hvu2) {
        if (hvu2 instanceof hyt) {
            ArrayDeque<hvu> arrayDeque;
            hvu2 = (hyt)hvu2;
            this.a = arrayDeque = new ArrayDeque<hvu>(((hyt)hvu2).g);
            arrayDeque.push(hvu2);
            this.b = this.b(((hyt)hvu2).e);
            return;
        }
        this.a = null;
        this.b = (hvs)hvu2;
    }

    private final hvs b(hvu hvu2) {
        while (hvu2 instanceof hyt) {
            hvu2 = (hyt)hvu2;
            this.a.push(hvu2);
            int[] nArray = hyt.a;
            hvu2 = ((hyt)hvu2).e;
        }
        return (hvs)hvu2;
    }

    public final hvs a() {
        hvs hvs2 = this.b;
        if (hvs2 != null) {
            hvu hvu2;
            do {
                ArrayDeque arrayDeque = this.a;
                Object object = null;
                hvu2 = object;
                if (arrayDeque == null) break;
                if (arrayDeque.isEmpty()) {
                    hvu2 = object;
                    break;
                }
                hvu2 = (hyt)this.a.pop();
                object = hyt.a;
            } while ((hvu2 = this.b(((hyt)hvu2).f)).x());
            this.b = hvu2;
            return hvs2;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

