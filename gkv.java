/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class gkv
implements Callable {
    public final Object a;
    private final int b;

    public /* synthetic */ gkv(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block25: {
            block26: {
                var1_1 = this.b;
                if (var1_1 == 0) break block25;
                var2_2 = false;
                if (var1_1 == 1) break block26;
                if (var1_1 != 2) {
                    return this.a.keySet();
                }
                var7_3 = this.a;
                var6_6 = (gky)var7_3;
                var6_6.b.writeLock().lock();
                if (((gky)var7_3).e.get()) {
                    return ((gky)var7_3).f;
                }
                try {
                    var8_16 = ((gky)var7_3).a();
                    var3_17 = var8_16.c;
                    var5_9 = (hwp)var8_16.C(5);
                    var5_9.x(var8_16);
                }
                catch (IOException var5_10) {
                    ((gky)var7_3).h(var5_10);
                    var3_17 = cgw.p().toEpochMilli();
                    var5_9 = gmk.a.l();
                }
                if (var3_17 > 0L) {
                    ((gky)var7_3).f = var3_17;
                    ((gky)var7_3).e.set(true);
                    return ((gky)var7_3).f;
                }
                ((gky)var7_3).f = var3_17 = cgw.p().toEpochMilli();
                if (!var5_9.b.B()) {
                    var5_9.u();
                }
                var8_16 = (gmk)var5_9.b;
                var8_16.b |= 1;
                var8_16.c = var3_17;
                var5_9 = (gmk)var5_9.o();
                ((gky)var7_3).g((gmk)var5_9);
                {
                    catch (Throwable var5_11) {
                        ** GOTO lbl-1000
                    }
                    catch (IOException var5_12) {}
                    {
                        a.as(gky.a.h(), "Could not write sync epoch. Using current time but future runs may be delayed.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", '\u008b', "SyncManagerDataStore.java", var5_12);
                        ((gky)var7_3).e.set(false);
                    }
                    return ((gky)var7_3).f;
                }
                ** try [egrp 3[TRYBLOCK] [9 : 273->288)] { 
lbl49:
                // 1 sources

                ((gky)var7_3).e.set(true);
                return ((gky)var7_3).f;
lbl-1000:
                // 1 sources

                {
                    ((gky)var7_3).e.set(true);
                    throw var5_11;
                }
lbl53:
                // 1 sources

                finally {
                    var6_6.b.writeLock().unlock();
                }
            }
            var5_14 = this.a;
            jse.e(var5_14, "$listenersFinished");
            if (var5_14 instanceof Collection && var5_14.isEmpty()) ** GOTO lbl63
            var5_14 = var5_14.iterator();
            do {
                block27: {
                    if (var5_14.hasNext()) break block27;
lbl63:
                    // 2 sources

                    var2_2 = true;
                    return var2_2;
                }
                var6_7 = hhk.S((hpn)var5_14.next());
                jse.d(var6_7, "getDone(...)");
            } while (((Boolean)var6_7).booleanValue());
            return var2_2;
        }
        var5_15 = new hat();
        var6_8 = this.a;
        try {
            var7_4 = ((gky)var6_8).a();
            var6_8 = var7_4.f.iterator();
        }
        catch (IOException var7_5) {
            ((gky)var6_8).h(var7_5);
            return var5_15.g();
        }
        while (true) {
            if (!var6_8.hasNext()) {
                return var5_15.g();
            }
            var5_15.j(fym.a((Integer)var6_8.next(), gda.a));
        }
    }
}

