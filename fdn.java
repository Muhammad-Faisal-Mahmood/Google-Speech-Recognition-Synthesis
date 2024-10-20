/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$OnPlaybackPositionUpdateListener
 */
import android.media.AudioTrack;

public final class fdn
implements AudioTrack.OnPlaybackPositionUpdateListener {
    final AudioTrack a;
    final fdo b;

    public fdn(fdo fdo2, AudioTrack audioTrack) {
        this.a = audioTrack;
        this.b = fdo2;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        ((heg)((heg)fdo.a.f()).j("com/google/android/libraries/speech/transcription/beeps/AudioPlayer$1", "onMarkerReached", 107, "AudioPlayer.java")).r("Audio track end of file reached");
        this.a.release();
        this.b.d.set(false);
        this.b.b();
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}

