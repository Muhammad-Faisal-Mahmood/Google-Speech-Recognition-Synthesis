/*
 * Decompiled with CFR 0.152.
 */
final class evk
extends jqo {
    Object a;
    final evl b;
    int c;
    evl d;

    public evk(evl evl2, jqb jqb2) {
        this.b = evl2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}

