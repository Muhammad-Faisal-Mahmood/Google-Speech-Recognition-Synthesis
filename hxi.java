/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

final class hxi
extends AbstractSet {
    final hxj a;
    private final Set b;

    public hxi(hxj hxj2, Set set) {
        this.a = hxj2;
        this.b = set;
    }

    @Override
    public final Iterator iterator() {
        Set set = this.b;
        return new hxh(this.a, set.iterator());
    }

    @Override
    public final int size() {
        return this.b.size();
    }
}

