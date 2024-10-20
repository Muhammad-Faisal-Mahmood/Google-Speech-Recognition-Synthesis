/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jkd
implements jlu {
    private static final Logger d = Logger.getLogger(jks.class.getName());
    public final jkc a;
    public final jlu b;
    public final ksb c = new ksb(Level.FINE, jks.class);

    public jkd(jkc jkc2, jlu jlu2) {
        this.a = jkc2;
        this.b = jlu2;
    }

    @Override
    public final void a() {
        throw null;
    }

    @Override
    public final void b(boolean bl2, int n2, klm klm2, int n3) {
        throw null;
    }

    @Override
    public final void c() {
        try {
            this.b.c();
            return;
        }
        catch (IOException iOException) {
            this.a.a(iOException);
            return;
        }
    }

    @Override
    public final void close() {
        try {
            this.b.close();
            return;
        }
        catch (IOException iOException) {
            Serializable serializable = iOException.getClass();
            Logger logger = d;
            serializable = serializable.equals(IOException.class) ? Level.FINE : Level.INFO;
            logger.logp((Level)serializable, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", iOException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(boolean bl2, int n2, int n3) {
        Object object;
        Object object2;
        long l2 = n2;
        long l3 = n3;
        l2 <<= 32;
        l3 &= 0xFFFFFFFFL;
        if (bl2) {
            object2 = this.c;
            if (((ksb)object2).c()) {
                object = ((ksb)object2).a;
                object2 = ((ksb)object2).b;
                String string = jjj.f(2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" PING: ack=true bytes=");
                stringBuilder.append(l2 | l3);
                String string2 = stringBuilder.toString();
                object2 = (Level)object2;
                ((Logger)object).logp((Level)object2, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", string2);
            }
        } else {
            this.c.f(2, l2 | l3);
        }
        try {
            object2 = this.b;
            if (bl2) {
                object = ((jke)object2).b;
                ++((jkb)object).h;
            }
            ((jke)object2).a.d(bl2, n2, n3);
            return;
        }
        catch (IOException iOException) {
            this.a.a(iOException);
            return;
        }
    }

    @Override
    public final void e(int n2, jlt jlt2) {
        this.c.g(2, n2, jlt2);
        try {
            jlu jlu2 = this.b;
            jkb jkb2 = ((jke)jlu2).b;
            ++jkb2.h;
            ((jke)jlu2).a.e(n2, jlt2);
            return;
        }
        catch (IOException iOException) {
            this.a.a(iOException);
            return;
        }
    }

    @Override
    public final void f(int n2, long l2) {
        this.c.h(2, n2, l2);
        try {
            ((jke)this.b).a.f(n2, l2);
            return;
        }
        catch (IOException iOException) {
            this.a.a(iOException);
            return;
        }
    }

    @Override
    public final void g(jlt jlt2, byte[] byArray) {
        this.c.e(2, 0, jlt2, klp.f(byArray));
        try {
            ((jke)this.b).a.g(jlt2, byArray);
            this.b.c();
            return;
        }
        catch (IOException iOException) {
            this.a.a(iOException);
            return;
        }
    }

    @Override
    public final void h(boolean bl2, int n2, List list) {
        throw null;
    }

    @Override
    public final void i(khv khv2) {
        throw null;
    }

    @Override
    public final void j(khv khv2) {
        throw null;
    }
}

