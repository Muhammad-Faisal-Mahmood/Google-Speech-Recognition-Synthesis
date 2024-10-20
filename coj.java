/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode$ThreadPolicy
 */
import android.content.Context;
import android.os.StrictMode;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class coj
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final int h;

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2) {
        this.h = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, byte[] byArray) {
        this.h = n2;
        this.e = jnu2;
        this.d = jnu3;
        this.g = jnu4;
        this.a = jnu5;
        this.b = jnu6;
        this.f = jnu7;
        this.c = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, char[] cArray) {
        this.h = n2;
        this.e = jnu2;
        this.a = jnu3;
        this.c = jnu4;
        this.b = jnu5;
        this.d = jnu6;
        this.g = jnu7;
        this.f = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, float[] fArray) {
        this.h = n2;
        this.c = jnu2;
        this.f = jnu3;
        this.d = jnu4;
        this.g = jnu5;
        this.a = jnu6;
        this.e = jnu7;
        this.b = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, int[] nArray) {
        this.h = n2;
        this.g = jnu2;
        this.e = jnu3;
        this.a = jnu4;
        this.b = jnu5;
        this.d = jnu6;
        this.c = jnu7;
        this.f = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, short[] sArray) {
        this.h = n2;
        this.g = jnu2;
        this.d = jnu3;
        this.a = jnu4;
        this.b = jnu5;
        this.c = jnu6;
        this.e = jnu7;
        this.f = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, boolean[] blArray) {
        this.h = n2;
        this.g = jnu2;
        this.b = jnu3;
        this.a = jnu4;
        this.c = jnu5;
        this.d = jnu6;
        this.f = jnu7;
        this.e = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, byte[][] byArray) {
        this.h = n2;
        this.e = jnu2;
        this.a = jnu3;
        this.c = jnu4;
        this.b = jnu5;
        this.f = jnu6;
        this.g = jnu7;
        this.d = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, char[][] cArray) {
        this.h = n2;
        this.b = jnu2;
        this.e = jnu3;
        this.d = jnu4;
        this.g = jnu5;
        this.a = jnu6;
        this.f = jnu7;
        this.c = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, int[][] nArray) {
        this.h = n2;
        this.b = jnu2;
        this.e = jnu3;
        this.a = jnu4;
        this.c = jnu5;
        this.f = jnu6;
        this.d = jnu7;
        this.g = jnu8;
    }

    public coj(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, int n2, short[][] sArray) {
        this.h = n2;
        this.d = jnu2;
        this.c = jnu3;
        this.f = jnu4;
        this.e = jnu5;
        this.g = jnu6;
        this.a = jnu7;
        this.b = jnu8;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.h) {
            default: {
                return new gqu((gto)((imc)this.b).a, (gto)((imc)this.e).a, (gto)((imc)this.a).a, (gto)((imc)this.c).a, (Set)((imc)this.f).a, (gto)((imc)this.d).a, (gto)((imc)this.g).a);
            }
            case 9: {
                Object object = this.c;
                Context context = ((ilt)this.d).a();
                object = (gcp)object.b();
                Object object2 = this.e;
                Map map = ((ime)this.f).a();
                Executor executor = (Executor)object2.b();
                object2 = ((imc)this.a).a;
                return new gcv(context, (gcp)object, map, executor, ((bqw)this.g).a(), (gto)object2, ((gcy)this.b).a());
            }
            case 8: {
                hth hth2 = (hth)this.e.b();
                frr frr2 = (frr)this.d.b();
                cgw cgw2 = (cgw)this.g.b();
                int n2 = ((gdg)this.f).a();
                Executor executor = (Executor)this.c.b();
                jnu jnu2 = this.a;
                return new fzp(this.b, hth2, frr2, cgw2, jnu2, n2, executor);
            }
            case 7: {
                jnu jnu3 = this.d;
                jnu jnu4 = this.g;
                jnu jnu5 = this.f;
                jnu jnu6 = this.b;
                jnu jnu7 = this.c;
                jnu jnu8 = this.a;
                return new gcv(this.e, jnu8, jnu7, jnu6, jnu5, jnu4, jnu3);
            }
            case 6: {
                jnu jnu9 = this.f;
                return new faa(((fba)this.c).a(), (fbm)jnu9.b(), (Optional)((imc)this.d).a, (hpq)this.g.b(), (ezu)this.a.b(), (dxi)this.e.b(), ((imr)this.b).a());
            }
            case 5: {
                cqq cqq2 = (cqq)this.g.b();
                ekg ekg2 = (ekg)this.b.b();
                jnu jnu10 = this.d;
                Object object = this.c;
                eqe eqe2 = ((eud)this.a).a();
                object = ((eqf)object).a();
                ((end)jnu10).a();
                return new czh(cqq2, ekg2, eqe2, (eqe)object, (est)this.f.b(), (egs)this.e.b());
            }
            case 4: {
                Object object = this.a;
                jnu jnu11 = this.e;
                dmu dmu2 = ((dmv)this.g).a();
                jnu11 = ((ilt)jnu11).a();
                object = (dli)object.b();
                Executor executor = (Executor)this.b.b();
                jnu jnu12 = this.c;
                return new drh(dmu2, (Context)jnu11, (dli)object, executor, ima.c(this.d), ((dsi)jnu12).a(), this.f);
            }
            case 3: {
                Object object = this.a;
                jnu jnu13 = this.d;
                dmu dmu3 = ((dmv)this.g).a();
                jnu13 = ((ilt)jnu13).a();
                hpr hpr2 = (hpr)object.b();
                Object object3 = this.e;
                object = ima.c(this.b);
                object3 = (cgw)object3.b();
                object3 = this.f;
                return new dnc(dmu3, (Context)jnu13, hpr2, (iku)object, this.c, (jnu)object3);
            }
            case 2: {
                Object object = this.a;
                Object object4 = ((ilt)this.e).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)object.b();
                object = (bmu)this.c.b();
                Object object5 = ((imc)this.d).a;
                iku iku2 = ima.c(this.b);
                object5 = (gto)object5;
                Object object6 = this.f;
                gto gto2 = ((bqw)this.g).a();
                object6 = (cqq)object6.b();
                object4 = fvd.ap(new gfd(scheduledExecutorService, iku2, (Context)object4, gto2, (bmu)object, (gto)object5, 1));
                idi.m(object4);
                return object4;
            }
            case 1: {
                return new cmn(((ilt)this.e).a(), (hpq)this.d.b(), (hpr)this.g.b(), ((bqx)this.a).a(), (Optional)((imc)this.b).a, (Optional)((imc)this.f).a, ((bqx)this.c).a());
            }
            case 0: 
        }
        ThreadFactory threadFactory = (ThreadFactory)this.a.b();
        hpr hpr3 = (hpr)this.b.b();
        int n3 = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
        Integer.valueOf(n3).getClass();
        cpu cpu2 = ((cqc)this.c).a();
        gto gto3 = (gto)((imc)this.d).a;
        Object object = (gto)((imc)this.e).a;
        cxt cxt2 = (cxt)this.f.b();
        cpz cpz2 = ((cok)this.g).a();
        object = new cqx("Lite", n3, (Boolean)((gto)object).e(false));
        cqz cqz2 = cgw.n(cxt2, (cqx)object);
        String string = ((cqx)object).a;
        cxt2 = cgw.i();
        return new cos(hhk.E(coy.a(gto3, cgw.k((cqx)object, cpu2, cgw.l(string, new coc(new cod(threadFactory, 2), (StrictMode.ThreadPolicy)cxt2)), cqz2, cpz2))), hpr3);
    }
}

