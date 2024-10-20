/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.media.AudioDeviceInfo
 */
import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;

public final class egz {
    public final AudioDeviceInfo a;
    public final BluetoothDevice b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final String h;

    public egz(AudioDeviceInfo audioDeviceInfo, BluetoothDevice bluetoothDevice) {
        boolean bl2;
        boolean bl3;
        CharSequence charSequence;
        block9: {
            block8: {
                CharSequence charSequence2;
                this.a = audioDeviceInfo;
                this.b = bluetoothDevice;
                if (audioDeviceInfo != null) {
                    charSequence = eha.c(audioDeviceInfo);
                } else if (bluetoothDevice != null) {
                    String string = eha.d(bluetoothDevice);
                    charSequence = bluetoothDevice.getAddress();
                    charSequence2 = new StringBuilder("[");
                    ((StringBuilder)charSequence2).append(string);
                    ((StringBuilder)charSequence2).append(", ");
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    ((StringBuilder)charSequence2).append("]");
                    charSequence = ((StringBuilder)charSequence2).toString();
                } else {
                    charSequence = "[]";
                }
                this.c = charSequence;
                bl3 = false;
                int n2 = audioDeviceInfo != null ? audioDeviceInfo.getId() : 0;
                this.d = n2;
                if (bluetoothDevice == null) break block8;
                charSequence2 = bluetoothDevice.getAddress();
                charSequence = charSequence2;
                if (charSequence2 != null) break block9;
            }
            charSequence = "00:00:00:00:00:00";
        }
        this.h = charSequence;
        this.e = bl2 = jse.i(charSequence, "00:00:00:00:00:00");
        bl2 = bluetoothDevice != null && !bl2;
        this.f = bl2;
        bl2 = bl3;
        if (audioDeviceInfo != null) {
            bl2 = true;
        }
        this.g = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof egz)) {
            return false;
        }
        if (this.g) {
            bl2 = bl3;
            if (jse.i(this.a, ((egz)object).a)) return bl2;
        }
        if (this.f) {
            bl2 = bl3;
            if (jse.i(this.b, ((egz)object).b)) return bl2;
        }
        AudioDeviceInfo audioDeviceInfo = this.a;
        object = (egz)object;
        if (!jse.i(audioDeviceInfo, ((egz)object).a)) return false;
        if (!jse.i(this.b, ((egz)object).b)) return false;
        return bl3;
    }

    public final int hashCode() {
        AudioDeviceInfo audioDeviceInfo = this.a;
        int n2 = 0;
        int n3 = audioDeviceInfo == null ? 0 : audioDeviceInfo.hashCode();
        audioDeviceInfo = this.b;
        if (audioDeviceInfo != null) {
            n2 = audioDeviceInfo.hashCode();
        }
        return n3 * 31 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BluetoothAudioDevice(deviceInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", bluetoothDevice=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

