/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

class hbz
extends hdo {
    final Map d;

    public hbz(Map map) {
        fxf.K(map);
        this.d = map;
    }

    @Override
    public void clear() {
        this.d.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.d.containsKey(object);
    }

    @Override
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new hbu(this.d.entrySet().iterator());
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            this.d.remove(object);
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.d.size();
    }
}

