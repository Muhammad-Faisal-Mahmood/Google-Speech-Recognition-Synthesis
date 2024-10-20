/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class hbr
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID = 0L;
    final List a;
    final gte b;

    public hbr(List list, gte gte2) {
        fxf.K(list);
        this.a = list;
        this.b = gte2;
    }

    @Override
    public final Object get(int n2) {
        List list = this.a;
        return this.b.apply(list.get(n2));
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public final ListIterator listIterator(int n2) {
        return new hbq(this, this.a.listIterator(n2));
    }

    @Override
    public final Object remove(int n2) {
        List list = this.a;
        return this.b.apply(list.remove(n2));
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a.subList(n2, n3).clear();
    }

    @Override
    public final int size() {
        return this.a.size();
    }
}

