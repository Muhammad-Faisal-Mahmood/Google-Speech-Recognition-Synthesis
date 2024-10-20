/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class hbp
extends AbstractList {
    public final List a;

    public hbp(List list) {
        fxf.K(list);
        this.a = list;
    }

    private final int b(int n2) {
        int n3 = this.size();
        fxf.J(n2, n3);
        return n3 - 1 - n2;
    }

    public final int a(int n2) {
        int n3 = this.size();
        fxf.M(n2, n3);
        return n3 - n2;
    }

    @Override
    public final void add(int n2, Object object) {
        this.a.add(this.a(n2), object);
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final Object get(int n2) {
        return this.a.get(this.b(n2));
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public final ListIterator listIterator(int n2) {
        return new hbo(this, this.a.listIterator(this.a(n2)));
    }

    @Override
    public final Object remove(int n2) {
        return this.a.remove(this.b(n2));
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.subList(n2, n3).clear();
    }

    @Override
    public final Object set(int n2, Object object) {
        return this.a.set(this.b(n2), object);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final List subList(int n2, int n3) {
        fxf.z(n2, n3, this.size());
        return fvd.x(this.a.subList(this.a(n3), this.a(n2)));
    }
}

