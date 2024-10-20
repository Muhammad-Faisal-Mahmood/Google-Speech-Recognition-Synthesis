/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

class gyf
extends AbstractCollection {
    public final Collection a;
    public final gtq b;

    public gyf(Collection collection, gtq gtq2) {
        this.a = collection;
        this.b = gtq2;
    }

    @Override
    public final boolean add(Object object) {
        fxf.q(this.b.a(object));
        return this.a.add(object);
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object e2 : collection) {
            fxf.q(this.b.a(e2));
        }
        return this.a.addAll(collection);
    }

    @Override
    public final void clear() {
        gtq gtq2 = this.b;
        Object object = this.a;
        if (object instanceof RandomAccess && object instanceof List) {
            object = (List)object;
            fxf.K(gtq2);
            fvd.S((List)object, gtq2);
            return;
        }
        object = object.iterator();
        fxf.K(gtq2);
        while (object.hasNext()) {
            if (!gtq2.a(object.next())) continue;
            object.remove();
        }
    }

    @Override
    public final boolean contains(Object object) {
        if (fvd.ai(this.a, object)) {
            return this.b.a(object);
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            object = object.iterator();
            while (object.hasNext()) {
                if (this.contains(object.next())) continue;
                bl2 = false;
                break block1;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final boolean isEmpty() {
        return fvd.B(this.a.iterator(), this.b) == -1;
    }

    @Override
    public final Iterator iterator() {
        return fvd.C(this.a.iterator(), this.b);
    }

    @Override
    public final boolean remove(Object object) {
        return this.contains(object) && this.a.remove(object);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator iterator = this.a.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!this.b.a(e2) || !collection.contains(e2)) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator iterator = this.a.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!this.b.a(e2) || collection.contains(e2)) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final int size() {
        Iterator iterator = this.a.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!this.b.a(e2)) continue;
            ++n2;
        }
        return n2;
    }

    @Override
    public final Object[] toArray() {
        return fvd.u(this.iterator()).toArray();
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        return fvd.u(this.iterator()).toArray(objectArray);
    }
}

