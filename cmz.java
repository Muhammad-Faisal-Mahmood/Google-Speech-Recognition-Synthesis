/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class cmz {
    public static final hei a = hei.m("com/google/android/libraries/assistant/soda/SodaDetectionHandler");
    private final boolean A;
    private final hvu B;
    private final giu C;
    public final String b;
    public final cmt c;
    public final idr d;
    public final boolean e;
    public final gto f;
    public final cmn g;
    public final hpr h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final boolean m;
    private final iex n;
    private final boolean o;
    private final idq p;
    private final idt q;
    private final iep r;
    private final ies s;
    private final iew t;
    private final iem u;
    private final iel v;
    private final int w;
    private final gto x;
    private final String y;
    private final String z;

    public cmz(cmy cmy2, Map map, gto gto2, cmn cmn2, hpr hpr2) {
        this.i = cmy2.a;
        this.j = cmy2.b;
        this.k = cmy2.c;
        this.B = cmy2.j;
        this.b = cmy2.k;
        this.l = cmy2.d;
        this.m = cmy2.e;
        this.n = cmy2.f;
        this.o = cmy2.g;
        this.p = cmy2.h;
        this.c = cmy2.l;
        this.C = cmy2.y;
        this.q = cmy2.m;
        this.r = cmy2.n;
        this.s = cmy2.o;
        this.t = cmy2.q;
        this.d = cmy2.r;
        this.u = cmy2.p;
        this.w = cmy2.i;
        this.x = gto.h((cmu)map.get(cmy2.t));
        this.y = cmy2.u;
        this.z = cmy2.v;
        this.e = cmy2.w;
        this.A = cmy2.x;
        this.v = cmy2.s;
        this.f = gto2;
        this.g = cmn2;
        this.h = cgw.j(hpr2);
    }

    public final iez a() {
        Object object;
        hyg hyg2;
        Object object2;
        Object object3;
        Object object4 = this.B;
        if (object4 != null && !((hvu)object4).x()) {
            object2 = object3 = cng.a(this.i, this.j, idy.a);
            if (!((hvu)object4).x()) {
                ((heg)((heg)cng.a.f()).j("com/google/android/libraries/assistant/soda/SodaUtils", "createDefaultCoreConfigWithHotwordModel", 172, "SodaUtils.java")).r("Setting hotword model");
                object2 = (hwr)ier.a.l();
                hyg2 = ieq.a.l();
                if (!hyg2.b.B()) {
                    hyg2.u();
                }
                object = (ieq)hyg2.b;
                ((ieq)object).b = 2;
                ((ieq)object).c = object4;
                ((hwr)object2).aF((hwp)hyg2);
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object4 = (iez)((hwr)object3).b;
                object2 = (ier)((hwp)object2).o();
                object = iez.a;
                object2.getClass();
                ((iez)object4).d = object2;
                ((iez)object4).b |= 2;
                object2 = object3;
            }
        } else {
            object2 = this.i;
            object3 = this.j;
            object4 = this.k;
            object2 = object3 = cng.a((String)object2, (String)object3, idy.a);
            if (object4 != null) {
                object2 = object3;
                if (!((String)object4).isEmpty()) {
                    object2 = (hwr)ier.a.l();
                    hyg2 = ieq.a.l();
                    if (!hyg2.b.B()) {
                        hyg2.u();
                    }
                    object = (ieq)hyg2.b;
                    ((ieq)object).b = 6;
                    ((ieq)object).c = object4;
                    ((hwr)object2).aF((hwp)hyg2);
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object4 = (iez)((hwr)object3).b;
                    object = (ier)((hwp)object2).o();
                    object2 = iez.a;
                    object.getClass();
                    ((iez)object4).d = object;
                    ((iez)object4).b |= 2;
                    object2 = object3;
                }
            }
        }
        object3 = object4 = ((iez)((hwr)object2).b).d;
        if (object4 == null) {
            object3 = ier.a;
        }
        object4 = (hwp)((hwv)object3).C(5);
        ((hwp)object4).x((hwv)object3);
        object3 = (hwr)object4;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (ier)((hwr)object3).b;
        ((ier)object4).b |= 0x1000;
        ((ier)object4).d = false;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object4 = (iez)((hwr)object2).b;
        object3 = (ier)((hwp)object3).o();
        object3.getClass();
        ((iez)object4).d = object3;
        ((iez)object4).b |= 2;
        object3 = object4 = ((iez)((hwr)object2).b).e;
        if (object4 == null) {
            object3 = iey.a;
        }
        object4 = (hwp)((hwv)object3).C(5);
        ((hwp)object4).x((hwv)object3);
        object3 = (hwr)object4;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).b |= 0x40000;
        ((iey)object4).g = false;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).b |= 0x100000;
        ((iey)object4).i = false;
        boolean bl2 = this.l;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).b |= 0x200;
        ((iey)object4).e = bl2;
        bl2 = this.m;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).c |= 0x800;
        ((iey)object4).v = bl2;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).c |= 4;
        ((iey)object4).s = false;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).b |= 0x80000;
        ((iey)object4).h = false;
        object4 = this.p;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object = (iey)((hwr)object3).b;
        ((iey)object).j = ((idq)object4).m;
        ((iey)object).b |= 0x400000;
        bl2 = this.A;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object4 = (iey)((hwr)object3).b;
        ((iey)object4).c |= 0x100;
        ((iey)object4).t = bl2;
        if (this.n != null) {
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).b |= 0x4000000;
            ((iey)object4).m = true;
            object = this.n;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).n = ((iex)object).c;
            ((iey)object4).b |= 0x8000000;
            bl2 = this.o;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).b |= 0x10000000;
            ((iey)object4).o = bl2;
        }
        if ((object = this.r) != null) {
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).p = object;
            ((iey)object4).c |= 1;
        }
        if ((object = this.s) != null) {
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).k = object;
            ((iey)object4).b |= 0x800000;
        }
        if ((object4 = this.u) != null) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (iez)((hwr)object2).b;
            ((iez)object).k = object4;
            ((iez)object).b |= 0x40000;
        }
        if ((object4 = this.t) != null) {
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object = (iey)((hwr)object3).b;
            ((iey)object).l = object4;
            ((iey)object).b |= 0x1000000;
        }
        if (!this.y.isEmpty()) {
            object4 = ign.a.l();
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object = (ign)((hwp)object4).b;
            ((ign)object).b |= 1;
            ((ign)object).c = false;
            object = igo.a.l();
            String string = this.y;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hyg2 = (igo)((hwp)object).b;
            string.getClass();
            ((igo)hyg2).b |= 2;
            ((igo)hyg2).c = string;
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            hyg2 = (ign)((hwp)object4).b;
            object = (igo)((hwp)object).o();
            object.getClass();
            ((ign)hyg2).d = object;
            ((ign)hyg2).b |= 2;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object = (iey)((hwr)object3).b;
            object4 = (ign)((hwp)object4).o();
            object4.getClass();
            ((iey)object).d = object4;
            ((iey)object).b |= 0x100;
        }
        if (!this.z.isEmpty()) {
            object = this.z;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            object.getClass();
            ((iey)object4).c |= 2;
            ((iey)object4).q = object;
        }
        if ((object = this.v) != null) {
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object4 = (iey)((hwr)object3).b;
            ((iey)object4).u = object;
            ((iey)object4).c |= 0x200;
        }
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object4 = (iez)((hwr)object2).b;
        object3 = (iey)((hwp)object3).o();
        object3.getClass();
        ((iez)object4).e = object3;
        ((iez)object4).b |= 4;
        object3 = object4 = ((iez)((hwr)object2).b).j;
        if (object4 == null) {
            object3 = igi.a;
        }
        object4 = (hwp)((hwv)object3).C(5);
        ((hwp)object4).x((hwv)object3);
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object3 = ((hwp)object4).b;
        object = (igi)object3;
        ((igi)object).b |= 1;
        ((igi)object).c = false;
        if (!((hwv)object3).B()) {
            ((hwp)object4).u();
        }
        object3 = (igi)((hwp)object4).b;
        ((igi)object3).d = 0;
        ((igi)object3).b = 2 | ((igi)object3).b;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = (iez)((hwr)object2).b;
        object4 = (igi)((hwp)object4).o();
        object4.getClass();
        ((iez)object3).j = object4;
        ((iez)object3).b |= 0x400;
        object3 = this.q;
        if (object3 != null) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object4 = (iez)((hwr)object2).b;
            ((iez)object4).i = object3;
            ((iez)object4).b |= 0x200;
        }
        if (this.i.isEmpty()) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (iez)((hwr)object2).b;
            ((iez)object3).e = null;
            ((iez)object3).b &= 0xFFFFFFFB;
        }
        if (this.b != null) {
            object3 = object4 = ((iez)((hwr)object2).b).f;
            if (object4 == null) {
                object3 = iet.a;
            }
            object4 = (hwp)((hwv)object3).C(5);
            ((hwp)object4).x((hwv)object3);
            object = this.b;
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            hyg2 = (iet)((hwp)object4).b;
            object.getClass();
            object3 = ((iet)hyg2).b;
            if (!object3.c()) {
                ((iet)hyg2).b = hwv.s((hxk)object3);
            }
            ((iet)hyg2).b.add(object);
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (iez)((hwr)object2).b;
            object4 = (iet)((hwp)object4).o();
            object4.getClass();
            ((iez)object3).f = object4;
            ((iez)object3).b |= 0x20;
        }
        object3 = object4 = ((iez)((hwr)object2).b).c;
        if (object4 == null) {
            object3 = ien.a;
        }
        object = (hwp)((hwv)object3).C(5);
        ((hwp)object).x((hwv)object3);
        object3 = object4 = ((iez)((hwr)object2).b).c;
        if (object4 == null) {
            object3 = ien.a;
        }
        object3 = object4 = ((ien)object3).c;
        if (object4 == null) {
            object3 = ids.a;
        }
        object4 = (hwp)((hwv)object3).C(5);
        ((hwp)object4).x((hwv)object3);
        int n2 = this.w;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object3 = (ids)((hwp)object4).b;
        ((ids)object3).b |= 4;
        ((ids)object3).e = n2;
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object3 = (ien)((hwp)object).b;
        object4 = (ids)((hwp)object4).o();
        object4.getClass();
        ((ien)object3).c = object4;
        ((ien)object3).b |= 1;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = (iez)((hwr)object2).b;
        object4 = (ien)((hwp)object).o();
        object4.getClass();
        ((iez)object3).c = object4;
        ((iez)object3).b |= 1;
        object3 = this.d;
        if (object3 != null) {
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object4 = (iez)((hwr)object2).b;
            ((iez)object4).h = object3;
            ((iez)object4).b |= 0x100;
        }
        object2 = (iez)((hwp)object2).o();
        return (iez)this.x.b(new ain(8)).e(object2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final igr b() {
        block65: {
            block64: {
                block63: {
                    block57: {
                        var8_1 = cmz.a;
                        ((heg)((heg)var8_1.f()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 198, "SodaDetectionHandler.java")).u("#connect: enableConcurrency: %b", this.e);
                        if (!this.e) break block57;
                        var12_2 = this.g;
                        var10_3 = this.c();
                        var8_1 = this.a();
                        var6_4 = this.C;
                        var13_6 = this.c;
                        var14_7 = Optional.ofNullable(var6_4);
                        ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 154, "ConcurrentSodaManager.java")).r("#connect");
                        var9_8 = var12_2.h;
                        synchronized (var9_8) {
                            block56: {
                                block62: {
                                    block61: {
                                        block60: {
                                            block59: {
                                                block58: {
                                                    block55: {
                                                        if (!var12_2.h(cmn.g((iez)var8_1), (String)var10_3) && (var6_4 = var12_2.i).containsKey(var10_3)) {
                                                            var6_4 = ((Map)var6_4.get(var10_3)).entrySet().iterator();
                                                            while (var6_4.hasNext()) {
                                                                var7_9 = (cnd)var6_4.next().getValue();
                                                                if (var7_9.p()) {
                                                                    ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopOrDeleteSoda", 503, "ConcurrentSodaManager.java")).r("Stopping existing SODA instance.");
                                                                    var7_9.m();
                                                                }
                                                                if (!var7_9.r((iez)var8_1)) continue;
                                                                ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "stopOrDeleteSoda", 507, "ConcurrentSodaManager.java")).r("Removing existing SODA instance from the map.");
                                                                var12_2.f((String)var10_3, var7_9.d());
                                                            }
                                                        }
                                                        if ((var6_4 = var12_2.i).containsKey(var10_3)) {
                                                            var11_11 = ((Map)var6_4.get(var10_3)).entrySet().iterator();
                                                            while (var11_11.hasNext()) {
                                                                var7_9 = (cnd)((Map.Entry)var11_11.next()).getValue();
                                                                if (var7_9.r((iez)var8_1)) continue;
                                                                var6_4 = var7_9;
                                                                if (var12_2.h(cmn.g((iez)var8_1), (String)var10_3)) {
                                                                    if (!var7_9.o()) continue;
                                                                    var6_4 = var7_9;
                                                                }
                                                                break block55;
                                                            }
                                                        }
                                                        var6_4 = null;
                                                    }
                                                    var11_11 = new ArrayList();
                                                    var7_9 = var12_2.h;
                                                    synchronized (var7_9) {
                                                        var15_12 = Collection$_EL.stream(var12_2.i.keySet());
                                                        var16_13 = new bof(var12_2, 8);
                                                        var15_12 = var15_12.flatMap(var16_13);
                                                        var1_14 = gzx.d;
                                                        var11_11.addAll((Collection)var15_12.collect(gye.a));
                                                        if (var6_4 == null) break block58;
                                                    }
                                                    var6_4.h();
                                                    ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 167, "ConcurrentSodaManager.java")).r("Reusing SODA");
                                                    var7_9 = (Map)var12_2.i.get(var10_3);
                                                    var7_9.remove(var6_4.d());
                                                    var6_4.l((cmt)var13_6);
                                                    var7_9.put(var13_6, var6_4);
                                                    var6_4 = var7_9 = var8_1.e;
                                                    if (var7_9 == null) {
                                                        var6_4 = iey.a;
                                                    }
                                                    var6_4 = var7_9 = var6_4.p;
                                                    if (var7_9 == null) {
                                                        var6_4 = iep.a;
                                                    }
                                                    var7_9 = iek.e;
                                                    var6_4.h((gpm)var7_9);
                                                    var6_4 = var6_4.r.l((hwu)var7_9.a);
                                                    var6_4 = var6_4 == null ? var7_9.d : var7_9.k(var6_4);
                                                    var1_14 = a.t(((iek)var6_4).c);
                                                    if (var1_14 != 0 && var1_14 != 1) {
                                                        var12_2.o = var13_6;
                                                    }
                                                    var6_4 = igr.a;
                                                    var5_15 = true;
                                                    break block56;
                                                }
                                                ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "connect", 186, "ConcurrentSodaManager.java")).r("Creating SODA");
                                                var1_14 = var12_2.a();
                                                var2_16 = var12_2.g;
                                                var5_15 = false;
                                                if (var1_14 < var2_16) break block59;
                                                ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 556, "ConcurrentSodaManager.java")).r("Reached max concurrent sessions limit.");
                                                var6_4 = igr.n;
                                                break block56;
                                            }
                                            var6_4 = var7_9 = var8_1.e;
                                            if (var7_9 == null) {
                                                var6_4 = iey.a;
                                            }
                                            if (!(var6_4 = var6_4.f).isEmpty()) break block60;
                                            ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 565, "ConcurrentSodaManager.java")).r("SODA resources directory string is empty; skipping the check for the existence of LP");
                                            break block61;
                                        }
                                        var7_9 = new File((String)var6_4);
                                        if ((var6_4 = var7_9.list()) == null || ((String[])var6_4).length == 0) break block62;
                                    }
                                    ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 573, "ConcurrentSodaManager.java")).u("Initializing SODA for %s", var10_3);
                                    var15_12 = new cnb(null);
                                    var15_12.a = var8_1;
                                    var6_4 = var7_9 = var8_1.j;
                                    if (var7_9 == null) {
                                        var6_4 = igi.a;
                                    }
                                    if (!var6_4.c) ** GOTO lbl102
                                    if (!var12_2.f.isPresent()) {
                                        ((heg)((heg)cmn.a.g()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 582, "ConcurrentSodaManager.java")).r("No SodaTransportFactory provided but attempting to upload audios.");
                                        var6_4 = igr.d;
                                        break block56;
                                    } else {
                                        var15_12.b = gto.i((SodaTransportFactory)var12_2.f.get());
lbl102:
                                        // 2 sources

                                        var7_9 = Optional.empty();
                                        var6_4 = var8_1 = var8_1.e;
                                        if (var8_1 == null) {
                                            var6_4 = iey.a;
                                        }
                                        var6_4 = var8_1 = var6_4.p;
                                        if (var8_1 == null) {
                                            var6_4 = iep.a;
                                        }
                                        var8_1 = iek.e;
                                        var6_4.h((gpm)var8_1);
                                        var6_4 = var6_4.r.l((hwu)var8_1.a);
                                        var6_4 = var6_4 == null ? var8_1.d : var8_1.k(var6_4);
                                        var1_14 = var2_16 = a.t(((iek)var6_4).c);
                                        if (var2_16 == 0) {
                                            var1_14 = 1;
                                        }
                                        if (var1_14 == 3) {
                                            ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 597, "ConcurrentSodaManager.java")).r("Diarization session is being resumed - cancelling timeout.");
                                            var7_9 = Optional.of(var12_2.b());
                                            var12_2.d();
                                            var3_17 = var12_2.l;
                                        } else {
                                            var3_17 = Soda.nativeCreateSharedResources(var12_2);
                                        }
                                        Objects.requireNonNull(var15_12);
                                        var6_4 = new bme(var15_12, 7);
                                        var14_7.ifPresent(var6_4);
                                        var16_13 = var12_2.b;
                                        var6_4 = var12_2.c;
                                        var8_1 = var12_2.d;
                                        var14_7 = new Soda((Context)var16_13, (hpq)var6_4, (hpr)var8_1, var3_17);
                                        var6_4 = var8_1 = igr.b(var14_7.f((cnc)var15_12.a()).c);
                                        if (var8_1 == null) {
                                            var6_4 = igr.a;
                                        }
                                        ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 611, "ConcurrentSodaManager.java")).u("Initialized SODA with status: %s", var6_4);
                                        if (var6_4 != igr.a) {
                                            var12_2.e((cnd)var14_7, false);
                                            break block56;
                                        } else {
                                            if (var1_14 != 1) {
                                                if (var12_2.e.isPresent() && var7_9.isPresent()) {
                                                    var8_1 = (cmo)var12_2.e.get();
                                                    ((Long)var7_9.get()).longValue();
                                                    var8_1.c();
                                                }
                                                var12_2.l = 0L;
                                                var12_2.n = var10_3;
                                                var12_2.o = var13_6;
                                            }
                                            var7_9 = var12_2.h;
                                            synchronized (var7_9) {
                                                var14_7.l((cmt)var13_6);
                                                if (var12_2.i.containsKey(var10_3)) {
                                                    ((Map)var12_2.i.get(var10_3)).put(var13_6, var14_7);
                                                } else {
                                                    var8_1 = new HashMap();
                                                    var8_1.put(var13_6, var14_7);
                                                    var12_2.i.put(var10_3, var8_1);
                                                }
                                            }
                                        }
                                    }
                                    break block56;
                                }
                                ((heg)((heg)cmn.a.g()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "createAndInitializeSoda", 569, "ConcurrentSodaManager.java")).r("Invalid config: empty SODA resources directory");
                                var6_4 = igr.d;
                            }
                            var12_2.p.isPresent();
                            var7_9 = (cnu)var12_2.p.get();
                            var8_1 = ihw.a.l();
                            var12_2 = ihx.a.l();
                            var13_6 = ihu.a.l();
                            var14_7 = ihk.a.l();
                            var15_12 = ihl.a.l();
                            if (!var15_12.b.B()) {
                                var15_12.u();
                            }
                            var16_13 = var15_12.b;
                            var17_18 = (ihl)var16_13;
                            var10_3.getClass();
                            var17_18.b |= 1;
                            var17_18.c = var10_3;
                            if (!var16_13.B()) {
                                var15_12.u();
                            }
                            var10_3 = (ihl)var15_12.b;
                            var16_13 = var10_3.e;
                            if (!var16_13.c()) {
                                var10_3.e = hwv.s((hxk)var16_13);
                            }
                            hvc.g((Iterable)var11_11, var10_3.e);
                            if (!var15_12.b.B()) {
                                var15_12.u();
                            }
                            var10_3 = var15_12.b;
                            var11_11 = (ihl)var10_3;
                            var11_11.d = var6_4.o;
                            var11_11.b |= 2;
                            if (!var10_3.B()) {
                                var15_12.u();
                            }
                            var10_3 = (ihl)var15_12.b;
                            var10_3.b |= 4;
                            var10_3.f = var5_15;
                            if (!var14_7.b.B()) {
                                var14_7.u();
                            }
                            var10_3 = (ihk)var14_7.b;
                            var11_11 = (ihl)var15_12.o();
                            var11_11.getClass();
                            var10_3.c = var11_11;
                            var10_3.b = 1;
                            if (!var13_6.b.B()) {
                                var13_6.u();
                            }
                            var10_3 = (ihu)var13_6.b;
                            var11_11 = (ihk)var14_7.o();
                            var11_11.getClass();
                            var10_3.c = var11_11;
                            var10_3.b = 9;
                            if (!var12_2.b.B()) {
                                var12_2.u();
                            }
                            var10_3 = (ihx)var12_2.b;
                            var11_11 = (ihu)var13_6.o();
                            var11_11.getClass();
                            var10_3.d = var11_11;
                            var10_3.b |= 2;
                            if (!var8_1.b.B()) {
                                var8_1.u();
                            }
                            var10_3 = (ihw)var8_1.b;
                            var11_11 = (ihx)var12_2.o();
                            var11_11.getClass();
                            var10_3.c = var11_11;
                            var10_3.b |= 1;
                            var10_3 = (ihw)var8_1.o();
                            var8_1 = iea.a.l();
                            if (!var8_1.b.B()) {
                                var8_1.u();
                            }
                            var11_11 = (iea)var8_1.b;
                            var11_11.b |= 1;
                            var11_11.c = "SODA_CLEARCUT";
                            var10_3 = var10_3.e();
                            if (!var8_1.b.B()) {
                                var8_1.u();
                            }
                            var11_11 = (iea)var8_1.b;
                            var11_11.b |= 2;
                            var11_11.d = var10_3;
                            var8_1 = (iea)var8_1.o();
                            var7_9.d.t((iea)var8_1);
                            return var6_4;
                        }
                    }
                    if (!this.i.isEmpty()) break block63;
                    ((heg)((heg)var8_1.h()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 216, "SodaDetectionHandler.java")).r("SODA resources directory string is empty; skipping the check for the existence of LP");
                    break block64;
                }
                var6_5 = new File(this.i).list();
                if (var6_5 == null || ((String[])var6_5).length == 0) break block65;
            }
            ((heg)((heg)var8_1.f()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 223, "SodaDetectionHandler.java")).r("Initializing SODA");
            var7_10 = this.a();
            var6_5 = new cnb(null);
            var6_5.a = var7_10;
            var7_10 = this.C;
            if (var7_10 != null) {
                var6_5.b((giu)var7_10);
            }
            var6_5 = var7_10 = igr.b(((cnd)((gtt)this.f).a).f((cnc)var6_5.a()).c);
            if (var7_10 == null) {
                var6_5 = igr.a;
            }
            ((heg)((heg)var8_1.f()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 245, "SodaDetectionHandler.java")).u("Initialized SODA with status: %s", var6_5);
            if (var6_5 != igr.a) {
                return var6_5;
            }
            var7_10 = this.c;
            if (var7_10 != null) {
                ((cnd)((gtt)this.f).a).l((cmt)var7_10);
                return var6_5;
            }
            ((heg)((heg)var8_1.h()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 255, "SodaDetectionHandler.java")).r("No soda callback provided. Events will not be reported back");
            return var6_5;
        }
        ((heg)((heg)var8_1.g()).j("com/google/android/libraries/assistant/soda/SodaDetectionHandler", "connect", 219, "SodaDetectionHandler.java")).r("Invalid config: empty SODA resources directory");
        return igr.d;
    }

    public final String c() {
        Object object = this.q;
        object = object != null ? ((idt)object).f : "";
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        if (this.e) {
            cmn cmn2 = this.g;
            Object object = this.c();
            cmt cmt2 = this.c;
            ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "cancelTimeout", 328, "ConcurrentSodaManager.java")).r("#cancelTimeout");
            Object object2 = cmn2.h;
            synchronized (object2) {
                object = cmn2.c((String)object, cmt2);
                if (object != null) {
                    object.h();
                }
                return;
            }
        }
        if (this.g()) {
            ((cnd)((gtt)this.f).a).h();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(hwg hwg2) {
        if (this.e) {
            cmn cmn2 = this.g;
            String string = this.c();
            cmt cmt2 = this.c;
            ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleTimeout", 310, "ConcurrentSodaManager.java")).r("#scheduleTimeout");
            Object object = cmn2.h;
            synchronized (object) {
                Object object2 = (po)cmn2.k.get(string);
                if (object2 != null) {
                    ((po)object2).c(null);
                }
                cmn2.k.remove(string);
                object2 = (hpn)cmn2.j.remove(string);
                cnd cnd2 = cmn2.c(string, cmt2);
                if (cnd2 != null) {
                    object2 = new ai((Object)cmn2, (Object)string, (Object)cmt2, 12, null);
                    cnd2.k(hwg2, (Runnable)object2);
                }
                return;
            }
        }
        if (this.g()) {
            ((cnd)((gtt)this.f).a).k(hwg2, new cmw(this, 2));
        }
    }

    public final void f() {
        Runnable runnable = gqk.i(new cmw(this, 0));
        this.h.be(runnable);
    }

    public final boolean g() {
        return ((cnd)((gtt)this.f).a).p();
    }
}

