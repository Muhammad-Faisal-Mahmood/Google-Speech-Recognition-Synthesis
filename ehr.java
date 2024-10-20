/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 */
import android.media.AudioDeviceInfo;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;

public final class ehr
implements AudioManager$OnCommunicationDeviceChangedListener {
    public final eie a;

    public /* synthetic */ ehr(eie eie2) {
        this.a = eie2;
    }

    /*
     * WARNING - void declaration
     */
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        void var4_5;
        Object object = (heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "communicationDeviceChangedListener$lambda$0", 186, "BluetoothDeviceManager.kt");
        if (audioDeviceInfo != null) {
            String string2 = eha.c(audioDeviceInfo);
        } else {
            Object var4_4 = null;
        }
        object.u("#audio# communicationDeviceChangedListener for device: %s", var4_5);
        if (audioDeviceInfo != null) {
            void var4_9;
            block7: {
                if (!eha.g(audioDeviceInfo)) {
                    ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "handleCommunicationDeviceChange", 195, "BluetoothDeviceManager.kt")).u("#audio# got the update for a non BT device: %s.", eha.c(audioDeviceInfo));
                    return;
                }
                object = this.a;
                AudioDeviceInfo[] audioDeviceInfoArray = ((eie)object).d.getDevices(1);
                jse.d(audioDeviceInfoArray, "getDevices(...)");
                for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArray) {
                    jse.b(audioDeviceInfo2);
                    if (!eha.h(audioDeviceInfo, audioDeviceInfo2)) {
                        continue;
                    }
                    break block7;
                }
                Object var4_8 = null;
            }
            if (var4_9 == null) {
                ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "handleCommunicationDeviceChange", 200, "BluetoothDeviceManager.kt")).u("#audio# could not find an input device for device: %s.", eha.c(audioDeviceInfo));
                return;
            }
            ((eie)object).b(new eht((eie)object, new egz((AudioDeviceInfo)var4_9, null), null, 2));
        }
    }
}

