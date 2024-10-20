/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.speech.RecognitionService$SupportCallback
 */
import android.content.Intent;
import android.speech.RecognitionService;
import com.google.android.apps.speech.tts.googletts.service.GoogleTTSRecognitionService;
import j$.util.Optional;
import java.util.Locale;

public final class bwg
extends bwh {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer");
    public final GoogleTTSRecognitionService b;
    public final fki c;
    public final int d;
    private final fcf f;
    private final fka g;
    private final Boolean h;
    private final Optional i;
    private final Optional j;

    public bwg(GoogleTTSRecognitionService googleTTSRecognitionService, fki fki2, fcf fcf2, fka fka2, Boolean bl2, long l2, Optional optional, Optional optional2) {
        this.b = googleTTSRecognitionService;
        this.c = fki2;
        this.f = fcf2;
        this.g = fka2;
        this.h = bl2;
        this.d = (int)l2;
        this.i = optional;
        this.j = optional2;
    }

    public final void a(String string, Intent object, int n2, RecognitionService.SupportCallback supportCallback) {
        Object object2 = this.g.a((Intent)object, n2, true).a();
        object = new fas(string, object2, 1);
        this.i.ifPresent(object);
        if (!this.h.booleanValue()) {
            ((heg)((heg)a.h().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "checkRecognitionSupportHelper", 155, "GoogleTTSRecognitionServicePeer.java")).r("SpeechRecognizer#onCheckRecognitionSupport disabled via flag. Returning unsupported operation.");
            this.i.ifPresent(new bme(string, 6));
            a$$ExternalSyntheticApiModelOutline0.m(supportCallback, 14);
            return;
        }
        fcf fcf2 = this.f;
        object = ((fgu)object2).h;
        object2 = fhq.i((fgu)object2);
        ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "onCheckRecognitionSupport", 132, "ModelManagerImpl.java")).r("#onCheckRecognitionSupport");
        fxf.al(fcf2.b(string, (idq)object, (hav)object2), new fce(string, supportCallback, fcf2.d), fcf2.c);
    }

    public final void b(String string, Intent object, int n2, Optional object2) {
        object = this.g.a((Intent)object, n2, true).a();
        Object object3 = new bwf(string, (fgu)object, (Optional)object2);
        this.j.ifPresent(object3);
        String string2 = ((fgu)object).b;
        if (string2 == null) {
            if (tt.d()) {
                ((Optional)object2).ifPresent(new fbw(1));
            }
            ((heg)((heg)a.h().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "triggerModelDownloadHelper", 229, "GoogleTTSRecognitionServicePeer.java")).r("onTriggerModelDownload did not specify a locale. Ignoring request.");
            this.j.ifPresent(new bme(string, 4));
            return;
        }
        if (!this.h.booleanValue()) {
            ((heg)((heg)a.h().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "triggerModelDownloadHelper", 238, "GoogleTTSRecognitionServicePeer.java")).r("SpeechRecognizer#onTriggerModelDownload disabled via flag. Noop.");
            this.j.ifPresent(new bme(string, 5));
            return;
        }
        ((heg)((heg)a.f().h(hfo.a, "GoogleTTSRecognitionSrv")).j("com/google/android/apps/speech/tts/googletts/service/GoogleTTSRecognitionServicePeer", "triggerModelDownloadHelper", 245, "GoogleTTSRecognitionServicePeer.java")).u("#onTriggerModelDownload#with downloadListener: %b", ((Optional)object2).isPresent());
        object3 = this.f;
        idq idq2 = ((fgu)object).h;
        object = object2;
        if (!((fcf)object3).h.g) {
            object = object2;
            if (tt.d()) {
                ((Optional)object2).ifPresent(new fbw(3));
                object = Optional.empty();
            }
        }
        object2 = Locale.forLanguageTag(string2);
        object = ((Optional)object).isPresent() && tt.d() ? Optional.of(new fcd((Optional)object)) : Optional.empty();
        ((fcf)object3).d(string, (Locale)object2, false, (Optional)object, idq2);
    }
}

