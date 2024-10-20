/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.concurrent.Executor;

public final class ezu {
    public static final hfn a = hfn.o("LPRequestState");
    public final String b;
    public final boolean c;
    private final hpq d;
    private final boolean e;
    private final frr f;

    public ezu(frr frr2, hpq hpq2, String string, boolean bl2, boolean bl3) {
        this.f = frr2;
        this.d = hpq2;
        this.b = string;
        this.c = bl2;
        this.e = bl3;
    }

    public final hpn a(faq object) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "addRequest", 85, "LanguagePackRequestState.java")).u("[%s] #addRequest", this.b);
        eex eex2 = new eex(object, 20);
        object = this.d;
        return this.f.b(eex2, (Executor)object);
    }

    public final hpn b(faq object) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "deleteRequest", 66, "LanguagePackRequestState.java")).u("[%s] #deleteRequest", this.b);
        bte bte2 = new bte(this, object, 15);
        object = this.d;
        return this.f.b(bte2, (Executor)object);
    }

    public final hpn c(hav hav2) {
        Object object = a;
        ((hfk)((hfk)((hdz)object).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "resolveDesiredLanguagePacks", 106, "LanguagePackRequestState.java")).u("[%s] #resolveDesiredLanguagePacks", this.b);
        if (this.e && Build.VERSION.SDK_INT < 31) {
            ((hfk)((hfk)((hdz)object).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "getPersistedRequests", 157, "LanguagePackRequestState.java")).r("getPersistedRequests: returning empty set for pre-S devices");
            object = hhk.K(hdc.a);
        } else {
            object = fxf.aj(this.f.a(), new ezt(this, 1), this.d);
        }
        return fxf.aj((hpn)object, new eex(hav2, 19), this.d);
    }

    public final hpn d(hav hav2) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/LanguagePackRequestState", "resolveUnusedLanguagePacks", 138, "LanguagePackRequestState.java")).u("[%s] #resolveUnusedLanguagePacks", this.b);
        return fxf.aj(this.c(hav2), new ezt(hav2, 0), this.d);
    }
}

