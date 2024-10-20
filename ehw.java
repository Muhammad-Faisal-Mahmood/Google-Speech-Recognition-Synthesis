/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothHeadset
 *  android.bluetooth.BluetoothProfile
 *  android.telephony.TelephonyManager
 */
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.telephony.TelephonyManager;

final class ehw
extends jqs
implements jro {
    final int a;
    final eie b;
    final BluetoothProfile c;

    public ehw(int n2, eie eie2, BluetoothProfile bluetoothProfile, jqb jqb2) {
        this.a = n2;
        this.b = eie2;
        this.c = bluetoothProfile;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        if (this.a == 1) {
            ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$bluetoothProfileServiceListener$1$onServiceConnected$1", "invokeSuspend", 127, "BluetoothDeviceManager.kt")).r("#audio# BT-headset-profile connected");
            Object object2 = this.b;
            object = this.c;
            jse.c(object, "null cannot be cast to non-null type android.bluetooth.BluetoothHeadset");
            object = (BluetoothHeadset)object;
            object.getClass();
            Object object3 = ((eie)object2).p;
            object2 = ((fpo)object3).f;
            Object object4 = ((fpo)object3).c;
            Object object5 = ((fpo)object3).e;
            Object object6 = ((fpo)object3).a;
            Object object7 = ((fpo)object3).d;
            object3 = ((fpo)object3).b.b();
            object7 = object7.b();
            object6 = object6.b();
            object5 = object5.b();
            object4 = object4.b();
            boolean bl2 = ((imr)object2).a();
            object2 = new eih((BluetoothHeadset)object, (TelephonyManager)object3, (ehe)object7, (ehe)object6, (ehe)object5, (ehe)object4, bl2);
            object = this.b;
            ((eie)object).k = object2;
            ((eie)object).d();
            object = this.b;
            object2 = new mz(object2, 8);
            gpm.y(((eie)object).l, (jrk)object2);
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new ehw(this.a, this.b, this.c, jqb2);
    }
}

