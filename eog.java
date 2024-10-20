/*
 * Decompiled with CFR 0.152.
 */
final class eog
extends jqo {
    Object a;
    final eoi b;
    int c;

    public eog(eoi eoi2, jqb jqb2) {
        this.b = eoi2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}

