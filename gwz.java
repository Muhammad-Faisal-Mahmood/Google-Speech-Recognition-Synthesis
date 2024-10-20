/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class gwz
extends hby {
    final gxb a;

    public gwz(gxb gxb2) {
        this.a = gxb2;
    }

    @Override
    public final Map a() {
        return this.a;
    }

    @Override
    public final boolean contains(Object object) {
        return fvd.ai(this.a.a.entrySet(), object);
    }

    @Override
    public final Iterator iterator() {
        return new gxa(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        if (!((hby)this).contains(object)) {
            return false;
        }
        object = Objects.requireNonNull((Map.Entry)object);
        Object object2 = this.a;
        object = object.getKey();
        object2 = ((gxb)object2).b;
        Map map = ((gxp)object2).a;
        fxf.K(map);
        try {
            object = map.remove(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            object = null;
        }
        object = (Collection)object;
        if (object != null) {
            int n2 = object.size();
            object.clear();
            ((gxp)object2).b -= n2;
        }
        return true;
    }
}

