/*
 * Decompiled with CFR 0.152.
 */
public final class jzv
extends jzt {
    protected final jyx d;

    public jzv(jyx jyx2, jqf jqf2, int n2, int n3) {
        super(jqf2, n2, n3);
        this.d = jyx2;
    }

    @Override
    public final Object a(jyy object, jqb jqb2) {
        block7: {
            block8: {
                block5: {
                    jqf jqf2;
                    Object object2;
                    block6: {
                        if (this.b != -3) break block5;
                        object2 = jqb2.d();
                        jqf2 = jux.a((jqf)object2, this.a);
                        if (!jse.i(jqf2, object2)) break block6;
                        if ((object = this.f((jyy)object, jqb2)) != jqh.a) break block7;
                        break block8;
                    }
                    if (!jse.i(jqf2.get(jqc.b), object2.get(jqc.b))) break block5;
                    jqf jqf3 = jqb2.d();
                    object2 = object;
                    if (!(object instanceof kal)) {
                        object2 = object;
                        if (!(object instanceof kaf)) {
                            object2 = new kan((jyy)object, jqf3);
                        }
                    }
                    object = new jzu(this, null, 0);
                    object = jsd.o(jqf2, object2, kbv.a(jqf2), (jro)object, jqb2);
                    if (object != jqh.a) break block7;
                    break block8;
                }
                if ((object = jzt.e(this, (jyy)object, jqb2)) != jqh.a) break block7;
            }
            return object;
        }
        return jon.a;
    }

    @Override
    protected final Object b(jyh object, jqb jqb2) {
        if ((object = this.f(new kal((jyk)object), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    protected final jzt c(jqf jqf2, int n2, int n3) {
        return new jzv(this.d, jqf2, n2, n3);
    }

    protected final Object f(jyy object, jqb jqb2) {
        if ((object = this.d.a((jyy)object, jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final String toString() {
        String string = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d);
        stringBuilder.append(" -> ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

