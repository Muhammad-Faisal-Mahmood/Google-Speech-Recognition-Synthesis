/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

final class ezr
extends jsf
implements jrk {
    final String a;
    final int b;
    final ezs c;
    final Optional d;
    final gto e;
    final Optional f;

    public ezr(String string, int n2, ezs ezs2, Optional optional, gto gto2, Optional optional2) {
        this.a = string;
        this.b = n2;
        this.c = ezs2;
        this.d = optional;
        this.e = gto2;
        this.f = optional2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        Object object2 = (ezo)object;
        jse.e(object2, "allPacks");
        object = ((ezo)object2).c;
        Object object3 = ezs.a;
        object = crh.A(this.a, this.b, (gzx)object);
        if (((gto)object).g()) {
            ((hfk)ezs.a.f()).A("LanguagePack [%s %d] already installed. Skipping download.", this.a, this.b);
            object = hhk.K(new cxu(bql.e, ((gto)object).b(new eex(ero.g, 18))));
        } else {
            object = crh.A(this.a, this.b, ((ezo)object2).a);
            if (!((gto)object).g()) {
                ((hfk)ezs.a.f()).A("LanguagePack [%s %d] not found in downloadable set. Skipping download request.", this.a, this.b);
                object = hhk.K(new cxu(bql.d, gsl.a));
            } else if (crh.A(this.a, this.b, ((ezo)object2).b).g()) {
                ((hfk)ezs.a.f()).A("LanguagePack [%s %d] already being installed. Retriggering download request.", this.a, this.b);
                object2 = this.c;
                object3 = this.a;
                Optional optional = this.d;
                object = ezs.d((ezs)object2, bql.b, (String)object3, optional, (ezj)((gto)object).c(), this.e, this.f);
            } else {
                ((hfk)ezs.a.f()).A("Starting new LanguagePack download [%s %d]", this.a, this.b);
                object3 = this.c;
                object2 = this.a;
                Optional optional = this.d;
                object = ezs.d((ezs)object3, bql.c, (String)object2, optional, (ezj)((gto)object).c(), this.e, this.f);
            }
        }
        return object;
    }
}

