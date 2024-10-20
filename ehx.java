/*
 * Decompiled with CFR 0.152.
 */
final class ehx
extends jqs
implements jro {
    final int a;
    final eie b;

    public ehx(int n2, eie eie2, jqb jqb2) {
        this.a = n2;
        this.b = eie2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jns.ak(object);
        if (this.a == 1 && this.b.k != null) {
            ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$bluetoothProfileServiceListener$1$onServiceDisconnected$1", "invokeSuspend", 144, "BluetoothDeviceManager.kt")).r("#audio# BT-headset-profile disconnected");
            object = this.b;
            ((eie)object).k = null;
            gpm.y(((eie)object).l, wl.k);
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new ehx(this.a, this.b, jqb2);
    }
}

