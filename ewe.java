/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;

public final class ewe
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    final Object d;
    final Object e;
    private Object f;
    private final int g;

    public ewe(Duration duration, String string, elo elo2, elp elp2, jqb jqb2, int n2) {
        this.g = n2;
        this.b = duration;
        this.e = string;
        this.d = elo2;
        this.c = elp2;
        super(2, jqb2);
    }

    public ewe(jqb jqb2, ewg ewg2, efs efs2, ecp ecp2, jqz jqz2, int n2) {
        this.g = n2;
        this.b = ewg2;
        this.c = efs2;
        this.d = ecp2;
        this.e = jqz2;
        super(2, jqb2);
    }

    public ewe(jqb jqb2, ewg ewg2, jqz jqz2, efs efs2, ecp ecp2, int n2) {
        this.g = n2;
        this.b = ewg2;
        this.e = jqz2;
        this.c = efs2;
        this.d = ecp2;
        super(2, jqb2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        int n2 = this.g;
        if (n2 != 0) {
            void var1_21;
            Object object2;
            if (n2 != 1) {
                jqh jqh2 = jqh.a;
                n2 = this.a;
                jns.ak(object);
                if (n2 == 0) {
                    jvb jvb2 = (jvb)this.f;
                    ((heg)ewg.a.c().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore$startStoring$lambda$7$$inlined$launchPropagatingLegacy$default$2", "invokeSuspend", 99, "SessionAudioStore.kt")).s("#audio# starting storing session(%s) MIC accessor audio...", ((ewg)this.b).h);
                    Object object3 = this.b;
                    hpn hpn2 = fxf.ag(new ewh(new al(object3, this.c, this.d, 6, null)), ((ewg)object3).c);
                    this.a = 1;
                    if (jsd.l(hpn2, this) == jqh2) {
                        return jqh2;
                    }
                }
                this.e.a();
                return jon.a;
            }
            jqh jqh3 = jqh.a;
            if (this.a != 0) {
                jvb jvb3 = (jvb)this.f;
                jns.ak(object);
                jvb jvb4 = jvb3;
            } else {
                void var9_32;
                void var1_15;
                jns.ak(object);
                object2 = (jvb)this.f;
                Object object4 = this.b;
                this.f = object2;
                this.a = 1;
                Duration duration = (Duration)object4;
                long l2 = jsl.l(duration.getSeconds(), jty.d);
                long l3 = duration.getNano();
                jty jty2 = jty.a;
                jse.e((Object)jty2, "unit");
                if (jty2.compareTo(jty.d) <= 0) {
                    long l4 = jsl.h(l3, jty2, jty.a);
                    l3 = jtw.a;
                    n2 = jtx.a;
                    l3 = l4 + l4;
                } else {
                    l3 = jsl.l(l3, jty2);
                }
                l2 = jtw.b(l2, l3);
                l3 = 0L;
                if (l2 > 0L) {
                    l3 = jtw.b(l2, jsl.l(999999L, jty.a));
                    if (jtw.d(l3) && jtw.c(l3)) {
                        l3 = jtw.a(l3);
                    } else {
                        jty jty3 = jty.c;
                        jse.e((Object)jty3, "unit");
                        if (l3 == jtw.a) {
                            l3 = Long.MAX_VALUE;
                        } else if (l3 == jtw.b) {
                            l3 = Long.MIN_VALUE;
                        } else {
                            void var1_12;
                            if (jtw.e(l3)) {
                                jty jty4 = jty.a;
                            } else {
                                jty jty5 = jty.c;
                            }
                            l3 = jsl.g(jtw.a(l3), (jty)var1_12, jty3);
                        }
                    }
                }
                Object object5 = jvf.d(l3, this);
                jqh jqh4 = jqh.a;
                Object object6 = object5;
                if (object5 != jqh4) {
                    jon jon2 = jon.a;
                }
                void var9_30 = var1_15;
                if (var1_15 != jqh4) {
                    jon jon3 = jon.a;
                }
                if (var9_32 == jqh3) {
                    jqh jqh5 = jqh3;
                    return var1_21;
                }
                Object object7 = object2;
            }
            ((heg)elp.a.h().h(hfo.a, "ALT.TimeoutTracker").j("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl$launchNewTimeout$1", "invokeSuspend", 51, "TimeoutTrackerImpl.kt")).u("#audio# on timeout(token(%s))", this.e);
            this.d.a();
            object2 = this.c;
            Object object8 = this.e;
            Object object9 = ((elp)object2).b;
            synchronized (object9) {
                void var1_18;
                jwi jwi2 = (jwi)var1_18.bA().get(jwi.c);
                if (jwi2 == null || jwi2.s()) {
                    ((elp)object2).c.remove(object8);
                }
            }
            jon jon4 = jon.a;
            return var1_21;
        }
        jqh jqh6 = jqh.a;
        if (this.a != 0) {
            jns.ak(object);
        } else {
            jns.ak(object);
            jvb jvb5 = (jvb)this.f;
            ((heg)ewg.a.c().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore$startStoring$lambda$7$$inlined$launchPropagatingLegacy$default$1", "invokeSuspend", 93, "SessionAudioStore.kt")).s("#audio# starting storing session(%s) MIC audio...", ((ewg)this.b).h);
            Object object10 = this.b;
            Object object11 = this.c;
            Object object12 = this.d;
            object11 = crh.R((efs)object11);
            dzl dzl2 = (dzl)object12.b().c();
            jvi jvi2 = ((ewg)object10).b((String)object11, dzl2);
            this.a = 1;
            if (((jwp)((Object)jvi2)).y(this) == jqh6) {
                return jqh6;
            }
        }
        this.e.a();
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.g;
        if (n2 != 0) {
            if (n2 != 1) {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((ewe)object).a(object2);
            }
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((ewe)object2).a(object);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((ewe)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.g;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2 = this.b;
                Object object3 = this.e;
                Object object4 = this.c;
                Object object5 = this.d;
                object4 = (efs)object4;
                jqb2 = new ewe(jqb2, (ewg)object2, (jqz)object3, (efs)object4, (ecp)object5, 2);
                ((ewe)jqb2).f = object;
                return jqb2;
            }
            Object object6 = this.b;
            Object object7 = this.e;
            Object object8 = this.d;
            elp elp2 = (elp)this.c;
            object7 = (String)object7;
            jqb2 = new ewe((Duration)object6, (String)object7, (elo)object8, elp2, jqb2, 1);
            ((ewe)jqb2).f = object;
            return jqb2;
        }
        Object object9 = this.b;
        Object object10 = this.c;
        Object object11 = this.d;
        Object object12 = this.e;
        object10 = (efs)object10;
        jqb2 = new ewe(jqb2, (ewg)object9, (efs)object10, (ecp)object11, (jqz)object12, 0);
        ((ewe)jqb2).f = object;
        return jqb2;
    }
}

