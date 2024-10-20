/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fbt {
    private static final hfn b = hfn.q();
    public final Optional a;
    private final ezs c;
    private final hpq d;

    public fbt(ezs ezs2, hpq hpq2, Optional optional) {
        this.c = ezs2;
        this.d = hpq2;
        this.a = optional;
    }

    public final hpn a(idq idq2, hav hav2, Optional optional) {
        Object object;
        Object object2;
        this.a.isPresent();
        if (optional.isPresent()) {
            object2 = (bzo)this.a.get();
            object = optional.get();
            object = dxv.aE.b("model_manager", (String)object);
            ((bzo)object2).a.a((dyk)object);
        }
        ((hfk)((hfk)b.b()).j("com/google/android/libraries/speech/modelmanager/languagepack/LanguagePackChooser", "getInstalledPacks", 110, "LanguagePackChooser.java")).u("#getInstalledPacks %s", idq2);
        object = this.c;
        object2 = faq.b.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        faq faq2 = (faq)((hwp)object2).b;
        faq2.f = idq2.m;
        faq2.c |= 4;
        ((hwp)object2).H(hav2);
        return fxf.aj(((ezs)object).b((faq)((hwp)object2).o()), new bte(this, optional, 20), this.d);
    }

    public final hpn b(Optional optional) {
        this.a.isPresent();
        if (optional.isPresent()) {
            this.a.ifPresent(new bme(optional, 10));
        }
        ((hfk)((hfk)b.b()).j("com/google/android/libraries/speech/modelmanager/languagepack/LanguagePackChooser", "getPendingPacks", 89, "LanguagePackChooser.java")).r("#getPendingPacks");
        ezs ezs2 = this.c;
        return fxf.aj(fxf.aj(ezs2.b.f(), new eex(ero.f, 16), ezs2.f), new bte(this, optional, 19), this.d);
    }

    public final hpn c(gto object, hav object2, Optional optional) {
        Object object3;
        ((hfk)((hfk)b.b()).j("com/google/android/libraries/speech/modelmanager/languagepack/LanguagePackChooser", "getSupportedPacks", 61, "LanguagePackChooser.java")).u("#getSupportedPacks %s", object);
        this.a.isPresent();
        if (optional.isPresent()) {
            object3 = (bzo)this.a.get();
            Object object4 = optional.get();
            object4 = dxv.aA.b("model_manager", (String)object4);
            ((bzo)object3).a.a((dyk)object4);
        }
        object3 = faq.b.l();
        ((hwp)object3).H((Iterable)object2);
        if (((gto)object).g()) {
            object2 = ((gto)object).c();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object = (faq)((hwp)object3).b;
            ((faq)object).f = ((idq)object2).m;
            ((faq)object).c |= 4;
        }
        return fxf.aj(this.c.c((faq)((hwp)object3).o()), new ffp(this, optional, 1), this.d);
    }

    public final hpn d(String string, int n2, Optional object, boolean bl2) {
        ((hfk)((hfk)b.b()).j("com/google/android/libraries/speech/modelmanager/languagepack/LanguagePackChooser", "scheduleInstall", 134, "LanguagePackChooser.java")).A("#scheduleInstall [%s, %d]", string, n2);
        Optional optional = Optional.empty();
        object = ((Optional)object).isPresent() ? gto.i(((Optional)object).get()) : gsl.a;
        csn csn2 = bl2 ? csn.a : csn.b;
        return fxf.aj(this.c.e(string, n2, optional, (gto)object, Optional.of(csn2)), new dti(17), this.d);
    }
}

