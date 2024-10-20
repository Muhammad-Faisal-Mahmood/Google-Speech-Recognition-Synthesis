/*
 * Decompiled with CFR 0.152.
 */
public final class emu
extends jqs
implements jro {
    int a;
    final eip b;
    final Integer c;
    final eaz d;
    final hpn e;
    final Object f;
    private Object g;
    private final int h;

    public emu(czh czh2, eip eip2, Integer n2, eaz eaz2, hpn hpn2, jqb jqb2, int n3) {
        this.h = n3;
        this.f = czh2;
        this.b = eip2;
        this.c = n2;
        this.d = eaz2;
        this.e = hpn2;
        super(2, jqb2);
    }

    public emu(emv emv2, eip eip2, Integer n2, eaz eaz2, hpn hpn2, jqb jqb2, int n3) {
        this.h = n3;
        this.f = emv2;
        this.b = eip2;
        this.c = n2;
        this.d = eaz2;
        this.e = hpn2;
        super(2, jqb2);
    }

    public emu(emv emv2, eip eip2, Integer n2, eaz eaz2, hpn hpn2, jqb jqb2, int n3, byte[] byArray) {
        this.h = n3;
        this.f = emv2;
        this.b = eip2;
        this.c = n2;
        this.d = eaz2;
        this.e = hpn2;
        super(2, jqb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable4;
        Object object2;
        Object object3;
        block25: {
            int n2 = this.h;
            if (n2 != 0) {
                Throwable throwable22;
                Object object4;
                Object object5;
                block24: {
                    if (n2 != 1) {
                        Throwable throwable32;
                        Object object6;
                        Object object7;
                        block23: {
                            object7 = jqh.a;
                            if (this.a != 0) {
                                jns.ak(object);
                                break block23;
                            }
                            jns.ak(object);
                            object = (jvb)this.g;
                            object = this.e;
                            try {
                                this.a = 1;
                                object = object6 = jsd.l((hpn)object, this);
                                if (object6 != object7) break block23;
                                return object7;
                            }
                            catch (Throwable throwable32) {}
                        }
                        object = object7 = ebo.b(((eax)object).c);
                        if (object7 == null) {
                            object = ebo.a;
                        }
                        object = jns.aj(throwable32);
                        boolean bl2 = object instanceof jod;
                        object7 = ebo.y;
                        if (bl2) {
                            object = object7;
                        }
                        jse.d(object, "getOrDefault(...)");
                        object6 = this.f;
                        eip eip2 = this.b;
                        Integer n3 = this.c;
                        object7 = this.d;
                        ((czh)object6).a.r(eip2, n3, (eaz)object7, (ebo)object);
                        return jon.a;
                    }
                    object5 = jqh.a;
                    if (this.a != 0) {
                        jns.ak(object);
                        break block24;
                    }
                    jns.ak(object);
                    object = (jvb)this.g;
                    object = this.e;
                    try {
                        this.a = 1;
                        object = object4 = jsd.l((hpn)object, this);
                        if (object4 != object5) break block24;
                        return object5;
                    }
                    catch (Throwable throwable22) {}
                }
                object = object5 = ebg.b(((eav)object).c);
                if (object5 == null) {
                    object = ebg.a;
                }
                object = jns.aj(throwable22);
                boolean bl3 = object instanceof jod;
                object5 = ebg.G;
                if (bl3) {
                    object = object5;
                }
                jse.d(object, "getOrDefault(...)");
                object4 = this.f;
                eip eip3 = this.b;
                object5 = this.c;
                eaz eaz2 = this.d;
                ebg ebg2 = (ebg)object;
                jse.e(eip3, "clientInfo");
                jse.e(eaz2, "audioRouteType");
                jse.e(ebg2, "reason");
                object = dxt.d;
                jse.d(object, "AUDIO_ROUTE_DISCONNECT_DONE");
                object = ((dyn)object).a(ebg2.J, "disconnect_route_reason");
                ((dyj)object).r("route_disconnect", emv.C((Integer)object5));
                ((dyj)object).u(emv.a, emv.z(eip3, eaz2));
                ((emv)object4).y((dyj)object, eip3);
                return jon.a;
            }
            object3 = jqh.a;
            if (this.a != 0) {
                jns.ak(object);
                break block25;
            }
            jns.ak(object);
            object = (jvb)this.g;
            object = this.e;
            try {
                this.a = 1;
                object = object2 = jsd.l((hpn)object, this);
                if (object2 != object3) break block25;
                return object3;
            }
            catch (Throwable throwable4) {}
        }
        object = object3 = ebo.b(((eax)object).c);
        if (object3 == null) {
            object = ebo.a;
        }
        object = jns.aj(throwable4);
        boolean bl4 = object instanceof jod;
        object3 = ebo.y;
        if (bl4) {
            object = object3;
        }
        jse.d(object, "getOrDefault(...)");
        object3 = this.f;
        eip eip4 = this.b;
        object2 = this.c;
        eaz eaz3 = this.d;
        object = (ebo)object;
        jse.e(eip4, "clientInfo");
        jse.e(eaz3, "audioRouteType");
        jse.e(object, "status");
        dyn dyn2 = dxt.b;
        jse.d(dyn2, "AUDIO_ROUTE_CONNECT_DONE");
        object = emv.F(dyn2, (ebo)object);
        ((dyj)object).r("route_connect", emv.C((Integer)object2));
        ((dyj)object).u(emv.a, emv.z(eip4, eaz3));
        ((emv)object3).y((dyj)object, eip4);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.h;
        if (n2 != 0) {
            if (n2 != 1) {
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((emu)object).a(object2);
            }
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((emu)object2).a(object);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((emu)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.h;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2 = this.f;
                eip eip2 = this.b;
                Integer n3 = this.c;
                eaz eaz2 = this.d;
                hpn hpn2 = this.e;
                jqb2 = new emu((czh)object2, eip2, n3, eaz2, hpn2, jqb2, 2);
                ((emu)jqb2).g = object;
                return jqb2;
            }
            Object object3 = this.f;
            eip eip3 = this.b;
            Integer n4 = this.c;
            eaz eaz3 = this.d;
            hpn hpn3 = this.e;
            jqb2 = new emu((emv)object3, eip3, n4, eaz3, hpn3, jqb2, 1, null);
            ((emu)jqb2).g = object;
            return jqb2;
        }
        Object object4 = this.f;
        eip eip4 = this.b;
        Integer n5 = this.c;
        eaz eaz4 = this.d;
        hpn hpn4 = this.e;
        jqb2 = new emu((emv)object4, eip4, n5, eaz4, hpn4, jqb2, 0);
        ((emu)jqb2).g = object;
        return jqb2;
    }
}

