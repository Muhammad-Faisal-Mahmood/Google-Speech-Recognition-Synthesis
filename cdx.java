/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.util.Log
 *  android.util.SparseIntArray
 */
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class cdx
implements cct,
ccu {
    public final Queue a;
    public final ccp b;
    public final cdj c;
    public final Map d;
    public final int e;
    public boolean f;
    public final List g;
    public int h;
    public final cea i;
    public final cxu j;
    private final Set k;
    private final cep l;
    private cbk m;

    public cdx(cea cea2, ccs ccs2) {
        this.i = cea2;
        this.a = new LinkedList();
        this.k = new HashSet();
        this.d = new HashMap();
        this.g = new ArrayList();
        this.m = null;
        this.h = 0;
        Object object = cea2.m.getLooper();
        cfe cfe2 = ccs2.c().a();
        Object object2 = ccs2.k.a;
        Context context = ccs2.b;
        Object object3 = ccs2.d;
        object = ((ki)object2).k(context, (Looper)object, cfe2, object3, this, this);
        object3 = ccs2.j;
        if (object3 != null) {
            ((cfc)object).p = object3;
        } else {
            object3 = ccs2.c;
            if (object3 != null) {
                ((cfc)object).j = object3;
            }
        }
        this.b = object;
        this.c = ccs2.e;
        this.j = new cxu();
        this.e = ccs2.g;
        if (object.l()) {
            this.l = new cep(cea2.f, cea2.m, ccs2.c().a());
            return;
        }
        this.l = null;
    }

    private final cbm q(cbm[] cbmArray) {
        if (cbmArray != null) {
            cbm cbm2;
            Object object = this.b.m();
            int n2 = 0;
            Object object2 = object;
            if (object == null) {
                object2 = new cbm[]{};
            }
            object = new ot(((cbm[])object2).length);
            int n3 = 0;
            while (true) {
                if (n3 >= ((cbm[])object2).length) break;
                cbm2 = object2[n3];
                object.put(cbm2.a, cbm2.a());
                ++n3;
            }
            for (int i2 = n2; i2 <= 0; ++i2) {
                cbm2 = cbmArray[i2];
                object2 = (Long)object.get(cbm2.a);
                if (object2 != null && (Long)object2 >= cbm2.a()) {
                    continue;
                }
                return cbm2;
            }
        }
        return null;
    }

    private final Status r(cbk cbk2) {
        return cea.a(this.c, cbk2);
    }

    private final void s(cbk cbk2) {
        Iterator iterator = this.k.iterator();
        if (iterator.hasNext()) {
            iterator = (ki)iterator.next();
            if (a.k(cbk2, cbk.a)) {
                this.b.n();
            }
            throw null;
        }
        this.k.clear();
    }

    private final void t(Status status, Exception exception, boolean bl2) {
        kl.ap(this.i.m);
        boolean bl3 = false;
        boolean bl4 = status == null;
        if (exception == null) {
            bl3 = true;
        }
        if (bl4 != bl3) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                cdi cdi2 = (cdi)iterator.next();
                if (bl2 && cdi2.c != 2) continue;
                if (status != null) {
                    cdi2.d(status);
                } else {
                    cdi2.e(exception);
                }
                iterator.remove();
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void u(cdi cdi2) {
        cdi2.g(this.j, this.p());
        try {
            cdi2.f(this);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.a(1);
            this.b.i("DeadObjectException thrown while running ApiCallRunner.");
            return;
        }
    }

    private final boolean v(cdi object) {
        if (!(object instanceof cdc)) {
            this.u((cdi)object);
            return true;
        }
        cdc cdc2 = (cdc)object;
        cbm cbm2 = this.q(cdc2.b(this));
        if (cbm2 == null) {
            this.u((cdi)object);
            return true;
        }
        object = this.b.getClass().getName();
        long l2 = cbm2.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" could not execute call because it requires feature (");
        stringBuilder.append(cbm2.a);
        stringBuilder.append(", ");
        stringBuilder.append(l2);
        stringBuilder.append(").");
        Log.w((String)"GoogleApiManager", (String)stringBuilder.toString());
        if (this.i.n && cdc2.a(this)) {
            object = new cdy(this.c, cbm2);
            int n2 = this.g.indexOf(object);
            if (n2 >= 0) {
                object = (cdy)this.g.get(n2);
                this.i.m.removeMessages(15, object);
                cbm2 = this.i.m;
                cbm2.sendMessageDelayed(Message.obtain((Handler)cbm2, (int)15, (Object)object), 5000L);
            } else {
                this.g.add(object);
                cbm2 = this.i.m;
                cbm2.sendMessageDelayed(Message.obtain((Handler)cbm2, (int)15, (Object)object), 5000L);
                cbm2 = this.i.m;
                cbm2.sendMessageDelayed(Message.obtain((Handler)cbm2, (int)16, (Object)object), 120000L);
                object = new cbk(2, null);
                if (!this.w((cbk)object)) {
                    this.i.h((cbk)object, this.e);
                }
            }
            return false;
        }
        cdc2.e(new cdb(cbm2));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean w(cbk object) {
        Object object2 = cea.c;
        synchronized (object2) {
            Object object3 = this.i;
            if (((cea)object3).k != null && ((cea)object3).l.contains(this.c)) {
                cdt cdt2 = this.i.k;
                int n2 = this.e;
                object3 = new hti((cbk)object, n2);
                if (a.i(cdt2.b, object3)) {
                    Handler handler = cdt2.c;
                    object = new cdn(cdt2, object3, 0);
                    handler.post((Runnable)object);
                }
                return true;
            }
            return false;
        }
    }

    @Override
    public final void a(int n2) {
        if (Looper.myLooper() == this.i.m.getLooper()) {
            this.k(n2);
            return;
        }
        cea cea2 = this.i;
        cdw cdw2 = new cdw(this, n2, 0);
        cea2.m.post((Runnable)cdw2);
    }

    @Override
    public final void b() {
        if (Looper.myLooper() == this.i.m.getLooper()) {
            this.h();
            return;
        }
        cea cea2 = this.i;
        bpv bpv2 = new bpv(this, 18, null);
        cea2.m.post((Runnable)bpv2);
    }

    public final void c() {
        kl.ap(this.i.m);
        this.m = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        int n2;
        Object object;
        Object object2;
        Object object3;
        block16: {
            int n3;
            block18: {
                int n4;
                block17: {
                    kl.ap(this.i.m);
                    if (this.b.j()) return;
                    if (this.b.k()) {
                        return;
                    }
                    try {
                        object3 = this.i;
                        object2 = ((cea)object3).o;
                        object = ((cea)object3).f;
                        object3 = this.b;
                        kl.at(object);
                        kl.at(object3);
                        object3.o();
                        n3 = object3.a();
                        n2 = n4 = ((awf)object2).s(n3);
                        if (n4 != -1) break block16;
                        object3 = ((awf)object2).a;
                        // MONITORENTER : object3
                        n4 = 0;
                        break block17;
                    }
                    catch (IllegalStateException illegalStateException) {
                        this.j(new cbk(10), illegalStateException);
                    }
                    return;
                }
                for (n2 = 0; n2 < ((SparseIntArray)((awf)object2).a).size(); ++n2) {
                    int n5 = ((SparseIntArray)((awf)object2).a).keyAt(n2);
                    if (n5 <= n3 || ((SparseIntArray)((awf)object2).a).get(n5) != 0) continue;
                    n2 = n4;
                    break block18;
                }
                n2 = -1;
            }
            if (n2 == -1) {
                n2 = ((cbp)((awf)object2).b).f((Context)object, n3);
            }
            ((SparseIntArray)((awf)object2).a).put(n3, n2);
            // MONITOREXIT : object3
        }
        if (n2 != 0) {
            object = new cbk(n2, null);
            String string = this.b.getClass().getName();
            object2 = object.toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("The service for ");
            ((StringBuilder)object3).append(string);
            ((StringBuilder)object3).append(" is not available: ");
            ((StringBuilder)object3).append((String)object2);
            Log.w((String)"GoogleApiManager", (String)((StringBuilder)object3).toString());
            this.i((cbk)object);
            return;
        }
        object2 = this.i;
        object3 = this.b;
        object2 = new cdz((cea)object2, (ccp)object3, this.c);
        if (object3.l()) {
            object3 = this.l;
            kl.at(object3);
            object = ((cep)object3).e;
            if (object != null) {
                ((cfc)object).u();
            }
            ((cep)object3).d.g = System.identityHashCode(object3);
            ki ki2 = ((cep)object3).g;
            object = ((cep)object3).a;
            Handler handler = ((cep)object3).b;
            cfe cfe2 = ((cep)object3).d;
            ((cep)object3).e = (ckm)ki2.k((Context)object, handler.getLooper(), cfe2, cfe2.f, (cct)object3, (ccu)object3);
            ((cep)object3).f = object2;
            object = ((cep)object3).c;
            if (object != null && !object.isEmpty()) {
                object3 = ((cep)object3).e;
                ((cfc)object3).h(new cez((cfc)object3));
            } else {
                ((cep)object3).b.post((Runnable)new bpv(object3, 20, null));
            }
        }
        try {
            this.b.h((cex)object2);
            return;
        }
        catch (SecurityException securityException) {
            this.j(new cbk(10), securityException);
            return;
        }
    }

    public final void e(cdi object) {
        kl.ap(this.i.m);
        if (this.b.j()) {
            if (this.v((cdi)object)) {
                this.m();
                return;
            }
            this.a.add(object);
            return;
        }
        this.a.add(object);
        object = this.m;
        if (object != null && ((cbk)object).a()) {
            this.i((cbk)object);
            return;
        }
        this.d();
    }

    public final void f(Status status) {
        kl.ap(this.i.m);
        this.t(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            cdi cdi2 = (cdi)arrayList.get(i2);
            if (!this.b.j()) break;
            if (!this.v(cdi2)) continue;
            this.a.remove(cdi2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        this.c();
        this.s(cbk.a);
        this.o();
        Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            Object object = (bmu)iterator.next();
            if (this.q(((cem)((bmu)object).c).b) != null) {
                iterator.remove();
                continue;
            }
            try {
                Object object2 = ((bmu)object).c;
                ccp ccp2 = this.b;
                object = new bzo(null);
                ((cem)object2).b(ccp2, (bzo)object);
                continue;
            }
            catch (RemoteException remoteException) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            catch (DeadObjectException deadObjectException) {
                this.a(3);
                this.b.i("DeadObjectException thrown while calling register listener method.");
                break;
            }
            Log.e((String)"GoogleApiManager", (String)"Failed to register listener on re-connection.", (Throwable)object);
            iterator.remove();
        }
        this.g();
        this.m();
    }

    @Override
    public final void i(cbk cbk2) {
        this.j(cbk2, null);
    }

    public final void j(cbk object, Exception object2) {
        int n2;
        kl.ap(this.i.m);
        Object object3 = this.l;
        if (object3 != null && (object3 = ((cep)object3).e) != null) {
            ((cfc)object3).u();
        }
        this.c();
        this.i.o.r();
        this.s((cbk)object);
        if (this.b instanceof cgq && ((cbk)object).c != 24) {
            object3 = this.i;
            ((cea)object3).e = true;
            object3 = ((cea)object3).m;
            object3.sendMessageDelayed(object3.obtainMessage(19), 300000L);
        }
        if ((n2 = ((cbk)object).c) != 4) {
            if (n2 == 25) {
                this.f(this.r((cbk)object));
                return;
            }
            if (this.a.isEmpty()) {
                this.m = object;
                return;
            }
            if (object2 != null) {
                kl.ap(this.i.m);
                this.t(null, (Exception)object2, false);
                return;
            }
            if (!this.i.n) {
                this.f(this.r((cbk)object));
                return;
            }
            this.t(this.r((cbk)object), null, true);
            if (!(this.a.isEmpty() || this.w((cbk)object) || this.i.h((cbk)object, this.e))) {
                if (((cbk)object).c == 18) {
                    this.f = true;
                }
                if (this.f) {
                    object2 = this.i;
                    object = this.c;
                    object2 = ((cea)object2).m;
                    object2.sendMessageDelayed(Message.obtain((Handler)object2, (int)9, (Object)object), 5000L);
                    return;
                }
                this.f(this.r((cbk)object));
            }
            return;
        }
        this.f(cea.b);
    }

    public final void k(int n2) {
        this.c();
        this.f = true;
        Iterator iterator = this.b.f();
        Object object = new StringBuilder("The connection to Google Play services was lost");
        if (n2 == 1) {
            ((StringBuilder)object).append(" due to service disconnection.");
        } else if (n2 == 3) {
            ((StringBuilder)object).append(" due to dead object exception.");
        }
        if (iterator != null) {
            ((StringBuilder)object).append(" Last reason for disconnect: ");
            ((StringBuilder)object).append((String)((Object)iterator));
        }
        this.j.a(true, new Status(20, ((StringBuilder)object).toString()));
        iterator = this.i;
        object = this.c;
        iterator = ((cea)((Object)iterator)).m;
        iterator.sendMessageDelayed(Message.obtain((Handler)iterator, (int)9, (Object)object), 5000L);
        iterator = this.i;
        object = this.c;
        iterator = ((cea)((Object)iterator)).m;
        iterator.sendMessageDelayed(Message.obtain((Handler)iterator, (int)11, (Object)object), 120000L);
        this.i.o.r();
        iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            object = ((bmu)iterator.next()).a;
        }
    }

    public final void l(cbk cbk2) {
        kl.ap(this.i.m);
        ccp ccp2 = this.b;
        String string = ccp2.getClass().getName();
        String string2 = String.valueOf(cbk2);
        StringBuilder stringBuilder = new StringBuilder("onSignInFailed for ");
        stringBuilder.append(string);
        stringBuilder.append(" with ");
        stringBuilder.append(string2);
        ccp2.i(stringBuilder.toString());
        this.i(cbk2);
    }

    public final void m() {
        this.i.m.removeMessages(12, (Object)this.c);
        cea cea2 = this.i;
        Handler handler = cea2.m;
        handler.sendMessageDelayed(handler.obtainMessage(12, (Object)this.c), cea2.d);
    }

    public final void n() {
        kl.ap(this.i.m);
        this.f(cea.a);
        cxu cxu2 = this.j;
        ceg[] cegArray = cea.a;
        cxu2.a(false, (Status)cegArray);
        cegArray = this.d.keySet().toArray(new ceg[0]);
        int n2 = cegArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.e(new cdh(cegArray[i2], new bzo(null)));
        }
        this.s(new cbk(4));
        if (this.b.j()) {
            this.b.q(new AmbientMode$AmbientController(this));
        }
    }

    public final void o() {
        if (this.f) {
            cea cea2 = this.i;
            cdj cdj2 = this.c;
            cea2.m.removeMessages(11, (Object)cdj2);
            cea2 = this.i;
            cdj2 = this.c;
            cea2.m.removeMessages(9, (Object)cdj2);
            this.f = false;
        }
    }

    public final boolean p() {
        return this.b.l();
    }
}

