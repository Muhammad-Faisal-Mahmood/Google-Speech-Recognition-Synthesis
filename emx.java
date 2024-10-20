/*
 * Decompiled with CFR 0.152.
 */
public final class emx
extends jqs
implements jro {
    Object a;
    int b;
    final hpn c;
    final hpn d;
    final czh e;
    private Object f;
    private final int g;

    public emx(czh czh2, hpn hpn2, hpn hpn3, jqb jqb2, int n2) {
        this.g = n2;
        this.e = czh2;
        this.c = hpn2;
        this.d = hpn3;
        super(2, jqb2);
    }

    public emx(czh czh2, hpn hpn2, hpn hpn3, jqb jqb2, int n2, byte[] byArray) {
        this.g = n2;
        this.e = czh2;
        this.c = hpn2;
        this.d = hpn3;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        block33: {
            czh czh2;
            Object object2;
            block30: {
                jqh jqh2;
                block31: {
                    Object object3;
                    block32: {
                        if (this.g != 0) {
                            block29: {
                                czh czh3;
                                Object object4;
                                block26: {
                                    jqh jqh3;
                                    block27: {
                                        block28: {
                                            jqh3 = jqh.a;
                                            int n2 = this.b;
                                            if (n2 != 0) {
                                                if (n2 != 1) {
                                                    if (n2 != 2) {
                                                        object4 = (efs)this.a;
                                                        czh3 = (czh)this.f;
                                                        jns.ak(object);
                                                        break block26;
                                                    }
                                                    object4 = (efs)this.a;
                                                    czh3 = (czh)this.f;
                                                    jns.ak(object);
                                                    break block27;
                                                }
                                                czh3 = (czh)this.a;
                                                object4 = (hpn)this.f;
                                                jns.ak(object);
                                                break block28;
                                            }
                                            jns.ak(object);
                                            object = (jvb)this.f;
                                            czh3 = this.e;
                                            object = this.c;
                                            object4 = this.d;
                                            this.f = object4;
                                            this.a = czh3;
                                            this.b = 1;
                                            object = jsd.l((hpn)object, this);
                                            if (object != jqh3) break block28;
                                            object = jqh3;
                                            break block29;
                                        }
                                        object = (efs)object;
                                        this.f = czh3;
                                        this.a = object;
                                        this.b = 2;
                                        Object object5 = jsd.l((hpn)object4, this);
                                        if (object5 == jqh3) {
                                            object = jqh3;
                                            break block29;
                                        }
                                        object4 = object;
                                        object = object5;
                                    }
                                    object = ((eah)object).e();
                                    this.f = czh3;
                                    this.a = object4;
                                    this.b = 3;
                                    object = jsd.l((hpn)object, this);
                                    if (object != jqh3) break block26;
                                    object = jqh3;
                                    break block29;
                                }
                                try {
                                    czh3.s((efs)object4, (eaf)object);
                                }
                                catch (Throwable throwable) {
                                    jns.aj(throwable);
                                }
                                object = jon.a;
                            }
                            return object;
                        }
                        jqh2 = jqh.a;
                        int n3 = this.b;
                        if (n3 != 0) {
                            if (n3 != 1) {
                                if (n3 != 2) {
                                    object2 = (efs)this.a;
                                    czh2 = (czh)this.f;
                                    jns.ak(object);
                                    break block30;
                                }
                                object2 = (efs)this.a;
                                czh2 = (czh)this.f;
                                jns.ak(object);
                                break block31;
                            }
                            czh2 = (czh)this.a;
                            object2 = (hpn)this.f;
                            jns.ak(object);
                            object3 = object;
                            break block32;
                        }
                        jns.ak(object);
                        object = (jvb)this.f;
                        czh2 = this.e;
                        object2 = this.c;
                        object = this.d;
                        this.f = object;
                        this.a = czh2;
                        this.b = 1;
                        object3 = jsd.l((hpn)object2, this);
                        if (object3 == jqh2) {
                            object = jqh2;
                            break block33;
                        }
                        object2 = object;
                    }
                    object3 = (efs)object3;
                    this.f = czh2;
                    this.a = object3;
                    this.b = 2;
                    object = jsd.l((hpn)object2, this);
                    if (object == jqh2) {
                        object = jqh2;
                        break block33;
                    }
                    object2 = object3;
                }
                object = ((ecs)object).e();
                this.f = czh2;
                this.a = object2;
                this.b = 3;
                object = jsd.l((hpn)object, this);
                if (object != jqh2) break block30;
                object = jqh2;
                break block33;
            }
            try {
                czh2.s((efs)object2, (eaf)object);
            }
            catch (Throwable throwable) {
                jns.aj(throwable);
            }
            object = jon.a;
        }
        return object;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.g != 0) {
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((emx)object2).a(object);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((emx)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.g != 0) {
            jqb2 = new emx(this.e, this.c, this.d, jqb2, 1, null);
            ((emx)jqb2).f = object;
            return jqb2;
        }
        jqb2 = new emx(this.e, this.c, this.d, jqb2, 0);
        ((emx)jqb2).f = object;
        return jqb2;
    }
}

