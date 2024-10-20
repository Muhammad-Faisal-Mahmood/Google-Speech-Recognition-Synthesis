/*
 * Decompiled with CFR 0.152.
 */
import java.util.Deque;
import java.util.Iterator;

final class hii
extends gwx {
    final Deque a;
    final Deque b;

    public hii(Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
    }

    @Override
    protected final Object a() {
        Object object = this.a;
        while ((object = hhk.k((Deque)object)) != null) {
            Iterator iterator = hhk.j(object).iterator();
            if (!iterator.hasNext()) {
                return object;
            }
            this.a.addFirst(iterator);
            this.b.push(object);
            object = this.a;
        }
        if (!this.b.isEmpty()) {
            return this.b.pop();
        }
        this.b();
        return null;
    }
}

