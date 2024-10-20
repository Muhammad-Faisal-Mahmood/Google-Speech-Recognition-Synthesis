/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ekg {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry");
    private final eqe b;
    private final List c;
    private final eqe d;
    private final dtu e;
    private final dtu f;
    private final czh g;

    public ekg(dtu dtu2, dtu dtu3, czh czh2, eqe eqe2, eqe eqe3) {
        jse.e(dtu2, "tokenGenerator");
        this.e = dtu2;
        this.f = dtu3;
        this.g = czh2;
        this.d = eqe2;
        this.b = eqe3;
        this.c = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekd a(eam object) {
        synchronized (this) {
            Object object2;
            jse.e(object, "params");
            int n2 = this.e.h();
            Object object3 = a;
            ((heg)((hdz)object3).f().h(hfo.a, "ALT.ClientsRegy").j("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "activateAudioClient", 59, "ClientsRegistry.kt")).x("#audio# activating audio client(token(%d), %s)", n2, cqq.as((eam)object));
            jse.e(object, "params");
            Object object4 = dox.o(ece.a.l());
            ((bzo)object4).B(ech.b);
            ((bzo)object4).D(n2);
            jse.e(object, "value");
            Object object5 = ((bzo)object4).a;
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            Object object6 = this.g;
            object5 = (ece)((hwp)object5).b;
            object.getClass();
            ((ece)object5).d = object;
            ((ece)object5).c = 200;
            object4 = ((bzo)object4).y();
            ((evo)((czh)object6).d).d((ece)object4);
            object4 = object5 = ((eam)object).c;
            if (object5 == null) {
                object4 = eip.a;
            }
            ((enc)((czh)object6).b).e((eip)object4, "AUDIO_REQUEST");
            ((heg)((hdz)object3).f().h(hfo.a, "ALT.ClientsRegy").j("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "enforceConcurrencyStateOnNewAudioClient", 81, "ClientsRegistry.kt")).A("#audio# enforcing concurrency state on a new client(%s, token(%d))", cqq.as((eam)object), n2);
            object4 = this.c;
            object3 = new ArrayList();
            Iterator iterator = object4.iterator();
            while (iterator.hasNext()) {
                object2 = iterator.next();
                object6 = (eke)object2;
                object4 = object5 = eal.b(((eam)object).d);
                if (object5 == null) {
                    object4 = eal.a;
                }
                jse.d(object4, "getIntent(...)");
                object5 = object6 = eal.b(((eke)object6).b.d);
                if (object6 == null) {
                    object5 = eal.a;
                }
                jse.d(object5, "getIntent(...)");
                int n3 = ((Enum)object4).ordinal();
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            object = new joa();
                            throw object;
                        }
                        if (object5 == eal.b) continue;
                    } else if (object5 != eal.b) continue;
                } else if (object5 == eal.b) continue;
                object3.add(object2);
            }
            object4 = object3.iterator();
            while (object4.hasNext()) {
                this.c(((eke)object4.next()).a, eap.d);
            }
            object4 = new jur();
            object3 = this.f;
            object2 = jsd.k((jvi)object4);
            object6 = (czh)((dtu)object3).b.b();
            object6.getClass();
            ((dtu)object3).c.b();
            object5 = new eka(n2, (hpn)object2, (czh)object6);
            boolean bl2 = n2 == -1;
            object6 = new eke((eka)object5, n2, (eam)object, (jur)object4, bl2);
            this.d.s(cqq.au((ekd)object6));
            this.c.add(object6);
            return object6;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekd b(Integer object) {
        synchronized (this) {
            eke eke22;
            block4: {
                for (eke eke22 : this.c) {
                    if (((eke)eke22).a != (Integer)object) continue;
                    break block4;
                }
                eke22 = null;
            }
            eke22 = eke22;
            if (eke22 == null) return new ekf((Integer)object, dpf.g((hwr)eam.a.l()).h());
            return eke22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n2, eap object) {
        synchronized (this) {
            Object object2;
            Object object32;
            block6: {
                jse.e(object, "status");
                for (Object object32 : this.c) {
                    if (((eke)object32).a != n2) continue;
                    break block6;
                }
                object32 = null;
            }
            eke eke2 = (eke)object32;
            if (eke2 == null) {
                object = this.g;
                object2 = eap.b;
                jse.e(object2, "status");
                object32 = dox.o(ece.a.l());
                ((bzo)object32).B(ech.c);
                ((bzo)object32).D(n2);
                ((bzo)object32).A((eap)object2);
                object32 = ((bzo)object32).y();
                ((evo)((czh)object).d).d((ece)object32);
                return;
            }
            object32 = this.c;
            object2 = new epl(n2, 1);
            jns.E((List)object32, (jrk)object2);
            Object object4 = (heg)a.f().h(hfo.a, "ALT.ClientsRegy").j("com/google/android/libraries/search/audio/clients/registry/ClientsRegistry", "markDeactivated", 121, "ClientsRegistry.kt");
            Object object5 = ((Enum)object).name();
            object32 = object2 = eke2.b.c;
            if (object2 == null) {
                object32 = eip.a;
            }
            n2 = eke2.a;
            jse.d(object32, "getClientInfo(...)");
            object2 = crh.O((eip)object32);
            object32 = new StringBuilder();
            ((StringBuilder)object32).append("client(token(");
            ((StringBuilder)object32).append(n2);
            ((StringBuilder)object32).append("), ");
            ((StringBuilder)object32).append((String)object2);
            ((StringBuilder)object32).append(")");
            object4.C("#audio# deactivating(%s) %s", object5, ((StringBuilder)object32).toString());
            object4 = this.g;
            object32 = eke2.b;
            n2 = eke2.a;
            jse.e(object, "status");
            jse.e(object32, "params");
            object5 = dox.o(ece.a.l());
            ((bzo)object5).B(ech.c);
            ((bzo)object5).D(n2);
            ((bzo)object5).A((eap)object);
            object32 = object2 = ((eam)object32).c;
            if (object2 == null) {
                object32 = eip.a;
            }
            object2 = ((czh)object4).d;
            ((bzo)object5).C((eip)object32);
            object32 = ((bzo)object5).y();
            ((evo)object2).d((ece)object32);
            object32 = dox.l(eaq.a.l());
            ((bzq)object32).C((eap)object);
            object32 = ((bzq)object32).B();
            eke2.c.O(object32);
            object2 = this.d;
            object5 = cqq.au(eke2);
            n2 = ((Enum)object).ordinal();
            object32 = n2 != 3 ? (n2 != 6 ? ebg.f : ebg.I) : ebg.A;
            ((eqe)object2).q((etp)object5, (ebg)object32);
            object32 = this.b;
            object2 = cqq.at(eke2);
            n2 = ((Enum)object).ordinal();
            object = n2 != 3 ? (n2 != 6 ? ebv.f : ebv.r) : ebv.i;
            ((eqe)object32).f((epc)object2, (ebv)object);
            return;
        }
    }
}

