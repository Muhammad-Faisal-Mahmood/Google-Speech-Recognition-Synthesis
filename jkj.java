/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

final class jkj
implements jco {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final jli d;
    final dml e;
    private final jgp f;
    private final jgp g;
    private final jbn h;
    private boolean i;

    public jkj(jgp jgp2, jgp jgp3, SSLSocketFactory sSLSocketFactory, jli jli2, dml dml2) {
        this.f = jgp2;
        this.a = jgp2.a();
        this.g = jgp3;
        this.b = (ScheduledExecutorService)jgp3.a();
        this.c = sSLSocketFactory;
        this.d = jli2;
        this.h = new jbn();
        this.e = dml2;
    }

    @Override
    public final jcu a(SocketAddress socketAddress, jcn object, ity object2) {
        if (!this.i) {
            object2 = this.h;
            object2 = new jhz(new jbm((jbn)object2, ((jbn)object2).c.get()), 7);
            socketAddress = (InetSocketAddress)socketAddress;
            String string = ((jcn)object).a;
            String string2 = ((jcn)object).c;
            its its2 = ((jcn)object).b;
            object = ((jcn)object).d;
            gui gui2 = jeb.q;
            Logger logger = jmd.a;
            return new jks(this, (InetSocketAddress)socketAddress, string, string2, its2, gui2, (ivf)object, (Runnable)object2);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    @Override
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.b(this.a);
        this.g.b(this.b);
    }
}

