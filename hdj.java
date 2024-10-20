/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class hdj
extends hdp {
    final Set a;
    final Set b;

    public hdj(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override
    public final hdx a() {
        return new hdi(this.a, this.b);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object) && this.b.contains(object);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override
    public final int size() {
        Iterator iterator = this.a.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!this.b.contains(e2)) continue;
            ++n2;
        }
        return n2;
    }
}

