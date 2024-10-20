/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  gda
 *  gqv
 *  hom
 */
import android.content.Context;
import j$.util.Collection$_EL;
import j$.util.Map$_EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class gld
implements gkt {
    public static final hei a = hei.m("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final hpr b;
    public final hpq c;
    public final gax d;
    public final gto e;
    public final boolean f;
    public final gky g;
    public final Map h;
    public final jnu i;
    public final hpn j;
    public final Object k = new Object();
    public final ot l;
    public final Map m;
    public final Map n;
    public final AtomicReference o;
    private final Context p;
    private final Map q;
    private final boolean r;
    private final glk s;
    private final gto t;
    private final String u;
    private final dtu v;
    private final knl w;

    /*
     * WARNING - void declaration
     */
    public gld(Context context, hpr hashMap, hpq object, dtu object2, gax object32, gto object4, gto object5, gky gky2, Map map, Map map2, Map map3, knl knl2, glk glk2, gto gto2, jnu jnu2, Map map4, gto gto3) {
        void var14_16;
        void var13_15;
        void var9_11;
        void var10_12;
        void var17_19;
        void var16_18;
        void var15_17;
        void var12_14;
        void var11_13;
        void var8_10;
        gmm gmm2;
        Object object3;
        ot ot2;
        this.l = ot2 = new ot();
        this.m = new ot();
        this.n = new ot();
        this.o = new AtomicReference();
        this.p = context;
        this.b = hashMap;
        this.c = object;
        this.v = object2;
        this.d = object32;
        this.e = object3;
        hashMap = false;
        this.f = (Boolean)((gto)((Object)gmm2)).e(hashMap);
        this.g = var8_10;
        this.h = var11_13;
        this.w = var12_14;
        this.i = var15_17;
        this.q = var16_18;
        this.r = (Boolean)var17_19.e(hashMap);
        fxf.B(var10_12.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.j = var8_10.c();
        hashMap = new HashMap();
        for (Map.Entry entry : var9_11.entrySet()) {
            object3 = gkk.a((String)entry.getKey());
            object = gmm.a.l();
            object3 = ((gkk)object3).a;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            gmm2 = (gmm)((hwp)object).b;
            object3.getClass();
            gmm2.c = object3;
            gmm2.b |= 1;
            gld.o(new gli((gmm)((hwp)object).o()), entry, hashMap);
        }
        ot2.putAll((Map)((Object)hashMap));
        this.s = var13_15;
        this.t = var14_16;
        this.u = fxf.o(context);
    }

    public static /* synthetic */ void j(hpn hpn2) {
        try {
            hhk.S(hpn2);
            return;
        }
        catch (CancellationException cancellationException) {
            a.as(a.g(), "The sync scheduling future was cancelled. This should never happen.", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", '\u02ae', "SyncManagerImpl.java", cancellationException);
            return;
        }
        catch (ExecutionException executionException) {
            a.as(a.g(), "Error scheduling next sync wakeup", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", '\u02ac', "SyncManagerImpl.java", executionException);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void k(hpn hpn2) {
        void var0_3;
        try {
            hhk.S(hpn2);
            return;
        }
        catch (ExecutionException executionException) {
        }
        catch (CancellationException cancellationException) {
            // empty catch block
        }
        if (var0_3.getCause() instanceof TimeoutException) {
            a.as(a.h(), "Timeout updating accounts in sync. Some accounts may not sync correctly.", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", '\u0314', "SyncManagerImpl.java", (Throwable)var0_3);
            return;
        }
        a.as(a.g(), "Updating sync accounts failed. Some accounts may not sync correctly.", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", '\u0318', "SyncManagerImpl.java", (Throwable)var0_3);
    }

    private final hpn n() {
        hqa hqa2 = new hqa();
        if (a.i(this.o, hqa2)) {
            hqa2.o(fxf.aj(this.c(), new ggk(this, 6), this.b));
        }
        return hhk.L((hpn)this.o.get());
    }

    private static final void o(gli gli2, Map.Entry object, Map map) {
        gkl gkl2;
        try {
            gkl2 = (gkl)((jnu)object.getValue()).b();
        }
        catch (RuntimeException runtimeException) {
            object = new hue(object.getKey());
            ((heg)((heg)((heg)a.g()).i(runtimeException)).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 903, "SyncManagerImpl.java")).u("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", object);
            return;
        }
        if (!gkl2.a) {
            return;
        }
        map.put(gli2, gkl2);
    }

    @Override
    public final hpn a() {
        ((heg)((heg)a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 588, "SyncManagerImpl.java")).r("#poke(). Scheduling workers.");
        hpn hpn2 = this.f(hhk.K(hdc.a));
        gcx gcx2 = new gcx(5);
        return this.w.a(hpn2, gcx2);
    }

    @Override
    public final hpn b() {
        ((heg)((heg)a.f()).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 199, "SyncManagerImpl.java")).r("#sync(). Running Synclets and scheduling next sync.");
        long l2 = cgw.p().toEpochMilli();
        Object object = this.g;
        Object object2 = gqk.j(new gkx((gky)object, l2));
        object2 = fxf.an(((gky)object).d.bf((Callable)object2), new frn(this, 17), this.b);
        object = new gcx(6);
        object2 = this.w.a((hpn)object2, (hny)object);
        object2.c(new bpw(20), (Executor)hom.a);
        return object2;
    }

    public final hpn c() {
        hth hth2 = (hth)((hth)((gtt)this.e).a).a;
        hth hth3 = (hth)hth2.a;
        hpn hpn2 = ((frr)hth3.b).a();
        if (!hpn2.isDone()) {
            hpn2 = new gak(hth3, hpn2);
        }
        return fxf.aj(fxf.aj(hpn2, new fiz(7), (Executor)hth2.b), new fiz(14), this.b);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ hpn d(hpn var1_1, Map var2_6) {
        block24: {
            try {
                var5_8 = (Boolean)hhk.S((Future)var1_1);
                var1_1 = null;
                break block24;
            }
            catch (CancellationException var1_2) {
            }
            catch (ExecutionException var1_3) {
                // empty catch block
            }
            var5_8 = false;
        }
        if (var5_8) {
            fxf.A(this.n().isDone());
            var6_9 = new ArrayList<hpn>();
            var7_11 = var2_6.entrySet().iterator();
            while (var7_11.hasNext() != false) {
                var1_1 = var7_11.next();
                var8_13 = (gli)var1_1.getKey();
                var9_14 = (hqa)var1_1.getValue();
                var10_15 = new StringBuilder("Synclet: ");
                var10_15.append(var8_13.b.b());
                if (var8_13.a()) {
                    var10_15.append(" ");
                    var10_15.append(var8_13.c.a);
                }
                var1_1 = var2_6 = goo.a;
                try {
                    if (this.t.g()) {
                        var1_1 = (gkm)this.t.c();
                        var11_16 = var8_13.b;
                        var1_1 = var1_1.a();
                    }
                }
                catch (RuntimeException var1_4) {
                    a.as(gld.a.h(), "Failed to get SpanExtras for synclet", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "startSyncletRunSpan", '\u0212', "SyncManagerImpl.java", var1_4);
                    var1_1 = var2_6;
                }
                var2_6 = var1_1;
                if (var8_13.a()) {
                    var1_1 = var1_1.c();
                    fyn.a((gon)var1_1, var8_13.c, gda.a);
                    var2_6 = ((gop)var1_1).f();
                }
                var2_6 = fxf.at(var10_15.toString(), gqv.a, (gop)var2_6);
                var10_15 = this.k;
                synchronized (var10_15) {
                }
                {
                    var1_1 = (gkl)this.l.get(var8_13);
                    ** if (var1_1 != null) goto lbl-1000
                }
lbl-1000:
                // 1 sources

                {
                    ** try [egrp 4[TRYBLOCK] [5 : 311->584)] { 
lbl52:
                    // 1 sources

                    var9_14.cancel(false);
                    ** GOTO lbl73
                }
lbl-1000:
                // 1 sources

                {
                    var10_15 = new etu(this, var1_1, 13);
                    var1_1 = var8_13.a() != false ? ((glc)fvd.m(this.p, glc.class, var8_13.c)).b() : this.w;
                    var11_16 = var8_13.b;
                    var13_18 = (Set)((imc)var1_1.b).a;
                    var12_17 = hav.i(var13_18.size());
                    var15_20 = var13_18.iterator();
                    while (var15_20.hasNext()) {
                        var13_18 = (gmi)var15_20.next();
                        var14_19 = new gmf(var13_18, 0);
                        var12_17.j(var14_19);
                    }
                    var1_1 = var1_1.c;
                    var12_17 = var12_17.g();
                    var1_1 = ((bzo)var1_1).I((hnx)var10_15, (hav)var12_17);
                    var10_15 = new hue(var11_16);
                    gax.c((hpn)var1_1, "Synclet sync() failed for synckey: %s", new Object[]{var10_15});
                    var9_14.o((hpn)var1_1);
                }
lbl73:
                // 2 sources

                var1_1 = new dcf(this, var9_14, var8_13, 10, null);
                var9_14 = fxf.an(var9_14, (hnx)var1_1, this.b);
                var1_1 = new fbx(this, var8_13, var9_14, 14, null);
                var9_14.c((Runnable)var1_1, this.b);
                var2_6.a(var9_14);
                var6_9.add(var9_14);
            }
            return hno.f(hhk.Q(var6_9), new gtf(), (Executor)hom.a);
lbl82:
            // 1 sources

            finally {
                var2_6.close();
            }
        }
        a.as(gld.a.h(), "Failed preparing sync datastore for sync. Aborting sync attempt.", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", '\u0153', "SyncManagerImpl.java", (Throwable)var1_1);
        var3_21 = cgw.p().toEpochMilli();
        var1_1 = new ArrayList<E>(var2_6.size());
        var6_10 = var2_6.keySet().iterator();
        while (var6_10.hasNext() != false) {
            var7_12 = (gli)var6_10.next();
            var1_1.add(this.g.d(var7_12, var3_21, false));
        }
        return fxf.am(hhk.H(var1_1), new gkz(this, var2_6, 0), this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ hpn e(hpn hpn2, gli gli2) {
        boolean bl2;
        boolean bl3 = false;
        try {
            hhk.S(hpn2);
            bl2 = true;
        }
        catch (ExecutionException executionException) {
            bl2 = bl3;
            if (executionException.getCause() instanceof TimeoutException) {
                ((heg)((heg)((heg)a.h()).i(executionException)).j("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 472, "SyncManagerImpl.java")).u("Sync cancelled from timeout and will be retried later: %s", gli2.b.b());
                bl2 = bl3;
            }
        }
        catch (CancellationException cancellationException) {
            bl2 = bl3;
        }
        long l2 = cgw.p().toEpochMilli();
        return fxf.am(this.g.d(gli2, l2, bl2), new gma(l2, 1), this.b);
    }

    public final hpn f(hpn hpn2) {
        if (this.f) {
            return hhk.Z(hpn2, hhk.L(hhk.Z(hpn2, this.j, this.n()).b(gqk.c(new etu(this, hpn2, 12, null)), this.c))).a(gqk.j(new dwp(5)), (Executor)hom.a);
        }
        hpn hpn3 = hhk.L(fxf.ak(this.j, new fbk(this, hpn2, 11, null), this.b));
        this.d.d(hpn3);
        hpn3.c(new gjf(hpn3, 5), this.b);
        return hno.f(hpn2, gqk.b(new fiz(15)), (Executor)hom.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn g(hpn object, long l2) {
        HashMap hashMap;
        Object object2;
        block6: {
            object2 = hdc.a;
            try {
                object = (Set)hhk.S((Future)object);
                break block6;
            }
            catch (CancellationException cancellationException) {
            }
            catch (ExecutionException executionException) {
                // empty catch block
            }
            a.as(a.h(), "Unable to determine attempted syncs. They will not be used to schedule the next sync.", "com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", '\u029d', "SyncManagerImpl.java", (Throwable)object);
            object = object2;
        }
        object2 = this.k;
        synchronized (object2) {
            hashMap = new HashMap(this.l);
        }
        Collection$_EL.removeIf(hashMap.entrySet(), new fai(this, 14));
        return fxf.ak(this.s.a((Set)object, l2, hashMap), new fbk(this, hashMap, 10, null), (Executor)hom.a);
    }

    public final hpn h(hpn hpn2) {
        return fxf.ak(this.n(), new ghi(hpn2, 5), (Executor)hom.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(Set object) {
        Object object2 = this.k;
        synchronized (object2) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                fym fym2 = (fym)iterator.next();
                ot ot2 = this.l;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((hac)((glb)fvd.m(this.p, glb.class, fym2)).a()).k()) {
                    Object object3 = gkk.a((String)entry.getKey());
                    int n2 = fym2.a;
                    hwp hwp2 = gmm.a.l();
                    gml gml2 = ((gkk)object3).a;
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    hwv hwv2 = hwp2.b;
                    object3 = (gmm)hwv2;
                    gml2.getClass();
                    ((gmm)object3).c = gml2;
                    ((gmm)object3).b |= 1;
                    if (!hwv2.B()) {
                        hwp2.u();
                    }
                    object3 = (gmm)hwp2.b;
                    ((gmm)object3).b |= 2;
                    ((gmm)object3).d = n2;
                    object = new gli((gmm)hwp2.o());
                    gld.o((gli)object, entry, hashMap);
                }
                ot2.putAll((Map)hashMap);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void l(gli gli2, hpn hpn2) {
        Object object = this.k;
        synchronized (object) {
            hqa hqa2 = (hqa)this.m.remove(gli2);
            try {
                this.n.put(gli2, (Long)hhk.S(hpn2));
                return;
            }
            catch (CancellationException | ExecutionException exception) {
                return;
            }
        }
    }

    public final boolean m(gkl object) {
        if (!this.r) {
            return this.v.b();
        }
        ((gkl)object).a();
        object = ((gkl)object).b().b();
        object = (Set)((jnu)Map$_EL.getOrDefault(this.q, object, new djo(13))).b();
        fxf.r(Collection$_EL.stream((Collection)object).noneMatch(new fay(14)), "Custom override processes should not start with ':'. Correct example: 'custom_process' or '' for the Android default process");
        if (object.isEmpty()) {
            return this.v.b();
        }
        return object.contains(this.u);
    }
}

