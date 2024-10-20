/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.stream.Stream;

public final class fbq
implements imb {
    private final jnu a;

    public fbq(jnu jnu2) {
        this.a = jnu2;
    }

    public final gzx a() {
        fam fam2 = ((isc)this.a).a();
        Object object = (heg)((heg)fbo.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/inject/ZipfileLanguagePackFlagProviderModule", "trainingPlanConfigs", 44, "ZipfileLanguagePackFlagProviderModule.java");
        Stream stream = Collection$_EL.stream(fam2.b).map(new fab(15));
        int n2 = gzx.d;
        object.u("Loaded training plan flag value from latest config: %s", stream.collect(gye.a));
        object = gzx.o(fam2.b);
        idi.m(object);
        return object;
    }
}

