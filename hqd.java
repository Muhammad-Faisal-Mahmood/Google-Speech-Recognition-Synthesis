/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeoutException;

final class hqd
extends TimeoutException {
    public hqd(String string) {
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }
}

