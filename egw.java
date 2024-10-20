/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class egw {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader");
    public final int b;
    public final gto c;
    public final gto d;
    public final czh e;
    private final Executor f;
    private final AtomicBoolean g;

    public egw(int n2, gto gto2, gto gto3, czh czh2, Executor executor) {
        this.b = n2;
        this.c = gto2;
        this.d = gto3;
        this.e = czh2;
        this.f = executor;
        if (gto2.g() ^ gto3.g()) {
            this.g = new AtomicBoolean(false);
            return;
        }
        throw new IllegalStateException("Only one WriteableAudioBuffer implementation can be present.");
    }

    public final void a(efr efr2) {
        if (!this.g.compareAndSet(false, true)) {
            return;
        }
        ((heg)a.f().h(hfo.a, "ALT.AudioStreamReader").j("com/google/android/libraries/search/audio/audiostreamreader/AudioStreamReader", "startReading", 63, "AudioStreamReader.kt")).r("#audio# start audio buffering");
        gax.c(fxf.ag(new dpw(this, efr2, 11), this.f), "#audio# Audio buffering failed", new Object[0]);
    }
}

