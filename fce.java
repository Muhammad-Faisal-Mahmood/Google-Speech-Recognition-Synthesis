/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.RecognitionService$SupportCallback
 */
import android.speech.RecognitionService;
import j$.util.Optional;

public final class fce
implements hpb {
    private static final hei b = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl$RecognitionSupportCallback");
    public final String a;
    private final Optional c;
    private final RecognitionService.SupportCallback d;

    public fce(String string, RecognitionService.SupportCallback supportCallback, Optional optional) {
        this.d = supportCallback;
        this.c = optional;
        this.a = string;
    }

    @Override
    public final void a(Throwable object) {
        a.as(b.g().h(hfo.a, "RecogSupportCallback"), "Recognition support fetch failed. Returning error.", "com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl$RecognitionSupportCallback", "onFailure", '\u01b6', "ModelManagerImpl.java", (Throwable)object);
        object = new bme(this, 18);
        this.c.ifPresent(object);
        a$$ExternalSyntheticApiModelOutline0.m(this.d, 14);
    }
}

