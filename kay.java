/*
 * Decompiled with CFR 0.152.
 */
public final class kay
extends RuntimeException {
    private final transient jqf a;

    public kay(jqf jqf2) {
        this.a = jqf2;
    }

    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}

