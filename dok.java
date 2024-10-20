/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class dok
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
    private final jnu j;
    private final int k;

    public dok(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, int n2) {
        this.k = n2;
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
    }

    public dok(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, int n2, byte[] byArray) {
        this.k = n2;
        this.g = jnu2;
        this.i = jnu3;
        this.h = jnu4;
        this.j = jnu5;
        this.c = jnu6;
        this.d = jnu7;
        this.e = jnu8;
        this.f = jnu9;
        this.a = jnu10;
        this.b = jnu11;
    }

    public dok(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, int n2, char[] cArray) {
        this.k = n2;
        this.i = jnu2;
        this.c = jnu3;
        this.f = jnu4;
        this.h = jnu5;
        this.j = jnu6;
        this.e = jnu7;
        this.g = jnu8;
        this.b = jnu9;
        this.d = jnu10;
        this.a = jnu11;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.k;
        if (n2 != 0) {
            if (n2 != 1) {
                cqq cqq2 = (cqq)this.i.b();
                emj emj2 = (emj)this.c.b();
                enu enu2 = (enu)this.f.b();
                Object object = this.e;
                Object object2 = this.j;
                czh czh2 = ((end)this.h).a();
                object2 = ((eqc)object2).a();
                object = (dtu)object.b();
                jnu jnu2 = this.b;
                return new epw(cqq2, emj2, enu2, czh2, (czh)object2, (dtu)object, ((equ)this.g).a(), (jvb)jnu2.b(), ((imr)this.d).a(), (elp)this.a.b());
            }
            Object object = this.h;
            jnu jnu3 = this.i;
            dmu dmu2 = ((dmv)this.g).a();
            jnu3 = ((ilt)jnu3).a();
            object = (dlm)object.b();
            dli dli2 = (dli)this.j.b();
            hpr hpr2 = (hpr)this.c.b();
            Object object3 = this.b;
            Object object4 = this.e;
            iku iku2 = ima.c(this.d);
            object4 = ((dmm)object4).a();
            object3 = (Executor)object3.b();
            jnu jnu4 = this.a;
            return new dma(dmu2, (Context)jnu3, (dlm)object, dli2, hpr2, iku2, (dml)object4, this.f, jnu4, (Executor)object3);
        }
        Object object = this.c;
        jnu jnu5 = this.b;
        dmu dmu3 = ((dmv)this.a).a();
        jnu5 = ((ilt)jnu5).a();
        Executor executor = (Executor)object.b();
        jnu jnu6 = this.g;
        Object object5 = this.f;
        object = ((dob)this.d).a();
        object5 = ima.c((jnu)object5);
        dkn dkn2 = ((dkq)jnu6).a();
        jnu6 = this.j;
        jnu jnu7 = this.i;
        jnu jnu8 = this.h;
        return new doj(dmu3, (Context)jnu5, executor, (dny)object, this.e, (iku)object5, dkn2, jnu8, jnu7, jnu6);
    }
}

