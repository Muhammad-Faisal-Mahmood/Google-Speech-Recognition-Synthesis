/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 */
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

public final class ehu
extends AudioDeviceCallback {
    final eie a;

    public ehu(eie eie2) {
        this.a = eie2;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArray) {
        jse.e(audioDeviceInfoArray, "addedDevices");
        eie eie2 = this.a;
        eie2.b(new eht(audioDeviceInfoArray, eie2, null, 1, null));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArray) {
        jse.e(audioDeviceInfoArray, "removedDevices");
        eie eie2 = this.a;
        eie2.b(new eht(audioDeviceInfoArray, eie2, null, 0));
    }
}

