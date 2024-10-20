/*
 * Decompiled with CFR 0.152.
 */
final class eve
extends jqo {
    Object a;
    final evi b;
    int c;
    evi d;

    public eve(evi evi2, jqb jqb2) {
        this.b = evi2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}

