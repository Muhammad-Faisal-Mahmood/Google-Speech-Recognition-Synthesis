/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class gxe
extends hbz {
    final gxp a;

    public gxe(gxp gxp2, Map map) {
        this.a = gxp2;
        super(map);
    }

    @Override
    public final void clear() {
        fvd.I(((hbz)this).iterator());
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object object) {
        return this == object || this.d.keySet().equals(object);
        {
        }
    }

    @Override
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new gxd(this, this.d.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object object) {
        if ((object = (Collection)this.d.remove(object)) != null) {
            int n2 = object.size();
            object.clear();
            object = this.a;
            ((gxp)object).b -= n2;
            if (n2 > 0) {
                return true;
            }
        }
        return false;
    }
}

