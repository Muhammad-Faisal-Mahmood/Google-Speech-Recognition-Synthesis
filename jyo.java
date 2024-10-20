/*
 * Decompiled with CFR 0.152.
 */
final class jyo
extends jqo {
    Object a;
    final jyp b;
    int c;
    jyh d;

    public jyo(jyp jyp2, jqb jqb2) {
        this.b = jyp2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return ((jyt)this.b).b(null, this);
    }
}

