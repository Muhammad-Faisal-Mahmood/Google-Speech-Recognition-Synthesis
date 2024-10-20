/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.bluetooth.BluetoothDevice
 *  android.bluetooth.BluetoothManager
 *  android.bluetooth.BluetoothProfile$ServiceListener
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.media.AudioDeviceCallback
 *  android.media.AudioManager
 *  android.os.Build$VERSION
 */
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Build;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class eie {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager");
    public final Context b;
    public final Executor c;
    public final AudioManager d;
    public List e;
    public BluetoothAdapter f;
    public final jtz g;
    public final AudioDeviceCallback h;
    public final ehv i;
    public final AudioManager$OnCommunicationDeviceChangedListener j;
    public eih k;
    public final gpm l;
    public final gpm m;
    public final gpm n;
    public final gpm o;
    public final fpo p;
    private final jvb q;
    private final iku r;
    private final ehy s;
    private final dtu t;

    public eie(Context object, Executor executor, jvb jvb2, fpo fpo2, AudioManager audioManager, iku iku2, gpm gpm2, bzb bzb2) {
        jse.e(executor, "lightweightExecutor");
        jse.e(jvb2, "lightweightScope");
        jse.e(iku2, "bluetoothManager");
        jse.e(gpm2, "traceCreation");
        this.b = object;
        this.c = executor;
        this.q = jvb2;
        this.p = fpo2;
        this.d = audioManager;
        this.r = iku2;
        this.t = cqq.av(jvb2);
        this.e = jpa.a;
        this.g = new jtz(false, jud.a);
        this.l = bzb2.G();
        this.m = bzb2.G();
        this.n = bzb2.G();
        this.o = bzb2.G();
        this.h = gpm2.a(new ehu(this), "ALT.BluetoothDeviceManager.audioDeviceCallback");
        this.s = new ehy(this);
        this.i = new ehv(this);
        object = Build.VERSION.SDK_INT >= 31 ? new ehr(this) : null;
        this.j = object;
        this.b(new ehs(this, null, 0));
    }

    public final hpn a() {
        return this.b(new ehs(this, null, 3, null));
    }

    public final hpn b(jro jro2) {
        return this.t.j(jro2);
    }

    public final List c() {
        List arrayList2 = this.e;
        Object object = new ArrayList();
        for (Object t2 : arrayList2) {
            if (((egz)t2).e) continue;
            object.add(t2);
        }
        if (!object.isEmpty()) {
            return this.e;
        }
        if (!this.e.isEmpty() && (object = this.k) != null) {
            object = ((eih)object).b.getConnectedDevices();
            jse.d(object, "getConnectedDevices(...)");
            if (object != null) {
                ArrayList<egz> arrayList = new ArrayList<egz>(jns.B((Iterable)object));
                object = object.iterator();
                while (object.hasNext()) {
                    arrayList.add(new egz(null, (BluetoothDevice)object.next()));
                }
                object = new ArrayList();
                for (Object t3 : arrayList) {
                    if (((egz)t3).e) continue;
                    object.add(t3);
                }
                ((heg)a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "makeBluetoothAudioInputDevicesList", 510, "BluetoothDeviceManager.kt")).u("#audio# falling back to the profile's connected devices, # of available devices(%s)", new hue(object.size()));
                return jns.n(this.e, (Iterable)object);
            }
        }
        return jpa.a;
    }

    public final void d() {
        Object object = this.c();
        ((heg)a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "handleBluetoothAudioInputDevicesAvailabilityChanged", 485, "BluetoothDeviceManager.kt")).u("#audio# observed BT-devices connection changes, # of available devices(%s)", new hue(object.size()));
        object = new mz(object, 9);
        gpm.y(this.m, (jrk)object);
    }

    public final boolean e() {
        block13: {
            boolean bl2;
            Object throwable;
            Object var5_5;
            Object object;
            block12: {
                if (!this.g.b()) {
                    ((heg)a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 405, "BluetoothDeviceManager.kt")).r("#audio# ensure BT-components initialized");
                }
                boolean bl22 = euf.r(this.b);
                boolean n2 = false;
                if (!bl22) {
                    ((heg)a.h().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 408, "BluetoothDeviceManager.kt")).r("#audio# BT-headset-profile failed to register, no BT permission");
                    return false;
                }
                object = this.f;
                var5_5 = null;
                throwable = object;
                if (object == null) {
                    try {
                        throwable = Build.VERSION.SDK_INT >= 31 ? ((BluetoothManager)this.r.b()).getAdapter() : BluetoothAdapter.getDefaultAdapter();
                    }
                    catch (Throwable throwable2) {
                        throwable = jns.aj(throwable2);
                    }
                    object = throwable;
                    if (throwable instanceof jod) {
                        object = null;
                    }
                    throwable = object;
                }
                this.f = throwable;
                if (this.g.b()) break block13;
                throwable = this.f;
                if (throwable == null) break block12;
                try {
                    throwable = throwable.getProfileProxy(this.b, (BluetoothProfile.ServiceListener)this.s, 1);
                }
                catch (Throwable throwable3) {
                    throwable = jns.aj(throwable3);
                }
            }
            throwable = null;
            if (throwable instanceof jod) {
                throwable = var5_5;
            }
            object = this.g;
            if ((throwable = (Boolean)throwable) != null) {
                bl2 = (Boolean)throwable;
            }
            object.a = bl2;
        }
        if (!this.g.b()) {
            ((heg)a.h().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 434, "BluetoothDeviceManager.kt")).r("#audio# BT-headset-profile failed to register");
        }
        return this.g.b();
    }

    public final hpn f(AmbientMode$AmbientController ambientMode$AmbientController) {
        jse.e(ambientMode$AmbientController, "listener");
        return this.b(new bes(this, ambientMode$AmbientController, null, 3));
    }

    public final hpn g(AmbientMode$AmbientController ambientMode$AmbientController) {
        jse.e(ambientMode$AmbientController, "listener");
        return this.b(new bes(this, ambientMode$AmbientController, null, 6, null));
    }

    /*
     * Unable to fully structure code
     */
    public final Object h(AmbientMode$AmbientController var1_1, jqb var2_2) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        if (!(var2_2 instanceof ehz)) ** GOTO lbl-1000
                        var4_3 = (ehz)var2_2;
                        var3_4 = var4_3.c;
                        if ((var3_4 & -2147483648) != 0) {
                            var4_3.c = var3_4 + -2147483648;
                            var2_2 = var4_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new ehz(this, (jqb)var2_2);
                        }
                        var4_3 = var2_2.a;
                        var5_5 = jqh.a;
                        var3_4 = var2_2.c;
                        if (var3_4 == 0) break block8;
                        if (var3_4 != 1) break block9;
                        var1_1 = var2_2.e;
                        var2_2 = var2_2.d;
                        jns.ak(var4_3);
                        break block10;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var4_3);
                var4_3 = this.a();
                var2_2.d = this;
                var2_2.e = var1_1;
                var2_2.c = 1;
                var4_3 = jsd.l((hpn)var4_3, (jqb)var2_2);
                if (var4_3 == var5_5) break block11;
                var2_2 = this;
            }
            var4_3 = eha.a((List)var4_3);
            if (var4_3 != null) {
                var6_6 = var2_2.b;
                var5_5 = new IntentFilter();
                var5_5.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                var2_2 = null;
                var5_5 = ye.h(var6_6, null, (IntentFilter)var5_5);
                if (var5_5 != null) {
                    var2_2 = new Integer(var5_5.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1));
                }
                if (var2_2 != null && var2_2.intValue() == 1) {
                    ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "notifyScoAudioConnectedIfBroadcasted", 316, "BluetoothDeviceManager.kt")).u("#audio# BT-sco-audio is already connected, simulate connected for device %s", var4_3.c);
                    var1_1.d(ehb.a, ehb.d, (egz)var4_3);
                }
            }
            return jon.a;
        }
        return var5_5;
    }
}

