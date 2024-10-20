/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothProfile
 *  android.bluetooth.BluetoothProfile$ServiceListener
 */
import android.bluetooth.BluetoothProfile;

public final class ehy
implements BluetoothProfile.ServiceListener {
    final eie a;

    public ehy(eie eie2) {
        this.a = eie2;
    }

    public final void onServiceConnected(int n2, BluetoothProfile bluetoothProfile) {
        jse.e(bluetoothProfile, "proxy");
        eie eie2 = this.a;
        eie2.b(new ehw(n2, eie2, bluetoothProfile, null));
    }

    public final void onServiceDisconnected(int n2) {
        eie eie2 = this.a;
        eie2.b(new ehx(n2, eie2, null));
    }
}

