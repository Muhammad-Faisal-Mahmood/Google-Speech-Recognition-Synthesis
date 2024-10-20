/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class etx
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
    private final jnu k;
    private final jnu l;
    private final jnu m;
    private final int n;

    public etx(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, jnu jnu12, jnu jnu13, jnu jnu14, int n2) {
        this.n = n2;
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
        this.k = jnu12;
        this.l = jnu13;
        this.m = jnu14;
    }

    public etx(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, jnu jnu12, jnu jnu13, jnu jnu14, int n2, byte[] byArray) {
        this.n = n2;
        this.b = jnu2;
        this.a = jnu3;
        this.d = jnu4;
        this.k = jnu5;
        this.l = jnu6;
        this.c = jnu7;
        this.g = jnu8;
        this.j = jnu9;
        this.i = jnu10;
        this.h = jnu11;
        this.e = jnu12;
        this.f = jnu13;
        this.m = jnu14;
    }

    @Override
    public final /* synthetic */ Object b() {
        if (this.n != 0) {
            cqq cqq2 = (cqq)this.b.b();
            emj emj2 = (emj)this.a.b();
            enu enu2 = (enu)this.d.b();
            Object object = this.c;
            Object object2 = this.l;
            czh czh2 = ((end)this.k).a();
            object2 = ((eqc)object2).a();
            dtu dtu2 = (dtu)object.b();
            Object object3 = this.j;
            object = ((equ)this.g).a();
            jvb jvb2 = (jvb)object3.b();
            boolean bl2 = ((imr)this.i).a();
            elp elp2 = (elp)this.h.b();
            ((eoa)this.e).a();
            object3 = (cqq)((imc)this.f).a;
            ((eny)this.m).a();
            return new epm(cqq2, emj2, enu2, czh2, (czh)object2, dtu2, (eqe)object, jvb2, bl2, elp2, (cqq)object3);
        }
        cqq cqq3 = (cqq)this.a.b();
        Object object = this.c;
        czh czh3 = ((end)this.b).a();
        dtu dtu3 = (dtu)object.b();
        jnu jnu2 = this.i;
        Object object4 = this.h;
        Object object5 = this.g;
        Object object6 = this.f;
        Object object7 = this.e;
        object = ((etg)this.d).a();
        object7 = ((ete)object7).a();
        object6 = ((eig)object6).a();
        object5 = ((eqf)object5).a();
        object4 = ((equ)object4).a();
        dpg dpg2 = (dpg)jnu2.b();
        Executor executor = (Executor)this.j.b();
        hou hou2 = (hou)this.k.b();
        jnu2 = this.m;
        return new etw(cqq3, czh3, dtu3, (bzo)object, (eqe)object7, (czh)object6, (eqe)object5, (eqe)object4, dpg2, executor, hou2, ((eto)this.l).a(), ((imr)jnu2).a());
    }
}

