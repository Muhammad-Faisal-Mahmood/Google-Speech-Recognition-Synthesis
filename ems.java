/*
 * Decompiled with CFR 0.152.
 */
final class ems
extends jqs
implements jro {
    int a;
    final emv b;
    final eip c;
    final long d;
    final ekk e;
    final ecu f;
    private Object g;

    public ems(emv emv2, eip eip2, long l2, ekk ekk2, ecu ecu2, jqb jqb2) {
        this.b = emv2;
        this.c = eip2;
        this.d = l2;
        this.e = ekk2;
        this.f = ecu2;
        super(2, jqb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        block16: {
            Throwable throwable3;
            Object var6_6;
            block13: {
                jqh jqh2;
                block15: {
                    Object object2;
                    block14: {
                        jqh2 = jqh.a;
                        int n2 = this.a;
                        var6_6 = null;
                        if (n2 != 0) {
                            if (n2 != 1) {
                                jns.ak(object);
                                break block13;
                            }
                            object2 = (jvb)this.g;
                            jns.ak(object);
                            break block14;
                        }
                        jns.ak(object);
                        object = (jvb)this.g;
                        object2 = this.f;
                        object2 = object2.c();
                        this.g = object;
                        this.a = 1;
                        object = jsd.l((hpn)object2, this);
                        if (object == jqh2) break block15;
                    }
                    try {
                        object = (ecs)object;
                    }
                    catch (Throwable throwable2) {
                        object = jns.aj(throwable2);
                    }
                    Object object3 = ekr.d(ebs.a);
                    object2 = object;
                    if (object instanceof jod) {
                        object2 = object3;
                    }
                    emv emv2 = this.b;
                    object3 = this.c;
                    long l2 = this.d;
                    ecs ecs2 = (ecs)object2;
                    object = ecs2.f();
                    jse.d(object, "<get-startListeningStatus>(...)");
                    ekk ekk2 = this.e;
                    jse.e(object3, "clientInfo");
                    jse.e(object, "status");
                    dyo dyo2 = dxt.f;
                    jse.d(dyo2, "AUDIO_START_LISTENING_DONE");
                    object = object2 = ((ecx)object).c;
                    if (object2 == null) {
                        object = ebt.a;
                    }
                    object2 = ekk2.b;
                    jse.d(object, "getAudioSourceOpeningStatus(...)");
                    object = emv.D(dyo2, (ebt)object);
                    emv.G((dyj)object, l2);
                    ((dyj)object).u(emv.a, emv.A((eip)object3, kco.b, (eaz)object2, null));
                    emv2.y((dyj)object, (eip)object3);
                    if (!ecs2.c().g()) break block16;
                    try {
                        object = (hpn)ecs2.c().c();
                        this.g = null;
                        this.a = 2;
                        object = object2 = jsd.l((hpn)object, this);
                        if (object2 != jqh2) break block13;
                    }
                    catch (Throwable throwable3) {}
                }
                return jqh2;
            }
            object = (eag)object;
            object = jns.aj(throwable3);
            if (object instanceof jod) {
                object = var6_6;
            }
            object = (eag)object;
            this.b.x(this.c, this.d);
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new ems(this.b, this.c, this.d, this.e, this.f, jqb2);
        ((ems)jqb2).g = object;
        return jqb2;
    }
}

