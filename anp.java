/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class anp
extends amm {
    private final agq d;
    private final alg e;
    private boolean f;
    private long g;
    private boolean h;
    private boolean i;
    private ahl j;
    private aef k;
    private final AmbientMode$AmbientController l;

    public anp(aef aef2, agq agq2, AmbientMode$AmbientController ambientMode$AmbientController, alg alg2) {
        this.k = aef2;
        this.d = agq2;
        this.l = ambientMode$AmbientController;
        this.e = alg2;
        this.f = true;
        this.g = -9223372036854775807L;
    }

    private final void v() {
        long l2 = this.g;
        boolean bl2 = this.h;
        boolean bl3 = this.i;
        Object object = this.C();
        Object object2 = bl3 ? ((aef)object).c : null;
        object2 = object = new any(l2, l2, bl2, (aef)object, (aeb)object2);
        if (this.f) {
            object2 = new ano((aew)object);
        }
        this.i((aew)object2);
    }

    @Override
    public final anb B(anc object, apb apb2, long l2) {
        agr agr2 = this.d.a();
        Object object2 = this.j;
        if (object2 != null) {
            agr2.f((ahl)object2);
        }
        object2 = this.C().b;
        abr.i(object2);
        Object object3 = this.l;
        this.a();
        object3 = new ivu((apr)((AmbientMode$AmbientController)object3).a);
        alg alg2 = this.e;
        dvy dvy2 = this.s((anc)object);
        object = this.r((anc)object);
        return new ann(((aec)object2).a, agr2, (ivu)object3, alg2, dvy2, (dvy)object, this, apb2, agf.i(-9223372036854775807L));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final aef C() {
        synchronized (this) {
            return this.k;
        }
    }

    @Override
    protected final void h(ahl ahl2) {
        this.j = ahl2;
        abr.i(Looper.myLooper());
        this.a();
        this.v();
    }

    @Override
    protected final void k() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(aef aef2) {
        synchronized (this) {
            this.k = aef2;
            return;
        }
    }

    @Override
    public final void t() {
    }

    public final void u(long l2, boolean bl2, boolean bl3) {
        long l3 = l2;
        if (l2 == -9223372036854775807L) {
            l3 = this.g;
        }
        if (!this.f && this.g == l3 && this.h == bl2 && this.i == bl3) {
            return;
        }
        this.g = l3;
        this.h = bl2;
        this.i = bl3;
        this.f = false;
        this.v();
    }

    @Override
    public final void z(anb anb2) {
        anb2 = (ann)anb2;
        if (((ann)anb2).j) {
            for (anu object2 : ((ann)anb2).i) {
                object2.g();
                object2.i();
            }
        }
        aph aph2 = ((ann)anb2).c;
        ape ape2 = aph2.c;
        if (ape2 != null) {
            ape2.a(true);
        }
        aph2.a.execute(new bel((apf)((Object)anb2), 1));
        aph2.b.run();
        ((ann)anb2).f.removeCallbacksAndMessages(null);
        ((ann)anb2).g = null;
        ((ann)anb2).u = true;
    }
}

