/*
 * Decompiled with CFR 0.152.
 */
final class etb
extends jqo {
    Object a;
    final etd b;
    int c;
    etd d;
    ebg e;

    public etb(etd etd2, jqb jqb2) {
        this.b = etd2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, this);
    }
}

