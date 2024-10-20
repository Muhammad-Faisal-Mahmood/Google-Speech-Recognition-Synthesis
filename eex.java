/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.provider.Settings$Global
 */
import android.content.ContentResolver;
import android.provider.Settings;
import j$.util.Collection$_EL;
import java.util.HashMap;

public final class eex
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ eex(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object apply(Object object) {
        switch (this.b) {
            default: {
                object = (far)object;
                Object object2 = ezu.a;
                object2 = far.a.l();
                hat hat2 = new hat();
                hat2.i(((far)object).b);
                hat2.j(this.a);
                ((hwp)object2).I(((gzm)hat2.g()).f());
                return (far)((hwp)object2).o();
            }
            case 19: {
                object = (hav)object;
                HashMap<faq, Object> hashMap = new HashMap<faq, Object>();
                hdx hdx2 = ((hav)object).k();
                while (hdx2.hasNext()) {
                    Object object3 = this.a;
                    faq faq2 = (faq)hdx2.next();
                    object = gsl.a;
                    object3 = ((hav)object3).k();
                    while (object3.hasNext()) {
                        ezj ezj2 = (ezj)object3.next();
                        if ((faq2.c & 1) == 0) {
                            ((hfk)((hfk)ezu.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "isPackRelevantForRequest", 199, "LanguagePackRequestState.java")).r("Languagepack request is missing locale. This is probably a bug by the caller.");
                        }
                        if ((faq2.c & 1) != 0 && !faq2.d.equals(ezj2.a.toLanguageTag()) || (faq2.c & 2) != 0 && faq2.e != (long)ezj2.b || ((gto)object).g() && ((ezj)((gto)object).c()).b >= ezj2.b && (((ezj)((gto)object).c()).b != ezj2.b || ezj2.c())) continue;
                        object = gto.i(ezj2);
                    }
                    ((hfk)((hfk)ezu.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "resolveDesiredLanguagePacks", 114, "LanguagePackRequestState.java")).C("Assigning language pack %s for request %s", object, faq2);
                    hashMap.put(faq2, object);
                }
                return (hav)Collection$_EL.stream(hashMap.entrySet()).filter(new boa(20)).map(new bpf(18)).distinct().collect(gye.b);
            }
            case 18: {
                return a.n((jrk)this.a, object);
            }
            case 17: {
                return this.a.a(object);
            }
            case 16: {
                hfn hfn2 = ezs.a;
                return this.a.a(object);
            }
            case 15: {
                hfn hfn3 = ezs.a;
                return this.a.a(object);
            }
            case 14: {
                hfn hfn4 = ezs.a;
                return this.a.a(object);
            }
            case 13: {
                Object object4;
                object = object4 = fao.b(((fap)object).c);
                if (object4 == null) {
                    object = fao.a;
                }
                object4 = object;
                if (((Enum)object).equals(fao.a)) {
                    object = Settings.Global.getInt((ContentResolver)((ezk)this.a).b.getContentResolver(), (String)"repair_mode_active", (int)0) > 0 ? fao.b : fao.c;
                    ((hfk)((hfk)ezk.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackDownloadSettingsState", "getBackgroundDownloadCondition", 47, "LanguagePackDownloadSettingsState.java")).u("Defaulting LP download condition to %s as user has not edited settings.", object);
                    object4 = object;
                }
                return object4;
            }
            case 12: {
                fap fap2 = (fap)object;
                hfk hfk2 = (hfk)((hfk)ezk.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackDownloadSettingsState", "setBackgroundDownloadCondition", 63, "LanguagePackDownloadSettingsState.java");
                fao fao2 = fao.b(fap2.c);
                object = fao2;
                if (fao2 == null) {
                    object = fao.a;
                }
                fao2 = (fao)this.a;
                hfk2.v("Updating LanguagePack background download condition from %d -> %d", ((fao)object).e, fao2.e);
                object = (hwp)fap2.C(5);
                ((hwp)object).x(fap2);
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                fap2 = (fap)((hwp)object).b;
                fap2.c = fao2.e;
                fap2.b |= 1;
                return (fap)((hwp)object).o();
            }
            case 11: {
                return this.a.a(object);
            }
            case 10: {
                return this.a.a(object);
            }
            case 9: {
                return a.n((jrk)this.a, object);
            }
            case 8: {
                return a.n((jrk)this.a, object);
            }
            case 7: {
                return this.a.a(object);
            }
            case 6: {
                return a.n((jrk)this.a, object);
            }
            case 5: {
                return a.n((jrk)this.a, object);
            }
            case 4: {
                return this.a.a(object);
            }
            case 3: {
                return this.a.a(object);
            }
            case 2: {
                return this.a.a(object);
            }
            case 1: {
                object = (Void)object;
                object = ((dzg)this.a).b.iterator();
                while (object.hasNext()) {
                    ((dyh)object.next()).c();
                }
                return null;
            }
            case 0: 
        }
        return this.a.a(object);
    }
}

