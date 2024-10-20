/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  android.os.Process
 */
package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getCurrentUidRxBytes() {
        long l2 = TrafficStats.getUidRxBytes((int)Process.myUid());
        if (l2 != -1L) {
            return l2;
        }
        return 0L;
    }

    private static long getCurrentUidTxBytes() {
        long l2 = TrafficStats.getUidTxBytes((int)Process.myUid());
        if (l2 != -1L) {
            return l2;
        }
        return 0L;
    }

    private static long getTotalRxBytes() {
        long l2 = TrafficStats.getTotalRxBytes();
        if (l2 != -1L) {
            return l2;
        }
        return 0L;
    }

    private static long getTotalTxBytes() {
        long l2 = TrafficStats.getTotalTxBytes();
        if (l2 != -1L) {
            return l2;
        }
        return 0L;
    }
}

