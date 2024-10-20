/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.util.Log
 */
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class dhl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public dhl(dfu dfu2, ddk object, ddk object2, ddk ddk2, hpq hpq2, dfi dfi2, dcj dcj2, int n2, gzx gzx2) {
        this.h = new HashMap();
        this.i = new HashMap();
        this.b = dfu2;
        this.c = object;
        this.d = object2;
        this.e = ddk2;
        this.a = hpq2;
        this.f = dfi2;
        this.l = dcj2;
        this.j = object2 = new AmbientMode$AmbientController(this);
        object = (AmbientMode$AmbientController)object2;
        this.g = new kpo(dfu2, hpq2, (AmbientMode$AmbientController)object2, n2);
        this.k = gzx2;
    }

    public dhl(gcv object) {
        Object object2;
        Object object3;
        this.b = object3 = ((gcv)object).a;
        this.l = ((gcv)object).e;
        this.a = object3 = ((bhd)object3).b;
        this.j = ((gcv)object).f;
        this.c = object2 = ((gcv)object).d;
        object2 = ((bam)object2).p;
        this.e = ((gcv)object).c;
        this.d = object2 = ((gcv)object).b;
        this.g = ((WorkDatabase)object2).z();
        this.f = ((WorkDatabase)object2).t();
        this.i = object = ((gcv)object).g;
        StringBuilder stringBuilder = new StringBuilder("Work [ id=");
        object2 = (String)object3;
        stringBuilder.append((String)object3);
        stringBuilder.append(", tags={ ");
        stringBuilder.append(jns.D((Iterable)object, ",", null, null, null, 62));
        stringBuilder.append(" } ]");
        this.k = stringBuilder.toString();
        this.h = new jwk();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final dhn l(String string, dhn dhn2) {
        synchronized (this) {
            dhn dhn3 = (dhn)this.h.get(string);
            this.h.put(string, dhn2);
            return dhn3;
        }
    }

    public final hpn a(String string, Set set) {
        return hhk.P(new dcf(this, string, set, 4), (Executor)this.a);
    }

    public final hpn b(String string, Set set, Set set2) {
        int n2;
        Object object;
        block7: {
            try {
                object = this.f.a(string);
                if (!object.isEmpty()) break block7;
            }
            catch (IOException iOException) {
                return hhk.J(iOException);
            }
            return hhk.K(false);
        }
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/Packs", "cancelAndReleasePendingPacks", 468, "Packs.java")).C("Scanning for previously pending packs for %s that are not in the new requested set of %s", string, set);
        ArrayList<hpn> arrayList = new ArrayList<hpn>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (dfh)iterator.next();
            Object object2 = ((dfh)object).a;
            if (set.contains(object2)) continue;
            Object object3 = this.b;
            Object object4 = ((dco)object2).a;
            n2 = !((dfu)object3).n((String)object4) ? (!set2.contains(object2) ? 2 : 3) : 1;
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/Packs", "cancelAndReleasePendingPack", 375, "Packs.java")).C("Cancelling and releasing pack %s for %s", object, string);
            object3 = ((dfh)object).a;
            object2 = this.g;
            ((hfk)ddd.c.l().j("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "cancel", 282, "FetchPipeline.java")).u("Fetch pipeline canceling operations for %s", object3);
            object2 = (kpo)object2;
            object4 = (AmbientDelegate)((kpo)object2).d.get(object3);
            if (object4 != null) {
                ((AmbientDelegate)object4).a.cancel(true);
            }
            object4 = new ArrayList<hpn>();
            Iterable iterable = ((AmbientMode$AmbientController)((kpo)object2).e).h();
            Iterable iterable2 = ((AmbientMode$AmbientController)((kpo)object2).e).i();
            Object object5 = ((AmbientMode$AmbientController)((kpo)object2).e).j();
            Iterable[] iterableArray = new Iterable[]{iterable, iterable2, object5};
            for (int i2 = 0; i2 < 3; ++i2) {
                fxf.K(iterableArray[i2]);
            }
            object5 = new gzc(iterableArray).iterator();
            while (object5.hasNext()) {
                object4.add(hhk.L(((dcy)object5.next()).a((ddn)object3)));
            }
            arrayList.add(hno.g(hhk.Y(object4).a(new czm(object4, object3, 3, null), (Executor)((kpo)object2).b), new dhh(this, string, object, n2, 0), (Executor)this.a));
            ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/Packs", "cancelAndReleasePendingPacks", 489, "Packs.java")).C("Pending pack %s is not in the new set for %s, will cancel and release it", ((dfh)object).a, string);
        }
        n2 = arrayList.size();
        if (n2 > 0) {
            ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/Packs", "cancelAndReleasePendingPacks", 496, "Packs.java")).x("Cancelling %d packs for %s", n2, string);
            return hno.g(hhk.H(arrayList), new buf(15), (Executor)this.a);
        }
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/Packs", "cancelAndReleasePendingPacks", 502, "Packs.java")).u("No packs to cancel or release for %s", string);
        return hhk.K(false);
    }

    public final hpn c(String string, Collection collection, Set set) {
        return this.d(string, gzx.q(collection), set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn d(String object, List object2, Set object3) {
        synchronized (this) {
            dhn dhn2 = new dhn((String)object, (List)object2, (Set)object3, this);
            object2 = this.l((String)object, dhn2);
            if (object2 != null) {
                ((dhn)object2).a();
                dhn2.b((dhn)object2);
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/Packs", "request", 276, "Packs.java")).u("There was a previous request pending for %s", object);
            }
            Object object4 = this.b;
            object2 = this.a;
            Object object5 = this.f;
            Object object6 = this.j;
            Object object7 = this.g;
            iuv iuv2 = hhk.Z(dhn2.e);
            object7 = (kpo)object7;
            object6 = (AmbientMode$AmbientController)object6;
            object3 = new czj(dhn2, (dfu)object4, (hpq)object2, (dfi)object5, (AmbientMode$AmbientController)object6, (kpo)object7, 2);
            object4 = iuv2.b((hnx)object3, (Executor)object2);
            dhn2.d((hpn)object4);
            object2 = hhk.Z(new hpn[]{object4});
            object3 = new cvt((Object)this, object, (Object)dhn2, (hpn)object4, 4);
            return hhk.L(((iuv)object2).b((hnx)object3, (Executor)this.a));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String string, dhn dhn2) {
        synchronized (this) {
            if (this.h.get(string) == dhn2) {
                this.h.remove(string);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String object, dfh object2, int n2) {
        CharSequence charSequence;
        Object object3 = ((dfh)object2).a;
        object2 = dde.a((ddn)object3, ((dfh)object2).b);
        Object object4 = dde.b((ddn)object3);
        ((dfu)this.b).p((ddn)object2);
        ((dfu)this.b).p((ddn)object4);
        if (n2 != 1) {
            if (n2 != 2) {
                object4 = this.b;
                charSequence = ((dco)object3).a;
                object2 = ((dfu)object4).b;
                synchronized (object2) {
                    ((dfu)object4).d((String)charSequence).a();
                    if (((det)((dfu)object4).d.a((ddn)object3)).d < 2) {
                    } else {
                        ((dfu)object4).d.c((ddn)object3, 1);
                    }
                }
            } else {
                ((dfu)this.b).p((ddn)object3);
            }
        }
        object2 = this.f;
        try {
            ((dfn)object2).a.getWritableDatabase().delete("pending_packs", "parent_id=? AND pack_name=?", new String[]{object, ((ddn)object3).toString()});
            return;
        }
        catch (SQLiteException sQLiteException) {
            object2 = ((dfn)object2).a;
            object3 = String.valueOf(object3);
            charSequence = new StringBuilder("SqlitePendingPacks#remove, SQL delete failed, parentId: ");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(", packName: ");
            ((StringBuilder)charSequence).append((String)object3);
            object = new IOException(((StringBuilder)charSequence).toString(), sQLiteException);
            object2.a((IOException)object);
            throw object;
        }
    }

    public final bgs g() {
        return AmbientLifecycleObserverKt.o((bhd)this.b);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object h(jqb var1_1) {
        block36: {
            block35: {
                block37: {
                    block34: {
                        if (!(var1_1 instanceof bdw)) ** GOTO lbl-1000
                        var4_13 /* !! */  = (bdw)var1_1;
                        var2_16 = var4_13 /* !! */ .b;
                        if ((var2_16 & -2147483648) != 0) {
                            var4_13 /* !! */ .b = var2_16 + -2147483648;
                            var1_1 = var4_13 /* !! */ ;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = new bdw(this, (jqb)var1_1);
                        }
                        var8_17 = var1_1.a;
                        var5_18 /* !! */  = jqh.a;
                        var2_16 = var1_1.b;
                        if (var2_16 != 0) {
                            if (var2_16 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            var7_19 = var1_1.c;
                            var1_1 = var1_1.e;
                            var6_20 = var7_19;
                            var4_13 /* !! */  = var1_1;
                            var5_18 /* !! */  = var1_1;
                            try {
                                jns.ak(var8_17);
                                break block34;
                            }
                            catch (Throwable var1_2) {
                                break block35;
                            }
                            catch (CancellationException var1_3) {
                                break block36;
                            }
                        }
                        jns.ak(var8_17);
                        var4_13 /* !! */  = ((bam)this.c).o;
                        var4_13 /* !! */  = this.b;
                        var3_21 = yj.o();
                        var7_19 = (bhd)var4_13 /* !! */ ;
                        var6_20 = var7_19.y;
                        if (var3_21 && var6_20 != null) {
                            var4_13 /* !! */  = ((bam)this.c).o;
                            var2_16 = var7_19.hashCode();
                            if (Build.VERSION.SDK_INT >= 29) {
                                var4_13 /* !! */  = yj.q((String)var6_20);
                                jse.e(var4_13 /* !! */ , "methodName");
                                dp$$ExternalSyntheticApiModelOutline0.m$1((String)var4_13 /* !! */ , var2_16);
                            } else {
                                var7_19 = yj.q((String)var6_20);
                                try {
                                    if (yj.b == null) {
                                        yj.b = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                                    }
                                    if ((var4_13 /* !! */  = yj.b) == null) {
                                        var4_13 /* !! */  = new IllegalArgumentException("Required value was null.");
                                        throw var4_13 /* !! */ ;
                                    }
                                    var4_13 /* !! */ .invoke(null, new Object[]{yj.a, var7_19, var2_16});
                                }
                                catch (Exception var4_14) {
                                    yj.p(var4_14);
                                }
                            }
                        }
                        var7_19 = this.d;
                        var4_13 /* !! */  = new bdr(this, 0);
                        var4_13 /* !! */  = (Boolean)((aum)var7_19).e((Callable)var4_13 /* !! */ );
                        jse.d(var4_13 /* !! */ , "shouldExit");
                        if (var4_13 /* !! */ .booleanValue()) {
                            return new bdu(null);
                        }
                        var7_19 = (bhd)this.b;
                        if (var7_19.d()) {
                            var4_13 /* !! */  = var7_19.f;
                        } else {
                            var4_13 /* !! */  = ((bam)this.c).q;
                            var7_19 = var7_19.e;
                            jse.e(var7_19, "className");
                            jse.e(var7_19, "className");
                            jse.e(var7_19, "className");
                            try {
                                var4_13 /* !! */  = Class.forName((String)var7_19).getDeclaredConstructor(null).newInstance(null);
                                jse.c(var4_13 /* !! */ , "null cannot be cast to non-null type androidx.work.InputMerger");
                                var4_13 /* !! */  = (bba)var4_13 /* !! */ ;
                            }
                            catch (Exception var4_15) {
                                var7_19 = String.valueOf(var7_19);
                                bbi.a().d(bbb.a, "Trouble instantiating ".concat((String)var7_19), var4_15);
                                var4_13 /* !! */  = null;
                            }
                            if (var4_13 /* !! */  == null) {
                                var4_13 /* !! */  = this.b;
                                var1_1 = bdy.a;
                                bbi.a().c((String)var1_1, "Could not create Input Merger ".concat(String.valueOf(((bhd)var4_13 /* !! */ ).e)));
                                return new bds(null);
                            }
                            var8_17 = jns.d(((bhd)this.b).f);
                            var9_22 = this.g;
                            var10_23 = this.a;
                            var7_19 = auo.a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                            var7_19.g(1, (String)var10_23);
                            var9_22 = (bhw)var9_22;
                            var9_22.a.j();
                            var9_22 = wf.i(var9_22.a, (awr)var7_19, false);
                            var10_23 = new ArrayList<bas>(var9_22.getCount());
                            while (var9_22.moveToNext()) {
                                var10_23.add(bas.a(var9_22.getBlob(0)));
                            }
                            var4_13 /* !! */  = var4_13 /* !! */ .a(jns.n((Collection)var8_17, var10_23));
                        }
                        var9_22 = this.a;
                        var7_19 = this.i;
                        var10_23 = this.c;
                        var8_17 = this.j;
                        var9_22 = UUID.fromString((String)var9_22);
                        var12_24 = (bam)var10_23;
                        var10_23 = var12_24.a;
                        var11_25 = var12_24.b;
                        var12_24 = var12_24.d;
                        var2_16 = bip.a;
                        var14_26 = this.d;
                        var15_27 = this.e;
                        var13_28 = (czh)this.j;
                        var13_28 = new bio((WorkDatabase)var14_26, (bfz)var15_27, (czh)var13_28);
                        var4_13 /* !! */  = new WorkerParameters((UUID)var9_22, (bas)var4_13 /* !! */ , (Collection)var7_19, (Executor)var10_23, var11_25, (czh)var8_17, (bbz)var12_24, (baz)var13_28);
                        try {
                            var7_19 = ((bam)this.c).d;
                            var8_17 = this.l;
                            var9_22 = ((bhd)this.b).d;
                            var7_19 = var7_19.b((Context)var8_17, (String)var9_22, (WorkerParameters)var4_13 /* !! */ );
                            var7_19.d = true;
                            var8_17 = var1_1.d().get(jwi.c);
                        }
                        catch (Throwable var1_10) {
                            var4_13 /* !! */  = this.b;
                            var1_11 = bdy.a;
                            bbi.a().c(var1_11, "Could not create Worker ".concat(String.valueOf(((bhd)var4_13 /* !! */ ).d)));
                            return new bds(null);
                        }
                        jse.b(var8_17);
                        var8_17 = (jwi)var8_17;
                        var8_17.w(new bdx((bbh)var7_19, var3_21, (String)var6_20, this));
                        var6_20 = this.d;
                        var9_22 = new bdr(this, 2);
                        var6_20 = ((aum)var6_20).e((Callable)var9_22);
                        jse.d(var6_20, "workDatabase.runInTransa\u2026e\n            }\n        )");
                        if ((Boolean)var6_20 == false) return new bdu(null);
                        if (var8_17.t() != false) return new bdu(null);
                        var6_20 = var4_13 /* !! */ .g;
                        var8_17 = ((czh)this.j).c;
                        jse.d(var8_17, "workTaskExecutor.getMainThreadExecutor()");
                        var8_17 = jvf.k((Executor)var8_17);
                        try {
                            try {
                                var9_22 = new bez(this, (bbh)var7_19, (baz)var6_20, null, 1);
                                var1_1.e = this;
                                var1_1.c = var4_13 /* !! */ ;
                                var1_1.b = 1;
                                var8_17 = jse.ae((jqf)var8_17, (jro)var9_22, (jqb)var1_1);
                                if (var8_17 == var5_18 /* !! */ ) return var5_18 /* !! */ ;
                                var1_1 = this;
                                var7_19 = var4_13 /* !! */ ;
                            }
                            catch (Throwable var1_4) {
                                break block37;
                            }
                        }
                        catch (CancellationException var1_8) {
                            var5_18 /* !! */  = this;
                            break block36;
                        }
                    }
                    var6_20 = var7_19;
                    var4_13 /* !! */  = var1_1;
                    var5_18 /* !! */  = var1_1;
                    {
                        var8_17 = (AmbientLifecycleObserverKt)var8_17;
                        var6_20 = var7_19;
                        var4_13 /* !! */  = var1_1;
                        var5_18 /* !! */  = var1_1;
                        jse.d(var8_17, "result");
                        var6_20 = var7_19;
                        var4_13 /* !! */  = var1_1;
                        var5_18 /* !! */  = var1_1;
                        return new bdt((AmbientLifecycleObserverKt)var8_17);
                    }
                }
                var5_18 /* !! */  = this;
                var6_20 = var4_13 /* !! */ ;
                var4_13 /* !! */  = var5_18 /* !! */ ;
            }
            var5_18 /* !! */  = bdy.a;
            bbi.a().d((String)var5_18 /* !! */ , ((String)var4_13 /* !! */ .k).concat(" failed because it threw an exception/error"), (Throwable)var1_6);
            var1_6 = ((bam)var4_13 /* !! */ .c).h;
            if (var1_6 == null) return new bds(null);
            var5_18 /* !! */  = new SharedLibraryVersion(((bhd)var4_13 /* !! */ .b).d, (WorkerParameters)var6_20);
            var4_13 /* !! */  = bdy.a;
            jse.e(var4_13 /* !! */ , "tag");
            try {
                var1_6.a((Object)var5_18 /* !! */ );
                return new bds(null);
            }
            catch (Throwable var1_7) {
                bbi.a().d((String)var4_13 /* !! */ , "Exception handler threw an exception", var1_7);
            }
            return new bds(null);
        }
        var6_20 = bdy.a;
        var4_13 /* !! */  = bbi.a();
        var5_18 /* !! */  = ((String)var5_18 /* !! */ .k).concat(" was cancelled");
        if (var4_13 /* !! */ .c > 4) throw var1_9;
        Log.i((String)var6_20, (String)var5_18 /* !! */ , (Throwable)var1_9);
        throw var1_9;
        finally {
            var9_22.close();
            var7_19.j();
        }
    }

    public final void i(int n2) {
        Object object = this.a;
        this.g.m(bbv.a, (String)object);
        long l2 = System.currentTimeMillis();
        object = this.a;
        this.g.h((String)object, l2);
        int n3 = ((bhd)this.b).w;
        object = this.a;
        this.g.g((String)object, n3);
        object = this.a;
        this.g.l((String)object, -1L);
        object = this.a;
        this.g.j((String)object, n2);
    }

    /*
     * Loose catch block
     */
    public final void j() {
        long l2 = System.currentTimeMillis();
        Object object = this.a;
        this.g.h((String)object, l2);
        object = this.a;
        this.g.m(bbv.a, (String)object);
        Object object2 = this.g;
        Object object3 = (bhw)object2;
        ((bhw)object3).a.j();
        object = ((bhw)object3).g.d();
        ((axb)object).g(1, (String)this.a);
        ((bhw)object2).a.k();
        ((axc)object).a();
        ((bhw)object2).a.n();
        ((bhw)object2).a.l();
        object = this.g;
        object3 = this.a;
        int n2 = ((bhd)this.b).w;
        object.g((String)object3, n2);
        object2 = this.g;
        Object object4 = this.a;
        object3 = (bhw)object2;
        ((bhw)object3).a.j();
        object = ((bhw)object3).e.d();
        ((axb)object).g(1, (String)object4);
        ((bhw)object2).a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            ((axc)object).a();
            ((bhw)object2).a.n();
        }
        catch (Throwable throwable) {
            ((bhw)object2).a.l();
            throw throwable;
        }
        try {
            ((bhw)object2).a.l();
            this.g.l((String)this.a, -1L);
            return;
        }
        finally {
            ((bhw)object3).e.f((axc)object);
        }
        catch (Throwable throwable) {
            ((bhw)object2).a.l();
            throw throwable;
        }
        finally {
            ((bhw)object3).g.f((axc)object);
        }
    }

    public final void k(AmbientLifecycleObserverKt object) {
        Object object2;
        Object object3 = jns.g((String)this.a);
        while (!object3.isEmpty()) {
            object2 = (String)jns.k((List)object3);
            if (this.g.a((String)object2) != bbv.f) {
                this.g.m(bbv.d, (String)object2);
            }
            object3.addAll(this.f.a((String)object2));
        }
        object3 = ((bbe)object).a;
        jse.d(object3, "failure.outputData");
        object = this.g;
        object2 = this.a;
        int n2 = ((bhd)this.b).w;
        object.g((String)object2, n2);
        this.g.i((String)this.a, (bas)object3);
    }
}

