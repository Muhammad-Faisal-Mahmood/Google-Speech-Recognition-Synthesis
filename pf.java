/*
 * Decompiled with CFR 0.152.
 */
final class pf {
    static final pf a;
    static final pf b;
    final boolean c;
    final Throwable d;

    static {
        if (pn.a) {
            b = null;
            a = null;
        } else {
            b = new pf(false, null);
            a = new pf(true, null);
        }
    }

    public pf(boolean bl2, Throwable throwable) {
        this.c = bl2;
        this.d = throwable;
    }
}

