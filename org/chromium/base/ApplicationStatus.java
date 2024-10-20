/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.task.PostTask;

public class ApplicationStatus {
    public static kmr a;
    public static knb b;
    private static final Map c;

    static {
        c = DesugarCollections.synchronizedMap(new HashMap());
        DesugarCollections.synchronizedMap(new HashMap());
    }

    private ApplicationStatus() {
    }

    public static void a(kmr kmr2) {
        if (b == null) {
            b = new knb();
        }
        b.c(kmr2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void b() {
        Map map = c;
        // MONITORENTER : map
        // MONITOREXIT : map
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static int getStateForApplication() {
        Map map = c;
        // MONITORENTER : map
        // MONITOREXIT : map
        return 0;
    }

    public static boolean hasVisibleActivities() {
        ApplicationStatus.getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        PostTask.b(new gni(9));
    }
}

