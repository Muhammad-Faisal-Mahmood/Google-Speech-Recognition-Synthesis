/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.List;
import j$.util.j_0;
import j$.util.k_0;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/*
 * Renamed from j$.util.l
 */
class l_0
extends j_0
implements java.util.List,
List {
    private static final long serialVersionUID = -283967356065247728L;
    final java.util.List b;

    l_0(java.util.List list) {
        super(list);
        this.b = list;
    }

    private Object readResolve() {
        java.util.List list = this.b;
        list = list instanceof RandomAccess ? new l_0(list) : this;
        return list;
    }

    public final void add(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = object == this || this.b.equals(object);
        return bl2;
    }

    public final Object get(int n2) {
        return this.b.get(n2);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final int indexOf(Object object) {
        return this.b.indexOf(object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        return this.b.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        return new k_0(this, 0);
    }

    public final ListIterator listIterator(int n2) {
        return new k_0(this, n2);
    }

    public final Object remove(int n2) {
        throw new UnsupportedOperationException();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public java.util.List subList(int n2, int n3) {
        return new l_0(this.b.subList(n2, n3));
    }
}

