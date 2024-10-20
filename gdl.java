/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class gdl
extends jpw
implements CoroutineExceptionHandler {
    public static final gdl a = new gdl();

    private gdl() {
        super(CoroutineExceptionHandler.c);
    }

    @Override
    public final void handleException(jqf object, Throwable throwable) {
        jse.e(object, "context");
        jse.e(throwable, "exception");
        Thread thread = Thread.currentThread();
        object = thread.getUncaughtExceptionHandler();
        jse.b(object);
        object.uncaughtException(thread, throwable);
    }
}

