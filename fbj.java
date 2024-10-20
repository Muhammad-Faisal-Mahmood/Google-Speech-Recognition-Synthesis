/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class fbj
implements csx {
    public static final hfn a = hfn.o("ZipLPPopulator");
    public final jnu b;
    public final ezu c;
    public final ezk d;
    public final hpq e;
    private final iku f;
    private final Context g;

    public fbj(iku iku2, jnu jnu2, ezu ezu2, ezk ezk2, Context context, hpq hpq2) {
        this.f = iku2;
        this.b = jnu2;
        this.c = ezu2;
        this.d = ezk2;
        this.g = context;
        this.e = hpq2;
    }

    public static String c(ezj ezj2) {
        return fbf.a(ezj2.a.toLanguageTag(), ezj2.b);
    }

    @Override
    public final hpn a(cty cty2) {
        Object object = a;
        ((hfk)((hfk)((hfk)((hdz)object).f()).k(hfj.b)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "refreshFileGroups", 100, "ZipfileLanguagePackPopulator.java")).r("#scheduleLanguagePackDeletion");
        if (crt.d(this.g)) {
            ((hfk)((hfk)((hdz)object).f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "refreshFileGroups", 103, "ZipfileLanguagePackPopulator.java")).r("Skipping ZipfileLanguagePack #refreshFileGroups because of direct boot mode.");
            return hpj.a;
        }
        object = this.b(cty2);
        fxf.al((hpn)object, new ena(this, cty2, 6), this.e);
        return object;
    }

    public final hpn b(cty cty2) {
        ((hfk)((hfk)a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "addNewFileGroups", 138, "ZipfileLanguagePackPopulator.java")).r("#addNewFileGroups");
        return grf.g(((fbe)this.f.b()).a()).i(new ezz(this, 6), this.e).i(new fbk(this, cty2, 1), this.e);
    }

    public final void d(cty cty2) {
        grf.g(((fbe)this.f.b()).b(cty2)).i(new ezz(this, 4), this.e).i(new ezz(cty2, 5), this.e).j(new cur(3), this.e);
    }
}

