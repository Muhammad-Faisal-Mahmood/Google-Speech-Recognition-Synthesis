/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

final class btg
implements hpb {
    final String a;
    final buc b;
    final String c;
    final bti d;
    final btj e;
    final int f;

    public btg(btj btj2, String string, buc buc2, int n2, String string2, bti bti2) {
        this.a = string;
        this.b = buc2;
        this.f = n2;
        this.c = string2;
        this.d = bti2;
        this.e = btj2;
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.f != 3 && !(throwable instanceof CancellationException)) {
            a.as(btj.a.g(), "Failed to sync packs", "com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader$2", "onFailure", '\u016f', "VoiceDataDownloader.java", throwable);
        }
        btj btj2 = this.e;
        Object object = this.b;
        int n2 = this.f;
        String string = ((buc)object).c;
        int n3 = ((buc)object).e;
        object = fxf.O(throwable.getMessage());
        String string2 = this.c;
        btj2.d.b(string, n3, n2, (String)object, string2);
        this.d.a(this.a, new bta(throwable));
    }
}

