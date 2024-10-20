/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dpz {
    private static final dpy g = new dpv();
    public final iku a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile dpy d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public dpz(dli dli2, hpr hpr2, Executor executor, iku iku2) {
        this.a = iku2;
        this.b = executor;
        dli2.a(new dpx(this, hpr2));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        if ((scheduledFuture = this.f) != null) {
            scheduledFuture.cancel(true);
            this.f = null;
        }
    }
}

