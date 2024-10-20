/*
 * Decompiled with CFR 0.152.
 */
public final class abl
extends abm
implements abc {
    final abe a;
    final abn b;

    public abl(abn abn2, abe abe2, abp abp2) {
        this.b = abn2;
        super(abn2, abp2);
        this.a = abe2;
    }

    @Override
    public final void a(abe object, aaz object2) {
        object = this.a.getLifecycle().a();
        if (object != aba.a) {
            object2 = null;
            while (object2 != object) {
                this.d(this.aS());
                aba aba2 = this.a.getLifecycle().a();
                object2 = object;
                object = aba2;
            }
            return;
        }
        this.b.f(this.c);
    }

    @Override
    public final boolean aS() {
        return this.a.getLifecycle().a().a(aba.d);
    }

    @Override
    public final void b() {
        this.a.getLifecycle().c(this);
    }

    @Override
    public final boolean c(abe abe2) {
        return this.a == abe2;
    }
}

