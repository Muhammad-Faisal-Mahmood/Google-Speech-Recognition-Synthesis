/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;

public final class fbm
implements ezl,
ezv {
    public static final hfn a = hfn.o("ZipfileLPSourceImpl");
    public final cty b;
    public final fbj c;
    public final fbe d;
    public final Boolean e;
    public final Context f;
    public final fac g;
    public final dxi h;
    public final fat i;
    public final hpq j;
    private final ezu k;
    private final hpq l;
    private final bmu m;

    public fbm(cty cty2, bmu bmu2, fbj fbj2, ezu ezu2, fbe fbe2, Boolean bl2, fac fac2, Context context, dxi dxi2, fat fat2, hpq hpq2, hpq hpq3) {
        this.b = cty2;
        this.m = bmu2;
        this.c = fbj2;
        this.k = ezu2;
        this.d = fbe2;
        this.e = bl2;
        this.g = fac2;
        this.f = context;
        this.h = dxi2;
        this.i = fat2;
        this.j = hpq2;
        this.l = hpq3;
    }

    private final hpn p(Locale object, int n2) {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "requestPack", 312, "ZipfileLanguagePackSourceImpl.java")).r("#requestPack");
        hwp hwp2 = faq.b.l();
        object = ((Locale)object).toLanguageTag();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        faq faq2 = (faq)hwv2;
        object.getClass();
        faq2.c |= 1;
        faq2.d = object;
        long l2 = n2;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = (faq)hwp2.b;
        ((faq)object).c |= 2;
        ((faq)object).e = l2;
        object = (faq)hwp2.o();
        return fxf.ak(this.k.a((faq)object), new ezz(this, 7), this.j);
    }

    @Override
    public final hpn a() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final hpn c() {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getAvailablePackages", 116, "ZipfileLanguagePackSourceImpl.java")).r("#getAvailablePackages");
        this.h.a(dxv.M);
        return fxf.aj(this.d.a(), new ezt(this, 13), this.j);
    }

    @Override
    public final hpn d() {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getInstalledPackages", 129, "ZipfileLanguagePackSourceImpl.java")).r("#getInstalledPackages");
        this.h.a(dxv.O);
        return fxf.aj(this.d.b(this.b), new ezt(this, 14), this.j);
    }

    @Override
    public final hpn f() {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getRequestedPackages", 143, "ZipfileLanguagePackSourceImpl.java")).r("#getRequestedPackages");
        this.h.a(dxv.Q);
        grf grf2 = grf.g(this.c.b(this.b)).i(new ezz(this, 8), this.j).h(new ezt(this, 15), this.j);
        grf.g(grf2).i(new ezz(this, 9), this.j).j(new cur(4), this.j);
        return grf2;
    }

    @Override
    public final hpn g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final hpn i(ezj ezj2, ezf ezf2, Optional optional) {
        return this.n(ezj2, ezf2, optional);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ezm j(ezj ezj2, csg object) {
        int n2 = a.v(((csg)object).g);
        if (n2 != 0 && n2 == 2) {
            gsl gsl2;
            block20: {
                Object object2;
                Object object3;
                block23: {
                    Object object4;
                    Object object5 = a;
                    ((hfk)((hfk)((hdz)object5).b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 417, "ZipfileLanguagePackSourceImpl.java")).r("Resolving downloaded LanguagePackPackage from metadata file");
                    try {
                        object3 = Collection$_EL.stream(((csg)object).h);
                        object4 = new fay(10);
                        object4 = a.aw(((csf)object3.filter(object4).collect(hcd.c)).d, "/metadata");
                        object3 = this.m;
                        object4 = Uri.parse((String)object4);
                        object2 = new fqo();
                        ((fqo)object2).b();
                        object3 = (File)((bmu)object3).w((Uri)object4, (fpp)object2);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        break block20;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                        break block20;
                    }
                    ((hfk)((hfk)((hdz)object5).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 438, "ZipfileLanguagePackSourceImpl.java")).u("Found LanguagePack metadata file with path: %s", ((File)object3).getAbsolutePath());
                    object2 = ((File)object3).getParentFile();
                    if (object2 == null) {
                        ((hfk)((hfk)((hdz)object5).h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 442, "ZipfileLanguagePackSourceImpl.java")).C("LanguagePack %s seemed to be downloaded, but parent directory somehow does not exist. Child directory: %s", ezj2, ((File)object3).getAbsolutePath());
                        object = gsl.a;
                        return new ezm(ezj2, (gto)object, (gto)object);
                    }
                    Optional optional = (Optional)Collection$_EL.stream(((csg)object).h).filter(new fay(9)).collect(hcd.a);
                    if (optional.isEmpty()) {
                        object3 = gsl.a;
                    } else {
                        block21: {
                            Object object6;
                            block22: {
                                try {
                                    object4 = this.m;
                                    object3 = Uri.parse((String)((csf)optional.get()).d);
                                    object6 = new fqo();
                                    ((fqo)object6).b();
                                    object6 = (File)((bmu)object4).w((Uri)object3, (fpp)object6);
                                    if ((((csf)optional.get()).b & 0x10) == 0) break block21;
                                    object3 = object4 = ((csf)optional.get()).g;
                                    if (object4 == null) {
                                        object3 = hvi.a;
                                    }
                                    if ("type.googleapis.com/java.com.google.android.libraries.speech.modeldownload.languagepacks.personalization.TrainingPlanZipfile".equals(((hvi)object3).b)) break block22;
                                    break block21;
                                }
                                catch (IOException iOException) {
                                    ((hfk)((hfk)((hfk)a.h()).i(iOException)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "extractInstalledTrainingPlan", 485, "ZipfileLanguagePackSourceImpl.java")).s("Training plan %d seemed to be present, but disk read failed.", ((csg)object).f);
                                    object3 = gsl.a;
                                    break block23;
                                }
                            }
                            try {
                                object5 = fan.a.l();
                                object3 = object4 = ((csf)optional.get()).g;
                                if (object4 == null) {
                                    object3 = hvi.a;
                                }
                                object4 = ((hvi)object3).c;
                                object3 = hwj.a();
                            }
                            catch (hxn hxn2) {
                                ((hfk)((hfk)((hfk)a.h()).i(hxn2)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "extractInstalledTrainingPlan", 509, "ZipfileLanguagePackSourceImpl.java")).s("Training plan %d seemed to be present, but failed to parse metadata.", ((csg)object).f);
                                object3 = gsl.a;
                            }
                            object4 = ((hvu)object4).k();
                            ((hwp)object5).w((hvy)object4, (hwj)object3);
                            ((hvy)object4).z(0);
                            {
                                catch (IOException iOException) {
                                    object4 = new RuntimeException(((hvc)object5).h(), iOException);
                                    throw object4;
                                }
                                catch (hxn hxn3) {
                                    throw hxn3;
                                }
                                long l2 = ((csf)optional.get()).e;
                                if (!((hwp)object5).b.B()) {
                                    ((hwp)object5).u();
                                }
                                object3 = (fan)((hwp)object5).b;
                                ((fan)object3).b |= 8;
                                ((fan)object3).f = l2;
                                object3 = ((File)object6).getAbsolutePath();
                                if (!((hwp)object5).b.B()) {
                                    ((hwp)object5).u();
                                }
                                object4 = (fan)((hwp)object5).b;
                                object3.getClass();
                                ((fan)object4).b |= 0x10;
                                ((fan)object4).g = object3;
                                object3 = gto.i((fan)((hwp)object5).o());
                                break block23;
                            }
                        }
                        ((hfk)((hfk)((hdz)object5).h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "extractInstalledTrainingPlan", 494, "ZipfileLanguagePackSourceImpl.java")).s("Training plan %d seemed to be present, but metadata is missing.", ((csg)object).f);
                        object3 = gsl.a;
                    }
                }
                ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 452, "ZipfileLanguagePackSourceImpl.java")).H("Returning LanguagePack path for locale %s, version %d from MDD with group name '%s': '%s'", ezj2.a, ezj2.b, ((csg)object).c, ((File)object2).getAbsolutePath());
                if (((gto)object3).g()) {
                    object = ((File)object2).getAbsolutePath();
                    object3 = ((gto)object3).c();
                    return new ezm(ezj2, gto.i(object), gto.i(object3));
                }
                return ezm.a(ezj2, ((File)object2).getAbsolutePath());
            }
            ((hfk)((hfk)((hfk)a.h()).i((Throwable)((Object)gsl2))).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 433, "ZipfileLanguagePackSourceImpl.java")).u("LanguagePack %s seemed to be downloaded, but disk read failed.", ezj2);
            gsl2 = gsl.a;
            return new ezm(ezj2, gsl2, gsl2);
        }
        hfk hfk2 = (hfk)((hfk)a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getLanguagePackPackage", 410, "ZipfileLanguagePackSourceImpl.java");
        String string = ((csg)object).c;
        n2 = a.v(((csg)object).g);
        object = n2 != 0 && n2 != 1 ? (n2 != 2 ? (n2 != 3 ? "PENDING_CUSTOM_VALIDATION" : "PENDING") : "DOWNLOADED") : "UNSPECIFIED";
        hfk2.G("LanguagePack %s is not downloaded, yet its read was requested. Caller probably made an error. MDD group %s download status: %s.", ezj2, string, object);
        object = gsl.a;
        return new ezm(ezj2, (gto)object, (gto)object);
    }

    public final hpn k(ezj ezj2) {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "deletePackage", 326, "ZipfileLanguagePackSourceImpl.java")).r("#deletePackage");
        this.h.a(dxv.U);
        hyg hyg2 = faq.b.l();
        String string = ezj2.a.toLanguageTag();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hwv hwv2 = hyg2.b;
        faq faq2 = (faq)hwv2;
        string.getClass();
        faq2.c |= 1;
        faq2.d = string;
        long l2 = ezj2.b;
        if (!hwv2.B()) {
            hyg2.u();
        }
        faq2 = (faq)hyg2.b;
        faq2.c |= 2;
        faq2.e = l2;
        hyg2 = (faq)hyg2.o();
        return grf.g(this.k.b((faq)hyg2)).i(new fbk(this, ezj2, 0), this.j).i(new fbk(this, ezj2, 2), this.j).h(new bte(this, ezj2, 16, null), this.j);
    }

    public final hpn l(ezj ezj2) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getPackage", 373, "ZipfileLanguagePackSourceImpl.java")).r("#getPackage");
        this.h.a(dxv.W);
        String string = fbf.a(ezj2.a.toLanguageTag(), ezj2.b);
        return grf.g(this.c.b(this.b)).i(new fbk(this, string, 3, null), this.j).h(new cvp(this, ezj2, string, 3), this.l);
    }

    public final hpn m(ezj ezj2) {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "installPackage", 200, "ZipfileLanguagePackSourceImpl.java")).r("#installPackage");
        this.h.a(dxv.S);
        return grf.g(this.p(ezj2.a, ezj2.b)).i(new fbk(this, ezj2, 4), this.j).h(new bte(this, ezj2, 17, null), this.j);
    }

    public final hpn n(ezj ezj2, ezf ezf2, Optional optional) {
        ((hfk)((hfk)a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "installPackageHelper", 232, "ZipfileLanguagePackSourceImpl.java")).r("#installPackageWithForegroundCallback");
        this.h.a(dxv.S);
        return grf.g(this.p(ezj2.a, ezj2.b)).i(new fbl(this, optional, ezj2, ezf2, 0), this.j).h(new bte(this, ezj2, 18, null), this.j);
    }

    public final hpn o(ezj object) {
        this.i.c((ezj)object);
        String string = fbf.a(((ezj)object).a.toLanguageTag(), ((ezj)object).b);
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "startDownloadInBackground", 303, "ZipfileLanguagePackSourceImpl.java")).u("MDD.downloadFileGroup(%s)", string);
        cst cst2 = csu.a();
        cst2.b(string);
        cst2.c((int)((ezj)object).e);
        object = cst2.a();
        return this.b.b((csu)object);
    }
}

