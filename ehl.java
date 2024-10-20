/*
 * Decompiled with CFR 0.152.
 */
final class ehl
extends jqo {
    Object a;
    final ehq b;
    int c;

    public ehl(ehq ehq2, jqb jqb2) {
        this.b = ehq2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}

