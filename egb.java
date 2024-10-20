/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 */
import android.media.AudioRecord;

public final class egb
implements efo {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource");
    private final eae b;
    private final iku c;
    private gto d = gsl.a;
    private final egl e;
    private final dpq f;

    public egb(eae eae2, dpq dpq2, iku iku2) {
        efs efs2 = efs.a;
        jse.e(efs2, "initialSource");
        this.e = new egl(efs2);
        this.b = eae2;
        this.f = dpq2;
        this.c = iku2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ebq a() {
        synchronized (this) {
            this.e.d();
            if (!this.d.g()) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.EmuAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "closeAudioSource", 92, "AudioEmulatedAudioSource.java")).r("#audio# closeAudioSource failed: no audio record.");
                return elb.c(ebp.g);
            }
            Object object = this.d.c();
            try {
                ((AudioRecord)object).stop();
            }
            catch (IllegalStateException illegalStateException) {
                a.as(a.h().h(hfo.a, "ALT.EmuAudioSource"), "#audio# closeAudioSource failed: audio record error.", "com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "closeAudioSource", 'T', "AudioEmulatedAudioSource.java", illegalStateException);
                return elb.c(ebp.y);
            }
            ((AudioRecord)object).release();
            return elb.d(ebr.b);
        }
    }

    @Override
    public final efq b() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gto c() {
        synchronized (this) {
            Object object;
            ((heg)((heg)a.f().h(hfo.a, "ALT.EmuAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "openAudioSource", 63, "AudioEmulatedAudioSource.java")).u("#audio# open audio source(%s)", crh.K(this));
            try {
                object = (cqq)this.c.b();
                int n2 = this.b.d;
                object = new AudioRecord(0, n2, 1, 2, 2);
                object = gto.i(object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                a.as(a.h().h(hfo.a, "ALT.EmuAudioSource"), "#audio# createAudioRecord failed: error creating audio record.", "com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "createAudioRecord", '\u0089', "AudioEmulatedAudioSource.java", illegalArgumentException);
                object = gsl.a;
            }
            this.d = object;
            if (!((gto)object).g()) {
                this.e.d();
                return gsl.a;
            }
            Object object2 = this.d.c();
            this.e.c(((AudioRecord)object2).getAudioSessionId());
            try {
                ((AudioRecord)object2).startRecording();
            }
            catch (IllegalStateException illegalStateException) {
                a.as(a.h().h(hfo.a, "ALT.EmuAudioSource"), "#audio# openAudioSourceInternal failed: audio record startRecording error.", "com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "openAudioSourceInternal", 'm', "AudioEmulatedAudioSource.java", illegalStateException);
                return gsl.a;
            }
            if (((AudioRecord)object2).getRecordingState() != 3) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.EmuAudioSource")).j("com/google/android/libraries/search/audio/audiosource/impl/AudioEmulatedAudioSource", "openAudioSourceInternal", 116, "AudioEmulatedAudioSource.java")).r("#audio# openAudioSourceInternal failed: audio record recordingState error.");
                return gsl.a;
            }
            dpq dpq2 = this.f;
            efx efx2 = efx.a;
            object = gsl.a;
            efs efs2 = efs.a;
            return gto.i(dpq2.c((AudioRecord)object2, efx2, (gto)object, efs2));
        }
    }
}

