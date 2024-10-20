/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class buy
implements bti {
    public final Object a;
    private final int b;

    public buy(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(String object, bta bta2) {
        if (this.b != 0) {
            ((heg)((heg)((heg)btn.a.f()).i(bta2)).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$2", "onVoiceDownloadFail", 277, "VoiceDataManager.java")).u("failed to download voice %s", object);
            ((btn)this.a).d();
            return;
        }
        ((heg)((heg)((heg)MultipleVoicesActivity.k.f()).i(bta2)).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity$1", "onVoiceDownloadFail", 112, "MultipleVoicesActivity.java")).u("Download voice : %s failed", object);
        object = new bpv(this, 8);
        ((MultipleVoicesActivity)this.a).runOnUiThread((Runnable)object);
    }

    @Override
    public final void b(String object) {
        if (this.b != 0) {
            ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$2", "onVoiceDownloadStart", 266, "VoiceDataManager.java")).u("start to download voice %s", object);
            return;
        }
        ((heg)((heg)MultipleVoicesActivity.k.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity$1", "onVoiceDownloadStart", 88, "MultipleVoicesActivity.java")).u("Start to download voice : %s", object);
        object = new bpv(this, 9);
        ((MultipleVoicesActivity)this.a).runOnUiThread((Runnable)object);
    }

    @Override
    public final void c(String object) {
        if (this.b != 0) {
            ((heg)((heg)btn.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataManager$2", "onVoiceDownloadSuccess", 271, "VoiceDataManager.java")).u("Downloaded voice %s", object);
            ((btn)this.a).d();
            return;
        }
        ((heg)((heg)MultipleVoicesActivity.k.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/ui/MultipleVoicesActivity$1", "onVoiceDownloadSuccess", 97, "MultipleVoicesActivity.java")).u("Download voice : %s success", object);
        object = new bpv(this, 10);
        ((MultipleVoicesActivity)this.a).runOnUiThread((Runnable)object);
        object = ((MultipleVoicesActivity)this.a).l;
        if (object != null) {
            ((btn)object).d();
        }
    }
}

