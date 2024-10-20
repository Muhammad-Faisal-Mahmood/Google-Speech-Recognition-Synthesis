/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hpj
implements hpn {
    public static final hpn a = new hpj(null);
    private static final hpm b = new hpm(hpj.class);
    private final Object c;

    public hpj(Object object) {
        this.c = object;
    }

    @Override
    public final void c(Runnable object, Executor object2) {
        a.s(object, "Runnable was null.");
        a.s(object2, "Executor was null.");
        try {
            object2.execute((Runnable)object);
            return;
        }
        catch (Exception exception) {
            Logger logger = b.a();
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            StringBuilder stringBuilder = new StringBuilder("RuntimeException while executing runnable ");
            stringBuilder.append((String)object);
            stringBuilder.append(" with executor ");
            stringBuilder.append((String)object2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", stringBuilder.toString(), exception);
            return;
        }
    }

    @Override
    public final boolean cancel(boolean bl2) {
        return false;
    }

    public final Object get() {
        return this.c;
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        fxf.K((Object)timeUnit);
        return this.c;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object object = this.c;
        String string = super.toString();
        String string2 = String.valueOf(object);
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("[status=SUCCESS, result=[");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("]]");
        return ((StringBuilder)object).toString();
    }
}

