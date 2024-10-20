/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class kpp {
    private static final Method a;
    private static final Method b;

    /*
     * WARNING - void declaration
     */
    static {
        void var0_2;
        try {
            a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            b = TrafficStats.class.getMethod("clearThreadStatsUid", null);
            return;
        }
        catch (SecurityException securityException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        throw new RuntimeException("Unable to get TrafficStats methods", (Throwable)var0_2);
    }

    public static void a() {
        try {
            b.invoke(null, null);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", illegalAccessException);
        }
    }

    public static void b(int n2) {
        try {
            a.invoke(null, n2);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", illegalAccessException);
        }
    }
}

