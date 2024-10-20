/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 *  hom
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class frr {
    public final String a;
    public final gbq b;
    public final Object c;
    public final gnt d;
    public List e;
    public final frp f;
    private final hpn g;
    private final hou h;
    private final gbq i = new gbq(new frq(this), (Executor)hom.a);

    public frr(frp frp2, hpn hpn2, boolean bl2) {
        this.c = new Object();
        this.e = new ArrayList();
        this.f = frp2;
        this.g = hpn2;
        this.a = frp2.a;
        this.b = new gbq(new frn(frp2, 1), (Executor)hom.a);
        this.h = new hou();
        this.d = bl2 ? new gns() : new gnr();
        this.c(new frm(this, 4));
    }

    public final hpn a() {
        gol gol2;
        hpn hpn2;
        this.d.b();
        guh.b(gsd.a);
        if (this.i.e()) {
            hpn2 = this.f.a();
        } else {
            gol2 = this.d.a("Get ".concat(String.valueOf(this.a)), gqv.a);
            hpn2 = this.i.c();
            frm frm2 = new frm(this, 5);
            hpn2 = hno.g(hpn2, gqk.d(frm2), (Executor)hom.a);
            gol2.a(hpn2);
        }
        hhk.L(this.g);
        return hhk.L(hpn2);
        finally {
            gol2.close();
        }
    }

    public final hpn b(gte object, Executor object2) {
        hny hny2 = gqk.d(new frm(object, 3));
        guh.b(gsd.a);
        object = String.valueOf(this.a);
        object = this.d.a("Update ".concat((String)object), gqv.a);
        try {
            hpn hpn2 = this.i.c();
            hou hou2 = this.h;
            hnx hnx2 = new frn(hpn2, 2);
            hou2.b(hnx2, (Executor)hom.a);
            hou2 = this.h;
            hnx2 = new cvt((Object)this, hpn2, hny2, (Executor)object2, 9);
            object2 = hou2.b(gqk.c(hnx2), (Executor)hom.a);
            hhk.V((hpn)object2, hpn2);
            hhk.L(this.g);
            object2 = fvc.G((hpn)object2);
            ((gol)object).a((hpn)object2);
            return object2;
        }
        finally {
            ((gol)object).close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(hny hny2) {
        Object object = this.c;
        synchronized (object) {
            this.e.add(hny2);
            return;
        }
    }
}

