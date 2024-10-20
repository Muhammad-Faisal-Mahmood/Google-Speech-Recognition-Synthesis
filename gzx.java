/*
 * Decompiled with CFR 0.152.
 */
import j$.util.List;
import j$.util.List$_CC;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class gzx
extends gzm
implements java.util.List,
RandomAccess,
List {
    private static final hdy a = new gzt(hct.a, 0);
    public static final int d = 0;
    private static final long serialVersionUID = -889275714L;

    public static gzs g(int n2) {
        fvd.al(n2, "expectedSize");
        return new gzs(n2);
    }

    static gzx h(Object[] objectArray) {
        return gzx.i(objectArray, objectArray.length);
    }

    static gzx i(Object[] objectArray, int n2) {
        if (n2 == 0) {
            return hct.a;
        }
        return new hct(objectArray, n2);
    }

    public static gzx j(Object ... objectArray) {
        hhk.B(objectArray);
        return gzx.h(objectArray);
    }

    public static gzx n(Iterable iterable) {
        fxf.K(iterable);
        if (iterable instanceof Collection) {
            iterable = gzx.o((Collection)iterable);
        } else {
            Iterator iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                iterable = hct.a;
            } else {
                iterable = iterator.next();
                if (!iterator.hasNext()) {
                    iterable = gzx.q(iterable);
                } else {
                    gzs gzs2 = new gzs();
                    gzs2.h(iterable);
                    gzs2.k(iterator);
                    iterable = gzs2.g();
                }
            }
        }
        return iterable;
    }

    public static gzx o(Collection collection) {
        if (collection instanceof gzm) {
            gzx gzx2 = ((gzm)collection).f();
            collection = gzx2;
            if (gzx2.l()) {
                collection = gzx.h(gzx2.toArray());
            }
            return collection;
        }
        return gzx.j(collection.toArray());
    }

    public static gzx p(Object[] object) {
        object = ((Object[])object).length == 0 ? hct.a : gzx.j((Object[])object.clone());
        return object;
    }

    public static gzx q(Object object) {
        return gzx.j(object);
    }

    public static gzx r(Object object, Object object2) {
        return gzx.j(object, object2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static gzx s(Object object, Object object2, Object object3, Object object4, Object object5) {
        return gzx.j(object, object2, object3, object4, object5);
    }

    @SafeVarargs
    public static gzx t(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object ... objectArray) {
        fxf.r(true, "the total number of elements must fit in an int");
        int n2 = objectArray.length;
        Object[] objectArray2 = new Object[n2 + 12];
        objectArray2[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        System.arraycopy(objectArray, 0, objectArray2, 12, n2);
        return gzx.j(objectArray2);
    }

    public static gzx u(Comparator comparator, Iterable object) {
        object = object instanceof Collection ? (Collection)object : fvd.u(object.iterator());
        object = object.toArray();
        hhk.B(object);
        Arrays.sort(object, comparator);
        return gzx.h(object);
    }

    public gzx a() {
        if (this.size() <= 1) {
            return this;
        }
        return new gzu(this);
    }

    @Deprecated
    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(Object[] objectArray, int n2) {
        int n3 = this.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            objectArray[n2 + i2] = this.get(i2);
        }
        return n2 + n3;
    }

    public gzx c(int n2, int n3) {
        fxf.z(n2, n3, this.size());
        if ((n3 -= n2) == this.size()) {
            return this;
        }
        if (n3 == 0) {
            return hct.a;
        }
        return new gzw(this, n2, n3);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    public final boolean equals(Object object) {
        return fvd.z(this, object);
    }

    @Override
    @Deprecated
    public final gzx f() {
        return this;
    }

    @Override
    public final int hashCode() {
        int n2 = this.size();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + this.get(i2).hashCode();
        }
        return n3;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        int n3 = -1;
        if (object == null) {
            return -1;
        }
        int n4 = this.size();
        int n5 = 0;
        while (true) {
            n2 = n3;
            if (n5 >= n4) break;
            if (object.equals(this.get(n5))) {
                n2 = n5;
                break;
            }
            ++n5;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return this.v();
    }

    @Override
    public final hdx k() {
        return this.v();
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        int n3 = -1;
        if (object == null) {
            return -1;
        }
        int n4 = this.size() - 1;
        while (true) {
            n2 = n3;
            if (n4 < 0) break;
            if (object.equals(this.get(n4))) {
                n2 = n4;
                break;
            }
            --n4;
        }
        return n2;
    }

    @Deprecated
    public final Object remove(int n2) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List$_CC.$default$replaceAll(this, unaryOperator);
    }

    @Deprecated
    public final Object set(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void sort(Comparator comparator) {
        List$_CC.$default$sort(this, comparator);
    }

    public final hdy v() {
        return this.w(0);
    }

    public final hdy w(int n2) {
        fxf.M(n2, this.size());
        if (this.isEmpty()) {
            return a;
        }
        return new gzt(this, n2);
    }

    @Override
    public Object writeReplace() {
        return new gzv(this.toArray());
    }
}

