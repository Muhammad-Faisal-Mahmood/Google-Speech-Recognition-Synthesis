/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$VmPolicy
 */
import J.N;
import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

public final class kne
implements Closeable {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    private kne(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public kne(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        long l2 = this.hashCode();
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            N.MHopMqLX("StrictModeContext", l2);
        }
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    public static kne a() {
        TraceEvent traceEvent = TraceEvent.a("StrictModeContext.allowDiskReads");
        try {
            kne kne2 = new kne(StrictMode.allowThreadDiskReads());
            return kne2;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    public static kne b() {
        TraceEvent traceEvent = TraceEvent.a("StrictModeContext.allowDiskWrites");
        try {
            kne kne2 = new kne(StrictMode.allowThreadDiskWrites());
            return kne2;
        }
        finally {
            if (traceEvent != null) {
                traceEvent.close();
            }
        }
    }

    @Override
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
        if ((threadPolicy = this.b) != null) {
            StrictMode.setVmPolicy((StrictMode.VmPolicy)threadPolicy);
        }
        long l2 = this.hashCode();
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            N.MffNhCLU(l2);
        }
    }
}

