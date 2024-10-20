/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bax
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class bdy {
    public static final String a = bbi.b("WorkerWrapper");

    public static final Object a(hpn object, bbh bbh2, jqb jqb2) {
        block3: {
            try {
                if (object.isDone()) {
                    object = bdy.b((Future)object);
                    return object;
                }
                jul jul2 = new jul(jjj.n(jqb2), 1);
                jul2.r();
                object.c(new bcv(object, jul2, 0), (Executor)bax.a);
                jul2.s(new ezq(bbh2, object, 1));
                object = jul2.a();
                if (object != jqh.a) break block3;
            }
            catch (ExecutionException executionException) {
                throw bdy.c(executionException);
            }
            jsd.j(jqb2);
        }
        return object;
    }

    public static final Object b(Future future) {
        boolean bl2 = false;
        while (true) {
            try {
                Object v2 = future.get();
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
                return v2;
            }
            catch (Throwable throwable) {
                if (bl2) {
                    Thread.currentThread().interrupt();
                }
                throw throwable;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
    }

    public static final Throwable c(ExecutionException throwable) {
        throwable = throwable.getCause();
        jse.b(throwable);
        return throwable;
    }
}

