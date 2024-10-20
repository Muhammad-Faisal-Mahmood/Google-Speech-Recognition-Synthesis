/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

final class iyn
extends iur {
    static final ThreadLocal a;
    private static final Logger b;

    static {
        b = Logger.getLogger(iyn.class.getName());
        a = new ThreadLocal();
    }

    @Override
    public final ius a() {
        ius ius2;
        ius ius3 = ius2 = (ius)a.get();
        if (ius2 == null) {
            ius3 = ius.d;
        }
        return ius3;
    }

    @Override
    public final ius b(ius ius2) {
        ius ius3 = this.a();
        a.set(ius2);
        return ius3;
    }

    @Override
    public final void c(ius ius2, ius ius3) {
        if (this.a() != ius2) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (ius3 != ius.d) {
            a.set(ius3);
            return;
        }
        a.set(null);
    }
}

