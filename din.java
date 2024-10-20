/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 */
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class din
implements dej {
    public static final long a = TimeUnit.DAYS.toMillis(1L);
    private final diu b;
    private final boolean c;
    private final long d;
    private final bzq e;

    public din(dim dim2) {
        this.b = dim2.b;
        this.e = dim2.e;
        this.c = dim2.c;
        this.d = dim2.d;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(ddn var1_1) {
        synchronized (this) {
            block17: {
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadFetcher", "cancel", 222, "ScheduledDownloadFetcher.java")).u("Canceling fetch for pack %s", var1_1);
                try {
                    var9_5 = this.b;
                    var8_6 = this.e;
                    var7_7 = var1_1.toString();
                    var4_8 = System.currentTimeMillis();
                    var2_9 = true;
                    var3_10 = var4_8 > 0L;
                    fxf.q(var3_10);
                    var6_11 = dip.a;
                    synchronized (var6_11) {
                    }
                }
                catch (dit var1_2) {
                    return hhk.J((Throwable)var1_4);
                }
                catch (IOException var1_3) {
                    // empty catch block
                    return hhk.J((Throwable)var1_4);
                }
                {
                    block14: {
                        block15: {
                            block16: {
                                block13: {
                                    var1_1 = (hpn)dip.c.get(var7_7);
                                    if (var1_1 == null) break block13;
                                    ** GOTO lbl53
                                }
                                var1_1 = var8_6.d(var7_7);
                                if (var1_1 == null) break block14;
                                if (var1_1.c) break block15;
                                if (!dip.e.n(var7_7)) break block16;
                                ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 224, "ScheduledDownloadManager.java")).u("Canceling active download: %s", var1_1.d().e());
                                var8_6 = dip.e;
                                var1_1 = (dhv)var8_6.c.get(var7_7);
                                if (var1_1 != null) {
                                    var1_1.b(3, (cxv)var8_6.b);
                                }
                                var1_1 = new hqa();
                                dip.c.put(var7_7, var1_1);
                                ** GOTO lbl53
                            }
                            ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 241, "ScheduledDownloadManager.java")).u("Canceling inactive download: %s", var1_1.d().e());
                            var1_1 = (hqa)dip.b.remove(var7_7);
                            if (var1_1 != null) {
                                var1_1.cancel(false);
                            }
                            var8_6.e(var7_7);
                            break block17;
                        }
                        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 258, "ScheduledDownloadManager.java")).u("Canceling completed download: %s", var1_1.d().e());
                        var8_6.e(var7_7);
                    }
                    var2_9 = false;
                }
            }
            if (var2_9 == false) return hhk.K(null);
            {
                dip.b(var9_5, (bzq)var8_6, null, var4_8, "download cancelled");
                return hhk.K(null);
lbl53:
                // 2 sources

                return var1_1;
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final hpn b(den object, deh iterator, File object2) {
        Object object322;
        Object object4;
        Object object5;
        block28: {
            Object object6;
            block27: {
                long l2;
                int n2;
                int n3;
                block31: {
                    long l3;
                    block29: {
                        long l4;
                        block30: {
                            object6 = iterator;
                            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadFetcher", "fetch", 155, "ScheduledDownloadFetcher.java")).C("Fetching %s with params: %s", ((den)object).o(), object6);
                            if (((den)object).g().isEmpty()) throw new IllegalArgumentException("The pack manifest has no download URLs.");
                            iterator = object6;
                            if (object6 == null) {
                                iterator = deh.f;
                            }
                            object5 = ((den)object).o().toString();
                            object6 = dff.n();
                            ((dfe)object6).c((String)object5);
                            ((dfe)object6).a = ((den)object).e();
                            n3 = ((den)object).a();
                            object5 = (dee)((Object)iterator);
                            ((dfe)object6).d(((dee)object5).a.c(n3));
                            ((dfe)object6).l(((den)object).g());
                            ((dfe)object6).j(System.currentTimeMillis());
                            ((dfe)object6).h(((deh)((Object)iterator)).g(this.c));
                            boolean bl2 = ((dee)object5).b == 1;
                            ((dfe)object6).f(bl2);
                            bl2 = ((dee)object5).c == 1;
                            ((dfe)object6).g(bl2);
                            bl2 = ((dee)object5).d == 1;
                            ((dfe)object6).e(bl2);
                            ((dfe)object6).k(this.d);
                            ((dfe)object6).b(((File)object2).getAbsolutePath());
                            n3 = n2 = ((dee)object5).e;
                            if (n2 == 0) {
                                n3 = 2;
                            }
                            ((dfe)object6).i(n3);
                            object2 = new dfd(((dfe)object6).a(), false, null, 0L, 0L);
                            object4 = this.b;
                            object5 = this.e;
                            l2 = System.currentTimeMillis();
                            bl2 = l2 > 0L;
                            fxf.q(bl2);
                            object322 = ((dfd)object2).i();
                            object6 = dip.a;
                            // MONITORENTER : object6
                            object = ((bzq)object5).d((String)object322);
                            if (object == null) break block29;
                            bl2 = ((dfd)object).c;
                            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "register", 108, "ScheduledDownloadManager.java")).D("Registering existing download %s, completed: %b", object322, bl2);
                            if (!bl2) break block30;
                            ((bzq)object5).e((String)object322);
                            iterator = ((dfd)object).d;
                            if (iterator != null && !((String)((Object)iterator)).isEmpty()) {
                                ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "register", 120, "ScheduledDownloadManager.java")).u("Pending completed download had failed, returning error %s", iterator);
                                object = new dic((String)((Object)iterator));
                                object = hhk.J((Throwable)object);
                                // MONITOREXIT : object6
                                break block27;
                            } else {
                                ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "register", 125, "ScheduledDownloadManager.java")).r("Pending completed download had succeeded, completing future");
                                object = !((dfd)object).g().isEmpty() ? (String)((dfd)object).g().get(0) : null;
                                iterator = new Iterator((String)object);
                                object = hhk.K(iterator);
                                // MONITOREXIT : object6
                            }
                            break block27;
                        }
                        if ((((dfd)object2).b() & 1) == 0 && (l3 = ((dfd)object2).e) < (l4 = ((dfd)object).e)) {
                            ((dfd)object2).j(l4);
                            ((dfd)object2).f = ((dfd)object).f;
                        }
                        ((bzq)object5).f((dfd)object2);
                        break block31;
                    }
                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "register", 141, "ScheduledDownloadManager.java")).u("Registering new download: %s", object322);
                    l3 = ((bzq)object5).a.getWritableDatabase().insertOrThrow("pending_downloads", null, ((dfd)object2).c());
                    if (l3 < 0L) break block28;
                }
                iterator = (hqa)dip.b.get(object322);
                object = iterator;
                if (iterator == null) {
                    object = new hqa();
                    dip.b.put(object322, object);
                }
                bmu bmu2 = dip.e;
                dhv dhv2 = (dhv)bmu2.c.get(((dfd)object2).i());
                if (dhv2 != null) {
                    n2 = ((dfd)object2).a();
                    n3 = dhv2.a.a();
                    if (dhv2.b.equals(dis.a((dfd)object2)) && n2 >= n3) {
                        if (n2 > n3 && !dhv2.a()) {
                            dhv2.a = object2;
                            dhv2.b = dis.a((dfd)object2);
                            for (Object object322 : bmu2.c.values()) {
                                if (object322 == dhv2) continue;
                                ((dhv)object322).b(6, (cxv)bmu2.b);
                            }
                        }
                    } else {
                        dhv2.b(5, (cxv)bmu2.b);
                    }
                }
                // MONITOREXIT : object6
                dip.b((diu)object4, (bzq)object5, null, l2, "download registered");
                object = hhk.L((hpn)object);
            }
            // MONITOREXIT : this
            object6 = dip.d;
            iterator = new Iterator(object2, 8);
            ((cxv)object6).a((dau)((Object)iterator));
            return object;
        }
        try {
            object4 = ((bzq)object5).a;
            object322 = ((dfd)object2).i();
            object = new StringBuilder("SqlitePendingDownloadQueue#insert, SQL insert failed, download: ");
            ((StringBuilder)object).append((String)object322);
            iterator = new Iterator(((StringBuilder)object).toString());
            object4.a((IOException)((Object)iterator));
            throw iterator;
        }
        catch (SQLiteException sQLiteException) {
            object5 = ((bzq)object5).a;
            iterator = new Iterator("SqlitePendingDownloadQueue#insert, SQL insert failed, download: ".concat(((dfd)object2).i()), sQLiteException);
            object5.a((IOException)((Object)iterator));
            throw iterator;
        }
        catch (IOException iOException) {
            return hhk.J(iOException);
        }
        catch (dit dit2) {
            dip.d.a(new dcd(5));
            return hhk.J(dit2);
        }
    }

    @Override
    public final String c() {
        return "ScheduledDownloadFetcher";
    }

    @Override
    public final elq d(den den2) {
        if (den2.g().isEmpty()) {
            ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadFetcher", "query", 239, "ScheduledDownloadFetcher.java")).u("Pack %s has no download URLs", den2);
            return null;
        }
        return elq.b(den2);
    }
}

