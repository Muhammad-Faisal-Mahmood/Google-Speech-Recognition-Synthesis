/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.Callable;

public final class gkx
implements Callable {
    public final gky a;
    public final long b;

    public /* synthetic */ gkx(gky gky2, long l2) {
        this.a = gky2;
        this.b = l2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block9: {
            var4_1 = gmk.a;
            var4_1 = this.a;
            var4_1.b.writeLock().lock();
            var2_2 = this.b;
            var5_3 = var4_1.a();
            ** GOTO lbl11
            {
                catch (Throwable var5_4) {
                    break block9;
                }
lbl11:
                // 1 sources

                var7_6 = (hwp)var5_3.C(5);
                var7_6.x(var5_3);
                if (!var7_6.b.B()) {
                    var7_6.u();
                }
                var6_7 = (gmk)var7_6.b;
                var6_7.b |= 2;
                var6_7.e = var2_2;
                try {
                    var4_1.g((gmk)var7_6.o());
                }
                catch (IOException var6_8) {
                    a.as(gky.a.h(), "Error writing sync data file. Cannot update last wakeup.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", '\u0212', "SyncManagerDataStore.java", var6_8);
                }
                var4_1.b.writeLock().unlock();
                var1_10 = var5_3.b;
                if ((var1_10 & 2) != 0) {
                    return var5_3.e;
                }
                if ((var1_10 & 1) == 0) return -1L;
                return var5_3.c;
                catch (IOException var6_9) {}
                {
                    gun.b(var6_9);
                    var5_5 = new RuntimeException(var6_9);
                    throw var5_5;
                }
            }
        }
        var4_1.b.writeLock().unlock();
        throw var5_4;
    }
}

