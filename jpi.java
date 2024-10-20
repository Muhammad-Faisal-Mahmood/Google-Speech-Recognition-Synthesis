/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class jpi
extends jov
implements List,
RandomAccess,
Serializable,
jsn {
    public Object[] a;
    public final int b;
    public int c;
    public final jpk d;
    private final jpi e;

    public jpi(Object[] object, int n2, int n3, jpi jpi2, jpk jpk2) {
        jse.e(object, "backing");
        jse.e(jpk2, "root");
        this.a = object;
        this.b = n2;
        this.c = n3;
        this.e = jpi2;
        this.d = jpk2;
        object = jpk.a;
        this.modCount = jpk2.modCount;
    }

    public static final /* synthetic */ int c(jpi jpi2) {
        return jpi2.modCount;
    }

    private final int d(int n2, int n3, Collection collection, boolean bl2) {
        jov jov2 = this.e;
        if (jov2 != null) {
            n2 = ((jpi)jov2).d(n2, n3, collection, bl2);
        } else {
            jov2 = this.d;
            jpk jpk2 = jpk.a;
            n2 = ((jpk)jov2).d(n2, n3, collection, bl2);
        }
        if (n2 > 0) {
            this.j();
        }
        this.c -= n2;
        return n2;
    }

    private final Object e(int n2) {
        this.j();
        Object object = this.e;
        if (object != null) {
            object = ((jpi)object).e(n2);
        } else {
            object = this.d;
            jpk jpk2 = jpk.a;
            object = ((jpk)object).e(n2);
        }
        --this.c;
        return object;
    }

    private final void f(int n2, Collection collection, int n3) {
        this.j();
        jov jov2 = this.e;
        if (jov2 != null) {
            jov2.f(n2, collection, n3);
        } else {
            jpk jpk2 = this.d;
            jov2 = jpk.a;
            jpk2.f(n2, collection, n3);
        }
        collection = this.d;
        jov2 = jpk.a;
        this.a = ((jpk)collection).b;
        this.c += n3;
    }

    private final void g(int n2, Object object) {
        this.j();
        jov jov2 = this.e;
        if (jov2 != null) {
            jov2.g(n2, object);
        } else {
            jpk jpk2 = this.d;
            jov2 = jpk.a;
            jpk2.g(n2, object);
        }
        jov2 = this.d;
        object = jpk.a;
        this.a = ((jpk)jov2).b;
        ++this.c;
    }

    private final void h() {
        jpk jpk2 = jpk.a;
        if (this.d.modCount == this.modCount) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void i() {
        if (!this.l()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final void j() {
        ++this.modCount;
    }

    private final void k(int n2, int n3) {
        jov jov2;
        if (n3 > 0) {
            this.j();
        }
        if ((jov2 = this.e) != null) {
            jov2.k(n2, n3);
        } else {
            jpk jpk2 = this.d;
            jov2 = jpk.a;
            jpk2.i(n2, n3);
        }
        this.c -= n3;
    }

    private final boolean l() {
        jpk jpk2 = jpk.a;
        return this.d.d;
    }

    private final Object writeReplace() {
        if (this.l()) {
            return new jps(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override
    public final int a() {
        this.h();
        return this.c;
    }

    public final void add(int n2, Object object) {
        this.i();
        this.h();
        jns.ag(n2, this.c);
        this.g(this.b + n2, object);
    }

    @Override
    public final boolean add(Object object) {
        this.i();
        this.h();
        this.g(this.b + this.c, object);
        return true;
    }

    public final boolean addAll(int n2, Collection collection) {
        jse.e(collection, "elements");
        this.i();
        this.h();
        jns.ag(n2, this.c);
        int n3 = this.b;
        int n4 = collection.size();
        this.f(n3 + n2, collection, n4);
        return n4 > 0;
    }

    @Override
    public final boolean addAll(Collection collection) {
        jse.e(collection, "elements");
        this.i();
        this.h();
        int n2 = collection.size();
        this.f(this.b + this.c, collection, n2);
        return n2 > 0;
    }

    @Override
    public final Object b(int n2) {
        this.i();
        this.h();
        jns.af(n2, this.c);
        return this.e(this.b + n2);
    }

    @Override
    public final void clear() {
        this.i();
        this.h();
        this.k(this.b, this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean equals(Object object) {
        boolean bl2;
        this.h();
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof List)) return false;
        if (!jjj.A(this.a, this.b, this.c, (List)(object = (List)object))) return false;
        return bl2;
    }

    public final Object get(int n2) {
        this.h();
        jns.af(n2, this.c);
        int n3 = this.b;
        return this.a[n3 + n2];
    }

    @Override
    public final int hashCode() {
        this.h();
        return jjj.w(this.a, this.b, this.c);
    }

    @Override
    public final int indexOf(Object object) {
        this.h();
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (!jse.i(this.a[this.b + i2], object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        this.h();
        return this.c == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object object) {
        this.h();
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (!jse.i(this.a[this.b + i2], object)) continue;
            return i2;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n2) {
        this.h();
        jns.ag(n2, this.c);
        return new jpj(this, n2, 1);
    }

    @Override
    public final boolean remove(Object object) {
        this.i();
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
        this.i();
        this.h();
        return this.d(this.b, this.c, collection, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        jse.e(collection, "elements");
        this.i();
        this.h();
        return this.d(this.b, this.c, collection, true) > 0;
    }

    public final Object set(int n2, Object object) {
        this.i();
        this.h();
        jns.af(n2, this.c);
        int n3 = this.b;
        Object[] objectArray = this.a;
        n2 = n3 + n2;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public final List subList(int n2, int n3) {
        jns.ah(n2, n3, this.c);
        jpk jpk2 = this.d;
        int n4 = this.b;
        return new jpi(this.a, n4 + n2, n3 - n2, this, jpk2);
    }

    @Override
    public final Object[] toArray() {
        this.h();
        Object[] objectArray = this.a;
        int n2 = this.b;
        return jns.N(objectArray, n2, this.c + n2);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        jse.e(objectArray, "array");
        this.h();
        int n2 = objectArray.length;
        int n3 = this.c;
        if (n2 < n3) {
            Object[] objectArray2 = this.a;
            n2 = this.b;
            objectArray = Arrays.copyOfRange(objectArray2, n2, n3 + n2, objectArray.getClass());
            jse.d(objectArray, "copyOfRange(...)");
            return objectArray;
        }
        Object[] objectArray3 = this.a;
        n2 = this.b;
        jns.X(objectArray3, objectArray, 0, n2, n3 + n2);
        jns.F(this.c, objectArray);
        return objectArray;
    }

    @Override
    public final String toString() {
        this.h();
        return jjj.x(this.a, this.b, this.c, this);
    }
}

