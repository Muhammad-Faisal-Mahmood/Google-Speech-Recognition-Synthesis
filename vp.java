/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class vp
implements Iterator,
jsm {
    private final jrk a;
    private final List b;
    private Iterator c;

    public vp(Iterator iterator, jrk jrk2) {
        this.a = jrk2;
        this.b = new ArrayList();
        this.c = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    public final Object next() {
        Object e2 = this.c.next();
        Object object = this.a.a(e2);
        if (object != null && object.hasNext()) {
            this.b.add(this.c);
            this.c = object;
        } else {
            while (!this.c.hasNext() && !this.b.isEmpty()) {
                this.c = (Iterator)jns.m(this.b);
                jns.k(this.b);
            }
        }
        return e2;
    }

    @Override
    public final void remove() {
        a.b();
    }
}

