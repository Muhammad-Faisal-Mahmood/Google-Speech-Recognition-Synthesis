/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Printer
 */
package org.chromium.base;

import J.N;
import android.util.Printer;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.ThreadUtils;

public class TraceEvent
implements AutoCloseable {
    public static volatile boolean a;
    public static volatile boolean b;
    public static boolean c;
    private final String d;

    private TraceEvent(String string) {
        this.d = string;
        TraceEvent.b(string, null);
    }

    public static TraceEvent a(String string) {
        EarlyTraceEvent.a();
        if (!a) {
            return null;
        }
        return new TraceEvent(string);
    }

    public static void b(String string, String string2) {
        EarlyTraceEvent.a();
        if (a) {
            N.M9XfPu17(string, string2);
        }
    }

    public static void c(long l2) {
        EarlyTraceEvent.a();
        if (a) {
            N.Mw73xTww(null, l2);
        }
    }

    public static void d() {
        TraceEvent.c(0L);
    }

    public static void dumpViewHierarchy(long l2, Object object) {
        ApplicationStatus.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setEnabled(boolean bl2) {
        Object object;
        if (bl2) {
            object = EarlyTraceEvent.b;
            synchronized (object) {
                EarlyTraceEvent.a();
            }
        }
        if (a != bl2) {
            a = bl2;
            Object object2 = ThreadUtils.b();
            object = bl2 ? kni.a : null;
            object2.setMessageLogging((Printer)object);
        }
        if (a) {
            object = EarlyTraceEvent.b;
            synchronized (object) {
                long l2;
                if (!EarlyTraceEvent.c.isEmpty()) {
                    for (Object object3 : EarlyTraceEvent.c) {
                        l2 = ((kmw)object3).a;
                        l2 = ((kmw)object3).b;
                        N.MvcVeOsg(0L, 0L);
                    }
                    EarlyTraceEvent.c.clear();
                }
                if (!EarlyTraceEvent.d.isEmpty()) {
                    for (Object object2 : EarlyTraceEvent.d) {
                        l2 = ((kmv)object2).a;
                        l2 = ((kmv)object2).b;
                        int n2 = ((kmv)object2).c;
                        N.MbWHcONC(0L, 0L, 0);
                    }
                    EarlyTraceEvent.d.clear();
                }
            }
        }
        if (b) {
            knj.a();
        }
    }

    public static void setEventNameFilteringEnabled(boolean bl2) {
        c = bl2;
    }

    @Override
    public final void close() {
        TraceEvent.d();
    }
}

