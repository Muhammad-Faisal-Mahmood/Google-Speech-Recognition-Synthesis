/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

public final class err
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final int j;

    public err(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, int n2) {
        this.j = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
    }

    public err(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, int n2, byte[] byArray) {
        this.j = n2;
        this.g = jnu2;
        this.b = jnu3;
        this.f = jnu4;
        this.e = jnu5;
        this.a = jnu6;
        this.i = jnu7;
        this.c = jnu8;
        this.d = jnu9;
        this.h = jnu10;
    }

    public err(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, int n2, char[] cArray) {
        this.j = n2;
        this.i = jnu2;
        this.d = jnu3;
        this.c = jnu4;
        this.e = jnu5;
        this.a = jnu6;
        this.h = jnu7;
        this.f = jnu8;
        this.b = jnu9;
        this.g = jnu10;
    }

    public err(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, int n2, int[] nArray) {
        this.j = n2;
        this.d = jnu2;
        this.a = jnu3;
        this.b = jnu4;
        this.f = jnu5;
        this.h = jnu6;
        this.e = jnu7;
        this.g = jnu8;
        this.i = jnu9;
        this.c = jnu10;
    }

    public err(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, int n2, short[] sArray) {
        this.j = n2;
        this.f = jnu2;
        this.d = jnu3;
        this.b = jnu4;
        this.i = jnu5;
        this.c = jnu6;
        this.e = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.a = jnu10;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.j;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        Object object = this.a;
                        Object object2 = this.d.b();
                        object = (cgw)object.b();
                        object = (hpr)this.b.b();
                        gto gto2 = (gto)((imc)this.h).a;
                        gnp gnp2 = gnp.a;
                        idi.m(gnp2);
                        Map map = (Map)((imc)this.e).a;
                        Map map2 = (Map)((imc)this.g).a;
                        gto gto3 = (gto)((imc)this.i).a;
                        gto gto4 = (gto)((imc)this.c).a;
                        return new gqa((gob)object2, (hpr)object, this.f, gto2, gnp2, map, map2, gto3, gto4);
                    }
                    Object object = this.i;
                    Object object3 = this.b;
                    Object object4 = this.d;
                    cya cya2 = ((ffw)this.f).a();
                    object4 = ((fei)object4).a();
                    object3 = ((gdt)object3).a();
                    bmu bmu2 = (bmu)object.b();
                    Object object5 = this.c.b();
                    fhq fhq2 = new fhq();
                    hpr hpr2 = (hpr)this.e.b();
                    object = (frr)this.g.b();
                    Object object6 = this.a;
                    cxt cxt2 = ((fmk)this.h).a();
                    object6 = (cgw)object6.b();
                    return new flr(cya2, (feh)object4, (fxf)object3, bmu2, (gpm)object5, fhq2, hpr2, (frr)object, cxt2, (cgw)object6);
                }
                cqq cqq2 = (cqq)this.i.b();
                Object object = this.c;
                czh czh2 = ((end)this.d).a();
                object = (dtu)object.b();
                jnu jnu2 = this.f;
                jnu jnu3 = this.h;
                jnu jnu4 = this.a;
                return new euc(cqq2, czh2, (dtu)object, ((etk)this.e).a(), ((ete)jnu4).a(), ((eqf)jnu3).a(), (Executor)jnu2.b(), (hou)this.b.b(), ((eto)this.g).a());
            }
            Object object = this.f;
            jnu jnu5 = this.b;
            dmu dmu2 = ((dmv)this.g).a();
            jnu5 = ((ilt)jnu5).a();
            object = (dli)object.b();
            hpr hpr3 = (hpr)this.e.b();
            Object object7 = this.d;
            Object object8 = this.i;
            iku iku2 = ima.c(this.a);
            object8 = ima.c((jnu)object8);
            Executor executor = (Executor)object7.b();
            object7 = (cxu)this.h.b();
            return new dqp(dmu2, (Context)jnu5, (dli)object, hpr3, iku2, (iku)object8, this.c, executor, (cxu)object7);
        }
        ((gdb)this.a).a();
        dml dml2 = (dml)this.b.b();
        dtu dtu2 = (dtu)this.c.b();
        Object object = this.e;
        Context context = ((ilt)this.d).a();
        Executor executor = (Executor)object.b();
        object = (jvb)this.f.b();
        jqf jqf2 = (jqf)this.g.b();
        ((eru)this.h).a();
        return new erq(dml2, dtu2, context, executor, (jvb)object, jqf2, ((ewk)this.i).a());
    }
}

