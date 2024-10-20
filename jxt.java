/*
 * Decompiled with CFR 0.152.
 */
final class jxt
extends jqo {
    Object a;
    final jxu b;
    int c;

    public jxt(jxu jxu2, jqb jqb2) {
        this.b = jxu2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        object = this.b.w(null, 0, 0L, this);
        if (object == jqh.a) {
            return object;
        }
        return new jyc(object);
    }
}

