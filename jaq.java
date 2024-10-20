/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class jaq
implements jje {
    private final izr a;
    private final jaf b;
    private final its c;
    private iwx d;
    private InputStream e;

    public jaq(izr izr2, jaf jaf2, its its2) {
        this.a = izr2;
        this.b = jaf2;
        this.c = its2;
    }

    @Override
    public final its a() {
        return this.c;
    }

    @Override
    public final jjo b() {
        return this.b.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(iyh iyh2) {
        izr izr2 = this.a;
        synchronized (izr2) {
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void e(iyh object, iwx object2) {
        block14: {
            boolean bl2;
            jaf jaf2;
            try {
                jaf jaf3 = this.b;
                // MONITORENTER : jaf3
                jaf2 = this.b;
                iwx iwx2 = this.d;
                InputStream inputStream = this.e;
                if (jaf2.b != null) break block14;
                if (iwx2 != null) {
                    jaf2.a = iwx2;
                }
                jaf2.e();
                if (inputStream != null) {
                    jaf2.d(inputStream);
                }
                bl2 = jaf2.c == null;
            }
            catch (iyi iyi2) {
                object = this.a;
                // MONITORENTER : object
                this.a.h(iyi2.a);
                // MONITOREXIT : object
                return;
            }
            fxf.A(bl2);
            jaf2.b = object;
            jaf2.c = object2;
            jaf2.f();
            jaf2.g();
        }
        // MONITOREXIT : jaf3
        object2 = this.a;
        // MONITORENTER : object2
        this.a.f();
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
        izr izr2 = this.a;
        synchronized (izr2) {
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
    public final void i(jjf jjf2) {
        izr izr2 = this.a;
        synchronized (izr2) {
            this.a.l(this.b, jjf2);
            return;
        }
    }

    @Override
    public final void j(iwx iwx2) {
        this.d = iwx2;
    }

    @Override
    public final void k() {
        String string = (String)this.c.a(izi.g);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(InputStream object) {
        if (this.e != null) {
            object = this.a;
            synchronized (object) {
                this.a.h(iyh.j.e("too many messages"));
                return;
            }
        }
        this.e = object;
    }

    @Override
    public final boolean o() {
        throw null;
    }

    public final String toString() {
        Object object = this.b;
        String string = ((Object)this.a).toString();
        String string2 = object.toString();
        object = new StringBuilder("SingleMessageServerStream[");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }
}

