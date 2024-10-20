/*
 * Decompiled with CFR 0.152.
 */
public final class heu
extends Exception {
    public heu(Throwable throwable, hfj hfj2, StackTraceElement[] stackTraceElementArray) {
        super(hfj2.toString(), throwable);
        this.setStackTrace(stackTraceElementArray);
    }

    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
}

