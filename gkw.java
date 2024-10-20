/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class gkw
implements Callable {
    public final gky a;
    public final gli b;
    public final long c;
    public final boolean d;

    public /* synthetic */ gkw(gky gky2, gli gli2, long l2, boolean bl2) {
        this.a = gky2;
        this.b = gli2;
        this.c = l2;
        this.d = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        long l2;
        hwv hwv2;
        Object object;
        hwv hwv3;
        gli gli2;
        hyg hyg2;
        hwv hwv4;
        long l3;
        gky gky2;
        block24: {
            gky2 = this.a;
            gky2.b.writeLock().lock();
            l3 = this.c;
            hwv4 = gmk.a;
            try {
                hyg2 = gky2.a();
            }
            catch (IOException iOException) {
                hyg2 = hwv4;
                if (gky2.h(iOException)) break block24;
                a.as(gky.a.g(), "Unable to read or clear store, will not update sync time. Sync may run too frequently.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", '\u0162', "SyncManagerDataStore.java", iOException);
                hyg2 = hwv4;
            }
        }
        hwp hwp2 = gmk.a.l();
        hwp2.x((hwv)hyg2);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ((gmk)hwp2.b).d = hyp.b;
        Iterator iterator = ((gmk)hyg2).d.iterator();
        hwv4 = null;
        while (true) {
            boolean bl2 = iterator.hasNext();
            gli2 = this.b;
            if (!bl2) break;
            hwv3 = (gmj)iterator.next();
            object = ((gmj)hwv3).c;
            hwv2 = object;
            if (object == null) {
                hwv2 = gmm.a;
            }
            if (gli2.equals(object = new gli((gmm)hwv2))) {
                hwv4 = hwv3;
                continue;
            }
            hwp2.N((gmj)hwv3);
        }
        if (hwv4 == null) return null;
        if (((gmk)hyg2).c < 0L) {
            long l4;
            l2 = l4 = gky2.f;
            if (l4 < 0L) {
                gky2.f = l2 = cgw.p().toEpochMilli();
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hyg2 = (gmk)hwp2.b;
            ((gmk)hyg2).b |= 1;
            ((gmk)hyg2).c = l2;
        }
        hyg2 = gmj.a.l();
        hwv2 = gli2.a;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hwv3 = ((hwp)hyg2).b;
        object = hwv3;
        hwv2.getClass();
        ((gmj)object).c = hwv2;
        ((gmj)object).b |= 1;
        if (!hwv3.B()) {
            ((hwp)hyg2).u();
        }
        hwv2 = ((hwp)hyg2).b;
        hwv3 = (gmj)hwv2;
        ((gmj)hwv3).b |= 4;
        ((gmj)hwv3).e = l3;
        if (this.d) {
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = ((hwp)hyg2).b;
            hwv4 = (gmj)hwv2;
            ((gmj)hwv4).b |= 2;
            ((gmj)hwv4).d = l3;
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            hwv4 = (gmj)((hwp)hyg2).b;
            ((gmj)hwv4).b |= 8;
            ((gmj)hwv4).f = 0;
        } else {
            l2 = ((gmj)hwv4).d;
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = ((hwp)hyg2).b;
            hwv3 = (gmj)hwv2;
            ((gmj)hwv3).b |= 2;
            ((gmj)hwv3).d = l2;
            int n2 = ((gmj)hwv4).f;
            if (!hwv2.B()) {
                ((hwp)hyg2).u();
            }
            hwv4 = (gmj)((hwp)hyg2).b;
            ((gmj)hwv4).b |= 8;
            ((gmj)hwv4).f = n2 + 1;
        }
        hwp2.N((gmj)((hwp)hyg2).o());
        try {
            gky2.g((gmk)hwp2.o());
            return null;
        }
        catch (IOException iOException) {
            a.as(gky.a.g(), "Error writing sync data file after sync. Sync may run too frequently.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", '\u019e', "SyncManagerDataStore.java", iOException);
            return null;
        }
    }
}

