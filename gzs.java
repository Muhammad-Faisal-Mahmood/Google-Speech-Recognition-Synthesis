/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class gzs
extends gzk {
    public gzs() {
        super(4);
    }

    public gzs(int n2) {
        super(n2);
    }

    @Override
    public final /* synthetic */ void c(Object object) {
        super.b(object);
    }

    public final gzx g() {
        this.c = true;
        return gzx.i(this.a, this.b);
    }

    public final void h(Object object) {
        super.b(object);
    }

    public final void i(Object ... objectArray) {
        super.d(objectArray);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator iterator) {
        while (iterator.hasNext()) {
            super.b(iterator.next());
        }
    }
}

