/*
 * Decompiled with CFR 0.152.
 */
final class evg
extends jqs
implements jro {
    int a;
    final evi b;
    final ecp c;
    final eae d;
    private Object e;

    public evg(evi evi2, ecp ecp2, eae eae2, jqb jqb2) {
        this.b = evi2;
        this.c = ecp2;
        this.d = eae2;
        super(2, jqb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable2;
        block6: {
            jqh jqh2 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
                break block6;
            }
            jns.ak(object);
            object = (jvb)this.e;
            Object object2 = this.b;
            object = new fbx(object2, this.c, this.d, 1);
            try {
                object = fxf.ag((Runnable)object, ((evi)object2).f);
                this.a = 1;
                object = object2 = jsd.l((hpn)object, this);
                if (object2 != jqh2) break block6;
                return jqh2;
            }
            catch (Throwable throwable2) {}
        }
        object = (Void)object;
        object = jns.aj(throwable2);
        object = joe.a(object);
        if (object != null) {
            ((heg)((heg)evi.a.g().h(hfo.a, "ALT.GrpcARCRespSender")).i((Throwable)object).j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1$4", "invokeSuspend", 116, "StreamListeningSessionResponseSender.kt")).r("#audio# sending audio accessor failed");
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new evg(this.b, this.c, this.d, jqb2);
        ((evg)jqb2).e = object;
        return jqb2;
    }
}

