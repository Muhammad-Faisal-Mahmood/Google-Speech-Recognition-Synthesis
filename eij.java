/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.BluetoothHeadset
 *  android.content.Context
 *  android.media.AudioManager
 */
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.List;

public final class eij
implements ehe {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl");
    private final Context b;
    private final AudioManager c;
    private final eie d;
    private final dlm e;

    public eij(Context context, AudioManager audioManager, eie eie2, dlm dlm2) {
        jse.e(eie2, "bluetoothDeviceManager");
        this.b = context;
        this.c = audioManager;
        this.d = eie2;
        this.e = dlm2;
    }

    @Override
    public final ehd a(BluetoothHeadset object, List object2) {
        jse.e(object2, "devices");
        if (!euf.r(this.b)) {
            ((heg)a.h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 34, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# cannot start sco, no permissions");
            return new ehd(null, ehc.c);
        }
        egz egz2 = eha.a((List)object2);
        if (egz2 == null) {
            ((heg)a.h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 39, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# no valid bluetooth device found to connect to.");
            return new ehd(null, ehc.b);
        }
        object2 = a;
        ((heg)((hdz)object2).f().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 42, "BluetoothHeadsetScoAudioControllerImpl.kt")).u("#audio# device to connect: %s", egz2.c);
        object = egz2.b;
        jse.b(object);
        if (this.e.q((BluetoothDevice)object)) {
            ((heg)((hdz)object2).h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 45, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# cannot start sco, device denylisted");
            return new ehd(egz2, ehc.d);
        }
        ((heg)((hdz)object2).f().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 49, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# starting sco...");
        try {
            this.c.startBluetoothSco();
            object = true;
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "connectAudio", 56, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# error while starting sco");
            object2 = false;
        }
        object = (Boolean)object2 != false ? new ehd(egz2, ehc.a) : new ehd(egz2, ehc.b);
        return object;
    }

    @Override
    public final boolean b(BluetoothHeadset object, egz object2) {
        object = a;
        ((heg)((hdz)object).f().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "disconnectAudio", 67, "BluetoothHeadsetScoAudioControllerImpl.kt")).u("#audio# device to disconnect: %s", ((egz)object2).c);
        if (!euf.r(this.b)) {
            ((heg)((hdz)object).h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "disconnectAudio", 69, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# cannot stop sco, no permissions");
            return false;
        }
        ((heg)((hdz)object).f().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "disconnectAudio", 73, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# stopping sco...");
        try {
            this.c.stopBluetoothSco();
            return true;
        }
        catch (Throwable throwable) {
            Object object3 = object2 = jns.aj(throwable);
            if (joe.a(object2) != null) {
                ((heg)a.h().h(hfo.a, "ALT.BtScoAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetScoAudioControllerImpl", "disconnectAudio", 79, "BluetoothHeadsetScoAudioControllerImpl.kt")).r("#audio# error while invoking stop sco");
                object3 = false;
            }
            return (Boolean)object3;
        }
    }

    @Override
    public final Object c(AmbientMode$AmbientController object, jqb jqb2) {
        if ((object = jsd.l(this.d.f((AmbientMode$AmbientController)object), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final Object d(AmbientMode$AmbientController object, jqb jqb2) {
        if ((object = jsd.l(this.d.g((AmbientMode$AmbientController)object), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }
}

