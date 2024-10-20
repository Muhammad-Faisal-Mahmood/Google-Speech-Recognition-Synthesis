/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Set;

final class hdg
extends gwx {
    final Iterator a;
    final Iterator b;
    final Set c;
    final Set d;

    public hdg(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.a = set.iterator();
        this.b = ((hdq)set2).k();
    }

    @Override
    protected final Object a() {
        if (!this.a.hasNext()) {
            Iterator iterator;
            while ((iterator = this.b).hasNext()) {
                Set set = this.c;
                if (set.contains(iterator = iterator.next())) continue;
                return iterator;
            }
            this.b();
            return null;
        }
        return this.a.next();
    }
}

