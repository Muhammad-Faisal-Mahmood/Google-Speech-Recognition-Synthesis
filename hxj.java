/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public final class hxj
extends AbstractMap {
    public final hxf a;
    private final Map b;

    public hxj(Map map, hxf hxf2) {
        this.b = map;
        this.a = hxf2;
    }

    @Override
    public final Set entrySet() {
        return new hxi(this, this.b.entrySet());
    }

    @Override
    public final Object get(Object object) {
        if ((object = this.b.get(object)) == null) {
            return null;
        }
        return this.a.a(object);
    }

    @Override
    public final Object put(Object object, Object object2) {
        if ((object = this.b.put(object, object2 = hxf.b(object2))) == null) {
            return null;
        }
        return this.a.a(object);
    }
}

