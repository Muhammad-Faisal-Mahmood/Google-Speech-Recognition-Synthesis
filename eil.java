/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.BluetoothHeadset
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.os.Build;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class eil
implements ehe {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl");
    private final Context b;
    private final eie c;
    private final cxt d;

    public eil(Context context, eie eie2, cxt cxt2) {
        jse.e(eie2, "bluetoothDeviceManager");
        this.b = context;
        this.c = eie2;
        this.d = cxt2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ehd a(BluetoothHeadset object, List object2) {
        void var1_8;
        void var1_5;
        egz egz2;
        jse.e(egz2, "devices");
        if (!euf.r(this.b)) {
            ((heg)a.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 44, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# cannot start voice recognition, no permissions");
            return new ehd(null, ehc.c);
        }
        if ((egz2 = eha.a((List)((Object)egz2))) == null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 49, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# no valid bluetooth device found to connect to.");
            return new ehd(null, ehc.b);
        }
        ((heg)a.f().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 52, "BluetoothHeadsetVRAudioControllerImpl.kt")).u("#audio# device to connect: %s", egz2.c);
        BluetoothDevice bluetoothDevice = egz2.b;
        jse.b(bluetoothDevice);
        Object object3 = this.d;
        jse.e(bluetoothDevice, "device");
        object3 = ((iah)((cxt)object3).a).b;
        jse.d(object3, "getElementList(...)");
        if (!(object3 instanceof Collection) || !object3.isEmpty()) {
            object3 = object3.iterator();
            while (object3.hasNext()) {
                String string = (String)object3.next();
                String string2 = eha.d(bluetoothDevice);
                Locale locale = Locale.getDefault();
                jse.d(locale, "getDefault(...)");
                string2 = string2.toLowerCase(locale);
                jse.d(string2, "toLowerCase(...)");
                jse.b(string);
                locale = Locale.getDefault();
                jse.d(locale, "getDefault(...)");
                string = string.toLowerCase(locale);
                jse.d(string, "toLowerCase(...)");
                if (!jse.F(string2, string)) continue;
                ((heg)a.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 55, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# cannot start voice recognition, device denylisted");
                return new ehd(egz2, ehc.d);
            }
        }
        object3 = a;
        ((heg)((hdz)object3).f().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 59, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# starting voice recognition...");
        try {
            int n2 = Build.VERSION.SDK_INT;
            boolean bl2 = false;
            if (n2 >= 31 && !ut$$ExternalSyntheticApiModelOutline0.m(object, bluetoothDevice)) {
                ((heg)((hdz)object3).h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "isVoiceRecognitionSupported", 110, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# BVR is not supported");
            } else if (object.startVoiceRecognition(bluetoothDevice)) {
                bl2 = true;
            }
            Boolean bl3 = bl2;
        }
        catch (Throwable throwable) {
            Object object4 = jns.aj(throwable);
        }
        if (joe.a(var1_5) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "connectAudio", 67, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# an error while trying to start HFP using BVR call");
            return new ehd(egz2, ehc.b);
        }
        if (((Boolean)var1_5).booleanValue()) {
            ehd ehd2 = new ehd(egz2, ehc.a);
            return var1_8;
        }
        ehd ehd3 = new ehd(egz2, ehc.b);
        return var1_8;
    }

    @Override
    public final boolean b(BluetoothHeadset object, egz object2) {
        hei hei2 = a;
        ((heg)hei2.f().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "disconnectAudio", 79, "BluetoothHeadsetVRAudioControllerImpl.kt")).u("#audio# device to disconnect: %s", ((egz)object2).c);
        if (!euf.r(this.b)) {
            ((heg)hei2.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "disconnectAudio", 81, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# cannot stop voice recognition, no permissions");
            return false;
        }
        ((heg)hei2.f().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "disconnectAudio", 85, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# stopping voice recognition...");
        try {
            object = object.stopVoiceRecognition(((egz)object2).b);
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BtVRAudioCtrl").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetVRAudioControllerImpl", "disconnectAudio", 89, "BluetoothHeadsetVRAudioControllerImpl.kt")).r("#audio# an error while trying to stop HFP using BVR call");
            object2 = false;
        }
        return (Boolean)object2;
    }

    @Override
    public final Object c(AmbientMode$AmbientController object, jqb jqb2) {
        if ((object = jsd.l(this.c.f((AmbientMode$AmbientController)object), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final Object d(AmbientMode$AmbientController object, jqb jqb2) {
        if ((object = jsd.l(this.c.g((AmbientMode$AmbientController)object), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }
}

