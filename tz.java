/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.util.Log
 */
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class tz {
    private static long a;
    private static Method b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            catch (Exception exception) {
                Log.i((String)"TraceCompat", (String)"Unable to initialize via reflection.", (Throwable)exception);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return dp$$ExternalSyntheticApiModelOutline0.m$1();
        }
        boolean bl2 = false;
        try {
            return (Boolean)b.invoke(null, a);
        }
        catch (Exception exception) {
            return bl2;
        }
    }
}

