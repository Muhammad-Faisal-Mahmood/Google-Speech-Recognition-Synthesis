/*
 * Decompiled with CFR 0.152.
 */
final class eic
extends jsf
implements jqz {
    final eie a;
    private final int b;

    public eic(eie eie2, int n2) {
        this.b = n2;
        this.a = eie2;
        super(0);
    }

    @Override
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$registerCommunicationDeviceChangedListener$1$onFirstListener$1", "invoke", 349, "BluetoothDeviceManager.kt")).r("#audio# adding listener to audioManager");
            eie eie2 = this.a;
            ut$$ExternalSyntheticApiModelOutline0.m(eie2.d, eie2.c, eie2.j);
            return jon.a;
        }
        ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$unregisterCommunicationDeviceChangedListener$1$onLastListener$1", "invoke", 371, "BluetoothDeviceManager.kt")).r("#audio# removing listener from audioManager");
        eie eie3 = this.a;
        ut$$ExternalSyntheticApiModelOutline0.m(eie3.d, eie3.j);
        return jon.a;
    }
}

