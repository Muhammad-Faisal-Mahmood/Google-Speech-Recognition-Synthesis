/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class faa
implements ezl {
    public static final hfn a = hfn.o("DefaultLPManager");
    public final hpq b;
    public final ezu c;
    public final dxi d;
    public final Boolean e;
    private final faz f;
    private final fbm g;
    private final Optional h;

    public faa(faz faz2, fbm fbm2, Optional optional, hpq hpq2, ezu ezu2, dxi dxi2, Boolean bl2) {
        this.f = faz2;
        this.g = fbm2;
        this.h = optional;
        this.b = hpq2;
        this.c = ezu2;
        this.d = dxi2;
        this.e = bl2;
    }

    private final hpn j(ezj object, boolean bl2, Optional optional, Optional object2) {
        int n2 = ((ezj)object).h - 1;
        if (n2 != 1) {
            if (n2 != 2) {
                ((hfk)((hfk)a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "installPackageInternal", 340, "DefaultLanguagePackManagerImpl.java")).u("#installPackage called with an undefined installation type. Returning undefined descriptor. Raw request descriptor: %s", object);
                return hhk.K(ezg.a);
            }
            ((hfk)((hfk)a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "installPackageInternal", 330, "DefaultLanguagePackManagerImpl.java")).u("#installPackage called for a system partition LP. This makes no sense and is a noop: and LP will remain installed if it exists. Raw request descriptor: %s", object);
            return hhk.K(object);
        }
        if (bl2) {
            if (((Optional)object2).isPresent()) {
                object = this.g.n((ezj)object, (ezf)optional.get(), (Optional)object2);
            } else {
                object2 = this.g;
                Object t2 = optional.get();
                optional = Optional.empty();
                object = ((fbm)object2).n((ezj)object, (ezf)t2, optional);
            }
        } else {
            object = this.g.m((ezj)object);
        }
        return fxf.aj((hpn)object, new ezt(this, 8), this.b);
    }

    private final hpn k(hpn hpn2, hpn hpn3, hpn hpn4) {
        return fxf.aE(hpn2, hpn3, hpn4).B(new cmq((Object)hpn2, (Object)hpn3, (Object)hpn4, 8, null), this.b);
    }

    @Override
    public final hpn a() {
        return grf.g(this.c()).i(new ezz(this, 1), this.b).h(new dti(12), this.b);
    }

    @Override
    public final /* synthetic */ hpn b(Object object) {
        hfn hfn2 = a;
        ((hfk)((hfk)hfn2.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "deletePackage", 362, "DefaultLanguagePackManagerImpl.java")).r("#deletePackage");
        this.d.a(dxv.E);
        ezj ezj2 = (ezj)object;
        int n2 = ezj2.h - 1;
        if (n2 != 1) {
            if (n2 != 2) {
                ((hfk)((hfk)hfn2.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "deletePackage", 385, "DefaultLanguagePackManagerImpl.java")).u("#deletePackage called with an undefined installation type. Returning undefined descriptor. Raw request descriptor: %s", object);
                object = hhk.K(ezg.a);
            } else {
                ((hfk)((hfk)hfn2.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "deletePackage", 374, "DefaultLanguagePackManagerImpl.java")).u("#deletePackage called for a system partition LP. This makes no sense and is a noop: and LP will remain installed if it exists. Raw request descriptor: %s", object);
                object = hhk.K(object);
            }
        } else {
            object = fxf.aj(this.g.k(ezj2), new ezt(this, 4), this.b);
        }
        return object;
    }

    @Override
    public final hpn c() {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "getAvailablePackages", 68, "DefaultLanguagePackManagerImpl.java")).r("#getAvailablePackages");
        this.d.a(dxv.A);
        hpn hpn2 = this.g.c();
        hpn hpn3 = this.f.c();
        Object object = new bpf(20);
        object = this.h.map(object);
        int n2 = gzx.d;
        return fxf.aj(this.k(hpn2, hpn3, ((Optional)object).orElse(hhk.K(hct.a))), new ezt(this, 3), this.b);
    }

    @Override
    public final hpn d() {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "getInstalledPackages", 90, "DefaultLanguagePackManagerImpl.java")).r("#getInstalledPackages");
        this.d.a(dxv.B);
        hpn hpn2 = this.g.d();
        hpn hpn3 = this.f.d();
        Object object = new bpf(19);
        object = this.h.map(object);
        int n2 = gzx.d;
        return fxf.aj(this.k(hpn2, hpn3, ((Optional)object).orElse(hhk.K(hct.a))), new ezt(this, 2), this.b);
    }

    @Override
    public final /* synthetic */ hpn e(Object object) {
        Object object2 = a;
        ((hfk)((hfk)((hdz)object2).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "getPackage", 394, "DefaultLanguagePackManagerImpl.java")).r("#getPackage");
        this.d.a(dxv.F);
        ezj ezj2 = (ezj)object;
        int n2 = ezj2.h - 1;
        if (n2 != 1) {
            if (n2 != 2) {
                ((hfk)((hfk)((hdz)object2).g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "getPackage", 424, "DefaultLanguagePackManagerImpl.java")).u("#getPackage called with an undefined installation type. Returning unpopulated LanguagePackPackage. Raw request descriptor: %s", object);
                object = gsl.a;
                object = hhk.K(new ezm(ezj2, (gto)object, (gto)object));
            } else {
                object2 = this.f;
                ((hfk)((hfk)faz.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/systempartition/SystemImageLanguagePackSourceImpl", "getPackage", 207, "SystemImageLanguagePackSourceImpl.java")).r("#getPackage");
                ((faz)object2).c.a(dxv.ac);
                if (ezj2.h == 3 && ezj2.g.g()) {
                    object = hhk.K(ezm.a(ezj2, ((ezh)ezj2.g.c()).a));
                    ((faz)object2).c.a(dxv.ad);
                } else {
                    ((hfk)((hfk)faz.a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/systempartition/SystemImageLanguagePackSourceImpl", "getPackage", 211, "SystemImageLanguagePackSourceImpl.java")).u("#getPackage was called on a descriptor that was invalid for system partition LanguagePacks. Call this method only on descriptors returned from #getAvailablePackages() or #getInstalledPackages(): %s.", object);
                    object = gsl.a;
                    object = hhk.K(new ezm(ezj2, (gto)object, (gto)object));
                }
                object = fxf.aj((hpn)object, new ezt(this, 7), this.b);
            }
        } else {
            object = fxf.aj(this.g.l(ezj2), new ezt(this, 6), this.b);
        }
        return object;
    }

    @Override
    public final hpn f() {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "getRequestedPackages", 113, "DefaultLanguagePackManagerImpl.java")).r("#getRequestedPackages");
        this.d.a(dxv.C);
        hpn hpn2 = this.g.f();
        hpn hpn3 = this.f.f();
        Object object = new fab(1);
        object = this.h.map(object);
        int n2 = gzx.d;
        return fxf.aj(this.k(hpn2, hpn3, ((Optional)object).orElse(hhk.K(hct.a))), new ezt(this, 5), this.b);
    }

    @Override
    public final hpn g() {
        hpn hpn2 = this.d();
        hpn hpn3 = this.f();
        hpn hpn4 = this.c();
        hpn hpn5 = fxf.ak(hpn2, new ezz(this, 0), this.b);
        hpn hpn6 = fxf.aE(hpn2, hpn3).C(new dcf(this, hpn2, (Object)hpn3, 6), this.b);
        hpn4 = fxf.aE(hpn2, hpn3, hpn4).B(new ddy(this, hpn2, hpn3, hpn4, 3), this.b);
        return fxf.aE(hpn5, hpn6, hpn4).B(new cmq((Object)hpn5, (Object)hpn6, (Object)hpn4, 7, null), this.b);
    }

    @Override
    public final hpn i(ezj ezj2, ezf ezf2, Optional optional) {
        if (optional.isEmpty()) {
            ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "installPackageWithForeground", 292, "DefaultLanguagePackManagerImpl.java")).r("#installPackageWithForegroundService");
            this.d.a(dxv.D);
            return this.j(ezj2, true, Optional.of(ezf2), Optional.empty());
        }
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/defaultmanager/DefaultLanguagePackManagerImpl", "installPackageWithForegroundCallback", 309, "DefaultLanguagePackManagerImpl.java")).r("#installPackageWithForegroundCallbackService");
        this.d.a(dxv.D);
        return this.j(ezj2, true, Optional.of(ezf2), optional);
    }
}

