/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class eqi
extends jsf
implements jrk {
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public eqi(dtu dtu2, emg emg2, efo efo2, jrk jrk2, int n2) {
        this.e = n2;
        this.a = dtu2;
        this.c = emg2;
        this.d = efo2;
        this.b = jrk2;
        super(1);
    }

    public eqi(eqj eqj2, eqv eqv2, eqm eqm2, eqg eqg2, int n2) {
        this.e = n2;
        this.a = eqj2;
        this.b = eqv2;
        this.c = eqm2;
        this.d = eqg2;
        super(1);
    }

    public eqi(ezs ezs2, ezj ezj2, Optional optional, gto gto2, int n2) {
        this.e = n2;
        this.a = ezs2;
        this.d = ezj2;
        this.b = optional;
        this.c = gto2;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object optional) {
        Object object;
        Object object2;
        Object object32;
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                optional = (Void)((Object)optional);
                jse.d(Optional.empty(), "empty(...)");
                ((Optional)this.b).isPresent();
                optional = csp.a.l();
                jse.e(optional, "builder");
                Object object4 = ((Optional)this.b).get();
                if (!((hwp)((Object)optional)).b.B()) {
                    ((hwp)((Object)optional)).u();
                }
                Object object5 = (csp)((hwp)((Object)optional)).b;
                ((csp)object5).d = ((csn)object4).d;
                ((csp)object5).b |= 2;
                object4 = cso.b;
                jse.e(object4, "value");
                if (!((hwp)((Object)optional)).b.B()) {
                    ((hwp)((Object)optional)).u();
                }
                object5 = (csp)((hwp)((Object)optional)).b;
                ((csp)object5).c = ((cso)object4).d;
                ((csp)object5).b |= 1;
                optional = ((hwp)((Object)optional)).o();
                jse.d(optional, "build(...)");
                optional = Optional.of((csp)((Object)optional));
                object5 = this.a;
                object4 = this.d;
                ezf ezf2 = new ezf(optional);
                optional = (gto)this.c;
                optional = ((gto)((Object)optional)).g() ? Optional.of(((gto)((Object)optional)).c()) : Optional.empty();
                return ((ezs)object5).b.i((ezj)object4, ezf2, optional);
            }
            ebv ebv2 = (ebv)((Object)optional);
            jse.e(ebv2, "it");
            Object object6 = this.c;
            Object object7 = this.d;
            optional = this.b;
            optional = new eme((emg)object6, (efo)object7, ebv2, (jrk)((Object)optional), null, 0);
            ((dtu)this.a).j((jro)((Object)optional));
            return jon.a;
        }
        optional = (eon)((Object)optional);
        jse.e(optional, "source");
        for (Object object32 : ((eqj)this.a).c) {
            Object object8 = this.b;
            object2 = this.c;
            object = optional.b();
            object32.a(new eql(((eqv)object8).a, (eqm)object2, (eae)object));
        }
        object2 = this.a;
        Object object9 = gqk.c(new cqg(optional, 15));
        object32 = this.a;
        object2 = ((eqj)object2).b.b((hnx)object9, ((eqj)object32).a);
        jse.d(object2, "submitAsync(...)");
        object9 = this.a;
        object32 = this.d;
        optional = optional.d().b();
        object = this.b;
        object32 = ((eqg)object32).b;
        jse.e(object32, "clientInfo");
        jse.e(object2, "startResult");
        object = ((eqv)object).b;
        object9 = ((eqj)object9).d;
        ((enc)((czh)object9).b).d((eip)object32, (hpn)object2, ((ekk)object).b);
        ((czh)object9).y("AUDIO", (eip)object32, (hpn)((Object)optional), (hpn)object2);
        optional = new emx((czh)object9, (hpn)((Object)optional), (hpn)object2, null, 1, null);
        jse.ah((jvb)((czh)object9).c, null, null, optional, 3);
        return object2;
    }
}

