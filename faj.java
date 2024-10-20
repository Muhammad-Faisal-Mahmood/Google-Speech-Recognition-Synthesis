/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import java.util.Locale;

public final class faj
implements ffj {
    public static final hfn a = hfn.o("SodaLPDirGenerator");
    public final ezl b;
    public final ezs c;
    public final hpq d;

    public faj(ezl ezl2, ezs ezs2, hpq hpq2) {
        this.b = ezl2;
        this.c = ezs2;
        this.d = hpq2;
    }

    @Override
    public final hpn a(String object, boolean bl2, idq object2) {
        Object object3 = Optional.of(object2);
        Object object4 = a;
        ((hfk)((hfk)((hdz)object4).b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "getLanguagePackInfo", 67, "LanguagePackDirGeneratorImpl.java")).u("#getLanguagePackInfo %s", object);
        object2 = Locale.forLanguageTag((String)object).toLanguageTag();
        if (!((String)object2).equals(object)) {
            ((hfk)((hfk)((hdz)object4).h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "getLanguagePackInfo", 73, "LanguagePackDirGeneratorImpl.java")).C("LanguagePack request with non-standard coding of locale: %s. Prefer %s", object, object2);
        }
        object = faq.b.l();
        if (!bl2) {
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object4 = (faq)((hwp)object).b;
            object2.getClass();
            ((faq)object4).c |= 1;
            ((faq)object4).d = object2;
        }
        ((Optional)object3).isPresent();
        object4 = ((Optional)object3).get();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object3 = (faq)((hwp)object).b;
        ((faq)object3).f = ((idq)object4).m;
        ((faq)object3).c |= 4;
        return grf.g(this.c.b((faq)((hwp)object).o())).i(new cvw(this, (String)object2, bl2, 4), this.d).i(new ezz(object2, 2), this.d);
    }
}

