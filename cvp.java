/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class cvp
implements gte {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cvp(byu byu2, hpn hpn2, String string, int n2) {
        this.d = n2;
        this.c = byu2;
        this.a = hpn2;
        this.b = string;
    }

    public /* synthetic */ cvp(fbm fbm2, ezj ezj2, String string, int n2) {
        this.d = n2;
        this.a = fbm2;
        this.c = ezj2;
        this.b = string;
    }

    public /* synthetic */ cvp(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    @Override
    public final Object apply(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object2 = (csg)object;
                    object = this.c;
                    if (object2 == null) {
                        ((hfk)((hfk)fbm.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getPackage", 393, "ZipfileLanguagePackSourceImpl.java")).u("LanguagePack %s is not known by MDD. Caller probably made an error.", object);
                        object2 = gsl.a;
                        object = new ezm((ezj)object, (gto)object2, (gto)object2);
                    } else {
                        Object object3 = this.b;
                        Object object4 = this.a;
                        ((hfk)((hfk)fbm.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackSourceImpl", "getPackage", 398, "ZipfileLanguagePackSourceImpl.java")).u("MDD.getFileGroup(%s) complete", object3);
                        object3 = dxv.X;
                        object4 = (fbm)object4;
                        ((fbm)object4).h.a((dyk)object3);
                        object = ((fbm)object4).j((ezj)object, (csg)object2);
                    }
                    return object;
                }
                object = (String)object;
                Object object5 = new StringBuilder("mdd_");
                ((StringBuilder)object5).append(((cyn)this.c).a);
                ((StringBuilder)object5).append("_");
                ((StringBuilder)object5).append((String)object);
                String string = ((StringBuilder)object5).toString();
                object5 = ((cyo)this.a).a;
                Object object6 = this.b;
                return cyo.e(((csw)object5).a(), string, (int[])object6, (String)object);
            }
            Object object7 = this.a;
            Object object8 = (ezo)object;
            object = hcy.a;
            try {
                object = object7 = (hac)hhk.S((Future)object7);
            }
            catch (ExecutionException executionException) {
                ((hfk)((hfk)((hfk)byu.a.h()).i(executionException)).j("com/google/android/apps/speech/tts/googletts/settings/asr/dataservice/impl/LanguagePackSettingsDataServiceImpl", "getSupportedLocalesSource", 114, "LanguagePackSettingsDataServiceImpl.java")).r("Language names could not be read properly! The settings page may not have readable language names.");
            }
            Object object9 = this.b;
            object7 = this.c;
            object = (hac)Collection$_EL.stream(crh.B(hav.n(((ezo)object8).a))).filter(new bod(object8, 8)).filter(new boa(13)).collect(gye.a(new bpf(12), new fbi(object, object8, 1)));
            object8 = dxv.ax.b("timestamp", (String)object9).j();
            ((byu)object7).f.a((dyk)object8);
            return object;
        }
        if (((Boolean)object).booleanValue()) {
            ((AtomicInteger)this.b).getAndIncrement();
        } else {
            object = this.c;
            ((cyu)((dmt)this.a).g).d(1036);
            cyr.h("%s: Unsubscribe from file %s failed!", "ExpirationHandler", object);
        }
        return null;
    }
}

