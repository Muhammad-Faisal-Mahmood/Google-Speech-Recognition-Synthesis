/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

final class jfz
extends WeakReference {
    public static final int b = 0;
    private static final boolean c = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException d;
    public final AtomicBoolean a = new AtomicBoolean();
    private final ReferenceQueue e;
    private final ConcurrentMap f;
    private final String g;
    private final Reference h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        d = runtimeException;
    }

    public jfz(jga object, iwk iwk2, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(object, referenceQueue);
        object = c ? new RuntimeException("ManagedChannel allocation site") : d;
        this.h = new SoftReference<Object>(object);
        this.g = iwk2.toString();
        this.e = referenceQueue;
        this.f = concurrentMap;
        concurrentMap.put(this, this);
        jfz.a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        jfz jfz2;
        while ((jfz2 = (jfz)referenceQueue.poll()) != null) {
            Level level;
            RuntimeException runtimeException = (RuntimeException)jfz2.h.get();
            jfz2.b();
            if (jfz2.a.get() || !jga.b.isLoggable(level = Level.SEVERE)) continue;
            Object object = System.getProperty("line.separator");
            StringBuilder stringBuilder = new StringBuilder("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
            stringBuilder.append((String)object);
            stringBuilder.append("    Make sure to call shutdown()/shutdownNow()");
            object = new LogRecord(level, stringBuilder.toString());
            ((LogRecord)object).setLoggerName(jga.b.getName());
            ((LogRecord)object).setParameters(new Object[]{jfz2.g});
            ((LogRecord)object).setThrown(runtimeException);
            jga.b.log((LogRecord)object);
        }
    }

    private final void b() {
        super.clear();
        this.f.remove(this);
        this.h.clear();
    }

    @Override
    public final void clear() {
        this.b();
        jfz.a(this.e);
    }
}

