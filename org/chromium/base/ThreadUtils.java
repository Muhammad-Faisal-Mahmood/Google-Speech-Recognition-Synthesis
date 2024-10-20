/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Process
 */
package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.TraceEvent;

public class ThreadUtils {
    private static final Object a = new Object();
    private static volatile boolean b;
    private static volatile Handler c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Handler a() {
        if (c != null) {
            return c;
        }
        Looper looper = Looper.getMainLooper();
        Object object = a;
        synchronized (object) {
            if (c == null) {
                Handler handler;
                c = handler = new Handler(looper);
                TraceEvent.b = true;
                if (!TraceEvent.a) return c;
                knj.a();
            } else if (c.getLooper() != looper) {
                Looper looper2 = c.getLooper();
                Looper looper3 = Looper.getMainLooper();
                StringBuilder stringBuilder = new StringBuilder("UI thread looper is already set to ");
                stringBuilder.append(looper2);
                stringBuilder.append(" (Main thread looper is ");
                stringBuilder.append(looper3);
                stringBuilder.append("), cannot set to new looper ");
                stringBuilder.append(looper);
                RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
                throw runtimeException;
            }
            return c;
        }
    }

    public static Looper b() {
        return ThreadUtils.a().getLooper();
    }

    private static boolean isThreadPriorityAudio(int n2) {
        return Process.getThreadPriority((int)n2) == -16;
    }

    public static void setThreadPriorityAudio(int n2) {
        Process.setThreadPriority((int)n2, (int)-16);
    }
}

