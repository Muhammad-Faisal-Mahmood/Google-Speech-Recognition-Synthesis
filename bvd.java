/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.speech.tts.TextToSpeech
 *  android.speech.tts.TextToSpeech$OnInitListener
 *  android.speech.tts.UtteranceProgressListener
 */
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class bvd
extends bve {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/TextToSpeechSample");

    public bvd(MultipleVoicesActivity multipleVoicesActivity) {
        this.b = multipleVoicesActivity;
        this.e = false;
        this.d = new TextToSpeech((Context)multipleVoicesActivity, (TextToSpeech.OnInitListener)new bvb(this), "com.google.android.tts");
        this.d.setOnUtteranceProgressListener((UtteranceProgressListener)new bvc(this));
    }
}

