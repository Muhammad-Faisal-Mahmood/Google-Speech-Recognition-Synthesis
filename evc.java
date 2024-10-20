/*
 * Decompiled with CFR 0.152.
 */
final class evc
extends jqs
implements jro {
    int a;
    final dzl b;
    final evi c;
    final jrk d;
    private Object e;

    public evc(dzl dzl2, evi evi2, jrk jrk2, jqb jqb2) {
        this.b = dzl2;
        this.c = evi2;
        this.d = jrk2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2 = jqh.a;
        int n2 = this.a;
        jns.ak(object);
        if (n2 == 0) {
            jvb jvb2 = (jvb)this.e;
            jyx jyx2 = jsd.u(new jyp(new epy(this.b, this.c.e, null, 3)), Integer.MAX_VALUE);
            object = jyx2;
            if (!(jyx2 instanceof jyq)) {
                object = new jys(jyx2);
            }
            object = new jzg(new jzg((jyx)object, new eva(this.c, this.d, jvb2, null), 2), new evb(this.c, null), 1);
            this.a = 1;
            if (jsd.s((jyx)object, this) == jqh2) {
                return jqh2;
            }
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new evc(this.b, this.c, this.d, jqb2);
        ((evc)jqb2).e = object;
        return jqb2;
    }
}

