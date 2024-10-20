/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;

public final class gku
implements Callable {
    public final gky a;
    public final Collection b;

    public /* synthetic */ gku(gky gky2, Collection collection) {
        this.a = gky2;
        this.b = collection;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        hwp hwp2;
        boolean bl2;
        gky gky2;
        block24: {
            long l2;
            Object object;
            hwv hwv2;
            Object object2;
            Object object3;
            Object object4;
            block23: {
                gky2 = this.a;
                gky2.b.writeLock().lock();
                object4 = gmk.a;
                bl2 = false;
                try {
                    object4 = object3 = gky2.a();
                }
                catch (IOException iOException) {
                    if (gky2.h(iOException)) break block23;
                    a.as(gky.a.g(), "Error, could not read or clear store. Aborting sync attempt.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", '\u010b', "SyncManagerDataStore.java", iOException);
                    return false;
                }
            }
            hwp2 = gmk.a.l();
            hwp2.x((hwv)object4);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            ((gmk)hwp2.b).d = hyp.b;
            long l3 = cgw.p().toEpochMilli();
            HashSet<Object> hashSet = new HashSet<Object>();
            Object object5 = ((gmk)object4).d.iterator();
            while (true) {
                boolean bl3 = object5.hasNext();
                object2 = this.b;
                if (!bl3) break;
                hwv2 = (gmj)object5.next();
                object3 = object = ((gmj)hwv2).c;
                if (object == null) {
                    object3 = gmm.a;
                }
                if (object2.contains(object = new gli((gmm)object3))) {
                    object3 = object = ((gmj)hwv2).c;
                    if (object == null) {
                        object3 = gmm.a;
                    }
                    object = new gli((gmm)object3);
                    hashSet.add(object);
                    object3 = (hwp)hwv2.C(5);
                    ((hwp)object3).x(hwv2);
                    if (!((hwp)object3).b.B()) {
                        ((hwp)object3).u();
                    }
                    object = (gmj)((hwp)object3).b;
                    ((gmj)object).b |= 4;
                    ((gmj)object).e = l3;
                    hwp2.N((gmj)((hwp)object3).o());
                    continue;
                }
                hwp2.N((gmj)hwv2);
            }
            object = object2.iterator();
            while (object.hasNext()) {
                object5 = (gli)object.next();
                if (hashSet.contains(object5)) continue;
                object3 = gmj.a.l();
                hwv2 = ((gli)object5).a;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object2 = ((hwp)object3).b;
                object5 = (gmj)object2;
                hwv2.getClass();
                ((gmj)object5).c = hwv2;
                ((gmj)object5).b |= 1;
                l2 = gky2.f;
                if (!((hwv)object2).B()) {
                    ((hwp)object3).u();
                }
                object5 = ((hwp)object3).b;
                hwv2 = (gmj)object5;
                ((gmj)hwv2).b |= 2;
                ((gmj)hwv2).d = l2;
                if (!((hwv)object5).B()) {
                    ((hwp)object3).u();
                }
                hwv2 = ((hwp)object3).b;
                object5 = (gmj)hwv2;
                ((gmj)object5).b |= 4;
                ((gmj)object5).e = l3;
                if (!hwv2.B()) {
                    ((hwp)object3).u();
                }
                object5 = (gmj)((hwp)object3).b;
                ((gmj)object5).b |= 8;
                ((gmj)object5).f = 0;
                hwp2.N((gmj)((hwp)object3).o());
            }
            if (((gmk)object4).c >= 0L) break block24;
            l2 = l3 = gky2.f;
            if (l3 < 0L) {
                gky2.f = l2 = cgw.p().toEpochMilli();
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object4 = (gmk)hwp2.b;
            ((gmk)object4).b |= 1;
            ((gmk)object4).c = l2;
        }
        gky2.g((gmk)hwp2.o());
        gky2.e.set(true);
        bl2 = true;
        return bl2;
        catch (Throwable throwable) {
            gky2.e.set(true);
            throw throwable;
        }
        catch (IOException iOException) {}
        return bl2;
        finally {
            gky2.b.writeLock().unlock();
        }
    }
}

