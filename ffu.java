/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 */
import android.net.Uri;
import android.os.SystemClock;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ffu
implements ffk,
fgr {
    public final AtomicBoolean a;
    public final ffv b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;
    private final AtomicReference e;
    private long f;

    public ffu(ffv ffv2) {
        this.b = ffv2;
        this.c = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicReference();
    }

    private final void r(int n2) {
        Object object = new fft(this, n2);
        object = (hpp)DesugarAtomicReference.getAndUpdate(this.e, object);
    }

    @Override
    public final void a(boolean bl2) {
        this.b.e.a(bl2);
    }

    @Override
    public final void b() {
        ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onEndOfSpeech", 192, "RecognitionClient.java")).r("#onEndOfSpeech");
        this.a.set(false);
        this.b.e.b();
        Object object = this.b;
        fgu fgu2 = ((ffv)object).c;
        int n2 = fgu2.k;
        if (!(SystemClock.elapsedRealtime() < this.f + (long)n2 || n2 <= 0 && fgu2.o)) {
            ((ffv)object).f.e();
        }
        object = this.b.c;
        n2 = ((fgu)object).l;
        if (n2 > 0 && ((fgu)object).o) {
            this.r(n2);
        }
    }

    @Override
    public final void c(fef fef2) {
        ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onError", 213, "RecognitionClient.java")).A("#onError space %s code %d!", fef2.a.b(), fef2.a.a);
        if (!this.c.compareAndSet(false, true)) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onError", 218, "RecognitionClient.java")).r("#onError already finished - ignoring");
            return;
        }
        this.b.f.e();
        if (this.b.e()) {
            int n2 = fef2.a.b;
            if (n2 != 0) {
                if (n2 == 2) {
                    hth hth2 = this.b.g;
                    if (((AtomicBoolean)hth2.b).compareAndSet(false, true)) {
                        ((fdo)hth2.a).a(2131951643);
                    }
                } else {
                    hth hth3 = this.b.g;
                    if (((AtomicBoolean)hth3.b).compareAndSet(false, true)) {
                        ((fdo)hth3.a).a(2131951635);
                    }
                }
            } else {
                throw null;
            }
        }
        this.b.e.c(fef2);
    }

    @Override
    public final void d(fef fef2) {
        ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onFallback", 313, "RecognitionClient.java")).r("#onFallback");
        this.b.e.d(fef2);
    }

    @Override
    public final void e(fjm fjm2, fjn fjn2) {
        this.b.e.e(fjm2, fjn2);
    }

    @Override
    public final void f(ifs ifs2) {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onLangIdEvent", 268, "RecognitionClient.java")).u("#onLangIdEvent: %s", ifs2);
        if (this.c.get()) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onLangIdEvent", 270, "RecognitionClient.java")).r("#onLangIdEvent already finished - ignoring");
            return;
        }
        this.b.e.f(ifs2);
    }

    @Override
    public final void g(fgd fgd2) {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onPartialResults", 258, "RecognitionClient.java")).u("#onPartialResults: %s", fgd2);
        if (this.c.get()) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onPartialResults", 260, "RecognitionClient.java")).r("#onPartialResults already finished - ignoring");
            return;
        }
        this.b.e.g(fgd2);
    }

    @Override
    public final void h() {
        ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 284, "RecognitionClient.java")).r("#onRecognitionFinished");
        if (!this.d.get()) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 286, "RecognitionClient.java")).r("#onRecognitionFinished no speech - erroring");
            this.c(new fdz());
            return;
        }
        if (!this.c.compareAndSet(false, true)) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 292, "RecognitionClient.java")).r("#onRecognitionFinished already finished - ignoring");
            return;
        }
        this.b.f.e();
        if (this.b.e()) {
            hth hth2 = this.b.g;
            if (((AtomicBoolean)hth2.b).compareAndSet(false, true)) {
                ((fdo)hth2.a).a(2131951645);
            }
        }
        this.b.e.h();
    }

    @Override
    public final void i(fex fex2) {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 237, "RecognitionClient.java")).u("#onResults: %s", fex2);
        if (!this.c.get()) {
            if (!ffv.d(fex2)) {
                this.d.set(true);
            } else {
                ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 246, "RecognitionClient.java")).r("#onResults empty final recognition results");
            }
            if (ffv.d(fex2) && !this.b.c.o) {
                return;
            }
            ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 251, "RecognitionClient.java")).u("#onResults withSpeech: %b", this.d.get());
            this.b.e.i(fex2);
            return;
        }
        ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 239, "RecognitionClient.java")).r("#onResults already finished - ignoring");
    }

    @Override
    public final void j(iga iga2) {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onSodaEvent", 278, "RecognitionClient.java")).u("#onSodaEvent: %s", iga2);
        this.b.e.j(iga2);
    }

    @Override
    public final void k() {
        ((heg)((heg)ffv.a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onStartOfSpeech", 174, "RecognitionClient.java")).r("#onStartOfSpeech");
        this.a.set(true);
        this.b.e.k();
        if (this.b.c.l > 0) {
            hpp hpp2 = (hpp)DesugarAtomicReference.getAndUpdate(this.e, new flg(1));
        }
    }

    @Override
    public final void l(Uri uri) {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onAudioRecordingCreated", 163, "RecognitionClient.java")).r("#onAudioRecordingCreated");
        if (this.b.c.g.isPresent() && Uri.EMPTY.equals((Object)uri)) {
            ((heg)((heg)ffv.a.h()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onAudioRecordingCreated", 165, "RecognitionClient.java")).r("#onAudioRecordingCreated failed");
            this.c(new fdt());
            return;
        }
        this.b.d.l(uri);
    }

    @Override
    public final void m() {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onMicrophoneCloseRequested", 145, "RecognitionClient.java")).r("#onMicrophoneCloseRequested");
        this.b.d.m();
    }

    @Override
    public final void n() {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onMicrophoneClosed", 151, "RecognitionClient.java")).r("#onMicrophoneClosed");
        this.b.d.n();
    }

    @Override
    public final void o() {
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onMicrophoneDeactivated", 139, "RecognitionClient.java")).r("#onMicrophoneDeactivated");
        this.b.d.o();
    }

    @Override
    public final void p() {
        int n2;
        Object object;
        ((heg)((heg)ffv.a.c()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onMicrophoneOpened", 108, "RecognitionClient.java")).r("#onMicrophoneOpened");
        this.f = SystemClock.elapsedRealtime();
        if (this.b.e()) {
            object = this.b.g;
            if (!((AtomicBoolean)((hth)object).b).get()) {
                ((fdo)((hth)object).a).a(2131951644);
            }
        }
        this.b.d.p();
        object = this.b;
        if (((ffv)object).c.k > 0) {
            ((ffv)object).b.b(gqk.i(new ffd(this, 5)), this.b.c.k, TimeUnit.MILLISECONDS);
        }
        if ((n2 = this.b.c.l) > 0) {
            this.r(n2);
        }
    }

    @Override
    public final void q(int n2) {
        ((heg)((heg)((heg)ffv.a.e()).g(1, TimeUnit.SECONDS)).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onSoundLevelChanged", 157, "RecognitionClient.java")).s("#onSoundLevelChanged %d", n2);
        this.b.d.q(n2);
    }
}

