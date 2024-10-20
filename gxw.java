/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class gxw
implements hce {
    private transient Set a;
    private transient Collection b;
    private transient Map c;

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (object != this) break block2;
                    bl2 = true;
                    break block3;
                }
                if (object instanceof hce) break block4;
                bl2 = false;
            }
            return bl2;
        }
        object = (hce)object;
        return this.o().equals(object.o());
    }

    public abstract Collection f();

    public Iterator g() {
        throw null;
    }

    public final int hashCode() {
        return this.o().hashCode();
    }

    public abstract Map i();

    public abstract Set j();

    @Override
    public void m(Object object, Object object2) {
        throw null;
    }

    @Override
    public final Collection n() {
        Collection collection;
        Collection collection2 = collection = this.b;
        if (collection == null) {
            this.b = collection2 = this.f();
        }
        return collection2;
    }

    @Override
    public final Map o() {
        Map map;
        Map map2 = map = this.c;
        if (map == null) {
            this.c = map2 = this.i();
        }
        return map2;
    }

    @Override
    public final Set p() {
        Set set;
        Set set2 = set = this.a;
        if (set == null) {
            this.a = set2 = this.j();
        }
        return set2;
    }

    public final String toString() {
        return this.o().toString();
    }
}

