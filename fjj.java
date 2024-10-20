/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class fjj
implements ffk,
fgr {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession");
    public final fje b;
    public final Executor c;
    public final fju d;
    public final ffz e;
    public final fga f;
    public final String g;
    public boolean h = false;
    public int i = -1;
    public Optional j = Optional.empty();
    public final cya k;
    public final AmbientModeSupport$AmbientController l;
    public final cxt m;

    public fjj(String string, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, fje fje2, cya cya2, Executor executor, fju fju2, ffz ffz2, fga fga2) {
        this.g = string;
        this.l = ambientModeSupport$AmbientController;
        this.b = fje2;
        this.k = cya2;
        this.c = executor;
        this.m = new cxt(null, null);
        this.d = fju2;
        this.e = ffz2;
        this.f = fga2;
    }

    @Override
    public final void a(boolean bl2) {
        this.s("onDataDonationResponse", new fjg(this, bl2));
    }

    @Override
    public final void b() {
        this.s("onEndOfSpeech", new fgm(this, 11));
    }

    @Override
    public final void c(fef fef2) {
        this.s("onError", new czm(this, fef2, 10, null));
    }

    @Override
    public final void d(fef fef2) {
        this.s("onFallback", new czm(this, fef2, 13, null));
    }

    @Override
    public final /* synthetic */ void e(fjm fjm2, fjn fjn2) {
    }

    @Override
    public final void f(ifs ifs2) {
        this.s("onLangIdEvent", new fjf(this, ifs2));
    }

    @Override
    public final void g(fgd fgd2) {
        this.s("onPartialResults", new czm(this, fgd2, 8, null));
    }

    @Override
    public final void h() {
        this.s("onRecognitionFinished", new fgm(this, 10));
    }

    @Override
    public final void i(fex fex2) {
        this.s("onResults", new czm(this, fex2, 9, null));
    }

    @Override
    public final void j(iga iga2) {
        this.s("onSodaEvent", new czm(this, iga2, 11));
    }

    @Override
    public final void k() {
        this.s("onStartOfSpeech", new fgm(this, 6));
    }

    @Override
    public final void l(Uri uri) {
        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onAudioRecordingCreated", 540, "RecognitionSession.java")).u("[%s] #onAudioRecordingCreated", this.g);
    }

    @Override
    public final void m() {
        this.s("onMicrophoneCloseRequested", new fgm(this, 8));
    }

    @Override
    public final void n() {
        ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "onMicrophoneClosed", 521, "RecognitionSession.java")).u("[%s] onMicrophoneClosed", this.g);
    }

    @Override
    public final void o() {
        this.s("onMicrophoneDeactivated", new fgm(this, 12));
    }

    @Override
    public final void p() {
        this.s("onMicrophoneOpened", new fgm(this, 7));
    }

    @Override
    public final void q(int n2) {
        this.s("onSoundLevelChanged", new fjh(this, n2, 0));
    }

    public final void r(Optional optional) {
        this.s("cancelRecognition", new czm(this, optional, 12));
    }

    public final void s(String string, Callable callable) {
        callable = new cmq((Object)this, (Object)string, (Object)callable, 10, null);
        Executor executor = this.c;
        gax.c(this.m.E(callable, executor), "[%s] Failed handling %s", this.g, string);
    }
}

