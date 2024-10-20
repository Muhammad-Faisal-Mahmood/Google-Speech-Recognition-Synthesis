/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class gvq
extends gva {
    final gwr b;

    public gvq(gwr gwr2) {
        this.b = gwr2;
        super(gwr2);
    }

    @Override
    public final boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public final Iterator iterator() {
        return new gvp(this.b);
    }

    @Override
    public final boolean remove(Object object) {
        return this.b.remove(object) != null;
    }
}

