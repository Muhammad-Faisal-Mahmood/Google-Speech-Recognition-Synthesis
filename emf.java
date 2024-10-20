/*
 * Decompiled with CFR 0.152.
 */
final class emf
extends jqs
implements jro {
    final emg a;
    final efo b;
    final ewq c;
    final eae d;
    final jrk e;

    public emf(emg emg2, efo efo2, ewq ewq2, eae eae2, jrk jrk2, jqb jqb2) {
        this.a = emg2;
        this.b = efo2;
        this.c = ewq2;
        this.d = eae2;
        this.e = jrk2;
        super(2, jqb2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object a(Object object) {
        jns.ak(object);
        object = this.c;
        Object object2 = this.b;
        Object object3 = this.a;
        Object object4 = object;
        if (object == null) {
            object4 = dtu.g(((emg)object3).b, this.d);
        }
        Object object5 = this.d;
        Object object6 = new mz(this.e, 15);
        try {
            object = object2.c();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = joe.a(object);
        if (object2 != null) {
            if (object2 instanceof elx) {
                object = ((elx)object2).a;
                if (((ebt)object).b == 2) {
                    object = object4 = ebs.b((Integer)((ebt)object).c);
                    if (object4 == null) {
                        object = ebs.a;
                    }
                } else {
                    object = ebs.a;
                }
                jse.d(object, "getFailure(...)");
                return object6.a(object);
            }
            object = gsl.a;
        }
        if ((object2 = (efr)((gto)object).f()) == null) {
            return object6.a(ebs.b);
        }
        object3 = ((emg)object3).d;
        int n2 = ewj.d((eae)object5);
        boolean bl2 = object4 instanceof eeb;
        object6 = null;
        object = bl2 ? (eeb)object4 : null;
        boolean bl3 = object4 instanceof edv;
        object5 = gto.h(object);
        object = bl3 ? (edv)object4 : null;
        ((dpq)object3).b(n2, (gto)object5, gto.h(object)).a((efr)object2);
        object = bl2 ? (eeb)object4 : null;
        object3 = gto.h(object);
        object = object6;
        if (bl3) {
            object = (edv)object4;
        }
        object = gto.h(object);
        object6 = ebu.b;
        jse.e(object6, "success");
        object4 = dww.k(ebt.a.l());
        ((bzb)object4).r((ebu)object6);
        return ekr.h((gto)object, (gto)object3, ((bzb)object4).p(), 24);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new emf(this.a, this.b, this.c, this.d, this.e, jqb2);
    }
}

