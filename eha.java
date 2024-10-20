/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.media.AudioDeviceInfo
 *  android.os.Build$VERSION
 */
import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;
import android.os.Build;
import java.util.List;

public final class eha {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/BluetoothAudioDeviceKt");

    public static final egz a(List list2) {
        block1: {
            jse.e(list2, "<this>");
            for (List<Object> list2 : list2) {
                if (!((egz)((Object)list2)).f) continue;
                break block1;
            }
            list2 = null;
        }
        return (egz)((Object)list2);
    }

    public static final String b(AudioDeviceInfo object) {
        jse.e(object, "<this>");
        try {
            object = AudioDeviceInfo.class.getMethod("getAddress", null).invoke(object, null);
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        Object object2 = object;
        if (joe.a(object) != null) {
            ((heg)a.h().h(hfo.a, "ALT.BTAudioDevice").j("com/google/android/libraries/search/audio/bluetooth/BluetoothAudioDeviceKt", "getAddressCompat", 68, "BluetoothAudioDevice.kt")).r("#audio# accessing device's address failed");
            object2 = null;
        }
        if (object2 instanceof String) {
            return (String)object2;
        }
        return null;
    }

    public static final String c(AudioDeviceInfo object) {
        jse.e(object, "<this>");
        int n2 = object.getId();
        String string = eha.e((AudioDeviceInfo)object);
        String string2 = eha.b((AudioDeviceInfo)object);
        int n3 = object.getType();
        object = new StringBuilder("[");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }

    public static final String d(BluetoothDevice object) {
        block6: {
            String string;
            block5: {
                String string2;
                block4: {
                    string = "";
                    if (object != null) {
                        try {
                            string2 = object.getName();
                            break block4;
                        }
                        catch (Throwable throwable) {
                            object = jns.aj(throwable);
                            break block5;
                        }
                    }
                    string2 = null;
                }
                object = string2;
                if (string2 == null) {
                    object = "";
                }
            }
            if (!(object instanceof jod)) break block6;
            object = string;
        }
        return (String)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final String e(AudioDeviceInfo var0) {
        block6: {
            var1_2 = "";
            if (var0 /* !! */  != null) {
                var0 /* !! */  = var0 /* !! */ .getProductName();
                if (var0 /* !! */  == null) ** break block5
                try {
                    var0 /* !! */  = var0 /* !! */ .toString();
                }
                catch (Throwable var0_1) {
                    var0 /* !! */  = jns.aj(var0_1);
                }
            } else {
                var0 /* !! */  = "";
            }
            if (!(var0 /* !! */  instanceof jod)) break block6;
            var0 /* !! */  = var1_2;
        }
        return (String)var0 /* !! */ ;
    }

    public static final boolean f(AudioDeviceInfo audioDeviceInfo) {
        jse.e(audioDeviceInfo, "<this>");
        return Build.VERSION.SDK_INT >= 31 && audioDeviceInfo.getType() == 26;
    }

    public static final boolean g(AudioDeviceInfo audioDeviceInfo) {
        jse.e(audioDeviceInfo, "<this>");
        return audioDeviceInfo.getType() == 7 || eha.f(audioDeviceInfo);
        {
        }
    }

    public static final boolean h(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        jse.e(audioDeviceInfo, "<this>");
        jse.e(audioDeviceInfo2, "other");
        return jse.i(fs$$ExternalSyntheticApiModelOutline0.m(audioDeviceInfo), fs$$ExternalSyntheticApiModelOutline0.m(audioDeviceInfo2)) && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }
}

