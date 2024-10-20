/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class hcb
extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override
    public final Set entrySet() {
        Set set;
        Set set2 = set = this.a;
        if (set == null) {
            this.a = set2 = this.b();
        }
        return set2;
    }

    public Set g() {
        return new hbz(this);
    }

    @Override
    public Set keySet() {
        Set set;
        Set set2 = set = this.b;
        if (set == null) {
            this.b = set2 = this.g();
        }
        return set2;
    }

    @Override
    public final Collection values() {
        Collection collection;
        Collection collection2 = collection = this.c;
        if (collection == null) {
            this.c = collection2 = new hca(this);
        }
        return collection2;
    }
}

