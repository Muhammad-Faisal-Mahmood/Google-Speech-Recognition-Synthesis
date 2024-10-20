/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
import android.content.Context;
import android.os.StrictMode;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public final class coi
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final int i;

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2) {
        this.i = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, byte[] byArray) {
        this.i = n2;
        this.c = jnu2;
        this.h = jnu3;
        this.b = jnu4;
        this.a = jnu5;
        this.f = jnu6;
        this.d = jnu7;
        this.g = jnu8;
        this.e = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, char[] cArray) {
        this.i = n2;
        this.b = jnu2;
        this.h = jnu3;
        this.c = jnu4;
        this.f = jnu5;
        this.g = jnu6;
        this.d = jnu7;
        this.e = jnu8;
        this.a = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, float[] fArray) {
        this.i = n2;
        this.c = jnu2;
        this.b = jnu3;
        this.h = jnu4;
        this.e = jnu5;
        this.d = jnu6;
        this.g = jnu7;
        this.f = jnu8;
        this.a = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, int[] nArray) {
        this.i = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.h = jnu4;
        this.c = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.d = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, short[] sArray) {
        this.i = n2;
        this.d = jnu2;
        this.g = jnu3;
        this.h = jnu4;
        this.b = jnu5;
        this.e = jnu6;
        this.a = jnu7;
        this.f = jnu8;
        this.c = jnu9;
    }

    public coi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, int n2, boolean[] blArray) {
        this.i = n2;
        this.a = jnu2;
        this.f = jnu3;
        this.d = jnu4;
        this.e = jnu5;
        this.g = jnu6;
        this.c = jnu7;
        this.h = jnu8;
        this.b = jnu9;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.i;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                gfi gfi2 = (gfi)((imc)this.c).a;
                                bzo bzo2 = (bzo)((imc)this.b).a;
                                goi goi2 = (goi)this.h.b();
                                Map map = (Map)((imc)this.e).a;
                                Executor executor = (Executor)this.d.b();
                                gpm gpm2 = (gpm)this.g.b();
                                bzo bzo3 = ((gfn)this.f).a();
                                gto gto2 = (gto)((imc)this.a).a;
                                jse.e(gfi2, "deviceCommitterFactory");
                                jse.e(bzo2, "factory");
                                jse.e(goi2, "pathFactory");
                                jse.e(map, "defaultExperimentValues");
                                jse.e(executor, "uiExecutor");
                                jse.e(gpm2, "updater");
                                jse.e(gto2, "flagRecorder");
                                return bzo2.Z(geo.c, new ezq(bzo3, goi2, 5), executor, map, ggu.a, new eia((Object)gfi2, 9, null), new frm(gpm2, 16), aud.g, (gfp)gto2.f());
                            }
                            bzo bzo4 = (bzo)((imc)this.a).a;
                            gfi gfi3 = (gfi)((imc)this.f).a;
                            goi goi3 = (goi)this.d.b();
                            hpq hpq2 = (hpq)this.e.b();
                            gpm gpm3 = (gpm)this.g.b();
                            Map map = ((ily)this.c).a;
                            gto gto3 = (gto)((imc)this.h).a;
                            bzo bzo5 = ((gfn)this.b).a();
                            jse.e(bzo4, "factory");
                            jse.e(gfi3, "deviceCommitterFactory");
                            jse.e(goi3, "pathFactory");
                            jse.e(hpq2, "blockingExecutor");
                            jse.e(gpm3, "updater");
                            jse.e(map, "defaultExperimentFlagValues");
                            jse.e(gto3, "flagRecorder");
                            return bzo4.Z(geo.a, new ezq(bzo5, goi3, 3), hpq2, map, gfk.a, new eia((Object)gfi3, 7, null), new frm(gpm3, 12), aud.f, (gfp)gto3.f());
                        }
                        Object object = this.a;
                        Context context = ((ilt)this.b).a();
                        object = (Executor)object.b();
                        jvb jvb2 = (jvb)this.h.b();
                        jnu jnu2 = this.g;
                        jnu jnu3 = this.f;
                        jnu jnu4 = this.e;
                        return new eie(context, (Executor)object, jvb2, ((ein)this.c).a(), ((gdb)jnu4).a(), ima.c(jnu3), (gpm)jnu2.b(), ((ewk)this.d).a());
                    }
                    jnu jnu5 = this.c;
                    jnu jnu6 = this.f;
                    jnu jnu7 = this.a;
                    jnu jnu8 = this.e;
                    jnu jnu9 = this.b;
                    jnu jnu10 = this.h;
                    jnu jnu11 = this.g;
                    return new gfl(this.d, jnu11, jnu10, jnu9, jnu8, jnu7, jnu6, jnu5, null);
                }
                dli dli2 = (dli)this.b.b();
                jnu jnu12 = this.a;
                jnu jnu13 = this.e;
                jnu jnu14 = this.d;
                jnu jnu15 = this.g;
                jnu jnu16 = this.f;
                jnu jnu17 = this.c;
                return new dra(dli2, this.h, jnu17, jnu16, jnu15, jnu14, jnu13, ima.c(jnu12));
            }
            ((gdt)this.c).a();
            hpq hpq3 = (hpq)this.h.b();
            ezl ezl2 = (ezl)this.b.b();
            ezs ezs2 = (ezs)this.a.b();
            ezk ezk2 = (ezk)this.f.b();
            bmu bmu2 = (bmu)this.d.b();
            jnu jnu18 = this.e;
            return new byu(hpq3, ezl2, ezs2, ezk2, bmu2, ((feq)this.g).a(), (dxi)jnu18.b());
        }
        ThreadFactory threadFactory = (ThreadFactory)this.a.b();
        hpr hpr2 = (hpr)this.b.b();
        n2 = ((gdg)this.c).a();
        cpu cpu2 = ((cqc)this.d).a();
        gto gto4 = (gto)((imc)this.e).a;
        Object object = (gto)((imc)this.f).a;
        Object object2 = (cxt)this.g.b();
        cpz cpz2 = ((cqa)this.h).a();
        object = new cqx("BG", n2, (Boolean)((gto)object).e(false));
        cqz cqz2 = cgw.n((cxt)object2, (cqx)object);
        object2 = ((cqx)object).a;
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyLog();
        builder.detectResourceMismatches();
        ag$$ExternalSyntheticApiModelOutline0.m(builder);
        builder = builder.build();
        return new cos(hhk.E(coy.a(gto4, cgw.k((cqx)object, cpu2, cgw.l((String)object2, new coc(new cod(threadFactory, 2), (StrictMode.ThreadPolicy)builder)), cqz2, cpz2))), hpr2);
    }
}

