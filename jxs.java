/*
 * Decompiled with CFR 0.152.
 */
final class jxs
extends jqo {
    Object a;
    final jxu b;
    int c;

    public jxs(jxu jxu2, jqb jqb2) {
        this.b = jxu2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        object = jxu.d(this.b, this);
        if (object == jqh.a) {
            return object;
        }
        return new jyc(object);
    }
}

