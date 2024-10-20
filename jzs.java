/*
 * Decompiled with CFR 0.152.
 */
final class jzs
extends jqs
implements jro {
    int a;
    final jyy b;
    final jzt c;
    private Object d;

    public jzs(jyy jyy2, jzt jzt2, jqb jqb2) {
        this.b = jyy2;
        this.c = jzt2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2 = jqh.a;
        int n2 = this.a;
        jns.ak(object);
        if (n2 == 0) {
            int n3;
            jvb jvb2 = (jvb)this.d;
            Object object2 = this.b;
            Object object3 = this.c;
            jvc jvc2 = jvc.c;
            object = new jzu((jzt)object3, null, 1);
            n2 = n3 = ((jzt)object3).b;
            if (n3 == -3) {
                n2 = -2;
            }
            n3 = ((jzt)object3).c;
            object3 = ((jzt)object3).a;
            jxy jxy2 = jns.ao(n2, n3, 4);
            jvb2 = new jyh(jux.b(jvb2, (jqf)object3), jxy2);
            jvc2.a((jro)object, jvb2, (jqb)((Object)jvb2));
            this.a = 1;
            object = object2 = jsd.t((jyy)object2, (jyj)((Object)jvb2), true, this);
            if (object2 != jqh.a) {
                object = jon.a;
            }
            if (object == jqh2) {
                return jqh2;
            }
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new jzs(this.b, this.c, jqb2);
        ((jzs)jqb2).d = object;
        return jqb2;
    }
}

