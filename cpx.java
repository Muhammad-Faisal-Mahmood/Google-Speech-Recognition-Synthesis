/*
 * Decompiled with CFR 0.152.
 */
public final class cpx
extends RuntimeException {
    public cpx(String string, StackTraceElement[] stackTraceElementArray, Throwable throwable) {
        super(string, throwable);
        this.setStackTrace(stackTraceElementArray);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return this;
    }
}

