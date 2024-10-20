/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class gxl
extends AbstractCollection {
    final Object a;
    Collection b;
    final gxl c;
    final Collection d;
    final gxp e;

    public gxl(gxp object, Object object2, Collection collection, gxl gxl2) {
        this.e = object;
        this.a = object2;
        this.b = collection;
        this.c = gxl2;
        object = gxl2 == null ? null : gxl2.b;
        this.d = object;
    }

    final void a() {
        Object object = this.c;
        if (object != null) {
            ((gxl)object).a();
            return;
        }
        gxp gxp2 = this.e;
        object = this.a;
        gxp2.a.put(object, this.b);
    }

    @Override
    public final boolean add(Object object) {
        this.b();
        boolean bl2 = this.b.isEmpty();
        boolean bl3 = this.b.add(object);
        if (bl3) {
            object = this.e;
            ++((gxp)object).b;
            if (bl2) {
                this.a();
                return true;
            }
        }
        return bl3;
    }

    @Override
    public final boolean addAll(Collection object) {
        boolean bl2;
        if (object.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl3 = bl2 = this.b.addAll(object);
        if (bl2) {
            int n3 = this.b.size();
            object = this.e;
            ((gxp)object).b += n3 - n2;
            bl3 = bl2;
            if (n2 == 0) {
                this.a();
                bl3 = true;
            }
        }
        return bl3;
    }

    final void b() {
        Object object = this.c;
        if (object != null) {
            ((gxl)object).b();
            object = this.c;
            Collection collection = this.d;
            if (((gxl)object).b != collection) {
                throw new ConcurrentModificationException();
            }
        } else if (this.b.isEmpty()) {
            object = this.e;
            Object object2 = this.a;
            object = (Collection)((gxp)object).a.get(object2);
            if (object != null) {
                this.b = object;
            }
        }
    }

    final void c() {
        Object object = this.c;
        if (object != null) {
            ((gxl)object).c();
            return;
        }
        if (this.b.isEmpty()) {
            object = this.e;
            Object object2 = this.a;
            ((gxp)object).a.remove(object2);
        }
    }

    @Override
    public final void clear() {
        int n2 = this.size();
        if (n2 == 0) {
            return;
        }
        this.b.clear();
        gxp gxp2 = this.e;
        gxp2.b -= n2;
        this.c();
    }

    @Override
    public final boolean contains(Object object) {
        this.b();
        return this.b.contains(object);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        this.b();
        return this.b.containsAll(collection);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        this.b();
        return this.b.equals(object);
    }

    @Override
    public final int hashCode() {
        this.b();
        return this.b.hashCode();
    }

    @Override
    public final Iterator iterator() {
        this.b();
        return new gxk(this);
    }

    @Override
    public final boolean remove(Object object) {
        this.b();
        boolean bl2 = this.b.remove(object);
        if (bl2) {
            object = this.e;
            --((gxp)object).b;
            this.c();
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection object) {
        if (object.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = this.b.removeAll((Collection<?>)object);
        if (bl2) {
            int n3 = this.b.size();
            object = this.e;
            ((gxp)object).b += n3 - n2;
            this.c();
        }
        return bl2;
    }

    @Override
    public final boolean retainAll(Collection object) {
        fxf.K(object);
        int n2 = this.size();
        boolean bl2 = this.b.retainAll((Collection<?>)object);
        if (bl2) {
            int n3 = this.b.size();
            object = this.e;
            ((gxp)object).b += n3 - n2;
            this.c();
        }
        return bl2;
    }

    @Override
    public final int size() {
        this.b();
        return this.b.size();
    }

    @Override
    public final String toString() {
        this.b();
        return this.b.toString();
    }
}

