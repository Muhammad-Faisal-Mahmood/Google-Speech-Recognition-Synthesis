/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

final class eid
extends jqs
implements jro {
    int a;
    final eie b;
    final AmbientMode$AmbientController c;
    private final int d;

    public eid(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2) {
        this.d = n2;
        this.b = eie2;
        this.c = ambientMode$AmbientController;
        super(2, jqb2);
    }

    public eid(eie eie2, AmbientMode$AmbientController ambientMode$AmbientController, jqb jqb2, int n2, byte[] byArray) {
        this.d = n2;
        this.b = eie2;
        this.c = ambientMode$AmbientController;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        block9: {
            block11: {
                eie eie2;
                jqh jqh2;
                block10: {
                    block8: {
                        block4: {
                            block5: {
                                block7: {
                                    jqh jqh3;
                                    block6: {
                                        if (this.d == 0) break block4;
                                        jqh3 = jqh.a;
                                        int n2 = this.a;
                                        jns.ak(object);
                                        if (n2 != 0) break block5;
                                        ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$registerCommunicationDeviceChangedListener$1", "invokeSuspend", 342, "BluetoothDeviceManager.kt")).r("#audio# registerCommunicationDeviceChangedListener");
                                        object = this.b;
                                        if (((eie)object).j != null) break block6;
                                        ((heg)eie.a.h().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$registerCommunicationDeviceChangedListener$1", "invokeSuspend", 345, "BluetoothDeviceManager.kt")).r("#audio# communicationDeviceChangedListener is null");
                                        object = jon.a;
                                        break block7;
                                    }
                                    eic eic2 = new eic((eie)object, 1);
                                    object = gpm.z(((eie)object).o, this.c, new eib(eic2, 1), null, 4);
                                    this.a = 1;
                                    if (jsd.l((hpn)object, this) != jqh3) break block5;
                                    object = jqh3;
                                }
                                return object;
                            }
                            return jon.a;
                        }
                        jqh2 = jqh.a;
                        if (this.a == 0) break block8;
                        jns.ak(object);
                        break block9;
                    }
                    jns.ak(object);
                    ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$unregisterCommunicationDeviceChangedListener$1", "invokeSuspend", 364, "BluetoothDeviceManager.kt")).r("#audio# unregisterCommunicationDeviceChangedListener");
                    eie2 = this.b;
                    if (eie2.j != null) break block10;
                    ((heg)eie.a.h().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$unregisterCommunicationDeviceChangedListener$1", "invokeSuspend", 367, "BluetoothDeviceManager.kt")).r("#audio# communicationDeviceChangedListener is null");
                    object = jon.a;
                    break block11;
                }
                object = new eic(eie2, 0);
                object = eie2.o.w(this.c, new eib(object, 0));
                this.a = 1;
                if (jsd.l((hpn)object, this) != jqh2) break block9;
                object = jqh2;
            }
            return object;
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.d != 0) {
            object = ((jqm)this).c((jvb)object, (jqb)object2);
            object2 = jon.a;
            return ((eid)object).a(object2);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((eid)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.d != 0) {
            return new eid(this.b, this.c, jqb2, 1, null);
        }
        return new eid(this.b, this.c, jqb2, 0);
    }
}

