/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

final class gxm
extends gxk
implements ListIterator {
    final gxn d;

    public gxm(gxn gxn2) {
        this.d = gxn2;
        super(gxn2);
    }

    public gxm(gxn gxn2, int n2) {
        this.d = gxn2;
        super(gxn2, gxn2.d().listIterator(n2));
    }

    private final ListIterator b() {
        this.a();
        return (ListIterator)this.a;
    }

    public final void add(Object object) {
        boolean bl2 = this.d.isEmpty();
        this.b().add(object);
        gxn gxn2 = this.d;
        object = gxn2.f;
        ++((gxp)object).b;
        if (bl2) {
            gxn2.a();
        }
    }

    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }

    public final Object previous() {
        return this.b().previous();
    }

    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }

    public final void set(Object object) {
        this.b().set(object);
    }
}

