/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

class bzh
implements geg {
    final HashMap a;
    final bzk b;

    public bzh(bzk bzk2) {
        this.b = bzk2;
        this.a = new HashMap();
    }

    @Override
    public final void a(Throwable throwable) {
        a.as(bzk.a.g(), "load settings failed.", "com/google/android/apps/speech/tts/googletts/settings/asr/voiceime/ui/VoiceImeSettingsFragmentPeer$1", "onError", '\u00d8', "VoiceImeSettingsFragmentPeer.java", throwable);
        this.b.b.getActivity().finish();
    }

    @Override
    public final void c() {
        this.b.c().setEnabled(false);
        this.b.b().setEnabled(false);
        this.b.a().setEnabled(false);
    }
}

