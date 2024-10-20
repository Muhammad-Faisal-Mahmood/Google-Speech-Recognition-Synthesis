/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class ov
implements Collection,
Set,
jsn {
    public int[] a = pd.a;
    public Object[] b = pd.b;
    public int c;

    public ov() {
        this(0);
    }

    public ov(int n2) {
        if (n2 > 0) {
            ki.f(this, n2);
        }
    }

    public final int a(Object object) {
        int n2 = object == null ? ki.e(this) : ki.d(this, object, object.hashCode());
        return n2;
    }

    @Override
    public final boolean add(Object object) {
        block15: {
            boolean bl2;
            block14: {
                Object[] objectArray;
                int n2;
                int n3;
                int n4 = this.c;
                bl2 = false;
                if (object == null) {
                    n3 = ki.e(this);
                    n2 = 0;
                } else {
                    n2 = object.hashCode();
                    n3 = ki.d(this, object, n2);
                }
                if (n3 >= 0) break block14;
                int n5 = ~n3;
                int[] nArray = this.a;
                int n6 = nArray.length;
                if (n4 >= n6) {
                    n3 = 8;
                    if (n4 >= 8) {
                        n3 = (n4 >> 1) + n4;
                    } else if (n4 < 4) {
                        n3 = 4;
                    }
                    Object[] objectArray2 = this.b;
                    ki.f(this, n3);
                    if (n4 == this.c) {
                        objectArray = this.a;
                        if (objectArray.length != 0) {
                            jns.Z(nArray, objectArray, n6);
                            jns.aa(objectArray2, this.b, 0, objectArray2.length, 6);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
                if (n5 < n4) {
                    objectArray = this.a;
                    n3 = n5 + 1;
                    jns.W(objectArray, objectArray, n3, n5, n4);
                    objectArray = this.b;
                    jns.X(objectArray, objectArray, n3, n5, n4);
                }
                if (n4 != (n3 = this.c) || n5 >= (objectArray = this.a).length) break block15;
                objectArray[n5] = n2;
                this.b[n5] = object;
                this.c = n3 + 1;
                bl2 = true;
            }
            return bl2;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection object) {
        jse.e(object, "elements");
        int n2 = this.c + object.size();
        int n3 = this.c;
        int[] nArray = this.a;
        int n4 = nArray.length;
        boolean bl2 = false;
        if (n4 < n2) {
            Object[] objectArray = this.b;
            ki.f(this, n2);
            n2 = this.c;
            if (n2 > 0) {
                jns.Z(nArray, this.a, n2);
                jns.aa(objectArray, this.b, 0, this.c, 6);
            }
        }
        if (this.c == n3) {
            object = object.iterator();
            while (object.hasNext()) {
                bl2 |= this.add(object.next());
            }
            return bl2;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int n2) {
        return this.b[n2];
    }

    public final void c(int n2) {
        int n3 = this.c;
        Object[] objectArray = this.b;
        Object object = objectArray[n2];
        if (n3 <= 1) {
            this.clear();
            return;
        }
        int n4 = n3 - 1;
        int[] nArray = this.a;
        int n5 = nArray.length;
        int n6 = 8;
        if (n5 > 8 && n3 < n5 / 3) {
            if (n3 > 8) {
                n6 = n3 + (n3 >> 1);
            }
            ki.f(this, n6);
            if (n2 > 0) {
                jns.Z(nArray, this.a, n2);
                jns.aa(objectArray, this.b, 0, n2, 6);
            }
            if (n2 < n4) {
                object = this.a;
                n6 = n2 + 1;
                jns.W(nArray, (int[])object, n2, n6, n3);
                jns.X(objectArray, this.b, n2, n6, n3);
            }
        } else {
            if (n2 < n4) {
                n6 = n2 + 1;
                jns.W(nArray, nArray, n2, n6, n3);
                objectArray = this.b;
                jns.X(objectArray, objectArray, n2, n6, n3);
            }
            this.b[n4] = null;
        }
        if (n3 == this.c) {
            this.c = n4;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final void clear() {
        if (this.c != 0) {
            this.a = pd.a;
            this.b = pd.b;
            this.c = 0;
        }
    }

    @Override
    public final boolean contains(Object object) {
        return this.a(object) >= 0;
    }

    @Override
    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            jse.e(object, "elements");
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (!(object instanceof Set)) return false;
        if (this.c != ((Set)object).size()) return false;
        try {
            int n2 = this.c;
            int n3 = 0;
            while (true) {
                boolean bl3 = bl2;
                if (n3 >= n2) return bl3;
                Object object2 = this.b(n3);
                bl3 = ((Set)object).contains(object2);
                if (!bl3) return false;
                ++n3;
            }
        }
        catch (ClassCastException | NullPointerException runtimeException) {}
        return false;
    }

    @Override
    public final int hashCode() {
        int[] nArray = this.a;
        int n2 = this.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += nArray[i2];
        }
        return n3;
    }

    @Override
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override
    public final Iterator iterator() {
        return new ou(this);
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            this.c(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection object) {
        jse.e(object, "elements");
        object = object.iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            bl2 |= this.remove(object.next());
        }
        return bl2;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        boolean bl2 = false;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (jns.y(collection, this.b[i2])) continue;
            this.c(i2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray() {
        return jns.N(this.b, 0, this.c);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        jse.e(objectArray, "array");
        int n2 = this.c;
        int n3 = objectArray.length;
        if (n3 < n2) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        } else {
            objectArray2 = objectArray;
            if (n3 > n2) {
                objectArray[n2] = null;
                objectArray2 = objectArray;
            }
        }
        jns.X(this.b, objectArray2, 0, 0, this.c);
        jse.b(objectArray2);
        return objectArray2;
    }

    public final String toString() {
        Object object;
        if (this.isEmpty()) {
            object = "{}";
        } else {
            StringBuilder stringBuilder = new StringBuilder(this.c * 14);
            stringBuilder.append('{');
            int n2 = this.c;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(", ");
                }
                if ((object = this.b(i2)) != this) {
                    stringBuilder.append(object);
                    continue;
                }
                stringBuilder.append("(this Set)");
            }
            stringBuilder.append('}');
            object = stringBuilder.toString();
        }
        return object;
    }
}

