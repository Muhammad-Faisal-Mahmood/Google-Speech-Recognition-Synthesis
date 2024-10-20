/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class gxb
extends hcb {
    final transient Map a;
    final gxp b;

    public gxb(gxp gxp2, Map map) {
        this.b = gxp2;
        this.a = map;
    }

    final Map.Entry a(Map.Entry object) {
        Object k2 = object.getKey();
        object = (Collection)object.getValue();
        return new gzn(k2, this.b.c(k2, (Collection)object));
    }

    @Override
    public final Set b() {
        return new gwz(this);
    }

    @Override
    public final void clear() {
        Map map = this.a;
        gxp gxp2 = this.b;
        if (map == gxp2.a) {
            gxp2.k();
            return;
        }
        fvd.I(new gxa(this));
    }

    @Override
    public final boolean containsKey(Object object) {
        boolean bl2;
        Map map = this.a;
        fxf.K(map);
        try {
            bl2 = map.containsKey(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final boolean equals(Object object) {
        return this == object || this.a.equals(object);
        {
        }
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public Set keySet() {
        return this.b.p();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

