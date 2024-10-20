/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.time.Duration;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public final class czh {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public czh(Context context, djj djj2, bmu bmu2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        this.b = context;
        this.c = djj2;
        this.d = bmu2;
        this.a = ambientModeSupport$AmbientController;
    }

    public czh(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
        this.d = uri4;
    }

    public czh(cqq cqq2, ekg ekg2, eqe eqe2, eqe eqe3, est est2, egs egs2) {
        jse.e(cqq2, "sessionAssembler");
        jse.e(ekg2, "clientsRegistry");
        jse.e(est2, "sourcePolicyControllerAdapter");
        jse.e(egs2, "audioSourceAvailability");
        this.a = ekg2;
        this.b = eqe2;
        this.c = eqe3;
        this.d = est2;
    }

    public czh(cwj cwj2, cwk cwk2, cyu cyu2, Executor executor) {
        this.a = cwj2;
        this.b = cwk2;
        this.c = cyu2;
        this.d = executor;
    }

    public czh(dfu dfu2, bmu bmu2) {
        this.c = new ReentrantLock();
        this.b = dfu2;
        this.a = bmu2;
        this.d = "manifests";
    }

    /*
     * Unable to fully structure code
     */
    public czh(dwn var1_1, dvf var2_2, duo var3_3) {
        block36: {
            block39: {
                block37: {
                    block38: {
                        block35: {
                            super();
                            var6_4 = var1_1 != null ? 1 : 0;
                            var7_5 = var2_2 != null ? 1 : 0;
                            fxf.A(var6_4 ^ var7_5);
                            this.b = var1_1;
                            this.c = var2_2;
                            this.d = var3_3;
                            var3_3 = "__phenotype_configuration_version";
                            if (var1_1 == null) break block35;
                            var3_3 = hac.h(var1_1.g.size() + 3);
                            for (Object var2_2 : var1_1.g) {
                                var7_5 = var2_2.c;
                                var6_4 = var7_5 != 0 ? (var7_5 != 2 ? (var7_5 != 3 ? (var7_5 != 4 ? (var7_5 != 5 ? (var7_5 != 6 ? 0 : 5) : 4) : 3) : 2) : 1) : 6;
                                var8_10 = var6_4 - 1;
                                if (var6_4 != 0) {
                                    if (var8_10 != 0) {
                                        if (var8_10 != 1) {
                                            if (var8_10 != 2) {
                                                if (var8_10 != 3) {
                                                    if (var8_10 != 4) continue;
                                                    var15_16 = var2_2.e;
                                                    var2_2 = var7_5 == 6 ? (hvu)var2_2.d : hvu.b;
                                                    var3_3.d(var15_16, var2_2.y());
                                                    continue;
                                                }
                                                var15_16 = var2_2.e;
                                                var2_2 = var7_5 == 5 ? (String)var2_2.d : "";
                                                var3_3.d(var15_16, var2_2);
                                                continue;
                                            }
                                            var15_16 = var2_2.e;
                                            var4_8 = var7_5 == 4 ? (Double)var2_2.d : 0.0;
                                            var3_3.d(var15_16, var4_8);
                                            continue;
                                        }
                                        var15_16 = var2_2.e;
                                        var13_14 = var7_5 == 3 ? (Boolean)var2_2.d : false;
                                        var3_3.d(var15_16, var13_14);
                                        continue;
                                    }
                                    var15_16 = var2_2.e;
                                    var11_12 = var7_5 == 2 ? (Long)var2_2.d : 0L;
                                    var3_3.d(var15_16, var11_12);
                                    continue;
                                }
                                throw null;
                            }
                            var3_3.d("__phenotype_server_token", var1_1.e);
                            var3_3.d("__phenotype_snapshot_token", var1_1.c);
                            var3_3.d("__phenotype_configuration_version", var1_1.f);
                            var1_1 = var3_3.a();
                            break block36;
                        }
                        fxf.K(var2_2);
                        if (var2_2.c.f.size() <= 0) break block37;
                        var14_7 = var2_2.b;
                        var1_1 = DesugarCollections.unmodifiableMap(var2_2.c.f).values();
                        if (var1_1 == null) {
                            var1_1 = hcy.a;
                        } else {
                            var15_17 = new gzy();
                            for (Collection<V> var1_1 : var1_1) {
                                var6_4 = var1_1.c;
                                var7_5 = a.y(var6_4);
                                var8_11 = var7_5 - 1;
                                if (var7_5 != 0) {
                                    if (var8_11 != 0) {
                                        if (var8_11 != 1) {
                                            if (var8_11 != 2) {
                                                if (var8_11 != 3) {
                                                    if (var8_11 == 4) {
                                                        var17_19 = var1_1.e;
                                                        var1_1 = var6_4 == 5 ? (hvu)var1_1.d : hvu.b;
                                                        var15_17.d(var17_19, var1_1.y());
                                                        continue;
                                                    }
                                                    throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(var1_1.e)));
                                                }
                                                var17_19 = var1_1.e;
                                                var1_1 = var6_4 == 4 ? (String)var1_1.d : "";
                                                var15_17.d(var17_19, var1_1);
                                                continue;
                                            }
                                            var17_19 = var1_1.e;
                                            var4_9 = var6_4 == 3 ? (Double)var1_1.d : 0.0;
                                            var15_17.d(var17_19, var4_9);
                                            continue;
                                        }
                                        var17_19 = var1_1.e;
                                        var13_15 = var6_4 == 2 ? (Boolean)var1_1.d : false;
                                        var15_17.d(var17_19, var13_15);
                                        continue;
                                    }
                                    var17_19 = var1_1.e;
                                    var11_13 = var6_4 == 1 ? (Long)var1_1.d : 0L;
                                    var15_17.d(var17_19, var11_13);
                                    continue;
                                }
                                throw null;
                            }
                            var1_1 = var15_17.a();
                        }
                        if (!var1_1.isEmpty()) break block38;
                        var1_1 = "__phenotype_configuration_version";
                        var3_3 = var14_7;
                        break block39;
                    }
                    var15_17 = new HashMap<K, V>(var1_1);
                    var16_18 = new haw(hcm.a);
                    var14_7 = var14_7.b.k();
                    var1_1 = var3_3;
                    var3_3 = var15_17;
                    while (var14_7.hasNext()) {
                        block40: {
                            block41: {
                                var17_19 = (dvd)var14_7.next();
                                var15_17 = var3_3.remove(var17_19.b());
                                if (var15_17 == null) break block40;
                                if (var15_17 instanceof String || var15_17 instanceof byte[]) break block41;
                                if (var15_17 instanceof Boolean) {
                                    if (((Boolean)var15_17).booleanValue()) {
                                        var16_18.m(new dvd(var17_19.a, var17_19.b, 1, var17_19.d, var17_19.e));
                                        continue;
                                    }
                                    var16_18.m(new dvd(var17_19.a, var17_19.b, 0, var17_19.d, var17_19.e));
                                    continue;
                                }
                                if (var15_17 instanceof Long) ** GOTO lbl124
                                if (var15_17 instanceof Double) {
                                    var11_13 = Double.doubleToRawLongBits((Double)var15_17);
                                } else {
                                    var1_1 = var17_19.b();
                                    var3_3 = var15_17.toString();
                                    var2_2 = new StringBuilder("Cannot serialize override for existing flag ");
                                    var2_2.append((String)var1_1);
                                    var2_2.append(": ");
                                    var2_2.append((String)var3_3);
                                    throw new IllegalStateException(var2_2.toString());
lbl124:
                                    // 1 sources

                                    var11_13 = (Long)var15_17;
                                }
                                var16_18.m(new dvd(var17_19.a, var17_19.b, var17_19.c, var11_13, var17_19.e));
                                continue;
                            }
                            var16_18.m(new dvd(var17_19.a, var17_19.b, var17_19.c, var17_19.d, var15_17));
                            continue;
                        }
                        var16_18.m(var17_19);
                    }
                    for (Object var15_17 : var3_3.keySet()) {
                        block42: {
                            block34: {
                                var18_22 = var3_3.get(var15_17);
                                var6_4 = var15_17.length();
                                if (var6_4 > 19 || var6_4 == 0 || (var11_13 = (long)(var15_17.charAt(0) - 48)) < 1L || var11_13 > 9L) break block34;
                                for (var7_5 = 1; var7_5 < var6_4; ++var7_5) {
                                    var10_21 = var15_17.charAt(var7_5) - 48;
                                    var8_11 = var10_21 < 0 ? 1 : 0;
                                    if ((var8_11 | (var9_20 = var10_21 > 9 ? 1 : 0)) == 0) {
                                        var11_13 = var11_13 * 10L + (long)var10_21;
                                        continue;
                                    }
                                    break block34;
                                }
                                if (var11_13 >= 0L && var11_13 <= 0x1FFFFFFFFFFFFFFFL) break block42;
                            }
                            var11_13 = 0L;
                        }
                        var14_7 = var11_13 == 0L ? var15_17 : null;
                        if (var18_22 instanceof String) {
                            var16_18.m(new dvd(var11_13, (String)var14_7, 4, 0L, var18_22));
                            continue;
                        }
                        if (var18_22 instanceof byte[]) {
                            var16_18.m(new dvd(var11_13, (String)var14_7, 5, 0L, var18_22));
                            continue;
                        }
                        if (var18_22 instanceof Boolean) {
                            if (((Boolean)var18_22).booleanValue()) {
                                var16_18.m(new dvd(var11_13, (String)var14_7, 1, 0L, null));
                                continue;
                            }
                            var16_18.m(new dvd(var11_13, (String)var14_7, 0, 0L, null));
                            continue;
                        }
                        if (var18_22 instanceof Long) {
                            var16_18.m(new dvd(var11_13, (String)var14_7, 2, (Long)var18_22, null));
                            continue;
                        }
                        if (var18_22 instanceof Double) {
                            var16_18.m(new dvd(var11_13, (String)var14_7, 3, Double.doubleToRawLongBits((Double)var18_22), null));
                            continue;
                        }
                        var1_1 = String.valueOf(var18_22);
                        var2_2 = new StringBuilder("Cannot serialize override ");
                        var2_2.append((String)var15_17);
                        var2_2.append(": ");
                        var2_2.append((String)var1_1);
                        throw new IllegalStateException(var2_2.toString());
                    }
                    var3_3 = new dve(var16_18.l());
                    break block39;
                }
                var1_1 = "__phenotype_configuration_version";
                var3_3 = var2_2.b;
            }
            var14_7 = hac.h(var3_3.b.size() + 3);
            var15_17 = var3_3.b.k();
            while (var15_17.hasNext()) {
                var3_3 = (dvd)var15_17.next();
                var14_7.d(var3_3.b(), var3_3.a());
            }
            var14_7.d("__phenotype_server_token", var2_2.c.d);
            var14_7.d("__phenotype_snapshot_token", var2_2.a());
            var14_7.d(var1_1, var2_2.c.e);
            var1_1 = var14_7.a();
        }
        this.a = var1_1;
    }

    public czh(enx enx2, erb erb2, dml dml2, Context context) {
        jse.e(erb2, "micOccupationStateProvider");
        this.d = enx2;
        this.c = erb2;
        this.b = dml2;
        this.a = context;
    }

    public czh(evo evo2, enc enc2, eml eml2, cgw cgw2, crh crh2, jvb jvb2) {
        jse.e(evo2, "audioEventsHolder");
        jse.e(eml2, "appFlowLogger");
        jse.e(cgw2, "clock");
        jse.e(crh2, "audioTimeConverter");
        jse.e(jvb2, "lightweightScope");
        this.d = evo2;
        this.b = enc2;
        this.a = eml2;
        this.c = jvb2;
    }

    public czh(gto gto2, gto gto3, gto gto4) {
        this.a = new AtomicBoolean(false);
        this.d = gto2;
        this.c = gto3;
        this.b = gto4;
    }

    public czh(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new bis(this);
        executor = new big(executor, 0);
        this.a = executor;
        this.d = jvf.k(executor);
    }

    public czh(Executor executor, czo czo2) {
        this.b = new bzo(null);
        this.d = new HashMap();
        this.c = executor;
        this.a = czo2;
    }

    public czh(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        jnu2.getClass();
        this.c = jnu2;
        jnu3.getClass();
        this.b = jnu3;
        jnu4.getClass();
        this.d = jnu4;
        jnu5.getClass();
        this.a = jnu5;
    }

    private final ekj Q(int n2, Integer object, eao object2) {
        Object object3 = ((ekg)this.a).b(n2);
        Object object4 = object3.d();
        etr etr2 = ((eqe)this.b).m((etp)object4, (Integer)object);
        jse.e(object2, "params");
        est est2 = (est)this.d;
        object = object2;
        if (est2.a((ekd)object3)) {
            heg heg2 = (heg)est.a.f().h(hfo.a, "ALT.SourcePolAdptr").j("com/google/android/libraries/search/audio/policies/adapter/SourcePolicyControllerAdapter", "updateAudioRequestMicInputParams", 38, "SourcePolicyControllerAdapter.kt");
            object = object4 = object3.b().c;
            if (object4 == null) {
                object = eip.a;
            }
            String string = eio.a(((eip)object).b).name();
            object = object4 = eal.b(object3.b().d);
            if (object4 == null) {
                object = eal.a;
            }
            heg2.C("#audio# consulting policy for mic input params client(%s) intent(%s)", string, ((Enum)object).name());
            object = euf.v(esg.a.l()).A();
            jse.e(object, "<this>");
            jse.e(object2, "params");
            n2 = dpf.f(((eao)object2).e);
            if (n2 != 0) {
                if (--n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            throw new joa();
                        }
                    } else {
                        object4 = (hwp)((hwv)object).C(5);
                        ((hwp)object4).x((hwv)object);
                        object4 = euf.v((hwp)object4);
                        if (((eao)object2).e == 14) {
                            object = object2 = eyf.b((Integer)((eao)object2).f);
                            if (object2 == null) {
                                object = eyf.a;
                            }
                        } else {
                            object = eyf.a;
                        }
                        jse.e(object, "value");
                        object2 = (hwp)((bzb)object4).a;
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object2 = (esg)((hwp)object2).b;
                        ((esg)object2).d = ((eyf)object).a();
                        ((esg)object2).c = 4;
                        object = ((bzb)object4).A();
                    }
                } else {
                    object4 = (hwp)((hwv)object).C(5);
                    ((hwp)object4).x((hwv)object);
                    object4 = euf.v((hwp)object4);
                    object = ((eao)object2).e == 12 ? (edk)((eao)object2).f : edk.a;
                    jse.e(object, "value");
                    object2 = (hwp)((bzb)object4).a;
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object2 = (esg)((hwp)object2).b;
                    object.getClass();
                    ((esg)object2).d = object;
                    ((esg)object2).c = 3;
                    object = ((bzb)object4).A();
                }
                object4 = est2.b;
                object2 = object3.b();
                jse.e(object, "request");
                jse.e(object2, "params");
                esv.a((esv)object4, (eam)object2);
                jse.e(object, "request");
                object = dpg.c(eao.a.l());
                object2 = dpf.k(eae.a.l());
                ((dlm)object2).k(6);
                object4 = (hwp)((dlm)object2).a;
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object4 = (eae)((hwp)object4).b;
                ((eae)object4).b |= 2;
                ((eae)object4).d = 16000;
                ((dlm)object2).j(1);
                object4 = (hwp)((dlm)object2).a;
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object4 = (eae)((hwp)object4).b;
                ((eae)object4).b |= 8;
                ((eae)object4).f = 2;
                ((dlm)object2).l(true);
                object2 = ((dlm)object2).i();
                jse.e(object2, "value");
                object4 = (hwp)((dlm)object).a;
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object4 = (eao)((hwp)object4).b;
                object2.getClass();
                ((eao)object4).g = object2;
                ((eao)object4).b |= 1;
                object = ((dlm)object).g();
            } else {
                throw null;
            }
        }
        object2 = this.c;
        object4 = object3.c();
        object3 = etr2.e();
        object = (eph)((eqe)object2).l((epc)object4, (eqb)object3, (eao)object);
        return new ekj(((eph)object).a, ((eph)object).d);
    }

    private final ekm R(Integer object, ecw ecw2) {
        object = ((eqe)this.b).o((Integer)object).e();
        object = (eps)((eqe)this.c).d(ecw2, (eqb)object);
        return new ekm(((eps)object).a, ((eps)object).d);
    }

    public static czh j(dwn dwn2) {
        return new czh(dwn2, null, duo.a);
    }

    public static czh k(Executor executor) {
        return new czh(executor, new czn());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ede A(eat object) {
        synchronized (this) {
            int n2 = ((eat)object).b;
            return new ekt(((eqe)this.c).a(n2));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekh B(int n2, eaw object) {
        synchronized (this) {
            Object object2;
            jse.e(object, "params");
            ekd ekd2 = ((ekg)this.a).b(n2);
            jse.e(object, "params");
            Object object3 = this.d;
            Object object4 = object;
            if (((est)object3).a(ekd2)) {
                Object object5 = (heg)est.a.f().h(hfo.a, "ALT.SourcePolAdptr").j("com/google/android/libraries/search/audio/policies/adapter/SourcePolicyControllerAdapter", "updateAudioRouteRequestParams", 56, "SourcePolicyControllerAdapter.kt");
                object4 = object2 = ekd2.b().c;
                if (object2 == null) {
                    object4 = eip.a;
                }
                Object object6 = eio.a(((eip)object4).b).name();
                object4 = object2 = eal.b(ekd2.b().d);
                if (object2 == null) {
                    object4 = eal.a;
                }
                object5.C("#audio# consulting policy for audio route params client(%s) intent(%s)", object6, ((Enum)object4).name());
                object = esw.a(euf.v(esg.a.l()).A(), (eaw)object);
                object2 = ((est)object3).b;
                object3 = ekd2.b();
                jse.e(object, "request");
                jse.e(object3, "params");
                object4 = (hwp)((hwv)object).C(5);
                ((hwp)object4).x((hwv)object);
                object5 = euf.v((hwp)object4);
                object4 = ((bzb)object5).a;
                object4 = DesugarCollections.unmodifiableList(((esg)((hwp)object4).b).f);
                jse.d(object4, "getAvailableSourcesDataList(...)");
                object = new hzr((List)object4);
                object = eab.a;
                jse.d(object, "sourceConfig");
                object = (eaa)fvc.aF((hwt)object3, (gpm)object);
                object = object4 = new hxd(((eaa)object).c, eaa.a);
                if (((esv)object2).a) {
                    object = new ArrayList();
                    object4 = object4.iterator();
                    while (object4.hasNext()) {
                        object6 = object4.next();
                        if ((dzz)object6 == dzz.b) continue;
                        object.add(object6);
                    }
                }
                object4 = object;
                if (((esv)object2).b) {
                    object4 = new ArrayList();
                    object = object.iterator();
                    while (object.hasNext()) {
                        object6 = object.next();
                        if ((dzz)object6 == dzz.c) continue;
                        object4.add(object6);
                    }
                }
                egs egs2 = ((esv)object2).c;
                object = new ArrayList();
                Object object7 = (heg)egs.a.c().h(hfo.a, "ALT.AudioSrcAvailable").j("com/google/android/libraries/search/audio/audiosourceavailability/impl/AudioSourceAvailabilityImpl", "getAvailableAudioSources", 49, "AudioSourceAvailabilityImpl.kt");
                object6 = new ArrayList(jns.B(object4));
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    object6.add(((dzz)iterator.next()).name());
                }
                object7.u("#audio# collecting sources, disallowed=%s", object6);
                if (egs2.c.isPresent() && !object4.contains(dzz.b)) {
                    ((heg)egs.a.c().h(hfo.a, "ALT.AudioSrcAvailable").j("com/google/android/libraries/search/audio/audiosourceavailability/impl/AudioSourceAvailabilityImpl", "getAvailableAudioSources", 51, "AudioSourceAvailabilityImpl.kt")).r("#audio# collecting BISTO source if available");
                    jns.A((Collection)object, ((egr)egs2.c.get()).a());
                }
                if (egs2.b.isPresent() && !object4.contains(dzz.c)) {
                    ((heg)egs.a.c().h(hfo.a, "ALT.AudioSrcAvailable").j("com/google/android/libraries/search/audio/audiosourceavailability/impl/AudioSourceAvailabilityImpl", "getAvailableAudioSources", 56, "AudioSourceAvailabilityImpl.kt")).r("#audio# collecting BLUETOOTH source if available");
                    jns.A((Collection)object, ((egr)egs2.b.get()).a());
                }
                object6 = euf.x((hwr)esf.a.l());
                object4 = euf.w((hwr)ese.a.l());
                object7 = esm.a;
                jse.d(object7, "builtInSource");
                ((bzq)object4).W((gpm)object7, euf.u(esl.a.l()).z());
                ((cxt)object6).M(((bzq)object4).P());
                object.add(((cxt)object6).L());
                object4 = ((bzb)object5).a;
                if (!((hwp)object4).b.B()) {
                    ((hwp)object4).u();
                }
                object4 = (esg)((hwp)object4).b;
                object6 = ((esg)object4).f;
                if (!object6.c()) {
                    ((esg)object4).f = hwv.s((hxk)object6);
                }
                hvc.g((Iterable)object, ((esg)object4).f);
                object = ((bzb)object5).A();
                ((esv)object2).b((eam)object3, true);
                jse.e(object, "request");
                object4 = euf.x((hwr)esf.a.l());
                object2 = euf.w((hwr)ese.a.l());
                object = esm.a;
                jse.d(object, "builtInSource");
                ((bzq)object2).W((gpm)object, euf.u(esl.a.l()).z());
                ((cxt)object4).M(((bzq)object2).P());
                object5 = ((cxt)object4).L();
                object3 = dpg.d(eaw.a.l());
                jse.e(object5, "<this>");
                object2 = dww.e(eaz.a.l());
                object = object4 = ((esf)object5).c;
                if (object4 == null) {
                    object = ese.a;
                }
                object4 = esr.a;
                ((hws)object).h((gpm)object4);
                if (((hws)object).r.o((hwu)((gpm)object4).a)) {
                    object6 = ebj.a.l();
                    jse.e(object6, "builder");
                    object = object4 = ((esf)object5).c;
                    if (object4 == null) {
                        object = ese.a;
                    }
                    object4 = esr.a;
                    jse.d(object4, "handoverSource");
                    object = object4 = ((esq)fvc.aF((hwt)object, (gpm)object4)).c;
                    if (object4 == null) {
                        object = ecq.a;
                    }
                    jse.e(object, "value");
                    if (!((hwp)object6).b.B()) {
                        ((hwp)object6).u();
                    }
                    object4 = (ebj)((hwp)object6).b;
                    object.getClass();
                    ((ebj)object4).c = object;
                    ((ebj)object4).b |= 1;
                    object = ((hwp)object6).o();
                    jse.d(object, "build(...)");
                    object = (ebj)object;
                    jse.e(object, "value");
                    object4 = ((dml)object2).a;
                    if (!((hwp)object4).b.B()) {
                        ((hwp)object4).u();
                    }
                    object4 = (eaz)((hwp)object4).b;
                    object.getClass();
                    ((eaz)object4).c = object;
                    ((eaz)object4).b = 5;
                } else {
                    object = object4 = ((esf)object5).c;
                    if (object4 == null) {
                        object = ese.a;
                    }
                    object4 = esi.a;
                    ((hws)object).h((gpm)object4);
                    if (((hws)object).r.o((hwu)((gpm)object4).a)) {
                        object6 = eba.a.l();
                        jse.e(object6, "builder");
                        object = object4 = ((esf)object5).c;
                        if (object4 == null) {
                            object = ese.a;
                        }
                        object4 = esi.a;
                        jse.d(object4, "bistoSource");
                        if ((((esh)fvc.aF((hwt)object, (gpm)object4)).b & 1) != 0) {
                            object = object4 = ((esf)object5).c;
                            if (object4 == null) {
                                object = ese.a;
                            }
                            object4 = esi.a;
                            jse.d(object4, "bistoSource");
                            object = object4 = ((esh)fvc.aF((hwt)object, (gpm)object4)).c;
                            if (object4 == null) {
                                object = ebm.a;
                            }
                            jse.e(object, "value");
                            if (!((hwp)object6).b.B()) {
                                ((hwp)object6).u();
                            }
                            object4 = (eba)((hwp)object6).b;
                            object.getClass();
                            ((eba)object4).d = object;
                            ((eba)object4).b |= 2;
                        }
                        object = ((hwp)object6).o();
                        jse.d(object, "build(...)");
                        object = (eba)object;
                        jse.e(object, "value");
                        object4 = ((dml)object2).a;
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object4 = (eaz)((hwp)object4).b;
                        object.getClass();
                        ((eaz)object4).c = object;
                        ((eaz)object4).b = 4;
                    } else {
                        object = object4 = ((esf)object5).c;
                        if (object4 == null) {
                            object = ese.a;
                        }
                        object4 = eso.a;
                        ((hws)object).h((gpm)object4);
                        if (((hws)object).r.o((hwu)((gpm)object4).a)) {
                            object6 = ebf.a.l();
                            jse.e(object6, "builder");
                            object = object4 = ((esf)object5).c;
                            if (object4 == null) {
                                object = ese.a;
                            }
                            object4 = eso.a;
                            jse.d(object4, "carSource");
                            if ((((esn)fvc.aF((hwt)object, (gpm)object4)).b & 1) != 0) {
                                object = object4 = ((esf)object5).c;
                                if (object4 == null) {
                                    object = ese.a;
                                }
                                object4 = eso.a;
                                jse.d(object4, "carSource");
                                object = object4 = ((esn)fvc.aF((hwt)object, (gpm)object4)).c;
                                if (object4 == null) {
                                    object = ebm.a;
                                }
                                jse.e(object, "value");
                                if (!((hwp)object6).b.B()) {
                                    ((hwp)object6).u();
                                }
                                object4 = (ebf)((hwp)object6).b;
                                object.getClass();
                                ((ebf)object4).c = object;
                                ((ebf)object4).b |= 1;
                            }
                            object = ((hwp)object6).o();
                            jse.d(object, "build(...)");
                            object = (ebf)object;
                            jse.e(object, "value");
                            object4 = ((dml)object2).a;
                            if (!((hwp)object4).b.B()) {
                                ((hwp)object4).u();
                            }
                            object4 = (eaz)((hwp)object4).b;
                            object.getClass();
                            ((eaz)object4).c = object;
                            ((eaz)object4).b = 7;
                        } else {
                            object = object4 = ((esf)object5).c;
                            if (object4 == null) {
                                object = ese.a;
                            }
                            object4 = esk.a;
                            ((hws)object).h((gpm)object4);
                            if (((hws)object).r.o((hwu)((gpm)object4).a)) {
                                ((dml)object2).e(doc.g(ebd.a.l()).e());
                            } else {
                                object = object4 = ((esf)object5).c;
                                if (object4 == null) {
                                    object = ese.a;
                                }
                                object4 = esm.a;
                                ((hws)object).h((gpm)object4);
                                if (((hws)object).r.o((hwu)((gpm)object4).a)) {
                                    object = ebe.a.l();
                                    jse.e(object, "builder");
                                    object = ((hwp)object).o();
                                    jse.d(object, "build(...)");
                                    object = (ebe)object;
                                    jse.e(object, "value");
                                    object4 = ((dml)object2).a;
                                    if (!((hwp)object4).b.B()) {
                                        ((hwp)object4).u();
                                    }
                                    object4 = (eaz)((hwp)object4).b;
                                    object.getClass();
                                    ((eaz)object4).c = object;
                                    ((eaz)object4).b = 2;
                                }
                            }
                        }
                    }
                }
                ((dml)object3).i(((dml)object2).d());
                object4 = ((dml)object3).h();
            }
            object = this.d;
            jse.e(object4, "routeStartingParams");
            if (((est)object).a(ekd2) && (esw.a((esg)euf.v((hwp)esg.a.l()).A(), (eaw)object4).b & 1) == 0) {
                object2 = ((est)object).b;
                object = ekd2.b();
                jse.e(object, "params");
                esv.a((esv)object2, (eam)object);
            }
            object = this.b;
            object2 = ekd2.d();
            object4 = ((eqe)object).t((etp)object2, (eaw)object4);
            object = object4.b();
            n2 = object4.a();
            jse.e(object, "routeSession");
            return new ekh((eak)object, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eki C(eam object) {
        synchronized (this) {
            jse.e(object, "params");
            object = ((ekg)this.a).a((eam)object);
            return new eki(((eke)object).d, ((eke)object).a);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekj D(int n2, int n3) {
        synchronized (this) {
            epc epc2 = ((ekg)this.a).b(n2).c();
            return new ekj(((eqe)this.c).b(epc2, n3), n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekj E(int n2, eao object) {
        synchronized (this) {
            jse.e(object, "params");
            return this.Q(n2, null, (eao)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekj F(eau object, eao eao2) {
        synchronized (this) {
            eco eco2;
            jse.e(eao2, "params");
            hwv hwv2 = eco2 = ((eau)object).c;
            if (eco2 == null) {
                hwv2 = eco.a;
            }
            int n2 = hwv2.c;
            hwv2 = ((eau)object).d;
            object = hwv2;
            if (hwv2 != null) return this.Q(n2, ((edf)object).c, eao2);
            object = edf.a;
            return this.Q(n2, ((edf)object).c, eao2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekl G(ebk object) {
        synchronized (this) {
            jse.e(object, "params");
            etz etz2 = ((eqe)this.b).n((ebk)object);
            object = etz2.c();
            int n2 = etz2.a();
            jse.e(object, "routeSession");
            return new ekl((ecr)object, n2);
        }
    }

    public final ekm H(int n2) {
        epp epp2 = ((eqe)this.c).c(n2);
        return new ekm(epp2.b(), epp2.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekm I(ecw object) {
        synchronized (this) {
            jse.e(object, "params");
            return this.R(null, (ecw)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ekm J(ebl object, ecw ecw2) {
        synchronized (this) {
            jse.e(object, "routeToken");
            jse.e(ecw2, "params");
            edf edf2 = ((ebl)object).c;
            object = edf2;
            if (edf2 != null) return this.R(((edf)object).c, ecw2);
            object = edf.a;
            return this.R(((edf)object).c, ecw2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void K(int n2, eap eap2) {
        synchronized (this) {
            jse.e(eap2, "status");
            ((ekg)this.a).c(n2, eap2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void L(int n2, int n3, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            etp etp2 = ((ekg)this.a).b(n2).d();
            ((eqe)this.b).p(etp2, n3, ebg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void M(int n2, ebg ebg2) {
        synchronized (this) {
            jse.e(ebg2, "reason");
            ((eqe)this.b).r(n2, ebg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void N(int n2, int n3, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            epc epc2 = ((ekg)this.a).b(n2).c();
            ((eqe)this.c).e(epc2, n3, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void O(int n2, ebv ebv2) {
        synchronized (this) {
            jse.e(ebv2, "reason");
            ((eqe)this.c).g(n2, ebv2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final eky P(int n2, ebv object) {
        synchronized (this) {
            jse.e(object, "reason");
            return ((eqe)this.c).k(n2, (ebv)object);
        }
    }

    public final /* synthetic */ void a(Runnable runnable) {
        ((big)this.a).execute(runnable);
    }

    public final String b() {
        Object object = this.b;
        if (object != null) {
            object = ((dwn)object).c;
        } else {
            object = this.c;
            fxf.K(object);
            object = ((dvf)object).a();
        }
        return object;
    }

    public final void c() {
        if (((AtomicBoolean)this.a).getAndSet(true)) {
            return;
        }
        if (!((gto)this.c).g()) {
            ((dno)((gtt)this.d).a.b()).k();
        }
        ((dqb)((gtt)this.b).a.b()).a();
    }

    public final dbx d(String object, int n2) {
        block3: {
            Object object2;
            block0: {
                block1: {
                    Object object3;
                    block2: {
                        object2 = dde.d((String)object, n2);
                        object2 = new dco((String)this.d, (String)object2);
                        object2 = object3 = ((dfu)this.b).f((ddn)object2);
                        if (!((File)object3).isDirectory()) break block0;
                        object3 = dda.d((File)object3);
                        boolean bl2 = object3.isEmpty();
                        object2 = null;
                        if (bl2) break block1;
                        if (object3.size() <= 1) break block2;
                        ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 85, "FileManifestStore.java")).r("Unexpectedly got more than one file after uncompressing a manifest");
                        object = object2;
                        break block3;
                    }
                    object2 = (File)object3.get(0);
                    break block0;
                }
                ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 90, "FileManifestStore.java")).r("Got a compressed manifest but no files after uncompressing");
                object = object2;
                break block3;
            }
            object = ((bmu)this.a).s((String)object, n2, (File)object2);
        }
        return object;
    }

    public final void e(String object, Set object2, int n2) {
        ((ReentrantLock)this.c).lock();
        try {
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 108, "FileManifestStore.java")).u("Starting manifest GC or %s", object);
            Object object3 = this.b;
            Object object4 = (String)this.d;
            Object object5 = dda.d(((dfu)object3).g((String)object4));
            if (object5.isEmpty()) {
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 112, "FileManifestStore.java")).r("No manifest files to collect");
            } else {
                object3 = new ArrayList();
                object4 = new ArrayList();
                object5 = object5.iterator();
                while (object5.hasNext()) {
                    File file = (File)object5.next();
                    ded ded2 = dde.c(file.getName());
                    if (ded2 == null) {
                        object3.add(file);
                        continue;
                    }
                    if (object2.contains(((dct)ded2).b) || !((String)object).equals(((dct)ded2).a)) continue;
                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 127, "FileManifestStore.java")).C("Adding GC candidate with versioned name: %s, %s", ded2, file);
                    object4.add(file);
                }
                int n3 = object4.size();
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 135, "FileManifestStore.java")).v("Number of GC candidates: %d, keep count: %d", n3, n2);
                if (n3 > n2) {
                    object = new aog(19);
                    Collections.sort(object4, object);
                    object3.addAll(object4.subList(n2, object4.size()));
                }
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object3 = (File)object2.next();
                    ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 152, "FileManifestStore.java")).C("Deleting file %s from manifest directory, last modified: %s", object3, dec.d(((File)object3).lastModified()));
                    object = this.b;
                    object4 = this.d;
                    object5 = ((File)object3).getName();
                    object3 = new dco((String)object4, (String)object5);
                    object4 = dhu.j;
                    ((dfu)object).j((ddn)object3, true, (dhu)object4);
                }
            }
            return;
        }
        finally {
            ((ReentrantLock)this.c).unlock();
        }
    }

    public final hpn f(String object, hpn hpn2) {
        cyr.k("%s: submitting request to add in-progress download future with key: %s", "DownloadFutureMap", object);
        object = new dcf(this, object, hpn2, 1, null);
        return ((bzo)this.b).g((hnx)object, (Executor)this.c);
    }

    public final hpn g(String object) {
        cyr.k("%s: submitting check for in-progress download future with key: %s", "DownloadFutureMap", object);
        object = new czm(this, object, 0);
        return ((bzo)this.b).f((Callable)object, (Executor)this.c);
    }

    public final hpn h(String object) {
        cyr.k("%s: submitting request for in-progress download future with key: %s", "DownloadFutureMap", object);
        object = new czm(this, object, 2);
        return ((bzo)this.b).f((Callable)object, (Executor)this.c);
    }

    public final hpn i(String object) {
        cyr.k("%s: submitting request to remove in-progress download future with key: %s", "DownloadFutureMap", object);
        object = new ctz(this, object, 10, null);
        return ((bzo)this.b).g((hnx)object, (Executor)this.c);
    }

    public final epn l() {
        if (!euf.s((Context)this.a, "android.permission.RECORD_AUDIO")) {
            return new epn(ebs.d, ebp.k, "microphone permission denied");
        }
        return null;
    }

    public final void m(String object, int n2) {
        jse.e(object, "identity");
        this.a.a((String)object, n2);
        bzo bzo2 = dox.n(ecf.a.l());
        Object object2 = doc.c(ebw.a.l());
        ((cxt)object2).m(ecd.b);
        ((cxt)object2).k((String)object);
        ((cxt)object2).l(n2);
        bzo2.w(((cxt)object2).j());
        object = bzo2.v();
        ((evo)this.d).e((ecf)object);
        object2 = (enc)this.b;
        object = (eng)((enc)object2).b.b();
        object2 = (String)((enc)object2).d.a();
        ((fsu)((eng)object).c.a()).b(n2, object2);
    }

    public final void n(String string) {
        jse.e(string, "identity");
        this.a.d(string);
    }

    public final void o(eip object, eae object2) {
        jse.e(object, "clientInfo");
        jse.e(object2, "params");
        eng eng2 = (eng)((enc)this.b).b.b();
        String string = Integer.toString(((eae)object2).e);
        String string2 = Integer.toString(((eae)object2).d);
        object2 = Integer.toString(((eae)object2).f);
        object = eio.a(((eip)object).b).name();
        ((fsx)eng2.e.a()).b(string, string2, object2, object);
    }

    public final void p(etr object) {
        hwv hwv2;
        eip eip2 = hwv2 = object.f().b.c;
        if (hwv2 == null) {
            eip2 = eip.a;
        }
        jse.d(eip2, "getClientInfo(...)");
        int n2 = object.f().a;
        Object object2 = object.c().c;
        hwv2 = object2;
        if (object2 == null) {
            hwv2 = eaz.a;
        }
        object2 = this.a;
        jse.d(hwv2, "getAudioRouteType(...)");
        object = object.b().a();
        jse.d(object, "getAudioRouteDisconnectStatus(...)");
        object2.o(eip2, n2, (eaz)hwv2, (hpn)object);
    }

    public final void q(eip object, hpn hpn2, Integer n2, eaz eaz2) {
        jse.e(object, "clientInfo");
        this.a.s((eip)object, n2);
        object = new emu(this, (eip)object, n2, eaz2, hpn2, null, 2);
        jse.ah((jvb)this.c, null, null, (jro)object, 3);
    }

    public final void r(hpn hpn2, etr object) {
        Object object2;
        jse.e(hpn2, "updateStatus");
        Object object3 = object.b().a();
        Object object4 = gto.h(object.f().a);
        Object object5 = object2 = object.c().c;
        if (object2 == null) {
            object5 = eaz.a;
        }
        ((evo)this.d).c(hpn2, (hpn)object3, (gto)object4, (eaz)object5);
        object4 = this.a;
        object5 = object2 = object.f().b.c;
        if (object2 == null) {
            object5 = eip.a;
        }
        jse.d(object5, "getClientInfo(...)");
        hpn hpn3 = object.b().a();
        jse.d(hpn3, "getAudioRouteDisconnectStatus(...)");
        int n2 = object.f().a;
        object2 = object3 = object.c().c;
        if (object3 == null) {
            object2 = eaz.a;
        }
        jse.d(object2, "getAudioRouteType(...)");
        object4.q((eip)object5, hpn2, hpn3, n2, (eaz)object2);
        object5 = this.b;
        object = object.d();
        ((enc)object5).b(hpn2, (ekk)object);
    }

    public final void s(efs object, eaf object2) {
        Object object3;
        Object object4 = dox.n(ecf.a.l());
        Object object5 = eca.a.l();
        jse.e(object5, "builder");
        jse.e(object, "value");
        if (!((hwp)object5).b.B()) {
            ((hwp)object5).u();
        }
        Object object6 = (eca)((hwp)object5).b;
        ((eca)object6).c = ((efs)object).o;
        ((eca)object6).b |= 1;
        jse.e(object2, "value");
        if (!((hwp)object5).b.B()) {
            ((hwp)object5).u();
        }
        object6 = (eca)((hwp)object5).b;
        object2.getClass();
        ((eca)object6).d = object2;
        ((eca)object6).b |= 2;
        if ((((eaf)object2).b & 1) != 0) {
            object3 = hms.a(crh.Q(((eaf)object2).c)).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS"));
            jse.e(object3, "value");
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            object6 = (eca)((hwp)object5).b;
            object3.getClass();
            ((eca)object6).b |= 4;
            ((eca)object6).e = object3;
        }
        object5 = ((hwp)object5).o();
        jse.d(object5, "build(...)");
        object6 = (eca)object5;
        jse.e(object6, "value");
        object3 = (hwp)((bzo)object4).a;
        if (!((hwp)object3).b.B()) {
            ((hwp)object3).u();
        }
        object5 = this.d;
        object3 = (ecf)((hwp)object3).b;
        object6.getClass();
        ((ecf)object3).d = object6;
        ((ecf)object3).c = 4;
        object4 = ((bzo)object4).v();
        ((evo)object5).e((ecf)object4);
        object5 = this.b;
        object4 = ewt.a;
        ((hws)object2).h((gpm)object4);
        if (!((hws)object2).r.o((hwu)((gpm)object4).a)) {
            return;
        }
        object6 = ewt.a;
        ((hws)object2).h((gpm)object6);
        object4 = ((hws)object2).r.l((hwu)((gpm)object6).a);
        object4 = object4 == null ? ((gpm)object6).d : ((gpm)object6).k(object4);
        object4 = (ewr)object4;
        double d2 = Duration.ofNanos(((ewr)object4).d).toMillis();
        object3 = (enc)object5;
        object5 = (eng)((enc)object3).b.b();
        object6 = ((Enum)object).name();
        object = object4 = ews.b(((ewr)object4).c);
        if (object4 == null) {
            object = ews.a;
        }
        object = ((Enum)object).name();
        boolean bl2 = 1 == (((eaf)object2).b & 1);
        object2 = (String)((enc)object3).d.a();
        ((fsu)((eng)object5).k.a()).b(d2, object6, object, bl2, object2);
    }

    /*
     * Unable to fully structure code
     */
    public final void t(Integer var1_1, egz var2_4, ecb var3_5) {
        var7_6 = dox.n(ecf.a.l());
        if (var1_1 != null) {
            var1_1.intValue();
            var8_7 = var7_6.a;
            var4_8 = var1_1.intValue();
            var1_1 = (hwp)var8_7;
            if (!var1_1.b.B()) {
                var1_1.u();
            }
            var1_1 = (ecf)var1_1.b;
            var1_1.b |= 8;
            var1_1.h = var4_8;
        }
        if (var2_4.b != null) {
            block19: {
                var8_7 = doc.f(ecc.a.l());
                var8_7.d(var3_5);
                var8_7.c(eha.d(var2_4.b));
                var1_1 = var2_4.b;
                var3_5 = null;
                if (var1_1 != null) {
                    var1_1 = var1_1.getBluetoothClass();
                    if (var1_1 == null) ** break block18
                    try {
                        var1_1 = var1_1.getDeviceClass();
                    }
                    catch (Throwable var1_2) {
                        var1_1 = jns.aj(var1_2);
                    }
                } else {
                    var1_1 = null;
                }
                var6_9 = var1_1 instanceof jod;
                var5_10 = -16777216;
                if (var6_9) {
                    var1_1 = -16777216;
                }
                var4_8 = (var1_1 = (Integer)var1_1) != null ? var1_1.intValue() : -16777216;
                var1_1 = (hwp)var8_7.a;
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var1_1 = (ecc)var1_1.b;
                var1_1.b |= 4;
                var1_1.e = var4_8;
                var2_4 = var2_4.b;
                var1_1 = var3_5;
                if (var2_4 != null) {
                    var2_4 = var2_4.getBluetoothClass();
                    var1_1 = var3_5;
                    if (var2_4 == null) break block19;
                    try {
                        var1_1 = var2_4.getMajorDeviceClass();
                    }
                    catch (Throwable var1_3) {
                        var1_1 = jns.aj(var1_3);
                    }
                }
            }
            var2_4 = var1_1;
            if (var1_1 instanceof jod) {
                var2_4 = -16777216;
            }
            var1_1 = (Integer)var2_4;
            var4_8 = var5_10;
            if (var1_1 != null) {
                var4_8 = var1_1.intValue();
            }
            var1_1 = (hwp)var8_7.a;
            if (!var1_1.b.B()) {
                var1_1.u();
            }
            var1_1 = (ecc)var1_1.b;
            var1_1.b |= 8;
            var1_1.f = var4_8;
            var7_6.x(var8_7.b());
        } else {
            var1_1 = doc.f(ecc.a.l());
            var1_1.d(var3_5);
            var1_1.c(eha.e(var2_4.a));
            var7_6.x(var1_1.b());
        }
        var1_1 = this.d;
        var2_4 = var7_6.v();
        ((evo)var1_1).e((ecf)var2_4);
    }

    public final void u(eip eip2) {
        jse.e(eip2, "clientInfo");
        this.a.p(eip2, null);
    }

    public final void v(eip eip2, hpn hpn2, etz object) {
        Object object2;
        jse.e(eip2, "clientInfo");
        jse.e(hpn2, "updateStatus");
        Object object3 = object.c().a();
        gsl gsl2 = gsl.a;
        Object object4 = object2 = object.b().c;
        if (object2 == null) {
            object4 = eaz.a;
        }
        ((evo)this.d).c(hpn2, (hpn)object3, gsl2, (eaz)object4);
        object4 = this.b;
        object2 = object.d();
        ((enc)object4).b(hpn2, (ekk)object2);
        object3 = this.a;
        object2 = object.c().a();
        jse.d(object2, "getAudioRouteDisconnectStatus(...)");
        object = object4 = object.b().c;
        if (object4 == null) {
            object = eaz.a;
        }
        jse.d(object, "getAudioRouteType(...)");
        object3.q(eip2, hpn2, (hpn)object2, null, (eaz)object);
    }

    public final void w(ech object, epp object2, ebv ebv2) {
        bzo bzo2 = dox.o(ece.a.l());
        bzo2.B((ech)object);
        object = (epq)object2;
        bzo2.F(((epq)object).c);
        bzo2.G(ebv2);
        object = object2 = ((epq)object).b.g;
        if (object2 == null) {
            object = eip.a;
        }
        object2 = this.d;
        bzo2.C((eip)object);
        object = bzo2.y();
        ((evo)object2).d((ece)object);
    }

    public final void x(hpn hpn2, ekk ekk2) {
        jse.e(hpn2, "updateStatus");
        ((enc)this.b).a(hpn2, ekk2);
    }

    public final void y(String object, eip eip2, hpn hpn2, hpn hpn3) {
        object = new emy(this, (String)object, eip2, hpn2, hpn3, null);
        jse.ah((jvb)this.c, null, null, (jro)object, 3);
    }

    public final void z(emm emm2, ebs object) {
        if (object != null) {
            bzb bzb2 = dww.k(ebt.a.l());
            bzb2.q((ebs)object);
            object = bzb2.p();
        } else {
            object = dww.k(ebt.a.l());
            ((bzb)object).r(ebu.b);
            object = ((bzb)object).p();
        }
        this.a.v(emm2, (ebt)object);
    }
}

