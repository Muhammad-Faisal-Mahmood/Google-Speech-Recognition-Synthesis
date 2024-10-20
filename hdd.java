/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class hdd
extends hay {
    public static final hdd c;
    final transient gzx d;

    static {
        int n2 = gzx.d;
        c = new hdd(hct.a, hcm.a);
    }

    public hdd(gzx gzx2, Comparator comparator) {
        super(comparator);
        this.d = gzx2;
    }

    @Override
    public final hay A(Object object, boolean bl2) {
        return this.F(this.E(object, bl2), this.size());
    }

    @Override
    public final hdx C() {
        return this.d.a().v();
    }

    final int D(Object object, boolean bl2) {
        fxf.K(object);
        int n2 = Collections.binarySearch(this.d, object, this.a);
        if (n2 >= 0) {
            int n3 = n2;
            if (bl2) {
                n3 = n2 + 1;
            }
            return n3;
        }
        return ~n2;
    }

    final int E(Object object, boolean bl2) {
        fxf.K(object);
        int n2 = Collections.binarySearch(this.d, object, this.a);
        if (n2 >= 0) {
            if (bl2) {
                return n2;
            }
            return n2 + 1;
        }
        return ~n2;
    }

    final hdd F(int n2, int n3) {
        int n4 = n2;
        if (n2 == 0) {
            if (n3 != this.size()) {
                n4 = 0;
            } else {
                return this;
            }
        }
        if (n4 < n3) {
            gzx gzx2 = this.d;
            Comparator comparator = this.a;
            return new hdd(gzx2.c(n4, n3), comparator);
        }
        return hdd.B(this.a);
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        return ((gzm)this.d).b(objectArray, n2);
    }

    @Override
    public final Object ceiling(Object object) {
        int n2 = this.E(object, true);
        if (n2 == this.size()) {
            return null;
        }
        return this.d.get(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean contains(Object object) {
        if (object == null) return false;
        try {
            int n2 = Collections.binarySearch(this.d, object, this.a);
            if (n2 < 0) return false;
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean containsAll(Collection collection) {
        void var3_8;
        Collection collection2 = collection;
        if (collection instanceof hch) {
            Set set = ((hch)collection).i();
        }
        if (!hhk.m(this.a, (Iterable)var3_8)) return super.containsAll((Collection<?>)var3_8);
        if (var3_8.size() <= 1) {
            return super.containsAll((Collection<?>)var3_8);
        }
        hdx hdx2 = this.k();
        Iterator iterator = var3_8.iterator();
        if (!hdx2.hasNext()) {
            return false;
        }
        Object e2 = iterator.next();
        Object e3 = hdx2.next();
        try {
            while (true) {
                void var3_10;
                void var1_3;
                int n2;
                if ((n2 = this.a(var1_3, var3_10)) < 0) {
                    if (!hdx2.hasNext()) {
                        return false;
                    }
                    Object e4 = hdx2.next();
                    continue;
                }
                if (n2 != 0) return false;
                if (!iterator.hasNext()) {
                    return true;
                }
                Object e5 = iterator.next();
            }
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    @Override
    public final int d() {
        return this.d.d();
    }

    @Override
    public final int e() {
        return this.d.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object iterator) {
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof Set)) {
            return false;
        }
        iterator = (Set)((Object)iterator);
        if (this.size() != iterator.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (!hhk.m(this.a, (Iterable)((Object)iterator))) {
            return this.containsAll((Collection)((Object)iterator));
        }
        iterator = iterator.iterator();
        try {
            Object e2;
            int n2;
            Object e3;
            hdx hdx2 = this.k();
            do {
                if (!hdx2.hasNext()) {
                    return true;
                }
                e2 = hdx2.next();
            } while ((e3 = iterator.next()) != null && (n2 = this.a(e2, e3)) == 0);
            return false;
        }
        catch (ClassCastException | NoSuchElementException runtimeException) {
            return false;
        }
    }

    @Override
    public final gzx f() {
        return this.d;
    }

    @Override
    public final Object first() {
        if (!this.isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object object) {
        int n2 = this.D(object, true) - 1;
        if (n2 == -1) {
            return null;
        }
        return this.d.get(n2);
    }

    @Override
    public final Object higher(Object object) {
        int n2 = this.E(object, false);
        if (n2 == this.size()) {
            return null;
        }
        return this.d.get(n2);
    }

    @Override
    public final hdx k() {
        return this.d.v();
    }

    @Override
    public final boolean l() {
        return this.d.l();
    }

    @Override
    public final Object last() {
        if (!this.isEmpty()) {
            return this.d.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object object) {
        int n2 = this.D(object, false) - 1;
        if (n2 == -1) {
            return null;
        }
        return this.d.get(n2);
    }

    @Override
    public final Object[] m() {
        return this.d.m();
    }

    @Override
    public final int size() {
        return this.d.size();
    }

    @Override
    public final hay u() {
        Object object = Collections.reverseOrder(this.a);
        object = this.isEmpty() ? hdd.B(object) : new hdd(this.d.a(), (Comparator)object);
        return object;
    }

    @Override
    public final hay w(Object object, boolean bl2) {
        return this.F(0, this.D(object, bl2));
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override
    public final hay y(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.A(object, bl2).w(object2, bl3);
    }
}

