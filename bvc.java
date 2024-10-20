/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.tts.UtteranceProgressListener
 */
import android.speech.tts.UtteranceProgressListener;

final class bvc
extends UtteranceProgressListener {
    final bvd a;

    public bvc(bvd bvd2) {
        this.a = bvd2;
    }

    public final void onDone(String string) {
    }

    public final void onError(String string) {
        this.a.a();
        ((heg)((heg)bvd.a.g()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/TextToSpeechSample$ProgressListener", "onError", 93, "TextToSpeechSample.java")).u("Synthesis failure on sample text synthesis for locale: %s", this.a.c);
    }

    public final void onStart(String string) {
    }
}

