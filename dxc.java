/*
 * Decompiled with CFR 0.152.
 */
public final class dxc
implements Thread.UncaughtExceptionHandler {
    public final dxd a;
    public final Thread.UncaughtExceptionHandler b;

    public /* synthetic */ dxc(dxd dxd2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = dxd2;
        this.b = uncaughtExceptionHandler;
    }

    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        this.a.b(this.b, thread, throwable);
    }
}

