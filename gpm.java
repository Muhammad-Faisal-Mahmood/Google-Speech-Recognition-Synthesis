/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceCallback
 *  android.util.Log
 *  gqv
 *  hrg
 */
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class gpm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gpm() {
        throw null;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public gpm(Context var1_1, bzo var2_2, Map var3_3, AmbientModeSupport$AmbientController var4_4, hpq var5_5, bmu var6_6, gto var7_7, Map var8_8, geo var9_9, jrk var10_10, Executor var11_11, Map var12_12, jro var13_13, jrk var14_14, hny var15_15, jqz var16_16, gfp var17_17) {
        jse.e(var2_2, "mendelFactory");
        jse.e(var3_3, "packagesMap");
        jse.e(var4_4, "subpackager");
        jse.e(var5_5, "blockingExecutor");
        jse.e(var6_6, "fileApi");
        jse.e(var7_7, "hermeticOverrides");
        jse.e(var8_8, "unused");
        jse.e((Object)var9_9, "tier");
        jse.e(var11_11, "snapshotExecutor");
        jse.e(var12_12, "defaultExperimentFlagValues");
        super();
        this.c = var4_4;
        this.d = var7_7;
        this.a = var17_17;
        var4_4 = new LinkedHashMap<K, V>();
        for (Object var3_3 : var3_3.entrySet()) {
            if ((geo)var3_3.getValue() != var9_9) continue;
            var4_4.put(var3_3.getKey(), var3_3.getValue());
        }
        var3_3 = var4_4.keySet();
        var17_17 = new LinkedHashMap<K, V>(jse.k(jjj.E(jns.B((Iterable)var3_3)), 16));
        var22_18 = var3_3.iterator();
        while (var22_18.hasNext()) {
            var23_23 = var22_18.next();
            var7_7 = (String)var23_23;
            if (var9_9 != geo.b && var9_9 != geo.d) ** GOTO lbl-1000
            var18_19 = dtx.a;
            var19_20 = var7_7.indexOf("#");
            if (var19_20 >= 0 && (var21_22 = var19_20 + 1) < var7_7.length() && var7_7.charAt(var21_22) == '@') {
                var18_19 = var7_7.length();
                if (var18_19 == (var20_21 = var19_20 + 2)) {
                    var3_3 = var7_7.substring(0, var19_20);
                } else {
                    var3_3 = var7_7.substring(0, var21_22);
                    var4_4 = var7_7.substring(var20_21);
                    var3_3 = String.valueOf(var3_3).concat(String.valueOf(var4_4));
                }
                var4_4 = var3_3;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = var7_7;
            }
            var24_24 = new cqm(var5_5);
            var3_3 = var8_8 = (jnu)var12_12.get(dtx.b((String)var7_7));
            if (var8_8 == null) {
                var3_3 = new djo(12);
            }
            var8_8 = fvd.ap(new gfd(var1_1, (String)var7_7, var24_24, var6_6, var10_10, (String)var4_4, 0));
            jse.d(var8_8, "memoize(...)");
            var25_25 = gpm.B((String)var7_7, var24_24, var6_6, var10_10, (String)var4_4, ero.i);
            var26_26 = new gjm(var14_14, var7_7, 1);
            var4_4 = new etu(var15_15, var7_7, 8, null);
            var27_27 = (gfw)var2_2.a;
            var28_28 = var27_27.a;
            dot.c().booleanValue();
            var18_19 = ((gdg)var27_27.b).a();
            var29_29 = (gto)((imc)var27_27.c).a;
            var30_30 = (hpq)var27_27.d.b();
            var31_31 = (cgw)var27_27.e.b();
            var28_28 = (Set)((imc)var27_27.f).a;
            var32_32 = var27_27.g;
            ((gfn)var27_27.h).a();
            var32_32 = var27_27.i;
            var33_33 = var27_27.j;
            var34_34 = (cya)var27_27.k.b();
            var35_35 = (dua)var27_27.l.b();
            var36_36 = var27_27.m;
            ((gge)var27_27.n).a();
            var17_17.put(var23_23, new gfv(var18_19, var29_29, var30_30, var31_31, (Set)var28_28, var32_32, var33_33, var34_34, var35_35, var36_36, (bzo)var27_27.o.b(), (String)var7_7, var24_24, var13_13, (jnu)var3_3, var11_11, (gui)var8_8, var25_25, var26_26, (hnx)var4_4, var16_16));
        }
        this.b = var17_17;
    }

    public gpm(cya cya2, cya cya3, Map map, String string) {
        jse.e(cya2, "gmsConfigurationCommitter");
        jse.e(map, "logSources");
        jse.e(string, "packageName");
        this.a = cya2;
        this.c = cya3;
        this.b = map;
        this.d = string;
    }

    public gpm(dxi dxi2) {
        this.d = new AtomicLong(1L);
        this.a = new AtomicReference<Object>(null);
        this.b = new ConcurrentHashMap();
        this.c = dxi2;
    }

    public gpm(gqa gqa2, jnu jnu2, Set set, gql gql2) {
        this.d = gqa2;
        this.b = gop.d(set);
        this.a = new gjm(this, (Object)jnu2, 2);
        this.c = gql2;
    }

    public gpm(gto gto2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, jnu jnu2, Map map) {
        jse.e(gto2, "updater");
        jse.e(ambientModeSupport$AmbientController, "subpackager");
        jse.e(jnu2, "deviceProvider");
        jse.e(map, "mendelPackages");
        this.d = ambientModeSupport$AmbientController;
        this.c = jnu2;
        this.a = map;
        this.b = (gfc)gto2.f();
    }

    public gpm(gto gto2, gzx gzx2, gzx gzx3, hti hti2) {
        this.d = gto2;
        this.a = gzx2;
        this.c = gzx3;
        this.b = hti2;
    }

    public gpm(hqw hqw2, List list) {
        hrg hrg2 = hrg.a;
        fxf.K(hrg2);
        this.d = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.b = hqw2;
        this.a = list;
    }

    public gpm(hyf hyf2, Object object, hyf hyf3, hwu hwu2) {
        if (hyf2 != null) {
            if (hwu2.c == hzm.k && hyf3 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.c = hyf2;
            this.d = object;
            this.b = hyf3;
            this.a = hwu2;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public gpm(hzm hzm2, Object object, hzm hzm3, Object object2) {
        this.c = hzm2;
        this.b = object;
        this.a = hzm3;
        this.d = object2;
    }

    public gpm(ixb ixb2, itw itw2, iwx iwx2, String string) {
        this.a = itw2;
        this.b = ixb2;
        this.c = iwx2;
        this.d = string;
    }

    public gpm(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        jnu2.getClass();
        this.d = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.a = jnu4;
        jnu5.getClass();
        this.c = jnu5;
    }

    public gpm(jvb jvb2) {
        this.a = jvb2;
        this.c = cqq.av(jvb2);
        this.d = new LinkedHashSet();
        this.b = new LinkedHashMap();
    }

    public static /* synthetic */ hpn A(gpm gpm2, Object object) {
        return gpm2.w(object, null);
    }

    public static final frr B(String string, cqm cqm2, bmu bmu2, jrk object, String object2, jrk object3) {
        object = new hpo((Callable)new cmq(object, object3, object2, 12, null));
        cqm2.a.add(object);
        object2 = fvc.O(geq.a.l()).v();
        object3 = hwj.a;
        object3 = hyo.a;
        return fvc.Q(string, (hpn)object, (hyf)object2, hwj.a, new cdv(cqm2, 3), gto.h(new frt(geq.a)), bmu2);
    }

    public static /* synthetic */ hpn y(gpm gpm2, jrk jnv2) {
        jnv2 = new eht(gpm2, (jrk)jnv2, null, 8);
        return ((dtu)gpm2.c).j((jro)jnv2);
    }

    public static /* synthetic */ hpn z(gpm gpm2, Object object, jrk jrk2, jrk jrk3, int n2) {
        if ((n2 & 2) != 0) {
            jrk2 = null;
        }
        if ((n2 & 4) != 0) {
            jrk3 = null;
        }
        object = new biv(gpm2, object, jrk2, jrk3, null, 3);
        return ((dtu)gpm2.c).j((jro)object);
    }

    public AudioDeviceCallback a(AudioDeviceCallback audioDeviceCallback, String string) {
        return new gpj(this, audioDeviceCallback);
    }

    public final gof b(String string, gqv gqv2) {
        return this.c(string, goo.a, gqv2);
    }

    public final gof c(String string, gop gop2, gqv object) {
        fxf.K(object);
        gop2 = gop.e((gop)this.a.b(), gop2);
        object = (gql)this.c;
        return ((gqa)this.d).e(string, gop2, (gql)object);
    }

    public final gof d(String string) {
        gop gop2 = (gop)this.a.b();
        gql gql2 = (gql)this.c;
        return ((gqa)this.d).e(string, gop2, gql2);
    }

    public final gpb e(String string, gop object, gqv object2) {
        fxf.K(object2);
        object2 = gop.e((gop)this.a.b(), (gop)object);
        object = gno.b();
        gqa.d((gpc)object, string);
        long l2 = cgw.p().toEpochMilli();
        long l3 = cgw.o();
        gql gql2 = (gql)this.c;
        return new gpz(new gol(((gqa)this.d).c(string, (gop)object2, l2, l3, 2, gql2), false), (gpc)object);
    }

    public final gpf f(String string, gqv gqv2) {
        if (!fxf.aw(gqv2)) {
            return this.e(string, goo.a, gqv2);
        }
        return new gnh(4);
    }

    public final gpk g(gqv gqv2) {
        fxf.K(gqv2);
        return new gpk(this);
    }

    public final gof h(long l2, long l3, gqv object) {
        fxf.K(object);
        Object object2 = this.a.b();
        object = gno.b();
        gqa.d((gpc)object, "Application creation");
        gql gql2 = (gql)this.c;
        object2 = ((gqa)this.d).c("Application creation", (gop)object2, l2, l3, 1, gql2);
        if (object == ((goe)object2).b) {
            return object2;
        }
        return new gpy((gpc)object2, (gpc)object, 0);
    }

    public final int i() {
        return ((hwu)this.a).b;
    }

    public final hzm j() {
        return ((hwu)this.a).c;
    }

    public final Object k(Object iterator) {
        Object object = (hwu)this.a;
        if (((hwu)object).d) {
            if (((hwu)object).a() == hzn.h) {
                object = new hyp(hyp.a, 0, true);
                iterator = (List)((Object)iterator);
                ((hyp)object).e(iterator.size());
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    ((hvg)object).add(this.l(iterator.next()));
                }
                ((hvg)object).b();
                return object;
            }
            return iterator;
        }
        return this.l(iterator);
    }

    public final Object l(Object object) {
        Object object2 = object;
        if (((hwu)this.a).a() == hzn.h) {
            object2 = iav.b((Integer)object);
        }
        return object2;
    }

    public final Object m(Object object) {
        Object object2 = object;
        if (((hwu)this.a).a() == hzn.h) {
            object2 = ((hwx)object).a();
        }
        return object2;
    }

    public final boolean n() {
        return ((hwu)this.a).d;
    }

    public final hpn o(hvu hvu2, dup dup2) {
        jse.e(dup2, "commitProperties");
        this.q(hvu2);
        return this.p(dup2);
    }

    public final hpn p(dup object) {
        block3: {
            Object object2;
            Object object3;
            block5: {
                block4: {
                    block2: {
                        object3 = this.d;
                        jse.e(object3, "mendelPackage");
                        jse.e(object, "commitProperties");
                        object2 = ((dup)object).c;
                        jse.d(object2, "getSnapshotToken(...)");
                        if (object2.length() != 0) break block2;
                        object = hpj.a;
                        break block3;
                    }
                    Object object4 = (cya)this.a;
                    object2 = new gfq((cya)object4, (String)object3, (dup)object);
                    object4 = (gfq)((ConcurrentHashMap)((cya)object4).a.a()).put(object3, object2);
                    if (object4 == null) break block4;
                    object3 = object4;
                    if (jse.i(((gfq)object4).b.c, ((dup)object).c)) break block5;
                }
                object3 = object2;
            }
            ((gfq)object2).c.o(((gfq)object3).d.c());
            object = ((gfq)object2).c;
        }
        return object;
    }

    public final void q(hvu hvu2) {
        if (hvu2 != null) {
            Object object = this.c;
            Object object2 = (Set)this.b.get(dtx.b((String)this.d));
            Set set = object2;
            if (object2 == null) {
                set = jpc.a;
            }
            object2 = (String)this.d;
            ((cya)object).d(hvu2, set, (String)object2, true);
        }
    }

    public final hpn r(String object, duq object2) {
        Object object3;
        Object object4;
        jse.e(object2, "configuration");
        object = this.b.get(object);
        jse.b(object);
        gfv gfv2 = (gfv)object;
        jse.e(object2, "configuration");
        object = gfv2.g.b();
        jse.d(object, "get(...)");
        Object object5 = (gey)object;
        Object object6 = fvc.O(geq.a.l());
        int n2 = gfv2.a;
        object = (hwp)((bzb)object6).a;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object = (geq)((hwp)object).b;
        ((geq)object).b |= 8;
        ((geq)object).h = n2;
        if ((((duq)object2).b & 2) != 0) {
            object = ((duq)object2).d;
            jse.e(object, "value");
            object4 = (hwp)((bzb)object6).a;
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object4 = (geq)((hwp)object4).b;
            object.getClass();
            ((geq)object4).b |= 4;
            ((geq)object4).e = object;
        }
        object = ((duq)object2).c;
        jse.e(object, "value");
        object4 = (hwp)((bzb)object6).a;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object4 = (geq)((hwp)object4).b;
        object.getClass();
        ((geq)object4).b |= 2;
        ((geq)object4).d = object;
        object = ((duq)object2).e;
        jse.e(object, "value");
        object4 = (hwp)((bzb)object6).a;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object4 = (geq)((hwp)object4).b;
        object.getClass();
        ((geq)object4).b |= 1;
        ((geq)object4).c = object;
        long l2 = cgw.p().toEpochMilli();
        object = (hwp)((bzb)object6).a;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object = (geq)((hwp)object).b;
        ((geq)object).b |= 0x10;
        ((geq)object).i = l2;
        object = ((duq)object2).f;
        jse.d(object, "getFlagList(...)");
        object4 = object.iterator();
        while (object4.hasNext()) {
            Object object7 = (dur)object4.next();
            object = ((gey)object5).a(((dur)object7).e);
            if (object == null) continue;
            object3 = DesugarCollections.unmodifiableList(((geq)((hwp)((bzb)object6).a).b).f);
            jse.d(object3, "getFlagValueList(...)");
            new hzr((List)object3);
            jse.b(object7);
            object3 = ges.a.l();
            jse.e(object3, "builder");
            String string = ((dur)object7).e;
            jse.e(string, "value");
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            ges ges2 = (ges)((hwp)object3).b;
            string.getClass();
            ges2.b |= 1;
            ges2.e = string;
            switch (((gex)object).a.ordinal()) {
                default: {
                    throw new joa();
                }
                case 6: {
                    throw new IllegalStateException("No known flag type");
                }
                case 5: {
                    object = ((dur)object7).c == 5 ? (hvu)((dur)object7).d : hvu.b;
                    jse.e(object, "value");
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object7 = (ges)((hwp)object3).b;
                    object.getClass();
                    ((ges)object7).c = 6;
                    ((ges)object7).d = object;
                    break;
                }
                case 4: {
                    object = ((dur)object7).c == 5 ? (hvu)((dur)object7).d : hvu.b;
                    jse.e(object, "value");
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object7 = (ges)((hwp)object3).b;
                    object.getClass();
                    ((ges)object7).c = 5;
                    ((ges)object7).d = object;
                    break;
                }
                case 3: {
                    object = ((dur)object7).c == 4 ? (String)((dur)object7).d : "";
                    jse.e(object, "value");
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object7 = (ges)((hwp)object3).b;
                    object.getClass();
                    ((ges)object7).c = 4;
                    ((ges)object7).d = object;
                    break;
                }
                case 2: {
                    double d2 = ((dur)object7).c == 3 ? (Double)((dur)object7).d : 0.0;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (ges)((hwp)object3).b;
                    ((ges)object).c = 3;
                    ((ges)object).d = d2;
                    break;
                }
                case 1: {
                    boolean bl2 = ((dur)object7).c == 2 ? (Boolean)((dur)object7).d : false;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (ges)((hwp)object3).b;
                    ((ges)object).c = 2;
                    ((ges)object).d = bl2;
                    break;
                }
                case 0: {
                    l2 = ((dur)object7).c == 1 ? (Long)((dur)object7).d : 0L;
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (ges)((hwp)object3).b;
                    ((ges)object).c = 1;
                    ((ges)object).d = l2;
                }
            }
            object = ((hwp)object3).o();
            jse.d(object, "build(...)");
            object = (ges)object;
            jse.e(object, "value");
            object3 = (hwp)((bzb)object6).a;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object3 = (geq)((hwp)object3).b;
            object.getClass();
            object7 = ((geq)object3).f;
            if (!object7.c()) {
                ((geq)object3).f = hwv.s((hxk)object7);
            }
            ((geq)object3).f.add(object);
        }
        object = DesugarCollections.unmodifiableList(((geq)((hwp)((bzb)object6).a).b).g);
        jse.d(object, "getDeleteFlagList(...)");
        new hzr((List)object);
        object2 = ((duq)object2).g;
        jse.d(object2, "getDeleteFlagList(...)");
        object = new ArrayList<Object>();
        object3 = object2.iterator();
        while (object3.hasNext()) {
            object2 = object3.next();
            object4 = (String)object2;
            if (!((gey)object5).b.containsKey(object4)) continue;
            object.add(object2);
        }
        object2 = (hwp)((bzb)object6).a;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object5 = (geq)((hwp)object2).b;
        object2 = ((geq)object5).g;
        if (!object2.c()) {
            ((geq)object5).g = hwv.s((hxk)object2);
        }
        hvc.g(object, ((geq)object5).g);
        object4 = ((bzb)object6).v();
        try {
            object6 = gfv2.a((geq)object4);
            object2 = gfv2.e;
            object5 = gfv2.b;
            object = new etu(gfv2, object4, 10);
        }
        catch (hxn hxn2) {
            object = hhk.J(hxn2);
        }
        jse.e(object5, "executor");
        object = hno.g(hhk.O(gqk.j(new czm(object2, gqk.c((hnx)object), 1)), (Executor)object5), gqk.d(new cxe(object4, object6, gfv2, 14)), gfv2.h);
        return object;
    }

    public final boolean s() {
        boolean bl2;
        block3: {
            Object object = this.b.values();
            bl2 = object instanceof Collection;
            boolean bl3 = false;
            if (bl2 && object.isEmpty()) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (!((gfv)object.next()).b());
                bl2 = true;
            }
        }
        return bl2;
    }

    public final hpn t(String string) {
        jse.e(string, "mendelPackage");
        Object object = (AmbientModeSupport$AmbientController)this.d;
        Object object2 = this.a;
        string = object.h(string);
        object = (geo)((Object)object2.get(string));
        if (object != geo.c && object != geo.a) {
            object2 = new StringBuilder("Package ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" was not a device package. Instead was ");
            ((StringBuilder)object2).append(object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }
        return ((gfm)this.c).a().a(string, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final hpn u(String object, boolean bl2) {
        geo geo2 = (geo)((Object)this.a.get(object = ((AmbientModeSupport$AmbientController)this.d).h((String)object)));
        if (geo2 == null) {
            Log.w((String)"ConfigurationUpdater", (String)"No Mendel package registered for ".concat((String)object));
            return hhk.K(null);
        }
        int n2 = geo2.ordinal();
        if (n2 == 0) return ((gfm)this.c).a().a((String)object, bl2);
        if (n2 != 1) {
            if (n2 == 2) return ((gfm)this.c).a().a((String)object, bl2);
            if (n2 != 3) throw new joa();
        }
        if ((object = this.b) == null) throw new UnsupportedOperationException("Account support is not present");
        return object.a();
    }

    public final hpn v(boolean bl2) {
        Object object = this.a.keySet();
        ArrayList<hpn> arrayList = new ArrayList<hpn>(jns.B(object));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(this.u((String)object.next(), bl2));
        }
        return fvc.w(arrayList);
    }

    public final hpn w(Object object, jrk jrk2) {
        object = new bez(this, object, jrk2, null, 2);
        return ((dtu)this.c).j((jro)object);
    }

    public final void x(Object object, jrk jrk2) {
        Object v2;
        Object object2 = this.b;
        Object object3 = v2 = object2.get(object);
        if (v2 == null) {
            object3 = cqq.av((jvb)this.a);
            object2.put(object, object3);
        }
        ((dtu)object3).k(new eht(jrk2, object, null, 9));
    }
}

