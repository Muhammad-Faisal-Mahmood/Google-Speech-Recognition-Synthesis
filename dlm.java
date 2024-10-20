/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.bluetooth.BluetoothDevice
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.media.AudioRecord
 *  android.net.Uri
 */
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.media.AudioRecord;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class dlm {
    public final Object a;

    public dlm() {
        this.a = new ConcurrentHashMap();
    }

    public dlm(int n2) {
        this.a = fvc.ai(n2);
    }

    public dlm(Context context, dlm dlm2) {
        this.a = dlm2;
        Object object = dlm2.a;
        context = (Application)context;
        context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
        context.registerComponentCallbacks((ComponentCallbacks)dlm2.a);
    }

    public dlm(AudioRecord audioRecord) {
        jse.e(audioRecord, "audioRecord");
        this.a = audioRecord;
    }

    public dlm(hwd hwd2) {
        Object object = hxl.b;
        this.a = hwd2;
        object = hwd2;
        hwd2.f = this;
    }

    public dlm(hzm hzm2, Object object, hzm hzm3, Object object2) {
        this.a = new gpm(hzm2, object, hzm3, object2);
    }

    public dlm(iwx iwx2) {
        fxf.K(iwx2);
        this.a = iwx2;
    }

    public dlm(Object object) {
        a.s(object, "Response message cannot be null");
        this.a = object;
    }

    public dlm(Object object, byte[] byArray) {
        this.a = object;
    }

    public dlm(Object object, char[] cArray) {
        this.a = object;
    }

    public dlm(jnu jnu2, byte[] byArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public dlm(jnu jnu2, char[] cArray) {
        jnu2.getClass();
        this.a = jnu2;
    }

    public static int M(gpm gpm2, Object object, Object object2) {
        return hwl.a((hzm)((Object)gpm2.c), 1, object) + hwl.a((hzm)((Object)gpm2.a), 2, object2);
    }

    public static void N(hwd hwd2, gpm gpm2, Object object, Object object2) {
        hwl.h(hwd2, (hzm)((Object)gpm2.c), 1, object);
        hwl.h(hwd2, (hzm)((Object)gpm2.a), 2, object2);
    }

    public final void A(int n2, Object object, hyu hyu2) {
        hyf hyf2 = (hyf)object;
        object = (hwd)this.a;
        ((hwd)object).A(n2, 3);
        hyu2.m(hyf2, ((hwd)object).f);
        ((hwd)object).A(n2, 4);
    }

    public final void B(int n2, int n3) {
        ((hwd)this.a).s(n2, n3);
    }

    public final void C(int n2, long l2) {
        ((hwd)this.a).D(n2, l2);
    }

    public final void D(int n2, Object object, hyu hyu2) {
        object = (hyf)object;
        ((hwd)this.a).u(n2, (hyf)object, hyu2);
    }

    public final void E(int n2, Object object) {
        if (object instanceof hvu) {
            Object object2 = this.a;
            object = (hvu)object;
            ((hwd)object2).x(n2, (hvu)object);
            return;
        }
        Object object3 = this.a;
        object = (hyf)object;
        ((hwd)object3).w(n2, (hyf)object);
    }

    public final void F(int n2, int n3) {
        ((hwd)this.a).o(n2, n3);
    }

    public final void G(int n2, long l2) {
        ((hwd)this.a).q(n2, l2);
    }

    public final void H(int n2, int n3) {
        ((hwd)this.a).ao(n2, n3);
    }

    public final void I(int n2, long l2) {
        ((hwd)this.a).aq(n2, l2);
    }

    public final void J(int n2, String string) {
        ((hwd)this.a).y(n2, string);
    }

    public final void K(int n2, int n3) {
        ((hwd)this.a).B(n2, n3);
    }

    public final void L(int n2, long l2) {
        ((hwd)this.a).D(n2, l2);
    }

    public final void a(dll dll2) {
        fxf.K(dll2);
        Object object = ((dlm)this.a).a;
        int n2 = dln.c;
        ((dln)object).a.add(dll2);
    }

    public final void b(dll dll2) {
        Object object = ((dlm)this.a).a;
        int n2 = dln.c;
        ((dln)object).a.remove(dll2);
    }

    public final String c(Uri object, String string, String string2) {
        Object object2;
        if (object != null) {
            object2 = this.a;
            object = object.toString();
            object = (pa)((pa)object2).get(object);
        } else {
            object = null;
        }
        if (object == null) {
            return null;
        }
        object2 = string2;
        if (string != null) {
            object2 = string.concat(String.valueOf(string2));
        }
        return (String)((pa)object).get(object2);
    }

    public final /* synthetic */ eau d() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eau)hwv2;
    }

    public final void e(eco eco2) {
        jse.e(eco2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eau)hyg2.b;
        eau eau2 = eau.a;
        eco2.getClass();
        ((eau)hyg2).c = eco2;
        ((eau)hyg2).b |= 1;
    }

    public final void f(edf edf2) {
        jse.e(edf2, "value");
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eau)hyg2.b;
        eau eau2 = eau.a;
        edf2.getClass();
        ((eau)hyg2).d = edf2;
        ((eau)hyg2).b |= 2;
    }

    public final /* synthetic */ eao g() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eao)hwv2;
    }

    public final /* synthetic */ eam h() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eam)hwv2;
    }

    public final /* synthetic */ eae i() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eae)hwv2;
    }

    public final void j(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eae)hyg2.b;
        eae eae2 = eae.a;
        ((eae)hyg2).b |= 4;
        ((eae)hyg2).e = n2;
    }

    public final void k(int n2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eae eae2 = (eae)hyg2.b;
        hyg2 = eae.a;
        eae2.b |= 1;
        eae2.c = n2;
    }

    public final void l(boolean bl2) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (eae)hyg2.b;
        eae eae2 = eae.a;
        ((eae)hyg2).b |= 0x800;
        ((eae)hyg2).m = bl2;
    }

    public final /* synthetic */ eln m() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eln)hwv2;
    }

    public final void n(String string) {
        hyg hyg2 = (hwp)this.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        eln eln2 = (eln)hyg2.b;
        hyg2 = eln.a;
        eln2.b |= 1;
        eln2.c = string;
    }

    public final eli o(ecp ecp2, jqz jqz2, hpn hpn2) {
        ecp2.getClass();
        hpn2.getClass();
        jvb jvb2 = (jvb)this.a.b();
        jvb2.getClass();
        return new eli(ecp2, jqz2, hpn2, jvb2);
    }

    public final /* synthetic */ eip p() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (eip)hwv2;
    }

    public final boolean q(BluetoothDevice bluetoothDevice) {
        boolean bl2;
        block3: {
            jse.e(bluetoothDevice, "device");
            Object object = ((iah)this.a).b;
            jse.d(object, "getElementList(...)");
            bl2 = object instanceof Collection;
            boolean bl3 = false;
            if (bl2 && object.isEmpty()) {
                bl2 = bl3;
            } else {
                String string;
                Object object2;
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                    string = (String)object.next();
                    Object object3 = eha.d(bluetoothDevice);
                    object2 = Locale.getDefault();
                    jse.d(object2, "getDefault(...)");
                    object2 = ((String)object3).toLowerCase((Locale)object2);
                    jse.d(object2, "toLowerCase(...)");
                    jse.b(string);
                    object3 = Locale.getDefault();
                    jse.d(object3, "getDefault(...)");
                    string = string.toLowerCase((Locale)object3);
                    jse.d(string, "toLowerCase(...)");
                } while (!jse.F((CharSequence)object2, string));
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void r(Object object, img img2) {
        a.r(object, "key");
        a.r(img2, "provider");
        ((LinkedHashMap)this.a).put(object, img2);
    }

    public final /* synthetic */ hwh s() {
        hwv hwv2 = ((hwp)this.a).o();
        jse.d(hwv2, "build(...)");
        return (hwh)hwv2;
    }

    public final void t(int n2, boolean bl2) {
        ((hwd)this.a).l(n2, bl2);
    }

    public final void u(int n2, hvu hvu2) {
        ((hwd)this.a).m(n2, hvu2);
    }

    public final void v(int n2, double d2) {
        ((hwd)this.a).aj(n2, d2);
    }

    public final void w(int n2, int n3) {
        ((hwd)this.a).s(n2, n3);
    }

    public final void x(int n2, int n3) {
        ((hwd)this.a).o(n2, n3);
    }

    public final void y(int n2, long l2) {
        ((hwd)this.a).q(n2, l2);
    }

    public final void z(int n2, float f2) {
        ((hwd)this.a).al(n2, f2);
    }
}

