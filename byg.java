/*
 * Decompiled with CFR 0.152.
 */
class byg
implements geg {
    final byl a;

    public byg(byl byl2) {
        this.a = byl2;
    }

    @Override
    public final void a(Throwable throwable) {
        ((hfk)((hfk)((hfk)byl.a.g()).i(throwable)).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentHelper$1", "onError", 145, "SettingsFragmentHelper.java")).r("Failed to fetch AutoUpdate preference");
        this.a.a().setEnabled(true);
    }

    @Override
    public final void c() {
        this.a.a().setEnabled(false);
    }
}

