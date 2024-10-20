/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.os.Handler
 */
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class btl
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final int f;

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2) {
        this.f = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, byte[] byArray) {
        this.f = n2;
        this.d = jnu2;
        this.c = jnu3;
        this.a = jnu4;
        this.e = jnu5;
        this.b = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, char[] cArray) {
        this.f = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.d = jnu4;
        this.c = jnu5;
        this.e = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, char[] cArray, byte[] byArray) {
        this.f = n2;
        this.e = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.a = jnu5;
        this.d = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, float[] fArray) {
        this.f = n2;
        this.d = jnu2;
        this.e = jnu3;
        this.a = jnu4;
        this.b = jnu5;
        this.c = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, int[] nArray) {
        this.f = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.e = jnu4;
        this.b = jnu5;
        this.a = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, short[] sArray) {
        this.f = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.b = jnu4;
        this.e = jnu5;
        this.a = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, byte[][] byArray) {
        this.f = n2;
        this.e = jnu2;
        this.a = jnu3;
        this.b = jnu4;
        this.c = jnu5;
        this.d = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, float[][] fArray) {
        this.f = n2;
        this.b = jnu2;
        this.e = jnu3;
        this.c = jnu4;
        this.a = jnu5;
        this.d = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, int[][] nArray) {
        this.f = n2;
        this.b = jnu2;
        this.c = jnu3;
        this.d = jnu4;
        this.e = jnu5;
        this.a = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, short[][] sArray) {
        this.f = n2;
        this.c = jnu2;
        this.e = jnu3;
        this.d = jnu4;
        this.a = jnu5;
        this.b = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, boolean[][] blArray) {
        this.f = n2;
        this.d = jnu2;
        this.c = jnu3;
        this.b = jnu4;
        this.e = jnu5;
        this.a = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, byte[][][] byArray) {
        this.f = n2;
        this.e = jnu2;
        this.c = jnu3;
        this.a = jnu4;
        this.b = jnu5;
        this.d = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, char[][][] cArray) {
        this.f = n2;
        this.a = jnu2;
        this.e = jnu3;
        this.b = jnu4;
        this.c = jnu5;
        this.d = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, float[][][] fArray) {
        this.f = n2;
        this.a = jnu2;
        this.d = jnu3;
        this.e = jnu4;
        this.b = jnu5;
        this.c = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, int[][][] nArray) {
        this.f = n2;
        this.c = jnu2;
        this.e = jnu3;
        this.d = jnu4;
        this.b = jnu5;
        this.a = jnu6;
    }

    public btl(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, int n2, boolean[][][] blArray) {
        this.f = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.e = jnu5;
        this.d = jnu6;
    }

    @Override
    public final /* synthetic */ Object b() {
        Object object;
        block43: {
            Object object2;
            switch (this.f) {
                default: {
                    gto gto2 = (gto)((imc)this.e).a;
                    hpr hpr2 = (hpr)this.b.b();
                    jqf jqf2 = (jqf)this.c.b();
                    object2 = (gbs)((Object)this.a.b());
                    bbz bbz2 = (bbz)this.d.b();
                    object = new bal();
                    jse.e(hpr2, "executor");
                    ((bal)object).a = hpr2;
                    ((bal)object).e = new gcr((Handler)object2, 0);
                    jse.e(hpr2, "taskExecutor");
                    ((bal)object).d = hpr2;
                    jse.e(jqf2, "context");
                    ((bal)object).b = jqf2;
                    jse.e(bbz2, "workerFactory");
                    ((bal)object).c = bbz2;
                    if (gto2.g()) {
                        object2 = (gcf)gto2.c();
                        if (!((gcf)object2).a().g()) break;
                        ((bal)object).i = (String)((gcf)object2).a().c();
                        break;
                    }
                    break block43;
                }
                case 19: {
                    return new fyy((gib)this.a.b(), (hth)this.d.b(), (fzc)this.e.b(), (gto)((imc)this.b).a, (fvd)this.c.b());
                }
                case 18: {
                    gib gib2 = (gib)this.a.b();
                    hth hth2 = (hth)this.d.b();
                    Object object3 = (fzc)this.e.b();
                    object3 = (gto)((imc)this.b).a;
                    fvd fvd2 = (fvd)this.c.b();
                    return new fyx(gib2, hth2, (gto)object3);
                }
                case 17: {
                    jnu jnu2 = this.c;
                    Object object4 = this.b;
                    cya cya2 = ((ffw)this.a).a();
                    object4 = ((fkb)object4).a();
                    fju fju2 = (fju)jnu2.b();
                    fhq fhq2 = new fhq();
                    jnu2 = this.d;
                    return new fjz(cya2, (fka)object4, fju2, fhq2, ((bqx)this.e).a(), ((bqx)jnu2).a());
                }
                case 16: {
                    jnu jnu3 = this.a;
                    jnu jnu4 = this.b;
                    jnu jnu5 = this.d;
                    jnu jnu6 = this.e;
                    return new cya(this.c, jnu6, jnu5, jnu4, jnu3, null, null, null);
                }
                case 15: {
                    gjl gjl2 = (gjl)this.e.b();
                    hsn hsn2 = (hsn)this.d.b();
                    gpm gpm2 = (gpm)this.b.b();
                    gto gto3 = (gto)((imc)this.a).a;
                    hrh hrh2 = gjl2.c;
                    Object object5 = idm.g.a;
                    Object object6 = (itx)((ConcurrentHashMap)gpm2.d).get(hrh2);
                    if (object6 == null) {
                        object6 = (itx)((ConcurrentHashMap)gpm2.c).get(object5);
                        if (object6 == null) {
                            object6 = new gzs();
                            ((gzs)object6).h(idi.D(new dan(gpm2, 14)));
                            if (((hqw)gpm2.b).g != null) {
                                ((gzs)object6).h(new hsq(0));
                            }
                            if (((hqw)gpm2.b).f == null) {
                                ((gzs)object6).h(new hsn(2));
                            } else {
                                ((gzs)object6).h(new hsn(0));
                                ((gzs)object6).h(idi.D(new djo(15)));
                            }
                            ((gzs)object6).h(new hso());
                            if (((hqw)gpm2.b).n != null) {
                                ((gzs)object6).h(idi.D(new dan(gpm2, 13)));
                            }
                            ((gzs)object6).h(idi.D(new djo(16)));
                            ((gzs)object6).h(idi.D(new dan(gpm2, 11)));
                            object6 = fvc.U(new hsx((String)object5, (hqw)gpm2.b), ((gzs)object6).g());
                            object5 = (itx)((ConcurrentHashMap)gpm2.c).putIfAbsent(object5, object6);
                            if (object5 != null) {
                                object6 = object5;
                            }
                        }
                        object6 = fvc.V((itx)object6, idi.D(new dan(hrh2, 12)));
                        object5 = (itx)((ConcurrentHashMap)gpm2.d).putIfAbsent(hrh2, object6);
                        if (object5 != null) {
                            object6 = object5;
                        }
                    }
                    object6 = object5 = fvc.V((itx)object6, idi.D(new gjm(this.c, (Object)gto3, 0)));
                    if (gjl2.a != null) {
                        object6 = fvc.V((itx)object5, new gjn(gjl2));
                    }
                    return (idh)new idh((itx)object6, itw.a.f(jmw.b, (Object)jmt.c)).c(hsn2);
                }
                case 14: {
                    boolean bl2 = ((imr)this.a).a();
                    hpr hpr3 = (hpr)this.e.b();
                    ExecutorService executorService = (ExecutorService)this.b.b();
                    ExecutorService executorService2 = (ExecutorService)this.c.b();
                    gto gto4 = (gto)((imc)this.d).a;
                    dxy dxy2 = dxz.a();
                    dxy2.c = gto.i(hpr3);
                    if (!bl2) {
                        executorService = executorService2;
                    }
                    dxy2.b = (ExecutorService)gto4.e(executorService);
                    return dxy2.a();
                }
                case 13: {
                    Object object7 = this.a;
                    jnu jnu7 = this.c;
                    Context context = ((ilt)this.e).a();
                    jnu7 = ((gdb)jnu7).a();
                    object7 = (eie)object7.b();
                    jnu jnu8 = this.d;
                    return new eik(context, (AudioManager)jnu7, (eie)object7, ((ehg)this.b).a(), ((imr)jnu8).a());
                }
                case 12: {
                    efi efi2 = (efi)this.b.b();
                    cxt cxt2 = (cxt)this.e.b();
                    jnu jnu9 = this.d;
                    jnu jnu10 = this.a;
                    return new efl(efi2, cxt2, ((efg)this.c).a(), ((efk)jnu10).a(), ((end)jnu9).a());
                }
                case 11: {
                    jnu jnu11 = this.a;
                    jnu jnu12 = this.e;
                    jnu jnu13 = this.b;
                    jnu jnu14 = this.c;
                    return new cya(this.d, jnu14, jnu13, jnu12, jnu11, null, null);
                }
                case 10: {
                    Object object8 = ((imc)this.a).a;
                    jnu jnu15 = this.e;
                    Object object9 = this.d;
                    Context context = ((ilt)this.b).a();
                    object9 = ((bqw)object9).a();
                    return new god(((dwy)jnu15).a(), (gto)object8, context, this.c, (gto)object9, 1);
                }
                case 9: {
                    jnu jnu16 = this.b;
                    jnu jnu17 = this.a;
                    jnu jnu18 = this.d;
                    jnu jnu19 = this.e;
                    return new cya(this.c, jnu19, jnu18, jnu17, jnu16);
                }
                case 8: {
                    ((bqw)this.e).a();
                    Object object10 = (gto)((imc)this.a).a;
                    gto gto5 = ((drt)this.b).a();
                    object10 = ((gto)object10).g() && gto5.g() ? (dmw)this.d.b() : (dmw)this.c.b();
                    return new hdq(object10);
                }
                case 7: {
                    jnu jnu20 = this.a;
                    return new dqz(((dmv)this.e).a(), (hpr)jnu20.b(), (Executor)this.b.b(), ima.c(this.c), this.d);
                }
                case 6: {
                    String string = (String)this.d.b();
                    Object object11 = this.a;
                    dpq dpq2 = ((dmn)this.e).a();
                    object11 = (cgw)object11.b();
                    ((ilt)this.c).a();
                    return new dpi(string, dpq2, (cgw)object11, this.b);
                }
                case 5: {
                    Object object12 = this.d;
                    Context context = ((ilt)this.c).a();
                    cuv cuv2 = (cuv)object12.b();
                    frr frr2 = (frr)this.b.b();
                    Executor executor = (Executor)this.e.b();
                    object12 = (cqq)this.a.b();
                    return new cxd(context, cuv2, frr2, executor);
                }
                case 4: {
                    ((ilt)this.c).a();
                    cqq cqq2 = (cqq)this.d.b();
                    return new cxa((cuv)this.e.b(), (frr)this.b.b(), (Executor)this.a.b());
                }
                case 3: {
                    Object object13 = this.d;
                    Context context = ((ilt)this.c).a();
                    cuv cuv3 = (cuv)object13.b();
                    object13 = (frr)this.b.b();
                    Executor executor = (Executor)this.e.b();
                    cqq cqq3 = (cqq)this.a.b();
                    return new cxd(context, cuv3, (frr)object13, executor);
                }
                case 2: {
                    ThreadFactory threadFactory = (ThreadFactory)this.a.b();
                    hpr hpr4 = (hpr)this.b.b();
                    Object object14 = ((imc)this.c).a;
                    Serializable serializable = ((cqc)this.d).a();
                    object14 = (gto)object14;
                    ((cqa)this.e).a();
                    threadFactory = cgw.l("Blocking", new cod(new cod(threadFactory, 2), 0));
                    serializable = !((cpu)((Object)serializable)).a.g() ? gsl.a : gto.i(new cps((cpv)((Object)((cpu)((Object)serializable)).a.c()), threadFactory));
                    threadFactory = (ThreadFactory)((gto)serializable).e(threadFactory);
                    serializable = new SynchronousQueue();
                    return new cos(hhk.E(coy.a((gto)object14, new coh(TimeUnit.SECONDS, (BlockingQueue)((Object)serializable), threadFactory))), hpr4);
                }
                case 1: {
                    jnu jnu21 = this.c;
                    iil iil2 = ((bsl)this.d).a();
                    bxt bxt2 = (bxt)jnu21.b();
                    jnu21 = this.b;
                    jnu jnu22 = this.e;
                    return new VoicePolicyManager(iil2, bxt2, ((btr)this.a).a(), ((btt)jnu22).a(), (bwp)jnu21.b());
                }
                case 0: {
                    return new btj((Context)this.a.b(), (bxf)this.b.b(), (bwq)this.c.b(), (bxt)this.d.b(), ((bsx)this.e).a());
                }
            }
            if (((gcf)object2).b().g()) {
                ((bal)object).f = (um)((gcf)object2).b().c();
            }
            if (((gcf)object2).h().g()) {
                ((bal)object).h = (um)((gcf)object2).h().c();
            }
            if (((gcf)object2).g().g()) {
                ((bal)object).g = (um)((gcf)object2).g().c();
            }
            if (((gcf)object2).f().g()) {
                ((bal)object).j = (Integer)((gcf)object2).f().c();
            }
            if (!((gcf)object2).c().g()) {
                if (((gcf)object2).e().g()) {
                    int n2 = (Integer)((gcf)object2).e().c();
                    if (n2 >= 20) {
                        ((bal)object).k = Math.min(n2, 50);
                    } else {
                        throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
                    }
                }
                if (((gcf)object2).d().g()) {
                    ((bal)object).l = (Boolean)((gcf)object2).d().c();
                }
            } else {
                object = (fxf)((gcf)object2).c().c();
                object = (fxf)((gcf)object2).c().c();
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
        }
        return object;
    }
}

