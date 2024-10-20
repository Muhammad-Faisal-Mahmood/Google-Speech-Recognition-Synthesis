/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.accounts.Account;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class cfc {
    private static final cbm[] s = new cbm[0];
    cfr a;
    public final Context b;
    final Handler c;
    public final Object d = new Object();
    public final Object e = new Object();
    protected cex f;
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public final int i;
    public volatile String j;
    public cbk k = null;
    public boolean l = false;
    public volatile cfg m = null;
    protected final AtomicInteger n = new AtomicInteger(0);
    public cfx o;
    public volatile bzo p;
    public final AmbientMode$AmbientController q;
    public final AmbientModeSupport$AmbientController r;
    private volatile String t = null;
    private final cfo u;
    private IInterface v;
    private cey w;
    private final String x;

    protected cfc(Context context, Looper looper, cfo cfo2, cbp cbp2, int n2, AmbientMode$AmbientController ambientMode$AmbientController, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, String string) {
        a.s(context, "Context must not be null");
        this.b = context;
        a.s(looper, "Looper must not be null");
        a.s(cfo2, "Supervisor must not be null");
        this.u = cfo2;
        a.s(cbp2, "API availability must not be null");
        this.c = new cev(this, looper);
        this.i = n2;
        this.q = ambientMode$AmbientController;
        this.r = ambientModeSupport$AmbientController;
        this.x = string;
    }

    static /* bridge */ /* synthetic */ void C(cfc cfc2, int n2) {
        cfc2.G(n2, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void G(int var1_1, IInterface var2_2) {
        var3_3 = var1_1 != 4 ? 0 : 1;
        var4_4 = var2_2 == null ? 0 : 1;
        var5_5 = var3_3 == var4_4;
        kl.an(var5_5);
        var8_6 = this.d;
        synchronized (var8_6) {
            block20: {
                block18: {
                    block19: {
                        this.h = var1_1;
                        this.v = var2_2;
                        var7_7 = null;
                        if (var1_1 == 1) break block18;
                        if (var1_1 == 2 || var1_1 == 3) break block19;
                        if (var1_1 == 4) {
                            kl.at(var2_2);
                            System.currentTimeMillis();
                        }
                        break block20;
                    }
                    var2_2 = this.w;
                    if (var2_2 != null && (var9_8 = this.a) != null) {
                        var6_10 = var9_8.a;
                        var10_12 = var9_8.b;
                        var9_8 = new StringBuilder("Calling connect() while still connected, missing disconnect() for ");
                        var9_8.append((String)var6_10);
                        var9_8.append(" on ");
                        var9_8.append((String)var10_12);
                        Log.e((String)"GmsClient", (String)var9_8.toString());
                        var11_14 = this.u;
                        var6_10 = this.a;
                        var10_12 = var6_10.a;
                        var9_8 = var6_10.b;
                        var1_1 = var6_10.c;
                        this.E();
                        var11_14.a((String)var10_12, (ServiceConnection)var2_2, this.a.d);
                        this.n.incrementAndGet();
                    }
                    var2_2 = new cey(this, this.n.get());
                    this.w = var2_2;
                    this.a = var9_8 = new cfr(this.d(), this.y());
                    if (var9_8.d && this.a() < 17895000) {
                        var2_2 = new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(var9_8.a));
                        throw var2_2;
                    }
                    var10_12 = this.u;
                    var6_10 = var9_8.a;
                    var11_14 = var9_8.b;
                    var1_1 = var9_8.c;
                    this.E();
                    var5_5 = this.a.d;
                    this.D();
                    var11_14 = new cfn((String)var6_10, var5_5);
                    var9_8 = var10_12.c;
                    synchronized (var9_8) {
                        block22: {
                            block24: {
                                block23: {
                                    block21: {
                                        var6_10 = (cfp)var10_12.c.get(var11_14);
                                        var12_15 = var10_12.g;
                                        if (var6_10 != null) break block21;
                                        var6_10 = new cfp((cfo)var10_12, (cfn)var11_14);
                                        var6_10.d((ServiceConnection)var2_2, (ServiceConnection)var2_2);
                                        var2_2 = cfp.c((cfp)var6_10);
                                        var10_12.c.put(var11_14, var6_10);
                                        break block22;
                                    }
                                    var10_12.e.removeMessages(0, var11_14);
                                    if (var6_10.a((ServiceConnection)var2_2)) {
                                        var2_2 = new IllegalStateException(a.ai(var11_14.b, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                                        throw var2_2;
                                    }
                                    var6_10.d((ServiceConnection)var2_2, (ServiceConnection)var2_2);
                                    var1_1 = var6_10.b;
                                    if (var1_1 == 1) break block23;
                                    if (var1_1 != 2) break block24;
                                    var2_2 = cfp.c((cfp)var6_10);
                                    break block22;
                                }
                                var2_2.onServiceConnected(var6_10.f, var6_10.d);
                            }
                            var2_2 = null;
                        }
                        if (var6_10.c) {
                            var2_2 = cbk.a;
                        } else if (var2_2 == null) {
                            var2_2 = new cbk(-1);
                        }
                        ** if (var2_2.b()) goto lbl107
                    }
lbl-1000:
                    // 1 sources

                    {
                        var9_8 = this.a;
                        var6_10 = var9_8.a;
                        var10_12 = var9_8.b;
                        var9_8 = new StringBuilder("unable to connect to service: ");
                        var9_8.append((String)var6_10);
                        var9_8.append(" on ");
                        var9_8.append((String)var10_12);
                        Log.w((String)"GmsClient", (String)var9_8.toString());
                        var1_1 = var3_3 = var2_2.c;
                        if (var3_3 == -1) {
                            var1_1 = 16;
                        }
                        var6_10 = var7_7;
                        if (var2_2.d != null) {
                            var6_10 = new Bundle();
                            var6_10.putParcelable("pendingIntent", (Parcelable)var2_2.d);
                        }
                        this.w(var1_1, (Bundle)var6_10, this.n.get());
                    }
lbl107:
                    // 2 sources

                    break block20;
                }
                var7_7 = this.w;
                if (var7_7 != null) {
                    var2_2 = this.u;
                    var10_13 = this.a;
                    var9_9 = var10_13.a;
                    var6_11 = var10_13.b;
                    var1_1 = var10_13.c;
                    this.E();
                    var2_2.a(var9_9, var7_7, this.a.d);
                    this.w = null;
                }
            }
            return;
        }
    }

    public boolean A() {
        return false;
    }

    public cbm[] B() {
        throw null;
    }

    protected void D() {
        throw null;
    }

    protected final void E() {
        if (this.x == null) {
            this.b.getClass().getName();
        }
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder var1);

    protected abstract String c();

    protected abstract String d();

    public cbm[] e() {
        return s;
    }

    public final String f() {
        return this.t;
    }

    public final void h(cex cex2) {
        this.f = cex2;
        this.G(2, null);
    }

    public final void i(String string) {
        this.t = string;
        this.u();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j() {
        Object object = this.d;
        synchronized (object) {
            if (this.h != 4) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean k() {
        Object object = this.d;
        synchronized (object) {
            boolean bl2;
            int n2 = this.h;
            boolean bl3 = bl2 = true;
            if (n2 == 2) return bl3;
            if (n2 != 3) return false;
            return bl2;
        }
    }

    public boolean l() {
        return false;
    }

    public final cbm[] m() {
        cfg cfg2 = this.m;
        if (cfg2 == null) {
            return null;
        }
        return cfg2.b;
    }

    public final void n() {
        if (this.j() && this.a != null) {
            return;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void o() {
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void p(cfs object, Set object2) {
        void var1_4;
        block17: {
            Object object3;
            Object object4 = this.s();
            object3 = Build.VERSION.SDK_INT < 31 ? this.j : (this.p == null || (object3 = this.p.a) == null ? this.j : (ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(object3)) == null ? this.j : ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m(object3))));
            int n2 = this.i;
            int n3 = cbp.c;
            Object object5 = cfl.a;
            Object object6 = new Bundle();
            cbm[] cbmArray = cfl.b;
            object6 = new cfl(6, n2, n3, null, null, (Scope[])object5, (Bundle)object6, null, cbmArray, cbmArray, true, 0, false, (String)object3);
            object6.f = this.b.getPackageName();
            object6.i = object4;
            if (object2 != null) {
                object6.h = object2.toArray(new Scope[0]);
            }
            if (this.l()) {
                object2 = object3 = this.r();
                if (object3 == null) {
                    object2 = new Account("<<default account>>", "com.google");
                }
                object6.j = object2;
                if (object != null) {
                    object6.g = ((bov)object).a;
                }
            }
            object6.k = this.B();
            object6.l = this.e();
            if (this.A()) {
                object6.o = true;
            }
            object = this.e;
            // MONITORENTER : object
            object4 = this.o;
            if (object4 == null) break block17;
            object5 = new cfw(this, this.n.get());
            object3 = Parcel.obtain();
            object2 = Parcel.obtain();
            try {
                object3.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                object3.writeStrongBinder((IBinder)object5);
                object3.writeInt(1);
                caw.a((cfl)object6, (Parcel)object3, 0);
                object4.a.transact(46, (Parcel)object3, (Parcel)object2, 0);
                object2.readException();
                return;
            }
            finally {
                object2.recycle();
                object3.recycle();
            }
        }
        Log.w((String)"GmsClient", (String)"mServiceBroker is null, client disconnected");
        // MONITOREXIT : object
        return;
        catch (RuntimeException runtimeException) {
        }
        catch (RemoteException remoteException) {
            // empty catch block
        }
        Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)var1_4);
        this.v(8, null, null, this.n.get());
        return;
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (DeadObjectException deadObjectException) {
            Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)deadObjectException);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
            return;
        }
    }

    public final void q(AmbientMode$AmbientController ambientMode$AmbientController) {
        bpv bpv2 = new bpv(ambientMode$AmbientController, 19, null);
        ((cdx)ambientMode$AmbientController.a).i.m.post((Runnable)bpv2);
    }

    public Account r() {
        throw null;
    }

    protected Bundle s() {
        return new Bundle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IInterface t() {
        Object object = this.d;
        synchronized (object) {
            if (this.h == 5) {
                DeadObjectException deadObjectException = new DeadObjectException();
                throw deadObjectException;
            }
            if (this.j()) {
                IInterface iInterface = this.v;
                a.s(iInterface, "Client is connected but service is null");
                return iInterface;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            throw illegalStateException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u() {
        this.n.incrementAndGet();
        Object object = this.g;
        synchronized (object) {
            int n2 = this.g.size();
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    this.g.clear();
                    // MONITOREXIT @DISABLED, blocks:[5, 7, 8] lbl10 : MonitorExitStatement: MONITOREXIT : var3_1
                    object = this.e;
                    synchronized (object) {
                        this.o = null;
                    }
                    this.G(1, null);
                    return;
                }
                ((cew)this.g.get(n3)).e();
                ++n3;
            }
        }
    }

    protected final void v(int n2, IBinder object, Bundle bundle, int n3) {
        object = new cfa(this, n2, (IBinder)object, bundle);
        object = this.c.obtainMessage(1, n3, -1, object);
        this.c.sendMessage((Message)object);
    }

    protected final void w(int n2, Bundle object, int n3) {
        object = new cfb(this, n2, (Bundle)object);
        object = this.c.obtainMessage(7, n3, -1, object);
        this.c.sendMessage((Message)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean x(int n2, int n3, IInterface iInterface) {
        Object object = this.d;
        synchronized (object) {
            if (this.h != n2) {
                return false;
            }
            this.G(n3, iInterface);
            return true;
        }
    }

    protected boolean y() {
        return this.a() >= 211700000;
    }

    public final boolean z() {
        return this.m != null;
    }
}

