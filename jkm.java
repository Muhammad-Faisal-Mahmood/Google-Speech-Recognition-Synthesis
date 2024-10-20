/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class jkm
extends jee
implements jla {
    public static final int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final klm c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final jkd g;
    public final jle h;
    public final jks i;
    public boolean u;
    public final jns v;
    public jlb w;
    public int x;
    final jkn y;

    public jkm(jkn jkn2, int n2, jjo jjo2, Object object, jkd jkd2, jle jle2, jks jks2, int n3) {
        this.y = jkn2;
        super(n2, jjo2, jkn2.r);
        this.c = new klm();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = object;
        this.g = jkd2;
        this.h = jle2;
        this.i = jks2;
        this.B = n3;
        this.C = n3;
        this.A = n3;
        this.v = jnq.a;
    }

    @Override
    public final void a(int n2) {
        this.C = n2 = this.C - n2;
        int n3 = this.A;
        float f2 = n3;
        if ((float)n2 <= f2 * 0.5f) {
            this.B += (n3 -= n2);
            this.C = n2 + n3;
            this.g.f(this.x, n3);
        }
    }

    @Override
    public final void b(Throwable throwable) {
        this.q(iyh.c(throwable), true, new iwx());
    }

    @Override
    protected final void c(iyh iyh2, boolean bl2, iwx iwx2) {
        this.q(iyh2, false, iwx2);
    }

    @Override
    protected final void d() {
        super.d();
        jjv jjv2 = this.l;
        ++jjv2.b;
        jjv2.a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e(Runnable runnable) {
        Object object = this.a;
        synchronized (object) {
            runnable.run();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final jlb f() {
        Object object = this.a;
        synchronized (object) {
            return this.w;
        }
    }

    @Override
    public final void k(boolean bl2) {
        if (!this.s) {
            this.i.h(this.x, null, jck.a, false, jlt.l, null);
        } else {
            this.i.h(this.x, null, jck.a, false, null, null);
        }
        super.k(bl2);
    }

    public final void q(iyh iyh2, boolean bl2, iwx iwx2) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.u) {
            jks jks2 = this.i;
            Object object = this.y;
            jks2.v.remove(object);
            jks2.i((jkn)object);
            this.b = null;
            this.c.v();
            this.u = false;
            object = iwx2;
            if (iwx2 == null) {
                object = new iwx();
            }
            this.l(iyh2, true, (iwx)object);
            return;
        }
        this.i.h(this.x, iyh2, jck.a, bl2, jlt.l, iwx2);
    }

    public final void r(klm klm2, boolean bl2, int n2) {
        int n3 = (int)klm2.b;
        this.B = n3 = this.B - (n3 + n2);
        this.C -= n2;
        if (n3 < 0) {
            this.g.e(this.x, jlt.h);
            this.i.h(this.x, iyh.j.e("Received data size exceeded our receiving window size"), jck.a, false, null, null);
            return;
        }
        super.n(new jkw(klm2), bl2);
    }
}

