/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothHeadset
 *  android.telephony.TelephonyManager
 */
import android.bluetooth.BluetoothHeadset;
import android.telephony.TelephonyManager;

public final class eih {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl");
    public final BluetoothHeadset b;
    public final TelephonyManager c;
    public final ehe d;
    public final ehe e;
    public final ehe f;
    public final ehe g;
    public final boolean h;

    public eih(BluetoothHeadset bluetoothHeadset, TelephonyManager telephonyManager, ehe ehe2, ehe ehe3, ehe ehe4, ehe ehe5, boolean bl2) {
        this.b = bluetoothHeadset;
        this.c = telephonyManager;
        this.d = ehe2;
        this.e = ehe3;
        this.f = ehe4;
        this.g = ehe5;
        this.h = bl2;
    }
}

