/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 */
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

final class gpj
extends AudioDeviceCallback {
    final String a;
    final AudioDeviceCallback b;
    final gpm c;

    public gpj(gpm gpm2, AudioDeviceCallback audioDeviceCallback) {
        this.a = "ALT.BluetoothDeviceManager.audioDeviceCallback";
        this.b = audioDeviceCallback;
        this.c = gpm2;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArray) {
        gof gof2 = this.c.d(this.a.concat("#onAudioDevicesAdded"));
        try {
            this.b.onAudioDevicesAdded(audioDeviceInfoArray);
            return;
        }
        finally {
            gof2.close();
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArray) {
        gof gof2 = this.c.d(this.a.concat("#onAudioDevicesRemoved"));
        try {
            this.b.onAudioDevicesRemoved(audioDeviceInfoArray);
            return;
        }
        finally {
            gof2.close();
        }
    }
}

