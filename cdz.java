/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class cdz
implements cex {
    public final ccp a;
    public final cdj b;
    public Set c;
    public boolean d;
    public final cea e;
    public cfs f;

    public cdz(cea cea2, ccp ccp2, cdj cdj2) {
        this.e = cea2;
        this.f = null;
        this.c = null;
        this.d = false;
        this.a = ccp2;
        this.b = cdj2;
    }

    @Override
    public final void a(cbk object) {
        object = new aks(this, (cbk)object, 19);
        this.e.m.post((Runnable)object);
    }

    public final void b(cbk cbk2) {
        cdx cdx2 = (cdx)this.e.j.get(this.b);
        if (cdx2 != null) {
            cdx2.l(cbk2);
        }
    }

    public final void c() {
        cfs cfs2;
        if (this.d && (cfs2 = this.f) != null) {
            this.a.p(cfs2, this.c);
        }
    }
}

