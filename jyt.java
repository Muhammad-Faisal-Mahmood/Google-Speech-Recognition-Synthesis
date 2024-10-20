/*
 * Decompiled with CFR 0.152.
 */
class jyt
extends jzt {
    private final jro d;

    public jyt(jro jro2, jqf jqf2, int n2, int n3) {
        super(jqf2, n2, n3);
        this.d = jro2;
    }

    static /* synthetic */ Object d(jyt object, jyh jyh2, jqb jqb2) {
        object = ((jyt)object).d.b(jyh2, jqb2);
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    protected Object b(jyh jyh2, jqb jqb2) {
        return jyt.d(this, jyh2, jqb2);
    }

    @Override
    protected jzt c(jqf jqf2, int n2, int n3) {
        return new jyt(this.d, jqf2, n2, n3);
    }

    @Override
    public final String toString() {
        String string = super.toString();
        StringBuilder stringBuilder = new StringBuilder("block[");
        stringBuilder.append(this.d);
        stringBuilder.append("] -> ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

