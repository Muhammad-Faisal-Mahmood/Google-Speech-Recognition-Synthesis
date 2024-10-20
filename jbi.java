/*
 * Decompiled with CFR 0.152.
 */
public abstract class jbi
implements jbl,
jgg {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private boolean f;
    public jcx j;
    public final Object k = new Object();
    public final jjv l;
    public final jgj m;
    public int n;
    public boolean o;
    public final jjo p;
    public jcl q;
    public iuw r;
    public volatile boolean s;
    public boolean t;

    protected jbi(int n2, jjo jjo2, jjv object) {
        this.l = object;
        this.m = object = new jgj(this, iud.a, n2, jjo2, (jjv)object);
        this.j = object;
        this.b = 32768;
        this.r = iuw.b;
        this.d = false;
        this.p = jjo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void c() {
        Object object = this.k;
        // MONITORENTER : object
        boolean bl2 = this.i();
        // MONITOREXIT : object
        if (!bl2) return;
        this.q.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void d() {
        boolean bl2 = this.q != null;
        fxf.A(bl2);
        Object object = this.k;
        synchronized (object) {
            fxf.B(this.a ^ true, "Already allocated");
            this.a = true;
        }
        this.c();
    }

    @Override
    public final void g(jjq jjq2) {
        this.q.d(jjq2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(int n2) {
        int n3;
        int n4;
        Object object = this.k;
        // MONITORENTER : object
        fxf.B(this.a, "onStreamAllocated was not called, but it seems the stream is active");
        int n5 = this.n;
        int n6 = this.b;
        this.n = n4 = n5 - n2;
        n2 = n3 = 0;
        if (n5 >= n6) {
            n2 = n3;
            if (n4 < n6) {
                n2 = 1;
            }
        }
        // MONITOREXIT : object
        if (n2 == 0) return;
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i() {
        Object object = this.k;
        synchronized (object) {
            boolean bl2;
            boolean bl3 = this.a;
            boolean bl4 = bl2 = false;
            if (!bl3) return bl4;
            bl4 = bl2;
            if (this.n >= this.b) return bl4;
            bl4 = bl2;
            if (this.o) return bl4;
            return true;
        }
    }

    public final void j(iyh iyh2, jck jck2, iwx iwx2) {
        if (!this.c) {
            this.c = true;
            this.p.h();
            jjv jjv2 = this.l;
            if (iyh2.g()) {
                ++jjv2.c;
            } else {
                ++jjv2.d;
            }
            this.q.a(iyh2, jck2, iwx2);
        }
    }

    @Override
    public void k(boolean bl2) {
        Runnable runnable;
        fxf.B(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if (this.f && bl2) {
            this.l(iyh.j.e("Encountered end-of-stream mid-frame"), true, new iwx());
        }
        if ((runnable = this.e) != null) {
            runnable.run();
            this.e = null;
        }
    }

    public final void l(iyh iyh2, boolean bl2, iwx iwx2) {
        this.m(iyh2, jck.a, bl2, iwx2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m(iyh object, jck jck2, boolean bl2, iwx iwx2) {
        a.s(object, "status");
        a.s(iwx2, "trailers");
        boolean bl3 = bl2;
        if (this.t) {
            if (!bl2) return;
            bl3 = true;
        }
        this.t = true;
        this.f = ((iyh)object).g();
        Object object2 = this.k;
        // MONITORENTER : object2
        this.o = true;
        // MONITOREXIT : object2
        if (this.d) {
            this.e = null;
            this.j((iyh)object, jck2, iwx2);
            return;
        }
        this.e = new ww(this, (iyh)object, jck2, iwx2, 11);
        if (bl3) {
            this.j.close();
            return;
        }
        object = (jgj)this.j;
        if (((jgj)object).b()) {
            return;
        }
        if (((jgj)object).c()) {
            ((jgj)object).close();
            return;
        }
        ((jgj)object).f = true;
    }
}

