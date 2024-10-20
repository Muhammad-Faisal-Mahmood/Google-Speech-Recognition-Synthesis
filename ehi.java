/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class ehi {
    final ehq a;

    public ehi(ehq ehq2) {
        this.a = ehq2;
    }

    public final jnv a() {
        return new jsc(1, this.a, ehq.class, "logBluetoothAudioInputDevicesChanged", "logBluetoothAudioInputDevicesChanged(Ljava/util/List;)V");
    }

    public final void b(List object) {
        jse.e(object, "p0");
        ehq ehq2 = this.a;
        ReentrantLock reentrantLock = ehq2.i;
        reentrantLock.lock();
        try {
            if (!ehq2.h.get()) {
                if (!ehq2.g.b) {
                } else {
                    ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "logBluetoothAudioInputDevicesChanged", 490, "BluetoothAudioRoute.kt")).u("#audio# route(%s) observed devices connection changed", ehq2.b.b);
                    egz egz2 = ehq2.g.a();
                    if (egz2 == null) {
                        ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "logBluetoothAudioInputDevicesChanged", 496, "BluetoothAudioRoute.kt")).u("#audio# devices connection changed for route(%s), but we are not connected", ehq2.b.b);
                        return;
                    }
                    if (!(object instanceof Collection) || !object.isEmpty()) {
                        object = object.iterator();
                        while (object.hasNext()) {
                            if (!jse.i((egz)object.next(), egz2)) continue;
                            ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "logBluetoothAudioInputDevicesChanged", 505, "BluetoothAudioRoute.kt")).u("#audio# devices connection changed for route(%s), but we are still connected", ehq2.b.b);
                            return;
                        }
                    }
                    ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "logBluetoothAudioInputDevicesChanged", 514, "BluetoothAudioRoute.kt")).u("#audio# route(%s) device got disconnected", ehq2.b.b);
                    return;
                }
            }
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public final boolean equals(Object object) {
        if (object instanceof ehi) {
            return jse.i(this.a(), ((ehi)object).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a().hashCode();
    }
}

