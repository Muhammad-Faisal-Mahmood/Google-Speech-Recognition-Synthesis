/*
 * Decompiled with CFR 0.152.
 */
public final class epd
extends jqo {
    public Object a;
    final epe b;
    public int c;

    public epd(epe epe2, jqb jqb2) {
        this.b = epe2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return cqq.an(this.b, this);
    }
}

