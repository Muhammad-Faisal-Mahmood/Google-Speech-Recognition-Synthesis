/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public final class egd
implements efo {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource");
    private final ParcelFileDescriptor b;
    private gto c = gsl.a;

    public egd(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = parcelFileDescriptor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ebq a() {
        synchronized (this) {
            Object object = a;
            ((heg)((heg)((hdz)object).f().h(hfo.a, "ALT.PFDAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 61, "AudioPfdAudioSource.java")).u("#audio# close audio source(%s)", crh.K(this));
            if (!this.c.g()) {
                ((heg)((heg)((hdz)object).h().h(hfo.a, "ALT.PFDAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 75, "AudioPfdAudioSource.java")).u("#audio# close audio source(%s) failed: no audio stream", crh.K(this));
                return elb.c(ebp.u);
            }
            object = this.c.c();
            try {
                ((egp)object).b();
                return elb.d(ebr.b);
            }
            catch (IOException iOException) {
                ((heg)((heg)((heg)a.h().h(hfo.a, "ALT.PFDAudioSource")).i(iOException)).j("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "closeAudioSource", 67, "AudioPfdAudioSource.java")).u("#audio# close audio source(%s) failed: error closing audio stream", crh.K(this));
                return elb.c(ebp.A);
            }
        }
    }

    @Override
    public final efq b() {
        return dww.i(efs.j);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gto c() {
        synchronized (this) {
            Object object = a;
            ((heg)((heg)((hdz)object).f().h(hfo.a, "ALT.PFDAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "openAudioSource", 45, "AudioPfdAudioSource.java")).u("#audio# open audio source(%s)", crh.K(this));
            ((heg)((heg)((hdz)object).f().h(hfo.a, "ALT.PFDAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioPfdAudioSource", "createAudioPfdStream", 89, "AudioPfdAudioSource.java")).r("#audio# createAudioPfdStream returning AudioPfdStream");
            object = new egp(this.b);
            this.c = object = gto.i(object);
            if (!((gto)object).g()) return gsl.a;
            return gto.i(this.c.c());
        }
    }
}

