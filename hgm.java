/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;

final class hgm
extends AbstractSet {
    final hgo a;

    public hgm(hgo hgo2) {
        this.a = hgo2;
    }

    @Override
    public final Iterator iterator() {
        return new hgl(this);
    }

    @Override
    public final int size() {
        return this.a.b;
    }
}

