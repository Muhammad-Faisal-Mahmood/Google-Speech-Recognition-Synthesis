/*
 * Decompiled with CFR 0.152.
 */
final class eno
extends jqo {
    Object a;
    final enu b;
    int c;

    public eno(enu enu2, jqb jqb2) {
        this.b = enu2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}

