/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;

public final class fbe {
    public static final hfn a = hfn.q();
    public final bmu b;
    private final jnu c;
    private final hpq d;
    private final hpq e;

    public fbe(jnu jnu2, bmu bmu2, hpq hpq2, hpq hpq3) {
        this.c = jnu2;
        this.b = bmu2;
        this.d = hpq2;
        this.e = hpq3;
    }

    public final hpn a() {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "getDownloadableLanguagePacks", 60, "MddLanguagePackMonitor.java")).r("#getDownloadableLanguagePacks");
        fbn fbn2 = ((fbp)this.c).a();
        heg heg2 = (heg)((heg)fbn.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/inject/LanguagePackConfigImpl", "getLanguagePackConfigs", 44, "LanguagePackConfigImpl.java");
        Object object = fbn2.b;
        String string = ((huu)object).b;
        object = Collection$_EL.stream(((huu)object).c).map(new fab(14));
        int n2 = gzx.d;
        heg2.C("Loaded languagepack (LP) flag value from latest config %s: %s", string, object.collect(gye.a));
        return fxf.ak(fxf.aj(hhk.K(gzx.o(fbn2.b.c)), new dti(16), this.d), new buf(19), this.d);
    }

    public final hpn b(cty cty2) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "getInstalledLanguagePacks", 76, "MddLanguagePackMonitor.java")).r("#getInstalledPackages from MDD");
        return this.c(cty2, 2);
    }

    public final hpn c(cty object, int n2) {
        Object object2 = a;
        ((hfk)((hfk)((hdz)object2).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "getLanguagePackList", 90, "MddLanguagePackMonitor.java")).r("#GetLanguagePackList");
        ((hfk)((hfk)((hdz)object2).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "getValidClientFileGroupList", 108, "MddLanguagePackMonitor.java")).r("MDD.getFileGroupsByFilter(langpack-domain_xx-XX_ver_zipfile)");
        object2 = new cta(null);
        ((cta)object2).a(false);
        ((cta)object2).h = (byte)(((cta)object2).h | 2);
        ((cta)object2).b(false);
        ((cta)object2).g = true;
        ((cta)object2).h = (byte)(((cta)object2).h | 8);
        ((cta)object2).a(true);
        ((cta)object2).b(true);
        if (((cta)object2).h != 15) {
            object = new StringBuilder();
            if ((((cta)object2).h & 1) == 0) {
                ((StringBuilder)object).append(" includeAllGroups");
            }
            if ((((cta)object2).h & 2) == 0) {
                ((StringBuilder)object).append(" groupWithNoAccountOnly");
            }
            if ((((cta)object2).h & 4) == 0) {
                ((StringBuilder)object).append(" preserveZipDirectories");
            }
            if ((((cta)object2).h & 8) == 0) {
                ((StringBuilder)object).append(" verifyIsolatedStructure");
            }
            throw new IllegalStateException("Missing required properties:".concat(object.toString()));
        }
        object2 = new ctb(((cta)object2).a, ((cta)object2).b, ((cta)object2).c, ((cta)object2).d, ((cta)object2).e, ((cta)object2).f, ((cta)object2).g);
        if (((ctb)object2).a) {
            fxf.q(true);
            fxf.q(true);
            fxf.q(true);
            fxf.q(true);
            fxf.q(true);
        } else {
            fxf.r(false, "Request must provide a group name prefix or a source to filter by");
        }
        return fxf.ak(fxf.aj(object.e((ctb)object2), new dti(15), this.d), new fbc(this, n2, 0), this.e);
    }
}

