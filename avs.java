/*
 * Decompiled with CFR 0.152.
 */
public final class avs
extends jqs
implements jro {
    int a;
    final aum b;
    final boolean c;
    final jrk d;

    public avs(jqb jqb2, aum aum2, boolean bl2, jrk jrk2) {
        this.b = aum2;
        this.c = bl2;
        this.d = jrk2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2 = jqh.a;
        int n2 = this.a;
        jns.ak(object);
        if (n2 == 0) {
            object = this.b;
            Object object2 = new avv(this.c, (aum)object, null, this.d);
            this.a = 1;
            object = object2 = ((aum)object).s((jro)object2, this);
            if (object2 == jqh2) {
                return jqh2;
            }
        }
        return object;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new avs(jqb2, this.b, this.c, this.d);
    }
}

