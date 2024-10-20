/*
 * Decompiled with CFR 0.152.
 */
final class enp
extends jqs
implements jro {
    Object a;
    Object b;
    int c;
    final enu d;
    final int e;
    final efq f;
    final Object g;
    private final int h;

    public enp(enu enu2, int n2, efq efq2, eaj eaj2, jqb jqb2, int n3) {
        this.h = n3;
        this.d = enu2;
        this.e = n2;
        this.f = efq2;
        this.g = eaj2;
        super(2, jqb2);
    }

    public enp(enu enu2, int n2, efq efq2, ecu ecu2, jqb jqb2, int n3) {
        this.h = n3;
        this.d = enu2;
        this.e = n2;
        this.f = efq2;
        this.g = ecu2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2;
        block18: {
            block15: {
                enu enu2;
                Object object2;
                Object object3;
                block16: {
                    block17: {
                        int n2;
                        block12: {
                            block13: {
                                block14: {
                                    block4: {
                                        jqh jqh3;
                                        block11: {
                                            block8: {
                                                Object object4;
                                                Object object5;
                                                Object object6;
                                                block9: {
                                                    block10: {
                                                        int n3;
                                                        block5: {
                                                            block6: {
                                                                block7: {
                                                                    if (this.h == 0) break block4;
                                                                    jqh3 = jqh.a;
                                                                    n3 = this.c;
                                                                    if (n3 == 0) break block5;
                                                                    if (n3 == 1) break block6;
                                                                    if (n3 == 2) break block7;
                                                                    jns.ak(object);
                                                                    break block8;
                                                                }
                                                                object6 = this.b;
                                                                object5 = this.a;
                                                                jns.ak(object);
                                                                object = object6;
                                                                break block9;
                                                            }
                                                            object5 = this.a;
                                                            jns.ak(object);
                                                            break block10;
                                                        }
                                                        jns.ak(object);
                                                        object6 = this.d;
                                                        n3 = this.e;
                                                        object = this.f;
                                                        this.a = object5 = ((enu)object6).f(n3);
                                                        this.c = 1;
                                                        object = ((enu)object6).a((efq)object, this);
                                                        if (object == jqh3) break block11;
                                                    }
                                                    object6 = this.d;
                                                    object4 = this.g;
                                                    object = (gto)object;
                                                    this.a = object5;
                                                    this.b = object;
                                                    this.c = 2;
                                                    if (((enu)object6).d((eaj)object4, (gto)object, (String)object5, this) == jqh3) break block11;
                                                }
                                                object6 = this.d;
                                                object4 = this.g;
                                                this.a = null;
                                                this.b = null;
                                                this.c = 3;
                                                object5 = (String)object5;
                                                if (((enu)object6).b((eaj)object4, (gto)object, (String)object5, this) == jqh3) break block11;
                                            }
                                            return jon.a;
                                        }
                                        return jqh3;
                                    }
                                    jqh2 = jqh.a;
                                    n2 = this.c;
                                    if (n2 == 0) break block12;
                                    if (n2 == 1) break block13;
                                    if (n2 == 2) break block14;
                                    jns.ak(object);
                                    break block15;
                                }
                                object3 = this.b;
                                object2 = this.a;
                                jns.ak(object);
                                object = object3;
                                break block16;
                            }
                            object2 = this.a;
                            jns.ak(object);
                            break block17;
                        }
                        jns.ak(object);
                        object = this.d;
                        n2 = this.e;
                        object3 = this.f;
                        this.a = object2 = ((enu)object).g(n2);
                        this.c = 1;
                        object = ((enu)object).a((efq)object3, this);
                        if (object == jqh2) break block18;
                    }
                    enu2 = this.d;
                    object3 = this.g;
                    object = (gto)object;
                    this.a = object2;
                    this.b = object;
                    this.c = 2;
                    if (enu2.e((ecu)object3, (gto)object, (String)object2, this) == jqh2) break block18;
                }
                enu2 = this.d;
                object3 = this.g;
                this.a = null;
                this.b = null;
                this.c = 3;
                object2 = (String)object2;
                if (enu2.c((ecu)object3, (gto)object, (String)object2, this) == jqh2) break block18;
            }
            return jon.a;
        }
        return jqh2;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.h != 0) {
            object = ((jqm)this).c((jvb)object, (jqb)object2);
            object2 = jon.a;
            return ((enp)object).a(object2);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((enp)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.h != 0) {
            return new enp(this.d, this.e, this.f, (eaj)this.g, jqb2, 1);
        }
        return new enp(this.d, this.e, this.f, (ecu)this.g, jqb2, 0);
    }
}

