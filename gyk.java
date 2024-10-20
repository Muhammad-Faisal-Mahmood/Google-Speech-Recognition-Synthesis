/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class gyk
extends AbstractSet {
    final gyp a;

    public gyk(gyp gyp2) {
        this.a = gyp2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        int n2;
        Map map = this.a.j();
        if (map != null) {
            return map.entrySet().contains(object);
        }
        return object instanceof Map.Entry && (n2 = this.a.d((object = (Map.Entry)object).getKey())) != -1 && a.k(this.a.h(n2), object.getValue());
    }

    @Override
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override
    public final boolean remove(Object object) {
        Object object2 = this.a.j();
        if (object2 != null) {
            return object2.entrySet().remove(object);
        }
        if (object instanceof Map.Entry) {
            object2 = (Map.Entry)object;
            object = this.a;
            if (!((gyp)object).o()) {
                gyp gyp2;
                int n2 = ((gyp)object).c();
                object = object2.getKey();
                int n3 = fvd.ac(object, object2 = object2.getValue(), n2, (gyp2 = this.a).g(), gyp2.p(), gyp2.q(), gyp2.r());
                if (n3 != -1) {
                    this.a.m(n3, n2);
                    object = this.a;
                    --((gyp)object).f;
                    ((gyp)object).k();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

