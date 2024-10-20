/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class hbj
implements Iterator {
    private Iterator a;
    private Iterator b = hbi.a;
    private Iterator c;
    private Deque d;

    public hbj(Iterator iterator) {
        this.c = iterator;
    }

    @Override
    public final boolean hasNext() {
        while (true) {
            Object object;
            block7: {
                object = this.b;
                fxf.K(object);
                if (object.hasNext()) break;
                while (true) {
                    if ((object = this.c) != null && object.hasNext()) {
                        object = this.c;
                        break block7;
                    }
                    object = this.d;
                    if (object == null || object.isEmpty()) break;
                    this.c = (Iterator)this.d.removeFirst();
                }
                object = null;
            }
            this.c = object;
            if (object == null) {
                return false;
            }
            this.b = object = (Iterator)object.next();
            if (!(object instanceof hbj)) continue;
            object = (hbj)object;
            this.b = ((hbj)object).b;
            if (this.d == null) {
                this.d = new ArrayDeque();
            }
            this.d.addFirst(this.c);
            if (((hbj)object).d != null) {
                while (!((hbj)object).d.isEmpty()) {
                    this.d.addFirst((Iterator)((hbj)object).d.removeLast());
                }
            }
            this.c = ((hbj)object).c;
        }
        return true;
    }

    public final Object next() {
        if (this.hasNext()) {
            Iterator iterator;
            this.a = iterator = this.b;
            return iterator.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        Iterator iterator = this.a;
        if (iterator != null) {
            iterator.remove();
            this.a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}

