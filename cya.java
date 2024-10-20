/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Map$_EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class cya {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public cya() {
        this.e = new AtomicBoolean(false);
        this.a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    public cya(alx alx2, MediaFormat mediaFormat, adu adu2, MediaCrypto mediaCrypto, awf awf2) {
        this.e = alx2;
        this.b = mediaFormat;
        this.a = adu2;
        this.c = null;
        this.d = awf2;
    }

    public cya(Context context, bfs bfs2, bfn bfn2, bfs bfs3, bfs bfs4) {
        jse.e(context, "context");
        this.c = context;
        this.a = bfs2;
        this.b = bfn2;
        this.d = bfs3;
        this.e = bfs4;
    }

    public cya(Context context, jnu object, jnu object2, jnu jnu2, bzo object3) {
        jse.e(object, "backgroundExecutor");
        jse.e(object2, "synchronousFileStorage");
        jse.e(jnu2, "phenotypeClient");
        this.b = context;
        this.e = object;
        this.d = jnu2;
        this.c = object3;
        object = new eyd(object, 5);
        object2 = new eyd(object2, 6);
        object3 = new eyd(jnu2, 7);
        jnu2 = context;
        this.a = new dwq(context, (gui)object, (gui)object2, (gui)object3);
    }

    public cya(dus dus2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, iku iku2, iku iku3, Executor executor) {
        jse.e(ambientModeSupport$AmbientController, "subpackager");
        jse.e(iku2, "runtimeProperties");
        jse.e(iku3, "runtimePropertiesWithFallback");
        jse.e(executor, "executor");
        this.b = dus2;
        this.e = ambientModeSupport$AmbientController;
        this.c = iku2;
        this.d = iku3;
        this.a = executor;
    }

    public cya(frr frr2, frr frr3, frr frr4, frr frr5, frr frr6) {
        this.a = frr2;
        this.b = frr3;
        this.c = frr4;
        this.d = frr5;
        this.e = frr6;
    }

    public cya(gcv gcv2, Map map) {
        this.b = new EnumMap(ewy.class);
        this.d = new EnumMap(exb.class);
        this.e = "Pseudonymous";
        this.a = gcv2;
        this.c = map;
    }

    public cya(hth hth2, hpq hpq2, hpq hpq3, jnu jnu2, jnu jnu3) {
        this.a = hth2;
        this.b = hpq2;
        this.c = hpq3;
        this.e = jnu2;
        this.d = jnu3;
    }

    public cya(jnu jnu2, jnu jnu3, hpq hpq2, cya cya2) {
        jse.e(jnu2, "phenotypeApi");
        jse.e(jnu3, "allPackages");
        jse.e(hpq2, "backgroundExecutor");
        jse.e(cya2, "storageInfoProvider");
        this.d = jnu2;
        this.c = jnu3;
        this.e = hpq2;
        this.b = cya2;
        this.a = new jog(new eop(this, 20));
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.d = jnu3;
        jnu4.getClass();
        this.e = jnu4;
        this.c = jnu5;
        jnu6.getClass();
        this.b = jnu6;
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.a = jnu3;
        jnu4.getClass();
        this.e = jnu4;
        jnu5.getClass();
        this.c = jnu5;
        jnu6.getClass();
        this.d = jnu6;
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.e = jnu2;
        jnu3.getClass();
        this.a = jnu3;
        jnu4.getClass();
        this.b = jnu4;
        jnu5.getClass();
        this.d = jnu5;
        jnu6.getClass();
        this.c = jnu6;
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.d = jnu3;
        jnu4.getClass();
        this.e = jnu4;
        jnu5.getClass();
        this.b = jnu5;
        jnu6.getClass();
        this.c = jnu6;
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, byte[] byArray, char[] cArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.c = jnu3;
        jnu4.getClass();
        this.d = jnu4;
        jnu5.getClass();
        this.e = jnu5;
        jnu6.getClass();
        this.a = jnu6;
    }

    public cya(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, char[] cArray) {
        this.b = jnu2;
        this.a = jnu3;
        this.d = jnu4;
        this.e = jnu5;
        this.c = jnu6;
    }

    public cya(byte[] object) {
        this.b = new AtomicReferenceArray(128);
        this.d = new juc(null, jud.a);
        this.e = new jua(0, jud.a);
        object = jud.a;
        this.c = new jua(0, (jse)object);
        this.a = new jua(0, (jse)object);
    }

    /*
     * Unable to fully structure code
     */
    public static void c(cai var0, gui var1_1, gte var2_2) {
        block45: {
            block47: {
                block48: {
                    block46: {
                        var12_3 = new ArrayList<cjn>();
                        var11_4 = new HashSet<Object>();
                        if (!var0.i.isEmpty()) {
                            for (Object var1_1 : (Set)var1_1.a()) {
                                var12_3.add(var1_1.a);
                                var11_4.add(var1_1.b);
                            }
                        }
                        if ((var1_1 = var0.d) != null) {
                            var8_6 = var1_1.iterator();
                            while (var8_6.hasNext()) {
                                var1_1 = (String)var8_6.next();
                                var7_5 = (dvo)var2_2.apply(var1_1);
                                if (var7_5 == null) continue;
                                var12_3.add(var7_5.a);
                                var11_4.add(var1_1);
                            }
                        }
                        if (var12_3.isEmpty()) break block45;
                        if (var12_3.size() != 1) break block46;
                        var1_1 = (cjn)var12_3.get(0);
                        break block47;
                    }
                    if (var12_3.isEmpty()) break block48;
                    var1_1 = ((cjn)var12_3.get((int)0)).b;
                    var2_2 = var12_3.iterator();
                    while (var2_2.hasNext()) {
                        if (a.k(var1_1, ((cjn)var2_2.next()).b)) continue;
                        ** GOTO lbl-1000
                    }
                }
                if (!var12_3.isEmpty()) {
                    var1_1 = ((cjn)var12_3.get((int)0)).b;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = "";
                }
                var14_7 = cjn.a(var12_3, new cjl(1));
                var13_8 = cjn.a(var12_3, new cjl(0));
                var15_9 = cjn.a(var12_3, new cjl(2));
                var16_10 = cjn.a(var12_3, new cjl(3));
                var2_2 = var12_3.iterator();
                var4_11 = 1;
                var3_12 = 0;
                while (var2_2.hasNext()) {
                    var7_5 = (cjn)var2_2.next();
                    if (var7_5 == null || (var7_5 = (Object)var7_5.h) == null) continue;
                    var3_12 += ((Object)var7_5).length;
                    var4_11 = 0;
                }
                if (var4_11 != 0) {
                    var2_2 = null;
                } else {
                    var7_5 = new int[var3_12];
                    var8_6 = var12_3.iterator();
                    var3_12 = 0;
                    while (true) {
                        var2_2 = var7_5;
                        if (!var8_6.hasNext()) break;
                        var2_2 = (cjn)var8_6.next();
                        var4_11 = var3_12;
                        if (var2_2 != null) {
                            var2_2 = var2_2.h;
                            var4_11 = var3_12;
                            if (var2_2 != null) {
                                var5_13 = 0;
                                while (true) {
                                    var4_11 = ++var3_12;
                                    if (var5_13 >= ((Object)var2_2).length) break;
                                    var7_5[var3_12] = var2_2[var5_13];
                                    ++var5_13;
                                }
                            }
                        }
                        var3_12 = var4_11;
                    }
                }
                var7_5 = var12_3.iterator();
                var3_12 = 0;
                var4_11 = 1;
                while (var7_5.hasNext()) {
                    var8_6 = (cjn)var7_5.next();
                    var6_14 = var4_11;
                    var5_13 = var3_12;
                    if (var8_6 != null) {
                        var6_14 = var4_11;
                        var5_13 = var3_12;
                        if (var8_6.c != null) {
                            var5_13 = var3_12 + 1;
                            var6_14 = 0;
                        }
                    }
                    var4_11 = var6_14;
                    var3_12 = var5_13;
                    if (var8_6 == null) continue;
                    var8_6 = var8_6.i;
                    var4_11 = var6_14;
                    var3_12 = var5_13;
                    if (var8_6 == null) continue;
                    var3_12 = var5_13 + ((Iterator<E>)var8_6).length;
                    var4_11 = 0;
                }
                if (var4_11 != 0) {
                    var7_5 = null;
                } else {
                    var7_5 = new byte[var3_12][];
                    var8_6 = var12_3.iterator();
                    var4_11 = 0;
                    block7: while (var8_6.hasNext()) {
                        var10_16 = (cjn)var8_6.next();
                        var3_12 = var4_11;
                        if (var10_16 != null) {
                            var9_15 = var10_16.c;
                            var3_12 = var4_11;
                            if (var9_15 != null) {
                                var7_5[var4_11] = var9_15;
                                var3_12 = var4_11 + 1;
                            }
                        }
                        var4_11 = var3_12;
                        if (var10_16 == null) continue;
                        var9_15 = var10_16.i;
                        var4_11 = var3_12;
                        if (var9_15 == null) continue;
                        var5_13 = 0;
                        while (true) {
                            var4_11 = ++var3_12;
                            if (var5_13 >= ((Iterator<E>)var9_15).length) continue block7;
                            var7_5[var3_12] = var9_15[var5_13];
                            ++var5_13;
                        }
                    }
                }
                var8_6 = var12_3.iterator();
                var4_11 = 1;
                var3_12 = 0;
                while (var8_6.hasNext()) {
                    var9_15 = (cjn)var8_6.next();
                    if (var9_15 == null || (var9_15 = (Object)var9_15.j) == null) continue;
                    var3_12 += ((Object)var9_15).length;
                    var4_11 = 0;
                }
                if (var4_11 != 0) {
                    var8_6 = null;
                } else {
                    var9_15 = new int[var3_12];
                    var8_6 = var12_3.iterator();
                    var3_12 = 0;
                    while (var8_6.hasNext()) {
                        var10_16 = (cjn)var8_6.next();
                        if (var10_16 != null && (var10_16 = (Object)var10_16.j) != null) {
                            var4_11 = 0;
                            while (true) {
                                var5_13 = ++var3_12;
                                if (var4_11 < ((Object)var10_16).length) {
                                    var9_15[var3_12] = var10_16[var4_11];
                                    ++var4_11;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var5_13 = var3_12;
                        }
                        var3_12 = var5_13;
                    }
                    var8_6 = var9_15;
                }
                var9_15 = var12_3.iterator();
                var3_12 = 1;
                var4_11 = 0;
                while (var9_15.hasNext()) {
                    var10_16 = (cjn)var9_15.next();
                    if (var10_16 == null || (var10_16 = (Object)var10_16.k) == null) continue;
                    var4_11 += ((Object)var10_16).length;
                    var3_12 = 0;
                }
                if (var3_12 != 0) {
                    var9_15 = null;
                } else {
                    var10_16 = new byte[var4_11][];
                    var9_15 = var12_3.iterator();
                    var3_12 = 0;
                    while (var9_15.hasNext()) {
                        var12_3 = (cjn)var9_15.next();
                        if (var12_3 != null && (var17_17 = var12_3.k) != null) {
                            var4_11 = 0;
                            while (true) {
                                var5_13 = var3_12;
                                if (var4_11 < var17_17.length) {
                                    var12_3 = var17_17[var4_11];
                                    var5_13 = var3_12;
                                    if (var12_3 != null) {
                                        var10_16[var3_12] = var12_3;
                                        var5_13 = var3_12 + 1;
                                    }
                                    ++var4_11;
                                    var3_12 = var5_13;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var5_13 = var3_12;
                        }
                        var3_12 = var5_13;
                    }
                    var9_15 = var10_16;
                }
                var1_1 = new cjn((String)var1_1, null, var14_7, var13_8, var15_9, var16_10, (int[])var2_2, (byte[][])var7_5, (int[])var8_6, (byte[][])var9_15);
            }
            if (var0.a.c()) ** GOTO lbl205
            if (var0.g == null) {
                var0.g = new HashSet<E>();
            }
            var0.g.addAll(var11_4);
            if (!var0.a.c()) {
                if (var1_1 != null) {
                    if (var0.f == null) {
                        var0.f = new ArrayList<E>();
                    }
                    var0.f.add(var1_1);
                    return;
                }
            } else {
                throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
lbl205:
                // 1 sources

                throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
            }
        }
    }

    public static final void j(dvj object) {
        if ((((dvj)object).b & 1) != 0 && ((dvj)object).d == (long)Build.VERSION.SDK_INT) {
            object = ((dvj)object).c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dxi a(ewy object) {
        synchronized (this) {
            bof bof2 = new bof(this, 11);
            return (dxi)Map$_EL.computeIfAbsent((Map)this.b, object, bof2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dxi b(exb object) {
        synchronized (this) {
            bof bof2 = new bof(this, 10);
            return (dxi)Map$_EL.computeIfAbsent((Map)this.d, object, bof2);
        }
    }

    public final void d(hvu object, Set hashSet, String string, boolean bl2) {
        if (!hashSet.isEmpty() && !((AtomicBoolean)this.e).getAndSet(true)) {
            caj.f(new dvp(this));
        }
        object = ((hvu)object).y();
        Object object2 = cjn.a;
        object = new dvo(new cjn("", (byte[])object, (byte[][])object2, (byte[][])object2, (byte[][])object2, (byte[][])object2, null, null, null, null), string);
        this.c.put(string, object);
        object2 = hashSet.iterator();
        while (object2.hasNext()) {
            Object object3 = this.d;
            string = (String)object2.next();
            Object object4 = object3.putIfAbsent(string, new hdq(object));
            if (object4 == null) continue;
            hat hat2 = new hat();
            if (bl2) {
                hashSet = new HashSet<Object>();
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    object4 = (dvo)iterator.next();
                    if (((dvo)object4).b.equals(((dvo)object).b)) continue;
                    hashSet.add(object4);
                }
                hat2.i(hashSet);
            } else {
                hat2.i((Iterable)object4);
            }
            hat2.j(object);
            object3.put(string, hat2.g());
        }
    }

    public final int e() {
        return ((jua)this.e).b - ((jua)this.c).b;
    }

    public final kcf f(kcf kcf2) {
        if (this.e() == 127) {
            return kcf2;
        }
        if (kcf2.h) {
            ((jua)this.a).a();
        }
        int n2 = ((jua)this.e).b & 0x7F;
        while (((AtomicReferenceArray)this.b).get(n2) != null) {
            Thread.yield();
        }
        ((AtomicReferenceArray)this.b).lazySet(n2, kcf2);
        ((jua)this.e).a();
        return null;
    }

    public final kcf g() {
        Object object;
        int n2;
        do {
            object = this.c;
            Object object2 = this.e;
            n2 = ((jua)object).b;
            if (n2 - ((jua)object2).b != 0) continue;
            return null;
        } while (!((jua)this.c).b(n2, n2 + 1) || (object = (kcf)((AtomicReferenceArray)this.b).getAndSet(n2 & 0x7F, null)) == null);
        if (((kcf)object).h) {
            ((jua)this.a).c();
            boolean bl2 = jve.a;
        }
        return object;
    }

    public final kcf h(int n2, boolean bl2) {
        Object object = (AtomicReferenceArray)this.b;
        kcf kcf2 = (kcf)((AtomicReferenceArray)object).get(n2 &= 0x7F);
        if (kcf2 != null && kcf2.h == bl2) {
            AtomicReferenceArray atomicReferenceArray;
            object = this.b;
            do {
                if (!(atomicReferenceArray = (AtomicReferenceArray)object).compareAndSet(n2, kcf2, null)) continue;
                if (bl2) {
                    ((jua)this.a).c();
                }
                return kcf2;
            } while (atomicReferenceArray.get(n2) == kcf2);
        }
        return null;
    }

    public final hpn i() {
        return ((dwq)this.a).c(false);
    }

    public final ffv k(fgu fgu2, ffk ffk2, fgr fgr2) {
        Object object = this.c;
        Object object2 = this.b.b();
        ((cgw)object.b()).getClass();
        object = (hpr)this.d.b();
        object.getClass();
        Object object3 = this.a;
        Object object4 = this.e.b();
        object3 = (gcv)object3.b();
        object4 = (bmu)object4;
        return new ffv((hth)object2, (hpr)object, (bmu)object4, (gcv)object3, fgu2, ffk2, fgr2);
    }
}

