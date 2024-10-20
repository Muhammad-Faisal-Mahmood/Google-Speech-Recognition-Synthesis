/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;

public final class emy
extends jqs
implements jro {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final String f;
    final eip g;
    final hpn h;
    final hpn i;
    final czh j;
    private Object m;

    public emy(czh czh2, String string, eip eip2, hpn hpn2, hpn hpn3, jqb jqb2) {
        this.j = czh2;
        this.f = string;
        this.g = eip2;
        this.h = hpn2;
        this.i = hpn3;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        block28: {
            jqh jqh2;
            block25: {
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                block27: {
                    block26: {
                        Object object7;
                        Object object8;
                        block20: {
                            block21: {
                                block22: {
                                    block23: {
                                        block24: {
                                            jqh2 = jqh.a;
                                            int n2 = this.e;
                                            if (n2 != 0) {
                                                if (n2 != 1) {
                                                    if (n2 != 2) {
                                                        if (n2 != 3) {
                                                            if (n2 != 4) {
                                                                object6 = (eaf)this.d;
                                                                object5 = (efs)this.c;
                                                                object4 = (czh)this.b;
                                                                object3 = (String)this.a;
                                                                object2 = (eip)this.m;
                                                                jns.ak(object);
                                                                object8 = object;
                                                                break block20;
                                                            }
                                                            object3 = (eaf)this.d;
                                                            object4 = (efs)this.c;
                                                            object6 = (czh)this.b;
                                                            object5 = (String)this.a;
                                                            object2 = (eip)this.m;
                                                            jns.ak(object);
                                                            object7 = object;
                                                            break block21;
                                                        }
                                                        object6 = (efs)this.d;
                                                        object5 = (czh)this.c;
                                                        object4 = (String)this.b;
                                                        object3 = (eip)this.a;
                                                        object2 = (hpn)this.m;
                                                        jns.ak(object);
                                                        break block22;
                                                    }
                                                    object6 = (efs)this.d;
                                                    object5 = (czh)this.c;
                                                    object4 = (String)this.b;
                                                    object3 = (eip)this.a;
                                                    object2 = (hpn)this.m;
                                                    jns.ak(object);
                                                    object7 = object;
                                                    break block23;
                                                }
                                                object6 = (czh)this.c;
                                                object5 = (String)this.b;
                                                object4 = (eip)this.a;
                                                object3 = (hpn)this.m;
                                                jns.ak(object);
                                                break block24;
                                            }
                                            jns.ak(object);
                                            object = (jvb)this.m;
                                            object6 = this.j;
                                            object5 = this.f;
                                            object4 = this.g;
                                            object = this.h;
                                            object3 = this.i;
                                            this.m = object3;
                                            this.a = object4;
                                            this.b = object5;
                                            this.c = object6;
                                            this.e = 1;
                                            object = jsd.l((hpn)object, this);
                                            if (object == jqh2) break block25;
                                        }
                                        object = (efs)object;
                                        this.m = object3;
                                        this.a = object4;
                                        this.b = object5;
                                        this.c = object6;
                                        this.d = object;
                                        this.e = 2;
                                        object7 = jsd.l((hpn)object3, this);
                                        if (object7 == jqh2) break block25;
                                        object2 = object3;
                                        object3 = object4;
                                        object4 = object5;
                                        object5 = object6;
                                        object6 = object;
                                    }
                                    object = ((ecp)object7).e();
                                    this.m = object2;
                                    this.a = object3;
                                    this.b = object4;
                                    this.c = object5;
                                    this.d = object6;
                                    this.e = 3;
                                    object = jsd.l((hpn)object, this);
                                    if (object == jqh2) break block25;
                                }
                                object = (eaf)object;
                                this.m = object3;
                                this.a = object4;
                                this.b = object5;
                                this.c = object6;
                                this.d = object;
                                this.e = 4;
                                object7 = jsd.l((hpn)object2, this);
                                if (object7 == jqh2) break block25;
                                Object object9 = object4;
                                object8 = object5;
                                object4 = object6;
                                object2 = object3;
                                object5 = object9;
                                object6 = object8;
                                object3 = object;
                            }
                            object = (hpn)((ecp)object7).c().f();
                            if (object == null) break block26;
                            this.m = object2;
                            this.a = object5;
                            this.b = object6;
                            this.c = object4;
                            this.d = object3;
                            this.e = 5;
                            object8 = jsd.l((hpn)object, this);
                            if (object8 == jqh2) break block25;
                            object = object3;
                            object7 = object4;
                            object3 = object5;
                            object4 = object6;
                            object5 = object7;
                            object6 = object;
                        }
                        object8 = (eag)object8;
                        object = object3;
                        object7 = object4;
                        object3 = object6;
                        object4 = object5;
                        object6 = object7;
                        object5 = object;
                        object = object8;
                        break block27;
                    }
                    object = null;
                }
                if (object == null) break block28;
                try {
                    if ((((eag)object).b & 1) != 0 && (((eaf)object3).b & 1) != 0) {
                        object6 = ((czh)object6).b;
                        object3 = Duration.ofMillis(((eag)object).c).minus(Duration.ofNanos(((eaf)object3).c));
                        double d2 = Math.abs(((Duration)object3).toMillis());
                        object = (eng)((enc)object6).b.b();
                        boolean bl2 = ((Duration)object3).isNegative();
                        object6 = eio.a(((eip)object2).b).name();
                        object = ((eng)object).j;
                        object4 = ((Enum)object4).name();
                        ((fsu)object.a()).b(d2, bl2, object5, object6, object4);
                    }
                }
                catch (Throwable throwable) {
                    jns.aj(throwable);
                }
            }
            return jqh2;
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new emy(this.j, this.f, this.g, this.h, this.i, jqb2);
        ((emy)jqb2).m = object;
        return jqb2;
    }
}

