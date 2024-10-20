/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.speech.RecognitionService$Callback
 */
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognitionService;

public final class fjw
implements ffk {
    int a;
    final String b;
    final fjz c;
    final fkg d;

    public fjw(fjz fjz2, fkg fkg2, String string) {
        this.d = fkg2;
        this.b = string;
        this.c = fjz2;
        this.a = -1;
    }

    @Override
    public final void l(Uri uri) {
    }

    @Override
    public final void m() {
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneCloseRequested", 211, "RecognitionServiceImpl.java")).r("RecognitionService#onMicrophoneCloseRequested");
        fjo fjo2 = new fjo(this.b, 3);
        this.c.f.ifPresent(fjo2);
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o() {
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneDeactivated", 205, "RecognitionServiceImpl.java")).r("RecognitionService#onMicrophoneDeactivated");
        fjo fjo2 = new fjo(this.b, 4);
        this.c.f.ifPresent(fjo2);
    }

    @Override
    public final void p() {
        ((heg)((heg)fjz.a.f()).j("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneOpened", 198, "RecognitionServiceImpl.java")).r("RecognitionService#onMicrophoneOpened");
        Object object = new Bundle();
        fkg.c(new fke((RecognitionService.Callback)this.d.a, (Bundle)object, 2));
        object = new fjo(this.b, 2);
        this.c.f.ifPresent(object);
    }

    @Override
    public final void q(int n2) {
        if (n2 != this.a) {
            this.a = n2;
            fkg fkg2 = this.d;
            float f2 = (float)n2 / 100.0f;
            fkg.c(new fkc((RecognitionService.Callback)fkg2.a, f2 * 12.0f - 2.0f));
        }
    }
}

