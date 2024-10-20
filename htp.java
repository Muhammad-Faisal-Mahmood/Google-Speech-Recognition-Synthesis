/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class htp
implements htn {
    public static final itv b = new itv("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", null);
    public final hrf c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(-1);
    public final ConcurrentLinkedQueue j = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public final AtomicLong l = new AtomicLong(-1L);
    public final AtomicReference m = new AtomicReference<Object>(null);

    public htp(hrf hrf2) {
        this.c = hrf2;
    }

    public final void a() {
        fxf.B(this.e.getAndSet(true) ^ true, "Already recorded cache lookup.");
    }
}

