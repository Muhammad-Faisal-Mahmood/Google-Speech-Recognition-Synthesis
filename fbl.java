/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.util.AbstractCollection;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

public final class fbl
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ fbl(fbm fbm2, Optional optional, ezj ezj2, ezf ezf2, int n2) {
        this.e = n2;
        this.a = fbm2;
        this.b = optional;
        this.c = ezj2;
        this.d = ezf2;
    }

    public /* synthetic */ fbl(fcf fcf2, Locale locale, idq idq2, String string, int n2) {
        this.e = n2;
        this.d = fcf2;
        this.b = locale;
        this.c = idq2;
        this.a = string;
    }

    public /* synthetic */ fbl(hpn hpn2, hpn hpn3, gpc gpc2, hpn hpn4, int n2) {
        this.e = n2;
        this.c = hpn2;
        this.a = hpn3;
        this.d = gpc2;
        this.b = hpn4;
    }

    public /* synthetic */ fbl(String string, dvt dvt2, dua dua2, dwn dwn2, int n2) {
        this.e = n2;
        this.b = string;
        this.c = dvt2;
        this.d = dua2;
        this.a = dwn2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    TimeoutException timeoutException = (TimeoutException)object;
                    Object object2 = this.c;
                    n2 = gqq.a;
                    if (!object2.isDone()) {
                        object = this.d;
                        if (object != null) {
                            timeoutException.setStackTrace(gqq.l((gpc)object, null));
                            gqq.i((gpc)object, timeoutException);
                            gqq.g((gpc)object, timeoutException);
                        }
                        hhk.V((hpn)this.b, (Future)object2);
                    }
                    return this.a;
                }
                Object object3 = Collection$_EL.stream((hav)object);
                object = this.b;
                object3 = object3.filter(new fai(object, 6));
                n2 = gzx.d;
                if (((AbstractCollection)(object3 = (gzx)object3.collect(gye.a))).isEmpty()) {
                    Object object4 = this.c;
                    object3 = idq.j;
                    if (((idq)object4).equals(object3)) {
                        Optional<Object> optional = this.a;
                        Object object5 = this.d;
                        ((heg)((heg)fcf.a.b().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getMatchingPack", 256, "ModelManagerImpl.java")).r("Client requested application domain with no matching pack. Fallback to DEFAULT_CONTINUOUS.");
                        object3 = gto.i(idq.c);
                        object4 = hdc.a;
                        optional = Optional.of(optional);
                        object5 = (fcf)object5;
                        object = fxf.aj(((fcf)object5).b.c((gto)object3, (hav)object4, optional), new ezt(object, 16), ((fcf)object5).c);
                    } else {
                        object = hhk.K(Optional.empty());
                    }
                } else {
                    if (((AbstractCollection)object3).size() > 1) {
                        ((heg)((heg)fcf.a.g().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getMatchingPack", 290, "ModelManagerImpl.java")).r("Client requested locale, applicationDomain and multiple matches were returned from LanguagePackChooser. This should be impossible, but proceeding with an arbitrarily-selected pack.");
                    }
                    object = hhk.K(Optional.of((ezj)object3.get(0)));
                }
                return object;
            }
            Object object6 = (String)object;
            if (!((String)object6).equals(object = this.b)) {
                object = hpj.a;
            } else {
                object6 = this.c;
                if (dwa.c.containsKey(new gtp(((dvt)object6).a, object))) {
                    object = hpj.a;
                } else {
                    object = this.a;
                    object = ((dua)this.d).b().a(((dwn)object).c);
                }
            }
            return object;
        }
        object = (Void)object;
        object = new fab(13);
        Object object7 = ((Optional)this.b).map(object).orElse(gsl.a);
        Object object8 = this.c;
        object = (fbm)this.a;
        boolean bl2 = ((fbm)object).e;
        Object object9 = ((fbm)object).i;
        object8 = (ezj)object8;
        ((fat)object9).c((ezj)object8);
        Object object10 = fbf.a(((ezj)object8).a.toLanguageTag(), ((ezj)object8).b);
        object9 = csu.a();
        ((cst)object9).b((String)object10);
        ((cst)object9).c((int)((ezj)object8).e);
        if (object7 != null) {
            ((cst)object9).d = object7;
            if (!bl2) {
                ((hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "startDownload", 275, "ZipfileLanguagePackSourceImpl.java")).u("MDD.downloadFileGroup(%s)", object10);
                object = ((fbm)object).b.b(((cst)object9).a());
            } else {
                object7 = this.d;
                ((hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "startDownload", 279, "ZipfileLanguagePackSourceImpl.java")).u("MDD.downloadFileGroupWithForegroundService(%s)", object10);
                object10 = ((fbm)object).g;
                object8 = new ezt(((ezj)object8).a, 9);
                hpq hpq2 = ((fac)object10).b;
                object = fxf.ak(fxf.aj(((fac)object10).c, (gte)object8, hpq2), new cxe((fbm)object, (cst)object9, (ezf)object7, 10), ((fbm)object).j);
            }
            return object;
        }
        throw new NullPointerException("Null listenerOptional");
    }
}

