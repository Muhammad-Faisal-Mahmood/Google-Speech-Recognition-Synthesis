/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Optional;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

public final class dqa
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final int g;

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2) {
        this.g = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, byte[] byArray) {
        this.g = n2;
        this.d = jnu2;
        this.f = jnu3;
        this.e = jnu4;
        this.c = jnu5;
        this.a = jnu6;
        this.b = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, char[] cArray) {
        this.g = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.f = jnu4;
        this.a = jnu5;
        this.e = jnu6;
        this.b = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, float[] fArray) {
        this.g = n2;
        this.c = jnu2;
        this.f = jnu3;
        this.d = jnu4;
        this.a = jnu5;
        this.b = jnu6;
        this.e = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, int[] nArray) {
        this.g = n2;
        this.c = jnu2;
        this.d = jnu3;
        this.e = jnu4;
        this.f = jnu5;
        this.a = jnu6;
        this.b = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, short[] sArray) {
        this.g = n2;
        this.b = jnu2;
        this.d = jnu3;
        this.f = jnu4;
        this.c = jnu5;
        this.e = jnu6;
        this.a = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, boolean[] blArray) {
        this.g = n2;
        this.f = jnu2;
        this.d = jnu3;
        this.b = jnu4;
        this.c = jnu5;
        this.a = jnu6;
        this.e = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, byte[][] byArray) {
        this.g = n2;
        this.f = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.a = jnu6;
        this.e = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, char[][] cArray) {
        this.g = n2;
        this.c = jnu2;
        this.b = jnu3;
        this.d = jnu4;
        this.e = jnu5;
        this.f = jnu6;
        this.a = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, float[][] fArray) {
        this.g = n2;
        this.a = jnu2;
        this.d = jnu3;
        this.f = jnu4;
        this.c = jnu5;
        this.e = jnu6;
        this.b = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, int[][] nArray) {
        this.g = n2;
        this.e = jnu2;
        this.f = jnu3;
        this.b = jnu4;
        this.c = jnu5;
        this.d = jnu6;
        this.a = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, short[][] sArray) {
        this.g = n2;
        this.a = jnu2;
        this.e = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.b = jnu6;
        this.f = jnu7;
    }

    public dqa(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, int n2, boolean[][] blArray) {
        this.g = n2;
        this.b = jnu2;
        this.d = jnu3;
        this.c = jnu4;
        this.a = jnu5;
        this.f = jnu6;
        this.e = jnu7;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.g) {
            default: {
                Object object = this.d;
                Context context = ((ilt)this.a).a();
                hpq hpq2 = (hpq)object.b();
                gto gto2 = (gto)((imc)this.f).a;
                gto gto3 = (gto)((imc)this.c).a;
                Object object2 = this.b;
                object = ((dwy)this.e).a();
                object2 = (cgw)object2.b();
                return new gky(context, hpq2, gto2, gto3, (dtu)object);
            }
            case 11: {
                ((dwy)this.b).a();
                Optional optional = (Optional)((imc)this.d).a;
                Optional optional2 = (Optional)((imc)this.c).a;
                jnu jnu2 = this.e;
                jnu jnu3 = this.f;
                return new ghg(optional, optional2, this.a, jnu3, jnu2);
            }
            case 10: {
                Object object = this.b;
                iku iku2 = ima.c(this.e);
                object = (ezu)object.b();
                ezk ezk2 = (ezk)this.c.b();
                Object object3 = this.a;
                Context context = ((ilt)this.d).a();
                object3 = (hpq)object3.b();
                return new fbj(iku2, this.f, (ezu)object, ezk2, context, (hpq)object3);
            }
            case 9: {
                ezl ezl2 = (ezl)this.a.b();
                ezu ezu2 = (ezu)this.e.b();
                jnu jnu4 = this.d;
                return new ezs(ezl2, ezu2, ((ilt)this.c).a(), (dxi)jnu4.b(), ((imr)this.b).a(), (hpq)this.f.b());
            }
            case 8: {
                czh czh2 = (czh)this.c.b();
                Executor executor = (Executor)this.b.b();
                jnu jnu5 = this.a;
                jnu jnu6 = this.f;
                jnu jnu7 = this.e;
                return new euu(czh2, executor, ((eob)this.d).a(), ((evj)jnu7).a(), ((evm)jnu6).a(), ((eux)jnu5).a());
            }
            case 7: {
                Map map = (Map)((imc)this.f).a;
                euf euf2 = (euf)this.b.b();
                egs egs2 = (egs)this.c.b();
                jnu jnu8 = this.a;
                return new esv(map, euf2, egs2, ((end)this.d).a(), ((imr)jnu8).a(), ((imr)this.e).a());
            }
            case 6: {
                evo evo2 = (evo)this.c.b();
                jnu jnu9 = this.d;
                return new czh(evo2, ((ene)this.f).a(), (eml)jnu9.b(), (cgw)this.a.b(), (crh)this.b.b(), (jvb)this.e.b());
            }
            case 5: {
                dtu dtu2 = (dtu)this.f.b();
                jnu jnu10 = this.b;
                dtu dtu3 = ((ekb)this.d).a();
                ((eks)jnu10).a();
                jnu10 = this.e;
                jnu jnu11 = this.a;
                return new ekg(dtu2, dtu3, ((end)this.c).a(), ((eud)jnu11).a(), ((eqf)jnu10).a());
            }
            case 4: {
                Object object = this.d;
                dmu dmu2 = ((dmv)this.c).a();
                hpr hpr2 = (hpr)object.b();
                Object object4 = this.b;
                Object object5 = this.f;
                object = ima.c(this.e);
                object5 = ima.c((jnu)object5);
                object4 = ((dsk)object4).a();
                return new dsc(dmu2, hpr2, (iku)object, (iku)object5, this.a, (dml)object4);
            }
            case 3: {
                Object object = this.d;
                dmu dmu3 = ((dmv)this.b).a();
                Executor executor = (Executor)object.b();
                Object object6 = this.a;
                Object object7 = this.c;
                object = ima.c(this.f);
                object7 = ima.c((jnu)object7);
                object6 = ((dsk)object6).a();
                return new drr(dmu3, executor, (iku)object, (iku)object7, this.e, (dml)object6);
            }
            case 2: {
                jnu jnu12 = this.e;
                Context context = ((ilt)this.d).a();
                cxu cxu2 = (cxu)jnu12.b();
                bmu bmu2 = ((dlf)this.b).a();
                jnu jnu13 = this.a;
                jnu12 = this.f;
                return new dqi(this.c, context, jnu12, jnu13, cxu2, bmu2);
            }
            case 1: {
                ((ilt)this.d).a();
                Object object = (cqq)this.f.b();
                cuv cuv2 = (cuv)this.e.b();
                object = (frr)this.c.b();
                Executor executor = (Executor)this.a.b();
                cqq cqq2 = (cqq)this.b.b();
                return new cxa(cuv2, (frr)object, executor);
            }
            case 0: 
        }
        dli dli2 = (dli)this.a.b();
        hpr hpr3 = (hpr)this.b.b();
        Executor executor = (Executor)this.c.b();
        Object object = this.e;
        iku iku3 = ima.c(this.d);
        ima.c((jnu)object);
        object = (Random)this.f.b();
        return new dpz(dli2, hpr3, executor, iku3);
    }
}

