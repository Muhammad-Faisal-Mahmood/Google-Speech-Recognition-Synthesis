/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class gxx
extends AbstractCollection
implements hch {
    private transient Set a;
    private transient Set b;

    public final boolean add(Object object) {
        this.h(object, 1);
        return true;
    }

    public final boolean addAll(Collection object2) {
        block11: {
            boolean bl2;
            block9: {
                block7: {
                    block10: {
                        block8: {
                            fxf.K(object2);
                            boolean bl3 = object2 instanceof hch;
                            bl2 = false;
                            if (!bl3) break block7;
                            if (!((object2 = (hch)object2) instanceof gxt)) break block8;
                            if (((gxx)(object2 = (gxt)object2)).isEmpty()) break block9;
                            int n2 = ((gxt)object2).a.a();
                            while (n2 >= 0) {
                                this.h(((gxt)object2).a.h(n2), ((gxt)object2).a.c(n2));
                                n2 = ((gxt)object2).a.e(n2);
                            }
                            break block10;
                        }
                        if (!object2.isEmpty()) {
                            for (Object object2 : object2.j()) {
                                this.h(((hci)object2).a, ((hci)object2).a());
                            }
                        }
                        break block9;
                    }
                    bl2 = true;
                    break block9;
                }
                if (!object2.isEmpty()) break block11;
            }
            return bl2;
        }
        return fvd.J(this, object2.iterator());
    }

    public abstract int b();

    @Override
    public int c(Object object, int n2) {
        throw null;
    }

    @Override
    public final boolean contains(Object object) {
        return this.a(object) > 0;
    }

    public abstract Iterator d();

    public abstract Iterator e();

    @Override
    public final boolean equals(Object object) {
        return fvd.o(this, object);
    }

    @Override
    public boolean g(Object object, int n2) {
        throw null;
    }

    @Override
    public void h(Object object, int n2) {
        throw null;
    }

    @Override
    public final int hashCode() {
        return this.j().hashCode();
    }

    @Override
    public final Set i() {
        Set set;
        Set set2 = set = this.a;
        if (set == null) {
            this.a = set2 = new hcj(this);
        }
        return set2;
    }

    @Override
    public final boolean isEmpty() {
        return this.j().isEmpty();
    }

    @Override
    public final Set j() {
        Set set;
        Set set2 = set = this.b;
        if (set == null) {
            this.b = set2 = new hck(this);
        }
        return set2;
    }

    @Override
    public final boolean remove(Object object) {
        return this.c(object, 1) > 0;
    }

    public final boolean removeAll(Collection collection) {
        Collection collection2 = collection;
        if (collection instanceof hch) {
            collection2 = ((hch)collection).i();
        }
        return this.i().removeAll(collection2);
    }

    public final boolean retainAll(Collection collection) {
        fxf.K(collection);
        Collection collection2 = collection;
        if (collection instanceof hch) {
            collection2 = ((hch)collection).i();
        }
        return this.i().retainAll(collection2);
    }

    @Override
    public final String toString() {
        return this.j().toString();
    }
}

