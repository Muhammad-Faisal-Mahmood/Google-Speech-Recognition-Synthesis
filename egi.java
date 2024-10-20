/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioRecord
 */
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;

public final class egi {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice");
    public final AudioManager b;

    public egi(AudioManager audioManager) {
        this.b = audioManager;
    }

    public static final void a(AudioRecord audioRecord, AudioDeviceInfo audioDeviceInfo, ebs ebs2) {
        jse.e(audioRecord, "audioRecord");
        jse.e(ebs2, "failure");
        if (audioDeviceInfo == null) {
            return;
        }
        if (audioRecord.setPreferredDevice(audioDeviceInfo)) {
            ((heg)a.f().h(hfo.a, "ALT.PreferredDevice").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice", "maybeSetDevice", 49, "AudioRecordPreferredDevice.kt")).s("#audio# device type(%d) set as preferred for audio recording", audioDeviceInfo.getType());
            return;
        }
        audioRecord.release();
        throw new elx("#create failed: preferred device not set.", elb.e(ebs2));
    }
}

