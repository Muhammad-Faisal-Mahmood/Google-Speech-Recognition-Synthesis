/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.base.JavaHandlerThread;

public final class kmy
implements Thread.UncaughtExceptionHandler {
    final Object a;
    private final int b;

    public kmy(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void uncaughtException(Thread object, Throwable throwable) {
        if (this.b != 0) {
            Object object2 = ((jfs)this.a).h;
            Logger logger = jfs.a;
            object = Level.SEVERE;
            String string = String.valueOf(object2);
            object2 = new StringBuilder("[");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.logp((Level)object, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", ((StringBuilder)object2).toString(), throwable);
            object = (jfs)this.a;
            if (((jfs)object).u) {
                return;
            }
            ((jfs)object).u = true;
            ((jfs)object).f(true);
            ((jfs)object).j(false);
            ((jfs)object).k(new jfc(throwable));
            ((jfs)object).I.d(null);
            ((jfs)object).G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            ((jfs)object).o.a(iui.c);
            return;
        }
        ((JavaHandlerThread)this.a).b = throwable;
    }
}

