/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class hyy
extends AbstractSet {
    final hyz a;

    public hyy(hyz hyz2) {
        this.a = hyz2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean contains(Object object) {
        boolean bl2;
        Map.Entry entry = (Map.Entry)object;
        object = entry.getKey();
        object = this.a.get(object);
        Object v2 = entry.getValue();
        boolean bl3 = bl2 = true;
        if (object == v2) return bl3;
        if (object == null) return false;
        if (!object.equals(v2)) return false;
        return bl2;
    }

    @Override
    public final Iterator iterator() {
        return new hyx(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.a.remove(object.getKey());
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

