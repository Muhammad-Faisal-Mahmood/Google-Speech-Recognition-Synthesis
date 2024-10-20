/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.tts.TextToSpeech$OnInitListener
 */
import android.speech.tts.TextToSpeech;

final class bvb
implements TextToSpeech.OnInitListener {
    final bvd a;

    public bvb(bvd bvd2) {
        this.a = bvd2;
    }

    public final void onInit(int n2) {
        if (n2 == 0) {
            this.a.e = true;
            return;
        }
        if (n2 == -1) {
            ((heg)((heg)bvd.a.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/TextToSpeechSample$1", "onInit", 34, "TextToSpeechSample.java")).r("Init failed.");
        }
    }
}

