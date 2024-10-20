/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class jpk
extends jov
implements List,
RandomAccess,
Serializable,
jsn {
    public static final jpk a;
    public Object[] b;
    public int c;
    public boolean d;

    static {
        jpk jpk2 = new jpk(0);
        jpk2.d = true;
        a = jpk2;
    }

    public jpk() {
        this(null);
    }

    public jpk(int n2) {
        this.b = new Object[n2];
    }

    public /* synthetic */ jpk(byte[] byArray) {
        this(10);
    }

    public static final /* synthetic */ int c(jpk jpk2) {
        return jpk2.modCount;
    }

    private final void j(int n2, int n3) {
        int n4 = this.c + n3;
        if (n4 >= 0) {
            Object[] objectArray = this.b;
            int n5 = objectArray.length;
            if (n4 > n5) {
                this.b = jjj.B(objectArray, jns.ai(n5, n4));
            }
            objectArray = this.b;
            jns.X(objectArray, objectArray, n2 + n3, n2, this.c);
            this.c += n3;
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void k() {
        ++this.modCount;
    }

    private final Object writeReplace() {
        if (this.d) {
            return new jps(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final void add(int n2, Object object) {
        this.h();
        jns.ag(n2, this.c);
        this.g(n2, object);
    }

    @Override
    public final boolean add(Object object) {
        this.h();
        this.g(this.c, object);
        return true;
    }

    public final boolean addAll(int n2, Collection collection) {
        jse.e(collection, "elements");
        this.h();
        jns.ag(n2, this.c);
        int n3 = collection.size();
        this.f(n2, collection, n3);
        return n3 > 0;
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        this.h();
        int n2 = collection.size();
        this.f(this.c, collection, n2);
        return n2 > 0;
    }

    @Override
    public final Object b(int n2) {
        this.h();
        jns.af(n2, this.c);
        return this.e(n2);
    }

    @Override
    public final void clear() {
        this.h();
        this.i(0, this.c);
    }

    public final int d(int n2, int n3, Collection objectArray, boolean bl2) {
        int n4;
        int n5 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object[] objectArray2 = this.b;
            int n6 = i2 + n2;
            n4 = n5;
            if (objectArray.contains(objectArray2[n6]) == bl2) {
                objectArray2 = this.b;
                objectArray2[n2 + n5] = objectArray2[n6];
                n4 = n5 + 1;
            }
            n5 = n4;
        }
        n4 = n3 - n5;
        objectArray = this.b;
        jns.X(objectArray, objectArray, n2 + n5, n2 + n3, this.c);
        objectArray = this.b;
        n2 = this.c;
        jjj.z(objectArray, n2 - n4, n2);
        if (n4 > 0) {
            this.k();
        }
        this.c -= n4;
        return n4;
    }

    public final Object e(int n2) {
        this.k();
        Object[] objectArray = this.b;
        Object object = objectArray[n2];
        jns.X(objectArray, objectArray, n2, n2 + 1, this.c);
        jjj.y(this.b, this.c - 1);
        --this.c;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof List)) return false;
        if (!jjj.A(this.b, 0, this.c, (List)(object = (List)object))) return false;
        return bl2;
    }

    public final void f(int n2, Collection object, int n3) {
        this.k();
        this.j(n2, n3);
        object = object.iterator();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b[n2 + i2] = object.next();
        }
    }

    public final void g(int n2, Object object) {
        this.k();
        this.j(n2, 1);
        this.b[n2] = object;
    }

    public final Object get(int n2) {
        jns.af(n2, this.c);
        return this.b[n2];
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final int hashCode() {
        return jjj.w(this.b, 0, this.c);
    }

    public final void i(int n2, int n3) {
        if (n3 > 0) {
            this.k();
        }
        Object[] objectArray = this.b;
        jns.X(objectArray, objectArray, n2, n2 + n3, this.c);
        objectArray = this.b;
        n2 = this.c;
        jjj.z(objectArray, n2 - n3, n2);
        this.c -= n3;
    }

    @Override
    public final int indexOf(Object object) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (!jse.i(this.b[i2], object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object object) {
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (!jse.i(this.b[i2], object)) continue;
            return i2;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n2) {
        jns.ag(n2, this.c);
        return new jpj(this, n2, 0);
    }

    @Override
    public final boolean remove(Object object) {
        this.h();
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            ((jov)this).b(n2);
        }
        return n2 >= 0;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        jse.e(collection, "elements");
        this.h();
        return this.d(0, this.c, collection, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        this.h();
        return this.d(0, this.c, collection, true) > 0;
    }

    public final Object set(int n2, Object object) {
        this.h();
        jns.af(n2, this.c);
        Object[] objectArray = this.b;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public final List subList(int n2, int n3) {
        jns.ah(n2, n3, this.c);
        return new jpi(this.b, n2, n3 - n2, null, this);
    }

    @Override
    public final Object[] toArray() {
        return jns.N(this.b, 0, this.c);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        int n2 = objectArray.length;
        int n3 = this.c;
        if (n2 < n3) {
            objectArray = Arrays.copyOfRange(this.b, 0, n3, objectArray.getClass());
            jse.d(objectArray, "copyOfRange(...)");
            return objectArray;
        }
        jns.X(this.b, objectArray, 0, 0, n3);
        jns.F(this.c, objectArray);
        return objectArray;
    }

    @Override
    public final String toString() {
        return jjj.x(this.b, 0, this.c, this);
    }
}

