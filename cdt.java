/*
 * Decompiled with CFR 0.152.
 */
public final class cdt
extends cdo {
    public final ov e = new ov();
    private final cea g;

    public cdt(ced ced2, cea cea2) {
        super(ced2, cbo.a);
        this.g = cea2;
        this.f.b(this);
    }

    @Override
    protected final void e(cbk cbk2, int n2) {
        this.g.d(cbk2, n2);
    }

    @Override
    protected final void f() {
        this.g.e();
    }

    @Override
    public final void h() {
        this.k();
    }

    @Override
    public final void i() {
        this.a = true;
        this.k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void j() {
        this.a = false;
        Object object = cea.c;
        cea cea2 = this.g;
        synchronized (object) {
            if (cea2.k == this) {
                cea2.k = null;
                cea2.l.clear();
            }
            return;
        }
    }

    public final void k() {
        if (!this.e.isEmpty()) {
            this.g.f(this);
        }
    }
}

