/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class ehv
extends BroadcastReceiver {
    final eie a;

    public ehv(eie eie2) {
        this.a = eie2;
    }

    public final void onReceive(Context object, Intent object2) {
        jse.e(object, "context");
        jse.e(object2, "intent");
        object = object2.getAction();
        if (object != null && jse.i(object, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            object = dww.g(object2.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1));
            ehb ehb2 = dww.g(object2.getIntExtra("android.bluetooth.profile.extra.STATE", -1));
            object2 = new egz(null, (BluetoothDevice)object2.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
            eie eie2 = this.a;
            eie2.b(new eme(eie2, (ehb)((Object)object), ehb2, (egz)object2, null, 1));
        }
    }
}

