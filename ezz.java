/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Collection$_EL;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Locale;

public final class ezz
implements hny {
    public final Object a;
    private final int b;

    public /* synthetic */ ezz(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        switch (this.b) {
            default: {
                frp frp2 = (frp)this.a;
                frp2.c((Uri)hhk.S(frp2.b), object);
                return hpj.a;
            }
            case 19: {
                object = (hyf)object;
                return this.a.b((hyf)object);
            }
            case 18: {
                return ((fmj)this.a).a();
            }
            case 17: {
                return ((fmj)this.a).a();
            }
            case 16: {
                Exception exception = (Exception)object;
                a.as(fgw.a.h(), "start listening request failed.", "com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", '\u00ef', "AudioLibraryAudioController.java", exception);
                object = (fgw)this.a;
                if (((fgw)object).h == null) return hhk.J(exception);
                ((heg)((heg)fgw.a.f()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 241, "AudioLibraryAudioController.java")).s("remove attributionKey: %d", ((fgw)object).h.c);
                ((fgw)object).i.l(((fgw)object).h);
                return hhk.J(exception);
            }
            case 15: {
                Object object2;
                object = (eah)object;
                if (object.a().g()) {
                    ((fgw)this.a).c.p();
                    return hhk.K(object.a());
                }
                object = object2 = ((ear)object.f()).c;
                if (object2 == null) {
                    object = ebt.a;
                }
                if (((ebt)object).b == 2) {
                    object = object2 = ebs.b((Integer)((ebt)object).c);
                    if (object2 != null) return hhk.J(new fee(((ebs)object).ai));
                    object = ebs.a;
                    return hhk.J(new fee(((ebs)object).ai));
                } else {
                    object = ebs.a;
                }
                return hhk.J(new fee(((ebs)object).ai));
            }
            case 14: {
                object = (hac)object;
                fgo fgo2 = (fgo)this.a;
                if (!fgo2.y.k) return hhk.K(object);
                if (fgo2.k.B.isEmpty()) return hhk.K(object);
                int n2 = idi.a(((iel)fgo2.k.B.get()).c);
                if (n2 == 0) return hhk.K(object);
                if (n2 == 1) return hhk.K(object);
                return grf.g(fgo2.b.a("ag-AG", false, fgo2.k.h)).h(new ezt(object, 18), fgo2.d).f(Throwable.class, new ezz(object, 13), fgo2.d);
            }
            case 13: {
                object = (Throwable)object;
                Object object3 = this.a;
                ((heg)((heg)((heg)fgo.a.f()).i((Throwable)object)).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "includeUsmEncoderLanguagePackIfPossible", 326, "SodaSpeechRecognizer.java")).r("Can't get USM encoder LP.");
                return hhk.K(object3);
            }
            case 12: {
                Throwable throwable = (Throwable)object;
                boolean bl2 = throwable instanceof fdw;
                object = this.a;
                if (bl2) {
                    heg heg2 = (heg)((heg)fgo.a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", 394, "SodaSpeechRecognizer.java");
                    throwable = (fdw)throwable;
                    heg2.s("Failed to get language pack of required locale: error %d", ((fef)throwable).a.a);
                    ((fgo)object).l.c((fef)throwable);
                    return hpj.a;
                } else if (throwable instanceof fec) {
                    heg heg3 = (heg)((heg)fgo.a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", 399, "SodaSpeechRecognizer.java");
                    throwable = (fec)throwable;
                    heg3.s("Soda recognizer failed to initialize: ConfigStatus %d!", ((fef)throwable).a.a);
                    ((fgo)object).l.c((fef)throwable);
                    return hpj.a;
                } else {
                    a.as(fgo.a.g(), "Soda recognizer failed to initialize: ConfigStatus UNKNOWN_FAILURE!", "com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "handleStartListeningError", '\u0194', "SodaSpeechRecognizer.java", throwable);
                    ((fgo)object).l.c(new fec(igr.b));
                }
                return hpj.a;
            }
            case 11: {
                object = Collection$_EL.stream(((feo)object).b).filter(new fai(this.a, 11)).findFirst();
                if (!((Optional)object).isPresent()) return hhk.K("Unknown");
                return hhk.K(((fen)((Optional)object).get()).b);
            }
            case 10: {
                Object object4 = Collection$_EL.stream((hav)object);
                object = this.a;
                object4 = object4.filter(new fai(object, 10));
                int n3 = gzx.d;
                object4 = (gzx)object4.collect(gye.a);
                if (((AbstractCollection)object4).size() != 1) {
                    return hhk.J(new IllegalArgumentException(String.format(Locale.US, "Expected single downloadable pack for locale %s, but instead found %d: %s", object, ((AbstractCollection)object4).size(), object4)));
                }
                object4 = (ezj)object4.get(0);
                object = huw.b.l();
                Object object5 = ((ezj)object4).a.toLanguageTag();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                hwv hwv2 = ((hwp)object).b;
                huw huw2 = (huw)hwv2;
                object5.getClass();
                huw2.c |= 1;
                huw2.d = object5;
                n3 = ((ezj)object4).b;
                if (!hwv2.B()) {
                    ((hwp)object).u();
                }
                object5 = ((hwp)object).b;
                hwv2 = (huw)object5;
                ((huw)hwv2).c |= 4;
                ((huw)hwv2).f = n3;
                long l2 = ((ezj)object4).e / 1000L;
                if (!((hwv)object5).B()) {
                    ((hwp)object).u();
                }
                n3 = (int)l2;
                object4 = (huw)((hwp)object).b;
                ((huw)object4).c |= 0x20;
                ((huw)object4).g = n3;
                return hhk.K((huw)((hwp)object).o());
            }
            case 9: {
                gzx gzx2 = (gzx)object;
                Stream stream = Collection$_EL.stream(gzx2);
                object = this.a;
                stream = stream.map(new bof(object, 17));
                int n4 = gzx.d;
                return fxf.aD((Iterable)stream.collect(gye.a)).B(new bdr(gzx2, 18), ((fbm)object).j);
            }
            case 8: {
                object = (Void)object;
                ((hfk)((hfk)fbe.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "getPendingLanguagePacks", 83, "MddLanguagePackMonitor.java")).r("#getPendingPackages from MDD");
                object = (fbm)this.a;
                cty cty2 = ((fbm)object).b;
                return ((fbm)object).d.c(cty2, 3);
            }
            case 7: {
                object = (Void)object;
                object = (fbm)this.a;
                cty cty3 = ((fbm)object).b;
                return ((fbm)object).c.b(cty3);
            }
            case 6: {
                object = hav.n((gzx)object);
                return ((fbj)this.a).c.c((hav)object);
            }
            case 5: {
                object = Collection$_EL.stream((hav)object).map(new bof(this.a, 16));
                int n5 = gzx.d;
                return hhk.H((Iterable)object.collect(gye.a));
            }
            case 4: {
                object = hav.n((gzx)object);
                return ((fbj)this.a).c.d((hav)object);
            }
            case 3: {
                Stream stream = Collection$_EL.stream((hav)object);
                object = this.a;
                if (stream.anyMatch(new fai(object, 0))) {
                    ((hfk)((hfk)faj.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "returnException", 159, "LanguagePackDirGeneratorImpl.java")).r("Returning no LP, as MDD has not downloaded this pack yet.");
                    return hhk.J(new fdw(13, "Language pack not downloaded"));
                }
                ((hfk)((hfk)faj.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "returnException", 164, "LanguagePackDirGeneratorImpl.java")).u("Returning no LP, as MDD does not support locale: %s.", object);
                return hhk.J(new fdw(12, "Locale not supported"));
            }
            case 2: {
                Object object6 = (List)object;
                object = new gzy();
                object6 = object6.iterator();
                while (object6.hasNext()) {
                    Object object7;
                    Object object8 = (ezm)object6.next();
                    Object object9 = ((ezm)object8).a.a;
                    boolean bl3 = ((ezm)object8).b.g();
                    object9 = ((Locale)object9).toLanguageTag();
                    if (!bl3) {
                        object7 = this.a;
                        ((hfk)((hfk)faj.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "getLanguagePackInfo", 121, "LanguagePackDirGeneratorImpl.java")).u("Skipping LP for %s, as #getPackage did not return a complete LanguagePack reference. This should not be possible in the Installed set.", object9);
                        if (!((String)object9).equals(object7)) continue;
                        return hhk.J(new fdw(13, "MDD return 'installed' pack with no resources attached"));
                    }
                    ((hfk)((hfk)faj.a.f()).j("com/google/android/libraries/speech/modeldownload/languagepacks/inject/LanguagePackDirGeneratorImpl", "getLanguagePackInfo", 132, "LanguagePackDirGeneratorImpl.java")).u("Returning LanguagePack directory: %s", ((ezm)object8).b.c());
                    object7 = fjm.a.l();
                    Object object10 = ((ezm)object8).b.c();
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    hwv hwv3 = ((hwp)object7).b;
                    fjm fjm2 = (fjm)hwv3;
                    fjm2.b |= 2;
                    fjm2.d = (String)object10;
                    int n6 = ((ezm)object8).a.b;
                    if (!hwv3.B()) {
                        ((hwp)object7).u();
                    }
                    hwv3 = (fjm)((hwp)object7).b;
                    ((fjm)hwv3).b |= 1;
                    ((fjm)hwv3).c = n6;
                    if (((ezm)object8).c.g()) {
                        object8 = ((ezm)object8).c.c();
                        if (!((hwp)object7).b.B()) {
                            ((hwp)object7).u();
                        }
                        hwv3 = (fjm)((hwp)object7).b;
                        ((fjm)hwv3).e = (fan)object8;
                        ((fjm)hwv3).b |= 4;
                    }
                    ((gzy)object).d(object9, (fjm)((hwp)object7).o());
                }
                return hhk.K(((gzy)object).a());
            }
            case 1: {
                object = hav.n((gzx)object);
                return ((faa)this.a).c.c((hav)object);
            }
            case 0: 
        }
        object = hav.n((gzx)object);
        faa faa2 = (faa)this.a;
        return fxf.aj(faa2.c.d((hav)object), new dti(11), faa2.b);
    }
}

