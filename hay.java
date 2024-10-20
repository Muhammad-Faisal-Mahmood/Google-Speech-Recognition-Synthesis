/*
 * Decompiled with CFR 0.152.
 */
import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

public abstract class hay
extends hav
implements NavigableSet,
SortedSet,
hdr {
    private static final long serialVersionUID = 912559L;
    final transient Comparator a;
    transient hay b;

    public hay(Comparator comparator) {
        this.a = comparator;
    }

    static hdd B(Comparator comparator) {
        if (hcm.a.equals(comparator)) {
            return hdd.c;
        }
        int n2 = gzx.d;
        return new hdd(hct.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract hay A(Object var1, boolean var2);

    public abstract hdx C();

    final int a(Object object, Object object2) {
        return this.a.compare(object, object2);
    }

    @Override
    @Deprecated
    public final void addFirst(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void addLast(Object object) {
        throw new UnsupportedOperationException();
    }

    public Object ceiling(Object object) {
        return fvd.O(this.z(object, true), null);
    }

    @Override
    public final Comparator comparator() {
        return this.a;
    }

    @Override
    public Object first() {
        return this.k().next();
    }

    public Object floor(Object object) {
        return fvd.F(this.v(object, true).C(), null);
    }

    @Override
    public final Object getFirst() {
        return this.first();
    }

    @Override
    public final Object getLast() {
        return this.last();
    }

    public Object higher(Object object) {
        return fvd.O(this.z(object, false), null);
    }

    @Override
    public abstract hdx k();

    @Override
    public Object last() {
        return this.C().next();
    }

    public Object lower(Object object) {
        return fvd.F(this.v(object, false).C(), null);
    }

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public abstract hay u();

    public final hay v(Object object, boolean bl2) {
        fxf.K(object);
        return this.w(object, bl2);
    }

    public abstract hay w(Object var1, boolean var2);

    @Override
    public Object writeReplace() {
        return new hax(this.a, this.toArray());
    }

    public final hay x(Object object, boolean bl2, Object object2, boolean bl3) {
        fxf.K(object);
        fxf.K(object2);
        boolean bl4 = this.a.compare(object, object2) <= 0;
        fxf.q(bl4);
        return this.y(object, bl2, object2, bl3);
    }

    public abstract hay y(Object var1, boolean var2, Object var3, boolean var4);

    public final hay z(Object object, boolean bl2) {
        fxf.K(object);
        return this.A(object, bl2);
    }
}

