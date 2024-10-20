/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class jbg
extends jbj
implements jcj,
jgm {
    public static final Logger q = Logger.getLogger(jbg.class.getName());
    private iwx a;
    private volatile boolean b;
    private final jgn c;
    public final jjv r;
    public final boolean s;

    protected jbg(jjx jjx2, jjo jjo2, jjv jjv2, iwx iwx2, itw itw2) {
        a.s(iwx2, "headers");
        a.s(jjv2, "transportTracer");
        this.r = jjv2;
        this.s = jeb.i(itw2);
        this.c = new jgn(this, jjx2, jjo2);
        this.a = iwx2;
    }

    @Override
    public final void b(jeh jeh2) {
        jeh2.b("remote_addr", this.a().a(ivd.a));
    }

    @Override
    public final void c(iyh iyh2) {
        fxf.r(iyh2.g() ^ true, "Should not cancel with OK status");
        this.b = true;
        this.p().a(iyh2);
    }

    @Override
    public final void e() {
        if (!this.t().s) {
            this.t().s = true;
            ((jbj)this).v().b();
        }
    }

    @Override
    public final void i(iut iut2) {
        this.a.e(jeb.b);
        long l2 = Math.max(0L, iut2.b(TimeUnit.NANOSECONDS));
        this.a.g(jeb.b, l2);
    }

    @Override
    public final void j(iuw iuw2) {
        jbi jbi2 = this.t();
        boolean bl2 = jbi2.q == null;
        fxf.B(bl2, "Already called start");
        a.s(iuw2, "decompressorRegistry");
        jbi2.r = iuw2;
    }

    @Override
    public final void k(int n2) {
        ((jgj)this.t().j).b = n2;
    }

    @Override
    public final void l(int n2) {
        jgn jgn2 = this.c;
        boolean bl2 = jgn2.a == -1;
        fxf.B(bl2, "max size already set");
        jgn2.a = n2;
    }

    @Override
    public final void m(jcl jcl2) {
        jbi jbi2 = this.t();
        boolean bl2 = jbi2.q == null;
        fxf.B(bl2, "Already called setListener");
        jbi2.q = jcl2;
        this.p().c(this.a);
        this.a = null;
    }

    @Override
    public final boolean o() {
        return ((jbj)this).q().i() && !this.b;
    }

    protected abstract jbf p();

    protected abstract jbi t();

    @Override
    public final void u(jjw jjw2, boolean bl2, boolean bl3, int n2) {
        boolean bl4;
        boolean bl5 = bl4 = true;
        if (jjw2 == null) {
            bl5 = bl2 ? bl4 : false;
        }
        fxf.r(bl5, "null frame before EOS");
        this.p().b(jjw2, bl2, bl3, n2);
    }

    @Override
    protected final jgn v() {
        return this.c;
    }
}

