/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jip
extends ixx {
    private static final Logger d = Logger.getLogger(jip.class.getName());
    public final ixb a;
    public final iul b;
    public volatile boolean c;
    private final jje e;
    private final byte[] f;
    private final iuw g;
    private final jby h;
    private boolean i;
    private boolean j;
    private iuf k;
    private boolean l;

    public jip(jje jje2, ixb ixb2, iwx iwx2, iul iul2, iuw iuw2, jby jby2) {
        this.e = jje2;
        this.a = ixb2;
        this.b = iul2;
        this.f = (byte[])iwx2.b(jeb.d);
        this.g = iuw2;
        this.h = jby2;
        jby2.b();
    }

    static /* bridge */ /* synthetic */ void g(jip jip2) {
        jip2.c = true;
    }

    private final void h(Throwable object) {
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", (Throwable)object);
        object = object instanceof iyj ? ((iyj)object).a : iyh.j.d((Throwable)object).e("Internal error so cancelling stream.");
        this.e.c((iyh)object);
        this.h.a(false);
    }

    private final void i(Object object) {
        fxf.B(this.i, "sendHeaders has not been called");
        fxf.B(this.j ^ true, "call is closed");
        ixb ixb2 = this.a;
        if (ixb2.a.b() && this.l) {
            this.h(new iyj(iyh.j.e("Too many responses")));
            return;
        }
        this.l = true;
        try {
            object = ixb2.e.a(object);
            this.e.n((InputStream)object);
            object = this.a.a;
            return;
        }
        catch (Error error) {
            this.a(iyh.c.e("Server sendMessage() failed with Error"), new iwx());
            throw error;
        }
        catch (RuntimeException runtimeException) {
            this.h(runtimeException);
            return;
        }
    }

    @Override
    public final void a(iyh iyh2, iwx object) {
        int n2 = jnr.a;
        fxf.B(this.j ^ true, "call already closed");
        try {
            this.j = true;
            if (iyh2.g() && this.a.a.b() && !this.l) {
                object = iyh.j.e("Completed without a response");
                iyj iyj2 = new iyj((iyh)object);
                this.h(iyj2);
                return;
            }
            this.e.e(iyh2, (iwx)object);
            return;
        }
        finally {
            this.h.a(iyh2.g());
        }
    }

    @Override
    public final void b(iwx iwx2) {
        Object object;
        block6: {
            int n2 = jnr.a;
            fxf.B(this.i ^ true, "sendHeaders has already been called");
            fxf.B(this.j ^ true, "call is closed");
            iwx2.e(jeb.g);
            iwx2.e(jeb.c);
            if (this.k == null) {
                this.k = iud.a;
            } else {
                object = this.f;
                if (object != null) {
                    object = jeb.k.e(new String((byte[])object, jeb.a)).iterator();
                    while (object.hasNext()) {
                        if (!a.k(object.next(), "identity")) continue;
                        break block6;
                    }
                    this.k = iud.a;
                } else {
                    this.k = iud.a;
                }
            }
        }
        iwx2.g(jeb.c, "identity");
        iwx2.e(jeb.d);
        object = this.g.c;
        if (((Object)object).length != 0) {
            iwx2.g(jeb.d, object);
        }
        this.i = true;
        jje jje2 = this.e;
        object = this.a.a;
        jje2.j(iwx2);
    }

    @Override
    public final its c() {
        return this.e.a();
    }

    @Override
    public final void d(int n2) {
        int n3 = jnr.a;
        this.e.g(n2);
    }

    @Override
    public final ixb e() {
        return this.a;
    }

    @Override
    public final void f(Object object) {
        int n2 = jnr.a;
        this.i(object);
    }
}

