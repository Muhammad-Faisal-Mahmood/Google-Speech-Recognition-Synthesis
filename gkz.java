/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class gkz
implements Callable {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ gkz(gpm gpm2, hrn hrn2, int n2) {
        this.c = n2;
        this.b = gpm2;
        this.a = hrn2;
    }

    public /* synthetic */ gkz(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        block17: {
            block18: {
                block19: {
                    Object object;
                    block23: {
                        Object object2;
                        block20: {
                            block21: {
                                block22: {
                                    int n2 = this.c;
                                    if (n2 == 0) break block17;
                                    if (n2 == 1) break block18;
                                    if (n2 == 2) break block19;
                                    object2 = (hru)this.a;
                                    n2 = ((hru)object2).i.ordinal();
                                    object = this.b;
                                    if (n2 == 0) break block20;
                                    if (n2 == 1) break block21;
                                    if (n2 == 2) break block22;
                                    if (n2 == 3) break block21;
                                    if (n2 != 4) {
                                        throw new IllegalStateException("Unrecognized directive");
                                    }
                                    break block20;
                                }
                                object = gsl.a;
                                break block23;
                            }
                            ((hru)object2).h.a();
                            object2 = ((hru)object2).e;
                            object = (hyf)((bzq)object).a;
                            object = object2.a();
                            break block23;
                        }
                        ((hru)object2).h.a();
                        object2 = ((hru)object2).e;
                        object = (hyf)((bzq)object).a;
                        object = object2.b();
                    }
                    return object;
                }
                Object object = this.b;
                Object object3 = hrm.a;
                boolean bl2 = (Boolean)((itw)((gpm)object).a).g((itv)object3);
                object3 = this.a;
                object3 = bl2 ? object3.a() : object3.b();
                return object3;
            }
            Object object = this.a;
            gky gky2 = (gky)object;
            gky2.b.writeLock().lock();
            Object object4 = this.b;
            try {
                block16: {
                    Object object5;
                    hwv hwv2;
                    block15: {
                        hwv2 = gmk.a;
                        try {
                            object5 = ((gky)object).a();
                            hwv2 = object5;
                        }
                        catch (IOException iOException) {
                            if (((gky)object).h(iOException)) break block15;
                            a.as(gky.a.g(), "Unable to read or clear store. Cannot remove account.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", '\u01dc', "SyncManagerDataStore.java", iOException);
                            break block16;
                        }
                    }
                    hwp hwp2 = gmk.a.l();
                    hwp2.x(hwv2);
                    if (!hwp2.b.B()) {
                        hwp2.u();
                    }
                    ((gmk)hwp2.b).d = hyp.b;
                    for (gmj gmj2 : hwv2.d) {
                        object5 = gmj2.c;
                        hwv2 = object5;
                        if (object5 == null) {
                            hwv2 = gmm.a;
                        }
                        if (object4.contains(object5 = new gli((gmm)hwv2))) continue;
                        hwp2.N(gmj2);
                    }
                    try {
                        hwv2 = (gmk)hwp2.o();
                        ((gky)object).g((gmk)hwv2);
                    }
                    catch (IOException iOException) {
                        a.as(gky.a.g(), "Error writing sync data file. Cannot remove account.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", '\u01f0', "SyncManagerDataStore.java", iOException);
                    }
                }
                return null;
            }
            finally {
                gky2.b.writeLock().unlock();
            }
        }
        Iterator iterator = this.b;
        Object object = this.a;
        Object object6 = ((gld)object).k;
        synchronized (object6) {
            for (Object object7 : iterator.keySet()) {
                object7 = (hqa)((gld)object).m.remove(object7);
            }
            return null;
            catch (Throwable throwable) {}
            {
                throw throwable;
            }
        }
    }
}

