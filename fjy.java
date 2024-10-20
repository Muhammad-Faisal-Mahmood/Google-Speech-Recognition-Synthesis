/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.speech.RecognitionService$Callback
 */
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionService;
import androidx.wear.ambient.WearableControllerProvider;
import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;

public final class fjy
implements fgr {
    final String a;
    final fgu b;
    final fjz c;
    final fkg d;

    public fjy(fjz fjz2, fkg fkg2, String string, fgu fgu2) {
        this.d = fkg2;
        this.a = string;
        this.b = fgu2;
        this.c = fjz2;
    }

    @Override
    public final /* synthetic */ void a(boolean bl2) {
    }

    @Override
    public final void b() {
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onEndOfSpeech", 244, "RecognitionServiceImpl.java")).r("RecognitionService#onEndOfSpeech");
        Object object = this.d.a;
        Objects.requireNonNull(object);
        fkg.c(new fkf((RecognitionService.Callback)object, 3));
        object = new fjo(this.a, 7);
        this.c.e.ifPresent(object);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void c(fef var1_1) {
        block12: {
            var6_2 = var1_1.a;
            var5_3 = var6_2.b;
            var3_4 = var6_2.a;
            var7_5 = (heg)((heg)fjz.a.h()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onError", 254, "RecognitionServiceImpl.java");
            var6_2 = WearableControllerProvider.c(var5_3);
            if (var5_3 == 0) break block12;
            var7_5.A("Speech recognition error type %s with error code %d", var6_2, var3_4);
            var2_7 = var4_6 = 3;
            switch (var5_3 - 1) {
                default: {
                    var2_7 = var3_4;
                    if (var3_4 == 12) break;
                    if (var3_4 == 13) break;
                    ((heg)((heg)fjz.a.h()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onError", 308, "RecognitionServiceImpl.java")).s("Invalid error code for LANGUAGE_PACK_ERROR: %d", var3_4);
                    ** GOTO lbl36
                }
                case 11: {
                    if (!this.b.i) ** GOTO lbl25
                    if (var3_4 == 2 || var3_4 == 13) {
                        var2_7 = 8;
                        break;
                    }
                    ** GOTO lbl36
                }
                case 7: 
                case 13: {
                    var2_7 = 7;
                    break;
                }
lbl25:
                // 3 sources

                case 5: 
                case 12: {
                    var2_7 = 2;
                    break;
                }
                case 3: {
                    if (!this.b.i) ** GOTO lbl25
                    ** GOTO lbl36
                }
                case 2: {
                    var2_7 = var4_6;
                    if (var3_4 != 102) break;
                    var2_7 = 9;
                    break;
                }
lbl36:
                // 4 sources

                case 0: 
                case 1: 
                case 4: 
                case 6: 
                case 9: 
                case 10: {
                    var2_7 = 5;
                    break;
                }
            }
            var2_7 = 13;
            {
                ** case 8:
            }
lbl41:
            // 9 sources

            if (var5_3 == 2) {
                this.d.a(var2_7);
                var6_2 = this.c;
                var7_5 = this.d;
                var6_2.d.remove(var7_5);
                var6_2 = this.c;
                var1_1 = new fas(this.a, var1_1, 10);
                var6_2.f.ifPresent(var1_1);
                return;
            }
            var6_2 = this.c;
            var1_1 = new fjx(this, this.d, var2_7, this.a, (fef)var1_1, 0);
            var6_2.c.a((Runnable)var1_1);
            return;
        }
        throw null;
    }

    @Override
    public final void d(fef object) {
        a.as(fjz.a.h(), "RecognitionService#onFallback", "com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onFallback", '\u0189', "RecognitionServiceImpl.java", (Throwable)object);
        object = new fas(this.a, object, 14);
        this.c.f.ifPresent(object);
    }

    @Override
    public final void e(fjm object, fjn fjn2) {
        object = new fbw(10);
        this.c.f.ifPresent(object);
    }

    @Override
    public final void f(ifs object) {
        Object object2;
        int n2 = a.v(((ifs)object).f);
        int n3 = 0;
        if (n2 != 0 && n2 == 2 && ((ifs)object).c.size() > 0) {
            ((heg)((heg)fki.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceWrapper$1", "languageDetection", 161, "RecognitionServiceWrapper.java")).u("ASR successfully switched locale to [%s]", ((ift)((ifs)object).c.get((int)0)).c);
        }
        fkg fkg2 = this.d;
        n2 = tt.d() && ((object2 = (Intent)fkg2.b).hasExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION") || object2.hasExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH")) ? 1 : 0;
        Bundle bundle = new Bundle();
        bundle.putString("detected_language", ((ift)((ifs)object).c.get((int)0)).c);
        if (tt.d() && n2 != 0) {
            int n4;
            n2 = n4 = a.v(((ifs)object).d);
            if (n4 == 0) {
                n2 = 1;
            }
            n2 = --n2 != 0 ? (n2 != 1 ? (n2 != 2 ? 3 : 2) : 1) : 0;
            bundle.putInt("language_detection_confidence_level", n2);
            bundle.putStringArrayList("top_locale_alternatives", fvd.t(((ifs)object).e));
            n2 = n4 = a.v(((ifs)object).f);
            if (n4 == 0) {
                n2 = 1;
            }
            n4 = n2 - 1;
            n2 = n3;
            if (n4 != 0) {
                n2 = n4 != 1 ? (n4 != 2 ? 3 : 2) : 1;
            }
            bundle.putInt("language_switch_result", n2);
            fkg.c(new fke((RecognitionService.Callback)fkg2.a, bundle, 1));
        } else {
            n2 = n3 = a.v(((ifs)object).d);
            if (n3 == 0) {
                n2 = 1;
            }
            object2 = --n2 != 0 ? (n2 != 1 ? (n2 != 2 ? "highly_confident" : "confident") : "not_confident") : "unknown_confidence";
            bundle.putString("language_detection_confidence_level", (String)object2);
            bundle.putStringArrayList("alternate_top_locales", fvd.t(((ifs)object).e));
            n2 = n3 = a.v(((ifs)object).f);
            if (n3 == 0) {
                n2 = 1;
            }
            object2 = --n2 != 0 ? (n2 != 1 ? (n2 != 2 ? "switch_skipped_no_model" : "switch_failed") : "switch_succeeded") : "no_switch";
            bundle.putString("language_switch_result", (String)object2);
            n2 = n3 = a.u(((ifs)object).g);
            if (n3 == 0) {
                n2 = 1;
            }
            object = --n2 != 0 ? (n2 != 1 ? (n2 != 2 ? (n2 != 3 ? "switch_current_language_confirmed" : "switch_reached_time_limit") : "switch_reached_max_number") : "switch_disabled_by_config") : "ready_to_switch";
            bundle.putString("language_switch_readiness", (String)object);
            fkg.c(new fke((RecognitionService.Callback)fkg2.a, bundle, 0));
        }
        object2 = this.c;
        object = new fbw(11);
        object2.e.ifPresent(object);
    }

    @Override
    public final void g(fgd object) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", fvd.v(((fgd)object).c));
        bundle.putStringArrayList("android.speech.extra.UNSTABLE_TEXT", fvd.v(((fgd)object).d));
        bundle.putString("current_locale", ((fgd)object).e);
        object = new fas(this.a, object, 11);
        this.c.e.ifPresent(object);
        this.d.b(bundle);
    }

    @Override
    public final void h() {
        Object object;
        Object object2;
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onRecognitionFinished", 382, "RecognitionServiceImpl.java")).r("RecognitionService#onEndRecognitionSession");
        if (this.b.o) {
            object2 = this.d;
            if (ffi.j((Intent)((fkg)object2).b) == null) {
                fkg.c(new fkf((RecognitionService.Callback)((fkg)object2).a, 1));
            } else if (tt.c()) {
                object = ((fkg)object2).a;
                Objects.requireNonNull(object);
                fkg.c(new fkf((RecognitionService.Callback)object, 0));
            }
            object = ((fkg)object2).c;
            object2 = ((fkg)object2).a;
            ((fki)object).b.remove(object2);
        }
        object2 = this.c;
        object = this.d;
        ((fjz)object2).d.remove(object);
        object2 = this.c;
        object = new fjo(this.a, 5);
        ((fjz)object2).f.ifPresent(object);
    }

    @Override
    public final void i(fex object) {
        Object object2 = new Bundle();
        object2.putStringArrayList("results_recognition", new ArrayList(((fex)object).c));
        object2.putString("current_locale", ((fex)object).f);
        if (((fex)object).e.size() > 0) {
            object2.putParcelableArrayList("results_alternatives", (ArrayList)Collection$_EL.stream(((fex)object).e).map(new fcx(11)).collect(Collectors.toCollection(new fes(3))));
        }
        if (((fex)object).d.size() > 0) {
            object2.putFloatArray("confidence_scores", hhk.ak(((fex)object).d));
        }
        if (tt.d() && ((fex)object).g.size() > 0) {
            object2.putParcelableArrayList("recognition_parts", (ArrayList)Collection$_EL.stream(((fex)object).g).filter(new fay(12)).map(new fcx(12)).collect(Collectors.toCollection(new fes(3))));
        }
        if (this.b.o) {
            fkg fkg2 = this.d;
            ((fki)fkg2.c).a();
            if (ffi.j((Intent)fkg2.b) == null) {
                object2.putBoolean("final_result", true);
                fkg.c(new fke((RecognitionService.Callback)fkg2.a, (Bundle)object2, 4));
            } else if (tt.c()) {
                fkg.c(new fke((RecognitionService.Callback)fkg2.a, (Bundle)object2, 5));
            }
        } else {
            fkg fkg3 = this.d;
            ((fki)fkg3.c).a();
            fkg.c(new fke((RecognitionService.Callback)fkg3.a, (Bundle)object2, 6));
            ((fki)fkg3.c).b.remove(fkg3.a);
        }
        object2 = this.c;
        object = new fas(this.a, object, 12);
        object2.e.ifPresent(object);
    }

    @Override
    public final void j(iga iga2) {
        Bundle bundle = new Bundle();
        fvc.as(bundle, "soda_event", iga2);
        this.d.b(bundle);
    }

    @Override
    public final void k() {
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$2", "onStartOfSpeech", 237, "RecognitionServiceImpl.java")).r("RecognitionService#onStartOfSpeech");
        Object object = this.d.a;
        Objects.requireNonNull(object);
        fkg.c(new fkf((RecognitionService.Callback)object, 2));
        object = new fjo(this.a, 6);
        this.c.e.ifPresent(object);
    }
}

