/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public abstract class aid
implements ajw,
ajx {
    public int a;
    public anv b;
    public long c;
    public long d;
    public boolean e;
    private final Object f = new Object();
    private ajy g;
    private int h;
    private akr i;
    private afl j;
    private adu[] k;
    private long l;
    private boolean m;
    private aew n;
    private final arq o = new arq();

    public aid() {
        this.l = Long.MIN_VALUE;
        this.n = aew.a;
    }

    private final void U(long l2) {
        this.e = false;
        this.d = l2;
        this.l = l2;
        this.E(l2);
    }

    @Override
    public final boolean A() {
        return this.l == Long.MIN_VALUE;
    }

    @Override
    public final boolean B() {
        return this.e;
    }

    protected final adu[] C() {
        adu[] aduArray = this.k;
        abr.i(aduArray);
        return aduArray;
    }

    protected void D() {
    }

    protected void E(long l2) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void F() {
        Object object = this.f;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    @Override
    public /* synthetic */ void G(float f2) {
    }

    protected final void H() {
        abr.i(this.j);
    }

    protected final void I() {
        abr.i(this.g);
    }

    @Override
    public final void J() {
    }

    protected void K(long l2) {
    }

    @Override
    public final void L(adu[] aduArray, anv anv2, long l2, long l3) {
        abr.f(this.e ^ true);
        this.b = anv2;
        if (this.l == Long.MIN_VALUE) {
            this.l = l2;
        }
        this.k = aduArray;
        this.c = l3;
        this.K(l3);
    }

    @Override
    public final void M(ajy ajy2, adu[] aduArray, anv anv2, long l2, long l3) {
        boolean bl2 = this.a == 0;
        abr.f(bl2);
        this.g = ajy2;
        this.a = 1;
        this.D();
        this.L(aduArray, anv2, l2, l3);
        this.U(l2);
    }

    protected final int N(arq arq2, ahx object, int n2) {
        anv anv2 = this.b;
        abr.i(anv2);
        n2 = anv2.d(arq2, (ahx)object, n2);
        if (n2 == -4) {
            long l2;
            if (((aht)object).isEndOfStream()) {
                this.l = Long.MIN_VALUE;
                if (this.e) {
                    return -4;
                }
                return -3;
            }
            ((ahx)object).e = l2 = ((ahx)object).e + this.c;
            this.l = Math.max(this.l, l2);
        } else if (n2 == -5) {
            object = arq2.a;
            abr.i(object);
            long l3 = ((adu)object).t;
            if (l3 != Long.MAX_VALUE) {
                object = new adt((adu)object);
                ((adt)object).r = l3 + this.c;
                arq2.a = new adu((adt)object);
                return -5;
            }
        }
        return n2;
    }

    protected final arq O() {
        this.o.a();
        return this.o;
    }

    @Override
    public int aC() {
        return 0;
    }

    @Override
    public final int aD() {
        return this.a;
    }

    @Override
    public final long aE() {
        return this.l;
    }

    protected final ail d(Throwable throwable, adu adu2, int n2) {
        return this.e(throwable, adu2, false, n2);
    }

    protected final ail e(Throwable throwable, adu adu2, boolean bl2, int n2) {
        int n3;
        block6: {
            if (adu2 != null && !this.m) {
                this.m = true;
                try {
                    n3 = vy.j(this.T(adu2));
                    break block6;
                }
                catch (ail ail2) {
                    this.m = false;
                }
                finally {
                    this.m = false;
                }
            }
            n3 = 4;
        }
        String string = this.P();
        int n4 = this.h;
        if (adu2 == null) {
            n3 = 4;
        }
        return new ail(1, throwable, n2, string, n4, adu2, n3, bl2);
    }

    @Override
    public aji f() {
        return null;
    }

    @Override
    public final ajx g() {
        return this;
    }

    protected final akr h() {
        akr akr2 = this.i;
        abr.i(akr2);
        return akr2;
    }

    @Override
    public final anv i() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void j() {
        Object object = this.f;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    @Override
    public final void k() {
        int n2 = this.a;
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        abr.f(bl2);
        this.o.a();
        this.a = 0;
        this.b = null;
        this.k = null;
        this.e = false;
        this.p();
    }

    @Override
    public final /* synthetic */ void l() {
    }

    @Override
    public void m(int n2, Object object) {
    }

    @Override
    public final void n(int n2, akr akr2, afl afl2) {
        this.h = n2;
        this.i = akr2;
        this.j = afl2;
    }

    @Override
    public final void o() {
        anv anv2 = this.b;
        abr.i(anv2);
        anv2.b();
    }

    protected void p() {
        throw null;
    }

    protected void q() {
    }

    protected void r() {
    }

    protected void s() {
    }

    @Override
    public final void t() {
        boolean bl2 = this.a == 0;
        abr.f(bl2);
        this.q();
    }

    @Override
    public final void u() {
        boolean bl2 = this.a == 0;
        abr.f(bl2);
        this.o.a();
        this.r();
    }

    @Override
    public final void v(long l2) {
        this.U(l2);
    }

    @Override
    public final void w() {
        this.e = true;
    }

    @Override
    public final void x(aew aew2) {
        if (!Objects.equals(this.n, aew2)) {
            this.n = aew2;
        }
    }

    @Override
    public final void y() {
        int n2 = this.a;
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        abr.f(bl2);
        this.a = 2;
    }

    @Override
    public final void z() {
        boolean bl2 = this.a == 2;
        abr.f(bl2);
        this.a = 1;
        this.s();
    }
}

