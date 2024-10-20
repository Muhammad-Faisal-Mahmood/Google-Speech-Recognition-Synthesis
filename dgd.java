/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 */
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class dgd {
    public final dfu a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;
    public final dga f;
    public long g;
    public long h;
    public long i;
    private final Set j;
    private final long k;
    private final long l;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public dgd(dfu var1_1, dgc var2_4, List var3_7, long var4_9) {
        block26: {
            block27: {
                block28: {
                    super();
                    this.j = new HashSet<E>();
                    this.c = new ArrayList<E>();
                    this.d = new HashMap<K, V>();
                    this.e = new HashMap<K, V>();
                    this.a = var1_1;
                    this.f = new dga();
                    this.b = var3_7;
                    var9_10 = var3_7.iterator();
                    while (var9_10.hasNext()) {
                        var3_7 = (dfy)var9_10.next();
                        this.j.add(var3_7.e());
                    }
                    this.g = var4_9;
                    var3_7 = var1_1.b;
                    synchronized (var3_7) {
                        var9_10 = var1_1.c.values();
                    }
                    var3_7 = var9_10.iterator();
                    block16: while (true) {
                        if (!var3_7.hasNext()) {
                            this.k = dly.H(this.d.values());
                            this.l = dly.H(this.e.values());
                            return;
                        }
                        var11_17 = (dgc)var3_7.next();
                        if (var11_17.c) break block26;
                        var14_20 = var11_17.a;
                        var13_19 = dfu.a;
                        var12_18 = new HashMap<Object, Object>();
                        var9_10 = var1_1.g(var14_20);
                        if (var9_10.exists()) {
                            for (Object var10_14 : dda.d((File)var9_10)) {
                                var15_21 = new fpn();
                                var15_21.b = new dco(var14_20, var10_14.getName());
                                var15_21.e = var10_14;
                                var15_21.d = var1_1.b(var14_20);
                                var15_21.c = var1_1.d;
                                var15_21.a = var1_1.e;
                                var10_14 = var15_21.b();
                                var12_18.put(var10_14.a, var10_14);
                            }
                        }
                        var15_21 = var1_1.d;
                        var16_22 = new ArrayList<E>();
                        var9_10 = ((dfl)var15_21).b.getReadableDatabase().query("file_metadata", dfl.a, "namespace=?", new String[]{var14_20}, null, null, null, null);
                        if (var9_10 != null) break;
lbl48:
                        // 2 sources

                        while (true) {
                            var9_10 = var16_22.iterator();
                            while (var9_10.hasNext()) {
                                var10_14 = (dez)var9_10.next();
                                if (!var13_19.a(var10_14.b())) continue;
                                var16_22 = var10_14.f();
                                var15_21 = new fpn();
                                var15_21.e = var1_1.f((ddn)var16_22);
                                var15_21.b = var16_22;
                                var15_21.d = var1_1.b(var14_20);
                                var15_21.f = var10_14;
                                var15_21.a = var1_1.e;
                                var12_18.put(var16_22, var15_21.b());
                            }
                            this.e.putAll(var12_18);
                            var9_10 = var3_7;
                            if (var11_17.equals(var2_4)) {
                                this.d.putAll(var12_18);
                                var9_10 = var3_7;
                            }
lbl68:
                            // 4 sources

                            while (true) {
                                var3_7 = var9_10;
                                continue block16;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    try {
                        while (var8_13 = var9_10.moveToNext()) {
                            try {
                                var6_11 = var9_10.getInt(4);
                                dcv.d(var6_11);
                            }
                            catch (IllegalArgumentException var10_15) {
                                ((hfk)((hfk)ddd.a.h()).i(var10_15)).r("Invalid gc priority value found in the table, ignoring row...");
                                var6_11 = 0;
                            }
                            try {
                                var7_12 = var9_10.getInt(3);
                                dec.q(var7_12);
                            }
                            catch (IllegalArgumentException var10_16) {
                                ((hfk)((hfk)ddd.a.h()).i(var10_16)).r("Invalid reservation state value found in the table, ignoring row...");
                                var7_12 = 0;
                            }
                            var10_14 = var9_10.getString(7);
                            var10_14 = var10_14 != null ? ded.c((String)var10_14, var9_10.getInt(8)) : null;
                            var17_23 = dez.i();
                            var19_25 = var9_10.getString(0);
                            var20_26 = var9_10.getString(1);
                            var18_24 = new dco(var19_25, var20_26);
                            var17_23.d(var18_24);
                            var17_23.b(var6_11);
                            var17_23.e(var7_12);
                            var17_23.c(var9_10.getLong(5));
                            var17_23.f(var9_10.getLong(2));
                            var17_23.b = var9_10.getString(6);
                            var17_23.a = var10_14;
                            var17_23.g(var9_10.getInt(9));
                            var16_22.add(var17_23.a());
                        }
                    }
                    catch (Throwable var1_2) {
                        var2_4 = var9_10;
                        break block27;
                    }
                    catch (SQLiteException var2_5) {
                        var1_1 = var9_10;
                        break block28;
                    }
                    var9_10.close();
                    ** while (true)
                    catch (Throwable var1_3) {
                        var2_4 = null;
                        break block27;
                    }
                    catch (SQLiteException var2_6) {
                        var1_1 = null;
                    }
                }
                try {
                    var3_7 = ((dfl)var15_21).b;
                    var9_10 = new IOException("SqliteFileMetadataTable#getAll, SQL query failed", (Throwable)var2_4);
                    var3_7.a((IOException)var9_10);
                    throw var9_10;
                }
                catch (Throwable var3_8) {
                    var2_4 = var1_1;
                    var1_1 = var3_8;
                }
            }
            if (var2_4 != null) {
                var2_4.close();
            }
            throw var1_1;
        }
        var9_10 = var3_7;
        ** while (true)
    }

    final long a() {
        return dly.G(this.e.values());
    }

    final long b() {
        return dly.G(this.d.values());
    }

    final long c() {
        return this.l + this.h - this.i;
    }

    final long d() {
        return this.k + this.h - this.i;
    }

    final void e(long l2, dfy object, int n2, int n3) {
        long l3;
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/gc/ReservationContext", "collectGarbage", 168, "ReservationContext.java")).G("Executing garbage collection, extra needed: %d, gcType: %d, threshold: %d", l2, n2, n3);
        Object object2 = n2 == 3 ? this.e : this.d;
        Object object3 = this.j;
        Object object4 = this.a;
        Object object5 = new ArrayList<dfr>();
        Iterator iterator = object2.values().iterator();
        while (iterator.hasNext()) {
            object2 = ((dfu)object4).h;
            dfr dfr2 = (dfr)iterator.next();
            if (((cxu)object2).f(dfr2.b) || object3.contains(dfr2.a) || dfr2.c().b() == 2) continue;
            object5.add(dfr2);
        }
        object2 = object5.iterator();
        while (object2.hasNext()) {
            ((dfr)object2.next()).c();
        }
        Collections.sort(object5, new dfz(n2));
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/gc/ReservationContext", "collectGarbage", 176, "ReservationContext.java")).u("All GC candidates (sorted): %s", object5);
        int n4 = ((dfy)object).f();
        object2 = new ArrayList();
        object = object5.iterator();
        while (object.hasNext()) {
            object5 = (dfr)object.next();
            object3 = ((dfr)object5).c();
            int n5 = ((dez)object3).b();
            if (n5 > n3) {
                object3 = (hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/gc/GcUtil", "selectForGc", 166, "GcUtil.java");
                object4 = dec.h(n3);
                object3.G("Skipping %s, reservation state (%s) larger than threshold (%s)", object5, dec.h(n5), object4);
                continue;
            }
            int n6 = ((dfr)object5).a();
            if (n5 > 0 && n6 >= n4) {
                ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/gc/GcUtil", "selectForGc", 179, "GcUtil.java")).G("Skipping %s, priority (%d) higher or equal than current (%d)", object5, n6, n4);
                continue;
            }
            object2.add(object5);
            l3 = n2 != 3 && n2 != 2 ? ((dez)object3).e() : ((dfr)object5).b();
            if ((l2 -= l3) > 0L) continue;
            break;
        }
        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/gc/ReservationContext", "collectGarbage", 182, "ReservationContext.java")).u("Files selected for GC: %s", object2);
        object5 = object2.iterator();
        l2 = 0L;
        while (object5.hasNext()) {
            object = (dfr)object5.next();
            this.e.remove(((dfr)object).a);
            this.d.remove(((dfr)object).a);
            l3 = ((dfr)object).b();
            this.c.add(object);
            l2 = Math.max(l2, l2 + l3);
            long l4 = this.g;
            this.g = Math.max(l4, l3 + l4);
        }
        l3 = this.i;
        this.i = Math.max(l3, l3 + l2);
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/gc/ReservationContext", "delete", 211, "ReservationContext.java")).w("%d files garbage collected (uncommitted): %d bytes", object2.size(), l2);
    }
}

