/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

final class or
implements Collection {
    final ot a;

    public or(ot ot2) {
        this.a = ot2;
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.b(object) >= 0;
    }

    public final boolean containsAll(Collection object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new os(this.a);
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.a.b(object);
        if (n2 >= 0) {
            this.a.e(n2);
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        int n2 = this.a.f;
        int n3 = 0;
        boolean bl2 = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (collection.contains(this.a.g(n3))) {
                this.a.e(n3);
                n4 = n2 - 1;
                n5 = n3 - 1;
                bl2 = true;
            }
            n3 = n5 + 1;
            n2 = n4;
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        int n2 = this.a.f;
        int n3 = 0;
        boolean bl2 = false;
        while (n3 < n2) {
            int n4 = n2;
            int n5 = n3;
            if (!collection.contains(this.a.g(n3))) {
                this.a.e(n3);
                n4 = n2 - 1;
                n5 = n3 - 1;
                bl2 = true;
            }
            n3 = n5 + 1;
            n2 = n4;
        }
        return bl2;
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
            objectArray[i2] = this.a.g(i2);
        }
        return objectArray;
    }

    public final Object[] toArray(Object[] objectArray) {
        int n2 = this.size();
        Object[] objectArray2 = objectArray;
        if (objectArray.length < n2) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray2[i2] = this.a.g(i2);
        }
        if (objectArray2.length > n2) {
            objectArray2[n2] = null;
        }
        return objectArray2;
    }
}

