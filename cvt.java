/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cvt
implements hnx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ cvt(bmu bmu2, Object object, dea dea2, hpn hpn2, int n2) {
        this.e = n2;
        this.a = bmu2;
        this.d = object;
        this.b = dea2;
        this.c = hpn2;
    }

    public /* synthetic */ cvt(cwo cwo2, List list, List list2, Boolean bl2, int n2) {
        this.e = n2;
        this.b = cwo2;
        this.c = list;
        this.d = list2;
        this.a = bl2;
    }

    public /* synthetic */ cvt(dzg dzg2, hpn hpn2, hpn hpn3, dzc dzc2, int n2) {
        this.e = n2;
        this.a = dzg2;
        this.c = hpn2;
        this.d = hpn3;
        this.b = dzc2;
    }

    public /* synthetic */ cvt(Object object, hpn hpn2, hny hny2, Executor executor, int n2) {
        this.e = n2;
        this.b = object;
        this.c = hpn2;
        this.a = hny2;
        this.d = executor;
    }

    public /* synthetic */ cvt(Object object, Object object2, Object object3, hpn hpn2, int n2) {
        this.e = n2;
        this.b = object;
        this.d = object2;
        this.a = object3;
        this.c = hpn2;
    }

    public /* synthetic */ cvt(Object object, Object object2, Object object3, Object object4, int n2) {
        this.e = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        var2_1 = this.e;
        var1_2 = 0;
        switch (var2_1) {
            default: {
                var7_3 = this.a;
                var7_3 = var7_3 != null ? (hqo)hhk.S((Future)var7_3) : null;
            }
            case 9: {
                var8_14 = this.d;
                var7_4 = this.a;
                var7_4 = gqk.d(new cxe(this.b, var7_4, var8_14, 12, null));
                return hno.g((hpn)this.c, (hny)var7_4, (Executor)hom.a);
            }
            case 8: {
                var7_5 = this.b;
                var9_26 = new frm(var7_5, 2);
                var10_35 = this.d;
                var8_15 = this.a;
                var9_26 = hno.g((hpn)this.c, (hny)var9_26, (Executor)hom.a);
                var8_15 = hno.g((hpn)var9_26, (hny)var8_15, (Executor)var10_35);
                return hno.g((hpn)var8_15, gqk.d(new cxe(var7_5, var9_26, var8_15, 11, null)), (Executor)hom.a);
            }
            case 7: {
                var7_6 = (String)hhk.S((Future)this.c);
                var7_6 = (String)hhk.S((Future)this.d);
                var9_27 = this.a;
                var7_6 = (dzg)var9_27;
                var8_16 = ((gtt)var7_6.a.d).a;
                var8_16 = (dzc)this.b;
                var11_44 = var8_16.a;
                var10_36 = iaa.a.l();
                if (!var10_36.b.B()) {
                    var10_36.u();
                }
                var12_48 = (iaa)var10_36.b;
                var11_44.getClass();
                var12_48.c = var11_44;
                var12_48.b = 5;
                var10_36 = hhk.K(var10_36.o());
                var9_27 = fxf.aj((hpn)var10_36, new cym(var9_27, 20), (Executor)hom.a);
                var10_36 = fxf.aj((hpn)var10_36, new dti(6), (Executor)hom.a);
                return fxf.aF(new hpn[]{var9_27, var10_36}).D(new cvt((dzg)var7_6, (hpn)var10_36, (hpn)var9_27, (dzc)var8_16, 6), (Executor)hom.a);
            }
            case 6: {
                var7_7 = (hyf)hhk.S((Future)this.c);
                var8_17 = (cai)hhk.S((Future)this.d);
                var7_7 = this.a;
                var9_28 = (dzg)var7_7;
                var8_17.e((Integer)((gtt)var9_28.a.e).a);
                var11_45 = ((dzc)this.b).b.k();
                while (true) {
                    if (!var11_45.hasNext()) {
                        var8_17.p = (cro)((gtt)var9_28.a.f).a;
                        return fxf.aj(grf.g(crh.a(var8_17.a())).e(Throwable.class, new dti(5), (Executor)hom.a), new eex(var7_7, 1), (Executor)hom.a);
                    }
                    var10_37 = (Integer)var11_45.next();
                    var10_37.intValue();
                    if (var8_17.c == null) {
                        var8_17.c = new ArrayList<E>();
                    }
                    var8_17.c.add(var10_37);
                }
            }
            case 5: {
                var7_8 = this.d;
                var8_18 = this.a;
                try {
                    var9_29 = (Map)((gto)hhk.S((Future)var8_18)).f();
                    if (var9_29 == null) {
                    }
                    ** GOTO lbl70
                }
                catch (Exception var8_19) {
                    a.as(dkc.a.h(), "Failed to get custom timestamps future", "com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java", var8_19);
                }
                ** GOTO lbl86
lbl70:
                // 1 sources

                var8_18 = (hwp)var7_8;
                var3_51 = ((kef)var8_18.b).c;
                for (Object var11_46 : var9_29.entrySet()) {
                    var9_29 = (Integer)var11_46.getKey();
                    var9_29.intValue();
                    var5_52 = (Long)var11_46.getValue();
                    if (!var8_18.b.B()) {
                        var8_18.u();
                    }
                    var11_46 = (kef)var8_18.b;
                    var12_49 = var11_46.w;
                    if (!var12_49.b) {
                        var11_46.w = var12_49.a();
                    }
                    var11_46.w.put(var9_29, var5_52 - var3_51);
                }
lbl86:
                // 3 sources

                var11_46 = this.b;
                var8_18 = dmq.a();
                var9_29 = kfl.a.l();
                var10_38 = keb.a.l();
                var3_51 = UUID.randomUUID().getLeastSignificantBits();
                if (!var10_38.b.B()) {
                    var10_38.u();
                }
                var12_49 = var10_38.b;
                var13_53 = (keb)var12_49;
                var13_53.b |= 1;
                var13_53.c = var3_51;
                if (!var12_49.B()) {
                    var10_38.u();
                }
                var12_49 = var10_38.b;
                var13_53 = (keb)var12_49;
                var13_53.d = 2;
                var13_53.b = 2 | var13_53.b;
                if (!var12_49.B()) {
                    var10_38.u();
                }
                var12_49 = (keb)var10_38.b;
                var7_8 = (kef)((hwp)var7_8).o();
                var7_8.getClass();
                var12_49.f = var7_8;
                var12_49.b |= 16;
                if (!var9_29.b.B()) {
                    var9_29.u();
                }
                var12_49 = ((dqz)var11_46).a;
                var7_8 = this.c;
                var11_46 = (kfl)var9_29.b;
                var10_38 = (keb)var10_38.o();
                var10_38.getClass();
                var11_46.m = var10_38;
                var11_46.b |= 2048;
                var8_18.i((kfl)var9_29.o());
                var8_18.d = (kdo)((gto)hhk.S((Future)var7_8)).f();
                var8_18.c = null;
                var8_18.h(true);
                return var12_49.b(var8_18.e());
            }
            case 4: {
                var7_9 = this.a;
                var8_20 = this.d;
                ((dhl)this.b).e((String)var8_20, (dhn)var7_9);
                return this.c;
            }
            case 3: {
                var10_39 = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/base/TaskRunner", "execute", 147, "TaskRunner.java");
                var7_10 = this.d;
                var9_30 = this.a;
                var8_21 = (bmu)var9_30;
                var10_39.u("Task completed for: %s", var8_21.q(var7_10));
                var10_39 = var8_21.a;
                var8_21 = this.b;
                synchronized (var10_39) {
                    ((bmu)var9_30).a.remove(var7_10);
                }
                synchronized (var8_21) {
                    var7_10 = ((dea)var8_21).b;
                    if (var7_10 == null) return this.c;
                    var7_10.m(null);
                    return this.c;
                }
            }
            case 2: {
                var7_11 = hhk.K(true);
                while (true) {
                    var9_31 = this.c;
                    var10_40 = this.b;
                    if (var1_2 >= var9_31.size()) return fxf.aj(var7_11, new brk(this.a, 20), ((cwo)var10_40).c);
                    var8_22 = this.d;
                    var7_11 = fxf.ak(var7_11, new cwd(var10_40, (hwv)((ctt)var9_31.get(var1_2)), (ctv)hhk.S((Future)var8_22.get(var1_2)), 16), ((cwo)var10_40).c);
                    ++var1_2;
                }
            }
            case 1: {
                var9_32 = this.d;
                var8_23 = this.c;
                var10_41 = this.b;
                var7_12 = this.a;
                var8_23 = new cvt(var7_12, var10_41, var8_23, var9_32, 0);
                var9_32 = (cwj)var7_12;
                var7_12 = var9_32.e;
                return var9_32.k.g((hnx)var8_23, (Executor)var7_12);
            }
            case 0: {
                var8_24 = this.b;
                var9_33 = this.a;
                var10_42 = new ctz(var9_33, var8_24, 7);
                var7_13 = (cwj)var9_33;
                var12_50 = fxf.ai((hnx)var10_42, var7_13.e);
                var10_42 = this.d;
                var11_47 = this.c;
                return var7_13.q(var12_50, new cvq(var9_33, (ctq)var8_24, var11_47, var10_42, 12));
            }
        }
        var8_25 = this.c;
        var8_25 = var8_25 != null ? (Object)((byte[])hhk.S((Future)var8_25)) : null;
        if (var7_3 == null) {
            return hhk.K(null);
        }
        var10_43 = this.d;
        var9_34 = this.b;
        if (var8_25 == null) {
            return duv.h(((duv)((cya)var9_34).b).a.k((String)var10_43, (hqo)var7_3));
        }
        var9_34 = ((duv)((cya)var9_34).b).a;
        var10_43 = (String)var10_43;
        return duv.h(var9_34.k((String)var10_43, (hqo)var7_3).a(new cjw((cka)var9_34, (String)var10_43, (byte[])var8_25)));
    }
}

