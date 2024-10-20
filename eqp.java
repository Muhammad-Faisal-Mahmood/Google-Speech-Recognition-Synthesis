/*
 * Decompiled with CFR 0.152.
 */
final class eqp
extends jqs
implements jro {
    Object a;
    int b;
    final jvi c;
    final hpn d;
    final eot e;
    final Object f;
    private final int g;

    public eqp(eqj eqj2, jvi jvi2, hpn hpn2, eot eot2, jqb jqb2, int n2) {
        this.g = n2;
        this.f = eqj2;
        this.c = jvi2;
        this.d = hpn2;
        this.e = eot2;
        super(2, jqb2);
    }

    public eqp(eqq eqq2, jvi jvi2, hpn hpn2, eot eot2, jqb jqb2, int n2) {
        this.g = n2;
        this.f = eqq2;
        this.c = jvi2;
        this.d = hpn2;
        this.e = eot2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        Object object2;
        block10: {
            Object object3;
            block9: {
                block8: {
                    block4: {
                        Object object4;
                        block7: {
                            Object object5;
                            block6: {
                                block5: {
                                    if (this.g == 0) break block4;
                                    object4 = jqh.a;
                                    if (this.b == 0) break block5;
                                    object5 = this.a;
                                    jns.ak(object);
                                    break block6;
                                }
                                jns.ak(object);
                                object5 = this.f;
                                object = this.c;
                                this.a = object5 = ((eqj)object5).e;
                                this.b = 1;
                                object = object.m(this);
                                if (object == object4) break block7;
                            }
                            object4 = this.e;
                            object = (ecp)object;
                            eop eop2 = new eop(object4, 6);
                            object4 = this.d;
                            return ((dlm)object5).o((ecp)object, eop2, (hpn)object4);
                        }
                        return object4;
                    }
                    object2 = jqh.a;
                    if (this.b == 0) break block8;
                    object3 = this.a;
                    jns.ak(object);
                    break block9;
                }
                jns.ak(object);
                object3 = this.f;
                object = this.c;
                this.a = object3 = ((eqq)object3).a;
                this.b = 1;
                object = object.m(this);
                if (object == object2) break block10;
            }
            object2 = this.e;
            object = (ecp)object;
            object2 = new eop(object2, 8);
            hpn hpn2 = this.d;
            return ((dlm)object3).o((ecp)object, (jqz)object2, hpn2);
        }
        return object2;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.g != 0) {
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((eqp)object2).a(object);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((eqp)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.g != 0) {
            Object object2 = this.f;
            jvi jvi2 = this.c;
            object = this.d;
            eot eot2 = this.e;
            return new eqp((eqj)object2, jvi2, (hpn)object, eot2, jqb2, 1);
        }
        Object object3 = this.f;
        jvi jvi3 = this.c;
        object = this.d;
        eot eot3 = this.e;
        return new eqp((eqq)object3, jvi3, (hpn)object, eot3, jqb2, 0);
    }
}

