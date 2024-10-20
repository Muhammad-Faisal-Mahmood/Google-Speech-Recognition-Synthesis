/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cum
implements hnx {
    public final sk a;
    public final sp b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    private final int h;

    public /* synthetic */ cum(cun cun2, csu csu2, csg csg2, sk sk2, sp sp2, int n2, cvg cvg2, int n3) {
        this.h = n3;
        this.g = cun2;
        this.d = csu2;
        this.e = csg2;
        this.a = sk2;
        this.b = sp2;
        this.c = n2;
        this.f = cvg2;
    }

    public /* synthetic */ cum(cun cun2, csu csu2, sk sk2, sp sp2, int n2, Throwable throwable, cvg cvg2, int n3) {
        this.h = n3;
        this.d = cun2;
        this.e = csu2;
        this.a = sk2;
        this.b = sp2;
        this.c = n2;
        this.f = throwable;
        this.g = cvg2;
    }

    @Override
    public final hpn a() {
        Object object;
        if (this.h != 0) {
            int n2;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            block9: {
                object5 = this.d;
                object4 = (csu)object5;
                object3 = ((csu)object4).g;
                object2 = this.e;
                if (((gto)object3).g()) {
                    try {
                        ((csv)((csu)object5).g.c()).a((csg)object2);
                    }
                    catch (Exception exception) {
                        object2 = ((csg)object2).c;
                        n2 = 1;
                        cyr.o(exception, "%s: Delegate onComplete failed for group %s, showing failure notification.", "DownloadListener", object2);
                        break block9;
                    }
                }
                n2 = 0;
            }
            object2 = this.g;
            if (((csu)object4).j == 2) {
                object3 = this.a;
                ((sk)object3).b.clear();
                if (n2 != 0) {
                    n2 = this.c;
                    object5 = this.b;
                    ((sk)object3).n = "status";
                    ((sk)object3).e(cqq.e(((cun)object2).g.a));
                    ((sk)object3).g(false);
                    ((sk)object3).i(17301642);
                    ((sk)object3).h(0, 0, false);
                    ((sp)object5).a(n2, ((sk)object3).a());
                } else {
                    object3 = ((cun)object2).g;
                    object5 = ((csu)object4).a;
                    new sp((Context)((cuq)object3).a).d.cancel(null, ((String)object5).hashCode());
                }
            }
            object5 = this.f;
            object2 = (cun)object2;
            ((daa)((cun)object2).g.e.c()).i(((csu)object4).a);
            object4 = ((cun)object2).g;
            object2 = (cvg)object5;
            return ((cuq)object4).i.i(((cvg)object2).a);
        }
        Object object6 = this.d;
        Object object7 = (csu)this.e;
        if (((csu)object7).j == 2) {
            int n3 = this.c;
            object = this.b;
            sk sk2 = this.a;
            sk2.b.clear();
            sk2.n = "status";
            sk2.e(cqq.e(((cun)object6).g.a));
            sk2.g(false);
            sk2.i(17301642);
            sk2.h(0, 0, false);
            ((sp)object).a(n3, sk2.a());
        }
        if (((csu)object7).g.g()) {
            object = this.f;
            ((csv)((csu)object7).g.c()).b((Throwable)object);
        }
        object = this.g;
        object6 = (cun)object6;
        ((daa)((cun)object6).g.e.c()).i(((csu)object7).a);
        object7 = ((cun)object6).g;
        object6 = (cvg)object;
        return ((cuq)object7).i.i(((cvg)object6).a);
    }
}

