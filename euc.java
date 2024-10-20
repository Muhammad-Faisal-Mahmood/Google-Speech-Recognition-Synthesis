/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class euc {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry");
    private static final ety e = new ety(ebs.f, ebp.t, ebg.x, ebo.d, "hotword client doesn't support the specified route");
    private static final List f = jns.f((Object[])new eay[]{eay.f, eay.a, eay.e, eay.g});
    public final dtu b;
    public final czh c;
    public final bzo d;
    private final eqe g;
    private final Executor h;
    private final hou i;
    private final jny j;
    private final eqe k;
    private final eqe l;

    public euc(cqq cqq2, czh czh2, dtu dtu2, bzo bzo2, eqe eqe2, eqe eqe3, Executor executor, hou hou2, eqe eqe4) {
        jse.e(cqq2, "listeningSessionAssembler");
        jse.e(dtu2, "tokenGenerator");
        jse.e(executor, "lightweightExecutor");
        jse.e(hou2, "audioExecutionSequencer");
        this.c = czh2;
        this.b = dtu2;
        this.d = bzo2;
        this.l = eqe2;
        this.g = eqe3;
        this.h = executor;
        this.i = hou2;
        this.k = eqe4;
        this.j = new jog(new eop(this, 9));
    }

    private final List e() {
        return (List)this.j.a();
    }

    private static final eub f(ebg ebg2) {
        return new eub(new ela(ebg2), -1, ekk.a(), dox.i(ebk.a.l()).A());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etz a(ebk var1_1) {
        synchronized (this) {
            block20: {
                jse.e(var1_1, "params");
                var2_2 = this.b.h();
                var7_3 = euc.a;
                ((heg)var7_3.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "connectHotwordRoute$java_com_google_android_libraries_search_audio_routing_registry_hotword_routes_registry", 128, "HotwordRoutesRegistry.kt")).x("#audio# updating hotword to route(token(%d), %s)", var2_2, euf.l((ebk)var1_1));
                jse.e(var1_1, "params");
                var3_5 = var4_4 = var1_1.d;
                if (var4_4 == null) {
                    var3_5 = eip.a;
                }
                var5_6 = this.c;
                ((enc)var5_6.b).e((eip)var3_5, "HOTWORD_ROUTE_UPDATE");
                var3_5 = var4_4 = var1_1.d;
                if (var4_4 == null) {
                    var3_5 = eip.a;
                }
                var4_4 = var5_6.a;
                jse.d(var3_5, "getClientInfo(...)");
                var4_4.n((eip)var3_5, null);
                var3_5 = var5_6.d;
                var4_4 = dox.o(ece.a.l());
                var4_4.B(ech.n);
                jse.e(var1_1, "value");
                var5_6 = var4_4.a;
                if (!((hwp)var5_6).b.B()) {
                    ((hwp)var5_6).u();
                }
                var5_6 = (ece)((hwp)var5_6).b;
                var1_1.getClass();
                var5_6.d = var1_1;
                var5_6.c = 205;
                var4_4.E(var2_2);
                var4_4 = var4_4.y();
                ((evo)var3_5).d((ece)var4_4);
                ((heg)var7_3.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "enforceConcurrencyStateOnNewHotwordRoute", 193, "HotwordRoutesRegistry.kt")).r("#audio# enforcing concurrency state on a new hotword route");
                var3_5 = (eua)jns.l(this.e());
                if (var3_5 != null) {
                    this.d(var3_5.b, ebg.d);
                }
                var5_6 = euc.f;
                var3_5 = var4_4 = var1_1.c;
                if (var4_4 == null) {
                    var3_5 = eaz.a;
                }
                if ((var3_5 = var5_6.contains((Object)eay.a(var3_5.b)) != false ? euc.e : null) == null) {
                    ((heg)var7_3.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "handleHotwordRouteUpdateConditions", 167, "HotwordRoutesRegistry.kt")).x("#audio# hotword route(token(%d), %s) OK to update", var2_2, euf.l((ebk)var1_1));
                    var3_5 = null;
                } else {
                    ((heg)var7_3.h().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "handleHotwordRouteUpdateConditions", 173, "HotwordRoutesRegistry.kt")).G("#audio# updating hotword route(token(%d), %s) failed: %s", var2_2, euf.l((ebk)var1_1), var3_5.e);
                    var5_6 = eub.g(euc.f(var3_5.c), var2_2, (ebk)var1_1, 21);
                    var8_7 = this.c;
                    var4_4 = var6_8 = var1_1.d;
                    if (var6_8 == null) {
                        var4_4 = eip.a;
                    }
                    jse.d(var4_4, "getClientInfo(...)");
                    var8_7.u((eip)var4_4);
                    var8_7 = this.c;
                    var4_4 = var6_8 = var1_1.d;
                    if (var6_8 == null) {
                        var4_4 = eip.a;
                    }
                    jse.d(var4_4, "getClientInfo(...)");
                    var8_7.v((eip)var4_4, elb.i(var3_5.d), (etz)var5_6);
                    var3_5 = var5_6;
                }
                if (var3_5 != null) {
                    return var3_5;
                }
                var3_5 = var4_4 = var1_1.c;
                if (var4_4 == null) {
                    var3_5 = eaz.a;
                }
                jse.d(var3_5, "getAudioRouteType(...)");
                switch (eay.a(var3_5.b).ordinal()) {
                    default: {
                        break block20;
                    }
                    case 3: {
                        var3_5 = this.l.v((eaz)var3_5, edo.a);
                        ** GOTO lbl78
                    }
                    case 2: {
                        var3_5 = var3_5.b == 3 ? (ebh)var3_5.c : ebh.a;
                        var3_5 = new eti((ebh)var3_5);
                        ** GOTO lbl78
                    }
                    case 1: 
                    case 8: {
                        var3_5 = new eth(gsl.a);
lbl78:
                        // 3 sources

                        var3_5 = this.k.u((esy)var3_5);
                        ((heg)var7_3.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "startHotwordRouteConnection", 227, "HotwordRoutesRegistry.kt")).x("#audio# starting connection to hotword route(token(%d), %s)", var2_2, crh.N(var3_5.d.b));
                        var4_4 = this.i;
                        var5_6 = new etu(var3_5, this, 4, null);
                        var4_4 = var4_4.b(gqk.c((hnx)var5_6), this.h);
                        jse.d(var4_4, "submitAsync(...)");
                        var6_8 = dox.h(ebl.a.l());
                        var5_6 = dpf.u(edf.a.l());
                        var5_6.y(var2_2);
                        var6_8.z(var5_6.x());
                        var5_6 = var6_8.y();
                        var6_8 = this.d.S((ebl)var5_6, var3_5.d.a);
                        var5_6 = new eua((esx)var3_5, (ecr)var6_8, var2_2, (ebk)var1_1);
                        var6_8 = this.c;
                        var1_1 = var3_5 = var1_1.d;
                        if (var3_5 == null) {
                            var1_1 = eip.a;
                        }
                        jse.d(var1_1, "getClientInfo(...)");
                        var6_8.v((eip)var1_1, (hpn)var4_4, (etz)var5_6);
                        this.e().add(var5_6);
                        return var5_6;
                    }
                    case 0: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                }
                var1_1 = new IllegalStateException(a.ak(var3_5, "Route(", ") is unexpected"));
                throw var1_1;
            }
            var1_1 = new joa();
            throw var1_1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final etz b(Integer object) {
        synchronized (this) {
            int n2;
            etz etz2;
            block6: {
                for (Object t2 : this.e()) {
                    eua eua2 = (eua)t2;
                    etz2 = t2;
                    if (object != null) {
                        n2 = eua2.b;
                        if ((Integer)object != n2) continue;
                        etz2 = t2;
                    }
                    break block6;
                }
                etz2 = null;
            }
            if ((etz2 = (eua)etz2) != null) {
                return etz2;
            }
            etz2 = euc.f(ebg.c);
            n2 = object != null ? (Integer)object : -1;
            return eub.g((eub)etz2, n2, null, 29);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List c() {
        synchronized (this) {
            Object object = this.e();
            ArrayList<ekk> arrayList = new ArrayList<ekk>(jns.B((Iterable)object));
            object = object.iterator();
            while (object.hasNext()) {
                arrayList.add(((eua)object.next()).d);
            }
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n2, ebg ebg2) {
        synchronized (this) {
            Object object2;
            block6: {
                jse.e(ebg2, "reason");
                for (Object object2 : this.e()) {
                    if (((eua)object2).b != n2) continue;
                    break block6;
                }
                object2 = null;
            }
            eua eua2 = (eua)object2;
            if (eua2 == null) {
                return;
            }
            object2 = this.e();
            Object object3 = new epl(n2, 7);
            jns.E((List)object2, (jrk)object3);
            object2 = object3 = eua2.c.d;
            if (object3 == null) {
                object2 = eip.a;
            }
            jse.d(object2, "getClientInfo(...)");
            object3 = (heg)a.f().h(hfo.a, "ALT.HotwordRoutesRegy").j("com/google/android/libraries/search/audio/routing/registry/HotwordRoutesRegistry", "markDisconnected", 263, "HotwordRoutesRegistry.kt");
            String string = ebg2.name();
            n2 = eua2.b;
            String string2 = crh.N(eua2.d.b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("route(token(");
            stringBuilder.append(n2);
            stringBuilder.append("), ");
            stringBuilder.append(string2);
            stringBuilder.append(")");
            object3.C("#audio# disconnecting(%s) hotword %s", string, stringBuilder.toString());
            this.g.i(euf.m(eua2), ekr.j(ebg2));
            this.c.u((eip)object2);
            object2 = this.i;
            object3 = new etu(eua2, ebg2, 3);
            gax.c(((hou)object2).b(gqk.c((hnx)object3), this.h), "Disconnecting the hotword route failed", new Object[0]);
            return;
        }
    }
}

