/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.usage.StorageStats
 *  android.app.usage.StorageStatsManager
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.PackageStats
 *  android.os.Process
 *  android.os.storage.StorageManager
 *  android.os.storage.StorageVolume
 */
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

final class drd {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static PackageStats a(Context object) {
        fpk.b();
        Object object2 = (StorageManager)object.getSystemService(StorageManager.class);
        if (object2 == null) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 30, "PackageStatsCaptureO.java")).r("StorageManager is not available");
            return null;
        }
        StorageStatsManager storageStatsManager = ag$$ExternalSyntheticApiModelOutline0.m(object.getSystemService(ag$$ExternalSyntheticApiModelOutline0.m$1()));
        if (storageStatsManager == null) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 35, "PackageStatsCaptureO.java")).r("StorageStatsManager is not available");
            return null;
        }
        String string = object.getPackageName();
        PackageStats packageStats = new PackageStats(string);
        object2 = ag$$ExternalSyntheticApiModelOutline1.m((StorageManager)object2).iterator();
        while (true) {
            void var0_12;
            void var0_8;
            String string2;
            block14: {
                if (!object2.hasNext()) {
                    return packageStats;
                }
                StorageVolume storageVolume = ag$$ExternalSyntheticApiModelOutline1.m(object2.next());
                if (!ag$$ExternalSyntheticApiModelOutline1.m$1(storageVolume).equals("mounted")) continue;
                string2 = ag$$ExternalSyntheticApiModelOutline1.m(storageVolume);
                if (!"1AEF-1A1E".equals(string2)) {
                    try {
                        ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 71, "PackageStatsCaptureO.java")).u("UUID for %s", string2);
                        if (string2 == null) {
                            UUID uUID = ag$$ExternalSyntheticApiModelOutline0.m();
                            break block14;
                        } else {
                            UUID uUID = UUID.fromString(string2);
                        }
                        break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        ((heg)((heg)((heg)dkc.a.h()).i(illegalArgumentException)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 76, "PackageStatsCaptureO.java")).u("Invalid UUID format: '%s'", string2);
                    }
                }
                Object var0_4 = null;
            }
            if (var0_8 == null) continue;
            try {
                string2 = ag$$ExternalSyntheticApiModelOutline0.m(storageStatsManager, (UUID)var0_8, string, Process.myUserHandle());
                if (ag$$ExternalSyntheticApiModelOutline0.m().equals(var0_8)) {
                    packageStats.codeSize += ag$$ExternalSyntheticApiModelOutline0.m$1((StorageStats)string2);
                    packageStats.dataSize += ag$$ExternalSyntheticApiModelOutline0.m$2((StorageStats)string2) - ag$$ExternalSyntheticApiModelOutline0.m((StorageStats)string2);
                    packageStats.cacheSize += ag$$ExternalSyntheticApiModelOutline0.m((StorageStats)string2);
                    continue;
                }
                packageStats.externalCodeSize += ag$$ExternalSyntheticApiModelOutline0.m$1((StorageStats)string2);
                packageStats.externalDataSize += ag$$ExternalSyntheticApiModelOutline0.m$2((StorageStats)string2) - ag$$ExternalSyntheticApiModelOutline0.m((StorageStats)string2);
                packageStats.externalCacheSize += ag$$ExternalSyntheticApiModelOutline0.m((StorageStats)string2);
                continue;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
            a.as(dkc.a.h(), "queryStatsForPackage() call failed", "com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '3', "PackageStatsCaptureO.java", (Throwable)var0_12);
        }
    }
}

