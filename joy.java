/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class joy
extends jov {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d;

    public joy() {
        this.d = b;
    }

    public joy(int n2) {
        block4: {
            Object[] objectArray;
            block3: {
                block2: {
                    if (n2 != 0) break block2;
                    objectArray = b;
                    break block3;
                }
                if (n2 <= 0) break block4;
                objectArray = new Object[n2];
            }
            this.d = objectArray;
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Illegal Capacity: "));
    }

    private final int d(int n2) {
        n2 = n2 == 0 ? jns.O(this.d) : --n2;
        return n2;
    }

    private final int e(int n2) {
        if (n2 == jns.O(this.d)) {
            return 0;
        }
        return n2 + 1;
    }

    private final int f(int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + this.d.length;
        }
        return n3;
    }

    private final int g(int n2) {
        int n3 = this.d.length;
        int n4 = n2;
        if (n2 >= n3) {
            n4 = n2 - n3;
        }
        return n4;
    }

    private final void h(int n2, Collection collection) {
        Iterator iterator = collection.iterator();
        int n3 = this.d.length;
        while (n2 < n3 && iterator.hasNext()) {
            this.d[n2] = iterator.next();
            ++n2;
        }
        n3 = this.c;
        for (n2 = 0; n2 < n3 && iterator.hasNext(); ++n2) {
            this.d[n2] = iterator.next();
        }
        this.a += collection.size();
    }

    private final void i(int n2) {
        if (n2 >= 0) {
            Object[] objectArray = this.d;
            int n3 = objectArray.length;
            if (n2 <= n3) {
                return;
            }
            if (objectArray == b) {
                this.d = new Object[jse.k(n2, 10)];
                return;
            }
            Object[] objectArray2 = new Object[jns.ai(n3, n2)];
            jns.X(objectArray, objectArray2, 0, this.c, n3);
            objectArray = this.d;
            n3 = objectArray.length;
            n2 = this.c;
            jns.X(objectArray, objectArray2, n3 - n2, 0, n2);
            this.c = 0;
            this.d = objectArray2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final void j(int n2, int n3) {
        Object[] objectArray = this.d;
        if (n2 < n3) {
            jns.M(objectArray, null, n2, n3);
            return;
        }
        jns.M(objectArray, null, n2, objectArray.length);
        jns.M(this.d, null, 0, n3);
    }

    private final void k() {
        ++this.modCount;
    }

    @Override
    public final int a() {
        return this.a;
    }

    public final void add(int n2, Object object) {
        jns.ag(n2, this.a);
        if (n2 == this.a) {
            this.addLast(object);
            return;
        }
        if (n2 == 0) {
            this.addFirst(object);
            return;
        }
        this.k();
        this.i(this.a + 1);
        int n3 = this.g(this.c + n2);
        int n4 = this.a;
        if (n2 < n4 + 1 >> 1) {
            n2 = this.d(n3);
            n4 = this.d(this.c);
            n3 = this.c;
            if (n2 >= n3) {
                Object[] objectArray = this.d;
                objectArray[n4] = objectArray[n3];
                jns.X(objectArray, objectArray, n3, n3 + 1, n2 + 1);
            } else {
                Object[] objectArray = this.d;
                jns.X(objectArray, objectArray, n3 - 1, n3, objectArray.length);
                objectArray = this.d;
                objectArray[objectArray.length - 1] = objectArray[0];
                jns.X(objectArray, objectArray, 0, 1, n2 + 1);
            }
            this.d[n2] = object;
            this.c = n4;
        } else {
            n2 = this.g(this.c + n4);
            if (n3 < n2) {
                Object[] objectArray = this.d;
                jns.X(objectArray, objectArray, n3 + 1, n3, n2);
            } else {
                Object[] objectArray = this.d;
                jns.X(objectArray, objectArray, 1, 0, n2);
                objectArray = this.d;
                n2 = objectArray.length - 1;
                objectArray[0] = objectArray[n2];
                jns.X(objectArray, objectArray, n3 + 1, n3, n2);
            }
            this.d[n3] = object;
        }
        ++this.a;
    }

    @Override
    public final boolean add(Object object) {
        this.addLast(object);
        return true;
    }

    public final boolean addAll(int n2, Collection collection) {
        jse.e(collection, "elements");
        jns.ag(n2, this.a);
        if (!collection.isEmpty()) {
            if (n2 == this.a) {
                return this.addAll(collection);
            }
            this.k();
            this.i(this.a + collection.size());
            int n3 = this.g(this.c + this.a);
            int n4 = this.g(this.c + n2);
            int n5 = collection.size();
            if (n2 < this.a + 1 >> 1) {
                n3 = this.c;
                n2 = n3 - n5;
                if (n4 >= n3) {
                    if (n2 >= 0) {
                        Object[] objectArray = this.d;
                        jns.X(objectArray, objectArray, n2, n3, n4);
                    } else {
                        Object[] objectArray = this.d;
                        int n6 = objectArray.length;
                        if ((n6 -= (n2 += n6)) >= n4 - n3) {
                            jns.X(objectArray, objectArray, n2, n3, n4);
                        } else {
                            jns.X(objectArray, objectArray, n2, n3, n3 + n6);
                            objectArray = this.d;
                            jns.X(objectArray, objectArray, 0, this.c + n6, n4);
                        }
                    }
                } else {
                    Object[] objectArray = this.d;
                    jns.X(objectArray, objectArray, n2, n3, objectArray.length);
                    if (n5 >= n4) {
                        objectArray = this.d;
                        jns.X(objectArray, objectArray, objectArray.length - n5, 0, n4);
                    } else {
                        objectArray = this.d;
                        jns.X(objectArray, objectArray, objectArray.length - n5, 0, n5);
                        objectArray = this.d;
                        jns.X(objectArray, objectArray, 0, n5, n4);
                    }
                }
                this.c = n2;
                this.h(this.f(n4 - n5), collection);
            } else {
                n2 = n4 + n5;
                if (n4 < n3) {
                    Object[] objectArray = this.d;
                    int n7 = objectArray.length;
                    if ((n5 += n3) <= n7) {
                        jns.X(objectArray, objectArray, n2, n4, n3);
                    } else if (n2 >= n7) {
                        jns.X(objectArray, objectArray, n2 - n7, n4, n3);
                    } else {
                        n5 = n3 - (n5 - n7);
                        jns.X(objectArray, objectArray, 0, n5, n3);
                        objectArray = this.d;
                        jns.X(objectArray, objectArray, n2, n4, n5);
                    }
                } else {
                    Object[] objectArray = this.d;
                    jns.X(objectArray, objectArray, n5, 0, n3);
                    objectArray = this.d;
                    n3 = objectArray.length;
                    if (n2 >= n3) {
                        jns.X(objectArray, objectArray, n2 - n3, n4, n3);
                    } else {
                        jns.X(objectArray, objectArray, 0, n3 - n5, n3);
                        objectArray = this.d;
                        jns.X(objectArray, objectArray, n2, n4, objectArray.length - n5);
                    }
                }
                this.h(n4, collection);
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.k();
        this.i(this.a + collection.size());
        this.h(this.g(this.c + this.a), collection);
        return true;
    }

    @Override
    public final void addFirst(Object object) {
        int n2;
        this.k();
        this.i(this.a + 1);
        this.c = n2 = this.d(this.c);
        this.d[n2] = object;
        ++this.a;
    }

    @Override
    public final void addLast(Object object) {
        this.k();
        this.i(this.a + 1);
        this.d[this.g((int)(this.c + this.a))] = object;
        ++this.a;
    }

    @Override
    public final Object b(int n2) {
        jns.af(n2, this.a);
        if (n2 == jns.e(this)) {
            return this.removeLast();
        }
        if (n2 == 0) {
            return this.removeFirst();
        }
        this.k();
        int n3 = this.g(this.c + n2);
        Object[] objectArray = this.d;
        Object object = objectArray[n3];
        if (n2 < this.a >> 1) {
            n2 = this.c;
            if (n3 >= n2) {
                jns.X(objectArray, objectArray, n2 + 1, n2, n3);
            } else {
                jns.X(objectArray, objectArray, 1, 0, n3);
                objectArray = this.d;
                n3 = objectArray.length - 1;
                objectArray[0] = objectArray[n3];
                n2 = this.c;
                jns.X(objectArray, objectArray, n2 + 1, n2, n3);
            }
            objectArray = this.d;
            n2 = this.c;
            objectArray[n2] = null;
            this.c = this.e(n2);
        } else {
            n2 = this.g(this.c + jns.e(this));
            if (n3 <= n2) {
                objectArray = this.d;
                jns.X(objectArray, objectArray, n3, n3 + 1, n2 + 1);
            } else {
                objectArray = this.d;
                jns.X(objectArray, objectArray, n3, n3 + 1, objectArray.length);
                objectArray = this.d;
                objectArray[objectArray.length - 1] = objectArray[0];
                jns.X(objectArray, objectArray, 0, 1, n2 + 1);
            }
            this.d[n2] = null;
        }
        --this.a;
        return object;
    }

    public final Object c() {
        if (this.isEmpty()) {
            return null;
        }
        return this.removeFirst();
    }

    @Override
    public final void clear() {
        if (!this.isEmpty()) {
            this.k();
            int n2 = this.g(this.c + this.a);
            this.j(this.c, n2);
        }
        this.c = 0;
        this.a = 0;
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final Object get(int n2) {
        jns.af(n2, this.a);
        return this.d[this.g(this.c + n2)];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int indexOf(Object object) {
        int n2;
        int n3 = this.c;
        int n4 = this.g(this.c + this.a);
        if (n3 >= n4) {
            if (n3 < n4) return -1;
            int n5 = this.d.length;
            for (n2 = n3; n2 < n5; ++n2) {
                n3 = n2;
                if (!jse.i(object, this.d[n2])) {
                    continue;
                }
                break block8;
            }
        } else {
            block8: {
                while (n3 < n4) {
                    if (!jse.i(object, this.d[n3])) {
                        ++n3;
                        continue;
                    }
                    break block8;
                }
                return -1;
            }
            n2 = this.c;
            return n3 - n2;
        }
        n3 = 0;
        while (n3 < n4) {
            if (jse.i(object, this.d[n3])) {
                n2 = this.c;
                return (n3 += this.d.length) - n2;
            }
            ++n3;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.a == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int lastIndexOf(Object object) {
        int n2 = this.c;
        int n3 = this.g(this.c + this.a);
        if (n2 < n3) {
            if (n2 > --n3) return -1;
            while (!jse.i(object, this.d[n3])) {
                if (n3 == n2) return -1;
                --n3;
            }
        } else {
            if (n2 <= n3) return -1;
            --n3;
            while (n3 >= 0) {
                if (jse.i(object, this.d[n3])) {
                    n3 += this.d.length;
                    n2 = this.c;
                    return n3 - n2;
                }
                --n3;
            }
            int n4 = this.c;
            n2 = jns.O(this.d);
            if (n4 > n2) return -1;
            while (true) {
                n3 = --n2;
                if (jse.i(object, this.d[n2])) break;
                if (n2 == n4) return -1;
            }
        }
        n2 = this.c;
        return n3 - n2;
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        ((jov)this).b(n2);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        jse.e(collection, "elements");
        boolean bl2 = this.isEmpty();
        int n2 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = bl3;
        if (!bl2) {
            if (this.d.length == 0) {
                bl5 = bl3;
            } else {
                int n3 = this.c;
                int n4 = this.g(this.c + this.a);
                if (n3 < n4) {
                    int n5 = n3;
                    bl5 = bl4;
                    while (n3 < n4) {
                        Object object = this.d[n3];
                        if (!collection.contains(object)) {
                            this.d[n5] = object;
                            ++n5;
                        } else {
                            bl5 = true;
                        }
                        ++n3;
                    }
                    jns.M(this.d, null, n5, n4);
                    n3 = n5;
                } else {
                    Object[] objectArray;
                    Object object;
                    int n6 = this.d.length;
                    bl5 = false;
                    int n7 = n3;
                    while (n3 < n6) {
                        object = this.d;
                        objectArray = object[n3];
                        object[n3] = null;
                        if (!collection.contains(objectArray)) {
                            this.d[n7] = objectArray;
                            ++n7;
                        } else {
                            bl5 = true;
                        }
                        ++n3;
                    }
                    n3 = this.g(n7);
                    for (n7 = n2; n7 < n4; ++n7) {
                        objectArray = this.d;
                        object = objectArray[n7];
                        objectArray[n7] = null;
                        if (!collection.contains(object)) {
                            this.d[n3] = object;
                            n3 = this.e(n3);
                            continue;
                        }
                        bl5 = true;
                    }
                }
                if (bl5) {
                    this.k();
                    this.a = this.f(n3 - this.c);
                    return true;
                }
            }
        }
        return bl5;
    }

    @Override
    public final Object removeFirst() {
        if (!this.isEmpty()) {
            this.k();
            Object[] objectArray = this.d;
            int n2 = this.c;
            Object object = objectArray[n2];
            objectArray[n2] = null;
            this.c = this.e(n2);
            --this.a;
            return object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final Object removeLast() {
        if (!this.isEmpty()) {
            this.k();
            int n2 = this.g(this.c + jns.e(this));
            Object[] objectArray = this.d;
            Object object = objectArray[n2];
            objectArray[n2] = null;
            --this.a;
            return object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        jns.ah(n2, n3, this.a);
        int n4 = n3 - n2;
        if (n4 != 0) {
            if (n4 == this.a) {
                this.clear();
                return;
            }
            if (n4 == 1) {
                ((jov)this).b(n2);
                return;
            }
            this.k();
            if (n2 < this.a - n3) {
                int n5 = this.g(this.c + (n2 - 1));
                int n6 = this.g(this.c + (n3 - 1));
                n3 = n5;
                while (n2 > 0) {
                    int n7 = n3 + 1;
                    n5 = Math.min(n2, Math.min(n7, n6 + 1));
                    Object[] objectArray = this.d;
                    jns.X(objectArray, objectArray, (n6 -= n5) + 1, (n3 -= n5) + 1, n7);
                    n3 = this.f(n3);
                    n6 = this.f(n6);
                    n2 -= n5;
                }
                n2 = this.g(this.c + n4);
                this.j(this.c, n2);
                this.c = n2;
            } else {
                int n8 = this.g(this.c + n3);
                n2 = this.g(this.c + n2);
                int n9 = this.a;
                int n10 = n3;
                n3 = n8;
                while ((n9 -= n10) > 0) {
                    n10 = this.d.length;
                    n10 = Math.min(n9, Math.min(n10 - n3, n10 - n2));
                    Object[] objectArray = this.d;
                    n8 = n3 + n10;
                    jns.X(objectArray, objectArray, n2, n3, n8);
                    n3 = this.g(n8);
                    n2 = this.g(n2 + n10);
                }
                n2 = this.g(this.c + this.a);
                this.j(this.f(n2 - n4), n2);
            }
            this.a -= n4;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        boolean bl2 = this.isEmpty();
        int n2 = 0;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = bl3;
        if (!bl2) {
            if (this.d.length == 0) {
                bl5 = bl3;
            } else {
                int n3 = this.c;
                int n4 = this.g(this.c + this.a);
                if (n3 < n4) {
                    int n5 = n3;
                    bl5 = bl4;
                    while (n3 < n4) {
                        Object object = this.d[n3];
                        if (collection.contains(object)) {
                            this.d[n5] = object;
                            ++n5;
                        } else {
                            bl5 = true;
                        }
                        ++n3;
                    }
                    jns.M(this.d, null, n5, n4);
                    n3 = n5;
                } else {
                    Object object;
                    Object[] objectArray;
                    int n6 = this.d.length;
                    bl5 = false;
                    int n7 = n3;
                    while (n3 < n6) {
                        objectArray = this.d;
                        object = objectArray[n3];
                        objectArray[n3] = null;
                        if (collection.contains(object)) {
                            this.d[n7] = object;
                            ++n7;
                        } else {
                            bl5 = true;
                        }
                        ++n3;
                    }
                    n3 = this.g(n7);
                    for (n7 = n2; n7 < n4; ++n7) {
                        objectArray = this.d;
                        object = objectArray[n7];
                        objectArray[n7] = null;
                        if (collection.contains(object)) {
                            this.d[n3] = object;
                            n3 = this.e(n3);
                            continue;
                        }
                        bl5 = true;
                    }
                }
                if (bl5) {
                    this.k();
                    this.a = this.f(n3 - this.c);
                    return true;
                }
            }
        }
        return bl5;
    }

    public final Object set(int n2, Object object) {
        jns.af(n2, this.a);
        n2 = this.g(this.c + n2);
        Object[] objectArray = this.d;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(new Object[this.a]);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        int n2 = objectArray.length;
        int n3 = this.a;
        Object[] objectArray2 = objectArray;
        if (n2 < n3) {
            jse.e(objectArray, "reference");
            objectArray = Array.newInstance(objectArray.getClass().getComponentType(), n3);
            jse.c(objectArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objectArray2 = objectArray;
        }
        if ((n3 = this.c) < (n2 = this.g(this.c + this.a))) {
            jns.aa(this.d, objectArray2, n3, n2, 2);
        } else if (!this.isEmpty()) {
            objectArray = this.d;
            jns.X(objectArray, objectArray2, 0, n3, objectArray.length);
            objectArray = this.d;
            jns.X(objectArray, objectArray2, objectArray.length - this.c, 0, n2);
        }
        jns.F(this.a, objectArray2);
        return objectArray2;
    }
}

