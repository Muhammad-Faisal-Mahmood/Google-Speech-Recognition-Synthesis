/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.SparseArray
 *  gqv
 *  hom
 */
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class grb
implements Runnable {
    public final gqa a;
    public final UUID b;
    public final boolean c;
    public final gqm d;
    public final AtomicReference e;
    public hpn f;
    int g = 0;
    private final long h;
    private final Set i = new HashSet();
    private final boolean j;

    public grb(gqa gqa2, UUID uUID, gqm gqm2, gra gra2, long l2, boolean bl2, boolean bl3) {
        this.a = gqa2;
        this.b = uUID;
        this.d = gqm2;
        this.h = l2;
        this.c = false;
        this.j = bl3;
        this.e = new AtomicReference<gra>(gra2);
    }

    public final long a() {
        long l2 = this.j ? cgw.q().toMillis() * 1000000L : cgw.o();
        return l2 - this.h;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final gqo b() {
        synchronized (this) {
            block39: {
                block41: {
                    block40: {
                        var8_1 = (gra)this.e.get();
                        var6_2 = var8_1.f + 1;
                        var11_3 /* !! */  = new gra[var6_2];
                        while (var8_1 != null && (var1_4 = var8_1.f) >= 0) {
                            var11_3 /* !! */ [var1_4] = var8_1;
                            var8_1 = var8_1.g;
                        }
                        var8_1 = this.d;
                        var13_5 = (hwp)var8_1.C(5);
                        var13_5.x((hwv)var8_1);
                        var12_6 = new SparseArray(var6_2);
                        var14_7 = var11_3 /* !! */ [0];
                        var9_8 = null;
                        for (var1_4 = 0; var1_4 < var6_2; ++var1_4) {
                            var10_9 = var11_3 /* !! */ [var1_4];
                            var8_1 = var10_9.e;
                            var15_10 = gop.h(goy.c, (gop)var8_1, gqv.a);
                            var8_1 = var9_8;
                            if (var15_10.b()) {
                                ((gnq)var15_10.a()).a();
                                var8_1 = var9_8;
                                if (var10_9 != var14_7) {
                                    var8_1 = var10_9;
                                }
                            }
                            var12_6.append(var10_9.f, (Object)gop.e(var10_9.e, var10_9.c()));
                            var9_8 = var8_1;
                        }
                        if (this.i.isEmpty()) break block40;
                        var8_1 = new int[var6_2];
                        for (var1_4 = 0; var1_4 < var6_2; ++var1_4) {
                            var10_9 = var11_3 /* !! */ [var1_4];
                            var8_1[var10_9.f] = var10_9.a();
                        }
                        if (var9_8 != null) {
                            var1_4 = var9_8.f;
                            var8_1[var1_4] = -1;
                            var8_1[0] = var1_4;
                        }
                        var10_9 = this.i.iterator();
                        while (var10_9.hasNext()) {
                            var8_1 = ((goq)var10_9.next()).a();
                        }
                        if (var8_1 != null) break block41;
                    }
                    var3_13 /* !! */  = 0;
                    var1_4 = 0;
                    ** GOTO lbl72
                }
                var15_10 = new BitSet(var6_2);
                var2_11 = 0;
                var4_12 = 0;
                while (true) {
                    if (var2_11 < var6_2) {
                        var10_9 = var11_3 /* !! */ [var2_11];
                        var5_14 = var10_9.f;
                        var1_4 = var4_12;
                        var3_13 /* !! */  = var5_14;
                        if (var8_1[var5_14] == -1) {
                            fxf.r((boolean)(var4_12 ^ 1), "Can't have more than one root in the trace tree");
                            var1_4 = 1;
                            var3_13 /* !! */  = var5_14;
                        }
                    } else {
                        var1_4 = 0;
                        for (var2_11 = 0; var2_11 < var6_2; ++var2_11) {
                            var10_9 = var11_3 /* !! */ [var2_11];
                            var13_5.O(var10_9.b(false, (int)var8_1[var10_9.f]));
                            var3_13 /* !! */  = var1_4;
                            if (!var10_9.e()) {
                                var3_13 /* !! */  = var1_4 + 1;
                            }
                            var1_4 = var3_13 /* !! */ ;
                        }
                        var3_13 /* !! */  = 1;
lbl72:
                        // 2 sources

                        var2_11 = var1_4;
                        if (var3_13 /* !! */  == 0) {
                            break;
                        }
                        break block39;
                    }
                    while ((var3_13 /* !! */  = (int)var8_1[var3_13 /* !! */ ]) != -1 && !var15_10.get(var3_13 /* !! */ )) {
                        var7_15 = var3_13 /* !! */  != var10_9.f;
                        fxf.v(var7_15, "Detected loop in the newly constructed graph! Span %s is in the loop", var10_9.c);
                        var15_10.set(var3_13 /* !! */ );
                    }
                    var15_10.set(var10_9.f);
                    ++var2_11;
                    var4_12 = var1_4;
                }
                var3_13 /* !! */  = 0;
                while (true) {
                    var2_11 = var1_4;
                    if (var3_13 /* !! */  >= var6_2) break;
                    var10_9 = var11_3 /* !! */ [var3_13 /* !! */ ];
                    var8_1 = var10_9 == var9_8 ? var10_9.b(false, -1) : (var9_8 != null && var10_9 == var14_7 ? var10_9.b(false, var9_8.f) : var10_9.b(false, var10_9.a()));
                    var13_5.O((gok)var8_1);
                    var2_11 = var1_4;
                    if (!var10_9.e()) {
                        var2_11 = var1_4 + 1;
                    }
                    ++var3_13 /* !! */ ;
                    var1_4 = var2_11;
                }
            }
            if (this.g != 0) {
                var8_1 = gmv.a.l();
                var10_9 = gmu.a.l();
                var1_4 = this.g;
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var9_8 = (gmu)var10_9.b;
                var9_8.b |= 1;
                var9_8.c = var1_4;
                var9_8 = (gmu)var10_9.o();
                if (!var8_1.b.B()) {
                    var8_1.u();
                }
                var10_9 = (gmv)var8_1.b;
                var9_8.getClass();
                var10_9.c = var9_8;
                var10_9.b |= 1;
                var8_1 = (gmv)var8_1.o();
                if (!var13_5.b.B()) {
                    var13_5.u();
                }
                var9_8 = (gqm)var13_5.b;
                var10_9 = gqm.a;
                var8_1.getClass();
                var9_8.i = var8_1;
                var9_8.b |= 32;
            }
            var9_8 = var11_3 /* !! */ [0].c;
            var8_1 = this.b;
            var11_3 /* !! */  = (gqm)var13_5.o();
            if (var9_8 == null) {
                var8_1 = new NullPointerException("Null name");
                throw var8_1;
            }
            if (var11_3 /* !! */  != null) {
                return new gqo((String)var9_8, (UUID)var8_1, (gqm)var11_3 /* !! */ , var12_6, var2_11);
            }
            var8_1 = new NullPointerException("Null record");
            throw var8_1;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block23: {
            block22: {
                var9_1 = this.f;
                var11_9 = this.b();
                var2_10 = var9_1.isCancelled();
                var8_11 = this.a;
                if (var2_10) ** GOTO lbl29
                try {
                    hhk.S((Future)var9_1);
                    var6_12 = var11_9.c.g;
                    while (var6_12 > (var4_13 = var8_11.e.get())) {
                        if (!var8_11.e.compareAndSet(var4_13, 300000L + var6_12)) continue;
                        var4_13 = var6_12 - (long)var8_11.g;
                        for (Object var9_1 : var8_11.c.values()) {
                            if (var9_1.d.g >= var4_13) continue;
                            var12_17 = var8_11.b;
                            var13_19 = new gni(3);
                            var13_19 = var12_17.b((Runnable)var13_19, 10L, TimeUnit.SECONDS);
                            Objects.requireNonNull(var9_1);
                            var12_17 = new gjf(var9_1, 8);
                            var13_19.c((Runnable)var12_17, (Executor)hom.a);
                        }
                    }
                    var8_11.b(var11_9.c, var11_9.d, var11_9.a);
                }
                catch (ExecutionException var9_2) {
                    ((heg)((heg)((heg)gqa.a.g()).i(var9_2.getCause())).j("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 293, "TraceManagerImpl.java")).u("Trace %s failed collection", var11_9.a);
                }
                break block22;
lbl29:
                // 1 sources

                var10_16 = var11_9.c.i;
                var9_1 = var10_16;
                if (var10_16 == null) {
                    var9_1 = gmv.a;
                }
                var4_14 = SystemClock.elapsedRealtime();
                var12_18 = var11_9.c;
                var4_14 -= var12_18.g;
                var10_16 = (hwp)var12_18.C(5);
                var10_16.x((hwv)var12_18);
                var12_18 = (hwp)var9_1.C(5);
                var12_18.x((hwv)var9_1);
                var9_1 = gmt.a.l();
                var1_21 = var11_9.e;
                if (!var9_1.b.B()) {
                    var9_1.u();
                }
                var13_20 = var9_1.b;
                var14_22 /* !! */  = (gmt)var13_20;
                var14_22 /* !! */ .b |= 2;
                var14_22 /* !! */ .d = var1_21;
                if (!var13_20.B()) {
                    var9_1.u();
                }
                var13_20 = (gmt)var9_1.b;
                var13_20.b |= 1;
                var13_20.c = var4_14;
                var9_1 = (gmt)var9_1.o();
                if (!var12_18.b.B()) {
                    var12_18.u();
                }
                var13_20 = (gmv)var12_18.b;
                var9_1.getClass();
                var13_20.d = var9_1;
                var13_20.b |= 2;
                var12_18 = (gmv)var12_18.o();
                if (!var10_16.b.B()) {
                    var10_16.u();
                }
                var9_1 = (gqm)var10_16.b;
                var12_18.getClass();
                var9_1.i = var12_18;
                var9_1.b |= 32;
                var10_16 = (gqm)var10_16.o();
                var1_21 = var10_16.e.size() - 1;
                var13_20 = new ArrayList<E>();
                while (var1_21 != -1) {
                    try {
                        var14_22 /* !! */  = (gok)var10_16.e.get(var1_21);
                        var16_24 = var14_22 /* !! */ .c;
                        var9_1 = (var14_22 /* !! */ .b & 32) == 0 ? " (Timed Out)" : "";
                        var9_1 = String.valueOf(var16_24).concat((String)var9_1);
                    }
                    catch (Throwable var9_4) {
                        break block23;
                    }
                    try {
                        var15_23 = new StackTraceElement("tk_trace", (String)var9_1, "Started After", (int)(var14_22 /* !! */ .f / 1000L));
                        var13_20.add(var15_23);
                        var1_21 = ((gok)var10_16.e.get((int)var1_21)).e;
                    }
                    catch (Throwable var9_3) {
                        break block23;
                    }
                }
                try {
                    var12_18 = new gqq(null, var13_20.toArray(new StackTraceElement[0]));
                    var9_1 = Collections.singletonMap(0, var12_18);
                    var13_20 = new HashMap<K, V>();
                    gqq.j((gqm)var10_16, (Map)var9_1, 0, var13_20);
                    ((heg)((heg)((heg)gqa.a.g()).i((Throwable)var12_18)).j("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 342, "TraceManagerImpl.java")).G("Trace %s timed out after %d ms. Complete trace: %s", var11_9.a, var4_14, var10_16);
                    var9_1 = var11_9.d;
                    var12_18 = var11_9.a;
                }
                catch (Throwable var9_7) {
                    break block23;
                }
                try {
                    var8_11.b((gqm)var10_16, (SparseArray)var9_1, (String)var12_18);
                }
                catch (Throwable var9_6) {
                    break block23;
                }
            }
            var3_25 = (grb)var8_11.c.remove(var11_9.b) != null;
            fxf.A(var3_25);
            if (var8_11.d.g() && var2_10) {
                ((gmn)var8_11.d.c()).a();
            }
            return;
            catch (Throwable var9_8) {
                // empty catch block
            }
        }
        var3_26 = (grb)var8_11.c.remove(var11_9.b) != null;
        fxf.A(var3_26);
        if (var8_11.d.g() && var2_10) {
            ((gmn)var8_11.d.c()).a();
        }
        throw var9_5;
    }

    public final String toString() {
        String string = Integer.toHexString(System.identityHashCode(this));
        String string2 = this.b().a;
        StringBuilder stringBuilder = new StringBuilder("UnfinishedTrace@");
        stringBuilder.append(string);
        stringBuilder.append("[");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

