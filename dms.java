/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  hom
 */
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

public final class dms
implements hnx {
    public final dmt a;
    public final dmq b;

    public /* synthetic */ dms(dmt dmt2, dmq dmq2) {
        this.a = dmt2;
        this.b = dmq2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final hpn a() {
        block125: {
            block123: {
                block122: {
                    var17_1 = this.a;
                    var15_2 = this.b;
                    if (var15_2.g) {
                        var13_3 = ket.a.l();
                        if (!var13_3.b.B()) {
                            var13_3.u();
                        }
                        var12_4 = (ket)var13_3.b;
                        var12_4.d = 2;
                        var12_4.b |= 4;
                        var12_4 = (ket)var13_3.o();
                    } else {
                        var12_4 = var15_2.f;
                        var13_3 = (dsp)var17_1.e;
                        var11_13 = var13_3.b;
                        var13_3 = var13_3.a;
                        var12_4 = var11_13 != false ? var13_3.c((Long)var12_4) : var13_3.e();
                    }
                    if (var12_4.c != -1L) break block122;
                    var12_4 = hpj.a;
                    break block123;
                }
                var19_14 = (fzp)var17_1.c.b();
                var18_15 = var15_2.c;
                var16_16 = (hwp)var18_15.C(5);
                var16_16.x((hwv)var18_15);
                var20_17 = kew.a.l();
                var1_18 = var19_14.b;
                if (!var20_17.b.B()) {
                    var20_17.u();
                }
                var14_19 = var20_17.b;
                var13_3 = (kew)var14_19;
                var13_3.e = var1_18 - 1;
                var13_3.b |= 4;
                var13_3 = var19_14.e;
                if (var13_3 != null) {
                    if (!var14_19.B()) {
                        var20_17.u();
                    }
                    var14_19 = (kew)var20_17.b;
                    var14_19.b |= 1;
                    var14_19.c = (String)var13_3;
                }
                if (!var20_17.b.B()) {
                    var20_17.u();
                }
                var14_19 = var20_17.b;
                var13_3 = (kew)var14_19;
                var13_3.b |= 8;
                var13_3.f = 680716794L;
                var13_3 = var19_14.c;
                if (var13_3 != null) {
                    if (!var14_19.B()) {
                        var20_17.u();
                    }
                    var14_19 = (kew)var20_17.b;
                    var14_19.b |= 2;
                    var14_19.d = (String)var13_3;
                }
                var13_3 = var14_19 = var18_15.f;
                if (var14_19 == null) {
                    var13_3 = kdt.a;
                }
                var13_3 = var14_19 = var13_3.d;
                if (var14_19 == null) {
                    var13_3 = kes.a;
                }
                var13_3 = var14_19 = var13_3.c;
                if (var14_19 == null) {
                    var13_3 = ker.a;
                }
                if ((var13_3.b & 8) != 0 && ((Boolean)var19_14.a.b()).booleanValue()) {
                    var21_20 = var19_14.e;
                    var13_3 = var14_19 = var18_15.f;
                    if (var14_19 == null) {
                        var13_3 = kdt.a;
                    }
                    var13_3 = var14_19 = var13_3.d;
                    if (var14_19 == null) {
                        var13_3 = kes.a;
                    }
                    var13_3 = var14_19 = var13_3.c;
                    if (var14_19 == null) {
                        var13_3 = ker.a;
                    }
                    var13_3 = var13_3.f;
                    var13_3 = dlt.c((String)var21_20, (String)var13_3);
                } else {
                    var13_3 = var19_14.f;
                }
                if (var13_3 != null) {
                    if (!var20_17.b.B()) {
                        var20_17.u();
                    }
                    var14_19 = (kew)var20_17.b;
                    var14_19.b |= 16;
                    var14_19.g = (String)var13_3;
                }
                if (!var16_16.b.B()) {
                    var16_16.u();
                }
                var13_3 = (kfl)var16_16.b;
                var14_19 = (kew)var20_17.o();
                var14_19.getClass();
                var13_3.t = var14_19;
                var13_3.b |= 0x400000;
                if (crt.e((Context)var19_14.g)) {
                    var13_3 = kfd.a.l();
                    var7_21 = ((AmbientDelegate)var19_14.h).i().getFreeSpace() / 1024L;
                    if (!var13_3.b.B()) {
                        var13_3.u();
                    }
                    var14_19 = (kfd)var13_3.b;
                    var14_19.b |= 1;
                    var14_19.c = var7_21;
                    var7_21 = (Long)var19_14.d.a();
                    if (!var13_3.b.B()) {
                        var13_3.u();
                    }
                    var14_19 = (kfd)var13_3.b;
                    var14_19.b |= 2;
                    var14_19.d = var7_21;
                    if (!var16_16.b.B()) {
                        var16_16.u();
                    }
                    var14_19 = (kfl)var16_16.b;
                    var13_3 = (kfd)var13_3.o();
                    var13_3.getClass();
                    var14_19.v = var13_3;
                    var14_19.b |= 0x1000000;
                }
                if (!TextUtils.isEmpty(null)) {
                    var13_3 = var14_19 = var18_15.x;
                    if (var14_19 == null) {
                        var13_3 = kev.a;
                    }
                    var14_19 = (hwp)var13_3.C(5);
                    var14_19.x((hwv)var13_3);
                    if (((kev)var14_19.b).c.isEmpty()) {
                        if (!var14_19.b.B()) {
                            var14_19.u();
                        }
                        var12_4 = (kev)var14_19.b;
                        throw null;
                    }
                    var13_3 = new StringBuilder(null);
                    var13_3.append("::");
                    var13_3.append(((kev)var14_19.b).c);
                    var18_15 = var13_3.toString();
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var13_3 = (kev)var14_19.b;
                    var13_3.b |= 1;
                    var13_3.c = var18_15;
                    if (!var16_16.b.B()) {
                        var16_16.u();
                    }
                    var13_3 = (kfl)var16_16.b;
                    var14_19 = (kev)var14_19.o();
                    var14_19.getClass();
                    var13_3.x = var14_19;
                    var13_3.b |= 0x4000000;
                }
                var13_3 = (kfl)var16_16.o();
                var14_19 = (hwp)var13_3.C(5);
                var14_19.x((hwv)var13_3);
                if (!var14_19.b.B()) {
                    var14_19.u();
                }
                var13_3 = (kfl)var14_19.b;
                var12_4.getClass();
                var13_3.q = var12_4;
                var13_3.b |= 0x100000;
                var18_15 = var15_2.h;
                if (var18_15 != null) {
                    var3_22 /* !! */  = var15_2.i;
                    var16_16 = new ArrayList<E>();
                    for (var1_18 = 0; var1_18 < ((dla[])(var12_4 = var18_15.b)).length; ++var1_18) {
                        var13_3 = var12_4[var1_18];
                        var5_25 = var18_15.c[var1_18];
                        if (var3_22 /* !! */  <= 0) {
                            var12_4 = new dkt[]{};
                        } else {
                            var6_26 = Math.max(var5_25 - Math.min(var3_22 /* !! */ , 19), 0);
                            var4_24 = var5_25 - var6_26;
                            if (var4_24 <= 0) {
                                var12_4 = new dkt[]{};
                            } else {
                                var12_4 = new dkt[var4_24];
                                for (var2_23 = 0; var2_23 < var4_24; ++var2_23) {
                                    var12_4[var2_23] = (dkt)var13_3.a.get((var2_23 + var6_26) % 20);
                                }
                                var6_26 = var13_3.c;
                                if (var6_26 >= var5_25) {
                                    var2_23 = var6_26 - var5_25;
                                } else {
                                    var2_23 = var13_3.d;
                                    var2_23 = var6_26 - 27 + (0x7FFFFFFF - var5_25);
                                }
                                var2_23 = var2_23 - (20 - var4_24) + 1;
                                if (var2_23 >= var4_24) {
                                    var12_4 = new dkt[]{};
                                } else if (var2_23 > 0) {
                                    var13_3 = new dkt[var4_24 -= var2_23];
                                    System.arraycopy(var12_4, var2_23, var13_3, 0, var4_24);
                                    var12_4 = var13_3;
                                }
                            }
                        }
                        for (var2_23 = 0; var2_23 < ((Object)var12_4).length; ++var2_23) {
                            var16_16.add(new hti((dkt)var12_4[var2_23], var1_18));
                        }
                    }
                    Collections.sort(var16_16, new dfs(3));
                    var12_4 = kfc.a.l();
                    var7_21 = 0L;
                    for (var1_18 = Math.max(var16_16.size() - var3_22 /* !! */ , 0); var1_18 < var16_16.size(); ++var1_18) {
                        var18_15 = (hti)var16_16.get(var1_18);
                        var13_3 = var18_15.b;
                        var2_23 = var18_15.a;
                        var13_3 = (dkt)var13_3;
                        var19_14 = var13_3.b;
                        var20_17 = var13_3.c;
                        var3_22 /* !! */  = var13_3.d;
                        var18_15 = new StringBuilder();
                        var18_15.append((String)var19_14);
                        var18_15.append(".");
                        var18_15.append((String)var20_17);
                        var18_15.append(":");
                        var18_15.append(var3_22 /* !! */ );
                        var18_15 = hqk.a(var18_15.toString());
                        if (var18_15 == null) continue;
                        var9_27 = var18_15.longValue();
                        if (!var12_4.b.B()) {
                            var12_4.u();
                        }
                        var18_15 = (kfc)var12_4.b;
                        var19_14 = var18_15.b;
                        if (!var19_14.c()) {
                            var18_15.b = hwv.r((hxe)var19_14);
                        }
                        var18_15.b.e(var9_27);
                        var9_27 = var13_3.a / 1000000L;
                        if (!var12_4.b.B()) {
                            var12_4.u();
                        }
                        var19_14 = (kfc)var12_4.b;
                        var18_15 = var19_14.c;
                        if (!var18_15.c()) {
                            var19_14.c = hwv.r((hxe)var18_15);
                        }
                        var19_14.c.e(var9_27 - var7_21);
                        if (!var12_4.b.B()) {
                            var12_4.u();
                        }
                        var19_14 = (kfc)var12_4.b;
                        var18_15 = var19_14.d;
                        if (!var18_15.c()) {
                            var19_14.d = hwv.q((hxb)var18_15);
                        }
                        var19_14.d.g(var2_23);
                        for (var2_23 = 0; var2_23 < ((Object)(var18_15 = (Object)var13_3.e)).length; ++var2_23) {
                            var3_22 /* !! */  = (int)var18_15[var2_23];
                            if (!var12_4.b.B()) {
                                var12_4.u();
                            }
                            var19_14 = (kfc)var12_4.b;
                            var18_15 = var19_14.e;
                            if (!var18_15.c()) {
                                var19_14.e = hwv.q((hxb)var18_15);
                            }
                            var19_14.e.g(var1_18);
                            if (!var12_4.b.B()) {
                                var12_4.u();
                            }
                            var18_15 = (kfc)var12_4.b;
                            var19_14 = var18_15.f;
                            if (!var19_14.c()) {
                                var18_15.f = hwv.q((hxb)var19_14);
                            }
                            var18_15.f.g(var3_22 /* !! */ );
                            var19_14 = var13_3.f[var2_23];
                            if (!var12_4.b.B()) {
                                var12_4.u();
                            }
                            var18_15 = (kfc)var12_4.b;
                            var19_14.getClass();
                            var20_17 = var18_15.g;
                            if (!var20_17.c()) {
                                var18_15.g = hwv.s((hxk)var20_17);
                            }
                            var18_15.g.add(var19_14);
                        }
                        var7_21 = var9_27;
                    }
                    var12_4 = new dkw((kfc)((kfc)var12_4.o())).a;
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var13_3 = (kfl)var14_19.b;
                    var13_3.r = var12_4;
                    var13_3.b |= 0x200000;
                }
                if ((var15_2.c.b & 64) != 0 && ((Boolean)var17_1.j.b()).booleanValue()) {
                    var13_3 = fvd.y(fvd.y(((gqa)((cxt)((gtt)var17_1.i).a).a).a(), new gro()), new cxc(16));
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var16_16 = (kfl)var14_19.b;
                    var12_4 = var16_16.n;
                    if (!var12_4.c()) {
                        var16_16.n = hwv.s((hxk)var12_4);
                    }
                    hvc.g((Iterable)var13_3, var16_16.n);
                }
                if ((var12_4 = (gto)var17_1.h).g()) {
                    var13_3 = ((dmp)var12_4.c()).a();
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var16_16 = (kfl)var14_19.b;
                    var12_4 = var16_16.s;
                    if (!var12_4.c()) {
                        var16_16.s = hwv.s((hxk)var12_4);
                    }
                    hvc.g((Iterable)var13_3, var16_16.s);
                }
                var12_4 = var15_2.a;
                if (var15_2.b) {
                    if (var12_4 != null) {
                        if (!var14_19.b.B()) {
                            var14_19.u();
                        }
                        var13_3 = (kfl)var14_19.b;
                        var13_3.b |= 4;
                        var13_3.e = var12_4;
                    } else {
                        if (!var14_19.b.B()) {
                            var14_19.u();
                        }
                        var12_4 = (kfl)var14_19.b;
                        var12_4.b &= -5;
                        var12_4.e = kfl.a.e;
                    }
                } else if (var12_4 != null) {
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var13_3 = (kfl)var14_19.b;
                    var13_3.b |= 2;
                    var13_3.d = var12_4;
                } else {
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var12_4 = (kfl)var14_19.b;
                    var12_4.b &= -3;
                    var12_4.d = kfl.a.d;
                }
                var17_1.f.b();
                var13_3 = var15_2.d;
                if (var13_3 != null) {
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var12_4 = (kfl)var14_19.b;
                    var12_4.w = var13_3;
                    var12_4.b |= 0x2000000;
                }
                if ((var13_3 = var15_2.e) != null) {
                    var12_4 = kev.a.l();
                    if (!var12_4.b.B()) {
                        var12_4.u();
                    }
                    var15_2 = (kev)var12_4.b;
                    var15_2.b |= 1;
                    var15_2.c = var13_3;
                    if (!var14_19.b.B()) {
                        var14_19.u();
                    }
                    var13_3 = (kfl)var14_19.b;
                    var12_4 = (kev)var12_4.o();
                    var12_4.getClass();
                    var13_3.x = var12_4;
                    var13_3.b |= 0x4000000;
                }
                var12_4 = var17_1.b;
                var15_2 = (kfl)var14_19.o();
                var18_15 = (gzx)((dmr)var12_4).a.a();
                var19_14 = gzx.g(var18_15.size());
                var2_23 = var18_15.size();
                var13_3 = null;
                for (var1_18 = 0; var1_18 < var2_23; ++var1_18) {
                    block121: {
                        block119: {
                            block120: {
                                block116: {
                                    block118: {
                                        block117: {
                                            block124: {
                                                var20_17 = (dwm)var18_15.get(var1_18);
                                                if (!var20_17.a) ** GOTO lbl362
                                                var12_4 = var14_19 = var15_2.i;
                                                if (var14_19 != null) ** GOTO lbl357
                                                var12_4 = kez.a;
lbl357:
                                                // 2 sources

                                                if ((var12_4.b & 1) == 0) break block124;
                                                var12_4 = ((dtf)var20_17.b).a();
                                                var14_19 = new bte(var20_17, var15_2, 12);
                                                var12_4 = hno.f((hpn)var12_4, (gte)var14_19, (Executor)hom.a);
                                                ** GOTO lbl455
                                            }
                                            if (((var3_22 /* !! */  = var15_2.b) & 1024) == 0) break block116;
                                            var11_13 = (Boolean)var20_17.d.a();
                                            if (!var11_13) break block116;
                                            var12_4 = var15_2.C(5);
                                            var21_20 = (hwp)var12_4;
                                            var21_20.x((hwv)var15_2);
                                            var12_4 = var14_19 = var15_2.l;
                                            if (var14_19 != null) break block117;
                                            var12_4 = kff.a;
                                        }
                                        var14_19 = var12_4.k;
                                        if (var14_19.isEmpty()) ** GOTO lbl427
                                        var22_28 = kfi.a.l();
                                        var23_29 = var14_19.iterator();
                                        var14_19 = null;
                                        while (true) {
                                            var11_13 = var23_29.hasNext();
                                            if (!var11_13) break;
                                            var16_16 = (kfe)var23_29.next();
                                            if (var14_19 == null) ** GOTO lbl395
                                            var3_22 /* !! */  = var14_19.e + 1;
                                            if (var3_22 /* !! */  != var16_16.d) {
                                                var22_28.ay(0);
                                                var22_28.ax(var3_22 /* !! */ );
                                            }
lbl395:
                                            // 4 sources

                                            var22_28.ay(var16_16.c);
                                            var22_28.ax(var16_16.d);
                                            var14_19 = var16_16;
                                            continue;
                                            break;
                                        }
                                        if (var14_19 != null) {
                                            try {
                                                if ((var14_19.b & 4) == 0) break block118;
                                                var3_22 /* !! */  = var14_19.e;
                                            }
                                            catch (RuntimeException var12_6) {
                                                break block119;
                                            }
                                            try {
                                                var22_28.ay(0);
                                                var22_28.ax(var3_22 /* !! */  + 1);
                                            }
                                            catch (RuntimeException var12_5) {
                                                break block119;
                                            }
                                        }
                                    }
                                    try {
                                        var14_19 = (hwp)var12_4.C(5);
                                        var14_19.x((hwv)var12_4);
                                        if (!var14_19.b.B()) {
                                            var14_19.u();
                                        }
                                        ((kff)var14_19.b).k = hyp.b;
                                        if (!var14_19.b.B()) {
                                            var14_19.u();
                                        }
                                        var12_4 = (kff)var14_19.b;
                                        var16_16 = (kfi)var22_28.o();
                                        var16_16.getClass();
                                        var12_4.j = var16_16;
                                        var12_4.b |= 128;
                                        var12_4 = (kff)var14_19.o();
lbl427:
                                        // 2 sources

                                        if (!var21_20.b.B()) {
                                            var21_20.u();
                                        }
                                        var14_19 = (kfl)var21_20.b;
                                        var12_4.getClass();
                                        var14_19.l = var12_4;
                                        var14_19.b |= 1024;
                                        var12_4 = (kfl)var21_20.o();
                                        break block120;
                                    }
                                    catch (RuntimeException var12_11) {}
                                    catch (RuntimeException var12_7) {
                                        break block119;
                                    }
                                    catch (RuntimeException var12_8) {}
                                    break block119;
                                }
                                var12_4 = var15_2;
                            }
                            var14_19 = ((dtf)var20_17.b).a();
                            var16_16 = new cww(var20_17, var12_4, 19);
                            var12_4 = hno.g((hpn)var14_19, (hny)var16_16, (Executor)hom.a);
                            try {
                                if (!Log.isLoggable((String)"ClearcutMetricXmitter", (int)4)) ** GOTO lbl455
                            }
                            catch (RuntimeException var12_10) {
                                break block119;
                            }
                            try {
                                var14_19 = new cur(2);
                                hhk.T((hpn)var12_4, (hpb)var14_19, (Executor)hom.a);
lbl455:
                                // 3 sources

                                var19_14.h(var12_4);
                                var12_4 = var13_3;
                                break block121;
                            }
                            catch (RuntimeException var12_9) {
                                break block119;
                            }
                            break block119;
                            catch (RuntimeException var12_12) {
                                // empty catch block
                            }
                        }
                        a.as(dkc.a.h(), "One transmitter failed to send message", "com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", 'I', "MetricDispatcher.java", (Throwable)var12_4);
                        if (var13_3 != null) {
                            var13_3.addSuppressed((Throwable)var12_4);
                            var12_4 = var13_3;
                        }
                    }
                    var13_3 = var12_4;
                }
                if (var13_3 != null) break block125;
                var12_4 = hhk.aa(var19_14.g()).a(new cuh(19), (Executor)hom.a);
                ((dsp)var17_1.e).c.b();
            }
            return var12_4;
        }
        throw var13_3;
    }
}

