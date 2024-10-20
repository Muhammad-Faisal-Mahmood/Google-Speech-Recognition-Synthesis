/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;

public class aod
extends ams {
    protected final ane h;

    protected aod(ane ane2) {
        this.h = ane2;
    }

    @Override
    public anb B(anc anc2, apb apb2, long l2) {
        throw null;
    }

    @Override
    public final aef C() {
        return this.h.C();
    }

    protected final void D() {
        abr.d(this.d.containsKey(null) ^ true);
        amq amq2 = new amq(this, 0);
        amr amr2 = new amr(this);
        ane ane2 = this.h;
        bmu bmu2 = new bmu(ane2, amq2, amr2);
        this.d.put(null, bmu2);
        bmu2 = this.e;
        abr.i(bmu2);
        ane2.b((Handler)bmu2, amr2);
        abr.i(this.e);
        ane2.q(amr2);
        ane2.g(amq2, this.f, this.a());
        if (!this.a.isEmpty()) {
            return;
        }
        ane2.c(amq2);
    }

    @Override
    protected final void h(ahl ahl2) {
        this.f = ahl2;
        this.e = agf.n();
        this.y();
    }

    @Override
    public final void o() {
        this.h.o();
    }

    @Override
    public final void p() {
        this.h.p();
    }

    @Override
    protected final /* synthetic */ anc u(anc anc2) {
        return this.w(anc2);
    }

    @Override
    protected final /* synthetic */ void v(aew aew2) {
        this.x(aew2);
    }

    protected anc w(anc anc2) {
        throw null;
    }

    protected void x(aew aew2) {
        throw null;
    }

    protected void y() {
        throw null;
    }

    @Override
    public void z(anb anb2) {
        throw null;
    }
}

