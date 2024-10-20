/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.base;

import java.util.ArrayList;
import java.util.List;

public class EarlyTraceEvent {
    static volatile int a;
    static final Object b;
    static final List c;
    static final List d;

    static {
        b = new Object();
        c = new ArrayList();
        d = new ArrayList();
    }

    public static void a() {
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    static void setBackgroundStartupTracingFlag(boolean bl2) {
        kne kne2 = kne.b();
        try {
            kmu.a.edit().putBoolean("bg_startup_tracing", bl2).apply();
            return;
        }
        finally {
            kne2.close();
        }
    }
}

