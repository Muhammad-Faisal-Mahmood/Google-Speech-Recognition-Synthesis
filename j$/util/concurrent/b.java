/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class b
implements Collection,
Serializable {
    private static final long serialVersionUID = 7249069246763182397L;
    final ConcurrentHashMap a;

    b(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public abstract boolean contains(Object var1);

    public final boolean containsAll(Collection collection2) {
        if (collection2 != this) {
            for (Collection collection2 : collection2) {
                if (collection2 != null && this.contains(collection2)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public abstract Iterator iterator();

    @Override
    public abstract boolean remove(Object var1);

    public boolean removeAll(Collection object) {
        object.getClass();
        Object object2 = this.a.a;
        boolean bl2 = false;
        boolean bl3 = false;
        if (object2 == null) {
            return false;
        }
        if (object instanceof Set && object.size() > ((l[])object2).length) {
            object2 = this.iterator();
            while (true) {
                bl2 = bl3;
                if (object2.hasNext()) {
                    if (!object.contains(object2.next())) continue;
                    object2.remove();
                    bl3 = true;
                    continue;
                }
                break;
            }
        } else {
            object = object.iterator();
            bl3 = bl2;
            while (true) {
                bl2 = bl3;
                if (!object.hasNext()) break;
                bl3 |= this.remove(object.next());
            }
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator iterator = this.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Object[] toArray() {
        long l2;
        long l3 = l2 = this.a.j();
        if (l2 < 0L) {
            l3 = 0L;
        }
        if (l3 <= 0x7FFFFFF7L) {
            int n2 = (int)l3;
            Object[] objectArray = new Object[n2];
            Iterator iterator = this.iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                Object[] objectArray2 = objectArray;
                int n4 = n2;
                if (n3 == n2) {
                    n4 = 0x7FFFFFF7;
                    if (n2 < 0x7FFFFFF7) {
                        n2 = n2 >= 0x3FFFFFFB ? n4 : (n2 >>> 1) + 1 + n2;
                        objectArray2 = Arrays.copyOf(objectArray, n2);
                        n4 = n2;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objectArray2[n3] = e2;
                ++n3;
                objectArray = objectArray2;
                n2 = n4;
            }
            if (n3 != n2) {
                objectArray = Arrays.copyOf(objectArray, n3);
            }
            return objectArray;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final Object[] toArray(Object[] objectArray) {
        long l2;
        long l3 = l2 = this.a.j();
        if (l2 < 0L) {
            l3 = 0L;
        }
        if (l3 <= 0x7FFFFFF7L) {
            int n2 = (int)l3;
            Object[] objectArray2 = objectArray.length >= n2 ? objectArray : (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
            n2 = objectArray2.length;
            Iterator iterator = this.iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                Object[] objectArray3 = objectArray2;
                int n4 = n2;
                if (n3 == n2) {
                    n4 = 0x7FFFFFF7;
                    if (n2 < 0x7FFFFFF7) {
                        n2 = n2 >= 0x3FFFFFFB ? n4 : (n2 >>> 1) + 1 + n2;
                        objectArray3 = Arrays.copyOf(objectArray2, n2);
                        n4 = n2;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objectArray3[n3] = e2;
                ++n3;
                objectArray2 = objectArray3;
                n2 = n4;
            }
            if (objectArray == objectArray2 && n3 < n2) {
                objectArray2[n3] = null;
                return objectArray2;
            }
            if (n3 != n2) {
                objectArray2 = Arrays.copyOf(objectArray2, n3);
            }
            return objectArray2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = this.iterator();
        if (iterator.hasNext()) {
            while (true) {
                Object e2;
                Object object = e2 = iterator.next();
                if (e2 == this) {
                    object = "(this Collection)";
                }
                stringBuilder.append(object);
                if (!iterator.hasNext()) break;
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

