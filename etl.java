/*
 * Decompiled with CFR 0.152.
 */
final class etl
extends jqo {
    Object a;
    final etn b;
    int c;
    etn d;
    jur e;

    public etl(etn etn2, jqb jqb2) {
        this.b = etn2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}

