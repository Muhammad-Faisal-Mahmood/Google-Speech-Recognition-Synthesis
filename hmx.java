/*
 * Decompiled with CFR 0.152.
 */
final class hmx {
    static final hmx a;
    static final hmx b;
    final boolean c;
    final Throwable d;

    static {
        if (hnk.h) {
            b = null;
            a = null;
        } else {
            b = new hmx(false, null);
            a = new hmx(true, null);
        }
    }

    public hmx(boolean bl2, Throwable throwable) {
        this.c = bl2;
        this.d = throwable;
    }
}

