/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public final class jzp
extends CancellationException {
    public final transient Object a;

    public jzp(Object object) {
        super("Flow was aborted, no more elements needed");
        this.a = object;
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

