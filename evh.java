/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class evh
extends jqs
implements jro {
    Object a;
    int b;
    final evi c;
    private Object d;

    public evh(evi evi2, jqb jqb2) {
        this.c = evi2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2;
        block19: {
            block18: {
                block17: {
                    block14: {
                        Object object2;
                        Object object3;
                        Object object4;
                        Object object5;
                        block15: {
                            block16: {
                                block11: {
                                    block12: {
                                        block13: {
                                            jqh2 = jqh.a;
                                            int n2 = this.b;
                                            if (n2 == 0) break block11;
                                            if (n2 == 1) break block12;
                                            if (n2 == 2) break block13;
                                            jns.ak(object);
                                            break block14;
                                        }
                                        object5 = this.a;
                                        object4 = (jvb)this.d;
                                        jns.ak(object);
                                        object3 = object;
                                        object = object4;
                                        break block15;
                                    }
                                    object4 = (jvb)this.d;
                                    jns.ak(object);
                                    object5 = object;
                                    object = object4;
                                    break block16;
                                }
                                jns.ak(object);
                                object = (jvb)this.d;
                                object4 = this.c;
                                object3 = crh.X(eun.a.l());
                                object5 = idi.H(hwh.a.l()).s();
                                jse.e(object5, "value");
                                object2 = (hwp)((bzq)object3).a;
                                if (!((hwp)object2).b.B()) {
                                    ((hwp)object2).u();
                                }
                                object2 = (eun)((hwp)object2).b;
                                object5.getClass();
                                ((eun)object2).c = object5;
                                ((eun)object2).b = 9;
                                if (joe.a(((evi)object4).f(((bzq)object3).I())) != null) break block17;
                                object5 = this.c;
                                this.d = object;
                                this.b = 1;
                                if ((object5 = ((evi)object5).b(this)) == jqh2) break block18;
                            }
                            object5 = (ecp)object5;
                            if (object5 == null) break block17;
                            object4 = this.c;
                            this.d = object;
                            this.a = object5;
                            this.b = 2;
                            object3 = ((evi)object4).a(this);
                            if (object3 == jqh2) break block18;
                        }
                        object4 = (eae)object3;
                        if (object4 == null) break block17;
                        evi evi2 = this.c;
                        object2 = crh.X(eun.a.l());
                        object3 = euf.t(euk.a.l());
                        Object object6 = object5.f();
                        ((cxt)object3).K((ear)evi2.b.a(object6));
                        object6 = (hwp)((cxt)object3).a;
                        if (!((hwp)object6).b.B()) {
                            ((hwp)object6).u();
                        }
                        object6 = (euk)((hwp)object6).b;
                        ((euk)object6).e = object4;
                        ((euk)object6).b |= 4;
                        object6 = dpf.u(edf.a.l());
                        ((cxt)object6).y(((Number)((gtt)evi2.c).a).intValue());
                        ((cxt)object3).J(((cxt)object6).x());
                        boolean bl2 = object5.d().g();
                        object6 = (hwp)((cxt)object3).a;
                        if (!((hwp)object6).b.B()) {
                            ((hwp)object6).u();
                        }
                        object6 = (euk)((hwp)object6).b;
                        ((euk)object6).b |= 8;
                        ((euk)object6).f = bl2;
                        ((bzq)object2).M(((cxt)object3).I());
                        if (joe.a(evi2.f(((bzq)object2).I())) != null) break block17;
                        object3 = new ArrayList<jwi>();
                        if (object5.a().g()) {
                            object3.add(jse.ah((jvb)object, null, null, new evg(this.c, (ecp)object5, (eae)object4, null), 3));
                        } else if (object5.b().g()) {
                            object3.add(jse.ah((jvb)object, null, null, new bes(this.c, (ecp)object5, null, 14), 3));
                        }
                        if (object5.d().g()) {
                            object3.add(jse.ah((jvb)object, null, null, new bes(this.c, (ecp)object5, null, 15, null), 3));
                        }
                        if (object5.c().g()) {
                            object4 = this.c;
                            object3.add(jse.ah((jvb)object, null, null, new bes((evi)object4, (ecp)object5, null, 16, null), 3));
                        } else {
                            ((heg)evi.a.f().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1", "invokeSuspend", 140, "StreamListeningSessionResponseSender.kt")).r("#audio# No first byte read result, send empty");
                            object2 = this.c;
                            object4 = crh.X(eun.a.l());
                            ((bzq)object4).L(dox.j(eag.a.l()).r());
                            ((evi)object2).f(((bzq)object4).I());
                        }
                        object3.add(jse.ah((jvb)object, null, null, new bes(this.c, (ecp)object5, null, 17, null), 3));
                        object3.add(jse.ah((jvb)object, null, null, new esz(this.c, null, 5), 3));
                        this.d = null;
                        this.a = null;
                        this.b = 3;
                        object5 = jse.ai(object3, this);
                        object = jqh2;
                        if (object5 == object) break block19;
                    }
                    ((heg)evi.a.f().h(hfo.a, "ALT.GrpcARCRespSender").j("com/google/android/libraries/search/audio/service/impl/StreamListeningSessionResponseSender$startInternal$1", "invokeSuspend", 149, "StreamListeningSessionResponseSender.kt")).r("#audio# Completing sending data to the remote client");
                    this.c.h();
                    return jon.a;
                }
                return jon.a;
            }
            object = jqh2;
        }
        return jqh2;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new evh(this.c, jqb2);
        ((evh)jqb2).d = object;
        return jqb2;
    }
}

