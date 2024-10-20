/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.Optional;
import java.io.File;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

public final class ezt
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ ezt(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object apply(Object object) {
        switch (this.b) {
            default: {
                object = new fhc((fhd)object);
                ((fhc)object).e = ((fef)this.a).a;
                return ((fhc)object).a();
            }
            case 19: {
                Object object2 = (bmu)object;
                object = fhx.a.l();
                Object object3 = ((bmu)object2).b;
                Object object4 = (fhv)this.a;
                object3 = fjc.a((hav)object3, (fhv)object4);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                Object object5 = (fhx)((hwp)object).b;
                Object object6 = ((fhx)object5).b;
                if (!object6.c()) {
                    ((fhx)object5).b = hwv.s((hxk)object6);
                }
                hvc.g((Iterable)object3, ((fhx)object5).b);
                object5 = fjc.a((hav)((bmu)object2).a, (fhv)object4);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object6 = (fhx)((hwp)object).b;
                object3 = ((fhx)object6).d;
                if (!object3.c()) {
                    ((fhx)object6).d = hwv.s((hxk)object3);
                }
                hvc.g((Iterable)object5, ((fhx)object6).d);
                object4 = fjc.a((hav)((bmu)object2).c, (fhv)object4);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (fhx)((hwp)object).b;
                object2 = ((fhx)object3).c;
                if (!object2.c()) {
                    ((fhx)object3).c = hwv.s((hxk)object2);
                }
                hvc.g((Iterable)object4, ((fhx)object3).c);
                return (fhx)((hwp)object).o();
            }
            case 18: {
                object = (hac)object;
                Object object7 = fgo.a;
                fjm fjm2 = (fjm)((hac)object).get("ag-AG");
                object = this.a;
                if (fjm2 != null) {
                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 312, "SodaSpeechRecognizer.java")).r("Found USM encoder LP.");
                    object7 = new gzy();
                    ((gzy)object7).g((Map)object);
                    ((gzy)object7).d("ag-AG", fjm2);
                    object = ((gzy)object7).a();
                } else {
                    ((heg)((heg)fgo.a.f()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 318, "SodaSpeechRecognizer.java")).r("USM encoder LP not available.");
                }
                return object;
            }
            case 17: {
                object = (Throwable)object;
                ((heg)((heg)((heg)ffr.a.g().h(hfo.a, "OnDevicePrimaryRecog")).i((Throwable)object)).j("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer", "startListening", 122, "OnDevicePrimaryRecognizer.java")).r("Failed start OnDevicePrimaryRecognizer");
                object = new fdu();
                ((ffr)this.a).c.c((fef)object);
                return null;
            }
            case 16: {
                object = Collection$_EL.stream((hav)object).filter(new fai(this.a, 8));
                int n2 = gzx.d;
                object = (gzx)object.collect(gye.a);
                if (((AbstractCollection)object).isEmpty()) {
                    ((heg)((heg)fcf.a.h().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getMatchingPack", 274, "ModelManagerImpl.java")).r("Client requested applicationDomain fallback with no matching pack. Ignoring request.");
                    object = Optional.empty();
                } else {
                    if (((AbstractCollection)object).size() > 1) {
                        ((heg)((heg)fcf.a.g().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getMatchingPack", 279, "ModelManagerImpl.java")).r("Client requested locale, applicationDomain and multiple matches were returned from LanguagePackChooser. This should be impossible, but proceeding with an arbitrarily-selected pack.");
                    }
                    object = Optional.of((ezj)object.get(0));
                }
                return object;
            }
            case 15: {
                object = (gzx)object;
                Object object8 = this.a;
                dyo dyo2 = dxv.R;
                ((fbm)object8).h.a(dyo2);
                return object;
            }
            case 14: {
                gzx gzx2 = (gzx)object;
                object = this.a;
                dyo dyo3 = dxv.P;
                ((fbm)object).h.a(dyo3);
                return gzx2;
            }
            case 13: {
                object = (gzx)object;
                Object object9 = this.a;
                dyo dyo4 = dxv.N;
                ((fbm)object9).h.a(dyo4);
                return object;
            }
            case 12: {
                gzx gzx3 = (gzx)object;
                Object object10 = this.a;
                object = dxv.Z;
                ((faz)object10).c.a((dyk)object);
                return gzx3;
            }
            case 11: {
                gzx gzx4 = (gzx)object;
                object = this.a;
                dyo dyo5 = dxv.ab;
                ((faz)object).c.a(dyo5);
                return gzx4;
            }
            case 10: {
                Object object11 = (huw)object;
                object = faz.a;
                String string = ((huw)object11).d;
                int n3 = ((huw)object11).f;
                object = fah.b((huw)object11);
                object11 = fah.a((huw)object11);
                String string2 = ((File)this.a).getAbsolutePath();
                return new ezj(Locale.forLanguageTag(string), n3, 3, (hav)object, (hac)object11, 0L, gsl.a, gto.i(new ezh(string2)));
            }
            case 9: {
                object = (hac)object;
                Object object12 = fac.a;
                Locale locale = (Locale)this.a;
                object = object12 = (String)((hac)object).getOrDefault((Object)locale.toLanguageTag(), "");
                if (((String)object12).isEmpty()) {
                    ((hfk)((hfk)fac.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/displaynames/LanguageDisplayNames", "getDisplayName", 53, "LanguageDisplayNames.java")).u("Locale %s did not have a user-legible string associated. Returning raw locale code, but this may cause unfriendly UX.", locale.toLanguageTag());
                    object = locale.toLanguageTag();
                }
                return object;
            }
            case 8: {
                ezj ezj2 = (ezj)object;
                object = this.a;
                dyo dyo6 = dxv.J;
                ((faa)object).d.a(dyo6);
                return ezj2;
            }
            case 7: {
                object = (ezm)object;
                Object object13 = this.a;
                dyo dyo7 = dxv.L;
                ((faa)object13).d.a(dyo7);
                return object;
            }
            case 6: {
                object = (ezm)object;
                Object object14 = this.a;
                dyo dyo8 = dxv.L;
                ((faa)object14).d.a(dyo8);
                return object;
            }
            case 5: {
                gzx gzx5 = (gzx)object;
                Object object15 = this.a;
                object = dxv.I;
                ((faa)object15).d.a((dyk)object);
                return gzx5;
            }
            case 4: {
                ezj ezj3 = (ezj)object;
                object = this.a;
                dyo dyo9 = dxv.K;
                ((faa)object).d.a(dyo9);
                return ezj3;
            }
            case 3: {
                object = (gzx)object;
                Object object16 = this.a;
                dyo dyo10 = dxv.G;
                ((faa)object16).d.a(dyo10);
                return object;
            }
            case 2: {
                object = (gzx)object;
                Object object17 = this.a;
                dyo dyo11 = dxv.H;
                ((faa)object17).d.a(dyo11);
                return object;
            }
            case 1: {
                hyg hyg2 = (far)object;
                object = new hat();
                ((hat)object).i(((far)hyg2).b);
                if (((ezu)this.a).c) {
                    String string = Locale.getDefault().toLanguageTag();
                    hyg2 = faq.b.l();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    faq faq2 = (faq)((hwp)hyg2).b;
                    string.getClass();
                    faq2.c = 1 | faq2.c;
                    faq2.d = string;
                    ((hat)object).j((faq)((hwp)hyg2).o());
                }
                return ((hat)object).g();
            }
            case 0: 
        }
        object = (hav)object;
        return (hav)Collection$_EL.stream((Collection)this.a).filter(new bod(object, 13)).collect(gye.b);
    }
}

