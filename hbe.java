/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

final class hbe
extends gzd {
    final Iterable a;
    final int b;

    public hbe(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    public final Iterator iterator() {
        Object object = this.a;
        if (object instanceof List) {
            object = (List)object;
            return object.subList(Math.min(object.size(), this.b), object.size()).iterator();
        }
        int n2 = this.b;
        object = object.iterator();
        fvd.A((Iterator)object, n2);
        return new hbd((Iterator)object);
    }
}

