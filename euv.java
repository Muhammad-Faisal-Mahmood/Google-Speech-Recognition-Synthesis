/*
 * Decompiled with CFR 0.152.
 */
final class euv
extends jqo {
    Object a;
    final euw b;
    int c;
    euw d;

    public euv(euw euw2, jqb jqb2) {
        this.b = euw2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}

