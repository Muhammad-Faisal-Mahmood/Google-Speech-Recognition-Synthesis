/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Set;

final class hdi
extends gwx {
    final Iterator a;
    final Set b;
    final Set c;

    public hdi(Set set, Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator iterator = this.a;
            Set set = this.c;
            if (!set.contains(iterator = iterator.next())) continue;
            return iterator;
        }
        this.b();
        return null;
    }
}

