/*
 * Decompiled with CFR 0.152.
 */
final class emq
extends jqs
implements jro {
    int a;
    final emv b;
    final eip c;
    final int d;
    final efj e;
    private Object f;
    private final int g;

    public emq(emv emv2, eip eip2, int n2, efj efj2, jqb jqb2, int n3) {
        this.g = n3;
        this.b = emv2;
        this.c = eip2;
        this.d = n2;
        this.e = efj2;
        super(2, jqb2);
    }

    public emq(emv emv2, eip eip2, int n2, efj efj2, jqb jqb2, int n3, byte[] byArray) {
        this.g = n3;
        this.b = emv2;
        this.c = eip2;
        this.d = n2;
        this.e = efj2;
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
        int n2;
        int n3;
        int n4;
        block16: {
            n4 = this.g;
            n3 = 1;
            n2 = 1;
            if (n4 != 0) {
                Throwable throwable22;
                Object object4;
                Object object5;
                block15: {
                    object5 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(object);
                        break block15;
                    }
                    jns.ak(object);
                    object = (jvb)this.f;
                    object = this.e;
                    try {
                        object = ((efj)object).a();
                        jse.d(object, "getAcquireAudioFocusStatus(...)");
                        this.a = 1;
                        object = object4 = jsd.l((hpn)object, this);
                        if (object4 != object5) break block15;
                        return object5;
                    }
                    catch (Throwable throwable22) {}
                }
                object = (dzv)object;
                object = jns.aj(throwable22);
                object4 = elb.l(1);
                object5 = object;
                if (object instanceof jod) {
                    object5 = object4;
                }
                object = this.b;
                object4 = this.c;
                n4 = this.d;
                dzv dzv2 = (dzv)object5;
                jse.b(dzv2);
                jse.e(object4, "clientInfo");
                jse.e(dzv2, "status");
                object5 = dxt.r;
                jse.d(object5, "AUDIO_FOCUS_ACQUIRE_DONE");
                n3 = dox.e(dzv2.c);
                if (n3 == 0) {
                    n3 = n2;
                }
                object5 = ((dyn)object5).a(n3 - 1, "audio_focus_acquire_status");
                ((dyj)object5).r("focus_acquire", String.valueOf(n4));
                ((emv)object).y((dyj)object5, (eip)object4);
                return jon.a;
            }
            object3 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
                break block16;
            }
            jns.ak(object);
            object = (jvb)this.f;
            object = this.e;
            try {
                object = ((efj)object).b();
                jse.d(object, "getReleaseAudioFocusStatus(...)");
                this.a = 1;
                object = object2 = jsd.l((hpn)object, this);
                if (object2 != object3) break block16;
                return object3;
            }
            catch (Throwable throwable3) {}
        }
        object = (dzy)object;
        object = jns.aj(throwable3);
        object2 = elb.m(1);
        object3 = object;
        if (object instanceof jod) {
            object3 = object2;
        }
        object = this.b;
        object2 = this.c;
        n4 = this.d;
        object3 = (dzy)object3;
        jse.b(object3);
        jse.e(object2, "clientInfo");
        jse.e(object3, "status");
        dyn dyn2 = dxt.t;
        jse.d(dyn2, "AUDIO_FOCUS_RELEASE_DONE");
        n2 = dox.c(((dzy)object3).c);
        if (n2 != 0) {
            n3 = n2;
        }
        object3 = dyn2.a(n3 - 1, "audio_focus_release_status");
        ((dyj)object3).r("focus_release", String.valueOf(n4));
        ((emv)object).y((dyj)object3, (eip)object2);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.g != 0) {
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((emq)object2).a(object);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((emq)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.g != 0) {
            jqb2 = new emq(this.b, this.c, this.d, this.e, jqb2, 1, null);
            ((emq)jqb2).f = object;
            return jqb2;
        }
        jqb2 = new emq(this.b, this.c, this.d, this.e, jqb2, 0);
        ((emq)jqb2).f = object;
        return jqb2;
    }
}

