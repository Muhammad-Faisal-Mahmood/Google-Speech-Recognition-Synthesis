/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.BluetoothHeadset
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.os.Build$VERSION
 */
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.List;

public final class eik
implements ehe {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl");
    private final Context b;
    private final AudioManager c;
    private final eie d;
    private final boolean e;
    private final dlm f;

    public eik(Context context, AudioManager audioManager, eie eie2, dlm dlm2, boolean bl2) {
        jse.e(eie2, "bluetoothDeviceManager");
        this.b = context;
        this.c = audioManager;
        this.d = eie2;
        this.f = dlm2;
        this.e = bl2;
    }

    @Override
    public final ehd a(BluetoothHeadset object, List object2) {
        AudioDeviceInfo audioDeviceInfo;
        Object var4_5;
        block11: {
            jse.e(object2, "devices");
            int n2 = Build.VERSION.SDK_INT;
            var4_5 = null;
            if (n2 < 31) {
                ((heg)a.c().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 48, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# start virtual call via communicationDevice APIs is only available from API 31");
                return new ehd(null, ehc.e);
            }
            if (!euf.r(this.b)) {
                ((heg)a.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 54, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# cannot start virtual call, no permissions");
                return new ehd(null, ehc.c);
            }
            jse.e(object2, "<this>");
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                if (!((egz)object).g) continue;
                break block11;
            }
            object = null;
        }
        egz egz2 = (egz)object;
        if (egz2 == null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 59, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# no valid bluetooth device found to connect to.");
            return new ehd(null, ehc.b);
        }
        object2 = egz2.a;
        jse.b(object2);
        if (eha.f((AudioDeviceInfo)object2) && !this.e) {
            ((heg)a.f().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 64, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# BLE audio is disabled.");
            return new ehd(egz2, ehc.b);
        }
        object = a;
        ((heg)object.f().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 68, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).u("#audio# device to connect: %s", egz2.c);
        Object object3 = egz2.b;
        if (object3 != null && this.f.q((BluetoothDevice)object3)) {
            ((heg)object.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 72, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# cannot start sco virtual call, device denylisted");
            return new ehd(egz2, ehc.d);
        }
        object = this.c;
        jse.e(object2, "inputDevice");
        object = ut$$ExternalSyntheticApiModelOutline0.m((AudioManager)object);
        jse.d(object, "getAvailableCommunicationDevices(...)");
        object3 = object.iterator();
        do {
            object = var4_5;
            if (!object3.hasNext()) break;
            object = object3.next();
            audioDeviceInfo = (AudioDeviceInfo)object;
            jse.b(audioDeviceInfo);
        } while (!eha.h((AudioDeviceInfo)object2, audioDeviceInfo));
        if ((object = (AudioDeviceInfo)object) == null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 77, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# cannot start sco virtual call, no matching device available");
            return new ehd(egz2, ehc.b);
        }
        ((heg)a.f().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 81, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# starting sco virtual call...");
        try {
            object = ut$$ExternalSyntheticApiModelOutline0.m(this.c, (AudioDeviceInfo)object);
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "connectAudio", 85, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# error while starting sco");
            object2 = false;
        }
        object = (Boolean)object2 != false ? new ehd(egz2, ehc.a) : new ehd(egz2, ehc.b);
        return object;
    }

    @Override
    public final boolean b(BluetoothHeadset object, egz object2) {
        object = a;
        ((heg)((hdz)object).f().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "disconnectAudio", 98, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).u("#audio# device to disconnect: %s", ((egz)object2).c);
        if (Build.VERSION.SDK_INT < 33) {
            ((heg)((hdz)object).c().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "disconnectAudio", 100, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# stop virtual call via system apis is only from API 33");
            return false;
        }
        if (!euf.r(this.b)) {
            ((heg)((hdz)object).h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "disconnectAudio", 104, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# cannot stop virtual call, no permissions");
            return false;
        }
        ((heg)((hdz)object).f().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "disconnectAudio", 108, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# stopping sco virtual call...");
        try {
            ut$$ExternalSyntheticApiModelOutline0.m(this.c);
            object = true;
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVCAudioCtrl31").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVCAudioControllerSnowConePlusImpl", "disconnectAudio", 114, "BluetoothHeadsetVCAudioControllerSnowConePlusImpl.kt")).r("#audio# error while invoking stop sco");
            object2 = false;
        }
        return (Boolean)object2;
    }

    @Override
    public final Object c(AmbientMode$AmbientController object, jqb jqb2) {
        jse.e(object, "listener");
        eie eie2 = this.d;
        object = jsd.l(eie2.b(new eid(eie2, (AmbientMode$AmbientController)object, null, 1, null)), jqb2);
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final Object d(AmbientMode$AmbientController object, jqb jqb2) {
        jse.e(object, "listener");
        eie eie2 = this.d;
        object = jsd.l(eie2.b(new eid(eie2, (AmbientMode$AmbientController)object, null, 0)), jqb2);
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }
}

