/*
 * Decompiled with CFR 0.152.
 */
final class jwd
implements jwe {
    public final jwu a;

    public jwd(jwu jwu2) {
        this.a = jwu2;
    }

    @Override
    public final jwu bt() {
        return this.a;
    }

    @Override
    public final boolean bv() {
        return false;
    }

    public final String toString() {
        String string = jve.a ? this.a.c("New") : super.toString();
        return string;
    }
}

