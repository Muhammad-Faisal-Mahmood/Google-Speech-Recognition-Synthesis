/*
 * Decompiled with CFR 0.152.
 */
final class eho
extends jqo {
    Object a;
    final ehq b;
    int c;
    ehq d;

    public eho(ehq ehq2, jqb jqb2) {
        this.b = ehq2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(this);
    }
}

