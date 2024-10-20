/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class gxn
extends gxl
implements List {
    final gxp f;

    public gxn(gxp gxp2, Object object, List list, gxl gxl2) {
        this.f = gxp2;
        super(gxp2, object, list, gxl2);
    }

    public final void add(int n2, Object object) {
        this.b();
        boolean bl2 = this.b.isEmpty();
        this.d().add(n2, object);
        object = this.f;
        ++((gxp)object).b;
        if (bl2) {
            this.a();
        }
    }

    public final boolean addAll(int n2, Collection object) {
        boolean bl2;
        if (object.isEmpty()) {
            return false;
        }
        int n3 = this.size();
        boolean bl3 = bl2 = this.d().addAll(n2, object);
        if (bl2) {
            n2 = this.b.size();
            object = this.f;
            ((gxp)object).b += n2 - n3;
            bl3 = bl2;
            if (n3 == 0) {
                this.a();
                bl3 = true;
            }
        }
        return bl3;
    }

    final List d() {
        return (List)this.b;
    }

    public final Object get(int n2) {
        this.b();
        return this.d().get(n2);
    }

    @Override
    public final int indexOf(Object object) {
        this.b();
        return this.d().indexOf(object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        this.b();
        return this.d().lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        this.b();
        return new gxm(this);
    }

    public final ListIterator listIterator(int n2) {
        this.b();
        return new gxm(this, n2);
    }

    public final Object remove(int n2) {
        this.b();
        Object e2 = this.d().remove(n2);
        gxp gxp2 = this.f;
        --gxp2.b;
        this.c();
        return e2;
    }

    public final Object set(int n2, Object object) {
        this.b();
        return this.d().set(n2, object);
    }

    public final List subList(int n2, int n3) {
        this.b();
        List list = this.d().subList(n2, n3);
        Object object = this.c;
        gxl gxl2 = object;
        if (object == null) {
            gxl2 = this;
        }
        object = this.a;
        return this.f.h(object, list, gxl2);
    }
}

