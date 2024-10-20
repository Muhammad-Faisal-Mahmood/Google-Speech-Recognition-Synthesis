/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class jap
implements jcj {
    private final izq a;
    private final jae b;
    private InputStream c;
    private iut d;

    public jap(izq izq2, jae jae2) {
        this.a = izq2;
        this.b = jae2;
    }

    @Override
    public final its a() {
        throw null;
    }

    @Override
    public final void b(jeh jeh2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(iyh iyh2) {
        izq izq2 = this.a;
        synchronized (izq2) {
            this.a.i(iyh2);
            return;
        }
    }

    @Override
    public final void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e() {
        try {
            jae jae2 = this.b;
            synchronized (jae2) {
                Object object = this.d;
                if (object != null) {
                    this.b.c((iut)object);
                }
                this.b.e();
                jae jae3 = this.b;
                object = this.c;
                if (object != null) {
                    jae3.d((InputStream)object);
                }
                jae3.f();
                jae3.g();
            }
        }
        catch (iyi iyi2) {
            izq izq2 = this.a;
            synchronized (izq2) {
                this.a.h(iyi2.a);
                return;
            }
        }
    }

    @Override
    public final void f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g(int n2) {
        izq izq2 = this.a;
        synchronized (izq2) {
            this.a.n(n2);
            return;
        }
    }

    @Override
    public final void h(iuf iuf2) {
    }

    @Override
    public final void i(iut iut2) {
        this.d = iut2;
    }

    @Override
    public final void j(iuw iuw2) {
    }

    @Override
    public final void k(int n2) {
    }

    @Override
    public final void l(int n2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void m(jcl jcl2) {
        izq izq2 = this.a;
        // MONITORENTER : izq2
        this.a.l(this.b, jcl2);
        // MONITOREXIT : izq2
        if (!this.b.h()) return;
        jcl2.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(InputStream object) {
        if (this.c != null) {
            object = this.a;
            synchronized (object) {
                this.a.h(iyh.j.e("too many messages"));
                return;
            }
        }
        this.c = object;
    }

    @Override
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        String string2 = object.toString();
        object = new StringBuilder("SingleMessageClientStream[");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }
}

