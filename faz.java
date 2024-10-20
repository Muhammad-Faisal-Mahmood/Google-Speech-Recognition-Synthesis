/*
 * Decompiled with CFR 0.152.
 */
public final class faz
implements ezv {
    public static final hfn a = hfn.o("SystemLPSourceImpl");
    public final gzx b;
    public final dxi c;
    private final hpq d;
    private final hpq e;

    public faz(gzx gzx2, dxi dxi2, hpq hpq2, hpq hpq3) {
        this.b = gzx2;
        this.c = dxi2;
        this.d = hpq2;
        this.e = hpq3;
    }

    @Override
    public final hpn c() {
        ((hfk)((hfk)a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/systempartition/SystemImageLanguagePackSourceImpl", "getAvailablePackages", 66, "SystemImageLanguagePackSourceImpl.java")).r("#getAvailablePackages: Note there is not reason to call this method, as getInstalledPackages() returns the same LanguagePacks for this impl.");
        this.c.a(dxv.Y);
        return fxf.ao(new bdr(this, 17), this.e).h(new ezt(this, 12), this.d);
    }

    @Override
    public final hpn d() {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/systempartition/SystemImageLanguagePackSourceImpl", "getInstalledPackages", 81, "SystemImageLanguagePackSourceImpl.java")).r("#getInstalledPackages");
        this.c.a(dxv.aa);
        return fxf.ao(new bdr(this, 17), this.e).h(new ezt(this, 11), this.d);
    }

    @Override
    public final hpn f() {
        ((hfk)((hfk)a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/systempartition/SystemImageLanguagePackSourceImpl", "getRequestedPackages", 155, "SystemImageLanguagePackSourceImpl.java")).r("#getRequestedPackages: There is not reason to call this method, as the result is always empty.");
        int n2 = gzx.d;
        return hhk.K(hct.a);
    }
}

