/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothDevice
 *  android.media.AudioDeviceInfo
 */
import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class eht
extends jqs
implements jro {
    final Object a;
    final Object b;
    private final int c;

    public eht(eie eie2, egz egz2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = eie2;
        this.b = egz2;
        super(2, jqb2);
    }

    public eht(eif eif2, eav eav2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = eif2;
        this.b = eav2;
        super(2, jqb2);
    }

    public eht(erq erq2, erv erv2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = erq2;
        this.a = erv2;
        super(2, jqb2);
    }

    public eht(evv evv2, evw evw2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = evv2;
        this.a = evw2;
        super(2, jqb2);
    }

    public eht(evv evv2, hvu hvu2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = evv2;
        this.a = hvu2;
        super(2, jqb2);
    }

    public eht(evw evw2, ecl ecl2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = evw2;
        this.b = ecl2;
        super(2, jqb2);
    }

    public eht(gpm gpm2, jrk jrk2, jqb jqb2, int n2) {
        this.c = n2;
        this.b = gpm2;
        this.a = jrk2;
        super(2, jqb2);
    }

    public eht(jrk jrk2, Object object, jqb jqb2, int n2) {
        this.c = n2;
        this.a = jrk2;
        this.b = object;
        super(2, jqb2);
    }

    public eht(AudioDeviceInfo[] audioDeviceInfoArray, eie eie2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = audioDeviceInfoArray;
        this.b = eie2;
        super(2, jqb2);
    }

    public eht(AudioDeviceInfo[] audioDeviceInfoArray, eie eie2, jqb jqb2, int n2, byte[] byArray) {
        this.c = n2;
        this.a = audioDeviceInfoArray;
        this.b = eie2;
        super(2, jqb2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(Object var1_1) {
        switch (this.c) {
            default: {
                jns.ak(var1_1);
                var1_1 = this.b;
                this.a.a(var1_1);
                return jon.a;
            }
            case 8: {
                jns.ak(var1_1);
                var10_2 = ((gpm)this.b).d.iterator();
                while (var10_2.hasNext()) {
                    var1_1 = var10_2.next();
                    var8_8 = this.b;
                    var9_16 = this.a;
                    ((gpm)var8_8).x(var1_1, (jrk)var9_16);
                }
                return jon.a;
            }
            case 7: {
                jns.ak(var1_1);
                var9_17 = (ecn)((evw)this.a).d.a;
                if (var9_17 != null) {
                    var1_1 = var8_9 = var9_17.c;
                    if (var8_9 == null) {
                        var1_1 = ecl.a;
                    }
                } else {
                    var1_1 = null;
                }
                if (!jse.i(var1_1, this.b)) {
                    var1_1 = jon.a;
                } else {
                    var8_9 = (heg)evw.a.f().h(hfo.a, "ALT.SingleRecordStore").j("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore$removeAudio$1", "invokeSuspend", 140, "SingleAudioRecordStore.kt");
                    var1_1 = this.b;
                    var8_9.B("#audio# Cleaning up audio %s after storing. AudioRecordId: %d", evw.b, ((ecl)var1_1).c);
                    ((evw)this.a).d.d(var9_17, null);
                    var1_1 = jon.a;
                }
                return var1_1;
            }
            case 6: {
                jns.ak(var1_1);
                if (((evv)this.b).d()) {
                    var1_1 = jon.a;
                } else {
                    var8_10 = this.b;
                    var1_1 = this.a;
                    var8_10 = (evv)var8_10;
                    var8_10.c = var8_10.c.p((hvu)var1_1);
                    var1_1 = jon.a;
                }
                return var1_1;
            }
            case 5: {
                jns.ak(var1_1);
                if (((evv)this.b).d.c()) {
                    var1_1 = jon.a;
                } else {
                    var1_1 = this.a;
                    var13_24 = (evv)this.b;
                    var8_11 = var13_24.c;
                    jse.d(var8_11, "access$getAudioRecordingBytes$p(...)");
                    var10_3 = ecl.a.l();
                    jse.e(var10_3, "builder");
                    if (!var10_3.b.B()) {
                        var10_3.u();
                    }
                    var6_27 = var13_24.b;
                    var9_18 = (ecl)var10_3.b;
                    var9_18.b |= 1;
                    var9_18.c = var6_27;
                    var9_18 = var10_3.o();
                    jse.d(var9_18, "build(...)");
                    var11_28 = var9_18;
                    ((heg)evw.a.f().h(hfo.a, "ALT.SingleRecordStore").j("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore", "storeAudio", 117, "SingleAudioRecordStore.kt")).t("#audio# Storing audio. AudioRecordId: %d", var6_27);
                    var9_18 = (evw)var1_1;
                    var10_3 = var9_18.d;
                    var12_32 = ecn.a.l();
                    jse.e(var12_32, "builder");
                    jse.e(var11_28, "value");
                    if (!var12_32.b.B()) {
                        var12_32.u();
                    }
                    var13_24 = var13_24.a;
                    var14_35 = (ecn)var12_32.b;
                    var11_28.getClass();
                    var14_35.c = var11_28;
                    var14_35.b = 1 | var14_35.b;
                    jse.e(var13_24, "value");
                    if (!var12_32.b.B()) {
                        var12_32.u();
                    }
                    var14_35 = (ecn)var12_32.b;
                    var13_24.getClass();
                    var14_35.e = var13_24;
                    var14_35.b |= 4;
                    jse.e(var8_11, "value");
                    if (!var12_32.b.B()) {
                        var12_32.u();
                    }
                    var13_24 = (ecn)var12_32.b;
                    var8_11.getClass();
                    var13_24.b = 2 | var13_24.b;
                    var13_24.d = var8_11;
                    var8_11 = var12_32.o();
                    jse.d(var8_11, "build(...)");
                    var10_3.c((ecn)var8_11);
                    var9_18.c.b(gqk.i(new dpw(var1_1, var11_28, 15)), evw.b.toMinutes(), TimeUnit.MINUTES);
                    var1_1 = jon.a;
                }
                return var1_1;
            }
            case 4: {
                jns.ak(var1_1);
                var9_19 = this.a;
                var10_4 = (erv)var9_19;
                var8_12 = eqw.b(var10_4.e);
                var1_1 = var8_12;
                if (var8_12 == null) {
                    var1_1 = eqw.a;
                }
                if (var1_1 != eqw.b) {
                    ((heg)erq.a.f().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpcomingUpdates", 374, "MicStateReporterImpl.kt")).u("#audio# skip upcoming update(id(%s)), not supported", var10_4.d);
                } else {
                    var1_1 = (erq)this.b;
                    var8_12 = var1_1.b;
                    if (!(var8_12 instanceof Collection) || !var8_12.isEmpty()) {
                        var8_12 = var8_12.iterator();
                        while (var8_12.hasNext()) {
                            if (!jse.i(((erv)var8_12.next()).d, var10_4.d)) continue;
                            ((heg)erq.a.f().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "applyToPartialUpcomingUpdates", 380, "MicStateReporterImpl.kt")).u("#audio# skip upcoming update(id(%s)), already exists", var10_4.d);
                            break;
                        }
                    } else {
                        var1_1.b = jns.o(var1_1.b, var9_19);
                        var1_1 = (erq)this.b;
                        var1_1.c(var1_1.b(), euf.A(erh.a.l()).U());
                    }
                }
                return jon.a;
            }
            case 3: {
                jns.ak(var1_1);
                var9_20 = (heg)eif.a.f().h(hfo.a, "ALT.BtFallbackRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothFallbackAwareAudioRoute$awaitActualRouteDisconnectAsync$1$1", "invokeSuspend", 166, "BluetoothFallbackAwareAudioRoute.kt");
                var1_1 = var8_13 = ebg.b(((eav)this.b).c);
                if (var8_13 == null) {
                    var1_1 = ebg.a;
                }
                var11_29 = (eif)this.a;
                var8_13 = var11_29.b;
                var10_5 = var8_13.b;
                var1_1 = var1_1.name();
                var11_29 = var11_29.e.name();
                var9_20.H("#audio# client(%s) route(%s) disconnected(reason(%s), behavior(%s))", var8_13.d, var10_5, var1_1, var11_29);
                var2_37 = ((eif)this.a).e.ordinal();
                if (var2_37 != 0) {
                    if (var2_37 != 1 && var2_37 != 2) {
                        throw new joa();
                    }
                    var1_1 = jon.a;
                } else {
                    var1_1 = this.a;
                    var8_13 = this.b;
                    jse.b(var8_13);
                    var1_1 = ((eif)var1_1).f.O(var8_13);
                }
                return var1_1;
            }
            case 2: {
                jns.ak(var1_1);
                var1_1 = new mz(this.b, 10);
                return gpm.y(((eie)this.a).o, (jrk)var1_1);
            }
            case 1: {
                jns.ak(var1_1);
                var8_14 = (AudioDeviceInfo[])this.a;
                var2_38 = var8_14.length;
                var11_30 = new ArrayList<Boolean>(var2_38);
                var1_1 = this.b;
                for (var3_40 = 0; var3_40 < var2_38; ++var3_40) {
                    var12_33 = var8_14[var3_40];
                    jse.e(var12_33, "<this>");
                    if (!var12_33.isSource() || !eha.g(var12_33)) ** GOTO lbl202
                    var10_6 = eha.b(var12_33);
                    var9_21 /* !! */  = ((eie)var1_1).f;
                    if (var9_21 /* !! */  == null) ** GOTO lbl172
                    try {
                        var9_21 /* !! */  = var9_21 /* !! */ .getRemoteDevice((String)var10_6);
                    }
                    catch (Throwable var9_22) {
                        var9_21 /* !! */  = jns.aj(var9_22);
                    }
lbl172:
                    // 1 sources

                    var9_21 /* !! */  = null;
                    var10_6 = var9_21 /* !! */ ;
                    if (var9_21 /* !! */  instanceof jod) {
                        var10_6 = null;
                    }
                    if ((var9_21 /* !! */  = (BluetoothDevice)var10_6) != null) {
                        var13_25 = new egz(var12_33, (BluetoothDevice)var9_21 /* !! */ );
                        if (var13_25.e) {
                            ((heg)eie.a.h().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "maybeAddInputDevice", 452, "BluetoothDeviceManager.kt")).u("#audio# adding BT-device(%s) with a NULL address", eha.c(var12_33));
                        }
                        var9_21 /* !! */  = (eie)var1_1;
                        var10_6 = (egz)jns.l(var9_21 /* !! */ .e);
                        var4_42 = var10_6 != null && var10_6.d == (var4_42 = var12_33.getId()) ? 0 : 1;
                        var10_6 = jns.d(var13_25);
                        var14_36 = var9_21 /* !! */ .e;
                        var13_25 = new ArrayList<E>();
                        var14_36 = var14_36.iterator();
                        while (var14_36.hasNext()) {
                            var15_46 = var14_36.next();
                            if (((egz)var15_46).d == var12_33.getId()) continue;
                            var13_25.add(var15_46);
                        }
                        var9_21 /* !! */ .e = jns.n((Collection)var10_6, (Iterable)var13_25);
                        if (var4_42 != 0) {
                            ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "maybeAddInputDevice", 463, "BluetoothDeviceManager.kt")).u("#audio# BT-device(%s) is connected & now recent", eha.c(var12_33));
                        }
                        var5_44 = true;
                    } else {
                        ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "maybeAddInputDevice", 447, "BluetoothDeviceManager.kt")).u("#audio# ignore BT-device(%s), no remote device", eha.c(var12_33));
lbl202:
                        // 2 sources

                        var5_44 = false;
                    }
                    var11_30.add(var5_44);
                }
                if (!var11_30.isEmpty()) {
                    var1_1 = var11_30.iterator();
                    while (var1_1.hasNext()) {
                        if (!((Boolean)var1_1.next()).booleanValue()) continue;
                        ((eie)this.b).d();
                        break;
                    }
                }
                return jon.a;
            }
            case 0: 
        }
        jns.ak(var1_1);
        var9_23 = (AudioDeviceInfo[])this.a;
        var4_43 = var9_23.length;
        var8_15 = new ArrayList<Boolean>(var4_43);
        for (var2_39 = 0; var2_39 < var4_43; ++var2_39) {
            var1_1 = this.b;
            var10_7 = var9_23[var2_39];
            var1_1 = (eie)var1_1;
            var11_31 = var1_1.e;
            if (var11_31 instanceof Collection && var11_31.isEmpty()) {
                while (true) {
                    var5_45 = false;
                    break;
                }
            } else {
                var11_31 = var11_31.iterator();
                do {
                    if (!var11_31.hasNext()) ** continue;
                } while (((egz)var11_31.next()).d != var10_7.getId());
                var11_31 = (egz)jns.l(var1_1.e);
                var3_41 = var11_31 != null && var11_31.d == (var3_41 = var10_7.getId()) ? 1 : 0;
                var12_34 = var1_1.e;
                var11_31 = new ArrayList<E>();
                var12_34 = var12_34.iterator();
                while (var12_34.hasNext()) {
                    var13_26 = var12_34.next();
                    if (((egz)var13_26).d == var10_7.getId()) continue;
                    var11_31.add(var13_26);
                }
                var1_1.e = var11_31;
                ((heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "maybeRemoveInputDevice", 472, "BluetoothDeviceManager.kt")).u("#audio# BT-device(%s) is disconnected", eha.c((AudioDeviceInfo)var10_7));
                if (var3_41 != 0 && !var1_1.e.isEmpty()) {
                    var10_7 = (heg)eie.a.f().h(hfo.a, "ALT.BtDevicesMgr").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "maybeRemoveInputDevice", 476, "BluetoothDeviceManager.kt");
                    var1_1 = (egz)jns.l(var1_1.e);
                    var1_1 = var1_1 != null ? var1_1.c : null;
                    var10_7.u("#audio# BT-device(%s) is now recent", var1_1);
                }
                var5_45 = true;
            }
            var8_15.add(var5_45);
        }
        if (!var8_15.isEmpty()) {
            var1_1 = var8_15.iterator();
            while (var1_1.hasNext()) {
                if (!((Boolean)var1_1.next()).booleanValue()) continue;
                ((eie)this.b).d();
                break;
            }
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        switch (this.c) {
            default: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 8: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 7: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 6: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((eht)object2).a(object);
            }
            case 5: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 4: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 3: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((eht)object2).a(object);
            }
            case 2: {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((eht)object2).a(object);
            }
            case 1: {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((eht)object).a(object2);
            }
            case 0: 
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((eht)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        switch (this.c) {
            default: {
                return new eht((jrk)this.a, this.b, jqb2, 9);
            }
            case 8: {
                object = this.b;
                Object object2 = this.a;
                return new eht((gpm)object, (jrk)object2, jqb2, 8);
            }
            case 7: {
                Object object3 = this.a;
                object = (ecl)this.b;
                return new eht((evw)object3, (ecl)object, jqb2, 7);
            }
            case 6: {
                Object object4 = this.b;
                object = (hvu)this.a;
                return new eht((evv)object4, (hvu)object, jqb2, 6);
            }
            case 5: {
                Object object5 = this.b;
                object = (evw)this.a;
                return new eht((evv)object5, (evw)object, jqb2, 5);
            }
            case 4: {
                object = this.b;
                erv erv2 = (erv)this.a;
                return new eht((erq)object, erv2, jqb2, 4);
            }
            case 3: {
                object = this.a;
                eav eav2 = (eav)this.b;
                return new eht((eif)object, eav2, jqb2, 3);
            }
            case 2: {
                object = this.a;
                egz egz2 = (egz)this.b;
                return new eht((eie)object, egz2, jqb2, 2);
            }
            case 1: {
                Object object6 = this.a;
                object = (eie)this.b;
                return new eht((AudioDeviceInfo[])object6, (eie)object, jqb2, 1, null);
            }
            case 0: 
        }
        Object object7 = this.a;
        object = (eie)this.b;
        return new eht((AudioDeviceInfo[])object7, (eie)object, jqb2, 0);
    }
}

