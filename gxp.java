/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public abstract class gxp
extends gxw
implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected gxp(Map map) {
        fxf.q(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override
    public Collection b(Object object) {
        Collection collection;
        Collection collection2 = collection = (Collection)this.a.get(object);
        if (collection == null) {
            collection2 = this.a();
        }
        return this.c(object, collection2);
    }

    public Collection c(Object object, Collection collection) {
        throw null;
    }

    @Override
    public final int e() {
        return this.b;
    }

    @Override
    public final Collection f() {
        return new gxv(this);
    }

    @Override
    public final Iterator g() {
        return new gxc(this);
    }

    final List h(Object object, List list, gxl gxl2) {
        object = list instanceof RandomAccess ? new gxh(this, object, list, gxl2) : new gxn(this, object, list, gxl2);
        return object;
    }

    @Override
    public Map i() {
        return new gxb(this, this.a);
    }

    @Override
    public Set j() {
        return new gxe(this, this.a);
    }

    @Override
    public final void k() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((Collection)iterator.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void l(Map object2) {
        this.a = object2;
        this.b = 0;
        for (Object object2 : object2.values()) {
            fxf.q(object2.isEmpty() ^ true);
            this.b += object2.size();
        }
    }

    @Override
    public void m(Object object, Object object2) {
        Collection collection = (Collection)this.a.get(object);
        if (collection == null) {
            collection = this.a();
            if (collection.add(object2)) {
                ++this.b;
                this.a.put(object, collection);
                return;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (collection.add(object2)) {
            ++this.b;
        }
    }
}

