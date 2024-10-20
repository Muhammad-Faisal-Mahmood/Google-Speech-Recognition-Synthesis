/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

public final class jdg
implements Runnable {
    final Object a;
    final Object b;
    private final int c;

    public jdg(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object2;
        this.b = object;
    }

    public jdg(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object2;
        this.a = object;
    }

    public jdg(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch, int n2) {
        this.c = n2;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
    }

    public /* synthetic */ jdg(jdk jdk2, bmt bmt2, int n2) {
        this.c = n2;
        this.b = jdk2;
        this.a = bmt2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var2_1 = this.c;
        var6_2 = false;
        var1_3 = 0;
        var7_4 = null;
        switch (var2_1) {
            default: {
                try {
                    var8_7 = this.b;
                    ** break;
                }
                catch (InterruptedException var7_5) {
                    Thread.currentThread().interrupt();
                    return;
                }
                catch (BrokenBarrierException | TimeoutException var7_6) {
                    return;
                }
            }
            case 19: {
                var7_4 = this.b;
                ((jia)this.a).b.v.d((jjq)var7_4);
                return;
            }
            case 18: {
                var7_4 = this.b;
                ((jia)this.a).b.t((jib)var7_4);
                return;
            }
            case 17: {
                var7_4 = this.b;
                ((jia)((hst)this.a).b).b.t((jib)var7_4);
                return;
            }
            case 16: {
                var7_4 = this.a;
                ((jia)this.b).b.v.c((iwx)var7_4);
                return;
            }
            case 15: {
                var8_8 = ((jid)((cdn)this.a).b).l;
                synchronized (var8_8) {
                    var9_16 = this.a;
                    if (((jhw)((cdn)var9_16).a).b) {
                        var1_3 = 1;
                    } else {
                        var9_16 = ((cdn)var9_16).b;
                        var10_22 = ((jid)var9_16).q.a((jib)this.b);
                        ((jid)var9_16).q = var10_22;
                        var9_16 = ((cdn)this.a).b;
                        var10_22 = ((jid)var9_16).q;
                        if (((jid)var9_16).w((jhy)var10_22) && ((var9_16 = ((jid)((cdn)this.a).b).o) == null || var9_16.a())) {
                            var9_16 = ((cdn)this.a).b;
                            ((jid)var9_16).x = var7_4 = new jhw(((jid)var9_16).l);
                        } else {
                            var10_22 = ((cdn)this.a).b;
                            ((jid)var10_22).q = var9_16 = ((jid)var10_22).q.b();
                            ((jid)((cdn)this.a).b).x = null;
                        }
                    }
                    ** if (var1_3 == 0) goto lbl57
                }
lbl-1000:
                // 1 sources

                {
                    var8_8 = this.b;
                    var7_4 = ((cdn)this.a).b;
                    var8_8 = (jib)var8_8;
                    var8_8.a.m(new jia((jid)var7_4, (jib)var8_8));
                    ((jib)this.b).a.c(iyh.c.e("Unneeded hedging"));
                    return;
                }
lbl57:
                // 1 sources

                if (var7_4 != null) {
                    var9_16 = ((cdn)this.a).b;
                    var8_8 = new cdn(var9_16, var7_4, 3);
                    var10_22 = (jid)var9_16;
                    var3_27 = var10_22.j.b;
                    var9_16 = TimeUnit.NANOSECONDS;
                    var7_4.b(var10_22.h.schedule((Runnable)var8_8, var3_27, (TimeUnit)var9_16));
                }
                var8_8 = this.a;
                var7_4 = this.b;
                ((jid)((cdn)var8_8).b).t((jib)var7_4);
                return;
            }
            case 14: {
                this.b.run();
                var8_9 = this.a;
                var7_4 = new jel(var8_9, 13);
                ((jfo)var8_9).f.c.m.execute((Runnable)var7_4);
                return;
            }
            case 13: {
                if (((jfp)this.b).a.get() != jfs.e) {
                    ((jfo)this.a).j();
                    return;
                }
                var7_4 = ((jfp)this.b).c;
                if (var7_4.w == null) {
                    var7_4.w = new LinkedHashSet<E>();
                    var7_4 = ((jfp)this.b).c;
                    var7_4.Q.c(var7_4.x, true);
                }
                var8_10 = this.b;
                var7_4 = this.a;
                ((jfp)var8_10).c.w.add(var7_4);
                return;
            }
            case 12: {
                var7_4 = this.b;
                var8_11 = (ixg)this.a;
                var7_4 = ((ixf)var7_4).a((ixg)var8_11);
                var9_17 = jih.b;
                var8_11 = (AmbientMode$AmbientController)var8_11.b.a(var9_17);
                if (var7_4.g()) {
                    ((jih)var8_11.a).c.a();
                    return;
                }
                var7_4 = var8_11.a;
                ((jih)var7_4).c.b(new jhz(var7_4, 3));
                return;
            }
            case 11: {
                var7_4 = (jfl)this.b;
                var8_12 = var7_4.c;
                var10_23 = jfs.a;
                var9_18 = Level.WARNING;
                var11_29 = var8_12.h;
                var8_12 = this.a;
                var10_23.logp((Level)var9_18, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{var11_29, var8_12});
                var9_18 = var7_4.c.I;
                if (var9_18.a.get() == jfs.e) {
                    var9_18.d(null);
                }
                var9_18 = var7_4.c;
                if (var9_18.S != 3) {
                    var9_18.G.b(3, "Failed to resolve name: {0}", new Object[]{var8_12});
                    var7_4.c.S = 3;
                }
                if ((var9_18 = var7_4.a) != var7_4.c.t) {
                    return;
                }
                var9_18.a.b.b((iyh)var8_12);
                return;
            }
            case 10: {
                if (((jes)this.b).c.o.a == iui.e) {
                    return;
                }
                var8_13 = (jes)this.b;
                var9_19 = var8_13.c.n;
                var7_4 = var8_13.a;
                if (var9_19 == var7_4) {
                    var8_13.c.n = null;
                    ((jes)this.b).c.g.c();
                    ((jes)this.b).c.d(iui.d);
                    return;
                }
                var8_13 = var8_13.c;
                if (var8_13.m != var7_4) return;
                var5_30 = var8_13.o.a == iui.a;
                fxf.E(var5_30, "Expected state is CONNECTING, actual state is %s", (Object)((jes)this.b).c.o.a);
                var8_13 = ((jes)this.b).c.g;
                var7_4 = (iux)var8_13.a.get(var8_13.b);
                var8_13.c = var1_3 = var8_13.c + 1;
                if (var1_3 >= var7_4.b.size()) {
                    ++var8_13.b;
                    var8_13.c = 0;
                }
                var7_4 = ((jes)this.b).c.g;
                if (var7_4.b < var7_4.a.size()) {
                    ((jes)this.b).c.i();
                    return;
                }
                jeu.j(((jes)this.b).c);
                ((jes)this.b).c.g.c();
                var7_4 = this.b;
                var8_13 = this.a;
                var7_4 = ((jes)var7_4).c;
                var7_4.f.c();
                var8_13 = (iyh)var8_13;
                fxf.r(var8_13.g() ^ true, "The error status must not be OK");
                var7_4.e(new iuj(iui.c, (iyh)var8_13));
                if (var7_4.r == null) {
                    var7_4.r = new jdp();
                }
                var3_28 = var7_4.r.a() - var7_4.i.a(TimeUnit.NANOSECONDS);
                var7_4.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new Object[]{jeu.k((iyh)var8_13), var3_28});
                var5_30 = var6_2;
                if (var7_4.s == null) {
                    var5_30 = true;
                }
                fxf.B(var5_30, "previous reconnectTask is not done");
                var8_13 = var7_4.f;
                var9_19 = new iuk(var7_4, 20);
                var10_24 = var7_4.b;
                var7_4.s = var8_13.d((Runnable)var9_19, var3_28, TimeUnit.NANOSECONDS, var10_24);
                return;
            }
            case 9: {
                if (((jeu)this.b).o.a == iui.e) {
                    return;
                }
                var8_14 = this.b;
                var7_4 = (iyh)this.a;
                var9_20 = (jeu)var8_14;
                var9_20.p = var7_4;
                var8_14 = var9_20.n;
                var7_4 = var9_20.m;
                var9_20.n = null;
                jeu.j((jeu)this.b);
                var9_20 = this.b;
                var10_25 /* !! */  = iui.e;
                ((jeu)var9_20).d(var10_25 /* !! */ );
                ((jeu)this.b).g.c();
                if (((jeu)this.b).k.isEmpty()) {
                    ((jeu)this.b).f();
                }
                var10_25 /* !! */  = (jeu)this.b;
                var10_25 /* !! */ .f.c();
                var9_20 = var10_25 /* !! */ .s;
                if (var9_20 != null) {
                    var9_20.j();
                    var10_25 /* !! */ .s = null;
                    var10_25 /* !! */ .r = null;
                }
                if ((var9_20 = ((jeu)this.b).t) != null) {
                    var9_20.j();
                    var9_20 = this.b;
                    var10_25 /* !! */  = this.a;
                    ((jeu)var9_20).j.o((iyh)var10_25 /* !! */ );
                    var9_20 = (jeu)this.b;
                    var9_20.t = null;
                    var9_20.j = null;
                }
                if (var8_14 != null) {
                    var8_14.o((iyh)this.a);
                }
                if (var7_4 == null) return;
                var7_4.o((iyh)this.a);
                return;
            }
            case 8: {
                var8_15 = this.b;
                var9_21 /* !! */  = ((jeu)this.a).g;
                var7_4 = var9_21 /* !! */ .b();
                var9_21 /* !! */ .a = var8_15;
                var9_21 /* !! */ .c();
                ((jeu)this.a).h = var8_15 = this.b;
                if (((jeu)this.a).o.a == iui.b || ((jeu)this.a).o.a == iui.a) ** GOTO lbl214
lbl211:
                // 3 sources

                while (true) {
                    var7_4 = null;
                    ** GOTO lbl240
                    break;
                }
lbl214:
                // 1 sources

                var8_15 = this.a;
                var1_3 = 0;
                while (true) {
                    var9_21 /* !! */  = ((jeu)var8_15).g;
                    if (var1_3 >= var9_21 /* !! */ .a.size()) ** GOTO lbl226
                    var2_1 = ((iux)var9_21 /* !! */ .a.get((int)var1_3)).b.indexOf(var7_4);
                    if (var2_1 != -1) break;
                    ++var1_3;
                }
                var9_21 /* !! */ .b = var1_3;
                var9_21 /* !! */ .c = var2_1;
                ** GOTO lbl211
lbl226:
                // 1 sources

                if (((jeu)this.a).o.a == iui.b) {
                    var8_15 = (jeu)this.a;
                    var7_4 = var8_15.n;
                    var8_15.n = null;
                    ((jeu)this.a).g.c();
                    var8_15 = this.a;
                    var9_21 /* !! */  = iui.d;
                    ((jeu)var8_15).d((iui)var9_21 /* !! */ );
                } else {
                    ((jeu)this.a).m.o(iyh.k.e("InternalSubchannel closed pending transport due to address change"));
                    jeu.j((jeu)this.a);
                    ((jeu)this.a).g.c();
                    ((jeu)this.a).i();
                    ** continue;
                }
lbl240:
                // 2 sources

                if (var7_4 == null) return;
                var8_15 = (jeu)this.a;
                if (var8_15.t != null) {
                    var8_15.j.o(iyh.k.e("InternalSubchannel closed transport early due to address change"));
                    ((jeu)this.a).t.j();
                    var8_15 = (jeu)this.a;
                    var8_15.t = null;
                    var8_15.j = null;
                }
                var8_15 = (jeu)this.a;
                var8_15.j = var7_4;
                var10_26 = new jel(this, 0);
                var7_4 = var8_15.b;
                var9_21 /* !! */  = TimeUnit.SECONDS;
                var8_15.t = var8_15.f.d(var10_26, 5L, (TimeUnit)var9_21 /* !! */ , (ScheduledExecutorService)var7_4);
                return;
            }
            case 7: {
                var7_4 = ((bmt)this.a).c();
                ((jdk)this.b).a.a((ixg)var7_4);
                return;
            }
            case 6: {
                var7_4 = this.a;
                ((jdh)this.b).a.c((iwx)var7_4);
                return;
            }
            case 5: {
                var7_4 = this.b;
                ((jdh)this.a).a.d((jjq)var7_4);
                return;
            }
            case 4: {
                var7_4 = this.a;
                ((jdi)this.b).e.c((iyh)var7_4);
                return;
            }
            case 3: {
                var7_4 = this.b;
                ((jdi)this.a).e.n((InputStream)var7_4);
                return;
            }
            case 2: {
                var7_4 = this.a;
                ((jdi)this.b).e.i((iut)var7_4);
                return;
            }
            case 1: {
                var7_4 = this.a;
                ((jdi)this.b).e.h((iuf)var7_4);
                return;
            }
            case 0: 
        }
        var7_4 = this.a;
        ((jdi)this.b).e.j((iuw)var7_4);
        return;
lbl-1000:
        // 1 sources

        {
            var7_4 = TimeUnit.MILLISECONDS;
            ((CyclicBarrier)var8_7).await(1000L, (TimeUnit)var7_4);
            ((CountDownLatch)this.a).await();
            return;
        }
    }
}

