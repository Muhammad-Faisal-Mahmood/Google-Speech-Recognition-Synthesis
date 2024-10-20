/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.List;
import j$.util.List$_CC;
import j$.util.d_0;
import j$.util.z;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/*
 * Renamed from j$.util.e
 */
class e_0
extends d_0
implements java.util.List,
List {
    private static final long serialVersionUID = -7754090372962971524L;
    final java.util.List c;

    e_0(java.util.List list) {
        super(list);
        this.c = list;
    }

    e_0(java.util.List list, Object object) {
        super(list, object);
        this.c = list;
    }

    private Object readResolve() {
        java.util.List list = this.c;
        list = list instanceof RandomAccess ? new e_0(list) : this;
        return list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void add(int n2, Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            this.c.add(n2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean addAll(int n2, Collection collection) {
        Object object = this.b;
        synchronized (object) {
            return this.c.addAll(n2, collection);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.equals(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object get(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.get(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int hashCode() {
        Object object = this.b;
        synchronized (object) {
            return this.c.hashCode();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int indexOf(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.indexOf(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int lastIndexOf(Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.lastIndexOf(object);
        }
    }

    public final ListIterator listIterator() {
        return this.c.listIterator();
    }

    public final ListIterator listIterator(int n2) {
        return this.c.listIterator(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object remove(int n2) {
        Object object = this.b;
        synchronized (object) {
            return this.c.remove(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void replaceAll(UnaryOperator unaryOperator) {
        Object object = this.b;
        synchronized (object) {
            java.util.List list = this.c;
            if (list instanceof List) {
                ((List)((Object)list)).replaceAll(unaryOperator);
            } else {
                List$_CC.$default$replaceAll(list, unaryOperator);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object set(int n2, Object object) {
        Object object2 = this.b;
        synchronized (object2) {
            return this.c.set(n2, object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sort(Comparator comparator) {
        Object object = this.b;
        synchronized (object) {
            z.p(this.c, comparator);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public java.util.List subList(int n2, int n3) {
        Object object = this.b;
        synchronized (object) {
            return new e_0(this.c.subList(n2, n3), this.b);
        }
    }
}

