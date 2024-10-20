/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class op
implements Set {
    final ot a;

    public op(ot ot2) {
        this.a = ot2;
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            object = object.iterator();
            while (object.hasNext()) {
                if (this.a.containsKey(object.next())) continue;
                bl2 = false;
                break block1;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) return bl2;
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (this.size() != object.size()) return false;
            bl2 = this.containsAll((Collection<?>)object);
            if (bl2) return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        for (int i2 = this.a.f - 1; i2 >= 0; --i2) {
            Object object = this.a.d(i2);
            int n3 = object == null ? 0 : object.hashCode();
            n2 += n3;
        }
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new oo(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.a.c(object);
        if (n2 >= 0) {
            this.a.e(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection object) {
        ot ot2 = this.a;
        int n2 = ot2.f;
        object = object.iterator();
        while (object.hasNext()) {
            ot2.remove(object.next());
        }
        return n2 != ot2.f;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        return this.a.a(collection);
    }

    @Override
    public final int size() {
        return this.a.f;
    }

    @Override
    public final Object[] toArray() {
        int n2 = this.a.f;
        Object[] objectArray = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = this.a.d(i2);
        }
        return objectArray;
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        int n2 = this.size();
        Object[] objectArray2 = objectArray;
        if (objectArray.length < n2) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray2[i2] = this.a.d(i2);
        }
        if (objectArray2.length > n2) {
            objectArray2[n2] = null;
        }
        return objectArray2;
    }
}

