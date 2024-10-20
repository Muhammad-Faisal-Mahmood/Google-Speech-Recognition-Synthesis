/*
 * Decompiled with CFR 0.152.
 */
final class jym
extends jqo {
    Object a;
    final jyn b;
    int c;
    kah d;

    public jym(jyn jyn2, jqb jqb2) {
        this.b = jyn2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}

