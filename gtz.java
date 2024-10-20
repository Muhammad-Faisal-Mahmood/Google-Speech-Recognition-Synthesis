/*
 * Decompiled with CFR 0.152.
 */
final class gtz
extends gsm {
    final gsy g;

    public gtz(guf guf2, CharSequence charSequence, gsy gsy2) {
        this.g = gsy2;
        super(guf2, charSequence);
    }

    @Override
    public final int a(int n2) {
        return n2 + 1;
    }

    @Override
    public final int b(int n2) {
        return this.g.c(this.b, n2);
    }
}

