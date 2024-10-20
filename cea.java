/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.PendingIntent
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Log
 */
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class cea
implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static cea p;
    public long d = 10000L;
    public boolean e = false;
    public final Context f;
    public final cbo g;
    public final AtomicInteger h = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(0);
    public final Map j = new ConcurrentHashMap(5, 0.75f, 1);
    public cdt k = null;
    public final Set l = new ov();
    public final Handler m;
    public volatile boolean n = true;
    public final awf o;
    private cgh q;
    private final Set r = new ov();
    private cgp s;

    private cea(Context context, Looper object, cbo cbo2) {
        this.f = context;
        object = new gbs((Looper)object, this);
        this.m = object;
        this.g = cbo2;
        this.o = new awf(cbo2);
        context = context.getPackageManager();
        if (cgt.b == null) {
            cgt.b = context.hasSystemFeature("android.hardware.type.automotive");
        }
        if (cgt.b.booleanValue()) {
            this.n = false;
        }
        object.sendMessage(object.obtainMessage(6));
    }

    public static Status a(cdj object, cbk cbk2) {
        object = ((cdj)object).a.b;
        String string = String.valueOf(cbk2);
        StringBuilder stringBuilder = new StringBuilder("API: ");
        stringBuilder.append((String)object);
        stringBuilder.append(" is not available on this device. Connection failed with: ");
        stringBuilder.append(string);
        return new Status(17, stringBuilder.toString(), cbk2.d, cbk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static cea c(Context object) {
        Object object2 = c;
        synchronized (object2) {
            Object object3;
            if (p != null) return p;
            Object object4 = cfo.a;
            synchronized (object4) {
                object3 = cfo.b;
                if (object3 != null) {
                } else {
                    cfo.b = object3 = new HandlerThread("GoogleApiHandler", 9);
                    cfo.b.start();
                    object3 = cfo.b;
                }
            }
            object4 = object3.getLooper();
            object3 = new cea(object.getApplicationContext(), (Looper)object4, cbo.a);
            p = object3;
            return p;
        }
    }

    private final cdx j(ccs ccs2) {
        Object object = this.j;
        cdj cdj2 = ccs2.e;
        cdx cdx2 = (cdx)object.get(cdj2);
        object = cdx2;
        if (cdx2 == null) {
            object = new cdx(this, ccs2);
            this.j.put(cdj2, object);
        }
        if (((cdx)object).p()) {
            this.r.add(cdj2);
        }
        ((cdx)object).d();
        return object;
    }

    private final void k() {
        cgh cgh2 = this.q;
        if (cgh2 != null) {
            if (cgh2.a > 0 || this.g()) {
                this.l().a(cgh2);
            }
            this.q = null;
        }
    }

    private final cgp l() {
        if (this.s == null) {
            this.s = new cgp(this.f, cgj.b);
        }
        return this.s;
    }

    final cdx b(cdj cdj2) {
        return (cdx)this.j.get(cdj2);
    }

    public final void d(cbk cbk2, int n2) {
        if (!this.h(cbk2, n2)) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(5, n2, 0, (Object)cbk2));
        }
    }

    public final void e() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(cdt cdt2) {
        Object object = c;
        synchronized (object) {
            if (this.k != cdt2) {
                this.k = cdt2;
                this.l.clear();
            }
            this.l.addAll(cdt2.e);
            return;
        }
    }

    final boolean g() {
        if (this.e) {
            return false;
        }
        cgg cgg2 = cgf.a().a;
        if (cgg2 != null && !cgg2.b) {
            return false;
        }
        int n2 = this.o.s(203400000);
        return n2 == -1 || n2 == 0;
        {
        }
    }

    final boolean h(cbk cbk2, int n2) {
        Context context = this.f;
        boolean bl2 = cgw.h(context);
        boolean bl3 = false;
        if (!bl2) {
            cbo cbo2 = this.g;
            PendingIntent pendingIntent = cbk2.a() ? cbk2.d : cbo2.h(context, cbk2.c, null);
            if (pendingIntent != null) {
                cbo2.d(context, cbk2.c, PendingIntent.getActivity((Context)context, (int)0, (Intent)GoogleApiActivity.a(context, pendingIntent, n2, true), (int)(cig.a | 0x8000000)));
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message var1_1) {
        var2_2 = var1_1.what;
        var5_3 = 300000L;
        var7_4 = null;
        var3_5 = 0;
        block6 : switch (var2_2) {
            default: {
                var2_2 = var1_1.what;
                var1_1 = new StringBuilder("Unknown message id: ");
                var1_1.append(var2_2);
                Log.w((String)"GoogleApiManager", (String)var1_1.toString());
                return false;
            }
            case 19: {
                this.e = false;
                return true;
            }
            case 18: {
                var1_1 = (cek)var1_1.obj;
                if (var1_1.c == 0L) {
                    var1_1 = new cgh(var1_1.b, Arrays.asList(new cga[]{var1_1.a}));
                    this.l().a((cgh)var1_1);
                    return true;
                }
                var7_4 = this.q;
                if (var7_4 != null) {
                    var8_6 = var7_4.b;
                    var2_2 = var1_1.b;
                    if (var7_4.a == var2_2 && (var8_6 == null || var8_6.size() < var1_1.d)) {
                        var8_6 = this.q;
                        var7_4 = var1_1.a;
                        if (var8_6.b == null) {
                            var8_6.b = new ArrayList<E>();
                        }
                        var8_6.b.add(var7_4);
                    } else {
                        this.m.removeMessages(17);
                        this.k();
                    }
                }
                if (this.q != null) return true;
                var7_4 = new ArrayList<E>();
                var7_4.add(var1_1.a);
                this.q = new cgh(var1_1.b, (List)var7_4);
                var7_4 = this.m;
                var7_4.sendMessageDelayed(var7_4.obtainMessage(17), var1_1.c);
                return true;
            }
            case 17: {
                this.k();
                return true;
            }
            case 16: {
                var7_4 = (cdy)var1_1.obj;
                if (this.j.containsKey(var7_4.a) == false) return true;
                var1_1 = (cdx)this.j.get(var7_4.a);
                if (var1_1.g.remove(var7_4) == false) return true;
                var1_1.i.m.removeMessages(15, var7_4);
                var1_1.i.m.removeMessages(16, var7_4);
                var7_4 = var7_4.b;
                var8_7 = new ArrayList<cdi>(var1_1.a.size());
                var9_12 = var1_1.a.iterator();
lbl59:
                // 4 sources

                while (true) {
                    if (var9_12.hasNext()) {
                        var10_14 = (cdi)var9_12.next();
                        if (!(var10_14 instanceof cdc) || (var11_15 = ((cdc)var10_14).b((cdx)var1_1)) == null) continue;
                        var2_2 = 0;
                        break block6;
                    }
                    var4_16 = var8_7.size();
                    var2_2 = var3_5;
                    while (var2_2 < var4_16) {
                        var9_12 = (cdi)var8_7.get(var2_2);
                        var1_1.a.remove(var9_12);
                        var9_12.e(new cdb((cbm)var7_4));
                        ++var2_2;
                    }
                    return true;
                }
            }
            case 15: {
                var1_1 = (cdy)var1_1.obj;
                if (this.j.containsKey(var1_1.a) == false) return true;
                var7_4 = (cdx)this.j.get(var1_1.a);
                if (var7_4.g.contains(var1_1) == false) return true;
                if (var7_4.f != false) return true;
                if (!var7_4.b.j()) {
                    var7_4.d();
                    return true;
                }
                var7_4.g();
                return true;
            }
            case 14: {
                var1_1 = (ki)var1_1.obj;
                throw null;
            }
            case 12: {
                if (this.j.containsKey(var1_1.obj) == false) return true;
                var7_4 = (cdx)this.j.get(var1_1.obj);
                kl.ap(var7_4.i.m);
                if (var7_4.b.j() == false) return true;
                if (var7_4.d.isEmpty() == false) return true;
                var1_1 = var7_4.j;
                if (var1_1.a.isEmpty() && var1_1.b.isEmpty()) {
                    var7_4.b.i("Timing out service connection.");
                    return true;
                }
                var7_4.m();
                return true;
            }
            case 11: {
                if (this.j.containsKey(var1_1.obj) == false) return true;
                var7_4 = (cdx)this.j.get(var1_1.obj);
                kl.ap(var7_4.i.m);
                if (var7_4.f == false) return true;
                var7_4.o();
                var1_1 = var7_4.i;
                var1_1 = var1_1.g.e(var1_1.f) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.");
                var7_4.f((Status)var1_1);
                var7_4.b.i("Timing out connection while resuming.");
                return true;
            }
            case 10: {
                var1_1 = new ou((ov)this.r);
                while (true) {
                    if (!var1_1.hasNext()) {
                        this.r.clear();
                        return true;
                    }
                    var7_4 = (cdj)var1_1.next();
                    if ((var7_4 = (cdx)this.j.remove(var7_4)) == null) continue;
                    var7_4.n();
                }
            }
            case 9: {
                if (this.j.containsKey(var1_1.obj) == false) return true;
                var1_1 = (cdx)this.j.get(var1_1.obj);
                kl.ap(var1_1.i.m);
                if (var1_1.f == false) return true;
                var1_1.d();
                return true;
            }
            case 7: {
                this.j((ccs)var1_1.obj);
                return true;
            }
            case 6: {
                if (this.f.getApplicationContext() instanceof Application == false) return true;
                var7_4 = (Application)this.f.getApplicationContext();
                var1_1 = cdk.a;
                synchronized (var1_1) {
                    var8_8 = cdk.a;
                    if (!var8_8.e) {
                        var7_4.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var8_8);
                        var7_4.registerComponentCallbacks((ComponentCallbacks)cdk.a);
                        cdk.a.e = true;
                    }
                }
                var1_1 = cdk.a;
                var7_4 = new AmbientMode$AmbientController(this);
                synchronized (var1_1) {
                    var1_1.d.add(var7_4);
                }
                var7_4 = cdk.a;
                if (!var7_4.c.get()) {
                    var1_1 = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)var1_1);
                    if (!var7_4.c.getAndSet(true) && var1_1.importance > 100) {
                        var7_4.b.set(true);
                    }
                }
                if (var7_4.b.get() != false) return true;
                this.d = 300000L;
                return true;
            }
            case 5: {
                var2_2 = var1_1.arg1;
                var8_9 = (cbk)var1_1.obj;
                var9_13 = this.j.values().iterator();
                do {
                    var1_1 = var7_4;
                    if (!var9_13.hasNext()) break;
                    var1_1 = (cdx)var9_13.next();
                } while (var1_1.e != var2_2);
                if (var1_1 == null) {
                    Log.wtf((String)"GoogleApiManager", (String)a.ah(var2_2, "Could not find API instance ", " while trying to fail enqueued calls."), (Throwable)new Exception());
                    return true;
                }
                if (var8_9.c == 13) {
                    var7_4 = ccg.c;
                    var7_4 = var8_9.e;
                    var8_9 = new StringBuilder("Error resolution was canceled by the user, original error message: CANCELED: ");
                    var8_9.append((String)var7_4);
                    var1_1.f(new Status(17, var8_9.toString()));
                    return true;
                }
                var1_1.f(cea.a(var1_1.c, (cbk)var8_9));
                return true;
            }
            case 4: 
            case 8: 
            case 13: {
                var8_10 = (dvy)var1_1.obj;
                var1_1 = var7_4 = (cdx)this.j.get(((ccs)var8_10.b).e);
                if (var7_4 == null) {
                    var1_1 = this.j((ccs)var8_10.b);
                }
                if (var1_1.p() && this.i.get() != var8_10.a) {
                    var7_4 = var8_10.c;
                    var8_10 = cea.a;
                    ((cdi)var7_4).d((Status)var8_10);
                    var1_1.n();
                    return true;
                }
                var1_1.e((cdi)var8_10.c);
                return true;
            }
            case 3: {
                var1_1 = this.j.values().iterator();
                while (var1_1.hasNext() != false) {
                    var7_4 = (cdx)var1_1.next();
                    var7_4.c();
                    var7_4.d();
                }
                return true;
            }
            case 2: {
                var1_1 = (ki)var1_1.obj;
                throw null;
            }
            case 1: {
                if (((Boolean)var1_1.obj).booleanValue()) {
                    var5_3 = 10000L;
                }
                this.d = var5_3;
                this.m.removeMessages(12);
                var1_1 = this.j.keySet().iterator();
                while (var1_1.hasNext() != false) {
                    var7_4 = (cdj)var1_1.next();
                    var8_11 = this.m;
                    var8_11.sendMessageDelayed(var8_11.obtainMessage(12, var7_4), this.d);
                }
                return true;
            }
        }
        while (true) {
            block49: {
                if (var2_2 > 0) ** GOTO lbl59
                if (!a.k(var11_15[var2_2], var7_4)) break block49;
                if (var2_2 < 0) ** GOTO lbl59
                var8_7.add(var10_14);
                ** continue;
            }
            ++var2_2;
        }
    }

    public final void i(bzo object, int n2, ccs object2) {
        block4: {
            Object object3;
            block5: {
                boolean bl2;
                block6: {
                    if (n2 == 0) break block4;
                    object3 = ((ccs)object2).e;
                    bl2 = this.g();
                    object2 = null;
                    if (!bl2) break block5;
                    Object object4 = cgf.a().a;
                    bl2 = true;
                    if (object4 == null) break block6;
                    if (!((cgg)object4).b) break block5;
                    bl2 = ((cgg)object4).c;
                    object4 = this.b((cdj)object3);
                    if (object4 == null) break block6;
                    Object object5 = ((cdx)object4).b;
                    if (!(object5 instanceof cfc)) break block5;
                    if (!((cfc)(object5 = (cfc)object5)).z() || ((cfc)object5).k()) break block6;
                    if ((object5 = cej.b((cdx)object4, (cfc)object5, n2)) == null) break block5;
                    ++((cdx)object4).h;
                    bl2 = ((cfh)object5).c;
                }
                long l2 = bl2 ? System.currentTimeMillis() : 0L;
                long l3 = bl2 ? SystemClock.elapsedRealtime() : 0L;
                object2 = new cej(this, n2, (cdj)object3, l2, l3);
            }
            if (object2 != null) {
                object = ((bzo)object).a;
                object3 = this.m;
                Objects.requireNonNull(object3);
                object3 = new cdv(object3, 0);
                ((ckz)object).g((Executor)object3, (ckv)object2);
            }
        }
    }
}

