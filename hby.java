/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

abstract class hby
extends hdo {
    public abstract Map a();

    @Override
    public final void clear() {
        this.a().clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map.Entry;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        object = (Map.Entry)object;
        Object k2 = object.getKey();
        Object object2 = fvd.q(this.a(), k2);
        bl4 = bl2;
        if (!a.k(object2, object.getValue())) return bl4;
        if (object2 != null) return true;
        if (this.a().containsKey(k2)) return true;
        return bl2;
    }

    @Override
    public final boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object) && object instanceof Map.Entry) {
            object = (Map.Entry)object;
            return this.a().keySet().remove(object.getKey());
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            fxf.K(collection);
            boolean bl2 = hhk.v(this, collection);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            return hhk.w(this, collection.iterator());
        }
    }

    @Override
    public final boolean retainAll(Collection collection2) {
        try {
            fxf.K(collection2);
            boolean bl2 = super.retainAll(collection2);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = hhk.q(collection2.size());
            for (Collection collection2 : collection2) {
                if (!this.contains(collection2) || !(collection2 instanceof Map.Entry)) continue;
                hashSet.add(((Map.Entry)((Object)collection2)).getKey());
            }
            return this.a().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.a().size();
    }
}

