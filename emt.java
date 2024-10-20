/*
 * Decompiled with CFR 0.152.
 */
final class emt
extends jqs
implements jro {
    int a;
    final emv b;
    final eip c;
    final long d;
    final Object e;
    private Object f;
    private final int g;

    public emt(emv emv2, eip eip2, long l2, eaj eaj2, jqb jqb2, int n2) {
        this.g = n2;
        this.b = emv2;
        this.c = eip2;
        this.d = l2;
        this.e = eaj2;
        super(2, jqb2);
    }

    public emt(emv emv2, eip eip2, long l2, ecu ecu2, jqb jqb2, int n2) {
        this.g = n2;
        this.b = emv2;
        this.c = eip2;
        this.d = l2;
        this.e = ecu2;
        super(2, jqb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable3;
        Object object2;
        Object object3;
        block18: {
            if (this.g != 0) {
                Throwable throwable22;
                Object object4;
                Object object5;
                block17: {
                    object5 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(object);
                        break block17;
                    }
                    jns.ak(object);
                    object = (jvb)this.f;
                    object = this.e;
                    try {
                        object = ((eai)object.d()).a();
                        this.a = 1;
                        object = object4 = jsd.l((hpn)object, this);
                        if (object4 != object5) break block17;
                        return object5;
                    }
                    catch (Throwable throwable22) {}
                }
                object = (eas)object;
                object = jns.aj(throwable22);
                object4 = elb.a(ebp.a, ebv.a);
                object5 = object;
                if (object instanceof jod) {
                    object5 = object4;
                }
                emv emv2 = this.b;
                object4 = this.c;
                long l2 = this.d;
                eas eas2 = (eas)object5;
                jse.b(eas2);
                jse.e(object4, "clientInfo");
                jse.e(eas2, "status");
                Object object6 = dxt.i;
                jse.d(object6, "AUDIO_STOP_LISTENING_DONE");
                object5 = eas2.c;
                object = object5;
                if (object5 == null) {
                    object = ebq.a;
                }
                jse.d(object, "getAudioSourceClosingStatus(...)");
                dyj dyj2 = emv.E((dyn)object6, (ebq)object);
                emv.G(dyj2, l2);
                gpm gpm2 = emv.a;
                object6 = kco.c;
                object5 = ebv.b(eas2.d);
                object = object5;
                if (object5 == null) {
                    object = ebv.a;
                }
                jse.d(object, "getStopListeningReason(...)");
                dyj2.u(gpm2, emv.B((eip)object4, (kco)object6, (ebv)object, null));
                emv2.y(dyj2, (eip)object4);
                return jon.a;
            }
            object3 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
                break block18;
            }
            jns.ak(object);
            object = (jvb)this.f;
            object = this.e;
            try {
                object = object.a().a();
                this.a = 1;
                object = object2 = jsd.l((hpn)object, this);
                if (object2 != object3) break block18;
                return object3;
            }
            catch (Throwable throwable3) {}
        }
        object = (ecy)object;
        object = jns.aj(throwable3);
        object2 = elb.g(ebp.a, ebv.a);
        object3 = object;
        if (object instanceof jod) {
            object3 = object2;
        }
        object2 = this.b;
        eip eip2 = this.c;
        long l3 = this.d;
        ecy ecy2 = (ecy)object3;
        jse.b(ecy2);
        jse.e(eip2, "clientInfo");
        jse.e(ecy2, "status");
        Object object7 = dxt.i;
        jse.d(object7, "AUDIO_STOP_LISTENING_DONE");
        object3 = ecy2.c;
        object = object3;
        if (object3 == null) {
            object = ebq.a;
        }
        jse.d(object, "getAudioSourceClosingStatus(...)");
        dyj dyj3 = emv.E((dyn)object7, (ebq)object);
        emv.G(dyj3, l3);
        object7 = emv.a;
        kco kco2 = kco.b;
        object3 = ebv.b(ecy2.d);
        object = object3;
        if (object3 == null) {
            object = ebv.a;
        }
        jse.d(object, "getStopListeningReason(...)");
        dyj3.u((gpm)object7, emv.B(eip2, kco2, (ebv)object, (int)l3));
        ((emv)object2).y(dyj3, eip2);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.g != 0) {
            object = ((jqm)this).c((jvb)object, (jqb)object2);
            object2 = jon.a;
            return ((emt)object).a(object2);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((emt)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.g != 0) {
            jqb2 = new emt(this.b, this.c, this.d, (eaj)this.e, jqb2, 1);
            ((emt)jqb2).f = object;
            return jqb2;
        }
        jqb2 = new emt(this.b, this.c, this.d, (ecu)this.e, jqb2, 0);
        ((emt)jqb2).f = object;
        return jqb2;
    }
}

