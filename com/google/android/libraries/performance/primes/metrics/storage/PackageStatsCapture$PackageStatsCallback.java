/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.IPackageStatsObserver$Stub
 *  android.content.pm.PackageStats
 */
package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;

final class PackageStatsCapture$PackageStatsCallback
extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean bl2) {
        if (bl2) {
            ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 50, "PackageStatsCapture.java")).u("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).r("Failure getting PackageStats");
        }
        this.a.release();
    }
}

