/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jey
implements Runnable {
    private static final Logger a = Logger.getLogger(jey.class.getName());
    private final Runnable b;

    public jey(Runnable runnable) {
        this.b = runnable;
    }

    @Override
    public final void run() {
        try {
            this.b.run();
            return;
        }
        catch (Throwable throwable) {
            Runnable runnable = this.b;
            a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(runnable.toString()), throwable);
            gun.b(throwable);
            throw new AssertionError((Object)throwable);
        }
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("LogExceptionRunnable(");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

