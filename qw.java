/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class qw
extends ra {
    public qw(qg qg2) {
        super(qg2);
    }

    private final void g(qs qs2) {
        this.h.j.add(qs2);
        qs2.k.add(this.h);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void b() {
        int n2;
        qg qg2 = this.d;
        if (!(qg2 instanceof qd)) return;
        Object object = this.h;
        ((qs)object).b = true;
        qg2 = (qd)qg2;
        int n3 = ((qd)qg2).a;
        boolean bl2 = ((qd)qg2).b;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) return;
                    ((qs)object).l = 7;
                    for (n2 = 0; n2 < ((qd)qg2).as; ++n2) {
                        object = ((qd)qg2).ar[n2];
                        if (!bl2 && ((qg)object).ah == 8) continue;
                        object = ((qg)object).i.i;
                        ((qs)object).j.add(this.h);
                        this.h.k.add(object);
                    }
                    this.g(this.d.i.h);
                    this.g(this.d.i.i);
                    return;
                }
                ((qs)object).l = 6;
                for (n2 = n4; n2 < ((qd)qg2).as; ++n2) {
                    object = ((qd)qg2).ar[n2];
                    if (!bl2 && ((qg)object).ah == 8) continue;
                    object = ((qg)object).i.h;
                    ((qs)object).j.add(this.h);
                    this.h.k.add(object);
                }
                this.g(this.d.i.h);
                this.g(this.d.i.i);
                return;
            }
            ((qs)object).l = 5;
            for (n2 = n5; n2 < ((qd)qg2).as; ++n2) {
                object = ((qd)qg2).ar[n2];
                if (!bl2 && ((qg)object).ah == 8) continue;
                object = ((qg)object).h.i;
                ((qs)object).j.add(this.h);
                this.h.k.add(object);
            }
            this.g(this.d.h.h);
            this.g(this.d.h.i);
            return;
        }
        ((qs)object).l = 4;
        for (n2 = n6; n2 < ((qd)qg2).as; ++n2) {
            object = ((qd)qg2).ar[n2];
            if (!bl2 && ((qg)object).ah == 8) continue;
            object = ((qg)object).h.h;
            ((qs)object).j.add(this.h);
            this.h.k.add(object);
        }
        this.g(this.d.h.h);
        this.g(this.d.h.i);
    }

    @Override
    public final void c() {
        qg qg2 = this.d;
        if (qg2 instanceof qd) {
            int n2 = ((qd)qg2).a;
            if (n2 != 0 && n2 != 1) {
                qg2.aa = this.h.f;
                return;
            }
            qg2.Z = this.h.f;
        }
    }

    @Override
    public final void d() {
        this.l = null;
        this.h.b();
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void f() {
        qd qd2 = (qd)this.d;
        int n2 = qd2.a;
        Iterator iterator = this.h.k.iterator();
        int n3 = 0;
        int n4 = -1;
        while (iterator.hasNext()) {
            int n5;
            int n6;
            block6: {
                block5: {
                    n6 = ((qs)iterator.next()).f;
                    if (n4 == -1) break block5;
                    n5 = n4;
                    if (n6 >= n4) break block6;
                }
                n5 = n6;
            }
            n4 = n5;
            if (n3 >= n6) continue;
            n3 = n6;
            n4 = n5;
        }
        if (n2 != 0 && n2 != 2) {
            this.h.c(n3 + qd2.c);
            return;
        }
        this.h.c(n4 + qd2.c);
    }
}

