/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class jiu
implements jjf {
    public final iul a;
    private final Executor b;
    private final Executor c;
    private final jje d;
    private jjf e;

    public jiu(Executor executor, Executor executor2, jje jje2, iul iul2) {
        this.b = executor;
        this.c = executor2;
        this.d = jje2;
        this.a = iul2;
    }

    @Override
    public final void a(iyh iyh2) {
        int n2 = jnr.a;
        if (!iyh2.g()) {
            Throwable throwable;
            Throwable throwable2 = throwable = iyh2.p;
            if (throwable == null) {
                throwable2 = new iyj(iyh.c.e("RPC cancelled"), null, false);
            }
            this.c.execute(new bcv(this.a, throwable2, 5));
        }
        this.b.execute(new jiq(this, iyh2));
    }

    @Override
    public final void b() {
        int n2 = jnr.a;
        this.b.execute(new jir(this));
    }

    public final jjf c() {
        jjf jjf2 = this.e;
        if (jjf2 != null) {
            return jjf2;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override
    public final void d(jjq jjq2) {
        int n2 = jnr.a;
        this.b.execute(new jis(this, jjq2));
    }

    @Override
    public final void e() {
        int n2 = jnr.a;
        this.b.execute(new jit(this));
    }

    public final void f(Throwable object) {
        iyh iyh2 = iyh.d.e("Application error processing RPC").d((Throwable)object);
        object = new iwx();
        this.d.e(iyh2, (iwx)object);
    }

    final void g(jjf jjf2) {
        a.s(jjf2, "listener must not be null");
        boolean bl2 = this.e == null;
        fxf.B(bl2, "Listener already set");
        this.e = jjf2;
    }
}

