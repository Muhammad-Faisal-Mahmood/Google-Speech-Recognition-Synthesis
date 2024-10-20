/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ius {
    static final Logger c = Logger.getLogger(ius.class.getName());
    public static final ius d = new ius();
    final iul e;
    public final ixs f;
    public final int g;

    private ius() {
        this.e = null;
        this.f = null;
        this.g = 0;
        ius.e(0);
    }

    public ius(ius ius2, ixs ixs2) {
        int n2;
        iul iul2 = ius2 instanceof iul ? (iul)ius2 : ius2.e;
        this.e = iul2;
        this.f = ixs2;
        this.g = n2 = ius2.g + 1;
        ius.e(n2);
    }

    public ius(ixs ixs2, int n2) {
        this.e = null;
        this.f = ixs2;
        this.g = n2;
        ius.e(n2);
    }

    private static void e(int n2) {
        if (n2 == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    public static ius k() {
        ius ius2;
        ius ius3 = ius2 = iuq.a.a();
        if (ius2 == null) {
            ius3 = d;
        }
        return ius3;
    }

    public ius a() {
        ius ius2;
        ius ius3 = ius2 = iuq.a.b(this);
        if (ius2 == null) {
            ius3 = d;
        }
        return ius3;
    }

    public iut b() {
        iul iul2 = this.e;
        if (iul2 == null) {
            return null;
        }
        return iul2.a;
    }

    public Throwable c() {
        iul iul2 = this.e;
        if (iul2 == null) {
            return null;
        }
        return ((ius)iul2).c();
    }

    public void d(ium ium2, Executor executor) {
        a.s(executor, "executor");
        iul iul2 = this.e;
        if (iul2 == null) {
            return;
        }
        iul2.e(new iuo(executor, ium2, this));
    }

    public void f(ius ius2) {
        a.s(ius2, "toAttach");
        iuq.a.c(this, ius2);
    }

    public void g(ium ium2) {
        iul iul2 = this.e;
        if (iul2 == null) {
            return;
        }
        iul2.h(ium2, this);
    }

    public boolean i() {
        iul iul2 = this.e;
        if (iul2 == null) {
            return false;
        }
        return ((ius)iul2).i();
    }

    public final ius l(iup object, Object object2) {
        ixs ixs2 = this.f;
        object = ixs2 == null ? new ixr(object, object2, 0) : ixs2.c(object, object2, object.hashCode(), 0);
        return new ius(this, (ixs)object);
    }
}

