/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class ctz
implements hnx {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ ctz(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ ctz(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        var2_1 = this.c;
        var6_2 = null;
        var1_4 = 0;
        var7_5 = false;
        switch (var2_1) {
            default: {
                var5_6 = this.b;
                jse.e(var5_6, "$reason");
                return ((eqh)this.a).a.h((ebv)var5_6);
            }
            case 19: {
                var5_7 = this.a;
                return jsd.n((jvb)((dtu)this.b).c, (jro)var5_7);
            }
            case 18: {
                var5_8 = this.a;
                return jsd.n((jvb)((dtu)this.b).c, (jro)var5_8);
            }
            case 17: {
                var5_9 = this.a;
                return jsd.n(((eif)this.b).c, (jro)var5_9);
            }
            case 16: {
                var5_10 = this.a;
                return jsd.n(((ehq)this.b).c, (jro)var5_10);
            }
            case 15: {
                return ((dzd)((dxm)this.b).c.b()).a((dzc)this.a);
            }
            case 14: {
                var7_5 = (dsc)this.a;
                if (!((dry)var7_5.e.b()).b()) {
                    return hpj.a;
                }
                var5_11 = (drw)var7_5.d.b();
                if (var7_5.f.c()) {
                    return hpj.a;
                }
                var10_26 = this.b;
                var7_5.f.b();
                fpk.b();
                var5_11 = (dsa)var10_26;
                if (var5_11.a() == 0) ** GOTO lbl49
                var8_30 = new dfs(5);
                var9_38 = var5_11.d;
                synchronized (var9_38) {
                    Collections.sort(((dsa)var10_26).d, var8_30);
                    ((dsa)var10_26).b.b(((dsa)var10_26).d);
                }
                var9_38 = new ArrayList<K>(var5_11.c.keySet());
                Collections.sort(var9_38, var8_30);
                var5_11.b.b((List)var9_38);
                var5_11 = new drv(var5_11.b);
                var8_30 = new ArrayList<E>();
                var5_11.a(var5_11.a, 0L, (ArrayList)var8_30);
                if (var8_30.size() == 1) {
                    ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/trace/SpanProtoGenerator", "generate", 71, "SpanProtoGenerator.java")).r("No other span except for root span. Dropping trace...");
lbl49:
                    // 2 sources

                    var5_11 = null;
                } else {
                    var5_11 = DesugarCollections.unmodifiableList(var8_30);
                }
                if (var5_11 == null) return hpj.a;
                if (!var5_11.isEmpty()) {
                    var8_30 = keb.a.l();
                    var3_42 = UUID.randomUUID().getLeastSignificantBits();
                    if (!var8_30.b.B()) {
                        var8_30.u();
                    }
                    var9_38 = var8_30.b;
                    var10_26 = (keb)var9_38;
                    var10_26.b = 1 | var10_26.b;
                    var10_26.c = var3_42;
                    if (!var9_38.B()) {
                        var8_30.u();
                    }
                    var9_38 = (keb)var8_30.b;
                    var9_38.c();
                    hvc.g((Iterable)var5_11, var9_38.e);
                    var8_30 = (keb)var8_30.o();
                    var5_11 = var6_2;
                    if (var8_30.e.size() > 0) {
                        var5_11 = ((kec)var8_30.e.get((int)0)).c;
                    }
                    if ((var3_42 = var7_5.b.a((String)var5_11)) == -1L) {
                        return hpj.a;
                    }
                    var6_2 = kfl.a.l();
                    if (!var6_2.b.B()) {
                        var6_2.u();
                    }
                    var9_38 = (kfl)var6_2.b;
                    var8_30.getClass();
                    var9_38.m = var8_30;
                    var9_38.b |= 2048;
                    var6_2 = (kfl)var6_2.o();
                    ((heg)((heg)dkc.a.d()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 185, "TraceMetricServiceImpl.java")).z("Recording trace %d: %s", var8_30.c, var5_11);
                    var5_11 = var7_5.b;
                    var7_5 = dmq.a();
                    var7_5.i((kfl)var6_2);
                    var7_5.e = var3_42;
                    return var5_11.b(var7_5.e());
                }
                return hpj.a;
            }
            case 13: {
                var5_12 = this.b;
                var7_5 = (dqz)var5_12;
                if (!var7_5.a.c(null)) {
                    return hpj.a;
                }
                var6_2 = this.a;
                var8_31 = (kef)((hwp)var6_2).b;
                var1_4 = var8_31.s;
                var2_1 = a.u(var1_4);
                if ((var2_1 != 0 && var2_1 == 3 || (var1_4 = a.u(var1_4)) != 0 && var1_4 == 2) && (var8_31.b & 16) == 0) {
                    return hpj.a;
                }
                var7_5 = (dqs)var7_5.b.b();
                var7_5.b.e(new dpf(null));
                var8_31 = var7_5.a;
                var7_5 = hhk.K(gsl.a);
                var8_31.e(new dpg());
                var8_31 = hhk.K(gsl.a);
                return hhk.Z(new hpn[]{var7_5, var8_31}).b(new cvt(var5_12, var6_2, var7_5, (hpn)var8_31, 5), (Executor)hom.a);
            }
            case 12: {
                var5_13 = (dqp)this.b;
                return var5_13.b(((dqm)var5_13.d.b()).c((Iterable)this.a));
            }
            case 11: {
                var5_14 = this.a;
                return ((PeriodicWorker)this.b).e.f((String)var5_14);
            }
            case 10: {
                var5_15 = this.a;
                var6_2 = this.b;
                try {
                    ((czh)var6_2).d.remove(var5_15);
                    var7_5 = ((czh)var6_2).a;
                    var1_4 = ((czh)var6_2).d.size();
                    var7_5.b((String)var5_15, var1_4);
                    return hpj.a;
                }
                catch (Exception var6_3) {
                    cyr.j(var6_3, "%s: Failed to remove download future (%s) from map", new Object[]{"DownloadFutureMap", var5_15});
                    return hhk.J(var6_3);
                }
            }
            case 9: {
                var5_16 = new ArrayList<cxr>();
                while (var1_4 < (var6_2 = this.b).size()) {
                    var7_5 = this.a;
                    var6_2 = (ctq)var6_2.get(var1_4);
                    if ((var7_5 = (cth)hhk.S((Future)var7_5.get(var1_4))) != null) {
                        var5_16.add(new cxr((ctq)var6_2, (cth)var7_5));
                    }
                    ++var1_4;
                }
                return hhk.K(var5_16);
            }
            case 8: {
                return hhk.K(new cxs((cth)hhk.S((Future)this.b), (cth)hhk.S((Future)this.a)));
            }
            case 7: {
                var6_2 = this.b;
                var5_17 = (cwj)this.a;
                var7_5 = (ctq)var6_2;
                var6_2 = var5_17.g((ctq)var7_5, false);
                var7_5 = var5_17.g((ctq)var7_5, true);
                return crh.z(new hpn[]{var6_2, var7_5}).v(new ctz(var6_2, var7_5, 8, null), var5_17.e);
            }
            case 6: {
                var6_2 = this.b;
                var5_18 = (cuq)this.a;
                var6_2 = (csu)var6_2;
                return fxf.ak(var5_18.m((csu)var6_2), new cui(var5_18, (csu)var6_2), var5_18.d);
            }
            case 5: {
                var5_19 = (csh)this.b;
                var6_2 = var5_19.a;
                cyr.e("%s: Adding for download group = '%s', variant = '%s', buildId = '%d' and associating it with account = '%s', variant = '%s'", new Object[]{"MobileDataDownload", var6_2.c, var6_2.j, var6_2.i, "null", "null"});
                cqq.k();
                var6_2 = var5_19.a;
                var1_4 = var6_2.b;
                var8_32 = this.a;
                if ((var1_4 & 2) != 0) {
                    var9_39 = (cuq)var8_32;
                    var5_19 = var6_2;
                    if (!var9_39.a.getPackageName().equals(var6_2.d)) {
                        cyr.i("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", new Object[]{"MobileDataDownload", var6_2.c, var9_39.a.getPackageName(), var6_2.d});
                        return hhk.K(var7_5);
                    }
                } else {
                    var5_19 = (hwp)var6_2.C(5);
                    var5_19.x((hwv)var6_2);
                    var6_2 = ((cuq)var8_32).a.getPackageName();
                    if (!var5_19.b.B()) {
                        var5_19.u();
                    }
                    var9_39 = (csm)var5_19.b;
                    var6_2.getClass();
                    var9_39.b |= 2;
                    var9_39.d = var6_2;
                    var5_19 = (csm)var5_19.o();
                }
                var6_2 = ctq.a.l();
                var11_43 = var5_19.c;
                if (!var6_2.b.B()) {
                    var6_2.u();
                }
                var9_39 = var6_2.b;
                var10_27 = (ctq)var9_39;
                var11_43.getClass();
                var10_27.b |= 1;
                var10_27.c = var11_43;
                var10_27 = var5_19.d;
                if (!var9_39.B()) {
                    var6_2.u();
                }
                var9_39 = (ctq)var6_2.b;
                var10_27.getClass();
                var9_39.b = 2 | var9_39.b;
                var9_39.d = var10_27;
                try {
                    var5_19 = var5_19.g();
                    var9_39 = hwj.a;
                    var9_39 = hyo.a;
                    var9_39 = hwj.a;
                    var5_19 = hwv.o(cth.a, (byte[])var5_19, 0, ((Object)var5_19).length, (hwj)var9_39);
                    hwv.D((hwv)var5_19);
                    var9_39 = (cth)var5_19;
                    var5_19 = ((cuq)var8_32).c;
                    var12_44 = (ctq)var6_2.o();
                    var10_27 = ((cuq)var8_32).g;
                    cyr.d("%s addGroupForDownload %s", "MDDManager", var12_44.c);
                    var6_2 = var5_19.f();
                    var11_43 = new cwx((cwz)var5_19, (cth)var9_39, var12_44, (hny)var10_27);
                    var5_19 = fxf.ak((hpn)var6_2, (hny)var11_43, var5_19.i);
                    var6_2 = new buf(4);
                    return fxf.af((hpn)var5_19, IOException.class, (hny)var6_2, ((cuq)var8_32).d);
                }
                catch (hxn var5_20) {
                    cyr.j(var5_20, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", new Object[]{"MobileDataDownload"});
                    return hhk.K(var7_5);
                }
            }
            case 4: {
                var5_21 /* !! */  = ctq.a.l();
                if (!var5_21 /* !! */ .b.B()) {
                    var5_21 /* !! */ .u();
                }
                var8_33 = this.a;
                var7_5 = this.b;
                var6_2 = (ctq)var5_21 /* !! */ .b;
                var8_33 = ((cuu)var8_33).a;
                var8_33.getClass();
                var6_2.b |= 1;
                var6_2.c = var8_33;
                var6_2 = (cuq)var7_5;
                var8_33 = var6_2.a.getPackageName();
                if (!var5_21 /* !! */ .b.B()) {
                    var5_21 /* !! */ .u();
                }
                var7_5 = (ctq)var5_21 /* !! */ .b;
                var8_33.getClass();
                var7_5.b = 2 | var7_5.b;
                var7_5.d = var8_33;
                var5_21 /* !! */  = (ctq)var5_21 /* !! */ .o();
                var7_5 = var6_2.c;
                cyr.d("%s removeFileGroup %s", "MDDManager", var5_21 /* !! */ .c);
                return fxf.aj(fxf.ak(var7_5.f(), new cww(var7_5, var5_21 /* !! */ , 3, null), var7_5.i), new ain(11), var6_2.d);
            }
            case 3: {
                var7_5 = ctq.a.l();
                if (!var7_5.b.B()) {
                    var7_5.u();
                }
                var5_22 = this.b;
                var6_2 = this.a;
                var9_40 = (ctq)var7_5.b;
                var8_34 = ((csz)var5_22).a;
                var8_34.getClass();
                var9_40.b |= 1;
                var9_40.c = var8_34;
                var8_34 = (cuq)var6_2;
                var10_28 = var8_34.a.getPackageName();
                if (!var7_5.b.B()) {
                    var7_5.u();
                }
                var9_40 = (ctq)var7_5.b;
                var10_28.getClass();
                var9_40.b = 2 | var9_40.b;
                var9_40.d = var10_28;
                var7_5 = (ctq)var7_5.o();
                return fxf.ak(var8_34.c.e((ctq)var7_5, true), new btb(var6_2, (ctq)var7_5, var5_22, 8), var8_34.d);
            }
            case 2: {
                cyr.c("%s getAllFreshGroups", "MDDManager");
                var6_2 = this.a;
                var5_23 = (cuq)var6_2;
                var7_5 = var5_23.c;
                var8_35 = fxf.ak(var7_5.f(), new cwu(var7_5, 8), var7_5.i);
                var7_5 = this.b;
                return fxf.ak(fxf.aj(var8_35, new brk(var7_5, 7), var5_23.d), new bpu(var6_2, var7_5, 8, null), var5_23.d);
            }
            case 1: {
                var5_24 = ((btj)this.b).q;
                var7_5 = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "release", 1026, "Superpacks.java");
                var6_2 = this.a;
                var7_5.u("Releasing superpack %s", var6_2);
                var7_5 = new ArrayList<E>();
                try {
                    var9_41 = var5_24.i;
                    var8_36 = ddo.c(var5_24.b.b((String)var6_2));
                    var7_5.add(((dhl)var9_41).a((String)var6_2, (Set)var8_36));
                }
                catch (IOException var8_37) {
                    var7_5.add(hhk.J(var8_37));
                }
                var10_29 = var5_24.i;
                var8_36 = egg.d((String)var6_2);
                var9_41 = Collections.emptySet();
                var7_5.add(((dhl)var10_29).a((String)var8_36, var9_41));
                if (var7_5.isEmpty() == false) return hhk.Y((Iterable)var7_5).a(new cmq(var5_24, var7_5, var6_2, 3), (Executor)var5_24.l);
                return hhk.K(null);
            }
            case 0: 
        }
        var5_25 = this.b;
        var7_5 = this.a;
        var6_2 = (cuq)var7_5;
        return fxf.ak(var6_2.m((csu)var5_25), new bpu(var7_5, var5_25, 7, null), var6_2.d);
    }
}

