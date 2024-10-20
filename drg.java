/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageStats
 *  android.os.SystemClock
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import android.os.SystemClock;

public final class drg
implements hnx {
    public final drh a;

    public /* synthetic */ drg(drh drh2) {
        this.a = drh2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a() {
        long l2;
        Object object = this.a;
        Object object2 = (drf)((drh)object).d.b();
        if (!crt.e(((drh)object).c)) {
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 109, "StorageMetricServiceImpl.java")).r("Device locked.");
            return hpj.a;
        }
        fpk.b();
        object2 = ((drh)object).e;
        long l3 = drh.a;
        fpk.b();
        if (crt.e((Context)((dsh)object2).a)) {
            l2 = crt.e((Context)((dsh)object2).a) ? ((SharedPreferences)((dsh)object2).b.b()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
            long l4 = SystemClock.elapsedRealtime();
            long l5 = l2;
            if (l4 < l2) {
                if (!((SharedPreferences)((dsh)object2).b.b()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                    ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).r("Failure storing timestamp to SharedPreferences");
                }
                l5 = -1L;
            }
            if (l5 != -1L && l4 <= l5 + l3) {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 113, "StorageMetricServiceImpl.java")).r("Ignoring storage metric request, storage metric collection occurred too recently.");
                return hpj.a;
            }
        }
        if (!((drh)object).b.c(null)) {
            return hpj.a;
        }
        object2 = ((drh)object).c;
        fpk.b();
        Object object3 = drd.a((Context)object2);
        if (object3 == null) {
            return hhk.J(new IllegalStateException("PackageStats capture failed."));
        }
        object2 = kfl.a.l();
        Object object4 = kfh.a.l();
        l2 = ((PackageStats)object3).cacheSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 1;
        kfh2.c = l2;
        l2 = ((PackageStats)object3).codeSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 2;
        kfh2.d = l2;
        l2 = ((PackageStats)object3).dataSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 4;
        kfh2.e = l2;
        l2 = ((PackageStats)object3).externalCacheSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 8;
        kfh2.f = l2;
        l2 = ((PackageStats)object3).externalCodeSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 0x10;
        kfh2.g = l2;
        l2 = ((PackageStats)object3).externalDataSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 0x20;
        kfh2.h = l2;
        l2 = ((PackageStats)object3).externalMediaSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        kfh2 = (kfh)((hwp)object4).b;
        kfh2.b |= 0x40;
        kfh2.i = l2;
        l2 = ((PackageStats)object3).externalObbSize;
        if (!((hwp)object4).b.B()) {
            ((hwp)object4).u();
        }
        object3 = (kfh)((hwp)object4).b;
        ((kfh)object3).b |= 0x80;
        ((kfh)object3).j = l2;
        object3 = (kfh)((hwp)object4).o();
        object4 = (hwp)((hwv)object3).C(5);
        ((hwp)object4).x((hwv)object3);
        object3 = ((drf)((drh)object).d.b()).a;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = (kfl)((hwp)object2).b;
        object4 = (kfh)((hwp)object4).o();
        object4.getClass();
        ((kfl)object3).j = object4;
        ((kfl)object3).b |= 0x80;
        object4 = ((drh)object).e;
        if (!crt.e((Context)((dsh)object4).a) || !((SharedPreferences)((dsh)object4).b.b()).edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 146, "StorageMetricServiceImpl.java")).r("Failure storing timestamp persistently");
        }
        object = ((drh)object).b;
        object4 = dmq.a();
        ((fhc)object4).i((kfl)((hwp)object2).o());
        return ((dmt)object).b(((fhc)object4).e());
    }
}

