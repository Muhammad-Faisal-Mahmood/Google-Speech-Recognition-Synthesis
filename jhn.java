/*
 * Decompiled with CFR 0.152.
 */
final class jhn
implements Thread.UncaughtExceptionHandler {
    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        throw new iyj(iyh.c(throwable).e("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}

