/*
 * Decompiled with CFR 0.152.
 */
final class aww
extends RuntimeException {
    public final awx a;
    public final Throwable b;

    public aww(awx awx2, Throwable throwable) {
        jse.e((Object)awx2, "callbackName");
        super(throwable);
        this.a = awx2;
        this.b = throwable;
    }

    @Override
    public final Throwable getCause() {
        return this.b;
    }
}

