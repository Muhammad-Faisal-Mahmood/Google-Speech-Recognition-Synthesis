/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class cpc {
    private static final boolean a;

    static {
        boolean bl2;
        int n2 = Build.VERSION.SDK_INT;
        boolean bl3 = bl2 = false;
        if (n2 >= 29) {
            String[] stringArray = Build.SUPPORTED_32_BIT_ABIS;
            int n3 = stringArray.length;
            n2 = 0;
            while (true) {
                bl3 = bl2;
                if (n2 >= n3) break;
                String string = stringArray[n2];
                if (Build.CPU_ABI.equals(string)) {
                    bl3 = true;
                    break;
                }
                ++n2;
            }
        }
        a = bl3;
    }

    public static Object a(Future future, long l2, TimeUnit timeUnit) {
        if (!a || future instanceof hnk || future instanceof cpb || TimeUnit.NANOSECONDS.convert(l2, timeUnit) <= 2147483647999999999L || future.isDone()) {
            future.get(l2, timeUnit);
        }
        long l3 = timeUnit.toNanos(l2);
        long l4 = System.nanoTime();
        l2 = l3;
        while (true) {
            try {
                timeUnit = future.get(Math.min(l2, 2147483647999999999L), TimeUnit.NANOSECONDS);
                return timeUnit;
            }
            catch (TimeoutException timeoutException) {
                l2 = l4 + l3 - System.nanoTime();
                continue;
            }
            break;
        }
    }

    public static RunnableScheduledFuture b(RunnableScheduledFuture runnableScheduledFuture) {
        if (a) {
            return new cpb(runnableScheduledFuture);
        }
        return runnableScheduledFuture;
    }
}

