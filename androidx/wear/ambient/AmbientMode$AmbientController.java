/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.wear.ambient;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocket;
import org.chromium.net.NetworkChangeNotifier;

public final class AmbientMode$AmbientController {
    public final Object a;

    public AmbientMode$AmbientController() {
        throw null;
    }

    public AmbientMode$AmbientController(Object object) {
        this.a = object;
    }

    public /* synthetic */ AmbientMode$AmbientController(Object object, byte[] byArray) {
        this.a = object;
    }

    public AmbientMode$AmbientController(char[] cArray) {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public final void A(long[] lArray) {
        ((NetworkChangeNotifier)this.a).f(lArray);
    }

    public final boolean B(SSLSocket object) {
        jse.e(object, "sslSocket");
        object = object.getClass().getName();
        jse.d(object, "getName(...)");
        return jse.X((String)object, ((String)this.a).concat("."));
    }

    public final void a(int n2) {
        ((apc)this.a).f(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int n2) {
        Object object = this.a;
        synchronized (object) {
            Object object2 = this.a;
            hwp hwp2 = fib.a.l();
            hyg hyg2 = fhz.a.l();
            if (!hyg2.b.B()) {
                hyg2.u();
            }
            fhz fhz2 = (fhz)hyg2.b;
            fhz2.c = n2 - 1;
            fhz2.b |= 1;
            fhz2 = (fhz)hyg2.o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (fib)hwp2.b;
            fhz2.getClass();
            ((fib)hyg2).c = fhz2;
            ((fib)hyg2).b = 1;
            object2.c((fib)hwp2.o());
            this.a.a();
            return;
        }
    }

    public final void c() {
        this.a.a();
    }

    public final void d(ehb object, ehb ehb2, egz egz2) {
        jse.e(object, "prevState");
        jse.e((Object)ehb2, "state");
        Object object2 = this.a;
        ReentrantLock reentrantLock = ((ehq)object2).i;
        reentrantLock.lock();
        try {
            if (!((ehq)object2).h.get()) {
                if (!((ehq)object2).g.b) {
                } else {
                    ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 422, "BluetoothAudioRoute.kt")).H("#audio# route(%s) update(%s->%s, %s)", ((ehq)object2).b.b, object, (Object)ehb2, egz2.c);
                    object = ((ehq)object2).g.a();
                    if (object != null && !jse.i(object, egz2)) {
                        ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 438, "BluetoothAudioRoute.kt")).u("#audio# skip route(%s) audio connection, not ours", ((ehq)object2).b.b);
                        return;
                    }
                    if (ehb2 == ehb.c) {
                        ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 444, "BluetoothAudioRoute.kt")).u("#audio# route(%s) observing audio connection in progress", ((ehq)object2).b.b);
                        return;
                    }
                    if (ehb2 != ehb.d) {
                        if (!jse.i(object, egz2)) {
                            ((heg)ehq.a.c().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 456, "BluetoothAudioRoute.kt")).u("#audio# route(%s) observed audio disconnection, not ours", ((ehq)object2).b.b);
                        } else {
                            ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 462, "BluetoothAudioRoute.kt")).u("#audio# route(%s) audio disconnected", ((ehq)object2).b.b);
                        }
                        return;
                    }
                    ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 467, "BluetoothAudioRoute.kt")).u("#audio# route(%s) audio connected", ((ehq)object2).b.b);
                    if (jse.i(((ehq)object2).g.a, egz2)) {
                        object = eim.b(((ehq)object2).g, null, false, true, 3);
                        ((ehq)object2).g = object;
                    } else {
                        ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "handleBluetoothDeviceAudioConnectionStateChanged", 474, "BluetoothAudioRoute.kt")).C("#audio# route(%s) connected audio to a new device(%s)", ((ehq)object2).b.b, egz2.c);
                        object = eim.b(((ehq)object2).g, egz2, false, true, 2);
                        ((ehq)object2).g = object;
                    }
                    ((ehq)object2).n.O(jon.a);
                    ((ehq)object2).p.t(((ehq)object2).b.b, egz2, ecb.d);
                    return;
                }
            }
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        if (((ehq)this.a).h.get()) {
            return;
        }
        ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute$bluetoothHeadsetProfileListener$1", "onBluetoothHeadsetProfileDisconnected", 133, "BluetoothAudioRoute.kt")).u("#audio# route(%s) BT-headset-profile disconnected", ((ehq)this.a).b.b);
        ((ehq)this.a).m.O(null);
        Object object = this.a;
        ebg ebg2 = ebg.t;
        gax.c(((ehq)object).c(ebg2), "#audio# failed to disconnect Bluetooth route when profile disconnected", new Object[0]);
    }

    public final void f(eih eih2) {
        if (((ehq)this.a).h.get()) {
            return;
        }
        ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute$bluetoothHeadsetProfileListener$1", "onBluetoothHeadsetProfileConnected", 125, "BluetoothAudioRoute.kt")).u("#audio# route(%s) BT-headset-profile connected", ((ehq)this.a).b.b);
        ((ehq)this.a).m.O(eih2);
    }

    public final dcv g(String object) {
        dcv dcv2 = (dcv)((dhl)this.a).i.get(object);
        object = dcv2;
        if (dcv2 == null) {
            object = dcv.a;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Iterable h() {
        Object object = this.a;
        synchronized (object) {
            return ((dhl)this.a).c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Iterable i() {
        Object object = this.a;
        synchronized (object) {
            return ((dhl)this.a).d;
        }
    }

    public final boolean isAmbient() {
        AmbientDelegate ambientDelegate = ((AmbientMode)((Object)this.a)).a;
        if (ambientDelegate == null) {
            return false;
        }
        return ambientDelegate.h();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Iterable j() {
        Object object = this.a;
        synchronized (object) {
            return ((dhl)this.a).e;
        }
    }

    public final lg k(int n2) {
        lg lg2;
        RecyclerView recyclerView = (RecyclerView)this.a;
        int n3 = recyclerView.h.c();
        int n4 = 0;
        lg lg3 = null;
        while (true) {
            lg2 = lg3;
            if (n4 >= n3) break;
            lg2 = RecyclerView.j(recyclerView.h.f(n4));
            lg lg4 = lg3;
            if (lg2 != null) {
                lg4 = lg3;
                if (!lg2.isRemoved()) {
                    lg4 = lg3;
                    if (lg2.mPosition == n2) {
                        if (!recyclerView.h.k(lg2.itemView)) break;
                        lg4 = lg2;
                    }
                }
            }
            ++n4;
            lg3 = lg4;
        }
        if (lg2 == null) {
            return null;
        }
        if (((RecyclerView)this.a).h.k(lg2.itemView)) {
            return null;
        }
        return lg2;
    }

    public final void l(hc object) {
        int n2 = ((hc)object).a;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 8) {
                        return;
                    }
                    ((RecyclerView)this.a).n.z(((hc)object).b, ((hc)object).d);
                    return;
                }
                ko ko2 = ((RecyclerView)this.a).n;
                n2 = ((hc)object).b;
                int n3 = ((hc)object).d;
                object = ((hc)object).c;
                ko2.B(n2, n3);
                return;
            }
            ((RecyclerView)this.a).n.A(((hc)object).b, ((hc)object).d);
            return;
        }
        ((RecyclerView)this.a).n.x(((hc)object).b, ((hc)object).d);
    }

    public final void m(int n2, int n3, Object object) {
        lg lg2;
        int n4;
        RecyclerView recyclerView = (RecyclerView)this.a;
        int n5 = recyclerView.h.c();
        int n6 = 0;
        while (true) {
            int n7;
            n4 = n2 + n3;
            if (n6 >= n5) break;
            View view = recyclerView.h.f(n6);
            lg2 = RecyclerView.j(view);
            if (lg2 != null && !lg2.shouldIgnore() && (n7 = lg2.mPosition) >= n2 && n7 < n4) {
                lg2.addFlags(2);
                lg2.addChangePayload(object);
                ((kp)view.getLayoutParams()).e = true;
            }
            ++n6;
        }
        object = recyclerView.e;
        n3 = ((kv)object).c.size();
        while ((n6 = n3 - 1) >= 0) {
            lg2 = (lg)((kv)object).c.get(n6);
            if (lg2 == null) {
                n3 = n6;
                continue;
            }
            n5 = lg2.mPosition;
            n3 = n6;
            if (n5 < n2) continue;
            n3 = n6;
            if (n5 >= n4) continue;
            lg2.addFlags(2);
            ((kv)object).i(n6);
            n3 = n6;
        }
        ((RecyclerView)this.a).Q = true;
    }

    public final void n(int n2, int n3) {
        Object object;
        int n4;
        RecyclerView recyclerView = (RecyclerView)this.a;
        int n5 = recyclerView.h.c();
        for (n4 = 0; n4 < n5; ++n4) {
            object = RecyclerView.j(recyclerView.h.f(n4));
            if (object == null || ((lg)object).shouldIgnore() || ((lg)object).mPosition < n2) continue;
            ((lg)object).offsetPosition(n3, false);
            recyclerView.O.f = true;
        }
        object = recyclerView.e;
        n5 = ((kv)object).c.size();
        for (n4 = 0; n4 < n5; ++n4) {
            lg lg2 = (lg)((kv)object).c.get(n4);
            if (lg2 == null || lg2.mPosition < n2) continue;
            lg2.offsetPosition(n3, false);
        }
        recyclerView.requestLayout();
        ((RecyclerView)this.a).P = true;
    }

    public final void o(int n2, int n3) {
        int n4;
        int n5;
        lg lg2;
        int n6;
        RecyclerView recyclerView = (RecyclerView)this.a;
        int n7 = recyclerView.h.c();
        int n8 = 0;
        while (true) {
            n6 = -1;
            if (n8 >= n7) break;
            lg2 = RecyclerView.j(recyclerView.h.f(n8));
            if (lg2 != null && (n5 = lg2.mPosition) >= (n4 = n2 < n3 ? n2 : n3) && n5 <= (n4 = n2 < n3 ? n3 : n2)) {
                if (n5 == n2) {
                    lg2.offsetPosition(n3 - n2, false);
                } else {
                    n4 = n2 < n3 ? n6 : 1;
                    lg2.offsetPosition(n4, false);
                }
                recyclerView.O.f = true;
            }
            ++n8;
        }
        kv kv2 = recyclerView.e;
        n8 = n2 < n3 ? n3 : n2;
        n4 = n2 < n3 ? n2 : n3;
        n5 = kv2.c.size();
        for (n6 = 0; n6 < n5; ++n6) {
            lg2 = (lg)kv2.c.get(n6);
            if (lg2 == null || (n7 = lg2.mPosition) < n4 || n7 > n8) continue;
            if (n7 == n2) {
                lg2.offsetPosition(n3 - n2, false);
                continue;
            }
            n7 = n2 < n3 ? -1 : 1;
            lg2.offsetPosition(n7, false);
        }
        recyclerView.requestLayout();
        ((RecyclerView)this.a).P = true;
    }

    public final void p(int n2, int n3) {
        ((RecyclerView)this.a).P(n2, n3, true);
        Object object = (RecyclerView)this.a;
        ((RecyclerView)object).P = true;
        object = ((RecyclerView)object).O;
        ((ld)object).c += n3;
    }

    public final int q() {
        return ((RecyclerView)this.a).getChildCount();
    }

    public final int r(View view) {
        return ((RecyclerView)this.a).indexOfChild(view);
    }

    public final View s(int n2) {
        return ((RecyclerView)this.a).getChildAt(n2);
    }

    public final void setAmbientOffloadEnabled(boolean bl2) {
        AmbientDelegate ambientDelegate = ((AmbientMode)((Object)this.a)).a;
        if (ambientDelegate != null) {
            ambientDelegate.setAmbientOffloadEnabled(bl2);
        }
    }

    public final void t(View object) {
        if ((object = RecyclerView.j((View)object)) != null) {
            ((lg)object).onLeftHiddenState((RecyclerView)this.a);
        }
    }

    public final void u(int n2) {
        View view = ((RecyclerView)this.a).getChildAt(n2);
        if (view != null) {
            ((RecyclerView)this.a).B(view);
            view.clearAnimation();
        }
        ((RecyclerView)this.a).removeViewAt(n2);
    }

    public final void v(lg lg2) {
        RecyclerView recyclerView = (RecyclerView)this.a;
        recyclerView.n.aP(lg2.itemView, recyclerView.e);
    }

    public final void w(lg lg2, bvl bvl2, bvl bvl3) {
        int n2;
        int n3;
        lg2.setIsRecyclable(false);
        RecyclerView recyclerView = (RecyclerView)this.a;
        kk kk2 = recyclerView.F;
        if (bvl2 != null && ((n3 = bvl2.b) != (n2 = bvl3.b) || bvl2.a != bvl3.a)) {
            if (!kk2.g(lg2, n3, bvl2.a, n2, bvl3.a)) {
                return;
            }
        } else {
            kk2.f(lg2);
            lg2.itemView.setAlpha(0.0f);
            kk2.c.add(lg2);
        }
        recyclerView.T();
    }

    public final void x(lg lg2, bvl bvl2, bvl bvl3) {
        ((RecyclerView)this.a).e.m(lg2);
        RecyclerView recyclerView = (RecyclerView)this.a;
        recyclerView.s(lg2);
        lg2.setIsRecyclable(false);
        kk kk2 = recyclerView.F;
        int n2 = bvl2.b;
        int n3 = bvl2.a;
        bvl2 = lg2.itemView;
        int n4 = bvl3 == null ? bvl2.getLeft() : bvl3.b;
        int n5 = bvl3 == null ? bvl2.getTop() : bvl3.a;
        if (!(lg2.isRemoved() || n2 == n4 && n3 == n5)) {
            bvl2.layout(n4, n5, bvl2.getWidth() + n4, bvl2.getHeight() + n5);
            if (!kk2.g(lg2, n2, n3, n4, n5)) {
                return;
            }
        } else {
            kk2.f(lg2);
            kk2.b.add(lg2);
        }
        recyclerView.T();
    }

    public final void y(int n2) {
        ((NetworkChangeNotifier)this.a).h(n2);
    }

    public final void z(long l2, int n2) {
        ((NetworkChangeNotifier)this.a).c(l2, n2);
    }
}

