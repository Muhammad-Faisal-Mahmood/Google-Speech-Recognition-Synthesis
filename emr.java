/*
 * Decompiled with CFR 0.152.
 */
final class emr
extends jqs
implements jro {
    int a;
    final emv b;
    final eip c;
    final long d;
    final ekk e;
    final eao f;
    final eaj g;
    private Object h;

    public emr(emv emv2, eip eip2, long l2, ekk ekk2, eao eao2, eaj eaj2, jqb jqb2) {
        this.b = emv2;
        this.c = eip2;
        this.d = l2;
        this.e = ekk2;
        this.f = eao2;
        this.g = eaj2;
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
                            object2 = (jvb)this.h;
                            jns.ak(object);
                            break block14;
                        }
                        jns.ak(object);
                        object = (jvb)this.h;
                        object2 = this.g;
                        object2 = object2.c();
                        jse.d(object2, "getStartListeningResult(...)");
                        this.h = object;
                        this.a = 1;
                        object = jsd.l((hpn)object2, this);
                        if (object == jqh2) break block15;
                    }
                    try {
                        object = (eah)object;
                    }
                    catch (Throwable throwable2) {
                        object = jns.aj(throwable2);
                    }
                    Object object3 = ekr.a(ebs.a);
                    object2 = object;
                    if (object instanceof jod) {
                        object2 = object3;
                    }
                    object3 = this.b;
                    eip eip2 = this.c;
                    long l2 = this.d;
                    eah eah2 = (eah)object2;
                    object = eah2.f();
                    jse.d(object, "<get-startListeningStatus>(...)");
                    ekk ekk2 = this.e;
                    object2 = ewl.a;
                    ecq ecq2 = ewl.b(this.e, this.f);
                    jse.e(eip2, "clientInfo");
                    jse.e(object, "status");
                    dyo dyo2 = dxt.f;
                    jse.d(dyo2, "AUDIO_START_LISTENING_DONE");
                    object = object2 = ((ear)object).c;
                    if (object2 == null) {
                        object = ebt.a;
                    }
                    object2 = ekk2.b;
                    jse.d(object, "getAudioSourceOpeningStatus(...)");
                    object = emv.D(dyo2, (ebt)object);
                    emv.G((dyj)object, l2);
                    ((dyj)object).u(emv.a, emv.A(eip2, kco.c, (eaz)object2, ecq2));
                    ((emv)object3).y((dyj)object, eip2);
                    if (!eah2.c().g()) break block16;
                    try {
                        object = (hpn)eah2.c().c();
                        this.h = null;
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
        jqb2 = new emr(this.b, this.c, this.d, this.e, this.f, this.g, jqb2);
        ((emr)jqb2).h = object;
        return jqb2;
    }
}

