/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters;
import com.google.android.apps.speech.tts.googletts.dispatch.LanguageRegistry;

public final class bug
implements gcc {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/VoicepackUpdaterWorker");
    public final hpr b;
    public final btk c;
    public final LanguageRegistry d;
    public final bxt e;

    public bug(hpr hpr2, bxt bxt2, LanguageRegistry languageRegistry, btk btk2) {
        this.b = hpr2;
        this.c = btk2;
        this.e = bxt2;
        this.d = languageRegistry;
    }

    @Override
    public final /* synthetic */ hpn a(WorkerParameters workerParameters) {
        return fxf.h();
    }

    @Override
    public final hpn b(WorkerParameters object) {
        if (!((WorkerParameters)object).c.contains("test")) {
            object = ((WorkerParameters)object).b;
            object = !ito.c() ? hhk.K(new bbg()) : hmv.g(hno.g(hno.g(hph.q(this.c.d()), new bps(this, 5), this.b), new bpu(this, object, 3, null), this.b), Throwable.class, new buf(1), this.b);
            return object;
        }
        return hhk.K(new bbg());
    }
}

