/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class hca
extends AbstractCollection {
    final Map a;

    public hca(Map map) {
        this.a = map;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new hbv(this.a.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object object) {
        try {
            boolean bl2 = super.remove(object);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            for (Map.Entry entry : this.a.entrySet()) {
                if (!a.k(object, entry.getValue())) continue;
                this.a.remove(entry.getKey());
                return true;
            }
            return false;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            fxf.K(collection);
            boolean bl2 = super.removeAll(collection);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.a.entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a.keySet().removeAll(hashSet);
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            fxf.K(collection);
            boolean bl2 = super.retainAll(collection);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.a.entrySet()) {
                if (!collection.contains(entry.getValue())) continue;
                hashSet.add(entry.getKey());
            }
            return this.a.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

