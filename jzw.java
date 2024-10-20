/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public final class jzw
extends CancellationException {
    public jzw() {
        super("Child of the scoped flow was cancelled");
    }

    @Override
    public final Throwable fillInStackTrace() {
        if (jve.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

