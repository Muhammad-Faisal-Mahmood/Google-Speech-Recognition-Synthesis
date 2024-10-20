/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class fjq
implements fjt {
    private final int a;

    public fjq(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(idb object, fgr object2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                n2 = a.v(((idb)object).c);
                if (n2 == 0 || n2 == 1) {
                    Object object3 = idg.b;
                    ((hws)object).h((gpm)object3);
                    if (((hws)object).r.o((hwu)((gpm)object3).a)) {
                        object3 = (fff)object2;
                        object = ((fff)object3).a;
                        object2 = ffc.a;
                        Objects.requireNonNull(((ffg)object).c);
                        ((fff)object3).l(new bmu((ffc)((Object)object2), new bpw(14)));
                    }
                }
                return;
            }
            gpm gpm2 = ide.c;
            ((hws)object).h(gpm2);
            if (((hws)object).r.o((hwu)gpm2.a)) {
                gpm2 = ide.c;
                ((hws)object).h(gpm2);
                object = ((hws)object).r.l((hwu)gpm2.a);
                object = object == null ? gpm2.d : gpm2.k(object);
                object2.a(((ide)object).b);
            }
            return;
        }
        gpm gpm3 = iia.d;
        ((hws)object).h(gpm3);
        if (((hws)object).r.o((hwu)gpm3.a)) {
            gpm3 = iia.d;
            ((hws)object).h(gpm3);
            object = ((hws)object).r.l((hwu)gpm3.a);
            object = object == null ? gpm3.d : gpm3.k(object);
            object = (iia)object;
            if (((iia)object).b == 2) {
                object = (icf)((iia)object).c;
                if ((((icf)object).b & 1) != 0) {
                    n2 = ((icf)object).c;
                    int n3 = a.v(n2);
                    if (n3 != 0 && n3 != 1) {
                        n3 = a.v(n2);
                        if (n3 != 0 && n3 == 2 || (n2 = a.v(n2)) != 0 && n2 == 4) {
                            object2.b();
                            return;
                        }
                    } else {
                        object2.k();
                    }
                }
            }
        }
    }
}

