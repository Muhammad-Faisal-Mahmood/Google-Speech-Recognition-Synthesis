/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class izz
implements jcj {
    private final izq a;
    private final jae b;

    public izz(izq izq2, jae jae2) {
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
                jae jae3 = this.b;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void i(iut iut2) {
        jae jae2 = this.b;
        synchronized (jae2) {
            this.b.c(iut2);
            return;
        }
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
    public final void m(jcl object) {
        izq izq2 = this.a;
        // MONITORENTER : izq2
        this.a.l(this.b, (jjr)object);
        // MONITOREXIT : izq2
        if (this.b.h()) {
            object.e();
        }
        try {
            object = this.b;
            // MONITORENTER : object
            this.b.e();
            this.b.g();
        }
        catch (iyi iyi2) {
            object = this.a;
            // MONITORENTER : object
            this.a.h(iyi2.a);
            // MONITOREXIT : object
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(InputStream object) {
        try {
            jae jae2 = this.b;
            synchronized (jae2) {
                this.b.d((InputStream)object);
                this.b.g();
            }
        }
        catch (iyi iyi2) {
            object = this.a;
            synchronized (object) {
                this.a.h(iyi2.a);
                return;
            }
        }
    }

    @Override
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("MultiMessageClientStream[");
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

